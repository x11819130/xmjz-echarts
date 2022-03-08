package com.xmjz.echarts.nativebean.option.series.funnelSeries.select;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.funnelSeries.select.labelLine.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.select.labelLine">#series-funnel.select.labelLine</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class LabelLine extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.select.labelLine.show">#series-funnel.select.labelLine.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示视觉引导线。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.select.labelLine.lineStyle">#series-funnel.select.labelLine.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
}
