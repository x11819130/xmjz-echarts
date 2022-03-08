package com.xmjz.echarts.nativebean.option.series.lineSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.lineSeries.blur.AreaStyle;
import com.xmjz.echarts.nativebean.option.series.lineSeries.blur.EndLabel;
import com.xmjz.echarts.nativebean.option.series.lineSeries.blur.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.lineSeries.blur.Label;
import com.xmjz.echarts.nativebean.option.series.lineSeries.blur.LabelLine;
import com.xmjz.echarts.nativebean.option.series.lineSeries.blur.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur">#series-line.blur</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>折线图的淡出状态。开启 <a href="https://echarts.apache.org/zh/option.html#series-line.emphasis.focus">emphasis.focus</a> 后有效。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Blur extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur.label">#series-line.blur.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur.labelLine">#series-line.blur.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur.itemStyle">#series-line.blur.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur.lineStyle">#series-line.blur.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur.areaStyle">#series-line.blur.areaStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private AreaStyle areaStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.blur.endLabel">#series-line.blur.endLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private EndLabel endLabel;
}
