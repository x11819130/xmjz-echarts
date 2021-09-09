package com.xmjz.echarts.nativebean.option.treemapSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.emphasis">https://echarts.apache.org/v4/zh/option.html#series-treemap.emphasis</a>
 * <br/>序号: 30
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.emphasis.label">https://echarts.apache.org/v4/zh/option.html#series-treemap.emphasis.label</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.emphasis.upperLabel">https://echarts.apache.org/v4/zh/option.html#series-treemap.emphasis.upperLabel</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object upperLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.emphasis.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-treemap.emphasis.itemStyle</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
}
