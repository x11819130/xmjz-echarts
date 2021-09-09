package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.funnelSeries.Tooltip;
import com.xmjz.echarts.nativebean.option.funnelSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel">https://echarts.apache.org/v4/zh/option.html#series-funnel</a>
 * <br/>序号: 0
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>漏斗图</strong></p>
 * <p><strong>示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=funnel&amp;reset=1&amp;edit=1" width="600" height="400" data-ll-timeout="19"><iframe />
 *
 *
 *
 * </iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class FunnelSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.type">https://echarts.apache.org/v4/zh/option.html#series-funnel.type</a>
     * <br/>序号: 1
     * <br/>默认值: funnel
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.id">https://echarts.apache.org/v4/zh/option.html#series-funnel.id</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.name">https://echarts.apache.org/v4/zh/option.html#series-funnel.name</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.min">https://echarts.apache.org/v4/zh/option.html#series-funnel.min</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指定的数据最小值。</p>
     */
    private Integer min;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.max">https://echarts.apache.org/v4/zh/option.html#series-funnel.max</a>
     * <br/>序号: 5
     * <br/>默认值: 100
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指定的数据最大值。</p>
     */
    private Integer max;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.minSize">https://echarts.apache.org/v4/zh/option.html#series-funnel.minSize</a>
     * <br/>序号: 6
     * <br/>默认值: 0%
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>数据最小值 <a href="#series-funnel.min">min</a> 映射的宽度。</p>
     * <p>可以是绝对的像素大小，也可以是相对<a href="#series-funnel.width">布局宽度</a>的百分比，如果需要最小值的图形并不是尖端三角，可通过设置该属性实现。</p>
     */
    private Object minSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.maxSize">https://echarts.apache.org/v4/zh/option.html#series-funnel.maxSize</a>
     * <br/>序号: 7
     * <br/>默认值: 100%
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>数据最大值 <a href="#series-funnel.max">max</a> 映射的宽度。</p>
     * <p>可以是绝对的像素大小，也可以是相对<a href="#series-funnel.width">布局宽度</a>的百分比。</p>
     */
    private Object maxSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.orient">https://echarts.apache.org/v4/zh/option.html#series-funnel.orient</a>
     * <br/>序号: 8
     * <br/>默认值: vertical
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>漏斗图朝向，支持配置为<code class="codespan">'vertical'</code>或者<code class="codespan">'horizontal'</code>。</p>
     */
    private String orient;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.sort">https://echarts.apache.org/v4/zh/option.html#series-funnel.sort</a>
     * <br/>序号: 9
     * <br/>默认值: descending
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>数据排序， 可以取 <code class="codespan">'ascending'</code>，<code class="codespan">'descending'</code>，<code class="codespan">'none'</code>（表示按 data 顺序），或者一个函数（即 <code class="codespan">Array.prototype.sort(function (a, b) { ... })</code>）。</p>
     */
    private Object sort;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.gap">https://echarts.apache.org/v4/zh/option.html#series-funnel.gap</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>数据图形间距。</p>
     */
    private Integer gap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.legendHoverLink">https://echarts.apache.org/v4/zh/option.html#series-funnel.legendHoverLink</a>
     * <br/>序号: 11
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否启用<a href="#legend">图例</a> hover 时的联动高亮。</p>
     */
    private Boolean legendHoverLink;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.funnelAlign">https://echarts.apache.org/v4/zh/option.html#series-funnel.funnelAlign</a>
     * <br/>序号: 12
     * <br/>默认值: center
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>水平方向对齐布局类型，默认居中对齐，可用选项还有：'left' | 'right' | 'center'</p>
     */
    private String funnelAlign;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.label">https://echarts.apache.org/v4/zh/option.html#series-funnel.label</a>
     * <br/>序号: 13
     * <br/>默认值: outside
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>漏斗图图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等，<code class="codespan">label</code>选项在 ECharts 2.x 中放置于<code class="codespan">itemStyle</code>下，在 ECharts 3 中为了让整个配置项结构更扁平合理，<code class="codespan">label</code> 被拿出来跟 <code class="codespan">itemStyle</code> 平级，并且跟 <code class="codespan">itemStyle</code> 一样拥有 <code class="codespan">emphasis</code> 状态。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.labelLine">https://echarts.apache.org/v4/zh/option.html#series-funnel.labelLine</a>
     * <br/>序号: 14
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线样式，在 <a href="#series-funnel.label.position">label 位置</a> 设置为<code class="codespan">'left'</code>或者<code class="codespan">'right'</code>的时候会显示视觉引导线。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-funnel.itemStyle</a>
     * <br/>序号: 15
     * <br/>默认值: 自适应
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p> 图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.emphasis">https://echarts.apache.org/v4/zh/option.html#series-funnel.emphasis</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮的标签和图形样式。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.zlevel">https://echarts.apache.org/v4/zh/option.html#series-funnel.zlevel</a>
     * <br/>序号: 17
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.z">https://echarts.apache.org/v4/zh/option.html#series-funnel.z</a>
     * <br/>序号: 18
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.left">https://echarts.apache.org/v4/zh/option.html#series-funnel.left</a>
     * <br/>序号: 19
     * <br/>默认值: 80
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>漏斗图组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.top">https://echarts.apache.org/v4/zh/option.html#series-funnel.top</a>
     * <br/>序号: 20
     * <br/>默认值: 60
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>漏斗图组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.right">https://echarts.apache.org/v4/zh/option.html#series-funnel.right</a>
     * <br/>序号: 21
     * <br/>默认值: 80
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>漏斗图组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.bottom">https://echarts.apache.org/v4/zh/option.html#series-funnel.bottom</a>
     * <br/>序号: 22
     * <br/>默认值: 60
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>漏斗图组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.width">https://echarts.apache.org/v4/zh/option.html#series-funnel.width</a>
     * <br/>序号: 23
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>漏斗图组件的宽度。默认自适应。</p>
     */
    private Object width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.height">https://echarts.apache.org/v4/zh/option.html#series-funnel.height</a>
     * <br/>序号: 24
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>漏斗图组件的高度。默认自适应。</p>
     */
    private Object height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.seriesLayoutBy">https://echarts.apache.org/v4/zh/option.html#series-funnel.seriesLayoutBy</a>
     * <br/>序号: 25
     * <br/>默认值: column
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>当使用 <a href="#dataset">dataset</a> 时，<code class="codespan">seriesLayoutBy</code> 指定了 <code class="codespan">dataset</code> 中用行还是列对应到系列上，也就是说，系列“排布”到 <code class="codespan">dataset</code> 的行还是列上。可取值：</p>
     * <ul>
     * <li>'column'：默认，<code class="codespan">dataset</code> 的列对应于系列，从而 <code class="codespan">dataset</code> 中每一列是一个维度（dimension）。</li>
     * <li>'row'：<code class="codespan">dataset</code> 的行对应于系列，从而 <code class="codespan">dataset</code> 中每一行是一个维度（dimension）。</li>
     * </ul>
     * <p>参见这个 <a href="https://echarts.apache.org/examples/zh/editor.html?c=dataset-series-layout-by&amp;theme=lite" target="_blank">示例</a></p>
     */
    private String seriesLayoutBy;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.datasetIndex">https://echarts.apache.org/v4/zh/option.html#series-funnel.datasetIndex</a>
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果 <a href="#series.data">series.data</a> 没有指定，并且 <a href="#dataset">dataset</a> 存在，那么就会使用 <a href="#dataset">dataset</a>。<code class="codespan">datasetIndex</code> 指定本系列使用那个 <a href="#dataset">dataset</a>。</p>
     */
    private Integer datasetIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.dimensions">https://echarts.apache.org/v4/zh/option.html#series-funnel.dimensions</a>
     * <br/>序号: 27
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>使用 dimensions 定义 <code class="codespan">series.data</code> 或者 <code class="codespan">dataset.source</code> 的每个维度的信息。</p>
     * <p>注意：如果使用了 <a href="#dataset">dataset</a>，那么可以在 <a href="#dataset.source">dataset.source</a> 的第一行/列中给出 dimension 名称。于是就不用在这里指定 dimension。但是，如果在这里指定了 <code class="codespan">dimensions</code>，那么 ECharts 不再会自动从 <code class="codespan">dataset.source</code> 的第一行/列中获取维度信息。</p>
     * <p>例如：</p>
     * <pre><code class="lang-js hljs javascript">option = {
     *     <span class="hljs-attr">dataset</span>: {
     *         <span class="hljs-attr">source</span>: [
     *             <span class="hljs-comment">// 有了上面 dimensions 定义后，下面这五个维度的名称分别为：</span>
     *             <span class="hljs-comment">// 'date', 'open', 'close', 'highest', 'lowest'</span>
     *             [<span class="hljs-number">12</span>, <span class="hljs-number">44</span>, <span class="hljs-number">55</span>, <span class="hljs-number">66</span>, <span class="hljs-number">2</span>],
     *             [<span class="hljs-number">23</span>, <span class="hljs-number">6</span>, <span class="hljs-number">16</span>, <span class="hljs-number">23</span>, <span class="hljs-number">1</span>],
     *             ...
     *         ]
     *     },
     *     <span class="hljs-attr">series</span>: {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'xxx'</span>,
     *         <span class="hljs-comment">// 定义了每个维度的名称。这个名称会被显示到默认的 tooltip 中。</span>
     *         <span class="hljs-attr">dimensions</span>: [<span class="hljs-string">'date'</span>, <span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>]
     *     }
     * }
     * </code></pre>
     * <pre><code class="lang-js hljs javascript">series: {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'xxx'</span>,
     *     <span class="hljs-attr">dimensions</span>: [
     *         <span class="hljs-literal">null</span>,                <span class="hljs-comment">// 如果此维度不想给出定义，则使用 null 即可</span>
     *         {<span class="hljs-attr">type</span>: <span class="hljs-string">'ordinal'</span>},   <span class="hljs-comment">// 只定义此维度的类型。</span>
     *                              <span class="hljs-comment">// 'ordinal' 表示离散型，一般文本使用这种类型。</span>
     *                              <span class="hljs-comment">// 如果类型没有被定义，会自动猜测类型。</span>
     *         {<span class="hljs-attr">name</span>: <span class="hljs-string">'good'</span>, <span class="hljs-attr">type</span>: <span class="hljs-string">'number'</span>},
     *         <span class="hljs-string">'bad'</span>                <span class="hljs-comment">// 等同于 {name: 'bad'}</span>
     *     ]
     * }
     * </code></pre>
     * <p><code class="codespan">dimensions</code> 数组中的每一项可以是：</p>
     * <ul>
     * <li><code class="codespan">string</code>，如 <code class="codespan">'someName'</code>，等同于 <code class="codespan">{name: 'someName'}</code></li>
     * <li><code class="codespan">Object</code>，属性可以有：<ul>
     * <li>name: <code class="codespan">string</code>。</li>
     * <li>type: <code class="codespan">string</code>，支持<ul>
     * <li><code class="codespan">number</code>，默认，表示普通数据。</li>
     * <li><code class="codespan">ordinal</code>，对于类目、文本这些 string 类型的数据，如果需要能在数轴上使用，须是 'ordinal' 类型。ECharts 默认会自动判断这个类型。但是自动判断也是不可能很完备的，所以使用者也可以手动强制指定。</li>
     * <li><code class="codespan">float</code>，即 <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array" target="_blank">Float64Array</a>。</li>
     * <li><code class="codespan">int</code>，即 <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array" target="_blank">Int32Array</a>。</li>
     * <li><code class="codespan">time</code>，表示时间类型。设置成 'time' 则能支持自动解析数据成时间戳（timestamp），比如该维度的数据是 '2017-05-10'，会自动被解析。时间类型的支持参见 <a href="#series.data">data</a>。</li>
     * </ul>
     * </li>
     * <li>displayName: 一般用于 tooltip 中维度名的展示。<code class="codespan">string</code> 如果没有指定，默认使用 name 来展示。</li>
     * </ul>
     * </li>
     * </ul>
     * <p>值得一提的是，当定义了 <code class="codespan">dimensions</code> 后，默认 <code class="codespan">tooltip</code> 中对个维度的显示，会变为『竖排』，从而方便显示每个维度的名称。如果没有定义 <code class="codespan">dimensions</code>，则默认 <code class="codespan">tooltip</code> 会横排显示，且只显示数值没有维度名称可显示。</p>
     */
    private List<?> dimensions;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.encode">https://echarts.apache.org/v4/zh/option.html#series-funnel.encode</a>
     * <br/>序号: 28
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>可以定义 <code class="codespan">data</code> 的哪个维度被编码成什么。比如：</p>
     * <pre><code class="lang-js hljs javascript">option = {
     *     <span class="hljs-attr">dataset</span>: {
     *         <span class="hljs-attr">source</span>: [
     *             <span class="hljs-comment">// 每一列称为一个『维度』。</span>
     *             <span class="hljs-comment">// 这里分别是维度 0、1、2、3、4。</span>
     *             [<span class="hljs-number">12</span>, <span class="hljs-number">44</span>, <span class="hljs-number">55</span>, <span class="hljs-number">66</span>, <span class="hljs-number">2</span>],
     *             [<span class="hljs-number">23</span>, <span class="hljs-number">6</span>, <span class="hljs-number">16</span>, <span class="hljs-number">23</span>, <span class="hljs-number">1</span>],
     *             ...
     *         ]
     *     },
     *     <span class="hljs-attr">series</span>: {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'xxx'</span>,
     *         <span class="hljs-attr">encode</span>: {
     *             <span class="hljs-attr">x</span>: [<span class="hljs-number">3</span>, <span class="hljs-number">1</span>, <span class="hljs-number">5</span>],      <span class="hljs-comment">// 表示维度 3、1、5 映射到 x 轴。</span>
     *             <span class="hljs-attr">y</span>: <span class="hljs-number">2</span>,              <span class="hljs-comment">// 表示维度 2 映射到 y 轴。</span>
     *             <span class="hljs-attr">tooltip</span>: [<span class="hljs-number">3</span>, <span class="hljs-number">2</span>, <span class="hljs-number">4</span>] <span class="hljs-comment">// 表示维度 3、2、4 会在 tooltip 中显示。</span>
     *         }
     *     }
     * }
     * </code></pre>
     * <p>当使用 <a href="#series.dimensions">dimensions</a> 给维度定义名称后，<code class="codespan">encode</code> 中可直接引用名称，例如：</p>
     * <pre><code class="lang-js hljs javascript">series: {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'xxx'</span>,
     *     <span class="hljs-attr">dimensions</span>: [<span class="hljs-string">'date'</span>, <span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>],
     *     <span class="hljs-attr">encode</span>: {
     *         <span class="hljs-attr">x</span>: <span class="hljs-string">'date'</span>,
     *         <span class="hljs-attr">y</span>: [<span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>]
     *     }
     * }
     * </code></pre>
     * <p><code class="codespan">encode</code> 声明的基本结构如下，其中冒号左边是坐标系、标签等特定名称，如 <code class="codespan">'x'</code>, <code class="codespan">'y'</code>, <code class="codespan">'tooltip'</code> 等，冒号右边是数据中的维度名（string 格式）或者维度的序号（number 格式，从 0 开始计数），可以指定一个或多个维度（使用数组）。通常情况下，下面各种信息不需要所有的都写，按需写即可。</p>
     * <p>下面是 encode 支持的属性：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 在任何坐标系和系列中，都支持：</span>
     * <span class="hljs-attr">encode</span>: {
     *     <span class="hljs-comment">// 使用 “名为 product 的维度” 和 “名为 score 的维度” 的值在 tooltip 中显示</span>
     *     <span class="hljs-attr">tooltip</span>: [<span class="hljs-string">'product'</span>, <span class="hljs-string">'score'</span>]
     *     <span class="hljs-comment">// 使用 “维度 1” 和 “维度 3” 的维度名连起来作为系列名。（有时候名字比较长，这可以避免在 series.name 重复输入这些名字）</span>
     *     <span class="hljs-attr">seriesName</span>: [<span class="hljs-number">1</span>, <span class="hljs-number">3</span>],
     *     <span class="hljs-comment">// 表示使用 “维度2” 中的值作为 id。这在使用 setOption 动态更新数据时有用处，可以使新老数据用 id 对应起来，从而能够产生合适的数据更新动画。</span>
     *     <span class="hljs-attr">itemId</span>: <span class="hljs-number">2</span>,
     *     <span class="hljs-comment">// 指定数据项的名称使用 “维度3” 在饼图等图表中有用，可以使这个名字显示在图例（legend）中。</span>
     *     <span class="hljs-attr">itemName</span>: <span class="hljs-number">3</span>
     * }
     *
     * <span class="hljs-comment">// 直角坐标系（grid/cartesian）特有的属性：</span>
     * <span class="hljs-attr">encode</span>: {
     *     <span class="hljs-comment">// 把 “维度1”、“维度5”、“名为 score 的维度” 映射到 X 轴：</span>
     *     <span class="hljs-attr">x</span>: [<span class="hljs-number">1</span>, <span class="hljs-number">5</span>, <span class="hljs-string">'score'</span>],
     *     <span class="hljs-comment">// 把“维度0”映射到 Y 轴。</span>
     *     <span class="hljs-attr">y</span>: <span class="hljs-number">0</span>
     * }
     *
     * <span class="hljs-comment">// 单轴（singleAxis）特有的属性：</span>
     * <span class="hljs-attr">encode</span>: {
     *     <span class="hljs-attr">single</span>: <span class="hljs-number">3</span>
     * }
     *
     * <span class="hljs-comment">// 极坐标系（polar）特有的属性：</span>
     * <span class="hljs-attr">encode</span>: {
     *     <span class="hljs-attr">radius</span>: <span class="hljs-number">3</span>,
     *     <span class="hljs-attr">angle</span>: <span class="hljs-number">2</span>
     * }
     *
     * <span class="hljs-comment">// 地理坐标系（geo）特有的属性：</span>
     * <span class="hljs-attr">encode</span>: {
     *     <span class="hljs-attr">lng</span>: <span class="hljs-number">3</span>,
     *     <span class="hljs-attr">lat</span>: <span class="hljs-number">2</span>
     * }
     *
     * <span class="hljs-comment">// 对于一些没有坐标系的图表，例如饼图、漏斗图等，可以是：</span>
     * <span class="hljs-attr">encode</span>: {
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">3</span>
     * }
     * </code></pre>
     * <p>这是个更丰富的 <code class="codespan">encode</code> 的<a href="https://echarts.apache.org/examples/zh/view.html?c=dataset-encode1&amp;edit=1&amp;reset=1" target="_blank">示例</a>：</p>
     * <p>特殊地，在 <a href="#series-custom">自定义系列（custom series）</a> 中，<code class="codespan">encode</code> 中轴可以不指定或设置为 <code class="codespan">null/undefined</code>，从而使系列免于受这个轴控制，也就是说，轴的范围（extent）不会受此系列数值的影响，轴被 <a href="#dataZoom">dataZoom</a> 控制时也不会过滤掉这个系列：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-keyword">var</span> option = {
     *     <span class="hljs-attr">xAxis</span>: {},
     *     <span class="hljs-attr">yAxis</span>: {},
     *     <span class="hljs-attr">dataZoom</span>: [{
     *         <span class="hljs-attr">xAxisIndex</span>: <span class="hljs-number">0</span>
     *     }, {
     *         <span class="hljs-attr">yAxisIndex</span>: <span class="hljs-number">0</span>
     *     }],
     *     <span class="hljs-attr">series</span>: {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'custom'</span>,
     *         <span class="hljs-attr">renderItem</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">params, api</span>) </span>{
     *             <span class="hljs-keyword">return</span> {
     *                 <span class="hljs-attr">type</span>: <span class="hljs-string">'circle'</span>,
     *                 <span class="hljs-attr">shape</span>: {
     *                     <span class="hljs-attr">cx</span>: <span class="hljs-number">100</span>, <span class="hljs-comment">// x 位置永远为 100</span>
     *                     <span class="hljs-attr">cy</span>: api.coord([<span class="hljs-number">0</span>, api.value(<span class="hljs-number">0</span>)])[<span class="hljs-number">1</span>],
     *                     <span class="hljs-attr">r</span>: <span class="hljs-number">30</span>
     *                 },
     *                 <span class="hljs-attr">style</span>: {
     *                     <span class="hljs-attr">fill</span>: <span class="hljs-string">'blue'</span>
     *                 }
     *             };
     *         },
     *         <span class="hljs-attr">encode</span>: {
     *             <span class="hljs-comment">// 这样这个系列就不会被 x 轴以及 x</span>
     *             <span class="hljs-comment">// 轴上的 dataZoom 控制了。</span>
     *             <span class="hljs-attr">x</span>: <span class="hljs-number">-1</span>,
     *             <span class="hljs-attr">y</span>: <span class="hljs-number">1</span>
     *         },
     *         <span class="hljs-attr">data</span>: [ ... ]
     *     }
     * };
     * </code></pre>
     */
    private Object encode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.data">https://echarts.apache.org/v4/zh/option.html#series-funnel.data</a>
     * <br/>序号: 29
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>系列中的数据内容数组。数组项可以为单个数值，如：</p>
     * <pre><code class="lang-js hljs javascript">[<span class="hljs-number">12</span>, <span class="hljs-number">34</span>, <span class="hljs-number">56</span>, <span class="hljs-number">10</span>, <span class="hljs-number">23</span>]
     * </code></pre>
     * <p>如果需要在数据中加入其它维度给 <a href="#visualMap">visualMap</a> 组件用来映射到颜色等其它图形属性。每个数据项也可以是数组，如：</p>
     * <pre><code class="lang-js hljs javascript">[[<span class="hljs-number">12</span>, <span class="hljs-number">14</span>], [<span class="hljs-number">34</span>, <span class="hljs-number">50</span>], [<span class="hljs-number">56</span>, <span class="hljs-number">30</span>], [<span class="hljs-number">10</span>, <span class="hljs-number">15</span>], [<span class="hljs-number">23</span>, <span class="hljs-number">10</span>]]
     * </code></pre>
     * <p>这时候可以将每项数组中的第二个值指定给 <a href="#visualMap">visualMap</a> 组件。</p>
     * <p>更多时候我们需要指定每个数据项的名称，这时候需要每个项为一个对象：</p>
     * <pre><code class="lang-js hljs javascript">[{
     *     <span class="hljs-comment">// 数据项的名称</span>
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'数据1'</span>,
     *     <span class="hljs-comment">// 数据项值8</span>
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">10</span>
     * }, {
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'数据2'</span>,
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">20</span>
     * }]
     * </code></pre>
     * <p>需要对个别内容指定进行个性化定义时：</p>
     * <pre><code class="lang-js hljs javascript">[{
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'数据1'</span>,
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">10</span>
     * }, {
     *     <span class="hljs-comment">// 数据项名称</span>
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'数据2'</span>,
     *     <span class="hljs-attr">value</span> : <span class="hljs-number">56</span>,
     *     <span class="hljs-comment">//自定义特殊 tooltip，仅对该数据项有效</span>
     *     <span class="hljs-attr">tooltip</span>:{},
     *     <span class="hljs-comment">//自定义特殊itemStyle，仅对该item有效</span>
     *     <span class="hljs-attr">itemStyle</span>:{}
     * }]
     * </code></pre>
     */
    private List<Data> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.markPoint">https://echarts.apache.org/v4/zh/option.html#series-funnel.markPoint</a>
     * <br/>序号: 30
     * <br/>默认值: pin
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标注。</p>
     */
    private MarkPoint markPoint;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.markLine">https://echarts.apache.org/v4/zh/option.html#series-funnel.markLine</a>
     * <br/>序号: 31
     * <br/>默认值: 2
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标线。</p>
     */
    private MarkLine markLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.markArea">https://echarts.apache.org/v4/zh/option.html#series-funnel.markArea</a>
     * <br/>序号: 32
     * <br/>默认值: 2000
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。</p>
     */
    private MarkArea markArea;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.silent">https://echarts.apache.org/v4/zh/option.html#series-funnel.silent</a>
     * <br/>序号: 33
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.animation">https://echarts.apache.org/v4/zh/option.html#series-funnel.animation</a>
     * <br/>序号: 34
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.animationThreshold">https://echarts.apache.org/v4/zh/option.html#series-funnel.animationThreshold</a>
     * <br/>序号: 35
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.animationDuration">https://echarts.apache.org/v4/zh/option.html#series-funnel.animationDuration</a>
     * <br/>序号: 36
     * <br/>默认值: 1000
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>初始动画的时长，支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的初始动画效果：</p>
     * <pre><code class="lang-js hljs javascript">animationDuration: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDuration;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.animationEasing">https://echarts.apache.org/v4/zh/option.html#series-funnel.animationEasing</a>
     * <br/>序号: 37
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.animationDelay">https://echarts.apache.org/v4/zh/option.html#series-funnel.animationDelay</a>
     * <br/>序号: 38
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>初始动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的初始动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-js hljs javascript">animationDelay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.animationDurationUpdate">https://echarts.apache.org/v4/zh/option.html#series-funnel.animationDurationUpdate</a>
     * <br/>序号: 39
     * <br/>默认值: 300
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的时长。</p>
     * <p>支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的更新动画效果：</p>
     * <pre><code class="lang-js hljs javascript">animationDurationUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDurationUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.animationEasingUpdate">https://echarts.apache.org/v4/zh/option.html#series-funnel.animationEasingUpdate</a>
     * <br/>序号: 40
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.animationDelayUpdate">https://echarts.apache.org/v4/zh/option.html#series-funnel.animationDelayUpdate</a>
     * <br/>序号: 41
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-js hljs javascript">animationDelayUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelayUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-funnel.tooltip">https://echarts.apache.org/v4/zh/option.html#series-funnel.tooltip</a>
     * <br/>序号: 42
     * <br/>默认值: rgba(50,50,50,0.7)
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
