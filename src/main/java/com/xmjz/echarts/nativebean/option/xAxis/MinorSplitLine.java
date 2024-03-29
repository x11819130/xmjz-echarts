package com.xmjz.echarts.nativebean.option.xAxis;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.xAxis.minorSplitLine.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.minorSplitLine">#xAxis.minorSplitLine</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v4.6.0</code> 开始支持</p>
 * </blockquote>
 * <p>坐标轴在 <a href="https://echarts.apache.org/zh/option.html#grid">grid</a> 区域中的次分隔线。次分割线会对齐次刻度线 <a href="https://echarts.apache.org/zh/option.html#xAxis.minorTick">minorTick</a></p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class MinorSplitLine extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.minorSplitLine.show">#xAxis.minorSplitLine.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示次分隔线。默认不显示。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.minorSplitLine.lineStyle">#xAxis.minorSplitLine.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
}
