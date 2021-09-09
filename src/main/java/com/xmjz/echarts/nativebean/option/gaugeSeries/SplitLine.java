package com.xmjz.echarts.nativebean.option.gaugeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.splitLine">https://echarts.apache.org/v4/zh/option.html#series-gauge.splitLine</a>
 * <br/>序号: 14
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>分隔线样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class SplitLine implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.splitLine.show">https://echarts.apache.org/v4/zh/option.html#series-gauge.splitLine.show</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示分隔线。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.splitLine.length">https://echarts.apache.org/v4/zh/option.html#series-gauge.splitLine.length</a>
     * <br/>序号: 2
     * <br/>默认值: 30
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>分隔线线长。支持相对半径的百分比。</p>
     */
    private Object length;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.splitLine.lineStyle">https://echarts.apache.org/v4/zh/option.html#series-gauge.splitLine.lineStyle</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
}
