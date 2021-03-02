package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.timeline.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline">https://echarts.apache.org/zh/option.html#timeline</a>
 * <br/>序号: 20
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p><code class="codespan">timeline</code> 组件，提供了在多个 ECharts <code class="codespan">option</code> 间进行切换、播放等操作的功能。</p>
 * <p>示例效果如下：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/mix-timeline-all&amp;edit=1&amp;reset=1" width="600" height="400" data-ll-timeout="18"></iframe>
 *
 *
 * <p><code class="codespan">timeline</code> 和其他场景有些不同，它需要操作『多个option』。我们把传入 <code class="codespan">setOption</code> 第一个参数的东西，称为 <code class="codespan">ECOption</code>，然后称传统的 ECharts 单个 option 为 <code class="codespan">ECUnitOption</code>。</p>
 * <ul>
 * <li>当 <code class="codespan">timeline</code> 和 <code class="codespan">media query</code> 没有被设置时，一个 <code class="codespan">ECUnitOption</code> 就是一个 <code class="codespan">ECOption</code>。</li>
 * <li>当 <code class="codespan">timeline</code> 或 <code class="codespan">media query</code> 被使用设置时，一个 <code class="codespan">ECOption</code> 由几个 <code class="codespan">ECUnitOption</code> 组成。<ul>
 * <li><code class="codespan">ECOption</code> 的各个根属性，形成一个 <code class="codespan">ECUnitOption</code>，叫做 <code class="codespan">baseOption</code>，它代表了各种默认设置。</li>
 * <li><code class="codespan">options</code> 数组每项，形成一个 <code class="codespan">ECUnitOption</code>，我们为了方便也叫做 <code class="codespan">switchableOption</code>，它代表了每个时间粒度对应的 option。</li>
 * </ul>
 * </li>
 * <li><code class="codespan">baseOption</code> 和一个 <code class="codespan">switchableOption</code> 会用来计算最终的 <code class="codespan">finalOption</code>，图表就是根据这个最终结果绘制的。</li>
 * </ul>
 * <p>例如：</p>
 * <pre><code class="lang-javascript hljs"><span class="hljs-comment">// 如下，baseOption 是一个 『原子option』，options 数组</span>
 * <span class="hljs-comment">// 中的每一项也是一个 『原子option』。</span>
 * <span class="hljs-comment">// 每个『原子option』中就是本文档中描述的各种配置项。</span>
 * myChart.setOption({
 *     <span class="hljs-comment">// `baseOption` 的属性.</span>
 *     <span class="hljs-attr">timeline</span>: {
 *         ...,
 *         <span class="hljs-comment">// `timeline.data` 中的每一项，对应于 `options`</span>
 *         <span class="hljs-comment">// 数组中的每个 `option`</span>
 *         <span class="hljs-attr">data</span>: [<span class="hljs-string">'2002-01-01'</span>, <span class="hljs-string">'2003-01-01'</span>, <span class="hljs-string">'2004-01-01'</span>]
 *     },
 *     <span class="hljs-attr">grid</span>: { ... },
 *     <span class="hljs-attr">xAxis</span>: [ ... ],
 *     <span class="hljs-attr">yAxis</span>: [ ... ],
 *     <span class="hljs-attr">series</span>: [{
 *         <span class="hljs-comment">// 系列一的一些其他配置</span>
 *         <span class="hljs-attr">type</span>: <span class="hljs-string">'bar'</span>,
 *         ...
 *     }, {
 *         <span class="hljs-comment">// 系列二的一些其他配置</span>
 *         <span class="hljs-attr">type</span>: <span class="hljs-string">'line'</span>,
 *         ...
 *     }, {
 *         <span class="hljs-comment">// 系列三的一些其他配置</span>
 *         <span class="hljs-attr">type</span>: <span class="hljs-string">'pie'</span>,
 *         ...
 *     }],
 *     <span class="hljs-comment">// `switchableOption`s:</span>
 *     <span class="hljs-attr">options</span>: [{
 *         <span class="hljs-comment">// 这是'2002-01-01' 对应的 option</span>
 *         <span class="hljs-attr">title</span>: {
 *             <span class="hljs-attr">text</span>: <span class="hljs-string">'2002年统计值'</span>
 *         },
 *         <span class="hljs-attr">series</span>: [
 *             { <span class="hljs-attr">data</span>: [] }, <span class="hljs-comment">// 系列一的数据</span>
 *             { <span class="hljs-attr">data</span>: [] }, <span class="hljs-comment">// 系列二的数据</span>
 *             { <span class="hljs-attr">data</span>: [] }  <span class="hljs-comment">// 系列三的数据</span>
 *         ]
 *     }, {
 *         <span class="hljs-comment">// 这是'2003-01-01' 对应的 option</span>
 *         <span class="hljs-attr">title</span>: {
 *             <span class="hljs-attr">text</span>: <span class="hljs-string">'2003年统计值'</span>
 *         },
 *         <span class="hljs-attr">series</span>: [
 *             { <span class="hljs-attr">data</span>: [] },
 *             { <span class="hljs-attr">data</span>: [] },
 *             { <span class="hljs-attr">data</span>: [] }
 *         ]
 *     }, {
 *         <span class="hljs-comment">// 这是'2004-01-01' 对应的 option</span>
 *         <span class="hljs-attr">title</span>: {
 *             <span class="hljs-attr">text</span>: <span class="hljs-string">'2004年统计值'</span>
 *         },
 *         <span class="hljs-attr">series</span>: [
 *             { <span class="hljs-attr">data</span>: [] },
 *             { <span class="hljs-attr">data</span>: [] },
 *             { <span class="hljs-attr">data</span>: [] }
 *         ]
 *     }]
 * });
 * </code></pre>
 * <p><br>
 * <strong><code class="codespan">finalOption</code> 是怎么计算出来的?</strong></p>
 * <p>初始化的时候，对应于当前时间的那个 <code class="codespan">switchableOption</code> 会被合并（merge）到 <code class="codespan">baseOption</code>，形成 <code class="codespan">finalOption</code>。而每当时间变化时，对应于新时间的 <code class="codespan">switchableOption</code> 会被合并（merge）到<code class="codespan">finalOption</code>。</p>
 * <p>有两种合并（merge）策略：</p>
 * <ul>
 * <li>默认使用 <code class="codespan">NORMAL_MERGE</code>。</li>
 * <li>如果 <a href="#option.html#timeline.replaceMerge">timeline.replaceMerge</a> 被指定了，则使用 <code class="codespan">REPLACE_MERGE</code>。如果要知道 <code class="codespan">REPLACE_MERGE</code> 更多信息，可以参见 <a href="#api.html#echartsInstance.setOption">setOption</a> 中 <code class="codespan">REPLACE_MERGE</code> 一节。
 * 。</li>
 * </ul>
 * <p><br>
 * <strong>兼容 ECharts4</strong></p>
 * <p>如下这种设置方式，也支持：</p>
 * <pre><code class="lang-js hljs javascript">option = {
 *     <span class="hljs-attr">baseOption</span>: {
 *         <span class="hljs-attr">timeline</span>: {},
 *         <span class="hljs-attr">series</span>: [],
 *         <span class="hljs-comment">// ... other properties of baseOption.</span>
 *     },
 *     <span class="hljs-attr">options</span>: []
 * };
 * </code></pre>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Timeline implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.show">https://echarts.apache.org/zh/option.html#timeline.show</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示 <code class="codespan">timeline</code> 组件。如果设置为<code class="codespan">false</code>，不会显示，但是功能还存在。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.type">https://echarts.apache.org/zh/option.html#timeline.type</a>
     * <br/>序号: 2
     * <br/>默认值: slider
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>这个属性目前只支持为 <code class="codespan">slider</code>，不需要更改。</p>
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.axisType">https://echarts.apache.org/zh/option.html#timeline.axisType</a>
     * <br/>序号: 3
     * <br/>默认值: time
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>轴的类型。可选值为：</p>
     * <ul>
     * <li><p><code class="codespan">'value'</code>
     *   数值轴，适用于连续数据。</p>
     * </li>
     * <li><p><code class="codespan">'category'</code>
     *   类目轴，适用于离散的类目数据。</p>
     * </li>
     * <li><p><code class="codespan">'time'</code>
     *   时间轴，适用于连续的时序数据，与数值轴相比时间轴带有时间的格式化，在刻度计算上也有所不同，例如会根据跨度的范围来决定使用月，星期，日还是小时范围的刻度。</p>
     * </li>
     * </ul>
     */
    private String axisType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.currentIndex">https://echarts.apache.org/zh/option.html#timeline.currentIndex</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>表示当前选中项是哪项。比如，<code class="codespan">currentIndex</code> 为 <code class="codespan">0</code> 时，表示当前选中项为 <code class="codespan">timeline.data[0]</code>（即使用 <code class="codespan">options[0]</code>）。</p>
     */
    private Integer currentIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.autoPlay">https://echarts.apache.org/zh/option.html#timeline.autoPlay</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>表示是否自动播放。</p>
     */
    private Boolean autoPlay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.rewind">https://echarts.apache.org/zh/option.html#timeline.rewind</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>表示是否反向播放。</p>
     */
    private Boolean rewind;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.loop">https://echarts.apache.org/zh/option.html#timeline.loop</a>
     * <br/>序号: 7
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>表示是否循环播放。</p>
     */
    private Boolean loop;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.playInterval">https://echarts.apache.org/zh/option.html#timeline.playInterval</a>
     * <br/>序号: 8
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>表示播放的速度（跳动的间隔），单位毫秒（ms）。</p>
     */
    private Integer playInterval;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.realtime">https://echarts.apache.org/zh/option.html#timeline.realtime</a>
     * <br/>序号: 9
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>拖动圆点的时候，是否实时更新视图。</p>
     */
    private Boolean realtime;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.replaceMerge">https://echarts.apache.org/zh/option.html#timeline.replaceMerge</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["Array","string"]
     * <br/>描述:
     * <p>初始化的时候，对应于当前时间的那个 <code class="codespan">switchableOption</code> 会被合并（merge）到 <code class="codespan">baseOption</code>，形成 <code class="codespan">finalOption</code>。而每当时间变化时，对应于新时间的 <code class="codespan">switchableOption</code> 会被合并（merge）到<code class="codespan">finalOption</code>。</p>
     * <p>有两种合并（merge）策略：</p>
     * <ul>
     * <li>默认使用 <code class="codespan">NORMAL_MERGE</code>。</li>
     * <li>如果 <a href="#option.html#timeline.replaceMerge">timeline.replaceMerge</a> 被指定了，则使用 <code class="codespan">REPLACE_MERGE</code>。如果要知道 <code class="codespan">REPLACE_MERGE</code> 更多信息，可以参见 <a href="#api.html#echartsInstance.setOption">setOption</a> 中 <code class="codespan">REPLACE_MERGE</code> 一节。
     * 。</li>
     * </ul>
     * <p><br></p>
     * <p><code class="codespan">replaceMerge</code> 的值可以是一个组件的 <code class="codespan">mainType</code>，例如 <code class="codespan">replaceMerge: 'xAxis'</code>。也可以是 <code class="codespan">mainType</code> 数组，例如 <code class="codespan">replaceMerge: ['xAxis', 'series']</code>。</p>
     * <p>常见需要使用 <code class="codespan">replaceMerge</code> 的地方是，如果需要下一个时间刻度的 series 完全替换上一个时间刻度的 series 而不进行任何 merge ，可以设置 <code class="codespan">replaceMerge: 'series'</code>，并且两个时间刻度的 series id 不相同或者没有 id 。</p>
     * <p>参见这个 <a href="https://echarts.apache.org/examples/zh/editor.html?c=doc-example/timeline-dynamic-series&amp;edit=1&amp;reset=1" target="_blank">示例</a>。</p>
     */
    private Object replaceMerge;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.controlPosition">https://echarts.apache.org/zh/option.html#timeline.controlPosition</a>
     * <br/>序号: 11
     * <br/>默认值: left
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>表示『播放』按钮的位置。可选值：<code class="codespan">'left'</code>、<code class="codespan">'right'</code>。</p>
     */
    private String controlPosition;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.zlevel">https://echarts.apache.org/zh/option.html#timeline.zlevel</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.z">https://echarts.apache.org/zh/option.html#timeline.z</a>
     * <br/>序号: 13
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.left">https://echarts.apache.org/zh/option.html#timeline.left</a>
     * <br/>序号: 14
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>timeline组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.top">https://echarts.apache.org/zh/option.html#timeline.top</a>
     * <br/>序号: 15
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>timeline组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.right">https://echarts.apache.org/zh/option.html#timeline.right</a>
     * <br/>序号: 16
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>timeline组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.bottom">https://echarts.apache.org/zh/option.html#timeline.bottom</a>
     * <br/>序号: 17
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>timeline组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.padding">https://echarts.apache.org/zh/option.html#timeline.padding</a>
     * <br/>序号: 18
     * <br/>默认值: 5
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>timeline内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距。</p>
     * <p>使用示例：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 设置内边距为 5</span>
     * <span class="hljs-attr">padding</span>: <span class="hljs-number">5</span>
     * <span class="hljs-comment">// 设置上下的内边距为 5，左右的内边距为 10</span>
     * <span class="hljs-attr">padding</span>: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>]
     * <span class="hljs-comment">// 分别设置四个方向的内边距</span>
     * <span class="hljs-attr">padding</span>: [
     *     <span class="hljs-number">5</span>,  <span class="hljs-comment">// 上</span>
     *     <span class="hljs-number">10</span>, <span class="hljs-comment">// 右</span>
     *     <span class="hljs-number">5</span>,  <span class="hljs-comment">// 下</span>
     *     <span class="hljs-number">10</span>, <span class="hljs-comment">// 左</span>
     * ]
     * </code></pre>
     */
    private Object padding;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.orient">https://echarts.apache.org/zh/option.html#timeline.orient</a>
     * <br/>序号: 19
     * <br/>默认值: horizontal
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>摆放方式，可选值有：</p>
     * <ul>
     * <li><code class="codespan">'vertical'</code>：竖直放置。</li>
     * <li><code class="codespan">'horizontal'</code>：水平放置。</li>
     * </ul>
     */
    private String orient;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.inverse">https://echarts.apache.org/zh/option.html#timeline.inverse</a>
     * <br/>序号: 20
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <ul>
     * <li>是否反向放置 <code class="codespan">timeline</code>，反向则首位颠倒过来。</li>
     * </ul>
     */
    private Boolean inverse;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.symbol">https://echarts.apache.org/zh/option.html#timeline.symbol</a>
     * <br/>序号: 21
     * <br/>默认值: emptyCircle
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>timeline标记的图形。</p>
     * <p>ECharts 提供的标记类型包括</p>
     * <p><code class="codespan">'circle'</code>, <code class="codespan">'rect'</code>, <code class="codespan">'roundRect'</code>, <code class="codespan">'triangle'</code>, <code class="codespan">'diamond'</code>, <code class="codespan">'pin'</code>, <code class="codespan">'arrow'</code>, <code class="codespan">'none'</code></p>
     * <p>可以通过 <code class="codespan">'image://url'</code> 设置为图片，其中 URL 为图片的链接，或者 <code class="codespan">dataURI</code>。</p>
     * <p>URL 为图片链接例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://http://xxx.xxx.xxx/a/b.png'</span>
     * </code></pre><p>URL 为 <code class="codespan">dataURI</code> 例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://data:image/gif;base64,R0lGODlhEAAQAMQAAORHHOVSKudfOulrSOp3WOyDZu6QdvCchPGolfO0o/XBs/fNwfjZ0frl3/zy7////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAkAABAALAAAAAAQABAAAAVVICSOZGlCQAosJ6mu7fiyZeKqNKToQGDsM8hBADgUXoGAiqhSvp5QAnQKGIgUhwFUYLCVDFCrKUE1lBavAViFIDlTImbKC5Gm2hB0SlBCBMQiB0UjIQA7'</span>
     * </code></pre><p>可以通过 <code class="codespan">'path://'</code> 将图标设置为任意的矢量路径。这种方式相比于使用图片的方式，不用担心因为缩放而产生锯齿或模糊，而且可以设置为任意颜色。路径图形会自适应调整为合适的大小。路径的格式参见 <a href="http://www.w3.org/TR/SVG/paths.html#PathData" target="_blank">SVG PathData</a>。可以从 Adobe Illustrator 等工具编辑导出。</p>
     * <p>例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'path://M30.9,53.2C16.8,53.2,5.3,41.7,5.3,27.6S16.8,2,30.9,2C45,2,56.4,13.5,56.4,27.6S45,53.2,30.9,53.2z M30.9,3.5C17.6,3.5,6.8,14.4,6.8,27.6c0,13.3,10.8,24.1,24.101,24.1C44.2,51.7,55,40.9,55,27.6C54.9,14.4,44.1,3.5,30.9,3.5z M36.9,35.8c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H36c0.5,0,0.9,0.4,0.9,1V35.8z M27.8,35.8 c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H27c0.5,0,0.9,0.4,0.9,1L27.8,35.8L27.8,35.8z'</span>
     * </code></pre>
     */
    private String symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.symbolSize">https://echarts.apache.org/zh/option.html#timeline.symbolSize</a>
     * <br/>序号: 22
     * <br/>默认值: 10
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>timeline标记的大小，可以设置成诸如 <code class="codespan">10</code> 这样单一的数字，也可以用数组分开表示宽和高，例如 <code class="codespan">[20, 10]</code> 表示标记宽为<code class="codespan">20</code>，高为<code class="codespan">10</code>。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.symbolRotate">https://echarts.apache.org/zh/option.html#timeline.symbolRotate</a>
     * <br/>序号: 23
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>timeline标记的旋转角度（而非弧度）。正值表示逆时针旋转。注意在 <code class="codespan">markLine</code> 中当 <code class="codespan">symbol</code> 为 <code class="codespan">'arrow'</code> 时会忽略 <code class="codespan">symbolRotate</code> 强制设置为切线的角度。</p>
     */
    private Integer symbolRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.symbolKeepAspect">https://echarts.apache.org/zh/option.html#timeline.symbolKeepAspect</a>
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>如果 <code class="codespan">symbol</code> 是 <code class="codespan">path://</code> 的形式，是否在缩放时保持该图形的长宽比。</p>
     */
    private Boolean symbolKeepAspect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.symbolOffset">https://echarts.apache.org/zh/option.html#timeline.symbolOffset</a>
     * <br/>序号: 25
     * <br/>默认值: [0,0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>timeline标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。</p>
     * <p>例如 <code class="codespan">[0, '50%']</code> 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。</p>
     */
    private List<Object> symbolOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.lineStyle">https://echarts.apache.org/zh/option.html#timeline.lineStyle</a>
     * <br/>序号: 26
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.label">https://echarts.apache.org/zh/option.html#timeline.label</a>
     * <br/>序号: 27
     * <br/>默认值: auto
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>轴的文本标签。<code class="codespan">emphasis</code> 是文本高亮的样式，比如鼠标悬浮或者图例联动高亮的时候会使用 <code class="codespan">emphasis</code> 作为文本的样式。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.itemStyle">https://echarts.apache.org/zh/option.html#timeline.itemStyle</a>
     * <br/>序号: 28
     * <br/>默认值: #A4B1D7
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>timeline  图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle</a>
     * <br/>序号: 29
     * <br/>默认值: circle
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>『当前项』（<code class="codespan">checkpoint</code>）的图形样式。</p>
     */
    private CheckpointStyle checkpointStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.controlStyle">https://echarts.apache.org/zh/option.html#timeline.controlStyle</a>
     * <br/>序号: 30
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>『控制按钮』的样式。『控制按钮』包括：『播放按钮』、『前进按钮』、『后退按钮』。</p>
     */
    private ControlStyle controlStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.progress">https://echarts.apache.org/zh/option.html#timeline.progress</a>
     * <br/>序号: 31
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>进度条中的线条，拐点，标签的样式。</p>
     */
    private Progress progress;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.emphasis">https://echarts.apache.org/zh/option.html#timeline.emphasis</a>
     * <br/>序号: 32
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.data">https://echarts.apache.org/zh/option.html#timeline.data</a>
     * <br/>序号: 33
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p><code class="codespan">timeline</code> 数据。<code class="codespan">Array</code> 的每一项，可以是直接的数值。
     * 如果需要对每个数据项单独进行样式定义，则数据项写成 <code class="codespan">Object</code>。<code class="codespan">Object</code>中，<code class="codespan">value</code>属性为数值。其他属性如下例子，可以覆盖 <code class="codespan">timeline</code> 中的属性配置。</p>
     * <p>如下例：</p>
     * <pre><code class="lang-javascript hljs">[
     *     <span class="hljs-string">'2002-01-01'</span>,
     *     <span class="hljs-string">'2003-01-01'</span>,
     *     <span class="hljs-string">'2004-01-01'</span>,
     *     {
     *         <span class="hljs-attr">value</span>: <span class="hljs-string">'2005-01-01'</span>,
     *         <span class="hljs-attr">tooltip</span>: {          <span class="hljs-comment">// 让鼠标悬浮到此项时能够显示 `tooltip`。</span>
     *             <span class="hljs-attr">formatter</span>: <span class="hljs-string">'{b} xxxx'</span>
     *         },
     *         <span class="hljs-attr">symbol</span>: <span class="hljs-string">'diamond'</span>,  <span class="hljs-comment">// 此项的图形的特别设置。</span>
     *         <span class="hljs-attr">symbolSize</span>: <span class="hljs-number">16</span>      <span class="hljs-comment">// 此项的图形大小的特别设置。</span>
     *     },
     *     <span class="hljs-string">'2006-01-01'</span>,
     *     <span class="hljs-string">'2007-01-01'</span>,
     *     <span class="hljs-string">'2008-01-01'</span>,
     *     <span class="hljs-string">'2009-01-01'</span>,
     *     <span class="hljs-string">'2010-01-01'</span>,
     *     {
     *         <span class="hljs-attr">value</span>: <span class="hljs-string">'2011-01-01'</span>,
     *         <span class="hljs-attr">tooltip</span>: {          <span class="hljs-comment">// 让鼠标悬浮到此项时能够显示 `tooltip`。</span>
     *             <span class="hljs-attr">formatter</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">params</span>) </span>{
     *                 <span class="hljs-keyword">return</span> params.name + <span class="hljs-string">'xxxx'</span>;
     *             }
     *         },
     *         <span class="hljs-attr">symbol</span>: <span class="hljs-string">'diamond'</span>,
     *         <span class="hljs-attr">symbolSize</span>: <span class="hljs-number">18</span>
     *     },
     * ]
     * </code></pre>
     */
    private List<Object> data;
}
