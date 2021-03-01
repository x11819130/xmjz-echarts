package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.sunburstSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst">https://echarts.apache.org/zh/option.html#series-sunburst</a>
 * <br/>序号: 0
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><a href="https://en.wikipedia.org/wiki/Pie_chart#Ring_chart_/_Sunburst_chart_/_Multilevel_pie_chart" target="_blank">旭日图（Sunburst）</a>由多层的环形图组成，在数据结构上，内圈是外圈的父节点。因此，它既能像<a href="#series-pie">饼图</a>一样表现局部和整体的占比，又能像<a href="#series-treemap">矩形树图</a>一样表现层级关系。</p>
 * <p><strong>示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=sunburst-monochrome&amp;edit=1&amp;reset=1" width="700" height="500" data-ll-timeout="17"></iframe>
 * <p>
 * <p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=sunburst-drink&amp;edit=1&amp;reset=1" width="700" height="700" data-ll-timeout="18"></iframe>
 *
 *
 * <p><strong>数据下钻</strong></p>
 * <p>旭日图默认支持数据下钻，也就是说，当用户点击了某个扇形块之后，将会以该节点作为根结点显示，并且在中间出现一个返回上层节点的圆。如果不希望有数据下钻功能，可以通过将 <a href="#series-treemap.nodeClick">series-sunburst.nodeClick</a> 设置为 <code class="codespan">false</code> 实现。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class SunburstSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.type
     * <br/>序号: 1
     * <br/>默认值: sunburst
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.id
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.name
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.zlevel
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.z
     * <br/>序号: 5
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.center
     * <br/>序号: 6
     * <br/>默认值: ["50%","50%"]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>旭日图的中心（圆心）坐标，数组的第一项是横坐标，第二项是纵坐标。</p>
     * <p>支持设置成百分比，设置成百分比时第一项是相对于容器宽度，第二项是相对于容器高度。</p>
     * <p><strong>使用示例：</strong></p>
     * <pre><code class="hljs javascript"><span class="hljs-comment">// 设置成绝对的像素值</span>
     * <span class="hljs-attr">center</span>: [<span class="hljs-number">400</span>, <span class="hljs-number">300</span>]
     * <span class="hljs-comment">// 设置成相对的百分比</span>
     * <span class="hljs-attr">center</span>: [<span class="hljs-string">'50%'</span>, <span class="hljs-string">'50%'</span>]
     * </code></pre>
     */
    private List<Object> center;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.radius
     * <br/>序号: 7
     * <br/>默认值: [0,"75%"]
     * <br/>js类型: ["number","string","Array"]
     * <br/>描述:
     * <p>旭日图的半径。可以为如下类型：</p>
     * <ul>
     * <li><code class="codespan">number</code>：直接指定外半径值。</li>
     * <li><code class="codespan">string</code>：例如，<code class="codespan">'20%'</code>，表示外半径为可视区尺寸（容器高宽中较小一项）的 20% 长度。</li>
     * </ul>
     * <ul>
     * <li><code class="codespan">Array.&lt;number|string&gt;</code>：数组的第一项是内半径，第二项是外半径。每一项遵从上述 <code class="codespan">number</code> <code class="codespan">string</code> 的描述。</li>
     * </ul>
     */
    private Object radius;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.data
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p><a href="#series-sunburst.data">series-sunburst.data</a> 的数据格式是树状的，例如：</p>
     * <pre><code class="lang-js hljs javascript">[{
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'parent1'</span>,
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">10</span>,          <span class="hljs-comment">// 可以不写父元素的 value，则为子元素之和；</span>
     *                         <span class="hljs-comment">// 如果写了，并且大于子元素之和，可以用来表示还有其他子元素未显示</span>
     *     <span class="hljs-attr">children</span>: [{
     *         <span class="hljs-attr">value</span>: <span class="hljs-number">5</span>,
     *         <span class="hljs-attr">name</span>: <span class="hljs-string">'child1'</span>,
     *         <span class="hljs-attr">children</span>: [{
     *             <span class="hljs-attr">value</span>: <span class="hljs-number">2</span>,
     *             <span class="hljs-attr">name</span>: <span class="hljs-string">'grandchild1'</span>,
     *             <span class="hljs-attr">itemStyle</span>: {
     *                 <span class="hljs-comment">// 每个数据可以有自己的样式，覆盖 series.itemStyle 和 level.itemStyle</span>
     *             },
     *             <span class="hljs-attr">label</span>: {
     *                 <span class="hljs-comment">// 标签样式，同上</span>
     *             }
     *         }]
     *     }, {
     *         <span class="hljs-attr">value</span>: <span class="hljs-number">3</span>,
     *         <span class="hljs-attr">name</span>: <span class="hljs-string">'child2'</span>
     *     }],
     *     <span class="hljs-attr">itemStyle</span>: {
     *         <span class="hljs-comment">// parent1 的图形样式，不会被后代继承</span>
     *     },
     *     <span class="hljs-attr">label</span>: {
     *         <span class="hljs-comment">// parent1 的标签样式，不会被后代继承</span>
     *     }
     * }, {
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'parent2'</span>,
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">4</span>
     * }]
     * </code></pre>
     */
    private List<Object> data;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.labelLayout
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["Object","Function"]
     * <br/>描述:
     */
    private Object labelLayout;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.label
     * <br/>序号: 10
     * <br/>默认值: radial
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了每个扇形块中，文本标签的样式。</p>
     * <p><strong>优先级：<a href="#series-sunburst.data.label">series.data.label</a> &gt; <a href="#series-sunburst.levels.label">series.levels.label</a> &gt; <a href="#series-sunburst.label">series.label</a>。</strong></p>
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.labelLine
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.itemStyle
     * <br/>序号: 12
     * <br/>默认值: 自适应
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>旭日图扇形块的样式。</p>
     * <p>可以在 <a href="#series-sunburst.itemStyle">series.itemStyle</a> 定义所有扇形块的样式，也可以在 <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> 定义每一层扇形块的样式，还可以在 <a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a> 定义每个扇形块单独的样式，这三者的优先级从低到高。也就是说，如果定义了 <a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a>，将会覆盖 <a href="#series-sunburst.itemStyle">series.itemStyle</a> 和 <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a>。</p>
     * <p><strong>优先级：<a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a> &gt; <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> &gt; <a href="#series-sunburst.itemStyle">series.itemStyle</a>。</strong></p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.nodeClick
     * <br/>序号: 13
     * <br/>默认值: rootToNode
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>点击节点后的行为。可取值为：</p>
     * <ul>
     * <li><code class="codespan">false</code>：节点点击无反应。</li>
     * <li><code class="codespan">'rootToNode'</code>：点击节点后以该节点为根结点。</li>
     * <li><code class="codespan">'link'</code>：如果节点数据中有 <a href="#series-sunburst.data.link">link</a> 点击节点后会进行超链接跳转。</li>
     * </ul>
     */
    private Object nodeClick;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.sort
     * <br/>序号: 14
     * <br/>默认值: desc
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>扇形块根据数据 <a href="#series-sunburst.data.value"><code class="codespan">value</code></a> 的排序方式，如果未指定 <code class="codespan">value</code>，则其值为子元素 <code class="codespan">value</code> 之和。默认值 <code class="codespan">'desc'</code> 表示降序排序；还可以设置为 <code class="codespan">'asc'</code> 表示升序排序；<code class="codespan">null</code> 表示不排序，使用原始数据的顺序；或者用回调函数进行排列：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-function"><span class="hljs-keyword">function</span>(<span class="hljs-params">nodeA, nodeB</span>) </span>{
     *     <span class="hljs-keyword">return</span> nodeA.getValue() - nodeB.getValue();
     * }
     * </code></pre>
     */
    private Object sort;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.renderLabelForZeroData
     * <br/>序号: 15
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>如果数据没有 <code class="codespan">name</code>，是否需要渲染文字。</p>
     */
    private Boolean renderLabelForZeroData;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.emphasis
     * <br/>序号: 16
     * <br/>默认值: none
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>高亮状态配置。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.blur
     * <br/>序号: 17
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>淡出状态配置。开启 <a href="#series-sunburst.emphasis.focus">emphasis.focus</a> 后有效。</p>
     */
    private Blur blur;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.select
     * <br/>序号: 18
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>选中状态配置。开启 <a href="#series-sunburst.selectedMode">selectedMode</a> 后有效。</p>
     */
    private Select select;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.selectedMode
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>选中模式的配置，表示是否支持多个选中，默认关闭，支持布尔值和字符串，字符串取值可选<code class="codespan">'single'</code>，<code class="codespan">'multiple'</code>，分别表示单选还是多选。</p>
     */
    private Object selectedMode;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.levels
     * <br/>序号: 20
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p><strong>多层配置</strong></p>
     * <p>旭日图是一种有层次的结构，为了方便同一层样式的配置，我们提供了 levels 配置项。它是一个数组，其中的第 0 项表示数据下钻后返回上级的图形，其后的每一项分别表示从圆心向外层的层级。</p>
     * <p>例如，假设我们没有数据下钻功能，并且希望将最内层的扇形块的颜色设为红色，文字设为蓝色，可以这样设置：</p>
     * <pre><code class="lang-js hljs javascript">series: {
     *     <span class="hljs-comment">// ...</span>
     *     <span class="hljs-attr">levels</span>: [
     *         {
     *             <span class="hljs-comment">// 留给数据下钻点的空白配置</span>
     *         },
     *         {
     *             <span class="hljs-comment">// 最靠内测的第一层</span>
     *             <span class="hljs-attr">itemStyle</span>: {
     *                 <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>
     *             },
     *             <span class="hljs-attr">label</span>: {
     *                 <span class="hljs-attr">color</span>: <span class="hljs-string">'blue'</span>
     *             }
     *         },
     *         {
     *             <span class="hljs-comment">// 第二层 ...</span>
     *         }
     *     ]
     * }
     * </code></pre>
     */
    private List<Levels> levels;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.animation
     * <br/>序号: 21
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.animationThreshold
     * <br/>序号: 22
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.animationDuration
     * <br/>序号: 23
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.animationEasing
     * <br/>序号: 24
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.animationDelay
     * <br/>序号: 25
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.animationDurationUpdate
     * <br/>序号: 26
     * <br/>默认值: 500
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.animationEasingUpdate
     * <br/>序号: 27
     * <br/>默认值: cubicInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-sunburst.animationDelayUpdate
     * <br/>序号: 28
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
}
