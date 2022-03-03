package com.xmjz.echarts.nativebean.option.barSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.select">https://echarts.apache.org/zh/option.html#series-bar.select</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>数据选中时的图形样式和标签样式。开启 <a href="#series-bar.selectedMode">selectedMode</a> 后有效。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Select implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.select.disabled">https://echarts.apache.org/zh/option.html#series-bar.select.disabled</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.3.0</code> 开始支持</p>
     * </blockquote>
     * <p>是否可以被选中。在开启<code class="codespan">selectedMode</code>的时候有效，可以用于关闭部分数据。</p>
     */
    private Boolean disabled;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.select.label">https://echarts.apache.org/zh/option.html#series-bar.select.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.select.labelLine">https://echarts.apache.org/zh/option.html#series-bar.select.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private Object labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.select.itemStyle">https://echarts.apache.org/zh/option.html#series-bar.select.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p> 图形样式。</p>
     */
    private Object itemStyle;
}
