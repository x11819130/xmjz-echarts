package com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.markLine;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.markLine.emphasis.Label;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.markLine.emphasis.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.markLine.emphasis">#series-pictorialBar.markLine.emphasis</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>标线的高亮样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.markLine.emphasis.disabled">#series-pictorialBar.markLine.emphasis.disabled</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.3.0</code> 开始支持</p>
     * </blockquote>
     * <p>是否关闭高亮状态。</p>
     * <p>关闭高亮状态可以在鼠标移到图形上，tooltip 触发，或者图例联动的时候不再触发高亮效果。在图形非常多的时候可以关闭以提升交互流畅性。</p>
     */
    private Boolean disabled;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.markLine.emphasis.label">#series-pictorialBar.markLine.emphasis.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.markLine.emphasis.lineStyle">#series-pictorialBar.markLine.emphasis.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
}
