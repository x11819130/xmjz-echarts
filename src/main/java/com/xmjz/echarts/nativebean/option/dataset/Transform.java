package com.xmjz.echarts.nativebean.option.dataset;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.transform">https://echarts.apache.org/zh/option.html#dataset.transform</a>
 * <br/>序号: 5
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>参见这个教程： <a href="tutorial.html#%E4%BD%BF%E7%94%A8%20transform%20%E8%BF%9B%E8%A1%8C%E6%95%B0%E6%8D%AE%E8%BD%AC%E6%8D%A2" target="_blank">data transform</a>.</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Transform implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#dataset.transform-filter
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object transform_filter;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#dataset.transform-sort
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object transform_sort;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#dataset.transform-xxx:xxx
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>除了上述的内置的数据转换器外，我们也可以使用外部的数据转换器。外部数据转换器能提供或自己定制更丰富的功能。</p>
     * <p>参见这个教程： <a href="tutorial.html#%E4%BD%BF%E7%94%A8%20transform%20%E8%BF%9B%E8%A1%8C%E6%95%B0%E6%8D%AE%E8%BD%AC%E6%8D%A2" target="_blank">data transform</a>.</p>
     */
    private Object transform_xxx_xxx;
}
