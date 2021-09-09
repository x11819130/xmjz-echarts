package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.axisPointer.Handle;
import com.xmjz.echarts.nativebean.option.axisPointer.Label;
import com.xmjz.echarts.nativebean.option.axisPointer.LineStyle;
import com.xmjz.echarts.nativebean.option.axisPointer.ShadowStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer">https://echarts.apache.org/v4/zh/option.html#axisPointer</a>
 * <br/>序号: 13
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>这是坐标轴指示器（axisPointer）的全局公用设置。</p>
 *
 *
 * <hr>
 * <p>坐标轴指示器是指示坐标轴当前刻度的工具。</p>
 * <p>如下例，鼠标悬浮到图上，可以出现标线和刻度文本。</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/candlestick-axisPointer&amp;edit=1&amp;reset=1" width="600" height="450"><iframe />
 *
 *
 * <p>上例中，使用了 <a href="#axisPointer.link">axisPointer.link</a> 来关联不同的坐标系中的 axisPointer。</p>
 * <p>坐标轴指示器也有适合触屏的交互方式，如下：</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=line-tooltip-touch&edit=1&reset=1" width="600" height="400"><iframe />
 *
 *
 * <p>坐标轴指示器在多轴的场景能起到辅助作用：</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=multiple-y-axis&edit=1&reset=1" width="600" height="300"><iframe />
 * <p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=multiple-x-axis&edit=1&reset=1" width="600" height="300"><iframe />
 *
 *
 *
 *
 * <hr>
 * <blockquote>
 * <p><strong>注意：</strong>
 * 一般来说，axisPointer 的具体配置项会配置在各个轴中（如 <a href="#xAxis.axisPointer">xAxis.axisPointer</a>）或者 <code class="codespan">tooltip</code> 中（如 <a href="#tooltip.axisPointer">tooltip.axisPointer</a>）。</p>
 * </blockquote>
 * <blockquote>
 * <p>但是这几个选项只能配置在全局的 axisPointer 中：<a href="#axisPointer.triggerOn">axisPointer.triggerOn</a>、<a href="#axisPointer.link">axisPointer.link</a>。</p>
 * </blockquote>
 * <hr>
 * <p><strong>如何显示 axisPointer：</strong></p>
 * <p>直角坐标系 <a href="#grid">grid</a>、极坐标系 <a href="#polar">polar</a>、单轴坐标系 <a href="#single">single</a> 中的每个轴都自己的 axisPointer。</p>
 * <p>他们的 axisPointer 默认不显示。有两种方法可以让他们显示：</p>
 * <ul>
 * <li><p>设置轴上的 <code class="codespan">axisPointer.show</code>（例如 <a href="#xAxis.axisPointer.show">xAxis.axisPointer.show</a>）为 <code class="codespan">true</code>，则显示此轴的 axisPointer。</p>
 * </li>
 * <li><p>设置 <a href="#tooltip.trigger">tooltip.trigger</a> 设置为 <code class="codespan">&#39;axis&#39;</code> 或者 <a href="#tooltip.axisPointer.type">tooltip.axisPointer.type</a> 设置为 <code class="codespan">&#39;cross&#39;</code>，则此时坐标系会自动选择显示哪个轴的 axisPointer，也可以使用 <a href="#tooltip.axisPointer.axis">tooltip.axisPointer.axis</a> 改变这种选择。注意，轴上如果设置了 axisPointer，会覆盖此设置。</p>
 * </li>
 * </ul>
 * <hr>
 * <p><strong>如何显示 axisPointer 的 label：</strong></p>
 * <p>axisPointer 的 label 默认不显示（也就是默认只显示指示线），除非：</p>
 * <ul>
 * <li><p>设置轴上的 <code class="codespan">axisPointer.label.show</code>（例如 <a href="#xAxis.axisPointer.show">xAxis.axisPointer.label.show</a>）为 <code class="codespan">true</code>，则显示此轴的 axisPointer 的 label。</p>
 * </li>
 * <li><p>设置 <a href="#tooltip.axisPointer.type">tooltip.axisPointer.type</a> 为 <code class="codespan">&#39;cross&#39;</code> 时会自动显示 axisPointer 的 label。</p>
 * </li>
 * </ul>
 * <hr>
 * <p><strong>关于触屏的 axisPointer 的设置</strong></p>
 * <p>设置轴上的 <code class="codespan">axisPointer.handle.show</code>（例如 <a href="#xAxis.axisPointer.handle.show">xAxis.axisPointer.handle.show</a> 为 <code class="codespan">true</code> 则会显示出此 axisPointer 的拖拽按钮。（polar 坐标系暂不支持此功能）。</p>
 * <p><strong>注意：</strong>
 * 如果发现此时 tooltip 效果不良好，可设置 <a href="#tooltip.triggerOn">tooltip.triggerOn</a> 为 <code class="codespan">&#39;none&#39;</code>（于是效果为：手指按住按钮则显示 tooltip，松开按钮则隐藏 tooltip），或者 <a href="#tooltip.alwaysShowContent">tooltip.alwaysShowContent</a> 为 <code class="codespan">true</code>（效果为 tooltip 一直显示）。</p>
 * <p>参见<a href="https://echarts.apache.org/examples/zh/editor.html?c=line-tooltip-touch&amp;edit=1&amp;reset=1" target="_blank">例子</a>。</p>
 * <hr>
 * <p><strong>自动吸附到数据（snap）</strong></p>
 * <p>对于数值轴、时间轴，如果开启了 <a href="#xAxis.axisPointer.snap">snap</a>，则 axisPointer 会自动吸附到最近的点上。</p>
 * <hr>
 * <hr>
 * </iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class AxisPointer implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.id">https://echarts.apache.org/v4/zh/option.html#axisPointer.id</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.show">https://echarts.apache.org/v4/zh/option.html#axisPointer.show</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>默认不显示。但是如果 <a href="#tooltip.trigger">tooltip.trigger</a> 设置为 <code class="codespan">'axis'</code> 或者 <a href="#tooltip.axisPointer.type">tooltip.axisPointer.type</a> 设置为 <code class="codespan">'cross'</code>，则自动显示 axisPointer。坐标系会自动选择显示显示哪个轴的 axisPointer，也可以使用 <a href="#tooltip.axisPointer.axis">tooltip.axisPointer.axis</a> 改变这种选择。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.type">https://echarts.apache.org/v4/zh/option.html#axisPointer.type</a>
     * <br/>序号: 3
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.snap">https://echarts.apache.org/v4/zh/option.html#axisPointer.snap</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>坐标轴指示器是否自动吸附到点上。默认自动判断。</p>
     * <p>这个功能在数值轴和时间轴上比较有意义，可以自动寻找细小的数值点。</p>
     */
    private Boolean snap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.z">https://echarts.apache.org/v4/zh/option.html#axisPointer.z</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴指示器的 z 值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.label">https://echarts.apache.org/v4/zh/option.html#axisPointer.label</a>
     * <br/>序号: 6
     * <br/>默认值: auto
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴指示器的文本标签。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.lineStyle">https://echarts.apache.org/v4/zh/option.html#axisPointer.lineStyle</a>
     * <br/>序号: 7
     * <br/>默认值: #555
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><a href="#tooltip.axisPointer.type">axisPointer.type</a> 为 <code class="codespan">'line'</code> 时有效。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.shadowStyle">https://echarts.apache.org/v4/zh/option.html#axisPointer.shadowStyle</a>
     * <br/>序号: 8
     * <br/>默认值: rgba(150,150,150,0.3)
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><a href="#tooltip.axisPointer.type">axisPointer.type</a> 为 <code class="codespan">'shadow'</code> 时有效。</p>
     */
    private ShadowStyle shadowStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.triggerTooltip">https://echarts.apache.org/v4/zh/option.html#axisPointer.triggerTooltip</a>
     * <br/>序号: 9
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否触发 tooltip。如果不想触发 tooltip 可以关掉。</p>
     */
    private Boolean triggerTooltip;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.value">https://echarts.apache.org/v4/zh/option.html#axisPointer.value</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前的 value。在使用 <a href="xAxisPointer.handle" target="_blank">axisPointer.handle</a> 时，可以设置此值进行初始值设定，从而决定 axisPointer 的初始位置。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.status">https://echarts.apache.org/v4/zh/option.html#axisPointer.status</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>当前的状态，可取值为 <code class="codespan">'show'</code> 和 <code class="codespan">'hide'</code>。</p>
     */
    private Boolean status;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.handle">https://echarts.apache.org/v4/zh/option.html#axisPointer.handle</a>
     * <br/>序号: 12
     * <br/>默认值: 45
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>拖拽手柄，适用于触屏的环境。参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-tooltip-touch&amp;edit=1&amp;reset=1" target="_blank">例子</a>。</p>
     */
    private Handle handle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.link">https://echarts.apache.org/v4/zh/option.html#axisPointer.link</a>
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>不同轴的 axisPointer 可以进行联动，在这里设置。联动表示轴能同步一起活动。轴依据他们的 axisPointer 当前对应的值来联动。</p>
     * <p>联动的效果可以看这两个例子：<a href="https://echarts.apache.org/examples/zh/view.html?c=candlestick-brush&amp;edit=1&amp;reset=1" target="_blank">例子A</a>，<a href="https://echarts.apache.org/examples/zh/view.html?c=scatter-nutrients-matrix&amp;edit=1&amp;reset=1" target="_blank">例子B</a>。</p>
     * <p>link 是一个数组，其中每一项表示一个 link group，一个 group 中的坐标轴互相联动。例如：</p>
     * <pre><code class="lang-js hljs javascript">link: [
     *     {
     *         <span class="hljs-comment">// 表示所有 xAxisIndex 为 0、3、4 和 yAxisName 为 'someName' 的坐标轴联动。</span>
     *         <span class="hljs-attr">xAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">3</span>, <span class="hljs-number">4</span>],
     *         <span class="hljs-attr">yAxisName</span>: <span class="hljs-string">'someName'</span>
     *     },
     *     {
     *         <span class="hljs-comment">// 表示左右 xAxisId 为 'aa'、'cc' 以及所有的 angleAxis 联动。</span>
     *         <span class="hljs-attr">xAxisId</span>: [<span class="hljs-string">'aa'</span>, <span class="hljs-string">'cc'</span>],
     *         <span class="hljs-attr">angleAxis</span>: <span class="hljs-string">'all'</span>
     *     },
     *     ...
     * ]
     * </code></pre>
     * <p>如上所示，每个 link group 中可以用这些方式引用坐标轴：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-comment">// 以下的 'some' 均表示轴的维度，也就是表示 'x', 'y', 'radius', 'angle', 'single'</span>
     *     <span class="hljs-attr">someAxisIndex</span>: [...], <span class="hljs-comment">// 可以是一个数组或单值或 'all'</span>
     *     <span class="hljs-attr">someAxisName</span>: [...],  <span class="hljs-comment">// 可以是一个数组或单值或 'all'</span>
     *     <span class="hljs-attr">someAxisId</span>: [...],    <span class="hljs-comment">// 可以是一个数组或单值或 'all'</span>
     * }
     * </code></pre>
     * <hr>
     * <p><strong>如何联动不同类型（<a href="#xAxis.type">axis.type</a>）的轴？</strong></p>
     * <p>如果 axis 的类型不同，比如 axisA type 为 'category'，axisB type 为 'time'，可以在每个 link group 中写转换函数（mapper）来进行值的转换，例如：</p>
     * <pre><code class="lang-js hljs javascript">link: [{
     *     <span class="hljs-attr">xAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">1</span>],
     *     <span class="hljs-attr">yAxisName</span>: [<span class="hljs-string">'yy'</span>],
     *     <span class="hljs-attr">mapper</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">sourceVal, sourceAxisInfo, targetAxisInfo</span>) </span>{
     *         <span class="hljs-keyword">if</span> (sourceAxisInfo.axisName === <span class="hljs-string">'yy'</span>) {
     *             <span class="hljs-comment">// from timestamp to '2012-02-05'</span>
     *             <span class="hljs-keyword">return</span> echarts.format.formatTime(<span class="hljs-string">'yyyy-MM-dd'</span>, sourceVal);
     *         }
     *         <span class="hljs-keyword">else</span> <span class="hljs-keyword">if</span> (targetAxisInfo.axisName === <span class="hljs-string">'yy'</span>) {
     *             <span class="hljs-comment">// from '2012-02-05' to date</span>
     *             <span class="hljs-keyword">return</span> echarts.number.parseDate(dates[sourceVal]);
     *         }
     *         <span class="hljs-keyword">else</span> {
     *             <span class="hljs-keyword">return</span> sourceVal;
     *         }
     *     }
     * }]
     * </code></pre>
     * <p>mapper 的输入参数：</p>
     * <p><code class="codespan">{number}</code> sourceVal</p>
     * <p><code class="codespan">{Object}</code> sourceAxisInfo 里面包含 {axisDim, axisId, axisName, axisIndex} 等信息</p>
     * <p><code class="codespan">{Object}</code> targetAxisInfo 里面包含 {axisDim, axisId, axisName, axisIndex} 等信息</p>
     * <p>mapper 的返回值：</p>
     * <p><code class="codespan">{number}</code> 转换结果</p>
     */
    private List<?> link;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#axisPointer.triggerOn">https://echarts.apache.org/v4/zh/option.html#axisPointer.triggerOn</a>
     * <br/>序号: 14
     * <br/>默认值: mousemove|click
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>提示框触发的条件，可选：</p>
     * <ul>
     * <li><p><code class="codespan">'mousemove'</code></p>
     * <p>  鼠标移动时触发。</p>
     * </li>
     * <li><p><code class="codespan">'click'</code></p>
     * <p>  鼠标点击时触发。</p>
     * </li>
     * <li><p><code class="codespan">'none'</code></p>
     * <p>  不在 <code class="codespan">'mousemove'</code> 或 <code class="codespan">'click'</code> 时触发。</p>
     * </li>
     * </ul>
     */
    private String triggerOn;
}
