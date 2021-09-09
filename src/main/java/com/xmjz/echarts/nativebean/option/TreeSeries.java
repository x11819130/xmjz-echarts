package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.treeSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree">https://echarts.apache.org/zh/option.html#series-tree</a>
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>树图</strong></p>
 * <p>树图主要用来可视化树形数据结构，是一种特殊的层次类型，具有唯一的根节点，左子树，和右子树。</p>
 * <p><strong>注意：目前不支持在单个 series 中直接绘制森林，可以通过在一个 option 中配置多个 series 实现森林</strong></p>
 * <p><strong>树图示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=tree-vertical&amp;edit=1&amp;reset=1" width="900" height="780" data-ll-timeout="19"></iframe>
 *
 *
 * <p><strong>多个 series 组合成森林示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=tree-legend&amp;edit=1&amp;reset=1" width="800" height="680"></iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class TreeSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.type">https://echarts.apache.org/zh/option.html#series-tree.type</a>
     * <br/>默认值: tree
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.id">https://echarts.apache.org/zh/option.html#series-tree.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.name">https://echarts.apache.org/zh/option.html#series-tree.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.zlevel">https://echarts.apache.org/zh/option.html#series-tree.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.z">https://echarts.apache.org/zh/option.html#series-tree.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.left">https://echarts.apache.org/zh/option.html#series-tree.left</a>
     * <br/>默认值: 12%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>tree组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.top">https://echarts.apache.org/zh/option.html#series-tree.top</a>
     * <br/>默认值: 12%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>tree组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.right">https://echarts.apache.org/zh/option.html#series-tree.right</a>
     * <br/>默认值: 12%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>tree组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.bottom">https://echarts.apache.org/zh/option.html#series-tree.bottom</a>
     * <br/>默认值: 12%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>tree组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.width">https://echarts.apache.org/zh/option.html#series-tree.width</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>tree组件的宽度。</p>
     */
    private Object width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.height">https://echarts.apache.org/zh/option.html#series-tree.height</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>tree组件的高度。</p>
     */
    private Object height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.layout">https://echarts.apache.org/zh/option.html#series-tree.layout</a>
     * <br/>默认值: orthogonal
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>树图的布局，有 <code class="codespan">正交</code> 和 <code class="codespan">径向</code> 两种。这里的 <code class="codespan">正交布局</code> 就是我们通常所说的 <code class="codespan">水平</code> 和 <code class="codespan">垂直</code> 方向，对应的参数取值为 <code class="codespan">'orthogonal'</code> 。而 <code class="codespan">径向布局</code> 是指以根节点为圆心，每一层节点为环，一层层向外发散绘制而成的布局，对应的参数取值为 <code class="codespan">'radial'</code> 。</p>
     * <p><strong>正交布局示例：</strong></p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=tree-basic&amp;edit=1&amp;reset=1" width="780" height="900"></iframe>
     *
     *
     *
     * <p><strong>径向布局示例：</strong></p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=tree-radial&amp;edit=1&amp;reset=1" width="800" height="800"></iframe>
     */
    private String layout;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.orient">https://echarts.apache.org/zh/option.html#series-tree.orient</a>
     * <br/>默认值: LR
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>树图中 <code class="codespan">正交布局</code> 的方向，也就是说只有在 <code class="codespan">layout = 'orthogonal'</code> 的时候，该配置项才生效。对应有 <code class="codespan">水平</code> 方向的 <code class="codespan">从左到右</code>，<code class="codespan">从右到左</code>；以及垂直方向的 <code class="codespan">从上到下</code>，<code class="codespan">从下到上</code>。取值分别为 <code class="codespan">'LR'</code> , <code class="codespan">'RL'</code>, <code class="codespan">'TB'</code>, <code class="codespan">'BT'</code>。<strong>注意</strong>，之前的配置项值 <code class="codespan">'horizontal'</code> 等同于 <code class="codespan">'LR'</code>， <code class="codespan">'vertical'</code> 等同于 <code class="codespan">'TB'</code>。</p>
     */
    private String orient;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.symbol">https://echarts.apache.org/zh/option.html#series-tree.symbol</a>
     * <br/>默认值: emptyCircle
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>标记的图形。</p>
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
     * </code></pre><p>如果需要每个数据的图形不一样，可以设置为如下格式的回调函数：</p>
     * <pre><code class="lang-js hljs javascript">(value: <span class="hljs-built_in">Array</span>|number, <span class="hljs-attr">params</span>: <span class="hljs-built_in">Object</span>) =&gt; string
     * </code></pre>
     * <p>其中第一个参数 <code class="codespan">value</code> 为 <a href="#series-tree.data">data</a> 中的数据值。第二个参数<code class="codespan">params</code> 是其它的数据项参数。</p>
     */
    private Object symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.symbolSize">https://echarts.apache.org/zh/option.html#series-tree.symbolSize</a>
     * <br/>默认值: 7
     * <br/>js类型: ["number","Array","Function"]
     * <br/>描述:
     * <p>标记的大小，可以设置成诸如 <code class="codespan">10</code> 这样单一的数字，也可以用数组分开表示宽和高，例如 <code class="codespan">[20, 10]</code> 表示标记宽为<code class="codespan">20</code>，高为<code class="codespan">10</code>。</p>
     * <p>如果需要每个数据的图形大小不一样，可以设置为如下格式的回调函数：</p>
     * <pre><code class="lang-js hljs javascript">(value: <span class="hljs-built_in">Array</span>|number, <span class="hljs-attr">params</span>: <span class="hljs-built_in">Object</span>) =&gt; number|<span class="hljs-built_in">Array</span>
     * </code></pre>
     * <p>其中第一个参数 <code class="codespan">value</code> 为 <a href="#series-tree.data">data</a> 中的数据值。第二个参数<code class="codespan">params</code> 是其它的数据项参数。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.symbolRotate">https://echarts.apache.org/zh/option.html#series-tree.symbolRotate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>标记的旋转角度（而非弧度）。正值表示逆时针旋转。注意在 <code class="codespan">markLine</code> 中当 <code class="codespan">symbol</code> 为 <code class="codespan">'arrow'</code> 时会忽略 <code class="codespan">symbolRotate</code> 强制设置为切线的角度。</p>
     * <p>如果需要每个数据的旋转角度不一样，可以设置为如下格式的回调函数：</p>
     * <pre><code class="lang-js hljs javascript">(value: <span class="hljs-built_in">Array</span>|number, <span class="hljs-attr">params</span>: <span class="hljs-built_in">Object</span>) =&gt; number
     * </code></pre>
     * <p>其中第一个参数 <code class="codespan">value</code> 为 <a href="#series-tree.data">data</a> 中的数据值。第二个参数<code class="codespan">params</code> 是其它的数据项参数。</p>
     * <blockquote>
     * <p>从 4.8.0 开始支持回调函数。</p>
     * </blockquote>
     */
    private Object symbolRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.symbolKeepAspect">https://echarts.apache.org/zh/option.html#series-tree.symbolKeepAspect</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>如果 <code class="codespan">symbol</code> 是 <code class="codespan">path://</code> 的形式，是否在缩放时保持该图形的长宽比。</p>
     */
    private Boolean symbolKeepAspect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.symbolOffset">https://echarts.apache.org/zh/option.html#series-tree.symbolOffset</a>
     * <br/>默认值: [0,0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。</p>
     * <p>例如 <code class="codespan">[0, '-50%']</code> 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。</p>
     */
    private List<?> symbolOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.edgeShape">https://echarts.apache.org/zh/option.html#series-tree.edgeShape</a>
     * <br/>默认值: curve
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.7.0</code> 开始支持</p>
     * </blockquote>
     * <p>树图在 <code class="codespan">正交布局</code> 下，边的形状。分别有曲线和折线两种，对应的取值是 <code class="codespan">curve</code> 和 <code class="codespan">polyline</code>.</p>
     * <p><strong>注意：该配置项只在 <code class="codespan">正交布局</code> 下有效，在经向布局下的开发环境中会报错。</strong></p>
     */
    private String edgeShape;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.edgeForkPosition">https://echarts.apache.org/zh/option.html#series-tree.edgeForkPosition</a>
     * <br/>默认值: 50%
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>正交布局下当边的形状是折线时，子树中折线段分叉的位置。这里的位置指的是分叉点与子树父节点的距离占整个子树高度的百分比。默认取值是 <code class="codespan">'50%'</code>，可以是 ['0', '100%'] 之间。</p>
     * <p><strong>注意：该配置项只有在 <code class="codespan">edgeShape = 'polyline'</code> 时才有效。</strong></p>
     */
    private String edgeForkPosition;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.roam">https://echarts.apache.org/zh/option.html#series-tree.roam</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>是否开启鼠标缩放和平移漫游。默认不开启。如果只想要开启缩放或者平移，可以设置成 <code class="codespan">'scale'</code> 或者 <code class="codespan">'move'</code>。设置成 <code class="codespan">true</code> 为都开启</p>
     */
    private Object roam;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.expandAndCollapse">https://echarts.apache.org/zh/option.html#series-tree.expandAndCollapse</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>子树折叠和展开的交互，<code class="codespan">默认打开</code> 。由于绘图区域是有限的，而通常一个树图的节点可能会比较多，这样就会出现节点之间相互遮盖的问题。为了避免这一问题，可以将暂时无关的子树折叠收起，等到需要时再将其展开。如上面径向布局树图示例，节点中心用蓝色填充的就是折叠收起的子树，可以点击将其展开。</p>
     * <p><strong>注意：如果配置自定义的图片作为节点的标记，是无法通过填充色来区分当前节点是否有折叠的子树的。而目前暂不支持，上传两张图片分别表示节点折叠和展开两种状态。所以，如果想明确地显示节点的两种状态，建议使用 <code class="codespan">ECharts</code> 常规的标记类型，如 <code class="codespan">'emptyCircle'</code> 等。</strong></p>
     */
    private Boolean expandAndCollapse;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.initialTreeDepth">https://echarts.apache.org/zh/option.html#series-tree.initialTreeDepth</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>树图初始展开的层级（深度）。根节点是第 0 层，然后是第 1 层、第 2 层，... ，直到叶子节点。该配置项主要和 <code class="codespan">折叠展开</code> 交互一起使用，目的还是为了防止一次展示过多节点，节点之间发生遮盖。如果设置为 <code class="codespan">-1</code> 或者 <code class="codespan">null</code> 或者 <code class="codespan">undefined</code>，所有节点都将展开。</p>
     */
    private Integer initialTreeDepth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.itemStyle">https://echarts.apache.org/zh/option.html#series-tree.itemStyle</a>
     * <br/>默认值: 自适应
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>树图中每个节点的样式，其中 <a href="#series-tree.itemStyle.color">itemStyle.color</a> 表示节点的填充色，用来区别当前节点所对应的子树折叠或展开的状态。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.label">https://echarts.apache.org/zh/option.html#series-tree.label</a>
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了每个节点所对应的文本标签的样式。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.labelLayout">https://echarts.apache.org/zh/option.html#series-tree.labelLayout</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object","Function"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>标签的统一布局配置。</p>
     * <p>该配置项是在每个系列默认的标签布局基础上，统一调整标签的<code class="codespan">(x, y)</code>位置，标签对齐等属性以实现想要的标签布局效果。</p>
     * <p>该配置项也可以是一个有如下参数的回调函数</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 标签对应数据的 dataIndex</span>
     * <span class="hljs-attr">dataIndex</span>: number
     * <span class="hljs-comment">// 标签对应的数据类型，只在关系图中会有 node 和 edge 数据类型的区分</span>
     * dataType?: string
     * <span class="hljs-comment">// 标签对应的系列的 index</span>
     * <span class="hljs-attr">seriesIndex</span>: number
     * <span class="hljs-comment">// 标签显示的文本</span>
     * <span class="hljs-attr">text</span>: string
     * <span class="hljs-comment">// 默认的标签的包围盒，由系列默认的标签布局决定</span>
     * <span class="hljs-attr">labelRect</span>: {<span class="hljs-attr">x</span>: number, <span class="hljs-attr">y</span>: number, <span class="hljs-attr">width</span>: number, <span class="hljs-attr">height</span>: number}
     * <span class="hljs-comment">// 默认的标签水平对齐</span>
     * <span class="hljs-attr">align</span>: <span class="hljs-string">'left'</span> | <span class="hljs-string">'center'</span> | <span class="hljs-string">'right'</span>
     * <span class="hljs-comment">// 默认的标签垂直对齐</span>
     * <span class="hljs-attr">verticalAlign</span>: <span class="hljs-string">'top'</span> | <span class="hljs-string">'middle'</span> | <span class="hljs-string">'bottom'</span>
     * <span class="hljs-comment">// 标签所对应的数据图形的包围盒，可用于定位标签位置</span>
     * <span class="hljs-attr">rect</span>: {<span class="hljs-attr">x</span>: number, <span class="hljs-attr">y</span>: number, <span class="hljs-attr">width</span>: number, <span class="hljs-attr">height</span>: number}
     * <span class="hljs-comment">// 默认引导线的位置，目前只有饼图(pie)和漏斗图(funnel)有默认标签位置</span>
     * <span class="hljs-comment">// 如果没有该值则为 null</span>
     * labelLinePoints?: number[][]
     * </code></pre>
     * <p><strong>示例：</strong></p>
     * <p>将标签显示在图形右侧 10px 的位置，并且垂直居中：</p>
     * <pre><code class="lang-js hljs javascript">labelLayout(params) {
     *     <span class="hljs-keyword">return</span> {
     *         <span class="hljs-attr">x</span>: params.rect.x + <span class="hljs-number">10</span>,
     *         <span class="hljs-attr">y</span>: params.rect.y + params.rect.height / <span class="hljs-number">2</span>,
     *         <span class="hljs-attr">verticalAlign</span>: <span class="hljs-string">'middle'</span>,
     *         <span class="hljs-attr">align</span>: <span class="hljs-string">'left'</span>
     *     }
     * }
     * </code></pre>
     * <p>根据图形的包围盒尺寸决定文本尺寸</p>
     * <pre><code class="lang-js hljs javascript">
     * labelLayout(params) {
     *     <span class="hljs-keyword">return</span> {
     *         <span class="hljs-attr">fontSize</span>: <span class="hljs-built_in">Math</span>.max(params.rect.width / <span class="hljs-number">10</span>, <span class="hljs-number">5</span>)
     *     };
     * }
     * </code></pre>
     */
    private LabelLayout labelLayout;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.lineStyle">https://echarts.apache.org/zh/option.html#series-tree.lineStyle</a>
     * <br/>默认值: #ccc
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>定义树图边的样式。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.emphasis">https://echarts.apache.org/zh/option.html#series-tree.emphasis</a>
     * <br/>默认值: none
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>树图中个图形和标签高亮的样式。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.blur">https://echarts.apache.org/zh/option.html#series-tree.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出状态的相关配置。开启 <a href="#series-tree.emphasis.focus">emphasis.focus</a> 后有效。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.select">https://echarts.apache.org/zh/option.html#series-tree.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>选中状态的相关配置。开启 <a href="#series-tree.selectedMode">selectedMode</a> 后有效。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.selectedMode">https://echarts.apache.org/zh/option.html#series-tree.selectedMode</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.leaves">https://echarts.apache.org/zh/option.html#series-tree.leaves</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>叶子节点的特殊配置，如上面的树图实例中，叶子节点和非叶子节点的标签位置不同。</p>
     */
    private Leaves leaves;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data">https://echarts.apache.org/zh/option.html#series-tree.data</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><a href="#series-tree.data">series-tree.data</a> 的数据格式是树状结构的，例如：</p>
     * <pre><code class="lang-javascript hljs">{ <span class="hljs-comment">// 注意，最外层是一个对象，代表树的根节点</span>
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">"flare"</span>,    <span class="hljs-comment">// 节点的名称，当前节点 label 对应的文本</span>
     *     <span class="hljs-attr">label</span>: {          <span class="hljs-comment">// 此节点特殊的 label 配置（如果需要的话）。</span>
     *         ...           <span class="hljs-comment">// label的格式参见 series-tree.label。</span>
     *     },
     *     <span class="hljs-attr">itemStyle</span>: {      <span class="hljs-comment">// 此节点特殊的 itemStyle 配置（如果需要的话）。</span>
     *         ...           <span class="hljs-comment">// label的格式参见 series-tree.itemStyle。</span>
     *     },
     *     <span class="hljs-attr">children</span>: [
     *         {
     *             <span class="hljs-attr">name</span>: <span class="hljs-string">"flex"</span>,
     *             <span class="hljs-attr">value</span>: <span class="hljs-number">4116</span>,    <span class="hljs-comment">// value 值，只在 tooltip 中显示</span>
     *             <span class="hljs-attr">label</span>: {
     *                 ...
     *             },
     *             <span class="hljs-attr">itemStyle</span>: {
     *                 ...
     *             },
     *             <span class="hljs-attr">collapsed</span>: <span class="hljs-literal">null</span>, <span class="hljs-comment">// 如果为 true，表示此节点默认折叠。</span>
     *             <span class="hljs-attr">children</span>: [...] <span class="hljs-comment">// 叶子节点没有 children, 可以不写</span>
     *         },
     *         ...
     *     ]
     * };
     * </code></pre>
     */
    private Object data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.tooltip">https://echarts.apache.org/zh/option.html#series-tree.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
