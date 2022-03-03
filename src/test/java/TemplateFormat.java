import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.WordUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TemplateFormat {
    //项目地址
    private static final String PROJECT_DIR = "C:\\Users\\cgz\\git\\xmjz\\xmjz-echarts\\";
    //echarts-option文件地址
    private static final String ECHARTS_OPTION_FILE = PROJECT_DIR + "doc\\echarts-option.v5.3.0.json";
    //生成的类库包名
    private static final String BASE_PACKAGE = "com.xmjz.echarts.nativebean";
    //生成的类库文件存放位置
    private static final String CLASS_DIR = PROJECT_DIR + "src\\main\\java\\" + BASE_PACKAGE.replace(".", "\\");

    public static void main(String[] args) throws IOException {
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
        option.put("relativePackage", "");
        //解析
        parseObject(velocityEngine, option);
    }

    /**
     * 递归解析prop对象
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
        //属性的数据类型解析
        JSONArray props = propObj.getJSONArray("props");
        for (int i = 0; i < props.size(); i++) {
            JSONObject prop = props.getJSONObject(i);
            //异常属性名处理
            String propName = prop.getString("name");
            if (propName.endsWith("(Object | 'none')")) {
                //属性名为decal(Object | 'none')的异常 共计出现13次
                //https://echarts.apache.org/zh/option.html#series-line.itemStyle.decal(Object%20%7C%20'none')
                System.out.println(">>>>>>>>>>属性异常1命中:" + propName);
                propName = propName.replace("(Object | 'none')", "");
                prop.put("name", propName);
            } else if (propName.equals("return")) {
                //属性名为return的异常 因为是java关键字 共计出现一次
                //https://echarts.apache.org/zh/option.html#series-custom.renderItem.return
                System.out.println(">>>>>>>>>>属性异常2命中:" + propName);
                propName = "return_";
                prop.put("name", propName);
            } else {
                //属性名包含-的异常 共计出现15次 12个是option.graphic.elements的属性 3个是option.dataset.transform的属性
                //其实这些不是属性,而是子类
                //https://echarts.apache.org/zh/option.html#graphic.elements-group
                //https://echarts.apache.org/zh/option.html#dataset.transform-filter
                if (propName.indexOf('-') > -1) {
                    System.out.println(">>>>>>>>>>属性异常3命中:" + propName);
                    propName = propName.replace("-", "_");
                    prop.put("name", propName);
                }
                //属性名包含:的异常 共计出现1次 option.dataset.transform-xxx:xxx
                //https://echarts.apache.org/zh/option.html#dataset.transform-xxx%3Axxx
                if (propName.indexOf(':') > -1) {
                    System.out.println(">>>>>>>>>>属性异常4命中:" + propName);
                    propName = propName.replace(":", "_");
                    prop.put("name", propName);
                }
                //属性名首字母小写,第二个字母大写的 Jackson转json时会异常 导致如:xAxis=>xaxis 这种生成getter方法解决
                if (propName.length() > 2 && Character.isUpperCase(propName.charAt(1))) {
                    prop.put("lowerGetter", true);
                }
            }

            String javaType = "Object";
            //判断属性是否有属性
            JSONArray subProps = prop.getJSONArray("props");
            JSONArray types = prop.getJSONArray("types");
            if (subProps != null && subProps.size() > 0) {
                //为属性创建类
                prop.put("relativePackage", relativePackage + "." + name);
                parseObject(velocityEngine, prop);
                //移除order为0的属性  但要为其生成类所以放在parseObject的下面
                if (prop.getInteger("order") != 0) {
                    javaType = prop.getString("className");
                    imports.add(basePackage + relativePackage + "." + name + "." + javaType);
                    //如果只有一个类型且是数组 java类型就为List
                    if (types.size() == 1 && types.getString(0).equals("Array")) {
                        javaType = "List<" + javaType + ">";
                        imports.add("java.util.List");
                        System.out.println(">>>>>>>>>>>>>只有一个类型且是数组 还有子属性:" + relativePackage + "." + name + "." + propName);
                    }
                }
            } else if ("option".equals(name) && "series".equals(propName)) {
                //特殊处理option.series
                System.out.println(">>>>>>>>>>>>>特殊处理Option.series");
                prop.put("relativePackage", relativePackage + "." + name);
                parseObject(velocityEngine, prop);
                imports.add(basePackage + relativePackage + "." + name + ".Series");
                imports.add("java.util.List");
                javaType = "List<Series>";
            } else {
                //使用java类
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
        context.put("base", new HashMap<String, Object>() {{
            put("package", basePackage + relativePackage);
            put("imports", imports);
            //平滑模式 生成不带set和get,只有属性名的getter和setter方法
            put("fluentMode", false);
            put("author", "auto");
            put("date", DateFormatUtils.format(new Date(), "yyyy-MM-dd"));
        }});
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
        propObj.put("className", className);
        velocityEngine.mergeTemplate("templates/echartsBeanTemplate.vm", "utf-8", context, fw);
        fw.flush();
        fw.close();
        System.out.println("输出:" + className);
    }
}