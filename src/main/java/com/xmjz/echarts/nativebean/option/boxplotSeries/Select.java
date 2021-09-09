package com.xmjz.echarts.nativebean.option.boxplotSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.select">https://echarts.apache.org/zh/option.html#series-boxplot.select</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>数据选中时的图形样式和标签样式。开启 <a href="#series-funnel.selectedMode">selectedMode</a> 后有效。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Select implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.select.itemStyle">https://echarts.apache.org/zh/option.html#series-boxplot.select.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
}
