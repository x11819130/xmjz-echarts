package com.xmjz.echarts.nativebean.option.series;

import com.xmjz.echarts.nativebean.option.Series;
import com.xmjz.echarts.nativebean.option.series.customSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom">#series-custom</a>
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>自定义系列</strong></p>
 * <p>自定义系列可以自定义系列中的图形元素渲染。从而能扩展出不同的图表。</p>
 * <p>同时，echarts 会统一管理图形的创建删除、动画、与其他组件（如 <a href="https://echarts.apache.org/zh/option.html#dataZoom">dataZoom</a>、<a href="https://echarts.apache.org/zh/option.html#visualMap">visualMap</a>）的联动，使开发者不必纠结这些细节。</p>
 * <p><strong>例如，下面的例子使用 custom series 扩展出了 x-range 图：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=custom-profile&amp;reset=1&amp;edit=1" width="800" height="500" data-ll-timeout="23"></iframe>
 *
 *
 * <p><strong>更多的例子参见：<a href="https://echarts.apache.org/examples/zh/index.html#chart-type-custom" target="_blank">custom examples</a></strong></p>
 * <p><strong><a href="tutorial.html#%E8%87%AA%E5%AE%9A%E4%B9%89%E7%B3%BB%E5%88%97" target="_blank">这里是个教程</a></strong></p>
 * <p><strong>开发者自定义渲染逻辑（renderItem 函数）</strong></p>
 * <p>custom 系列需要开发者自己提供图形渲染的逻辑。这个渲染逻辑一般命名为 <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem">renderItem</a>。例如：</p>
 * <pre><code class="lang-ts hljs typescript"><span class="hljs-keyword">var</span> option = {
 *     ...,
 *     series: [{
 *         <span class="hljs-keyword">type</span>: <span class="hljs-string">'custom'</span>,
 *         renderItem: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">params, api</span>) </span>{
 *             <span class="hljs-keyword">var</span> categoryIndex = api.value(<span class="hljs-number">0</span>);
 *             <span class="hljs-keyword">var</span> start = api.coord([api.value(<span class="hljs-number">1</span>), categoryIndex]);
 *             <span class="hljs-keyword">var</span> end = api.coord([api.value(<span class="hljs-number">2</span>), categoryIndex]);
 *             <span class="hljs-keyword">var</span> height = api.size([<span class="hljs-number">0</span>, <span class="hljs-number">1</span>])[<span class="hljs-number">1</span>] * <span class="hljs-number">0.6</span>;
 *
 *             <span class="hljs-keyword">var</span> rectShape = echarts.graphic.clipRectByRect({
 *                 x: start[<span class="hljs-number">0</span>],
 *                 y: start[<span class="hljs-number">1</span>] - height / <span class="hljs-number">2</span>,
 *                 width: end[<span class="hljs-number">0</span>] - start[<span class="hljs-number">0</span>],
 *                 height: height
 *             }, {
 *                 x: params.coordSys.x,
 *                 y: params.coordSys.y,
 *                 width: params.coordSys.width,
 *                 height: params.coordSys.height
 *             });
 *
 *             <span class="hljs-keyword">return</span> rectShape &amp;&amp; {
 *                 <span class="hljs-keyword">type</span>: <span class="hljs-string">'rect'</span>,
 *                 shape: rectShape,
 *                 style: api.style()
 *             };
 *         },
 *         data: data
 *     }]
 * }
 * </code></pre>
 * <p>对于 <code class="codespan">data</code> 中的每个数据项（为方便描述，这里称为 <code class="codespan">dataItem</code>)，会调用此 <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem">renderItem</a> 函数。</p>
 * <p><a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem">renderItem</a> 函数提供了两个参数：</p>
 * <ul>
 * <li><a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.arguments.params">params</a>：包含了当前数据信息和坐标系的信息。</li>
 * <li><a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.arguments.api">api</a>：是一些开发者可调用的方法集合。</li>
 * </ul>
 * <p><a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem">renderItem</a> 函数须返回根据此 <code class="codespan">dataItem</code> 绘制出的图形元素的定义信息，参见 <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return">renderItem.return</a>。</p>
 * <p>一般来说，<a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem">renderItem</a> 函数的主要逻辑，是将 <code class="codespan">dataItem</code> 里的值映射到坐标系上的图形元素。这一般需要用到 <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.arguments.api">renderItem.arguments.api</a> 中的两个函数：</p>
 * <ul>
 * <li><a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.arguments.api.value">api.value(...)</a>，意思是取出 <code class="codespan">dataItem</code> 中的数值。例如 <code class="codespan">api.value(0)</code> 表示取出当前 <code class="codespan">dataItem</code> 中第一个维度的数值。</li>
 * <li><a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.arguments.api.coord">api.coord(...)</a>，意思是进行坐标转换计算。例如 <code class="codespan">var point = api.coord([api.value(0), api.value(1)])</code> 表示 <code class="codespan">dataItem</code> 中的数值转换成坐标系上的点。</li>
 * </ul>
 * <p>有时候还需要用到 <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.arguments.api.size">api.size(...)</a> 函数，表示得到坐标系上一段数值范围对应的长度。</p>
 * <p>返回值中样式的设置可以使用 <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.arguments.api.style">api.style(...)</a> 函数，他能得到 <a href="https://echarts.apache.org/zh/option.html#series-custom.itemStyle">series.itemStyle</a> 中定义的样式信息，以及视觉映射的样式信息。也可以用这种方式覆盖这些样式信息：<code class="codespan">api.style({fill: 'green', stroke: 'yellow'})</code>。</p>
 * <p><strong>维度的映射（encode 和 dimensions 属性）</strong></p>
 * <p><code class="codespan">custom</code> 系列往往需要定义 <a href="https://echarts.apache.org/zh/option.html#series-custom.encode">series.encode</a>，主要用于指明 <code class="codespan">data</code> 的哪些维度映射到哪些数轴上。从而，echarts 能根据这些维度的值的范围，画出合适的数轴刻度。
 * 同时，encode.tooltip 和 encode.label 也可以被指定，指明默认的 tooltip 和 label 显示什么内容。<a href="https://echarts.apache.org/zh/option.html#series-custom.dimensions">series.dimensions</a> 也可以被指定，指明显示在 tooltip 中的维度名称，或者维度的类型。</p>
 * <p>例如：</p>
 * <pre><code class="lang-ts hljs typescript">series: {
 *     <span class="hljs-keyword">type</span>: <span class="hljs-string">'custom'</span>,
 *     renderItem: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params"></span>) </span>{
 *         ...
 *     },
 *     encode: {
 *         x: [<span class="hljs-number">2</span>, <span class="hljs-number">4</span>, <span class="hljs-number">3</span>],
 *         y: <span class="hljs-number">1</span>,
 *         label: <span class="hljs-number">0</span>,
 *         tooltip: [<span class="hljs-number">2</span>, <span class="hljs-number">4</span>, <span class="hljs-number">3</span>]
 *     }
 * }
 * </code></pre>
 * <p><strong>与 dataZoom 组件的结合</strong></p>
 * <p>与 <a href="https://echarts.apache.org/zh/option.html#dataZoom">dataZoom</a> 结合使用的时候，常常使用会设置 <a href="https://echarts.apache.org/zh/option.html#dataZoom.filterMode">dataZoom.filterMode</a> 为 'weakFilter'，从而让 <code class="codespan">dataItem</code> 部分超出坐标系边界的时候，不会整体被过滤掉。</p>
 * <p><strong>关于 <code class="codespan">dataIndex</code> 和 <code class="codespan">dataIndexInside</code> 的区别</strong></p>
 * <ul>
 * <li><code class="codespan">dataIndex</code> 指的 <code class="codespan">dataItem</code> 在原始数据中的 index。</li>
 * <li><code class="codespan">dataIndexInside</code> 指的是 <code class="codespan">dataItem</code> 在当前数据窗口（参见 <a href="https://echarts.apache.org/zh/option.html#dataZoom">dataZoom</a>）中的 index。</li>
 * </ul>
 * <p><a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.arguments.api">renderItem.arguments.api</a> 中使用的参数都是 <code class="codespan">dataIndexInside</code> 而非 <code class="codespan">dataIndex</code>，因为从 <code class="codespan">dataIndex</code> 转换成 <code class="codespan">dataIndexInside</code> 需要时间开销。</p>
 * <p><strong>Event listener</strong></p>
 * <pre><code class="lang-ts hljs typescript">chart.setOption({
 *     <span class="hljs-comment">// ...</span>
 *     series: {
 *         <span class="hljs-keyword">type</span>: <span class="hljs-string">'custom'</span>,
 *         renderItem: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params"></span>) </span>{
 *             <span class="hljs-comment">// ...</span>
 *             <span class="hljs-keyword">return</span> {
 *                 <span class="hljs-keyword">type</span>: <span class="hljs-string">'group'</span>,
 *                 children: [{
 *                     <span class="hljs-keyword">type</span>: <span class="hljs-string">'circle'</span>
 *                     <span class="hljs-comment">// ...</span>
 *                 }, {
 *                     <span class="hljs-keyword">type</span>: <span class="hljs-string">'circle'</span>,
 *                     name: <span class="hljs-string">'aaa'</span>,
 *                     <span class="hljs-comment">// 用户指定的信息，可以在 event handler 访问到。</span>
 *                     info: <span class="hljs-number">12345</span>,
 *                     <span class="hljs-comment">// ...</span>
 *                 }]
 *             };
 *         }
 *     }
 * });
 * chart.on(<span class="hljs-string">'click'</span>, {element: <span class="hljs-string">'aaa'</span>}, <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">params</span>) </span>{
 *     <span class="hljs-comment">// 当 name 为 'aaa' 的图形元素被点击时，此回调被触发。</span>
 *     <span class="hljs-built_in">console</span>.log(params.info);
 * });
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class CustomSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.type">#series-custom.type</a>
     * <br/>默认值: 'custom'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.id">#series-custom.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.name">#series-custom.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="https://echarts.apache.org/zh/option.html#tooltip">tooltip</a>的显示，<a href="https://echarts.apache.org/zh/option.html#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.colorBy">#series-custom.colorBy</a>
     * <br/>默认值: 'series'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.2.0</code> 开始支持</p>
     * </blockquote>
     * <p>从调色盘 <a href="https://echarts.apache.org/zh/option.html#color">option.color</a> 中取色的策略，可取值为：</p>
     * <ul>
     * <li><code class="codespan">'series'</code>：按照系列分配调色盘中的颜色，同一系列中的所有数据都是用相同的颜色；</li>
     * <li><code class="codespan">'data'</code>：按照数据项分配调色盘中的颜色，每个数据项都使用不同的颜色。</li>
     * </ul>
     */
    private String colorBy;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.legendHoverLink">#series-custom.legendHoverLink</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否启用<a href="https://echarts.apache.org/zh/option.html#legend">图例</a> hover 时的联动高亮。</p>
     */
    private Boolean legendHoverLink;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.coordinateSystem">#series-custom.coordinateSystem</a>
     * <br/>默认值: 'cartesian2d'
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
     * <p>  使用二维的直角坐标系（也称笛卡尔坐标系），通过 <a href="https://echarts.apache.org/zh/option.html#series-custom.xAxisIndex">xAxisIndex</a>, <a href="https://echarts.apache.org/zh/option.html#series-custom.yAxisIndex">yAxisIndex</a>指定相应的坐标轴组件。</p>
     * </li>
     * </ul>
     * <ul>
     * <li><p><code class="codespan">'polar'</code></p>
     * <p>  使用极坐标系，通过 <a href="https://echarts.apache.org/zh/option.html#series-custom.polarIndex">polarIndex</a> 指定相应的极坐标组件</p>
     * </li>
     * </ul>
     * <ul>
     * <li><p><code class="codespan">'geo'</code></p>
     * <p>  使用地理坐标系，通过 <a href="https://echarts.apache.org/zh/option.html#series-custom.geoIndex">geoIndex</a> 指定相应的地理坐标系组件。</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.xAxisIndex">#series-custom.xAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的 <a href="https://echarts.apache.org/zh/option.html#xAxis">x 轴</a>的 index，在单个图表实例中存在多个 x 轴的时候有用。</p>
     */
    private Integer xAxisIndex;

    public Integer getxAxisIndex() {
        return this.xAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.yAxisIndex">#series-custom.yAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的 <a href="https://echarts.apache.org/zh/option.html#yAxis">y 轴</a>的 index，在单个图表实例中存在多个 y轴的时候有用。</p>
     */
    private Integer yAxisIndex;

    public Integer getyAxisIndex() {
        return this.yAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.polarIndex">#series-custom.polarIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的<a href="https://echarts.apache.org/zh/option.html#polar">极坐标系</a>的 index，在单个图表实例中存在多个极坐标系的时候有用。</p>
     */
    private Integer polarIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.geoIndex">#series-custom.geoIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的<a href="https://echarts.apache.org/zh/option.html#geo">地理坐标系</a>的 index，在单个图表实例中存在多个地理坐标系的时候有用。</p>
     */
    private Integer geoIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.calendarIndex">#series-custom.calendarIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的<a href="https://echarts.apache.org/zh/option.html#calendar">日历坐标系</a>的 index，在单个图表实例中存在多个日历坐标系的时候有用。</p>
     */
    private Integer calendarIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.itemStyle">#series-custom.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p> 图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.labelLine">#series-custom.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.labelLayout">#series-custom.labelLayout</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object","Function"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>标签的统一布局配置。</p>
     * <p>该配置项是在每个系列默认的标签布局基础上，统一调整标签的<code class="codespan">(x, y)</code>位置，标签对齐等属性以实现想要的标签布局效果。</p>
     * <p>该配置项也可以是一个有如下参数的回调函数</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-comment">// 标签对应数据的 dataIndex</span>
     * dataIndex: <span class="hljs-built_in">number</span>
     * <span class="hljs-comment">// 标签对应的数据类型，只在关系图中会有 node 和 edge 数据类型的区分</span>
     * dataType?: <span class="hljs-built_in">string</span>
     * <span class="hljs-comment">// 标签对应的系列的 index</span>
     * seriesIndex: <span class="hljs-built_in">number</span>
     * <span class="hljs-comment">// 标签显示的文本</span>
     * text: <span class="hljs-built_in">string</span>
     * <span class="hljs-comment">// 默认的标签的包围盒，由系列默认的标签布局决定</span>
     * labelRect: {x: <span class="hljs-built_in">number</span>, y: <span class="hljs-built_in">number</span>, width: <span class="hljs-built_in">number</span>, height: <span class="hljs-built_in">number</span>}
     * <span class="hljs-comment">// 默认的标签水平对齐</span>
     * align: <span class="hljs-string">'left'</span> | <span class="hljs-string">'center'</span> | <span class="hljs-string">'right'</span>
     * <span class="hljs-comment">// 默认的标签垂直对齐</span>
     * verticalAlign: <span class="hljs-string">'top'</span> | <span class="hljs-string">'middle'</span> | <span class="hljs-string">'bottom'</span>
     * <span class="hljs-comment">// 标签所对应的数据图形的包围盒，可用于定位标签位置</span>
     * rect: {x: <span class="hljs-built_in">number</span>, y: <span class="hljs-built_in">number</span>, width: <span class="hljs-built_in">number</span>, height: <span class="hljs-built_in">number</span>}
     * <span class="hljs-comment">// 默认引导线的位置，目前只有饼图(pie)和漏斗图(funnel)有默认标签位置</span>
     * <span class="hljs-comment">// 如果没有该值则为 null</span>
     * labelLinePoints?: <span class="hljs-built_in">number</span>[][]
     * </code></pre>
     * <p><strong>示例：</strong></p>
     * <p>将标签显示在图形右侧 10px 的位置，并且垂直居中：</p>
     * <pre><code class="lang-ts hljs typescript">labelLayout(params) {
     *     <span class="hljs-keyword">return</span> {
     *         x: params.rect.x + <span class="hljs-number">10</span>,
     *         y: params.rect.y + params.rect.height / <span class="hljs-number">2</span>,
     *         verticalAlign: <span class="hljs-string">'middle'</span>,
     *         align: <span class="hljs-string">'left'</span>
     *     }
     * }
     * </code></pre>
     * <p>根据图形的包围盒尺寸决定文本尺寸</p>
     * <pre><code class="lang-ts hljs typescript">
     * labelLayout(params) {
     *     <span class="hljs-keyword">return</span> {
     *         fontSize: <span class="hljs-built_in">Math</span>.max(params.rect.width / <span class="hljs-number">10</span>, <span class="hljs-number">5</span>)
     *     };
     * }
     * </code></pre>
     */
    private LabelLayout labelLayout;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.selectedMode">#series-custom.selectedMode</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>选中模式的配置，表示是否支持多个选中，默认关闭，支持布尔值和字符串，字符串取值可选<code class="codespan">'single'</code>，<code class="codespan">'multiple'</code>，<code class="codespan">'series'</code> 分别表示单选，多选以及选择整个系列。</p>
     * <blockquote>
     * <p>从 v5.3.0 开始支持 <code class="codespan">'series'</code>。</p>
     * </blockquote>
     */
    private Object selectedMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.dimensions">#series-custom.dimensions</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>使用 dimensions 定义 <code class="codespan">series.data</code> 或者 <code class="codespan">dataset.source</code> 的每个维度的信息。</p>
     * <p>注意：如果使用了 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>，那么可以在 <a href="https://echarts.apache.org/zh/option.html#dataset.dimensions">dataset.dimensions</a> 中定义 dimension ，或者在 <a href="https://echarts.apache.org/zh/option.html#dataset.source">dataset.source</a> 的第一行/列中给出 dimension 名称。于是就不用在这里指定 dimension。但如果在这里指定了 <code class="codespan">dimensions</code>，那么优先使用这里的。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">option = {
     *     dataset: {
     *         source: [
     *             <span class="hljs-comment">// 有了上面 dimensions 定义后，下面这五个维度的名称分别为：</span>
     *             <span class="hljs-comment">// 'date', 'open', 'close', 'highest', 'lowest'</span>
     *             [<span class="hljs-number">12</span>, <span class="hljs-number">44</span>, <span class="hljs-number">55</span>, <span class="hljs-number">66</span>, <span class="hljs-number">2</span>],
     *             [<span class="hljs-number">23</span>, <span class="hljs-number">6</span>, <span class="hljs-number">16</span>, <span class="hljs-number">23</span>, <span class="hljs-number">1</span>],
     *             ...
     *         ]
     *     },
     *     series: {
     *         <span class="hljs-keyword">type</span>: <span class="hljs-string">'xxx'</span>,
     *         <span class="hljs-comment">// 定义了每个维度的名称。这个名称会被显示到默认的 tooltip 中。</span>
     *         dimensions: [<span class="hljs-string">'date'</span>, <span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>]
     *     }
     * }
     * </code></pre>
     * <pre><code class="lang-ts hljs typescript">series: {
     *     <span class="hljs-keyword">type</span>: <span class="hljs-string">'xxx'</span>,
     *     dimensions: [
     *         <span class="hljs-literal">null</span>,                <span class="hljs-comment">// 如果此维度不想给出定义，则使用 null 即可</span>
     *         {<span class="hljs-keyword">type</span>: <span class="hljs-string">'ordinal'</span>},   <span class="hljs-comment">// 只定义此维度的类型。</span>
     *                              <span class="hljs-comment">// 'ordinal' 表示离散型，一般文本使用这种类型。</span>
     *                              <span class="hljs-comment">// 如果类型没有被定义，会自动猜测类型。</span>
     *         {name: <span class="hljs-string">'good'</span>, <span class="hljs-keyword">type</span>: <span class="hljs-string">'number'</span>},
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
     * <li><code class="codespan">time</code>，表示时间类型。设置成 'time' 则能支持自动解析数据成时间戳（timestamp），比如该维度的数据是 '2017-05-10'，会自动被解析。时间类型的支持参见 <a href="https://echarts.apache.org/zh/option.html#series.data">data</a>。</li>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.encode">#series-custom.encode</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>可以定义 <code class="codespan">data</code> 的哪个维度被编码成什么。比如：</p>
     * <pre><code class="lang-ts hljs typescript">option = {
     *     dataset: {
     *         source: [
     *             <span class="hljs-comment">// 每一列称为一个『维度』。</span>
     *             <span class="hljs-comment">// 这里分别是维度 0、1、2、3、4。</span>
     *             [<span class="hljs-number">12</span>, <span class="hljs-number">44</span>, <span class="hljs-number">55</span>, <span class="hljs-number">66</span>, <span class="hljs-number">2</span>],
     *             [<span class="hljs-number">23</span>, <span class="hljs-number">6</span>, <span class="hljs-number">16</span>, <span class="hljs-number">23</span>, <span class="hljs-number">1</span>],
     *             ...
     *         ]
     *     },
     *     series: {
     *         <span class="hljs-keyword">type</span>: <span class="hljs-string">'xxx'</span>,
     *         encode: {
     *             x: [<span class="hljs-number">3</span>, <span class="hljs-number">1</span>, <span class="hljs-number">5</span>],      <span class="hljs-comment">// 表示维度 3、1、5 映射到 x 轴。</span>
     *             y: <span class="hljs-number">2</span>,              <span class="hljs-comment">// 表示维度 2 映射到 y 轴。</span>
     *             tooltip: [<span class="hljs-number">3</span>, <span class="hljs-number">2</span>, <span class="hljs-number">4</span>] <span class="hljs-comment">// 表示维度 3、2、4 会在 tooltip 中显示。</span>
     *         }
     *     }
     * }
     * </code></pre>
     * <p>当使用 <a href="https://echarts.apache.org/zh/option.html#series.dimensions">dimensions</a> 给维度定义名称后，<code class="codespan">encode</code> 中可直接引用名称，例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: {
     *     <span class="hljs-keyword">type</span>: <span class="hljs-string">'xxx'</span>,
     *     dimensions: [<span class="hljs-string">'date'</span>, <span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>],
     *     encode: {
     *         x: <span class="hljs-string">'date'</span>,
     *         y: [<span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>]
     *     }
     * }
     * </code></pre>
     * <p><code class="codespan">encode</code> 声明的基本结构如下，其中冒号左边是坐标系、标签等特定名称，如 <code class="codespan">'x'</code>, <code class="codespan">'y'</code>, <code class="codespan">'tooltip'</code> 等，冒号右边是数据中的维度名（string 格式）或者维度的序号（number 格式，从 0 开始计数），可以指定一个或多个维度（使用数组）。通常情况下，下面各种信息不需要所有的都写，按需写即可。</p>
     * <p>下面是 encode 支持的属性：</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-comment">// 在任何坐标系和系列中，都支持：</span>
     * encode: {
     *     <span class="hljs-comment">// 使用 “名为 product 的维度” 和 “名为 score 的维度” 的值在 tooltip 中显示</span>
     *     tooltip: [<span class="hljs-string">'product'</span>, <span class="hljs-string">'score'</span>]
     *     <span class="hljs-comment">// 使用第一个维度和第三个维度的维度名连起来作为系列名。（有时候名字比较长，这可以避免在 series.name 重复输入这些名字）</span>
     *     seriesName: [<span class="hljs-number">1</span>, <span class="hljs-number">3</span>],
     *     <span class="hljs-comment">// 表示使用第二个维度中的值作为 id。这在使用 setOption 动态更新数据时有用处，可以使新老数据用 id 对应起来，从而能够产生合适的数据更新动画。</span>
     *     itemId: <span class="hljs-number">2</span>,
     *     <span class="hljs-comment">// 指定数据项的名称使用第三个维度在饼图等图表中有用，可以使这个名字显示在图例（legend）中。</span>
     *     itemName: <span class="hljs-number">3</span>,
     *     <span class="hljs-comment">// 指定数据项的组 ID (groupID)，组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画，具体见 universalTransition</span>
     *     itemGroupId: <span class="hljs-number">4</span>
     * }
     *
     * <span class="hljs-comment">// 直角坐标系（grid/cartesian）特有的属性：</span>
     * encode: {
     *     <span class="hljs-comment">// 把 “维度1”、“维度5”、“名为 score 的维度” 映射到 X 轴：</span>
     *     x: [<span class="hljs-number">1</span>, <span class="hljs-number">5</span>, <span class="hljs-string">'score'</span>],
     *     <span class="hljs-comment">// 把“维度0”映射到 Y 轴。</span>
     *     y: <span class="hljs-number">0</span>
     * }
     *
     * <span class="hljs-comment">// 单轴（singleAxis）特有的属性：</span>
     * encode: {
     *     single: <span class="hljs-number">3</span>
     * }
     *
     * <span class="hljs-comment">// 极坐标系（polar）特有的属性：</span>
     * encode: {
     *     radius: <span class="hljs-number">3</span>,
     *     angle: <span class="hljs-number">2</span>
     * }
     *
     * <span class="hljs-comment">// 地理坐标系（geo）特有的属性：</span>
     * encode: {
     *     lng: <span class="hljs-number">3</span>,
     *     lat: <span class="hljs-number">2</span>
     * }
     *
     * <span class="hljs-comment">// 对于一些没有坐标系的图表，例如饼图、漏斗图等，可以是：</span>
     * encode: {
     *     value: <span class="hljs-number">3</span>
     * }
     * </code></pre>
     * <p>这是个更丰富的 <code class="codespan">encode</code> 的<a href="https://echarts.apache.org/examples/zh/view.html?c=dataset-encode1&amp;edit=1&amp;reset=1" target="_blank">示例</a>：</p>
     * <p>特殊地，在 <a href="https://echarts.apache.org/zh/option.html#series-custom">自定义系列（custom series）</a> 中，<code class="codespan">encode</code> 中轴可以不指定或设置为 <code class="codespan">null/undefined</code>，从而使系列免于受这个轴控制，也就是说，轴的范围（extent）不会受此系列数值的影响，轴被 <a href="https://echarts.apache.org/zh/option.html#dataZoom">dataZoom</a> 控制时也不会过滤掉这个系列：</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-keyword">var</span> option = {
     *     xAxis: {},
     *     yAxis: {},
     *     dataZoom: [{
     *         xAxisIndex: <span class="hljs-number">0</span>
     *     }, {
     *         yAxisIndex: <span class="hljs-number">0</span>
     *     }],
     *     series: {
     *         <span class="hljs-keyword">type</span>: <span class="hljs-string">'custom'</span>,
     *         renderItem: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">params, api</span>) </span>{
     *             <span class="hljs-keyword">return</span> {
     *                 <span class="hljs-keyword">type</span>: <span class="hljs-string">'circle'</span>,
     *                 shape: {
     *                     cx: <span class="hljs-number">100</span>, <span class="hljs-comment">// x 位置永远为 100</span>
     *                     cy: api.coord([<span class="hljs-number">0</span>, api.value(<span class="hljs-number">0</span>)])[<span class="hljs-number">1</span>],
     *                     r: <span class="hljs-number">30</span>
     *                 },
     *                 style: {
     *                     fill: <span class="hljs-string">'blue'</span>
     *                 }
     *             };
     *         },
     *         encode: {
     *             <span class="hljs-comment">// 这样这个系列就不会被 x 轴以及 x</span>
     *             <span class="hljs-comment">// 轴上的 dataZoom 控制了。</span>
     *             x: <span class="hljs-number">-1</span>,
     *             y: <span class="hljs-number">1</span>
     *         },
     *         data: [ ... ]
     *     }
     * };
     * </code></pre>
     */
    private Object encode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.seriesLayoutBy">#series-custom.seriesLayoutBy</a>
     * <br/>默认值: 'column'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>当使用 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a> 时，<code class="codespan">seriesLayoutBy</code> 指定了 <code class="codespan">dataset</code> 中用行还是列对应到系列上，也就是说，系列“排布”到 <code class="codespan">dataset</code> 的行还是列上。可取值：</p>
     * <ul>
     * <li>'column'：默认，<code class="codespan">dataset</code> 的列对应于系列，从而 <code class="codespan">dataset</code> 中每一列是一个维度（dimension）。</li>
     * <li>'row'：<code class="codespan">dataset</code> 的行对应于系列，从而 <code class="codespan">dataset</code> 中每一行是一个维度（dimension）。</li>
     * </ul>
     * <p>参见这个 <a href="https://echarts.apache.org/examples/zh/editor.html?c=dataset-series-layout-by&amp;theme=lite" target="_blank">示例</a></p>
     */
    private String seriesLayoutBy;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.datasetIndex">#series-custom.datasetIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果 <a href="https://echarts.apache.org/zh/option.html#series.data">series.data</a> 没有指定，并且 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a> 存在，那么就会使用 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>。<code class="codespan">datasetIndex</code> 指定本系列使用那个 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>。</p>
     */
    private Integer datasetIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.dataGroupId">#series-custom.dataGroupId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该系列所有数据共有的组 ID。组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画。</p>
     * <p>如果你使用了<a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>组件来表达数据，推荐使用<code class="codespan">encode.itemGroupID</code>来指定哪个维度被编码为组 ID。</p>
     */
    private String dataGroupId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.data">#series-custom.data</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>系列中的数据内容数组。数组项通常为具体的数据项。</p>
     * <p>注意，如果系列没有指定 <code class="codespan">data</code>，并且 option 有 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>，那么默认使用第一个 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>。如果指定了 <code class="codespan">data</code>，则不会再使用 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>。</p>
     * <p>可以使用 <code class="codespan">series.datasetIndex</code> 指定其他的 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>。</p>
     * <p>通常来说，数据用一个二维数组表示。如下，每一列被称为一个『维度』。</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     data: [
     *         <span class="hljs-comment">// 维度X   维度Y   其他维度 ...</span>
     *         [  <span class="hljs-number">3.4</span>,    <span class="hljs-number">4.5</span>,   <span class="hljs-number">15</span>,   <span class="hljs-number">43</span>],
     *         [  <span class="hljs-number">4.2</span>,    <span class="hljs-number">2.3</span>,   <span class="hljs-number">20</span>,   <span class="hljs-number">91</span>],
     *         [  <span class="hljs-number">10.8</span>,   <span class="hljs-number">9.5</span>,   <span class="hljs-number">30</span>,   <span class="hljs-number">18</span>],
     *         [  <span class="hljs-number">7.2</span>,    <span class="hljs-number">8.8</span>,   <span class="hljs-number">18</span>,   <span class="hljs-number">57</span>]
     *     ]
     * }]
     * </code></pre>
     * <ul>
     * <li>在 <a href="https://echarts.apache.org/zh/option.html#grid">直角坐标系 (grid)</a> 中『维度X』和『维度Y』会默认对应于 <a href="https://echarts.apache.org/zh/option.html#xAxis">xAxis</a> 和 <a href="https://echarts.apache.org/zh/option.html#yAxis">yAxis</a>。</li>
     * <li>在 <a href="https://echarts.apache.org/zh/option.html#polar">极坐标系 (polar)</a> 中『维度X』和『维度Y』会默认对应于 <a href="https://echarts.apache.org/zh/option.html#radiusAxis">radiusAxis</a> 和 <a href="https://echarts.apache.org/zh/option.html#anbleAxis">angleAxis</a>。</li>
     * <li>后面的其他维度是可选的，可以在别处被使用，例如：<ul>
     * <li>在 <a href="https://echarts.apache.org/zh/option.html#visualMap">visualMap</a> 中可以将一个或多个维度映射到颜色，大小等多个图形属性上。</li>
     * <li>在 <a href="https://echarts.apache.org/zh/option.html#series.symbolSize">series.symbolSize</a> 中可以使用回调函数，基于某个维度得到 symbolSize 值。</li>
     * <li>使用 <a href="https://echarts.apache.org/zh/option.html#tooltip.formatter">tooltip.formatter</a> 或 <a href="https://echarts.apache.org/zh/option.html#series.label.formatter">series.label.formatter</a> 可以把其他维度的值展示出来。</li>
     * </ul>
     * </li>
     * </ul>
     * <p>特别地，当只有一个轴为类目轴（axis.type 为 <code class="codespan">'category'</code>）的时候，数据可以简化用一个一维数组表示。例如：</p>
     * <pre><code class="lang-ts hljs typescript">xAxis: {
     *     data: [<span class="hljs-string">'a'</span>, <span class="hljs-string">'b'</span>, <span class="hljs-string">'m'</span>, <span class="hljs-string">'n'</span>]
     * },
     * series: [{
     *     <span class="hljs-comment">// 与 xAxis.data 一一对应。</span>
     *     data: [<span class="hljs-number">23</span>,  <span class="hljs-number">44</span>,  <span class="hljs-number">55</span>,  <span class="hljs-number">19</span>]
     *     <span class="hljs-comment">// 它其实是下面这种形式的简化：</span>
     *     <span class="hljs-comment">// data: [[0, 23], [1, 44], [2, 55], [3, 19]]</span>
     * }]
     * </code></pre>
     * <p><strong>『值』与 <a href="https://echarts.apache.org/zh/option.html#xAxis.type">轴类型</a> 的关系：</strong></p>
     * <ul>
     * <li><p>当某维度对应于数值轴（axis.type 为 <code class="codespan">'value'</code> 或者 <code class="codespan">'log'</code>）的时候：</p>
     * <p>  其值可以为 <code class="codespan">number</code>（例如 <code class="codespan">12</code>）。（也可以兼容 <code class="codespan">string</code> 形式的 number，例如 <code class="codespan">'12'</code>）</p>
     * </li>
     * <li><p>当某维度对应于类目轴（axis.type 为 <code class="codespan">'category'</code>）的时候：</p>
     * <p>  其值须为类目的『序数』（从 <code class="codespan">0</code> 开始）或者类目的『字符串值』。例如：</p>
     * <pre><code class="lang-ts hljs typescript">  xAxis: {
     *       <span class="hljs-keyword">type</span>: <span class="hljs-string">'category'</span>,
     *       data: [<span class="hljs-string">'星期一'</span>, <span class="hljs-string">'星期二'</span>, <span class="hljs-string">'星期三'</span>, <span class="hljs-string">'星期四'</span>]
     *   },
     *   yAxis: {
     *       <span class="hljs-keyword">type</span>: <span class="hljs-string">'category'</span>,
     *       data: [<span class="hljs-string">'a'</span>, <span class="hljs-string">'b'</span>, <span class="hljs-string">'m'</span>, <span class="hljs-string">'n'</span>, <span class="hljs-string">'p'</span>, <span class="hljs-string">'q'</span>]
     *   },
     *   series: [{
     *       data: [
     *           <span class="hljs-comment">// xAxis    yAxis</span>
     *           [  <span class="hljs-number">0</span>,        <span class="hljs-number">0</span>,    <span class="hljs-number">2</span>  ], <span class="hljs-comment">// 意思是此点位于 xAxis: '星期一', yAxis: 'a'。</span>
     *           [  <span class="hljs-string">'星期四'</span>,  <span class="hljs-number">2</span>,    <span class="hljs-number">1</span>  ], <span class="hljs-comment">// 意思是此点位于 xAxis: '星期四', yAxis: 'm'。</span>
     *           [  <span class="hljs-number">2</span>,       <span class="hljs-string">'p'</span>,   <span class="hljs-number">2</span>  ], <span class="hljs-comment">// 意思是此点位于 xAxis: '星期三', yAxis: 'p'。</span>
     *           [  <span class="hljs-number">3</span>,        <span class="hljs-number">3</span>,    <span class="hljs-number">5</span>  ]
     *       ]
     *   }]
     * </code></pre>
     * <p>  双类目轴的示例可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=scatter-punchCard" target="_blank">Github Punchcard</a> 示例。</p>
     * </li>
     * <li><p>当某维度对应于时间轴（type 为 <code class="codespan">'time'</code>）的时候，值可以为：</p>
     * <ul>
     * <li>一个时间戳，如 <code class="codespan">1484141700832</code>，表示 UTC 时间。</li>
     * <li>或者字符串形式的时间描述：<ul>
     * <li><a href="http://www.ecma-international.org/ecma-262/5.1/#sec-15.9.1.15" target="_blank">ISO 8601</a> 的子集，只包含这些形式（这几种格式，除非指明时区，否则均表示本地时间，与 <a href="https://momentjs.com/" target="_blank">moment</a> 一致）：<ul>
     * <li>部分年月日时间: <code class="codespan">'2012-03'</code>, <code class="codespan">'2012-03-01'</code>, <code class="codespan">'2012-03-01 05'</code>, <code class="codespan">'2012-03-01 05:06'</code>.</li>
     * <li>使用 <code class="codespan">'T'</code> 或空格分割: <code class="codespan">'2012-03-01T12:22:33.123'</code>, <code class="codespan">'2012-03-01 12:22:33.123'</code>.</li>
     * <li>时区设定: <code class="codespan">'2012-03-01T12:22:33Z'</code>, <code class="codespan">'2012-03-01T12:22:33+8000'</code>, <code class="codespan">'2012-03-01T12:22:33-05:00'</code>.</li>
     * </ul>
     * </li>
     * <li>其他的时间字符串，包括（均表示本地时间）:
     * <code class="codespan">'2012'</code>, <code class="codespan">'2012-3-1'</code>, <code class="codespan">'2012/3/1'</code>, <code class="codespan">'2012/03/01'</code>,
     * <code class="codespan">'2009/6/12 2:00'</code>, <code class="codespan">'2009/6/12 2:05:08'</code>, <code class="codespan">'2009/6/12 2:05:08.123'</code></li>
     * </ul>
     * </li>
     * <li>或者用户自行初始化的 Date 实例：<ul>
     * <li>注意，用户自行初始化 Date 实例的时候，<a href="http://dygraphs.com/date-formats.html" target="_blank">浏览器的行为有差异，不同字符串的表示也不同</a>。</li>
     * <li>例如：在 chrome 中，<code class="codespan">new Date('2012-01-01')</code> 表示 UTC 时间的 2012 年 1 月 1 日，而 <code class="codespan">new Date('2012-1-1')</code> 和 <code class="codespan">new Date('2012/01/01')</code> 表示本地时间的 2012 年 1 月 1 日。在 safari 中，不支持 <code class="codespan">new Date('2012-1-1')</code> 这种表示方法。</li>
     * <li>所以，使用 <code class="codespan">new Date(dataString)</code> 时，可使用第三方库解析（如 <a href="https://momentjs.com/" target="_blank">moment</a>），或者使用 <code class="codespan">echarts.number.parseDate</code>，或者参见 <a href="http://dygraphs.com/date-formats.html" target="_blank">这里</a>。</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p><strong>当需要对个别数据进行个性化定义时：</strong></p>
     * <p>数组项可用对象，其中的 <code class="codespan">value</code> 像表示具体的数值，如：</p>
     * <pre><code class="lang-ts hljs typescript">[
     *     <span class="hljs-number">12</span>,
     *     <span class="hljs-number">34</span>,
     *     {
     *         value : <span class="hljs-number">56</span>,
     *         <span class="hljs-comment">//自定义标签样式，仅对该数据项有效</span>
     *         label: {},
     *         <span class="hljs-comment">//自定义特殊 itemStyle，仅对该数据项有效</span>
     *         itemStyle:{}
     *     },
     *     <span class="hljs-number">10</span>
     * ]
     * <span class="hljs-comment">// 或</span>
     * [
     *     [<span class="hljs-number">12</span>, <span class="hljs-number">33</span>],
     *     [<span class="hljs-number">34</span>, <span class="hljs-number">313</span>],
     *     {
     *         value: [<span class="hljs-number">56</span>, <span class="hljs-number">44</span>],
     *         label: {},
     *         itemStyle:{}
     *     },
     *     [<span class="hljs-number">10</span>, <span class="hljs-number">33</span>]
     * ]
     * </code></pre>
     * <p><strong>空值：</strong></p>
     * <p>当某数据不存在时（ps：<em>不存在</em>不代表值为 0），可以用 <code class="codespan">'-'</code> 或者 <code class="codespan">null</code> 或者 <code class="codespan">undefined</code> 或者 <code class="codespan">NaN</code> 表示。</p>
     * <p>例如，无数据在折线图中可表现为该点是断开的，在其它图中可表示为图形不存在。</p>
     */
    private List<Data> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.clip">#series-custom.clip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.4.0</code> 开始支持</p>
     * </blockquote>
     * <p>是否裁剪超出坐标系部分的图形，具体裁剪效果根据系列决定：</p>
     * <ul>
     * <li>散点图/带有涟漪特效动画的散点（气泡）图：忽略中心点超出坐标系的图形，但是不裁剪单个图形</li>
     * <li>柱状图：裁掉完全超出的柱子，但是不会裁剪只超出部分的柱子</li>
     * <li>折线图：裁掉所有超出坐标系的折线部分，拐点图形的逻辑按照散点图处理</li>
     * <li>路径图：裁掉所有超出坐标系的部分</li>
     * <li>K 线图：忽略整体都超出坐标系的图形，但是不裁剪单个图形</li>
     * <li>自定义系列：裁掉所有超出坐标系的部分</li>
     * </ul>
     * <p>除了自定义系列，其它系列的默认值都为 true，及开启裁剪，如果你觉得不想要裁剪的话，可以设置成 false 关闭。</p>
     */
    private Boolean clip;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.zlevel">#series-custom.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>自定义图所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.z">#series-custom.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>自定义图组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.silent">#series-custom.silent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.animation">#series-custom.animation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.animationThreshold">#series-custom.animationThreshold</a>
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.animationDuration">#series-custom.animationDuration</a>
     * <br/>默认值: 1000
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>初始动画的时长，支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的初始动画效果：</p>
     * <pre><code class="lang-ts hljs typescript">animationDuration: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDuration;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.animationEasing">#series-custom.animationEasing</a>
     * <br/>默认值: 'cubicOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.animationDelay">#series-custom.animationDelay</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>初始动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的初始动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-ts hljs typescript">animationDelay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.animationDurationUpdate">#series-custom.animationDurationUpdate</a>
     * <br/>默认值: 300
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的时长。</p>
     * <p>支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的更新动画效果：</p>
     * <pre><code class="lang-ts hljs typescript">animationDurationUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDurationUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.animationEasingUpdate">#series-custom.animationEasingUpdate</a>
     * <br/>默认值: 'cubicInOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.animationDelayUpdate">#series-custom.animationDelayUpdate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-ts hljs typescript">animationDelayUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelayUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.universalTransition">#series-custom.universalTransition</a>
     * <br/>默认值: 无
     * <br/>js类型: ["object"]
     * <br/>描述:
     * <p>全局过渡动画相关的配置。</p>
     * <p>全局过渡动画（Universal Transition）提供了任意系列之间进行变形动画的功能。开启该功能后，每次<code class="codespan">setOption</code>，相同<code class="codespan">id</code>的系列之间会自动关联进行动画的过渡，更细粒度的关联配置见<code class="codespan">universalTransition.seriesKey</code>配置。</p>
     * <p>通过配置<code class="codespan">encode.itemGroupId</code>或者<code class="codespan">dataGroupId</code>等指定数据的分组，还可以实现诸如下钻，聚合等一对多或者多对一的动画。</p>
     * <p>可以直接在系列中配置 <code class="codespan">universalTransition: true</code> 开启该功能。也可以提供一个对象进行更多属性的配置。</p>
     */
    private UniversalTransition universalTransition;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.tooltip">#series-custom.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
