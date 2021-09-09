package com.xmjz.echarts.nativebean.option.effectScatterSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-effectScatter.rippleEffect">https://echarts.apache.org/v4/zh/option.html#series-effectScatter.rippleEffect</a>
 * <br/>序号: 7
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
public class RippleEffect implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-effectScatter.rippleEffect.color">https://echarts.apache.org/v4/zh/option.html#series-effectScatter.rippleEffect.color</a>
     * <br/>序号: 1
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-effectScatter.rippleEffect.period">https://echarts.apache.org/v4/zh/option.html#series-effectScatter.rippleEffect.period</a>
     * <br/>序号: 2
     * <br/>默认值: 4
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>动画的周期，秒数。</p>
     */
    private Integer period;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-effectScatter.rippleEffect.scale">https://echarts.apache.org/v4/zh/option.html#series-effectScatter.rippleEffect.scale</a>
     * <br/>序号: 3
     * <br/>默认值: 2.5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>动画中波纹的最大缩放比例。</p>
     */
    private Integer scale;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-effectScatter.rippleEffect.brushType">https://echarts.apache.org/v4/zh/option.html#series-effectScatter.rippleEffect.brushType</a>
     * <br/>序号: 4
     * <br/>默认值: fill
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>波纹的绘制方式，可选 <code class="codespan">'stroke'</code> 和 <code class="codespan">'fill'</code>。</p>
     */
    private String brushType;
}
