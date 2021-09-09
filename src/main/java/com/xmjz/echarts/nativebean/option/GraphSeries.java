package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.graphSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph">https://echarts.apache.org/zh/option.html#series-graph</a>
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>关系图</strong></p>
 * <p>用于展现节点以及节点之间的关系数据。</p>
 * <p><strong>示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=graph&amp;reset=1&amp;edit=1" width="600" height="400" data-ll-timeout="19"></iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class GraphSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.type">https://echarts.apache.org/zh/option.html#series-graph.type</a>
     * <br/>默认值: graph
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.id">https://echarts.apache.org/zh/option.html#series-graph.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.name">https://echarts.apache.org/zh/option.html#series-graph.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.legendHoverLink">https://echarts.apache.org/zh/option.html#series-graph.legendHoverLink</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否启用<a href="#legend">图例</a> hover 时的联动高亮。</p>
     */
    private Boolean legendHoverLink;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.coordinateSystem">https://echarts.apache.org/zh/option.html#series-graph.coordinateSystem</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该系列使用的坐标系，可选：</p>
     * <ul>
     * <li><p><code class="codespan">null</code> 或者 <code class="codespan">'none'</code></p>
     * <p>  无坐标系。</p>
     * </li>
     * </ul>
     * <ul>
     * <li><p><code class="codespan">'cartesian2d'</code></p>
     * <p>  使用二维的直角坐标系（也称笛卡尔坐标系），通过 <a href="#series-graph.xAxisIndex">xAxisIndex</a>, <a href="#series-graph.yAxisIndex">yAxisIndex</a>指定相应的坐标轴组件。</p>
     * </li>
     * </ul>
     * <ul>
     * <li><p><code class="codespan">'polar'</code></p>
     * <p>  使用极坐标系，通过 <a href="#series-graph.polarIndex">polarIndex</a> 指定相应的极坐标组件</p>
     * </li>
     * </ul>
     * <ul>
     * <li><p><code class="codespan">'geo'</code></p>
     * <p>  使用地理坐标系，通过 <a href="#series-graph.geoIndex">geoIndex</a> 指定相应的地理坐标系组件。</p>
     * </li>
     * </ul>
     * <ul>
     * <li><p><code class="codespan">'none'</code></p>
     * <p>  不使用坐标系。</p>
     * </li>
     * </ul>
     */
    private String coordinateSystem;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.xAxisIndex">https://echarts.apache.org/zh/option.html#series-graph.xAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的 <a href="#xAxis">x 轴</a>的 index，在单个图表实例中存在多个 x 轴的时候有用。</p>
     */
    private Integer xAxisIndex;

    public Integer getxAxisIndex() {
        return this.xAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.yAxisIndex">https://echarts.apache.org/zh/option.html#series-graph.yAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的 <a href="#yAxis">y 轴</a>的 index，在单个图表实例中存在多个 y轴的时候有用。</p>
     */
    private Integer yAxisIndex;

    public Integer getyAxisIndex() {
        return this.yAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.polarIndex">https://echarts.apache.org/zh/option.html#series-graph.polarIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的<a href="#polar">极坐标系</a>的 index，在单个图表实例中存在多个极坐标系的时候有用。</p>
     */
    private Integer polarIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.geoIndex">https://echarts.apache.org/zh/option.html#series-graph.geoIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的<a href="#geo">地理坐标系</a>的 index，在单个图表实例中存在多个地理坐标系的时候有用。</p>
     */
    private Integer geoIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.calendarIndex">https://echarts.apache.org/zh/option.html#series-graph.calendarIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的<a href="#calendar">日历坐标系</a>的 index，在单个图表实例中存在多个日历坐标系的时候有用。</p>
     */
    private Integer calendarIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.center">https://echarts.apache.org/zh/option.html#series-graph.center</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>当前视角的中心点</p>
     * <p>例如：</p>
     * <pre><code class="lang-js hljs javascript">center: [<span class="hljs-number">115.97</span>, <span class="hljs-number">29.71</span>]
     * </code></pre>
     */
    private List<?> center;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.zoom">https://echarts.apache.org/zh/option.html#series-graph.zoom</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前视角的缩放比例。</p>
     */
    private Integer zoom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.layout">https://echarts.apache.org/zh/option.html#series-graph.layout</a>
     * <br/>默认值: none
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图的布局。</p>
     * <p><strong>可选：</strong></p>
     * <ul>
     * <li><p><code class="codespan">'none'</code> 不采用任何布局，使用<a href="#series-graph.data">节点</a>中提供的 <a href="#series-graph.data.x">x</a>， <a href="#series-graph.data.y">y</a> 作为节点的位置。</p>
     * </li>
     * <li><p><code class="codespan">'circular'</code> 采用环形布局，见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=graph-circular-layout" target="_blank">Les Miserables</a>，布局相关的配置项见 <a href="#series-graph.circular">graph.circular</a></p>
     * </li>
     * <li><p><code class="codespan">'force'</code> 采用力引导布局，见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=graph-force" target="_blank">Force</a>，布局相关的配置项见 <a href="#series-graph.force">graph.force</a></p>
     * </li>
     * </ul>
     */
    private String layout;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.circular">https://echarts.apache.org/zh/option.html#series-graph.circular</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>环形布局相关配置</p>
     */
    private Circular circular;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.force">https://echarts.apache.org/zh/option.html#series-graph.force</a>
     * <br/>默认值: 50
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>力引导布局相关的配置项，力引导布局是模拟弹簧电荷模型在每两个节点之间添加一个斥力，每条边的两个节点之间添加一个引力，每次迭代节点会在各个斥力和引力的作用下移动位置，多次迭代后节点会静止在一个受力平衡的位置，达到整个模型的能量最小化。</p>
     * <p>力引导布局的结果有良好的对称性和局部聚合性，也比较美观。</p>
     */
    private Force force;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.roam">https://echarts.apache.org/zh/option.html#series-graph.roam</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>是否开启鼠标缩放和平移漫游。默认不开启。如果只想要开启缩放或者平移，可以设置成 <code class="codespan">'scale'</code> 或者 <code class="codespan">'move'</code>。设置成 <code class="codespan">true</code> 为都开启</p>
     */
    private Object roam;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.nodeScaleRatio">https://echarts.apache.org/zh/option.html#series-graph.nodeScaleRatio</a>
     * <br/>默认值: 0.6
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>鼠标漫游缩放时节点的相应缩放比例，当设为<code class="codespan">0</code>时节点不随着鼠标的缩放而缩放</p>
     */
    private Integer nodeScaleRatio;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.draggable">https://echarts.apache.org/zh/option.html#series-graph.draggable</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>节点是否可拖拽，只在使用力引导布局的时候有用。</p>
     */
    private Boolean draggable;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.edgeSymbol">https://echarts.apache.org/zh/option.html#series-graph.edgeSymbol</a>
     * <br/>默认值: ["none","none"]
     * <br/>js类型: ["Array","string"]
     * <br/>描述:
     * <p>边两端的标记类型，可以是一个数组分别指定两端，也可以是单个统一指定。默认不显示标记，常见的可以设置为箭头，如下：</p>
     * <pre><code class="lang-js hljs javascript">edgeSymbol: [<span class="hljs-string">'circle'</span>, <span class="hljs-string">'arrow'</span>]
     * </code></pre>
     */
    private Object edgeSymbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.edgeSymbolSize">https://echarts.apache.org/zh/option.html#series-graph.edgeSymbolSize</a>
     * <br/>默认值: 10
     * <br/>js类型: ["Array","number"]
     * <br/>描述:
     * <p>边两端的标记大小，可以是一个数组分别指定两端，也可以是单个统一指定。</p>
     */
    private Object edgeSymbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.cursor">https://echarts.apache.org/zh/option.html#series-graph.cursor</a>
     * <br/>默认值: pointer
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>鼠标悬浮时在图形元素上时鼠标的样式是什么。同 CSS 的 <code class="codespan">cursor</code>。</p>
     */
    private String cursor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.itemStyle">https://echarts.apache.org/zh/option.html#series-graph.itemStyle</a>
     * <br/>默认值: 自适应
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p> 图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.lineStyle">https://echarts.apache.org/zh/option.html#series-graph.lineStyle</a>
     * <br/>默认值: #aaa
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>关系边的公用线条样式。其中 <a href="#series-graph.lineStyle.color">lineStyle.color</a> 支持设置为<code class="codespan">'source'</code>或者<code class="codespan">'target'</code>特殊值，此时边会自动取源节点或目标节点的颜色作为自己的颜色。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.label">https://echarts.apache.org/zh/option.html#series-graph.label</a>
     * <br/>默认值: inside
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.edgeLabel">https://echarts.apache.org/zh/option.html#series-graph.edgeLabel</a>
     * <br/>默认值: middle
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private EdgeLabel edgeLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.labelLayout">https://echarts.apache.org/zh/option.html#series-graph.labelLayout</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.emphasis">https://echarts.apache.org/zh/option.html#series-graph.emphasis</a>
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态的图形样式。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.blur">https://echarts.apache.org/zh/option.html#series-graph.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出状态的图形样式。开启 <a href="#series-graph.emphasis.focus">emphasis.focus</a> 后有效。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.select">https://echarts.apache.org/zh/option.html#series-graph.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>选中状态的图形样式。开启 <a href="#series-graph.selectedMode">selectedMode</a> 后有效。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.selectedMode">https://echarts.apache.org/zh/option.html#series-graph.selectedMode</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories">https://echarts.apache.org/zh/option.html#series-graph.categories</a>
     * <br/>默认值: [0,0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>节点分类的类目，可选。</p>
     * <p>如果节点有分类的话可以通过 <a href="#series-graph.data.category">data[i].category</a> 指定每个节点的类目，类目的样式会被应用到节点样式上。<a href="#legend">图例</a>也可以基于<code class="codespan">categories</code>名字展现和筛选。</p>
     */
    private List<Categories> categories;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.autoCurveness">https://echarts.apache.org/zh/option.html#series-graph.autoCurveness</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","number","Array"]
     * <br/>描述:
     * <p>针对节点之间存在多边的情况，自动计算各边曲率，默认不开启。</p>
     * <p>设置为 <code class="codespan">true</code> 时，开启自动曲率计算，默认边曲率数组长度为 <code class="codespan">20</code>，如果两点间边数大于 <code class="codespan">20</code>，请使用 <code class="codespan">number</code> 或 <code class="codespan">Array</code> 设置边曲率数组。</p>
     * <p>设置为 <code class="codespan">number</code> 时，表示两点间边曲率数组的长度，由内部算法给出计算结果。</p>
     * <p>设置为 <code class="codespan">Array</code> 时，表示直接指定边曲率数组，多边曲率会从数组中直接按顺序选取。</p>
     * <p><strong>注意：</strong> 如果设置 <a href="#series-graph.lineStyle.curveness">lineStyle.curveness</a> 则此属性失效。</p>
     */
    private Object autoCurveness;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.data">https://echarts.apache.org/zh/option.html#series-graph.data</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>关系图的节点数据列表。</p>
     * <pre><code class="lang-js hljs javascript">data: [{
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'1'</span>,
     *     <span class="hljs-attr">x</span>: <span class="hljs-number">10</span>,
     *     <span class="hljs-attr">y</span>: <span class="hljs-number">10</span>,
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">10</span>
     * }, {
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'2'</span>,
     *     <span class="hljs-attr">x</span>: <span class="hljs-number">100</span>,
     *     <span class="hljs-attr">y</span>: <span class="hljs-number">100</span>,
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">20</span>,
     *     <span class="hljs-attr">symbolSize</span>: <span class="hljs-number">20</span>,
     *     <span class="hljs-attr">itemStyle</span>: {
     *         <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>
     *     }
     * }]
     * </code></pre>
     * <p><strong>注意:</strong> 节点的<code class="codespan">name</code>不能重复。</p>
     */
    private List<?> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.nodes">https://echarts.apache.org/zh/option.html#series-graph.nodes</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>别名，同 <a href="#series-graph.data">data</a></p>
     */
    private List<?> nodes;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links">https://echarts.apache.org/zh/option.html#series-graph.links</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>节点间的关系数据。示例：</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.edges">https://echarts.apache.org/zh/option.html#series-graph.edges</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>别名，同 <a href="#series-graph.links">links</a></p>
     */
    private List<?> edges;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.markPoint">https://echarts.apache.org/zh/option.html#series-graph.markPoint</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标注。</p>
     */
    private Object markPoint;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.markLine">https://echarts.apache.org/zh/option.html#series-graph.markLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标线。</p>
     */
    private Object markLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.markArea">https://echarts.apache.org/zh/option.html#series-graph.markArea</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。</p>
     */
    private Object markArea;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.zlevel">https://echarts.apache.org/zh/option.html#series-graph.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.z">https://echarts.apache.org/zh/option.html#series-graph.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.left">https://echarts.apache.org/zh/option.html#series-graph.left</a>
     * <br/>默认值: center
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.top">https://echarts.apache.org/zh/option.html#series-graph.top</a>
     * <br/>默认值: middle
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.right">https://echarts.apache.org/zh/option.html#series-graph.right</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.bottom">https://echarts.apache.org/zh/option.html#series-graph.bottom</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.width">https://echarts.apache.org/zh/option.html#series-graph.width</a>
     * <br/>默认值: 自适应
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件的宽度。</p>
     */
    private Object width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.height">https://echarts.apache.org/zh/option.html#series-graph.height</a>
     * <br/>默认值: 自适应
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件的高度。</p>
     */
    private Object height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.silent">https://echarts.apache.org/zh/option.html#series-graph.silent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.animation">https://echarts.apache.org/zh/option.html#series-graph.animation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.animationThreshold">https://echarts.apache.org/zh/option.html#series-graph.animationThreshold</a>
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.animationDuration">https://echarts.apache.org/zh/option.html#series-graph.animationDuration</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.animationEasing">https://echarts.apache.org/zh/option.html#series-graph.animationEasing</a>
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.animationDelay">https://echarts.apache.org/zh/option.html#series-graph.animationDelay</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.animationDurationUpdate">https://echarts.apache.org/zh/option.html#series-graph.animationDurationUpdate</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.animationEasingUpdate">https://echarts.apache.org/zh/option.html#series-graph.animationEasingUpdate</a>
     * <br/>默认值: cubicInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.animationDelayUpdate">https://echarts.apache.org/zh/option.html#series-graph.animationDelayUpdate</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.tooltip">https://echarts.apache.org/zh/option.html#series-graph.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
