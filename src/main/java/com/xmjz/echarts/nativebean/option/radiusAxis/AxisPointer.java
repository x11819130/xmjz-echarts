package com.xmjz.echarts.nativebean.option.radiusAxis;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer">https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer</a>
 * <br/>序号: 29
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>坐标轴指示器配置项。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class AxisPointer implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.show">https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.show</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>默认不显示。但是如果 <a href="#tooltip.trigger">tooltip.trigger</a> 设置为 <code class="codespan">'axis'</code> 或者 <a href="#tooltip.axisPointer.type">tooltip.axisPointer.type</a> 设置为 <code class="codespan">'cross'</code>，则自动显示 axisPointer。坐标系会自动选择显示显示哪个轴的 axisPointer，也可以使用 <a href="#tooltip.axisPointer.axis">tooltip.axisPointer.axis</a> 改变这种选择。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.type">https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.type</a>
     * <br/>序号: 2
     * <br/>默认值: line
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>指示器类型。</p>
     * <p>可选</p>
     * <ul>
     * <li><p><code class="codespan">'line'</code> 直线指示器</p>
     * </li>
     * <li><p><code class="codespan">'shadow'</code> 阴影指示器</p>
     * </li>
     * <li><p><code class="codespan">'none'</code> 无指示器</p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.snap">https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.snap</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>坐标轴指示器是否自动吸附到点上。默认自动判断。</p>
     * <p>这个功能在数值轴和时间轴上比较有意义，可以自动寻找细小的数值点。</p>
     */
    private Boolean snap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.z">https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.z</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴指示器的 z 值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.label">https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.label</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴指示器的文本标签。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.lineStyle">https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.lineStyle</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><a href="#tooltip.axisPointer.type">axisPointer.type</a> 为 <code class="codespan">'line'</code> 时有效。</p>
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.shadowStyle">https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.shadowStyle</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><a href="#tooltip.axisPointer.type">axisPointer.type</a> 为 <code class="codespan">'shadow'</code> 时有效。</p>
     */
    private Object shadowStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.triggerTooltip">https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.triggerTooltip</a>
     * <br/>序号: 8
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否触发 tooltip。如果不想触发 tooltip 可以关掉。</p>
     */
    private Boolean triggerTooltip;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.value">https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.value</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前的 value。在使用 <a href="xAxisPointer.handle" target="_blank">axisPointer.handle</a> 时，可以设置此值进行初始值设定，从而决定 axisPointer 的初始位置。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.status">https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.status</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>当前的状态，可取值为 <code class="codespan">'show'</code> 和 <code class="codespan">'hide'</code>。</p>
     */
    private Boolean status;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.handle">https://echarts.apache.org/zh/option.html#radiusAxis.axisPointer.handle</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>拖拽手柄，适用于触屏的环境。参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-tooltip-touch&amp;edit=1&amp;reset=1" target="_blank">例子</a>。</p>
     */
    private Object handle;
}
