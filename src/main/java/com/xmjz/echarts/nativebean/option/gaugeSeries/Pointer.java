package com.xmjz.echarts.nativebean.option.gaugeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.pointer">https://echarts.apache.org/v4/zh/option.html#series-gauge.pointer</a>
 * <br/>序号: 17
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>仪表盘指针。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Pointer implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.pointer.show">https://echarts.apache.org/v4/zh/option.html#series-gauge.pointer.show</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示指针。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.pointer.length">https://echarts.apache.org/v4/zh/option.html#series-gauge.pointer.length</a>
     * <br/>序号: 2
     * <br/>默认值: 80%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>指针长度，可以是绝对数值，也可以是相对于<a href="#series-gauge.radius">半径</a>的半分比。</p>
     */
    private Object length;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.pointer.width">https://echarts.apache.org/v4/zh/option.html#series-gauge.pointer.width</a>
     * <br/>序号: 3
     * <br/>默认值: 8
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指针宽度。</p>
     */
    private Integer width;
}
