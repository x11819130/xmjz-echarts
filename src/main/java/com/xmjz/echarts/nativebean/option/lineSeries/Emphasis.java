package com.xmjz.echarts.nativebean.option.lineSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-line.emphasis">https://echarts.apache.org/v4/zh/option.html#series-line.emphasis</a>
 * <br/>序号: 26
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>图形的高亮样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-line.emphasis.label">https://echarts.apache.org/v4/zh/option.html#series-line.emphasis.label</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-line.emphasis.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-line.emphasis.itemStyle</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
}
