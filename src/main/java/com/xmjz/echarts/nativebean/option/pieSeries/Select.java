package com.xmjz.echarts.nativebean.option.pieSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.select">https://echarts.apache.org/zh/option.html#series-pie.select</a>
 * <br/>序号: 29
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>选中状态的扇区和标签样式。开启 <a href="#series-pie.selectedMode">selectedMode</a> 后有效。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Select implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.select.label">https://echarts.apache.org/zh/option.html#series-pie.select.label</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.select.labelLine">https://echarts.apache.org/zh/option.html#series-pie.select.labelLine</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.select.itemStyle">https://echarts.apache.org/zh/option.html#series-pie.select.itemStyle</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
}
