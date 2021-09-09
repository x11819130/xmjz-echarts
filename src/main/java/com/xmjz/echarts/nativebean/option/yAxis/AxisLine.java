package com.xmjz.echarts.nativebean.option.yAxis;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine">https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine</a>
 * <br/>序号: 24
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>坐标轴轴线相关设置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class AxisLine implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.show">https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.show</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示坐标轴轴线。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.onZero">https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.onZero</a>
     * <br/>序号: 2
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>X 轴或者 Y 轴的轴线是否在另一个轴的 0 刻度上，只有在另一个轴为数值轴且包含 0 刻度时有效。</p>
     */
    private Boolean onZero;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.onZeroAxisIndex">https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.onZeroAxisIndex</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当有双轴时，可以用这个属性手动指定，在哪个轴的 0 刻度上。</p>
     */
    private Integer onZeroAxisIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.symbol">https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.symbol</a>
     * <br/>序号: 4
     * <br/>默认值: none
     * <br/>js类型: ["string","Array"]
     * <br/>描述:
     * <p>轴线两边的箭头。可以是字符串，表示两端使用同样的箭头；或者长度为 2 的字符串数组，分别表示两端的箭头。默认不显示箭头，即 <code class="codespan">'none'</code>。两端都显示箭头可以设置为 <code class="codespan">'arrow'</code>，只在末端显示箭头可以设置为 <code class="codespan">['none', 'arrow']</code>。</p>
     */
    private Object symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.symbolSize">https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.symbolSize</a>
     * <br/>序号: 5
     * <br/>默认值: [10,15]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>轴线两边的箭头的大小，第一个数字表示宽度（垂直坐标轴方向），第二个数字表示高度（平行坐标轴方向）。</p>
     */
    private List<?> symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.symbolOffset">https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.symbolOffset</a>
     * <br/>序号: 6
     * <br/>默认值: [0,0]
     * <br/>js类型: ["Array","number"]
     * <br/>描述:
     * <p>轴线两边的箭头的偏移，如果是数组，第一个数字表示起始箭头的偏移，第二个数字表示末端箭头的偏移；如果是数字，表示这两个箭头使用同样的偏移。</p>
     */
    private Object symbolOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.lineStyle">https://echarts.apache.org/v4/zh/option.html#yAxis.axisLine.lineStyle</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
}
