package com.xmjz.echarts.nativebean.option.gaugeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.emphasis">https://echarts.apache.org/zh/option.html#series-gauge.emphasis</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>高亮的仪表盘指针样式</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.emphasis.itemStyle">https://echarts.apache.org/zh/option.html#series-gauge.emphasis.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     */
    private Object itemStyle;
}
