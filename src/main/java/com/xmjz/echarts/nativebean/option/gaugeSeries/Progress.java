package com.xmjz.echarts.nativebean.option.gaugeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.progress">https://echarts.apache.org/zh/option.html#series-gauge.progress</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0</code> 开始支持</p>
 * </blockquote>
 * <p>展示当前进度。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Progress implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.progress.show">https://echarts.apache.org/zh/option.html#series-gauge.progress.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示进度条。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.progress.overlap">https://echarts.apache.org/zh/option.html#series-gauge.progress.overlap</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>多组数据时进度条是否重叠。</p>
     */
    private Boolean overlap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.progress.width">https://echarts.apache.org/zh/option.html#series-gauge.progress.width</a>
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>进度条宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.progress.roundCap">https://echarts.apache.org/zh/option.html#series-gauge.progress.roundCap</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否在两端显示成圆形。</p>
     */
    private Boolean roundCap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.progress.clip">https://echarts.apache.org/zh/option.html#series-gauge.progress.clip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否裁掉超出部分。</p>
     */
    private Boolean clip;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.progress.itemStyle">https://echarts.apache.org/zh/option.html#series-gauge.progress.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>进度条样式。</p>
     */
    private Object itemStyle;
}
