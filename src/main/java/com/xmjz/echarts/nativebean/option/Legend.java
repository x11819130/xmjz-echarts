package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.legend.TextStyle;
import com.xmjz.echarts.nativebean.option.legend.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend">https://echarts.apache.org/zh/option.html#legend</a>
 * <br/>序号: 2
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>图例组件。</p>
 * <p>图例组件展现了不同系列的标记(symbol)，颜色和名字。可以通过点击图例控制哪些系列不显示。</p>
 * <p>ECharts 3 中单个 echarts 实例中可以存在多个图例组件，会方便多个图例的布局。</p>
 * <p>当图例数量过多时，可以使用 <a href="https://echarts.apache.org/examples/zh/editor.html?c=pie-legend&amp;edit=1&amp;reset=1" target="_blank">滚动图例（垂直）</a> 或 <a href="https://echarts.apache.org/examples/zh/editor.html?c=radar2&amp;edit=1&amp;reset=1" target="_blank">滚动图例（水平）</a>，参见：<a href="#legend.type">legend.type</a></p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Legend implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.type
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图例的类型。可选值：</p>
     * <ul>
     * <li><code class="codespan">'plain'</code>：普通图例。缺省就是普通图例。</li>
     * <li><code class="codespan">'scroll'</code>：可滚动翻页的图例。当图例数量较多时可以使用。</li>
     * </ul>
     * <p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=pie-legend&amp;edit=1&amp;reset=1" target="_blank">滚动图例（垂直）</a> 或 <a href="https://echarts.apache.org/examples/zh/editor.html?c=radar2&amp;edit=1&amp;reset=1" target="_blank">滚动图例（水平）</a>。</p>
     * <p>当使用 <code class="codespan">'scroll'</code> 时，使用这些设置进行细节配置：</p>
     * <ul>
     * <li><a href="#legend.scrollDataIndex">legend.scrollDataIndex</a></li>
     * <li><a href="#legend.pageButtonItemGap">legend.pageButtonItemGap</a></li>
     * <li><a href="#legend.pageButtonGap">legend.pageButtonGap</a></li>
     * <li><a href="#legend.pageButtonPosition">legend.pageButtonPosition</a></li>
     * <li><a href="#legend.pageFormatter">legend.pageFormatter</a></li>
     * <li><a href="#legend.pageIcons">legend.pageIcons</a></li>
     * <li><a href="#legend.pageIconColor">legend.pageIconColor</a></li>
     * <li><a href="#legend.pageIconInactiveColor">legend.pageIconInactiveColor</a></li>
     * <li><a href="#legend.pageIconSize">legend.pageIconSize</a></li>
     * <li><a href="#legend.pageTextStyle">legend.pageTextStyle</a></li>
     * <li><a href="#legend.animation">legend.animation</a></li>
     * <li><a href="#legend.animationDurationUpdate">legend.animationDurationUpdate</a></li>
     * </ul>
     */
    private String type;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.id
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.show
     * <br/>序号: 3
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     */
    private Boolean show;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.zlevel
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
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.z
     * <br/>序号: 5
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.left
     * <br/>序号: 6
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>图例组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.top
     * <br/>序号: 7
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>图例组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.right
     * <br/>序号: 8
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>图例组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.bottom
     * <br/>序号: 9
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>图例组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.width
     * <br/>序号: 10
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>图例组件的宽度。默认自适应。</p>
     */
    private Object width;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.height
     * <br/>序号: 11
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>图例组件的高度。默认自适应。</p>
     */
    private Object height;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.orient
     * <br/>序号: 12
     * <br/>默认值: horizontal
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图例列表的布局朝向。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'horizontal'</code></li>
     * <li><code class="codespan">'vertical'</code></li>
     * </ul>
     */
    private String orient;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.align
     * <br/>序号: 13
     * <br/>默认值: auto
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图例标记和文本的对齐。默认自动，根据组件的位置和 orient 决定，当组件的 <a href="#legend.left">left</a> 值为 <code class="codespan">'right'</code> 以及纵向布局（<a href="#legend.orient">orient</a> 为 <code class="codespan">'vertical'</code>）的时候为右对齐，即为 <code class="codespan">'right'</code>。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'auto'</code></li>
     * <li><code class="codespan">'left'</code></li>
     * <li><code class="codespan">'right'</code></li>
     * </ul>
     */
    private String align;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.padding
     * <br/>序号: 14
     * <br/>默认值: 5
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>图例内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距。</p>
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
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.itemGap
     * <br/>序号: 15
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图例每项之间的间隔。横向布局时为水平间隔，纵向布局时为纵向间隔。</p>
     */
    private Integer itemGap;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.itemWidth
     * <br/>序号: 16
     * <br/>默认值: 25
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图例标记的图形宽度。</p>
     */
    private Integer itemWidth;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.itemHeight
     * <br/>序号: 17
     * <br/>默认值: 14
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图例标记的图形高度。</p>
     */
    private Integer itemHeight;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.symbolKeepAspect
     * <br/>序号: 18
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>如果图标（可能来自系列的 <code class="codespan">symbol</code> 或用户自定义的 <code class="codespan">legend.data.icon</code>）是 <code class="codespan">path://</code> 的形式，是否在缩放时保持该图形的长宽比。</p>
     */
    private Boolean symbolKeepAspect;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.formatter
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>用来格式化图例文本，支持字符串模板和回调函数两种形式。</p>
     * <p>示例：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 使用字符串模板，模板变量为图例名称 {name}</span>
     * <span class="hljs-attr">formatter</span>: <span class="hljs-string">'Legend {name}'</span>
     * <span class="hljs-comment">// 使用回调函数</span>
     * <span class="hljs-attr">formatter</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">name</span>) </span>{
     *     <span class="hljs-keyword">return</span> <span class="hljs-string">'Legend '</span> + name;
     * }
     * </code></pre>
     */
    private Object formatter;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.selectedMode
     * <br/>序号: 20
     * <br/>默认值: true
     * <br/>js类型: ["string","boolean"]
     * <br/>描述:
     * <p>图例选择的模式，控制是否可以通过点击图例改变系列的显示状态。默认开启图例选择，可以设成 <code class="codespan">false</code> 关闭。</p>
     * <p>除此之外也可以设成 <code class="codespan">'single'</code> 或者  <code class="codespan">'multiple'</code> 使用单选或者多选模式。</p>
     */
    private Object selectedMode;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.inactiveColor
     * <br/>序号: 21
     * <br/>默认值: #ccc
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>图例关闭时的颜色。</p>
     */
    private String inactiveColor;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.selected
     * <br/>序号: 22
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图例选中状态表。</p>
     * <p>示例：</p>
     * <pre><code class="hljs javascript">selected: {
     *     <span class="hljs-comment">// 选中'系列1'</span>
     *     <span class="hljs-string">'系列1'</span>: <span class="hljs-literal">true</span>,
     *     <span class="hljs-comment">// 不选中'系列2'</span>
     *     <span class="hljs-string">'系列2'</span>: <span class="hljs-literal">false</span>
     * }
     * </code></pre>
     */
    private Object selected;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.textStyle
     * <br/>序号: 23
     * <br/>默认值: #333
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图例的公用文本样式。</p>
     */
    private TextStyle textStyle;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.tooltip
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图例的 tooltip 配置，配置项同 <a href="#tooltip">tooltip</a>。默认不显示，可以在 legend 文字很多的时候对文字做裁剪并且开启 tooltip，如下示例：</p>
     * <pre><code class="lang-js hljs javascript">legend: {
     *     <span class="hljs-attr">formatter</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">name</span>) </span>{
     *         <span class="hljs-keyword">return</span> echarts.format.truncateText(name, <span class="hljs-number">40</span>, <span class="hljs-string">'14px Microsoft Yahei'</span>, <span class="hljs-string">'…'</span>);
     *     },
     *     <span class="hljs-attr">tooltip</span>: {
     *         <span class="hljs-attr">show</span>: <span class="hljs-literal">true</span>
     *     }
     * }
     * </code></pre>
     */
    private Object tooltip;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.icon
     * <br/>序号: 25
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图例项的 icon。</p>
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
    private String icon;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.data
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>图例的数据数组。数组项通常为一个字符串，每一项代表一个系列的 <code class="codespan">name</code>（如果是<a href="#series-pie">饼图</a>，也可以是饼图单个数据的 <code class="codespan">name</code>）。图例组件会自动根据对应系列的图形标记（symbol）来绘制自己的颜色和标记，特殊字符串 <code class="codespan">''</code>（空字符串）或者 <code class="codespan">'\n'</code>（换行字符串）用于图例的换行。</p>
     * <p>如果 <code class="codespan">data</code> 没有被指定，会自动从当前系列中获取。多数系列会取自 <a href="#series.name">series.name</a> 或者 <a href="#series.encode">series.encode</a> 的 <code class="codespan">seriesName</code> 所指定的维度。如 <a href="#series-pie">饼图</a> and <a href="#series-funnel">漏斗图</a> 等会取自 series.data 中的 name。</p>
     * <p>如果要设置单独一项的样式，也可以把该项写成配置项对象。此时必须使用 <code class="codespan">name</code> 属性对应表示系列的 <code class="codespan">name</code>。</p>
     * <p>示例</p>
     * <pre><code class="hljs javascript">data: [{
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'系列1'</span>,
     *     <span class="hljs-comment">// 强制设置图形为圆。</span>
     *     <span class="hljs-attr">icon</span>: <span class="hljs-string">'circle'</span>,
     *     <span class="hljs-comment">// 设置文本为红色</span>
     *     <span class="hljs-attr">textStyle</span>: {
     *         <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>
     *     }
     * }]
     * </code></pre>
     */
    private List<Object> data;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.backgroundColor
     * <br/>序号: 27
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>图例背景色，默认透明。</p>
     * <blockquote>
     * <p>颜色可以使用 RGB 表示，比如 <code class="codespan">'rgb(128, 128, 128)'</code>   ，如果想要加上 alpha 通道，可以使用 RGBA，比如 <code class="codespan">'rgba(128, 128, 128, 0.5)'</code>，也可以使用十六进制格式，比如 <code class="codespan">'#ccc'</code></p>
     * </blockquote>
     */
    private String backgroundColor;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.borderColor
     * <br/>序号: 28
     * <br/>默认值: #ccc
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>图例的边框颜色。支持的颜色格式同 backgroundColor。</p>
     */
    private String borderColor;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.borderWidth
     * <br/>序号: 29
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图例的边框线宽。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.borderRadius
     * <br/>序号: 30
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>圆角半径，单位px，支持传入数组分别指定 4 个圆角半径。
     * 如:</p>
     * <pre><code class="hljs javascript">borderRadius: <span class="hljs-number">5</span>, <span class="hljs-comment">// 统一设置四个角的圆角大小</span>
     * <span class="hljs-attr">borderRadius</span>: [<span class="hljs-number">5</span>, <span class="hljs-number">5</span>, <span class="hljs-number">0</span>, <span class="hljs-number">0</span>] <span class="hljs-comment">//（顺时针左上，右上，右下，左下）</span>
     * </code></pre>
     */
    private Object borderRadius;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.shadowBlur
     * <br/>序号: 31
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形阴影的模糊大小。该属性配合 <code class="codespan">shadowColor</code>,<code class="codespan">shadowOffsetX</code>, <code class="codespan">shadowOffsetY</code> 一起设置图形的阴影效果。</p>
     * <p>示例：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">shadowColor</span>: <span class="hljs-string">'rgba(0, 0, 0, 0.5)'</span>,
     *     <span class="hljs-attr">shadowBlur</span>: <span class="hljs-number">10</span>
     * }
     * </code></pre>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code> 以及值不为 <code class="codespan">tranparent</code> 的背景色 <code class="codespan">backgroundColor</code>。</p>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.shadowColor
     * <br/>序号: 32
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.shadowOffsetX
     * <br/>序号: 33
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code>。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.shadowOffsetY
     * <br/>序号: 34
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code>。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.scrollDataIndex
     * <br/>序号: 35
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><a href="#legend.type">legend.type</a> 为 <code class="codespan">'scroll'</code> 时有效。</p>
     * <p>图例当前最左上显示项的 <code class="codespan">dataIndex</code>。</p>
     * <p><code class="codespan">setOption</code> 时指定此项的话，可决定当前图例滚动到哪里。</p>
     * <p>但是，如果仅仅想改变图例翻页，一般并不调用 <code class="codespan">setOption</code>（因为这太重量了），仅仅使用 action <a href="api.html#action.legend.legendScroll" target="_blank">legendScroll</a> 即可。</p>
     * <p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=pie-legend&amp;edit=1&amp;reset=1" target="_blank">滚动图例（垂直）</a> 或 <a href="https://echarts.apache.org/examples/zh/editor.html?c=radar2&amp;edit=1&amp;reset=1" target="_blank">滚动图例（水平）</a>。</p>
     */
    private Integer scrollDataIndex;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.pageButtonItemGap
     * <br/>序号: 36
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><a href="#legend.type">legend.type</a> 为 <code class="codespan">'scroll'</code> 时有效。</p>
     * <p>图例控制块中，按钮和页信息之间的间隔。</p>
     * <p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=pie-legend&amp;edit=1&amp;reset=1" target="_blank">滚动图例（垂直）</a> 或 <a href="https://echarts.apache.org/examples/zh/editor.html?c=radar2&amp;edit=1&amp;reset=1" target="_blank">滚动图例（水平）</a>。</p>
     */
    private Integer pageButtonItemGap;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.pageButtonGap
     * <br/>序号: 37
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><a href="#legend.type">legend.type</a> 为 <code class="codespan">'scroll'</code> 时有效。</p>
     * <p>图例控制块和图例项之间的间隔。</p>
     * <p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=pie-legend&amp;edit=1&amp;reset=1" target="_blank">滚动图例（垂直）</a> 或 <a href="https://echarts.apache.org/examples/zh/editor.html?c=radar2&amp;edit=1&amp;reset=1" target="_blank">滚动图例（水平）</a>。</p>
     */
    private Integer pageButtonGap;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.pageButtonPosition
     * <br/>序号: 38
     * <br/>默认值: end
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p><a href="#legend.type">legend.type</a> 为 <code class="codespan">'scroll'</code> 时有效。</p>
     * <p>图例控制块的位置。可选值为：</p>
     * <ul>
     * <li><code class="codespan">'start'</code>：控制块在左或上。</li>
     * <li><code class="codespan">'end'</code>：控制块在右或下。</li>
     * </ul>
     * <p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=pie-legend&amp;edit=1&amp;reset=1" target="_blank">滚动图例（垂直）</a> 或 <a href="https://echarts.apache.org/examples/zh/editor.html?c=radar2&amp;edit=1&amp;reset=1" target="_blank">滚动图例（水平）</a>。</p>
     */
    private String pageButtonPosition;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.pageFormatter
     * <br/>序号: 39
     * <br/>默认值: {current}/{total}
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p><a href="#legend.type">legend.type</a> 为 <code class="codespan">'scroll'</code> 时有效。</p>
     * <p>图例控制块中，页信息的显示格式。默认为 <code class="codespan">'{current}/{total}'</code>，其中 <code class="codespan">{current}</code> 是当前页号（从 1 开始计数），<code class="codespan">{total}</code> 是总页数。</p>
     * <p>如果 <code class="codespan">pageFormatter</code> 使用函数，须返回字符串，参数为：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">current</span>: number
     *     <span class="hljs-attr">total</span>: number
     * }
     * </code></pre>
     * <p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=pie-legend&amp;edit=1&amp;reset=1" target="_blank">滚动图例（垂直）</a> 或 <a href="https://echarts.apache.org/examples/zh/editor.html?c=radar2&amp;edit=1&amp;reset=1" target="_blank">滚动图例（水平）</a>。</p>
     */
    private Object pageFormatter;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.pageIcons
     * <br/>序号: 40
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><a href="#legend.type">legend.type</a> 为 <code class="codespan">'scroll'</code> 时有效。</p>
     * <p>图例控制块的图标。</p>
     */
    private PageIcons pageIcons;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.pageIconColor
     * <br/>序号: 41
     * <br/>默认值: #2f4554
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p><a href="#legend.type">legend.type</a> 为 <code class="codespan">'scroll'</code> 时有效。</p>
     * <p>翻页按钮的颜色。</p>
     * <p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=pie-legend&amp;edit=1&amp;reset=1" target="_blank">滚动图例（垂直）</a> 或 <a href="https://echarts.apache.org/examples/zh/editor.html?c=radar2&amp;edit=1&amp;reset=1" target="_blank">滚动图例（水平）</a>。</p>
     */
    private String pageIconColor;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.pageIconInactiveColor
     * <br/>序号: 42
     * <br/>默认值: #aaa
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p><a href="#legend.type">legend.type</a> 为 <code class="codespan">'scroll'</code> 时有效。</p>
     * <p>翻页按钮不激活时（即翻页到头时）的颜色。</p>
     * <p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=pie-legend&amp;edit=1&amp;reset=1" target="_blank">滚动图例（垂直）</a> 或 <a href="https://echarts.apache.org/examples/zh/editor.html?c=radar2&amp;edit=1&amp;reset=1" target="_blank">滚动图例（水平）</a>。</p>
     */
    private String pageIconInactiveColor;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.pageIconSize
     * <br/>序号: 43
     * <br/>默认值: 15
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p><a href="#legend.type">legend.type</a> 为 <code class="codespan">'scroll'</code> 时有效。</p>
     * <p>翻页按钮的大小。可以是数字，也可以是数组，如 <code class="codespan">[10, 3]</code>，表示 <code class="codespan">[宽，高]</code>。</p>
     * <p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=pie-legend&amp;edit=1&amp;reset=1" target="_blank">滚动图例（垂直）</a> 或 <a href="https://echarts.apache.org/examples/zh/editor.html?c=radar2&amp;edit=1&amp;reset=1" target="_blank">滚动图例（水平）</a>。</p>
     */
    private Object pageIconSize;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.pageTextStyle
     * <br/>序号: 44
     * <br/>默认值: #333
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><a href="#legend.type">legend.type</a> 为 <code class="codespan">'scroll'</code> 时有效。</p>
     * <p>图例页信息的文字样式。</p>
     */
    private PageTextStyle pageTextStyle;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.animation
     * <br/>序号: 45
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图例翻页是否使用动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.animationDurationUpdate
     * <br/>序号: 46
     * <br/>默认值: 800
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图例翻页时的动画时长。</p>
     */
    private Integer animationDurationUpdate;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.emphasis
     * <br/>序号: 47
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.selector
     * <br/>序号: 48
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","Array"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.4.0</code> 开始支持</p>
     * </blockquote>
     * <p>图例组件中的选择器按钮，目前包括全选和反选两种功能。默认不显示，用户可手动开启，也可以手动配置每个按钮的标题。</p>
     * <p>使用方式如下：</p>
     * <pre><code class="lang-js hljs javascript">selector: [
     *     {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'all or inverse'</span>,
     *         <span class="hljs-comment">// 可以是任意你喜欢的 title</span>
     *         <span class="hljs-attr">title</span>: <span class="hljs-string">'全选'</span>
     *     },
     *     {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'inverse'</span>,
     *         <span class="hljs-attr">title</span>: <span class="hljs-string">'反选'</span>
     *     }
     * ]
     *
     * <span class="hljs-comment">// 或</span>
     * <span class="hljs-attr">selector</span>: <span class="hljs-literal">true</span>
     *
     * <span class="hljs-comment">// 或</span>
     * <span class="hljs-attr">selector</span>: [<span class="hljs-string">'all'</span>, <span class="hljs-string">'inverse'</span>]
     * </code></pre>
     */
    private Object selector;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.selectorLabel
     * <br/>序号: 49
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.4.0</code> 开始支持</p>
     * </blockquote>
     * <p>选择器按钮的文本标签样式，默认显示。</p>
     */
    private SelectorLabel selectorLabel;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.selectorPosition
     * <br/>序号: 50
     * <br/>默认值: auto
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.4.0</code> 开始支持</p>
     * </blockquote>
     * <p>选择器的位置，可以放在图例的尾部或者头部，对应的值分别为 <code class="codespan">'end'</code> 和 <code class="codespan">'start'</code>。默认情况下，图例横向布局的时候，选择器放在图例的尾部；图例纵向布局的时候，选择器放在图例的头部。</p>
     */
    private String selectorPosition;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.selectorItemGap
     * <br/>序号: 51
     * <br/>默认值: 7
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.4.0</code> 开始支持</p>
     * </blockquote>
     * <p>选择器按钮之间的间隔。</p>
     */
    private Integer selectorItemGap;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#legend.selectorButtonGap
     * <br/>序号: 52
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.4.0</code> 开始支持</p>
     * </blockquote>
     * <p>选择器按钮与图例组件之间的间隔。</p>
     */
    private Integer selectorButtonGap;
}
