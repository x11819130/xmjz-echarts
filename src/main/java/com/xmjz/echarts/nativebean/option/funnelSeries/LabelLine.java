package com.xmjz.echarts.nativebean.option.funnelSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.labelLine">https://echarts.apache.org/zh/option.html#series-funnel.labelLine</a>
 * <br/>序号: 14
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>标签的视觉引导线样式，在 <a href="#series-funnel.label.position">label 位置</a> 设置为<code class="codespan">'left'</code>或者<code class="codespan">'right'</code>的时候会显示视觉引导线。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class LabelLine implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.labelLine.show">https://echarts.apache.org/zh/option.html#series-funnel.labelLine.show</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示视觉引导线。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.labelLine.length">https://echarts.apache.org/zh/option.html#series-funnel.labelLine.length</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>视觉引导线的长度。</p>
     */
    private Integer length;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.labelLine.lineStyle">https://echarts.apache.org/zh/option.html#series-funnel.labelLine.lineStyle</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
}
