package com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.data;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.data.blur.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.data.blur.Label;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.data.blur.LabelLine;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.blur">#series-pictorialBar.data.blur</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>单个数据的淡出状态配置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Blur extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.blur.label">#series-pictorialBar.data.blur.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据的文本配置。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.blur.labelLine">#series-pictorialBar.data.blur.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.blur.itemStyle">#series-pictorialBar.data.blur.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据的图形样式设置。</p>
     */
    private ItemStyle itemStyle;
}
