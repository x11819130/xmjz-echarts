package com.xmjz.echarts.nativebean.option.series.pictorialBarSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.selectedMode.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.selectedMode.Label;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.selectedMode.LabelLine;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.selectedMode">#series-pictorialBar.selectedMode</a>
 * <br/>默认值: 无
 * <br/>js类型: ["boolean","string"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 *
 *
 * <p>选中模式的配置，表示是否支持多个选中，默认关闭，支持布尔值和字符串，字符串取值可选<code class="codespan">'single'</code>，<code class="codespan">'multiple'</code>，<code class="codespan">'series'</code> 分别表示单选，多选以及选择整个系列。</p>
 * <blockquote>
 * <p>从 v5.3.0 开始支持 <code class="codespan">'series'</code>。</p>
 * </blockquote>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class SelectedMode extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.selectedMode.label">#series-pictorialBar.selectedMode.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.selectedMode.labelLine">#series-pictorialBar.selectedMode.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.selectedMode.itemStyle">#series-pictorialBar.selectedMode.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private ItemStyle itemStyle;
}
