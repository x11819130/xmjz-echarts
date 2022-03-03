package com.xmjz.echarts.nativebean.option.graphSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.select">https://echarts.apache.org/zh/option.html#series-graph.select</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>选中状态的图形样式。开启 <a href="#series-graph.selectedMode">selectedMode</a> 后有效。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Select implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.select.disabled">https://echarts.apache.org/zh/option.html#series-graph.select.disabled</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.select.itemStyle">https://echarts.apache.org/zh/option.html#series-graph.select.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.select.lineStyle">https://echarts.apache.org/zh/option.html#series-graph.select.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.select.label">https://echarts.apache.org/zh/option.html#series-graph.select.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.select.edgeLabel">https://echarts.apache.org/zh/option.html#series-graph.select.edgeLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object edgeLabel;
}
