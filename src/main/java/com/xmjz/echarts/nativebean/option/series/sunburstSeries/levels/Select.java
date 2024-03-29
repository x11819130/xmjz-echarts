package com.xmjz.echarts.nativebean.option.series.sunburstSeries.levels;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.sunburstSeries.levels.select.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.sunburstSeries.levels.select.Label;
import com.xmjz.echarts.nativebean.option.series.sunburstSeries.levels.select.LabelLine;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.select">#series-sunburst.levels.select</a>
 * <br/>默认值: 无
 * <br/>js类型: ["any"]
 * <br/>描述:
 * <p>选中状态配置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Select extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.select.label">#series-sunburst.levels.select.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了每个扇形块中，文本标签的样式。</p>
     * <p><strong>优先级：<a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.label">series.data.label</a> &gt; <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.label">series.levels.label</a> &gt; <a href="https://echarts.apache.org/zh/option.html#series-sunburst.label">series.label</a>。</strong></p>
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.select.labelLine">#series-sunburst.levels.select.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.select.itemStyle">#series-sunburst.levels.select.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>旭日图扇形块的样式。</p>
     * <p>可以在 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.itemStyle">series.itemStyle</a> 定义所有扇形块的样式，也可以在 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> 定义每一层扇形块的样式，还可以在 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle">series.data.itemStyle</a> 定义每个扇形块单独的样式，这三者的优先级从低到高。也就是说，如果定义了 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle">series.data.itemStyle</a>，将会覆盖 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.itemStyle">series.itemStyle</a> 和 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.itemStyle">series.levels.itemStyle</a>。</p>
     * <p><strong>优先级：<a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle">series.data.itemStyle</a> &gt; <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> &gt; <a href="https://echarts.apache.org/zh/option.html#series-sunburst.itemStyle">series.itemStyle</a>。</strong></p>
     */
    private ItemStyle itemStyle;
}
