package com.xmjz.echarts.nativebean.option.customSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-custom.emphasis">https://echarts.apache.org/v4/zh/option.html#series-custom.emphasis</a>
 * <br/>序号: 13
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>高亮图形样式</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-custom.emphasis.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-custom.emphasis.itemStyle</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
}