package com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.markPoint;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.markPoint.blur.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.markPoint.blur.Label;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.markPoint.blur">#series-pictorialBar.markPoint.blur</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>标注的淡出样式。淡出的规则跟随所在系列。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Blur extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.markPoint.blur.label">#series-pictorialBar.markPoint.blur.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.markPoint.blur.itemStyle">#series-pictorialBar.markPoint.blur.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private ItemStyle itemStyle;
}