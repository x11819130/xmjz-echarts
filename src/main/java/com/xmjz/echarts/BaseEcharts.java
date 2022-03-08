package com.xmjz.echarts;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * BaseEcharts
 *
 * @author auto
 */
public abstract class BaseEcharts {
    private static final int THREE = 3;
    private static final int DEFAULT_CAPACITY = 4;
    private static final String GETTER_PRE = "get";
    private static final String SETTER_PRE = "set";
    private static final String GET_CLASS = "getClass";
    /**
     * 扩展属性
     */
    private Map<String, Object> expandProps;

    public BaseEcharts() {
    }

    private Map<String, Object> getExpandProps() {
        return getExpandProps(DEFAULT_CAPACITY);
    }

    private Map<String, Object> getExpandProps(int size) {
        if (expandProps == null) {
            synchronized (BaseEcharts.class) {
                if (expandProps == null) {
                    expandProps = new HashMap<>(size);
                }
            }
        }
        return expandProps;
    }

    public static <T extends BaseEcharts> T fromMap(Map<String, Object> inMap, Class<? extends BaseEcharts> clazz) {
        try {
            BaseEcharts echarts = clazz.newInstance();
            echarts.loadMap(inMap);
            return (T) echarts;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 从map加载数据
     *
     * @param inMap 输入数据
     */
    protected <T extends BaseEcharts> void loadMap(Map<String, Object> inMap) {
        Class<? extends BaseEcharts> aClass = this.getClass();
        //只取setter方法
        Method[] declaredMethods = aClass.getMethods();
        Arrays.stream(declaredMethods).forEach(action -> {
            String name = action.getName();
            if (name.startsWith(SETTER_PRE) && name.length() > THREE) {
                try {
                    char c = name.charAt(3);
                    name = 65 < c && c < 90 ? ((char) (c + 32)) + name.substring(4) : name.substring(3);
                    //如果存在与setter方法匹配的值
                    if (inMap.containsKey(name)) {
                        Object value = inMap.get(name);
                        //获取setter方法的参数列表
                        Class<?>[] parameterTypes = action.getParameterTypes();
                        if (value != null && parameterTypes.length > 0) {
                            if (parameterTypes[0].isInstance(value)) {
                                //如果值是参数的实例,直接set,并将键值从inMap中移除
                                action.invoke(this, value);
                                inMap.remove(name);
                            } else {
                                //如果参数是BaseEcharts的实例,值是Map的实例,就递归调用loadMap
                                if (BaseEcharts.class.isAssignableFrom(parameterTypes[0]) && Map.class.isAssignableFrom(value.getClass())) {
                                    //已经类型判断
                                    @SuppressWarnings("unchecked")
                                    T echarts = fromMap((Map<String, Object>) value, (Class<? extends BaseEcharts>) parameterTypes[0]);
                                    action.invoke(this, echarts);
                                    inMap.remove(name);
                                }
                            }
                        }
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        });
        //如果设置完set方法还有值没处理的话,就放到map里吧
        if (!inMap.isEmpty()) {
            this.getExpandProps(inMap.size()).putAll(inMap);
        }
    }

    public Map<String, Object> toMap() {
        //把bean属性降维打落到map里,返回map拿去格式化json
        Class<? extends BaseEcharts> aClass = this.getClass();
        //只取getter方法
        Method[] declaredMethods = aClass.getMethods();
        Map<String, Object> map = this.getExpandProps();
        Arrays.stream(declaredMethods).forEach(action -> {
            String name = action.getName();
            if (name.startsWith(GETTER_PRE) && name.length() > THREE && !name.equals(GET_CLASS)) {
                try {
                    //调用getter方法
                    Object value = action.invoke(this);
                    if (value != null) {
                        char c = name.charAt(3);
                        name = 65 < c && c < 90 ? ((char) (c + 32)) + name.substring(4) : name.substring(3);
                        //如果bean属性也是本类,递归调用toMap
                        if (value instanceof BaseEcharts) {
                            value = ((BaseEcharts) value).toMap();
                        }
                        map.put(name, value);
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return map;
    }


    @SuppressWarnings("unchecked")
    public <T> T get(String key) {
        return (T) this.getExpandProps().get(key);
    }

    public BaseEcharts put(String key, Object value) {
        this.getExpandProps().put(key, value);
        return this;
    }
}
