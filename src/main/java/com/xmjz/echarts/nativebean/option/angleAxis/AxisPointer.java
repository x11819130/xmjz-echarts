package com.xmjz.echarts.nativebean.option.angleAxis;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.angleAxis.axisPointer.Handle;
import com.xmjz.echarts.nativebean.option.angleAxis.axisPointer.Label;
import com.xmjz.echarts.nativebean.option.angleAxis.axisPointer.LineStyle;
import com.xmjz.echarts.nativebean.option.angleAxis.axisPointer.ShadowStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer">#angleAxis.axisPointer</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>坐标轴指示器配置项。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class AxisPointer extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.show">#angleAxis.axisPointer.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>默认不显示。但是如果 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">tooltip.trigger</a> 设置为 <code class="codespan">'axis'</code> 或者 <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.type">tooltip.axisPointer.type</a> 设置为 <code class="codespan">'cross'</code>，则自动显示 axisPointer。坐标系会自动选择显示显示哪个轴的 axisPointer，也可以使用 <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.axis">tooltip.axisPointer.axis</a> 改变这种选择。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.type">#angleAxis.axisPointer.type</a>
     * <br/>默认值: 'line'
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.snap">#angleAxis.axisPointer.snap</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>坐标轴指示器是否自动吸附到点上。默认自动判断。</p>
     * <p>这个功能在数值轴和时间轴上比较有意义，可以自动寻找细小的数值点。</p>
     */
    private Boolean snap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.z">#angleAxis.axisPointer.z</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴指示器的 z 值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label">#angleAxis.axisPointer.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴指示器的文本标签。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.lineStyle">#angleAxis.axisPointer.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.type">axisPointer.type</a> 为 <code class="codespan">'line'</code> 时有效。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.shadowStyle">#angleAxis.axisPointer.shadowStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.type">axisPointer.type</a> 为 <code class="codespan">'shadow'</code> 时有效。</p>
     */
    private ShadowStyle shadowStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.triggerTooltip">#angleAxis.axisPointer.triggerTooltip</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否触发 tooltip。如果不想触发 tooltip 可以关掉。</p>
     */
    private Boolean triggerTooltip;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.value">#angleAxis.axisPointer.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前的 value。在使用 <a href="xAxisPointer.handle" target="_blank">axisPointer.handle</a> 时，可以设置此值进行初始值设定，从而决定 axisPointer 的初始位置。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.status">#angleAxis.axisPointer.status</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>当前的状态，可取值为 <code class="codespan">'show'</code> 和 <code class="codespan">'hide'</code>。</p>
     */
    private Boolean status;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.handle">#angleAxis.axisPointer.handle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>拖拽手柄，适用于触屏的环境。参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-tooltip-touch&amp;edit=1&amp;reset=1" target="_blank">例子</a>。</p>
     */
    private Handle handle;
}
