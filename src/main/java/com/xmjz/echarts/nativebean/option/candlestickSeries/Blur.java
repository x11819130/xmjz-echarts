package com.xmjz.echarts.nativebean.option.candlestickSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.blur">https://echarts.apache.org/zh/option.html#series-candlestick.blur</a>
 * <br/>序号: 15
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>K 线图的淡出状态。开启 <a href="#series-candlestick.emphasis.focus">emphasis.focus</a> 后有效</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Blur implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.blur.itemStyle">https://echarts.apache.org/zh/option.html#series-candlestick.blur.itemStyle</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
}
