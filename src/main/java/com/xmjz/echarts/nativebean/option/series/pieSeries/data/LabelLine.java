package com.xmjz.echarts.nativebean.option.series.pieSeries.data;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.pieSeries.data.labelLine.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.data.labelLine">#series-pie.data.labelLine</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class LabelLine extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.data.labelLine.show">#series-pie.data.labelLine.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示视觉引导线。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.data.labelLine.length">#series-pie.data.labelLine.length</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>视觉引导线第一段的长度。</p>
     */
    private Integer length;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.data.labelLine.length2">#series-pie.data.labelLine.length2</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>视觉引导项第二段的长度。</p>
     */
    private Integer length2;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.data.labelLine.smooth">#series-pie.data.labelLine.smooth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","number"]
     * <br/>描述:
     * <p>是否平滑视觉引导线，默认不平滑，可以设置成 <code class="codespan">true</code> 平滑显示，也可以设置为 0 到 1 的值，表示平滑程度。</p>
     */
    private Object smooth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.data.labelLine.lineStyle">#series-pie.data.labelLine.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
}
