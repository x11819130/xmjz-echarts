package com.xmjz.echarts.nativebean.option.gaugeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.axisLine">https://echarts.apache.org/v4/zh/option.html#series-gauge.axisLine</a>
 * <br/>序号: 13
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>仪表盘轴线相关配置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class AxisLine implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.axisLine.show">https://echarts.apache.org/v4/zh/option.html#series-gauge.axisLine.show</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示仪表盘轴线。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.axisLine.lineStyle">https://echarts.apache.org/v4/zh/option.html#series-gauge.axisLine.lineStyle</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>仪表盘轴线样式。</p>
     */
    private Object lineStyle;
}
