package com.xmjz.echarts.nativebean.option.series.lineSeries.data;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.lineSeries.data.select.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.lineSeries.data.select.Label;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.select">#series-line.data.select</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>单个拐点的选中样式和标签设置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Select extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.select.disabled">#series-line.data.select.disabled</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.select.label">#series-line.data.select.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.select.itemStyle">#series-line.data.select.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private ItemStyle itemStyle;
}
