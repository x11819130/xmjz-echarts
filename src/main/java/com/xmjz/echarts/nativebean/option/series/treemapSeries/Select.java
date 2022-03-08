package com.xmjz.echarts.nativebean.option.series.treemapSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.select.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.select.Label;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.select.LabelLine;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.select.UpperLabel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.select">#series-treemap.select</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.select.disabled">#series-treemap.select.disabled</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.select.label">#series-treemap.select.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.select.labelLine">#series-treemap.select.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.select.upperLabel">#series-treemap.select.upperLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private UpperLabel upperLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.select.itemStyle">#series-treemap.select.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private ItemStyle itemStyle;
}
