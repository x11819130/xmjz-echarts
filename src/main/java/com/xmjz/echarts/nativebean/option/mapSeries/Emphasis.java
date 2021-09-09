package com.xmjz.echarts.nativebean.option.mapSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.emphasis">https://echarts.apache.org/zh/option.html#series-map.emphasis</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>高亮状态下的多边形和标签样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.emphasis.label">https://echarts.apache.org/zh/option.html#series-map.emphasis.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.emphasis.itemStyle">https://echarts.apache.org/zh/option.html#series-map.emphasis.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
}
