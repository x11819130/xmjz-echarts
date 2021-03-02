package com.xmjz.echarts.nativebean.option.gaugeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisTick">https://echarts.apache.org/zh/option.html#series-gauge.axisTick</a>
 * <br/>序号: 19
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>刻度样式。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class AxisTick implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisTick.show">https://echarts.apache.org/zh/option.html#series-gauge.axisTick.show</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示刻度。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisTick.splitNumber">https://echarts.apache.org/zh/option.html#series-gauge.axisTick.splitNumber</a>
     * <br/>序号: 2
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>分隔线之间分割的刻度数。</p>
     */
    private Integer splitNumber;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisTick.length">https://echarts.apache.org/zh/option.html#series-gauge.axisTick.length</a>
     * <br/>序号: 3
     * <br/>默认值: 6
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>刻度线长。支持相对半径的百分比。</p>
     */
    private Object length;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisTick.distance">https://echarts.apache.org/zh/option.html#series-gauge.axisTick.distance</a>
     * <br/>序号: 4
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>刻度线与轴线的距离。</p>
     */
    private Integer distance;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisTick.lineStyle">https://echarts.apache.org/zh/option.html#series-gauge.axisTick.lineStyle</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
}
