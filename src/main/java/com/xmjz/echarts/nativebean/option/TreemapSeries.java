package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.treemapSeries.Tooltip;
import com.xmjz.echarts.nativebean.option.treemapSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap">https://echarts.apache.org/v4/zh/option.html#series-treemap</a>
 * <br/>序号: 0
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><a href="https://en.wikipedia.org/wiki/Treemapping" target="_blank">Treemap</a> 是一种常见的表达『层级数据』『树状数据』的可视化形式。它主要用面积的方式，便于突出展现出『树』的各层级中重要的节点。</p>
 * <p><strong>示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=treemap-obama&amp;edit=1&amp;reset=1" width="700" height="580" data-ll-timeout="23"><iframe />
 *
 *
 *
 * <p><br>
 * <strong>视觉映射：</strong></p>
 * <p>treemap 首先是把数值映射到『面积』这种视觉元素上。</p>
 * <p>此外，也支持对数据的其他维度进行视觉映射，例如映射到颜色、颜色明暗度上。</p>
 * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
 * <p><br>
 * <strong>下钻（drill down）：</strong></p>
 * <p><code class="codespan">drill down</code> 功能即点击后才展示子层级。
 * 设置了 <a href="#series-treemap.leafDepth">leafDepth</a> 后，下钻（<code class="codespan">drill down</code>）功能开启。</p>
 * <p><strong>如下是 drill down 的例子：</strong></p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=treemap-drill-down&edit=1&reset=1" width="800" height="500"><iframe />
 *
 *
 *
 * <p><br>
 * <br>
 * <br>
 * 注：treemap 的配置项 和 ECharts2 相比有一些变化，一些不太成熟的配置方式不再支持或不再兼容：</p>
 * <ul>
 * <li><p><code class="codespan">center/size</code> 方式的定位不再支持，而是统一使用 <code class="codespan">left/top/bottom/right/width/height</code> 方式定位。</p>
 * </li>
 * <li><p><code class="codespan">breadcrumb</code> 的配置被移动到了 <code class="codespan">itemStyle/itemStyle.emphasis</code> 外部，和 <code class="codespan">itemStyle</code> 平级。</p>
 * </li>
 * <li><p><code class="codespan">root</code> 的设置暂时不支持。目前可以使用 <code class="codespan">zoom</code> 的方式来查看树更下层次的细节，或者使用 <a href="#series-treemap.leafDepth">leafDepth</a> 开启 &quot;drill down&quot; 功能。</p>
 * </li>
 * <li><p><code class="codespan">label</code> 的配置被移动到了 <code class="codespan">itemStyle/itemStyle.emphasis</code> 外部，和 <code class="codespan">itemStyle</code> 平级。</p>
 * </li>
 * <li><p><code class="codespan">itemStyle.childBorderWidth</code>、<code class="codespan">itemStyle.childBorderColor</code>不再支持（因为这个配置方式只能定义两层的treemap）。统一使用 <a href="#series-treemap.levels">series-treemap.levels</a> 来进行各层级的定义。</p>
 * </li>
 * </ul>
 * <p><br>
 * <br></p>
 *
 * </iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class TreemapSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.type">https://echarts.apache.org/v4/zh/option.html#series-treemap.type</a>
     * <br/>序号: 1
     * <br/>默认值: treemap
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.id">https://echarts.apache.org/v4/zh/option.html#series-treemap.id</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.name">https://echarts.apache.org/v4/zh/option.html#series-treemap.name</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.zlevel">https://echarts.apache.org/v4/zh/option.html#series-treemap.zlevel</a>
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.z">https://echarts.apache.org/v4/zh/option.html#series-treemap.z</a>
     * <br/>序号: 5
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.left">https://echarts.apache.org/v4/zh/option.html#series-treemap.left</a>
     * <br/>序号: 6
     * <br/>默认值: center
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>treemap 组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.top">https://echarts.apache.org/v4/zh/option.html#series-treemap.top</a>
     * <br/>序号: 7
     * <br/>默认值: middle
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>treemap 组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.right">https://echarts.apache.org/v4/zh/option.html#series-treemap.right</a>
     * <br/>序号: 8
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>treemap 组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.bottom">https://echarts.apache.org/v4/zh/option.html#series-treemap.bottom</a>
     * <br/>序号: 9
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>treemap 组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.width">https://echarts.apache.org/v4/zh/option.html#series-treemap.width</a>
     * <br/>序号: 10
     * <br/>默认值: 80%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>treemap 组件的宽度。</p>
     */
    private Object width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.height">https://echarts.apache.org/v4/zh/option.html#series-treemap.height</a>
     * <br/>序号: 11
     * <br/>默认值: 80%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>treemap 组件的高度。</p>
     */
    private Object height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.squareRatio">https://echarts.apache.org/v4/zh/option.html#series-treemap.squareRatio</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>期望矩形长宽比率。布局计算时会尽量向这个比率靠近。</p>
     * <p>默认为黄金比：<code class="codespan">0.5 * (1 + Math.sqrt(5))</code>。</p>
     */
    private Integer squareRatio;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.leafDepth">https://echarts.apache.org/v4/zh/option.html#series-treemap.leafDepth</a>
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>设置了 <code class="codespan">leafDepth</code> 后，下钻（<code class="codespan">drill down</code>）功能开启。<code class="codespan">drill down</code> 功能即点击后才展示子层级。</p>
     * <p><code class="codespan">leafDepth</code> 表示『展示几层』，层次更深的节点则被隐藏起来。点击则可下钻看到层次更深的节点。</p>
     * <p>例如，<code class="codespan">leafDepth</code> 设置为 <code class="codespan">1</code>，表示展示一层节点。</p>
     * <p>默认没有开启 <code class="codespan">drill down</code>（即 <code class="codespan">leafDepth</code> 为 <code class="codespan">null</code> 或 <code class="codespan">undefined</code>）。</p>
     * <p><strong>drill down 的例子：</strong></p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=treemap-drill-down&amp;edit=1&amp;reset=1" width="800" height="500"><iframe />
     *
     * </iframe>
     */
    private Integer leafDepth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.drillDownIcon">https://echarts.apache.org/v4/zh/option.html#series-treemap.drillDownIcon</a>
     * <br/>序号: 14
     * <br/>默认值: ▶
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>当节点可以下钻时的提示符。只能是字符。</p>
     */
    private String drillDownIcon;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.roam">https://echarts.apache.org/v4/zh/option.html#series-treemap.roam</a>
     * <br/>序号: 15
     * <br/>默认值: true
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>是否开启拖拽漫游（移动和缩放）。可取值有：</p>
     * <ul>
     * <li><code class="codespan">false</code>：关闭。</li>
     * <li><code class="codespan">'scale'</code> 或 <code class="codespan">'zoom'</code>：只能够缩放。</li>
     * <li><code class="codespan">'move'</code> 或 <code class="codespan">'pan'</code>：只能够平移。</li>
     * <li><code class="codespan">true</code>：缩放和平移均可。</li>
     * </ul>
     */
    private Object roam;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.nodeClick">https://echarts.apache.org/v4/zh/option.html#series-treemap.nodeClick</a>
     * <br/>序号: 16
     * <br/>默认值: zoomToNode
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>点击节点后的行为。可取值为：</p>
     * <ul>
     * <li><code class="codespan">false</code>：节点点击无反应。</li>
     * <li><code class="codespan">'zoomToNode'</code>：点击节点后缩放到节点。</li>
     * <li><code class="codespan">'link'</code>：如果节点数据中有 <a href="#series-treemap.data.link">link</a> 点击节点后会进行超链接跳转。</li>
     * </ul>
     */
    private Object nodeClick;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.zoomToNodeRatio">https://echarts.apache.org/v4/zh/option.html#series-treemap.zoomToNodeRatio</a>
     * <br/>序号: 17
     * <br/>默认值: 0.1024
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>点击某个节点，会自动放大那个节点到合适的比例（节点占可视区域的面积比例），这个配置项就是这个比例。</p>
     */
    private Integer zoomToNodeRatio;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.levels">https://echarts.apache.org/v4/zh/option.html#series-treemap.levels</a>
     * <br/>序号: 18
     * <br/>默认值: index
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p><strong>多层配置</strong></p>
     * <p>treemap 中采用『三级配置』：</p>
     * <pre><code class="hljs">『每个节点』-&gt;『每个层级』-&gt;『每个系列』。
     * </code></pre><p>即我们可以对每个节点进行配置，也可以对树的每个层级进行配置，也可以 series 上设置全局配置。节点上的设置，优先级最高。</p>
     * <p>最常用的是『每个层级进行配置』，<code class="codespan">levels</code> 配置项就是每个层级的配置。例如：</p>
     * <pre><code class="lang-javascript hljs"><span class="hljs-comment">// Notice that in fact the data structure is not "tree", but is "forest".</span>
     * <span class="hljs-comment">// 注意，这个数据结构实际不是『树』而是『森林』</span>
     * <span class="hljs-attr">data</span>: [
     *     {
     *         <span class="hljs-attr">name</span>: <span class="hljs-string">'nodeA'</span>,
     *         <span class="hljs-attr">children</span>: [
     *             {<span class="hljs-attr">name</span>: <span class="hljs-string">'nodeAA'</span>},
     *             {<span class="hljs-attr">name</span>: <span class="hljs-string">'nodeAB'</span>},
     *         ]
     *     },
     *     {
     *         <span class="hljs-attr">name</span>: <span class="hljs-string">'nodeB'</span>,
     *         <span class="hljs-attr">children</span>: [
     *             {<span class="hljs-attr">name</span>: <span class="hljs-string">'nodeBA'</span>}
     *         ]
     *     }
     * ],
     * <span class="hljs-attr">levels</span>: [
     *     {...}, <span class="hljs-comment">// 『森林』的顶层配置。即含有 'nodeA', 'nodeB' 的这层。</span>
     *     {...}, <span class="hljs-comment">// 下一层配置，即含有 'nodeAA', 'nodeAB', 'nodeBA' 的这层。</span>
     *     {...}, <span class="hljs-comment">// 再下一层配置。</span>
     *     ...
     * ]
     * </code></pre>
     * <p><br>
     * <strong>视觉映射的规则</strong></p>
     * <p>treemap中首要关注的是如何在视觉上较好得区分『不同层级』、『同层级中不同类别』。这需要合理得设置不同层级的『矩形颜色』、『边界粗细』、『边界颜色』甚至『矩形颜色饱和度』等。</p>
     * <p>参见这个<a href="https://echarts.apache.org/examples/zh/editor.html?c=treemap-disk&amp;edit=1&amp;reset=1" target="_blank">例子</a>，最顶层级用颜色区分，分成了『红』『绿』『蓝』等大块。每个颜色块中是下一个层级，使用颜色的饱和度来区分（参见 <code class="codespan">colorSaturation</code>）。最外层的矩形边界是『白色』，下层级的矩形边界是当前区块颜色加上饱和度处理（参见 <code class="codespan">borderColorSaturation</code>）。</p>
     * <p><code class="codespan">treemap</code> 是通过这样的规则来支持这种配置的：每个层级计算用户配置的 <code class="codespan">color</code>、<code class="codespan">colorSaturation</code>、<code class="codespan">borderColor</code>、<code class="codespan">borderColorSaturation</code>等视觉信息（在levels中配置）。如果子节点没有配置，则继承父的配置，否则使用自己的配置）。</p>
     * <p>这样，可以做到：父层级配置 <code class="codespan">color</code> 列表，子层级配置 <code class="codespan">colorSaturation</code>。父层级的每个节点会从 <code class="codespan">color</code> 列表中得到一个颜色，子层级的节点会从 <code class="codespan">colorSaturation</code> 中得到一个值，并且继承父节点得到的颜色，合成得到自己的最终颜色。</p>
     * <p><br>
     * <strong>维度与『额外的视觉映射』</strong></p>
     * <p>例子：每一个 <code class="codespan">value</code> 字段是一个 Array，其中每个项对应一个维度（dimension）。</p>
     * <pre><code class="lang-javascript hljs">[
     *     {
     *         <span class="hljs-attr">value</span>: [<span class="hljs-number">434</span>, <span class="hljs-number">6969</span>, <span class="hljs-number">8382</span>],
     *         <span class="hljs-attr">children</span>: [
     *             {
     *                 <span class="hljs-attr">value</span>: [<span class="hljs-number">1212</span>, <span class="hljs-number">4943</span>, <span class="hljs-number">5453</span>],
     *                 <span class="hljs-attr">id</span>: <span class="hljs-string">'someid-1'</span>,
     *                 <span class="hljs-attr">name</span>: <span class="hljs-string">'description of this node'</span>,
     *                 <span class="hljs-attr">children</span>: [...]
     *             },
     *             {
     *                 <span class="hljs-attr">value</span>: [<span class="hljs-number">4545</span>, <span class="hljs-number">192</span>, <span class="hljs-number">439</span>],
     *                 <span class="hljs-attr">id</span>: <span class="hljs-string">'someid-2'</span>,
     *                 <span class="hljs-attr">name</span>: <span class="hljs-string">'description of this node'</span>,
     *                 <span class="hljs-attr">children</span>: [...]
     *             },
     *             ...
     *         ]
     *     },
     *     {
     *         <span class="hljs-attr">value</span>: [<span class="hljs-number">23</span>, <span class="hljs-number">59</span>, <span class="hljs-number">12</span>],
     *         <span class="hljs-attr">children</span>: [...]
     *     },
     *     ...
     * ]
     * </code></pre>
     * <p>treemap 默认把第一个维度（Array 第一项）映射到『面积』上。而如果想表达更多信息，用户可以把其他的某一个维度（<a href="#series-treemap.viusalDimension">series-treemap.visualDimension</a>），映射到其他的『视觉元素』上，比如颜色明暗等。参见<a href="https://echarts.apache.org/examples/zh/editor.html?c=treemap-obama&amp;edit=1&amp;reset=1" target="_blank">例子</a>中，legend选择 <code class="codespan">Growth</code>时的状态。</p>
     * <p><br></p>
     * <p><strong>矩形边框（border）/缝隙（gap）设置如何避免混淆</strong></p>
     * <p>如果统一用一种颜色设置矩形的缝隙（gap），那么当不同层级的矩形同时展示时可能会出现混淆。</p>
     * <p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=doc-example/treemap-borderColor&amp;edit=1&amp;reset=1" target="_blank">例子</a>，注意其中红色的区块中的子矩形其实是更深层级，和其他用白色缝隙区分的矩形不是在一个层级。所以，红色区块中矩形的分割线的颜色，我们在 <code class="codespan">borderColorSaturation</code> 中设置为『加了饱和度变化的红颜色』，以示区别。</p>
     * <p><br>
     * <strong>borderWidth, gapWidth, borderColor 的解释</strong></p>
     * <p><img width="500" height="auto" src="documents/asset/img/treemap-border-gap.png"></p>
     */
    private List<Levels> levels;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.visualDimension">https://echarts.apache.org/v4/zh/option.html#series-treemap.visualDimension</a>
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><code class="codespan">treemap</code> 中支持对数据其他维度进行视觉映射。</p>
     * <p>首先，treemap的数据格式（参见 <a href="#series-treemap.data">series-treemap.data</a>）中，每个节点的 <code class="codespan">value</code> 都可以是数组。数组每项是一个『维度』（dimension）。<code class="codespan">visualDimension</code> 指定了额外的『视觉映射』使用的是数组的哪一项。默认为第 <code class="codespan">0</code> 项。</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <p><br></p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">visualDimension</code> 属性可能在多处地方存在：</p>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Integer visualDimension;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.visualMin">https://echarts.apache.org/v4/zh/option.html#series-treemap.visualMin</a>
     * <br/>序号: 20
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前层级的最小 value 值。如果不设置则自动统计。</p>
     * <p>手动指定 <code class="codespan">visualMin</code>、<code class="codespan">visualMax</code> ，即手动控制了 visual mapping 的值域（当 <a href="#series-treemap.levels.colorMappingBy">colorMappingBy</a> 为 <code class="codespan">'value'</code> 时有意义）。</p>
     */
    private Integer visualMin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.visualMax">https://echarts.apache.org/v4/zh/option.html#series-treemap.visualMax</a>
     * <br/>序号: 21
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前层级的最大 value 值。如果不设置则自动统计。</p>
     * <p>手动指定 <code class="codespan">visualMin</code>、<code class="codespan">visualMax</code> ，即手动控制了 visual mapping 的值域（当 <a href="#series-treemap.levels.colorMappingBy">colorMappingBy</a> 为 <code class="codespan">'value'</code> 时有意义）。</p>
     */
    private Integer visualMax;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.colorAlpha">https://echarts.apache.org/v4/zh/option.html#series-treemap.colorAlpha</a>
     * <br/>序号: 22
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>本系列默认的 颜色透明度 选取范围。数值范围 0 ~ 1。</p>
     * <p>例如, <code class="codespan">colorAlpha</code> 可以是 <code class="codespan">[0.3, 1]</code>.</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <p><br></p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">colorAlpha</code> 属性可能在多处地方存在：</p>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private List<?> colorAlpha;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.colorSaturation">https://echarts.apache.org/v4/zh/option.html#series-treemap.colorSaturation</a>
     * <br/>序号: 23
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>本系列默认的 颜色饱和度 选取范围。数值范围 0 ~ 1。</p>
     * <p>例如, <code class="codespan">colorSaturation</code> 可以是 <code class="codespan">[0.3, 1]</code>.</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <p><br></p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">colorSaturation</code> 属性可能在多处地方存在：</p>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Integer colorSaturation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.colorMappingBy">https://echarts.apache.org/v4/zh/option.html#series-treemap.colorMappingBy</a>
     * <br/>序号: 24
     * <br/>默认值: index
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>表示同一层级节点，在颜色列表中（参见 <code class="codespan">color</code> 属性）选择时，按照什么来选择。可选值：</p>
     * <ul>
     * <li><code class="codespan">'value'</code>：</li>
     * </ul>
     * <p>将节点的值（即 <a href="#series-treemap.data.value">series-treemap.data.value</a>）映射到颜色列表中。</p>
     * <p>这样得到的颜色，反应了节点值的大小。</p>
     * <p>可以使用 <a href="#series-treemap.levels.visualDimension">visualDimension</a> 属性来设置，用 <a href="#series-treemap.data">data</a> 中哪个纬度的值来映射。</p>
     * <ul>
     * <li><code class="codespan">'index'</code>：</li>
     * </ul>
     * <p>将节点的 <code class="codespan">index</code>（序号）映射到颜色列表中。即同一层级中，第一个节点取颜色列表中第一个颜色，第二个节点取第二个。</p>
     * <p>这样得到的颜色，便于区分相邻节点。</p>
     * <ul>
     * <li><code class="codespan">'id'</code>：</li>
     * </ul>
     * <p>将节点的 <code class="codespan">id</code>（即 <a href="#series-treemap.data.id">series-treemap.data.id</a>）映射到颜色列表中。<code class="codespan">id</code> 是用户指定的，这样能够使得，在treemap 通过 setOption 变化数值时，同一 <code class="codespan">id</code> 映射到同一颜色，保持一致性。参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=treemap-obama&amp;edit=1&amp;reset=1" target="_blank">例子</a>。</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <p><br></p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">colorMappingBy</code> 属性可能在多处地方存在：</p>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private String colorMappingBy;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.visibleMin">https://echarts.apache.org/v4/zh/option.html#series-treemap.visibleMin</a>
     * <br/>序号: 25
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果某个节点的矩形的面积，小于这个数值（单位：px平方），这个节点就不显示。</p>
     * <p>如果不加这个限制，很小的节点会影响显示效果。</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <p><br></p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">visibleMin</code> 属性可能在多处地方存在：</p>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Integer visibleMin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.childrenVisibleMin">https://echarts.apache.org/v4/zh/option.html#series-treemap.childrenVisibleMin</a>
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果某个节点的矩形面积，小于这个数值（单位：px平方），则不显示这个节点的子节点。</p>
     * <p>这能够在矩形面积不足够大时候，隐藏节点的细节。当用户用鼠标缩放节点时，如果面积大于此阈值，又会显示子节点。</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <p><br></p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">childrenVisibleMin</code> 属性可能在多处地方存在：</p>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Integer childrenVisibleMin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.label">https://echarts.apache.org/v4/zh/option.html#series-treemap.label</a>
     * <br/>序号: 27
     * <br/>默认值: inside
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了每个矩形中，文本标签的样式。</p>
     * <p><br></p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">label</code> 属性可能在多处地方存在：</p>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     * <p><br></p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.upperLabel">https://echarts.apache.org/v4/zh/option.html#series-treemap.upperLabel</a>
     * <br/>序号: 28
     * <br/>默认值: inside
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">upperLabel</code> 用于显示矩形的父节点的标签。当 <a href="#series-treemap.upperLabel.show">upperLabel.show</a> 为 <code class="codespan">true</code> 的时候，『显示父节点标签』功能开启。</p>
     * <p>同 <a href="#series-treemap.label">series-treemap.label</a> 一样，<code class="codespan">upperLabel</code> 可以存在于 <a href="#series-treemap">series-treemap</a> 的根节点，或者 <a href="#series-treemap.level">series-treemap.level</a> 中，或者 <a href="#series-treemap.data">series-treemap.data</a> 的每个数据项中。</p>
     * <p><a href="#series-treemap.label">series-treemap.label</a> 描述的是，当前节点为叶节点时标签的样式；<code class="codespan">upperLabel</code> 描述的是，当前节点为非叶节点（即含有子节点）时标签的样式。（此时标签一般会被显示在节点的最上部）</p>
     * <p>参见：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=treemap-show-parent&amp;edit=1&amp;reset=1" width="700" height="500"><iframe />
     *
     *
     *
     *
     * <p><br></p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">label</code> 属性可能在多处地方存在：</p>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     * <p><br></p>
     * </iframe>
     */
    private UpperLabel upperLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-treemap.itemStyle</a>
     * <br/>序号: 29
     * <br/>默认值: #fff,
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><br></p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">itemStyle</code> 属性可能在多处地方存在：</p>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     * <p><br></p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.emphasis">https://echarts.apache.org/v4/zh/option.html#series-treemap.emphasis</a>
     * <br/>序号: 30
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb">https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb</a>
     * <br/>序号: 31
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>面包屑，能够显示当前节点的路径。</p>
     */
    private Breadcrumb breadcrumb;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.data">https://echarts.apache.org/v4/zh/option.html#series-treemap.data</a>
     * <br/>序号: 32
     * <br/>默认值: index
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p><a href="#series-treemap.data">series-treemap.data</a> 的数据格式是树状的，例如：</p>
     * <pre><code class="lang-javascript hljs">[ <span class="hljs-comment">// 注意，最外层是一个数组，而非从某个根节点开始。</span>
     *     {
     *         <span class="hljs-attr">value</span>: <span class="hljs-number">1212</span>,
     *         <span class="hljs-attr">children</span>: [
     *             {
     *                 <span class="hljs-attr">value</span>: <span class="hljs-number">2323</span>,    <span class="hljs-comment">// value字段的值，对应到面积大小。</span>
     *                                 <span class="hljs-comment">// 也可以是数组，如 [2323, 43, 55]，则数组第一项对应到面积大小。</span>
     *                                 <span class="hljs-comment">// 数组其他项可以用于额外的视觉映射，详情参见 series-treemp.levels。</span>
     *                 <span class="hljs-attr">id</span>: <span class="hljs-string">'someid-1'</span>, <span class="hljs-comment">// id 不是必须设置的。</span>
     *                                 <span class="hljs-comment">// 但是如果想使用 API 来改变某个节点，需要用 id 来定位。</span>
     *                 <span class="hljs-attr">name</span>: <span class="hljs-string">'description of this node'</span>, <span class="hljs-comment">// 显示在矩形中的描述文字。</span>
     *                 <span class="hljs-attr">children</span>: [...],
     *                 <span class="hljs-attr">label</span>: {        <span class="hljs-comment">// 此节点特殊的 label 定义（如果需要的话）。</span>
     *                     ...         <span class="hljs-comment">// label的格式参见 series-treemap.label。</span>
     *                 },
     *                 <span class="hljs-attr">itemStyle</span>: {    <span class="hljs-comment">// 此节点特殊的 itemStyle 定义（如果需要的话）。</span>
     *                     ...         <span class="hljs-comment">// label的格式参见 series-treemap.itemStyle。</span>
     *                 }
     *             },
     *             {
     *                 <span class="hljs-attr">value</span>: <span class="hljs-number">4545</span>,
     *                 <span class="hljs-attr">id</span>: <span class="hljs-string">'someid-2'</span>,
     *                 <span class="hljs-attr">name</span>: <span class="hljs-string">'description of this node'</span>,
     *                 <span class="hljs-attr">children</span>: [
     *                     {
     *                         <span class="hljs-attr">value</span>: <span class="hljs-number">5656</span>,
     *                         <span class="hljs-attr">id</span>: <span class="hljs-string">'someid-3'</span>,
     *                         <span class="hljs-attr">name</span>: <span class="hljs-string">'description of this node'</span>,
     *                         <span class="hljs-attr">children</span>: [...]
     *                     },
     *                     ...
     *                 ]
     *             }
     *         ]
     *     },
     *     {
     *         <span class="hljs-attr">value</span>: [<span class="hljs-number">23</span>, <span class="hljs-number">59</span>, <span class="hljs-number">12</span>]
     *         <span class="hljs-comment">// 如果没有children，可以不写</span>
     *     },
     *     ...
     * ]
     * </code></pre>
     */
    private List<Data> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.silent">https://echarts.apache.org/v4/zh/option.html#series-treemap.silent</a>
     * <br/>序号: 33
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.animationDuration">https://echarts.apache.org/v4/zh/option.html#series-treemap.animationDuration</a>
     * <br/>序号: 34
     * <br/>默认值: 1500
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.animationEasing">https://echarts.apache.org/v4/zh/option.html#series-treemap.animationEasing</a>
     * <br/>序号: 35
     * <br/>默认值: quinticInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.animationDelay">https://echarts.apache.org/v4/zh/option.html#series-treemap.animationDelay</a>
     * <br/>序号: 36
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.tooltip">https://echarts.apache.org/v4/zh/option.html#series-treemap.tooltip</a>
     * <br/>序号: 37
     * <br/>默认值: rgba(50,50,50,0.7)
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
