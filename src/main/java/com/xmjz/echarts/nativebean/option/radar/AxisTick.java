package com.xmjz.echarts.nativebean.option.radar;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisTick">https://echarts.apache.org/zh/option.html#radar.axisTick</a>
 * <br/>序号: 15
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>坐标轴刻度相关设置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class AxisTick implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisTick.show">https://echarts.apache.org/zh/option.html#radar.axisTick.show</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示坐标轴刻度。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisTick.length">https://echarts.apache.org/zh/option.html#radar.axisTick.length</a>
     * <br/>序号: 2
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴刻度的长度。</p>
     */
    private Integer length;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisTick.lineStyle">https://echarts.apache.org/zh/option.html#radar.axisTick.lineStyle</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>刻度线的样式设置。</p>
     */
    private Object lineStyle;
}
