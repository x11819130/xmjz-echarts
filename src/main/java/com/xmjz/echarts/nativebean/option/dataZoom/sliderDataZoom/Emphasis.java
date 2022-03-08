package com.xmjz.echarts.nativebean.option.dataZoom.sliderDataZoom;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.dataZoom.sliderDataZoom.emphasis.HandleStyle;
import com.xmjz.echarts.nativebean.option.dataZoom.sliderDataZoom.emphasis.MoveHandleStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.emphasis">#dataZoom-slider.emphasis</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>高亮样式设置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.emphasis.handleStyle">#dataZoom-slider.emphasis.handleStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private HandleStyle handleStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.emphasis.moveHandleStyle">#dataZoom-slider.emphasis.moveHandleStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private MoveHandleStyle moveHandleStyle;
}
