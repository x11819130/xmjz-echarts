package com.xmjz.echarts.nativebean.option.heatmapSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.blur">https://echarts.apache.org/zh/option.html#series-heatmap.blur</a>
 * <br/>序号: 19
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>淡出状态的图形样式。开启 <a href="#series-heatmap.emphasis.focus">emphasis.focus</a> 后有效。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Blur implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.blur.itemStyle">https://echarts.apache.org/zh/option.html#series-heatmap.blur.itemStyle</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.blur.label">https://echarts.apache.org/zh/option.html#series-heatmap.blur.label</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
}
