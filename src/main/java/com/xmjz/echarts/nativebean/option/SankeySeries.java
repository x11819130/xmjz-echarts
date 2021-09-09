package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.sankeySeries.Tooltip;
import com.xmjz.echarts.nativebean.option.sankeySeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey">https://echarts.apache.org/v4/zh/option.html#series-sankey</a>
 * <br/>序号: 0
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong> 桑基图 </strong></p>
 * <p>是一种特殊的流图（可以看作是有向无环图）。 它主要用来表示原材料、能量等如何从最初形式经过中间过程的加工或转化达到最终状态。</p>
 * <p><strong>示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=sankey-energy&amp;edit=1&amp;reset=1" width="700" height="580"><iframe />
 *
 *
 * <p><br>
 * <strong>可视编码：</strong></p>
 * <p>桑基图将原数据中的每个<code class="codespan">node</code>编码成一个小矩形，不同的节点尽量用不同的颜色展示，小矩形旁边的<code class="codespan">label</code>编码的是节点的名称。</p>
 * <p>此外，图中每两个小矩形之间的边编码的是原数据中的<code class="codespan">link</code>，边的粗细编码的是<code class="codespan">link</code>中的<code class="codespan">value</code>。</p>
 * <p><br>
 * <strong>排序：</strong></p>
 * <p>如果想指定每层节点的顺序是按照 <a href="#series-sankey.data">data</a> 中的顺序排列的。可以设置 <a href="#series-sankey.layoutIterations">layoutIterations</a> 为 <code class="codespan">0</code>。</p>
 *
 *
 * </iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class SankeySeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.type">https://echarts.apache.org/v4/zh/option.html#series-sankey.type</a>
     * <br/>序号: 1
     * <br/>默认值: sankey
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.id">https://echarts.apache.org/v4/zh/option.html#series-sankey.id</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.name">https://echarts.apache.org/v4/zh/option.html#series-sankey.name</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.zlevel">https://echarts.apache.org/v4/zh/option.html#series-sankey.zlevel</a>
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.z">https://echarts.apache.org/v4/zh/option.html#series-sankey.z</a>
     * <br/>序号: 5
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.left">https://echarts.apache.org/v4/zh/option.html#series-sankey.left</a>
     * <br/>序号: 6
     * <br/>默认值: 5%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>sankey组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.top">https://echarts.apache.org/v4/zh/option.html#series-sankey.top</a>
     * <br/>序号: 7
     * <br/>默认值: 5%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>sankey组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.right">https://echarts.apache.org/v4/zh/option.html#series-sankey.right</a>
     * <br/>序号: 8
     * <br/>默认值: 20%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>sankey组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.bottom">https://echarts.apache.org/v4/zh/option.html#series-sankey.bottom</a>
     * <br/>序号: 9
     * <br/>默认值: 5%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>sankey组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.width">https://echarts.apache.org/v4/zh/option.html#series-sankey.width</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>sankey组件的宽度。</p>
     */
    private Object width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.height">https://echarts.apache.org/v4/zh/option.html#series-sankey.height</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>sankey组件的高度。</p>
     */
    private Object height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.nodeWidth">https://echarts.apache.org/v4/zh/option.html#series-sankey.nodeWidth</a>
     * <br/>序号: 12
     * <br/>默认值: 20
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>桑基图中每个矩形节点的宽度。</p>
     */
    private Integer nodeWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.nodeGap">https://echarts.apache.org/v4/zh/option.html#series-sankey.nodeGap</a>
     * <br/>序号: 13
     * <br/>默认值: 8
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>桑基图中每一列任意两个矩形节点之间的间隔。</p>
     */
    private Integer nodeGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.nodeAlign">https://echarts.apache.org/v4/zh/option.html#series-sankey.nodeAlign</a>
     * <br/>序号: 14
     * <br/>默认值: justify
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>桑基图中节点的对齐方式，默认是双端对齐，可以设置为左对齐或右对齐，对应的值分别是：</p>
     * <ul>
     * <li><code class="codespan">justify</code>: 节点双端对齐。</li>
     * <li><code class="codespan">left</code>: 节点左对齐。</li>
     * <li><code class="codespan">right</code>: 节点右对齐。</li>
     * </ul>
     */
    private String nodeAlign;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.layoutIterations">https://echarts.apache.org/v4/zh/option.html#series-sankey.layoutIterations</a>
     * <br/>序号: 15
     * <br/>默认值: 32
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>布局的迭代次数，目的是不断迭代优化图中节点和边的位置，以减少节点和边之间的相互遮盖，默认值是 <code class="codespan">32</code>。如果希望图中节点的顺序是按照原始 <a href="#series-sankey.data">data</a> 中的顺序排列的，可设该值为 <code class="codespan">0</code>。</p>
     */
    private Integer layoutIterations;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.orient">https://echarts.apache.org/v4/zh/option.html#series-sankey.orient</a>
     * <br/>序号: 16
     * <br/>默认值: horizontal
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>桑基图中节点的布局方向，可以是水平的从左往右，也可以是垂直的从上往下，对应的参数值分别是 <code class="codespan">horizontal</code>, <code class="codespan">vertical</code>。</p>
     */
    private String orient;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.draggable">https://echarts.apache.org/v4/zh/option.html#series-sankey.draggable</a>
     * <br/>序号: 17
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>控制节点拖拽的交互，默认开启。开启后，用户可以将图中任意节点拖拽到任意位置。若想关闭此交互，只需将值设为 <code class="codespan">false</code> 就行了。</p>
     */
    private Boolean draggable;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.focusNodeAdjacency">https://echarts.apache.org/v4/zh/option.html#series-sankey.focusNodeAdjacency</a>
     * <br/>序号: 18
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>鼠标 hover 到节点或边上，相邻接的节点和边高亮的交互，默认关闭，可手动开启。</p>
     * <p>可选值为：</p>
     * <ul>
     * <li><code class="codespan">false</code>：hover 到节点或边时，只有被 hover 的节点或边高亮。</li>
     * <li><code class="codespan">true</code>：同 <code class="codespan">'allEdges'</code>。</li>
     * <li><code class="codespan">'allEdges'</code>：hover 到节点时，与节点邻接的所有边以及边对应的节点全部高亮。hover 到边时，边和相邻节点高亮。</li>
     * <li><code class="codespan">'outEdges'</code>：hover 的节点、节点的出边、出边邻接的另一节点 会被高亮。hover 到边时，边和相邻节点高亮。</li>
     * <li><code class="codespan">'inEdges'</code>：hover 的节点、节点的入边、入边邻接的另一节点 会被高亮。hover 到边时，边和相邻节点高亮。</li>
     * </ul>
     */
    private Object focusNodeAdjacency;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.levels">https://echarts.apache.org/v4/zh/option.html#series-sankey.levels</a>
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>桑基图每一层的设置。可以逐层设置，如下：</p>
     * <pre><code class="lang-js hljs javascript">levels: [{
     *     <span class="hljs-attr">depth</span>: <span class="hljs-number">0</span>,
     *     <span class="hljs-attr">itemStyle</span>: {
     *         <span class="hljs-attr">color</span>: <span class="hljs-string">'#fbb4ae'</span>
     *     },
     *     <span class="hljs-attr">lineStyle</span>: {
     *         <span class="hljs-attr">color</span>: <span class="hljs-string">'source'</span>,
     *         <span class="hljs-attr">opacity</span>: <span class="hljs-number">0.6</span>
     *     }
     * }, {
     *     <span class="hljs-attr">depth</span>: <span class="hljs-number">1</span>,
     *     <span class="hljs-attr">itemStyle</span>: {
     *         <span class="hljs-attr">color</span>: <span class="hljs-string">'#b3cde3'</span>
     *     },
     *     <span class="hljs-attr">lineStyle</span>: {
     *         <span class="hljs-attr">color</span>: <span class="hljs-string">'source'</span>,
     *         <span class="hljs-attr">opacity</span>: <span class="hljs-number">0.6</span>
     *     }
     * }]
     * </code></pre>
     * <p>也可以只设置某一层：</p>
     * <pre><code class="lang-js hljs javascript">levels: [{
     *     <span class="hljs-attr">depth</span>: <span class="hljs-number">3</span>,
     *     <span class="hljs-attr">itemStyle</span>: {
     *         <span class="hljs-attr">color</span>: <span class="hljs-string">'#fbb4ae'</span>
     *     },
     *     <span class="hljs-attr">lineStyle</span>: {
     *         <span class="hljs-attr">color</span>: <span class="hljs-string">'source'</span>,
     *         <span class="hljs-attr">opacity</span>: <span class="hljs-number">0.6</span>
     *     }
     * }]
     * </code></pre>
     */
    private List<Levels> levels;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.label">https://echarts.apache.org/v4/zh/option.html#series-sankey.label</a>
     * <br/>序号: 20
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了每个矩形节点中文本标签的样式。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-sankey.itemStyle</a>
     * <br/>序号: 21
     * <br/>默认值: 自适应
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>桑基图节点矩形的样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.lineStyle">https://echarts.apache.org/v4/zh/option.html#series-sankey.lineStyle</a>
     * <br/>序号: 22
     * <br/>默认值: '#314656'
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>桑基图边的样式，其中 <a href="#series-sankey.lineStyle.color">lineStyle.color</a> 支持设置为<code class="codespan">'source'</code>或者<code class="codespan">'target'</code>特殊值，此时边会自动取源节点或目标节点的颜色作为自己的颜色。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.emphasis">https://echarts.apache.org/v4/zh/option.html#series-sankey.emphasis</a>
     * <br/>序号: 23
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>桑基图的高亮样式设置。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.data">https://echarts.apache.org/v4/zh/option.html#series-sankey.data</a>
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>桑基图节点数据列表。</p>
     * <pre><code class="lang-js hljs javascript">data: [{
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'node1'</span>,
     *     <span class="hljs-comment">// This attribute decides the layer of the current node.</span>
     *     <span class="hljs-attr">depth</span>: <span class="hljs-number">0</span>
     * }, {
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'node2'</span>,
     *     <span class="hljs-attr">depth</span>: <span class="hljs-number">1</span>
     * }]
     * </code></pre>
     * <p><strong>注意:</strong> 节点的<code class="codespan">name</code>不能重复。</p>
     */
    private List<Data> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.nodes">https://echarts.apache.org/v4/zh/option.html#series-sankey.nodes</a>
     * <br/>序号: 25
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>同 <a href="#series-sankey.data">data</a></p>
     */
    private List<?> nodes;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.links">https://echarts.apache.org/v4/zh/option.html#series-sankey.links</a>
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>节点间的边。<strong>注意: 桑基图理论上只支持有向无环图（DAG, Directed Acyclic Graph），所以请确保输入的边是无环的.</strong> 示例：</p>
     * <pre><code class="lang-js hljs javascript">links: [{
     *     <span class="hljs-attr">source</span>: <span class="hljs-string">'n1'</span>,
     *     <span class="hljs-attr">target</span>: <span class="hljs-string">'n2'</span>
     * }, {
     *     <span class="hljs-attr">source</span>: <span class="hljs-string">'n2'</span>,
     *     <span class="hljs-attr">target</span>: <span class="hljs-string">'n3'</span>
     * }]
     * </code></pre>
     */
    private List<Links> links;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.edges">https://echarts.apache.org/v4/zh/option.html#series-sankey.edges</a>
     * <br/>序号: 27
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>同 <a href="#series-sankey.links">links</a></p>
     */
    private List<?> edges;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.silent">https://echarts.apache.org/v4/zh/option.html#series-sankey.silent</a>
     * <br/>序号: 28
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.animation">https://echarts.apache.org/v4/zh/option.html#series-sankey.animation</a>
     * <br/>序号: 29
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.animationThreshold">https://echarts.apache.org/v4/zh/option.html#series-sankey.animationThreshold</a>
     * <br/>序号: 30
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.animationDuration">https://echarts.apache.org/v4/zh/option.html#series-sankey.animationDuration</a>
     * <br/>序号: 31
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.animationEasing">https://echarts.apache.org/v4/zh/option.html#series-sankey.animationEasing</a>
     * <br/>序号: 32
     * <br/>默认值: linear
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.animationDelay">https://echarts.apache.org/v4/zh/option.html#series-sankey.animationDelay</a>
     * <br/>序号: 33
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.animationDurationUpdate">https://echarts.apache.org/v4/zh/option.html#series-sankey.animationDurationUpdate</a>
     * <br/>序号: 34
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.animationEasingUpdate">https://echarts.apache.org/v4/zh/option.html#series-sankey.animationEasingUpdate</a>
     * <br/>序号: 35
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.animationDelayUpdate">https://echarts.apache.org/v4/zh/option.html#series-sankey.animationDelayUpdate</a>
     * <br/>序号: 36
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.tooltip">https://echarts.apache.org/v4/zh/option.html#series-sankey.tooltip</a>
     * <br/>序号: 37
     * <br/>默认值: rgba(50,50,50,0.7)
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
