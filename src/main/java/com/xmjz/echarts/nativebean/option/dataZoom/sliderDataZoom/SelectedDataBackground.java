package com.xmjz.echarts.nativebean.option.dataZoom.sliderDataZoom;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.dataZoom.sliderDataZoom.selectedDataBackground.AreaStyle;
import com.xmjz.echarts.nativebean.option.dataZoom.sliderDataZoom.selectedDataBackground.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.selectedDataBackground">#dataZoom-slider.selectedDataBackground</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>选中部分数据阴影的样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class SelectedDataBackground extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.selectedDataBackground.lineStyle">#dataZoom-slider.selectedDataBackground.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>选中部分阴影的线条样式</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.selectedDataBackground.areaStyle">#dataZoom-slider.selectedDataBackground.areaStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>选中部分阴影的填充样式</p>
     */
    private AreaStyle areaStyle;
}
