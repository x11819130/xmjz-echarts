package com.xmjz.echarts.nativebean.option.dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.transform">https://echarts.apache.org/zh/option.html#dataset.transform</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>参见 <a href="https://echarts.apache.org/handbook/zh/concepts/data-transform" target="_blank">数据变换教程</a></p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Transform implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.transform-filter">https://echarts.apache.org/zh/option.html#dataset.transform-filter</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object transform_filter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.transform-sort">https://echarts.apache.org/zh/option.html#dataset.transform-sort</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object transform_sort;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.transform-xxx:xxx">https://echarts.apache.org/zh/option.html#dataset.transform-xxx:xxx</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>除了上述的内置的数据转换器外，我们也可以使用外部的数据转换器。外部数据转换器能提供或自己定制更丰富的功能。</p>
     * <p>参见 <a href="https://echarts.apache.org/handbook/zh/concepts/data-transform" target="_blank">数据变换教程</a></p>
     */
    private Object transform_xxx_xxx;
}
