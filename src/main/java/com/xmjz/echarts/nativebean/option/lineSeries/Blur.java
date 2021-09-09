package com.xmjz.echarts.nativebean.option.lineSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur">https://echarts.apache.org/zh/option.html#series-line.blur</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>折线图的淡出状态。开启 <a href="#series-line.emphasis.focus">emphasis.focus</a> 后有效。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Blur implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur.label">https://echarts.apache.org/zh/option.html#series-line.blur.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur.labelLine">https://echarts.apache.org/zh/option.html#series-line.blur.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private Object labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur.itemStyle">https://echarts.apache.org/zh/option.html#series-line.blur.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur.lineStyle">https://echarts.apache.org/zh/option.html#series-line.blur.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur.areaStyle">https://echarts.apache.org/zh/option.html#series-line.blur.areaStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object areaStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur.endLabel">https://echarts.apache.org/zh/option.html#series-line.blur.endLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object endLabel;
}
