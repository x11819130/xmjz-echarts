package com.xmjz.echarts.nativebean.option.angleAxis;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.minorSplitLine">https://echarts.apache.org/zh/option.html#angleAxis.minorSplitLine</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v4.6.0</code> 开始支持</p>
 * </blockquote>
 * <p>坐标轴在 <a href="#grid">grid</a> 区域中的次分隔线。次分割线会对齐次刻度线 <a href="#angleAxis.minorTick">minorTick</a></p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class MinorSplitLine implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.minorSplitLine.show">https://echarts.apache.org/zh/option.html#angleAxis.minorSplitLine.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示次分隔线。默认不显示。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.minorSplitLine.lineStyle">https://echarts.apache.org/zh/option.html#angleAxis.minorSplitLine.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
}
