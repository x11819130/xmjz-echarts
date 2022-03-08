import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.WordUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Slf4j
public class TemplateFormat {

    //项目地址
    private static final String PROJECT_DIR = "C:\\Users\\cgz\\git\\xmjz\\xmjz-echarts\\";
    //echarts-option文件地址
    private static final String ECHARTS_OPTION_FILE = PROJECT_DIR + "doc\\echarts-option.v5.3.1.json";
    //生成的类库包名
    private static final String BASE_PACKAGE = "com.xmjz.echarts.nativebean";
    //基础基类全名
    private static final String FULL_BASE_CLASS = "com.xmjz.echarts.BaseEcharts";
    //基础基类全名
    private static final String BASE_CLASS = "BaseEcharts";
    //基础基类全名
    private static final String BASE_LINK = "https://echarts.apache.org/zh/option.html";
    //平滑模式 生成不带set和get,只有属性名的getter和setter方法
    private static final Boolean FLUENT_MODE = false;
    //作者
    private static final String AUTHOR = "auto";

    //相对路径的正则
    private static final Pattern RELATIVE_LINK = Pattern.compile("(<a.*?\")#(.*?</a>)");
    //生成的类库文件存放位置
    private static final String CLASS_DIR = PROJECT_DIR + "src\\main\\java\\" + BASE_PACKAGE.replace(".", "\\");
    private static final HashMap<String, JSONObject> signMap = new HashMap<>();
    private static MessageDigest digest = null;

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        digest = MessageDigest.getInstance("md5");
        String jsonString = FileUtils.readFileToString(new File(ECHARTS_OPTION_FILE), "utf-8");
        Properties properties = new Properties();
        properties.setProperty("resource.loader", "class");
        properties.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        properties.setProperty(Velocity.ENCODING_DEFAULT, "UTF-8");
        properties.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
        properties.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");
        VelocityEngine velocityEngine = new VelocityEngine(properties);
        //数据
        JSONObject option = JSON.parseObject(jsonString);
        // 数据清洗
        cleanData(option);
        option.put("relativePackage", "");
        //签名
        //doSign(option);
        //解析
        parseObject(velocityEngine, option);

    }

    /**
     * 类签名 用于之后过滤重复的类 指类名和属性列表(名,默认值,类型)完全一致的
     *
     * @param obj 对象
     * @return md5
     */
    private static String doSign(JSONObject obj) {
        JSONArray props = obj.getJSONArray("props");
        List<String> md5List = new ArrayList<>();
        if (props.size() > 0) {
            for (int i = 0; i < props.size(); i++) {
                JSONObject prop = props.getJSONObject(i);
                md5List.add(doSign(prop));
            }
            md5List.stream().sorted().forEach(x -> digest.update(x.getBytes()));
        }
        String value = obj.getString("name");
        if (value != null) {
            digest.update(value.getBytes());
        }
        value = obj.getString("defaultValue");
        if (value != null) {
            digest.update(value.getBytes());
        }
        value = obj.getString("types");
        if (value != null) {
            digest.update(value.getBytes());
        }
        String md5 = byteArrayToHex(digest.digest());
        obj.put("sign", md5);
        // if (signMap.containsKey(md5) && props.size() > 0) {
        //     log.info("发现重复:{}", obj.getString("url"));
        // } else {
        //     signMap.put(md5, obj);
        // }
        return md5;
    }

    /**
     * 数据清洗
     *
     * @param option 数据
     */
    private static void cleanData(JSONObject option) {
        TreeMap<String, JSONObject> map = new TreeMap<>();
        List<JSONObject> waitToRemove = new ArrayList<>();
        {
            //先打扁
            JSONArray props = option.getJSONArray("props");
            if (!props.isEmpty()) {
                for (int i = 0; i < props.size(); i++) {
                    objToMap(props.getJSONObject(i), map);
                }
            }
            JSONArray subs = option.getJSONArray("subs");
            if (subs != null && !subs.isEmpty()) {
                for (int i = 0; i < subs.size(); i++) {
                    objToMap(subs.getJSONObject(i), map);
                }
            }
        }
        Consumer<JSONObject> remove = (obj) -> {
            String key = obj.getString("$key");
            //将后代全部移除
            List<String> keys = map.keySet().stream().filter(x -> x.startsWith(key + ".")).collect(Collectors.toList());
            for (String key2 : keys) {
                map.remove(key2);
            }
            String parentKey = key.substring(0, key.lastIndexOf("."));
            if (map.containsKey(parentKey)) {
                //从父节点中移除自己
                JSONObject parent = map.get(parentKey);
                boolean isRemove = parent.getJSONArray("props").remove(obj);
                log.info("将[{}]从父节点中移除:{}", key, isRemove);
            } else {
                log.info("[{}]找不到父节点[{}]", key, parentKey);
            }
            //将自己移除
            map.remove(key);
        };
        {
            ////////////////1.精准定位错误/////////////////
            //1.1.toolbox.feature.restore.title的类型错误
            JSONObject obj = map.get("toolbox.feature.restore.title");
            if (obj.getString("types").equals("[\"boolean\"]")) {
                obj.put("types", "[\"string\"]");
                log.info("1.1.修复toolbox.feature.restore.title的类型错误");
            }
            //1.2.移除series-custom.renderItem,这是一个Function类
            obj = map.get("series-custom.renderItem");
            if (obj.getString("types").equals("[\"Function\"]")) {
                map.remove("series-custom.renderItem");

                //map.keySet().stream().filter(x -> x.startsWith("series-custom.renderItem.")).forEach(map::remove);
                //从父节点中移除自己
                remove.accept(obj);
                log.info("1.2.移除series-custom.renderItem,这是一个Function类");
            }
        }
        ////////////////2.遍历排查错误/////////////////
        map.forEach((key, obj) -> {
            //2.1处理第一个子属性名为0的 如:https://echarts.apache.org/zh/option.html#series-line.markArea.data.0
            //这时候prop其实是一个数组,他的第一个子属性的属性列表才是他的属性列表
            JSONArray props = obj.getJSONArray("props");
            String propName = obj.getString("name");
            if (props != null && props.size() > 0) {
                JSONObject firstProp = props.getJSONObject(0);
                if ("0".equals(firstProp.getString("name"))) {
                    obj.put("props", firstProp.get("props"));
                    log.info("2.1.修复第一个子属性名为0的错误");
                }
            }
            //2.2.异常属性名处理
            if (propName.endsWith("(Object | 'none')")) {
                //属性名为decal(Object | 'none')的异常 共计出现13次
                //https://echarts.apache.org/zh/option.html#series-line.itemStyle.decal(Object%20%7C%20'none')
                log.info("2.2.1.修复属性名为decal(Object | 'none')的异常:移除" + key);
                waitToRemove.add(obj);
            }
            if (propName.equals("return")) {
                //属性名为return的异常 因为是java关键字 共计出现一次
                //https://echarts.apache.org/zh/option.html#series-custom.renderItem.return
                log.info("2.2.2.修复属性名为return的异常:移除" + key);
                waitToRemove.add(obj);
            }
            if (propName.startsWith("return_")) {
                //属性名包含return_的异常
                //https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_circle
                log.info("2.2.3.修复属性名包含return_的异常:移除" + key);
                waitToRemove.add(obj);
            }
            //属性名包含-的异常 共计出现15次 12个是option.graphic.elements的属性 3个是option.dataset.transform的属性
            //其实这些不是属性,而是子类
            //https://echarts.apache.org/zh/option.html#graphic.elements-group
            //https://echarts.apache.org/zh/option.html#dataset.transform-filter
            if (propName.indexOf('-') > -1) {
                log.info("2.2.4.修复属性名包含-的异常:移除" + key);
                waitToRemove.add(obj);
            }
            if (propName.indexOf(':') > -1) {
                //属性名包含:的异常 共计出现1次 option.dataset.transform-xxx:xxx
                //https://echarts.apache.org/zh/option.html#dataset.transform-xxx%3Axxx
                log.info("2.2.5.修复属性名包含:的异常:移除" + key);
                waitToRemove.add(obj);
            }
            if (propName.length() > 2 && Character.isUpperCase(propName.charAt(1))) {
                //属性名首字母小写,第二个字母大写的 Jackson转json时会异常 导致如:xAxis=>xaxis
                //这种生成首字母小写的getter方法解决 如:getxAxis()
                obj.put("lowerGetter", true);
                log.info("2.2.6.修复属性名首字母小写,第二个字母大写的" + key);
            }
            //2.3.描述中的相对链接替换为绝对链接
            String desc = obj.getString("description");
            if (desc != null) {
                Matcher matcher = RELATIVE_LINK.matcher(desc);
                if (matcher.find()) {
                    desc = matcher.replaceAll("$1" + BASE_LINK + "#$2");
                    obj.put("description", desc);
                }
            }
        });
        //遍历后操作
        //移除待移除的
        waitToRemove.forEach(remove);
    }

    public static String stringToMD5(String plainText) {
        return byteArrayToHex(digest.digest(plainText.getBytes()));
    }

    public static String byteArrayToHex(byte[] byteArray) {
        // 首先初始化一个字符数组，用来存放每个16进制字符
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        // new一个字符数组，这个就是用来组成结果字符串的（解释一下：一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方））
        char[] resultCharArray = new char[byteArray.length * 2];
        // 遍历字节数组，通过位运算（位运算效率高），转换成字符放到字符数组中去
        int index = 0;
        for (byte b : byteArray) {
            resultCharArray[index++] = hexDigits[b >>> 4 & 0xf];
            resultCharArray[index++] = hexDigits[b & 0xf];
        }
        // 字符数组组合成字符串返回
        return new String(resultCharArray);
    }

    private static void objToMap(JSONObject obj, TreeMap<String, JSONObject> map) {
        String url = obj.getString("url");
        String key = url.substring(url.indexOf("#") + 1);
        map.put(key, obj);
        obj.put("$key", key);
        JSONArray props = obj.getJSONArray("props");
        if (!props.isEmpty()) {
            for (int i = 0; i < props.size(); i++) {
                objToMap(props.getJSONObject(i), map);
            }
        }
        JSONArray subs = obj.getJSONArray("subs");
        if (subs != null && !subs.isEmpty()) {
            for (int i = 0; i < subs.size(); i++) {
                objToMap(subs.getJSONObject(i), map);
            }
        }
    }

    /**
     * 递归解析prop对象 为prop创建类
     *
     * @param velocityEngine velocity模板引擎
     * @param propObj        prop对象
     * @throws IOException 文件操作异常
     */
    private static void parseObject(VelocityEngine velocityEngine, JSONObject propObj) throws IOException {
        String basePackage = BASE_PACKAGE;
        VelocityContext context = new VelocityContext();
        //导入列表 全类名
        Set<String> imports = new TreeSet<>();
        //类名转换
        String name = propObj.getString("name");
        //相对包名
        String relativePackage = propObj.getString("relativePackage");
        String className = WordUtils.capitalize(name);

        //1.为子类创建类
        JSONArray objSubs = propObj.getJSONArray("subs");
        if (objSubs != null && objSubs.size() > 0) {
            for (int i = 0; i < objSubs.size(); i++) {
                JSONObject objSub = objSubs.getJSONObject(i);
                objSub.put("relativePackage", relativePackage + "." + name);
                //为子类创建类
                objSub.put("superClassName", className);
                objSub.put("fullSuperClassName", basePackage + relativePackage + "." + className);
                parseObject(velocityEngine, objSub);
            }
        }
        //2.为属性创建类
        JSONArray props = propObj.getJSONArray("props");
        //属性的数据类型解析
        //判断属性是值类型还是引用类型,如果是引用,先为属性创建类
        for (int i = 0; i < props.size(); i++) {
            JSONObject prop = props.getJSONObject(i);
            String javaType = "Object";
            JSONArray subProps = prop.getJSONArray("props");
            JSONArray types = prop.getJSONArray("types");
            JSONArray subs = prop.getJSONArray("subs");
            //属性有子类的或者有子属性的都要创建类
            if ((subProps != null && subProps.size() > 0) || (subs != null && subs.size() > 0)) {
                //检查结构相同属性(属性名和子属性列表(名,默认值,类型)完全相同),有则不重复创建类
                String sign = prop.getString("sign");
                if (sign != null && signMap.containsKey(sign)) {
                    JSONObject sameObj = signMap.get(sign);
                    javaType = sameObj.getString("forSameJavaType");
                    String forSameImports = sameObj.getString("forSameImports");
                    if (forSameImports.indexOf(',') != -1) {
                        String[] SameImports = forSameImports.split(",");
                        Collections.addAll(imports, SameImports);
                        forSameImports = SameImports[0];
                    } else {
                        imports.add(forSameImports);
                    }
                    //添加描述
                    String description = prop.getString("description");
                    description += "\n@see " + forSameImports;
                    prop.put("description", description);
                } else {
                    prop.put("relativePackage", relativePackage + "." + name);
                    //为属性创建类
                    parseObject(velocityEngine, prop);
                    //递归返回后会往prop里填充生成的className,这是这个属性的className
                    javaType = prop.getString("className");
                    imports.add(basePackage + relativePackage + "." + name + "." + javaType);
                    String forSameImports = basePackage + relativePackage + "." + name + "." + javaType;
                    //如果只有一个类型且是数组 java类型就为List
                    if (types.size() == 1 && types.getString(0).equals("Array")) {
                        javaType = "List<" + javaType + ">";
                        imports.add("java.util.List");
                        forSameImports += ",java.util.List";
                    }
                    prop.put("forSameJavaType", javaType);
                    prop.put("forSameImports", forSameImports);
                    signMap.put(sign, prop);
                }

            } else {
                //有多个类型的默认还是Object,其它的就是基本类型或集合
                if (types.size() == 1) {
                    String jsType = types.getString(0);
                    switch (jsType) {
                        case "number":
                            javaType = "Integer";
                            break;
                        case "string":
                        case "Color":
                            javaType = "String";
                            break;
                        case "boolean":
                            javaType = "Boolean";
                            break;
                        case "Array":
                            javaType = "List<?>";
                            imports.add("java.util.List");
                            break;
                        case "Function":
                        case "any":
                        case "prefix":
                        default:
                            break;
                    }
                }
            }
            prop.put("javaType", javaType);
        }

        //如果有父类,导入父类; 没有使用默认
        if (propObj.containsKey("fullSuperClassName")) {
            imports.add(propObj.getString("fullSuperClassName"));
        } else {
            propObj.put("superClassName", BASE_CLASS);
            imports.add(FULL_BASE_CLASS);
        }

        context.put("base", new HashMap<String, Object>() {{
            put("package", basePackage + relativePackage);
            put("imports", imports);
            //平滑模式 生成不带set和get,只有属性名的getter和setter方法
            put("fluentMode", FLUENT_MODE);
            put("baseUrl", BASE_LINK);
            put("author", AUTHOR);
            put("date", DateFormatUtils.format(new Date(), "yyyy-MM-dd"));
        }});

        propObj.put("className", className);
        context.put("obj", propObj);
        //生成的类库文件存放位置
        File file = new File(CLASS_DIR + relativePackage.replace(".", "\\"), className + ".java");
        if (!file.getParentFile().exists()) {
            boolean mkdirs = file.getParentFile().mkdirs();
            if (!mkdirs) {
                System.err.println("目录创建失败:" + file.getParentFile().getAbsolutePath());
            }
        }
        FileWriter fw = new FileWriter(file);
        velocityEngine.mergeTemplate("templates/echartsBeanTemplate.vm", "utf-8", context, fw);
        fw.flush();
        fw.close();
        System.out.println("输出:" + className);
    }
}