package com.xmjz.echarts.nativebean.option.series.themeRiverSeries.blur;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.themeRiverSeries.blur.labelLine.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.blur.labelLine">#series-themeRiver.blur.labelLine</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>标签的视觉引导线配置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class LabelLine extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.blur.labelLine.show">#series-themeRiver.blur.labelLine.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示视觉引导线。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.blur.labelLine.lineStyle">#series-themeRiver.blur.labelLine.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
}