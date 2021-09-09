package com.xmjz.echarts.nativebean.option.radarSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.select">https://echarts.apache.org/zh/option.html#series-radar.select</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>选中状态的配置。开启 <a href="#series-radar.selectedMode">selectedMode</a> 后有效。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Select implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.select.itemStyle">https://echarts.apache.org/zh/option.html#series-radar.select.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.select.label">https://echarts.apache.org/zh/option.html#series-radar.select.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.select.lineStyle">https://echarts.apache.org/zh/option.html#series-radar.select.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.select.areaStyle">https://echarts.apache.org/zh/option.html#series-radar.select.areaStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object areaStyle;
}
