package com.xmjz.echarts.nativebean.option.dataZoom.sliderDataZoom;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.dataZoom.sliderDataZoom.dataBackground.AreaStyle;
import com.xmjz.echarts.nativebean.option.dataZoom.sliderDataZoom.dataBackground.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.dataBackground">#dataZoom-slider.dataBackground</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>数据阴影的样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class DataBackground extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.dataBackground.lineStyle">#dataZoom-slider.dataBackground.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>阴影的线条样式</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.dataBackground.areaStyle">#dataZoom-slider.dataBackground.areaStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>阴影的填充样式</p>
     */
    private AreaStyle areaStyle;
}
