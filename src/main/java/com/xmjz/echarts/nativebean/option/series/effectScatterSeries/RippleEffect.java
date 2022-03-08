package com.xmjz.echarts.nativebean.option.series.effectScatterSeries;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.rippleEffect">#series-effectScatter.rippleEffect</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>涟漪特效相关配置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class RippleEffect extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.rippleEffect.color">#series-effectScatter.rippleEffect.color</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.4.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>涟漪的颜色，默认为散点的颜色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.rippleEffect.number">#series-effectScatter.rippleEffect.number</a>
     * <br/>默认值: 3
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.2.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>波纹的数量。</p>
     */
    private Integer number;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.rippleEffect.period">#series-effectScatter.rippleEffect.period</a>
     * <br/>默认值: 4
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>动画的周期，秒数。</p>
     */
    private Integer period;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.rippleEffect.scale">#series-effectScatter.rippleEffect.scale</a>
     * <br/>默认值: 2.5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>动画中波纹的最大缩放比例。</p>
     */
    private Integer scale;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.rippleEffect.brushType">#series-effectScatter.rippleEffect.brushType</a>
     * <br/>默认值: 'fill'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>波纹的绘制方式，可选 <code class="codespan">'stroke'</code> 和 <code class="codespan">'fill'</code>。</p>
     */
    private String brushType;
}
