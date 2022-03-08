package com.xmjz.echarts.nativebean.option.series.treemapSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.labelLine.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.labelLine">#series-treemap.labelLine</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>标签的视觉引导线配置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class LabelLine extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.labelLine.show">#series-treemap.labelLine.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示视觉引导线。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.labelLine.showAbove">#series-treemap.labelLine.showAbove</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示在图形上方。</p>
     */
    private Boolean showAbove;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.labelLine.length2">#series-treemap.labelLine.length2</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>视觉引导项第二段的长度。</p>
     */
    private Integer length2;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.labelLine.smooth">#series-treemap.labelLine.smooth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","number"]
     * <br/>描述:
     * <p>是否平滑视觉引导线，默认不平滑，可以设置成 <code class="codespan">true</code> 平滑显示，也可以设置为 0 到 1 的值，表示平滑程度。</p>
     */
    private Object smooth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.labelLine.minTurnAngle">#series-treemap.labelLine.minTurnAngle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>通过调整第二段线的长度，限制引导线两端之间最小的夹角，以防止过小的夹角导致显示不美观。</p>
     * <p>可以设置为 0 - 180 度。</p>
     */
    private Integer minTurnAngle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.labelLine.lineStyle">#series-treemap.labelLine.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
}
