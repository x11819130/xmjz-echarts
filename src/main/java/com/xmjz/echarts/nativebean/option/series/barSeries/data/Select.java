package com.xmjz.echarts.nativebean.option.series.barSeries.data;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.barSeries.data.select.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.barSeries.data.select.Label;
import com.xmjz.echarts.nativebean.option.series.barSeries.data.select.LabelLine;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.select">#series-bar.data.select</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>单个数据的选中状态配置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Select extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.select.disabled">#series-bar.data.select.disabled</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.select.label">#series-bar.data.select.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据的文本配置。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.select.labelLine">#series-bar.data.select.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.select.itemStyle">#series-bar.data.select.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据的图形样式设置。</p>
     */
    private ItemStyle itemStyle;
}
