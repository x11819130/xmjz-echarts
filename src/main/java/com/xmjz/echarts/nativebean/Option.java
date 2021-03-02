package com.xmjz.echarts.nativebean;

import com.xmjz.echarts.nativebean.option.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html">https://echarts.apache.org/zh/option.html</a>
 * <br/>序号: 1
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * Eachrts Option Object
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Option implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#title">https://echarts.apache.org/zh/option.html#title</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标题组件，包含主标题和副标题。</p>
     * <p>在 ECharts 2.x 中单个 ECharts 实例最多只能拥有一个标题组件。但是在 ECharts 3 中可以存在任意多个标题组件，这在需要标题进行排版，或者单个实例中的多个图表都需要标题时会比较有用。</p>
     * <p><strong>例如下面不同缓动函数效果的示例，每一个缓动效果图都带有一个标题组件：</strong></p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-easing&amp;edit=1&amp;reset=1" width="700" height="400" data-ll-timeout="17"></iframe>
     */
    private Title title;
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
     */
    private Legend legend;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid">https://echarts.apache.org/zh/option.html#grid</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>直角坐标系内绘图网格，单个 grid 内最多可以放置上下两个 X 轴，左右两个 Y 轴。可以在网格上绘制<a href="#series-line">折线图</a>，<a href="#series-bar">柱状图</a>，<a href="#series-scatter">散点图（气泡图）</a>。</p>
     * <p>在 ECharts 2.x 里单个 echarts 实例中最多只能存在一个 grid 组件，在 ECharts 3 中可以存在任意个 grid 组件。</p>
     * <p><strong>例如下面这个 Anscombe Quartet 的示例：</strong></p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-anscombe-quartet&amp;edit=1&amp;reset=1" width="600" height="400" data-ll-timeout="16"></iframe>
     */
    private Grid grid;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis">https://echarts.apache.org/zh/option.html#xAxis</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>直角坐标系 grid 中的 x 轴，一般情况下单个 grid 组件最多只能放上下两个 x 轴，多于两个 x 轴需要通过配置 <a href="#xAxis.offset">offset</a> 属性防止同个位置多个 x 轴的重叠。</p>
     */
    private XAxis xAxis;

    public XAxis getxAxis() {
        return this.xAxis;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis">https://echarts.apache.org/zh/option.html#yAxis</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>直角坐标系 grid 中的 y 轴，一般情况下单个 grid 组件最多只能放左右两个 y 轴，多于两个 y 轴需要通过配置 <a href="#yAxis.offset">offset</a> 属性防止同个位置多个 Y 轴的重叠。</p>
     */
    private YAxis yAxis;

    public YAxis getyAxis() {
        return this.yAxis;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#polar">https://echarts.apache.org/zh/option.html#polar</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>极坐标系，可以用于散点图和折线图。每个极坐标系拥有一个<a href="#angleAxis">角度轴</a>和一个<a href="#radiusAxis">半径轴</a>。</p>
     * <p><strong>示例：</strong></p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-polar-punchCard&amp;edit=1&amp;reset=1" width="600" height="400"></iframe>
     */
    private Polar polar;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis">https://echarts.apache.org/zh/option.html#radiusAxis</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>极坐标系的径向轴。</p>
     */
    private RadiusAxis radiusAxis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis">https://echarts.apache.org/zh/option.html#angleAxis</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>极坐标系的角度轴。</p>
     */
    private AngleAxis angleAxis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar">https://echarts.apache.org/zh/option.html#radar</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>雷达图坐标系组件，只适用于<a href="#series-radar">雷达图</a>。该组件等同 ECharts 2 中的 polar 组件。因为 3 中的 polar 被重构为标准的极坐标组件，为避免混淆，雷达图使用 radar 组件作为其坐标系。</p>
     * <p>雷达图坐标系与极坐标系不同的是它的每一个轴（indicator 指示器）都是一个单独的维度，可以通过 <a href="#radar.name">name</a>、<a href="#radar.axisLine">axisLine</a>、<a href="#radar.axisTick">axisTick</a>、<a href="#radar.axisLabel">axisLabel</a>、<a href="#radar.splitLine">splitLine</a>、 <a href="#radar.splitArea">splitArea</a> 几个配置项配置指示器坐标轴线的样式。</p>
     * <p>下面是一个 radar 组件的一个自定义例子。</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/radar&amp;edit=1&amp;reset=1" width="400" height="400"></iframe>
     */
    private Radar radar;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom">https://echarts.apache.org/zh/option.html#dataZoom</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p><code class="codespan">dataZoom</code> 组件 用于区域缩放，从而能自由关注细节的数据信息，或者概览数据整体，或者去除离群点的影响。</p>
     * <p>现在支持这几种类型的 <code class="codespan">dataZoom</code> 组件：</p>
     * <ul>
     * <li><p><a href="#dataZoom-inside">内置型数据区域缩放组件（dataZoomInside）</a>：内置于坐标系中，使用户可以在坐标系上通过鼠标拖拽、鼠标滚轮、手指滑动（触屏上）来缩放或漫游坐标系。</p>
     * </li>
     * <li><p><a href="#dataZoom-slider">滑动条型数据区域缩放组件（dataZoomSlider）</a>：有单独的滑动条，用户在滑动条上进行缩放或漫游。</p>
     * </li>
     * <li><p><a href="#toolbox.feature.dataZoom">框选型数据区域缩放组件（dataZoomSelect）</a>：提供一个选框进行数据区域缩放。即 <a href="#toolbox.feature.dataZoom">toolbox.feature.dataZoom</a>，配置项在 <code class="codespan">toolbox</code> 中。</p>
     * </li>
     * </ul>
     * <p>如下例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/scatter-dataZoom-all&amp;edit=1&amp;reset=1" width="600" height="400"></iframe>
     *
     *
     * <p><br></p>
     * <hr>
     * <p><strong>✦ dataZoom 和 数轴的关系 ✦</strong></p>
     * <p><code class="codespan">dataZoom</code> 主要是对 <code class="codespan">数轴（axis）</code> 进行操作（控制数轴的显示范围，或称窗口（window））。</p>
     * <blockquote>
     * <p>可以通过 <a href="#dataZoom.xAxisIndex">dataZoom.xAxisIndex</a> 或 <a href="#dataZoom.yAxisIndex">dataZoom.yAxisIndex</a> 或 <a href="#dataZoom.radiusAxisIndex">dataZoom.radiusAxisIndex</a> 或 <a href="#dataZoom.angleAxisIndex">dataZoom.angleAxisIndex</a> 来指定 <code class="codespan">dataZoom</code> 控制哪个或哪些数轴。</p>
     * </blockquote>
     * <p><code class="codespan">dataZoom</code> 组件可 <strong>同时存在多个</strong>，起到共同控制的作用。如果多个 <code class="codespan">dataZoom</code> 组件共同控制同一个数轴，他们会自动联动。</p>
     * <p><br></p>
     * <hr>
     * <p><strong>✦ dataZoom 组件如何影响轴和数据 ✦</strong></p>
     * <p><code class="codespan">dataZoom</code> 的运行原理是通过 <code class="codespan">数据过滤</code> 以及在内部设置轴的显示窗口来达到 <code class="codespan">数据窗口缩放</code> 的效果。</p>
     * <p>数据过滤模式（<a href="#dataZoom.filterMode">dataZoom.filterMode</a>）的设置不同，效果也不同。</p>
     * <p>可选值为：</p>
     * <ul>
     * <li><p>'filter'：当前数据窗口外的数据，被 <strong>过滤掉</strong>。即 <strong>会</strong> 影响其他轴的数据范围。每个数据项，只要有一个维度在数据窗口外，整个数据项就会被过滤掉。</p>
     * </li>
     * <li><p>'weakFilter'：当前数据窗口外的数据，被 <strong>过滤掉</strong>。即 <strong>会</strong> 影响其他轴的数据范围。每个数据项，只有当全部维度都在数据窗口同侧外部，整个数据项才会被过滤掉。</p>
     * </li>
     * <li><p>'empty'：当前数据窗口外的数据，被 <strong>设置为空</strong>。即 <strong>不会</strong> 影响其他轴的数据范围。</p>
     * </li>
     * <li><p>'none': 不过滤数据，只改变数轴范围。</p>
     * </li>
     * </ul>
     * <p>如何设置，由用户根据场景和需求自己决定。经验来说：</p>
     * <ul>
     * <li><p>当『只有 X 轴 或 只有 Y 轴受 <code class="codespan">dataZoom</code> 组件控制』时，常使用 <code class="codespan">filterMode: 'filter'</code>，这样能使另一个轴自适应过滤后的数值范围。</p>
     * </li>
     * <li><p>当『X 轴 Y 轴分别受 <code class="codespan">dataZoom</code> 组件控制』时：</p>
     * <ul>
     * <li><p>如果 X 轴和 Y 轴是『同等地位的、不应互相影响的』，比如在『双数值轴散点图』中，那么两个轴可都设为 <code class="codespan">fiterMode: 'empty'</code>。</p>
     * </li>
     * <li><p>如果 X 轴为主，Y 轴为辅，比如在『柱状图』中，需要『拖动 <code class="codespan">dataZoomX</code> 改变 X 轴过滤柱子时，Y 轴的范围也自适应剩余柱子的高度』，『拖动 <code class="codespan">dataZoomY</code> 改变 Y 轴过滤柱子时，X 轴范围不受影响』，那么就 X轴设为 <code class="codespan">fiterMode: 'filter'</code>，Y 轴设为 <code class="codespan">fiterMode: 'empty'</code>，即主轴 <code class="codespan">'filter'</code>，辅轴 <code class="codespan">'empty'</code>。</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>下面是个具体例子：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">dataZoom</span>: [
     *         {
     *             <span class="hljs-attr">id</span>: <span class="hljs-string">'dataZoomX'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'slider'</span>,
     *             <span class="hljs-attr">xAxisIndex</span>: [<span class="hljs-number">0</span>],
     *             <span class="hljs-attr">filterMode</span>: <span class="hljs-string">'filter'</span>
     *         },
     *         {
     *             <span class="hljs-attr">id</span>: <span class="hljs-string">'dataZoomY'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'slider'</span>,
     *             <span class="hljs-attr">yAxisIndex</span>: [<span class="hljs-number">0</span>],
     *             <span class="hljs-attr">filterMode</span>: <span class="hljs-string">'empty'</span>
     *         }
     *     ],
     *     <span class="hljs-attr">xAxis</span>: {<span class="hljs-attr">type</span>: <span class="hljs-string">'value'</span>},
     *     <span class="hljs-attr">yAxis</span>: {<span class="hljs-attr">type</span>: <span class="hljs-string">'value'</span>},
     *     series{
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'bar'</span>,
     *         <span class="hljs-attr">data</span>: [
     *             <span class="hljs-comment">// 第一列对应 X 轴，第二列对应 Y 轴。</span>
     *             [<span class="hljs-number">12</span>, <span class="hljs-number">24</span>, <span class="hljs-number">36</span>],
     *             [<span class="hljs-number">90</span>, <span class="hljs-number">80</span>, <span class="hljs-number">70</span>],
     *             [<span class="hljs-number">3</span>, <span class="hljs-number">9</span>, <span class="hljs-number">27</span>],
     *             [<span class="hljs-number">1</span>, <span class="hljs-number">11</span>, <span class="hljs-number">111</span>]
     *         ]
     *     }
     * }
     * </code></pre>
     * <p>上例中，<code class="codespan">dataZoomX</code> 的 <code class="codespan">filterMode</code> 设置为 <code class="codespan">'filter'</code>。于是，假设当用户拖拽 <code class="codespan">dataZoomX</code>（不去动 <code class="codespan">dataZoomY</code>）导致其 valueWindow 变为 <code class="codespan">[2, 50]</code> 时，<code class="codespan">dataZoomX</code> 对 series.data 的第一列进行遍历，窗口外的整项去掉，最终得到的 series.data 为：</p>
     * <pre><code class="lang-javascript hljs">[
     *     <span class="hljs-comment">// 第一列对应 X 轴，第二列对应 Y 轴。</span>
     *     [<span class="hljs-number">12</span>, <span class="hljs-number">24</span>, <span class="hljs-number">36</span>],
     *     <span class="hljs-comment">// [90, 80, 70] 整项被过滤掉，因为 90 在 dataWindow 之外。</span>
     *     [<span class="hljs-number">3</span>, <span class="hljs-number">9</span>, <span class="hljs-number">27</span>]
     *     <span class="hljs-comment">// [1, 11, 111] 整项被过滤掉，因为 1 在 dataWindow 之外。</span>
     * ]
     * </code></pre>
     * <p>过滤前，series.data 中对应 Y 轴的值有 <code class="codespan">24</code>、<code class="codespan">80</code>、<code class="codespan">9</code>、<code class="codespan">11</code>，过滤后，只剩下 <code class="codespan">24</code> 和 <code class="codespan">9</code>，那么 Y 轴的显示范围就会自动改变以适应剩下的这两个值的显示（如果 Y 轴没有被设置 <code class="codespan">min</code>、<code class="codespan">max</code> 固定其显示范围的话）。</p>
     * <p>所以，<code class="codespan">filterMode: 'filter'</code> 的效果是：过滤数据后使另外的轴也能自动适应当前数据的范围。</p>
     * <p>再从头来，上例中 <code class="codespan">dataZoomY</code> 的 <code class="codespan">filterMode</code> 设置为 <code class="codespan">'empty'</code>。于是，假设当用户拖拽 <code class="codespan">dataZoomY</code>（不去动 <code class="codespan">dataZoomX</code>）导致其 dataWindow 变为 <code class="codespan">[10, 60]</code> 时，<code class="codespan">dataZoomY</code> 对 series.data 的第二列进行遍历，窗口外的值被设置为 empty （即替换为 NaN，这样设置为空的项，其所对应柱形，在 X 轴还有占位，只是不显示出来）。最终得到的 series.data 为：</p>
     * <pre><code class="lang-javascript hljs">[
     *     <span class="hljs-comment">// 第一列对应 X 轴，第二列对应 Y 轴。</span>
     *     [<span class="hljs-number">12</span>, <span class="hljs-number">24</span>, <span class="hljs-number">36</span>],
     *     [<span class="hljs-number">90</span>, <span class="hljs-literal">NaN</span>, <span class="hljs-number">70</span>], <span class="hljs-comment">// 设置为 empty (NaN)</span>
     *     [<span class="hljs-number">3</span>, <span class="hljs-literal">NaN</span>, <span class="hljs-number">27</span>],  <span class="hljs-comment">// 设置为 empty (NaN)</span>
     *     [<span class="hljs-number">1</span>, <span class="hljs-number">11</span>, <span class="hljs-number">111</span>]
     * ]
     * </code></pre>
     * <p>这时，series.data 中对应于 X 轴的值仍然全部保留不受影响，为 <code class="codespan">12</code>、<code class="codespan">90</code>、<code class="codespan">3</code>、<code class="codespan">1</code>。那么用户对 <code class="codespan">dataZoomY</code> 的拖拽操作不会影响到 X 轴的范围。这样的效果，对于离群点（outlier）过滤功能，比较清晰。</p>
     * <p>如下面的例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/bar-dataZoom-filterMode&amp;edit=1&amp;reset=1" width="600" height="400"></iframe>
     *
     *
     *
     *
     *
     *
     * <p>另外，如果在任一个数轴上设置了 <code class="codespan">min</code>、<code class="codespan">max</code>（如设置 <code class="codespan">yAxis: {min: 0, max: 400}</code>），那么这个数轴无论如何也不会被其他数轴的 dataZoom 行为影响了。</p>
     * <p><br></p>
     * <hr>
     * <p><strong>✦ 数据窗口的设置 ✦</strong></p>
     * <p><code class="codespan">dataZoom</code> 的数据窗口范围的设置，目前支持两种形式：</p>
     * <ul>
     * <li><p>百分比形式：即设置 <a href="#dataZoom.start">dataZoom.start</a> 和 <a href="#dataZoom.end">dataZoom.end</a>。</p>
     * </li>
     * <li><p>绝对数值形式：即设置 <a href="#dataZoom.startValue">dataZoom.startValue</a> 和 <a href="#dataZoom.endValue">dataZoom.endValue</a>。</p>
     * </li>
     * </ul>
     * <p>注意：当使用百分比形式指定 <code class="codespan">dataZoom</code> 范围时，且处于如下场景（或类似场景）中，<code class="codespan">dataZoom</code> 的结果是和 <code class="codespan">dataZoom</code> 组件的定义顺序相关的。</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">dataZoom</span>: [
     *         {
     *             <span class="hljs-attr">id</span>: <span class="hljs-string">'dataZoomX'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'slider'</span>,
     *             <span class="hljs-attr">xAxisIndex</span>: [<span class="hljs-number">0</span>],
     *             <span class="hljs-attr">filterMode</span>: <span class="hljs-string">'filter'</span>, <span class="hljs-comment">// 设定为 'filter' 从而 X 的窗口变化会影响 Y 的范围。</span>
     *             <span class="hljs-attr">start</span>: <span class="hljs-number">30</span>,
     *             <span class="hljs-attr">end</span>: <span class="hljs-number">70</span>
     *         },
     *         {
     *             <span class="hljs-attr">id</span>: <span class="hljs-string">'dataZoomY'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'slider'</span>,
     *             <span class="hljs-attr">yAxisIndex</span>: [<span class="hljs-number">0</span>],
     *             <span class="hljs-attr">filterMode</span>: <span class="hljs-string">'empty'</span>,
     *             <span class="hljs-attr">start</span>: <span class="hljs-number">20</span>,
     *             <span class="hljs-attr">end</span>: <span class="hljs-number">80</span>
     *         }
     *     ],
     *     <span class="hljs-attr">xAxis</span>: {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'value'</span>
     *     },
     *     <span class="hljs-attr">yAxis</span>: {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'value'</span>
     *         <span class="hljs-comment">// yAxis 中并没有使用 min、max 来显示限定轴的显示范围。</span>
     *     },
     *     series{
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'bar'</span>,
     *         <span class="hljs-attr">data</span>: [
     *             <span class="hljs-comment">// 第一列对应 X 轴，第二列对应 Y 轴。</span>
     *             [<span class="hljs-number">12</span>, <span class="hljs-number">24</span>, <span class="hljs-number">36</span>],
     *             [<span class="hljs-number">90</span>, <span class="hljs-number">80</span>, <span class="hljs-number">70</span>],
     *             [<span class="hljs-number">3</span>, <span class="hljs-number">9</span>, <span class="hljs-number">27</span>],
     *             [<span class="hljs-number">1</span>, <span class="hljs-number">11</span>, <span class="hljs-number">111</span>]
     *         ]
     *     }
     * }
     * </code></pre>
     * <p>在上例中，<code class="codespan">dataZoomY</code> 的 <code class="codespan">start: 20, end: 80</code> 到底表示什么意思？</p>
     * <ul>
     * <li><p>如果 <code class="codespan">yAxis.min</code>、<code class="codespan">yAxis.max</code> 进行了直接设置：</p>
     * <p>  那么 <code class="codespan">dataZoomY</code> 的 <code class="codespan">start: 20, end: 80</code> 表示 <code class="codespan">yAxis.min</code> ~ <code class="codespan">yAxis.max</code> 的 <code class="codespan">20%</code> 到 <code class="codespan">80%</code>。</p>
     * </li>
     * <li><p>如果 <code class="codespan">yAxis.min</code>、<code class="codespan">yAxis.max</code> 没有设置：</p>
     * <ul>
     * <li><p>如果 <code class="codespan">dataZoomX</code> 设置为 <code class="codespan">filterMode: 'empty'</code>：</p>
     * <p>  那么 <code class="codespan">dataZoomY</code> 的 <code class="codespan">start: 20, end: 80</code> 表示 series.data 中 <code class="codespan">dataMinY</code> ~ <code class="codespan">dataMaxY</code>（即上例中的 <code class="codespan">9</code> ~ <code class="codespan">80</code>）的 <code class="codespan">20%</code> 到 <code class="codespan">80%</code>。</p>
     * </li>
     * <li><p>如果 <code class="codespan">dataZoomX</code> 设置为 <code class="codespan">filterMode: 'filter'</code>：</p>
     * <p>  那么，因为 <code class="codespan">dataZoomX</code> 定义 <code class="codespan">dataZoomY</code> 组件之前，所以 <code class="codespan">dataZoomX</code> 的 <code class="codespan">start: 30, end: 70</code> 表示全部数据的 <code class="codespan">30%</code> 到 <code class="codespan">70%</code>，而 <code class="codespan">dataZoomY</code> 组件的 <code class="codespan">start: 20, end: 80</code> 表示经过 <code class="codespan">dataZoomX</code> 过滤处理后，所得数据集的 <code class="codespan">20%</code> 到 <code class="codespan">80%</code>。</p>
     * <p>  如果需要改变这种处理顺序，那么改变 <code class="codespan">dataZoomX</code> 和 <code class="codespan">dataZoomY</code> 在 option 中的出现顺序即可。</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private List<Object> dataZoom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap">https://echarts.apache.org/zh/option.html#visualMap</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p><code class="codespan">visualMap</code> 是视觉映射组件，用于进行『视觉编码』，也就是将数据映射到视觉元素（视觉通道）。</p>
     * <p>视觉元素可以是：<br></p>
     * <ul>
     * <li><code class="codespan">symbol</code>: 图元的图形类别。</li>
     * <li><code class="codespan">symbolSize</code>: 图元的大小。</li>
     * <li><code class="codespan">color</code>: 图元的颜色。</li>
     * <li><code class="codespan">colorAlpha</code>: 图元的颜色的透明度。</li>
     * <li><code class="codespan">opacity</code>: 图元以及其附属物（如文字标签）的透明度。</li>
     * <li><code class="codespan">colorLightness</code>: 颜色的明暗度，参见 <a href="https://en.wikipedia.org/wiki/HSL_and_HSV" target="_blank">HSL</a>。</li>
     * <li><code class="codespan">colorSaturation</code>: 颜色的饱和度，参见 <a href="https://en.wikipedia.org/wiki/HSL_and_HSV" target="_blank">HSL</a>。</li>
     * <li><code class="codespan">colorHue</code>: 颜色的色调，参见 <a href="https://en.wikipedia.org/wiki/HSL_and_HSV" target="_blank">HSL</a>。</li>
     * </ul>
     * <p><code class="codespan">visualMap</code> 组件可以定义多个，从而可以同时对数据中的多个维度进行视觉映射。</p>
     * <p><code class="codespan">visualMap</code> 组件可以定义为 <a href="#visualMap-piecewise">分段型（visualMapPiecewise）</a> 或 <a href="#visualMap-continuous">连续型（visualMapContinuous）</a>，通过 <code class="codespan">type</code> 来区分。例如：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">visualMap</span>: [
     *         { <span class="hljs-comment">// 第一个 visualMap 组件</span>
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'continuous'</span>, <span class="hljs-comment">// 定义为连续型 visualMap</span>
     *             ...
     *         },
     *         { <span class="hljs-comment">// 第二个 visualMap 组件</span>
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'piecewise'</span>, <span class="hljs-comment">// 定义为分段型 visualMap</span>
     *             ...
     *         }
     *     ],
     *     ...
     * };
     * </code></pre>
     * <p><br>
     * <strong>✦ 视觉映射方式的配置 ✦</strong></p>
     * <p>既然是『数据』到『视觉元素』的映射，<code class="codespan">visualMap</code> 中可以指定数据的『哪个维度』（参见<a href="#visualMap.dimension">visualMap.dimension</a>）映射到哪些『视觉元素』（参见<a href="#visualMap.inRange">visualMap.inRange</a> 和 <a href="#visualMap.outOfRange">visualMap.outOfRange</a>）中。</p>
     * <p><br>
     * 在 visualMap 组件所控制的 series 中，如果 series 中某个数据项需要避开 visualMap 映射，可以这么配置：</p>
     * <pre><code class="hljs javascript">series: {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'...'</span>,
     *     <span class="hljs-attr">data</span>: [
     *         {<span class="hljs-attr">name</span>: <span class="hljs-string">'Shanghai'</span>, <span class="hljs-attr">value</span>: <span class="hljs-number">251</span>},
     *         {<span class="hljs-attr">name</span>: <span class="hljs-string">'Haikou'</span>, <span class="hljs-attr">value</span>: <span class="hljs-number">21</span>},
     *         <span class="hljs-comment">// 设置 `visualMap: false` 则 visualMap 不对此项进行控制，此时系列</span>
     *         <span class="hljs-comment">// 可使用自身的视觉参数（color/symbol/ ...控制此项的显示。</span>
     *         {<span class="hljs-attr">name</span>: <span class="hljs-string">'Beijing'</span>, <span class="hljs-attr">value</span>: <span class="hljs-number">821</span>, <span class="hljs-attr">visualMap</span>: <span class="hljs-literal">false</span>},
     *         ...
     *     ]
     * }
     * </code></pre><p><br>
     * <strong>✦ 与 ECharts2 中 dataRange 的关系 ✦</strong></p>
     * <p><code class="codespan">visualMap</code> 是由 ECharts2 中的 <code class="codespan">dataRange</code> 组件改名以及扩展而来。ECharts3里 <code class="codespan">option</code> 中的 <code class="codespan">dataRange</code> 配置项仍然被兼容，会自动转换成 <code class="codespan">visualMap</code> 配置项。在option中推荐写 <code class="codespan">visualMap</code> 而非 <code class="codespan">dataRange</code>。</p>
     */
    private List<Object> visualMap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip">https://echarts.apache.org/zh/option.html#tooltip</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>提示框组件。</p>
     * <hr>
     * <p><strong>提示框组件的通用介绍：</strong></p>
     * <p>提示框组件可以设置在多种地方：</p>
     * <ul>
     * <li><p>可以设置在全局，即 <a href="#tooltip">tooltip</a></p>
     * </li>
     * <li><p>可以设置在坐标系中，即 <a href="#grid.tooltip">grid.tooltip</a>、<a href="#polar.tooltip">polar.tooltip</a>、<a href="#single.tooltip">single.tooltip</a></p>
     * </li>
     * <li><p>可以设置在系列中，即 <a href="#series.tooltip">series.tooltip</a></p>
     * </li>
     * <li><p>可以设置在系列的每个数据项中，即 <a href="#series.data.tooltip">series.data.tooltip</a></p>
     * </li>
     * </ul>
     * <hr>
     */
    private Tooltip tooltip;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer">https://echarts.apache.org/zh/option.html#axisPointer</a>
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
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/candlestick-axisPointer&amp;edit=1&amp;reset=1" width="600" height="450"></iframe>
     *
     *
     * <p>上例中，使用了 <a href="#axisPointer.link">axisPointer.link</a> 来关联不同的坐标系中的 axisPointer。</p>
     * <p>坐标轴指示器也有适合触屏的交互方式，如下：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-tooltip-touch&amp;edit=1&amp;reset=1" width="600" height="400"></iframe>
     *
     *
     * <p>坐标轴指示器在多轴的场景能起到辅助作用：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=multiple-y-axis&amp;edit=1&amp;reset=1" width="600" height="300"></iframe>
     * <p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=multiple-x-axis&amp;edit=1&amp;reset=1" width="600" height="300"></iframe>
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
     * <li><p>设置 <a href="#tooltip.trigger">tooltip.trigger</a> 设置为 <code class="codespan">'axis'</code> 或者 <a href="#tooltip.axisPointer.type">tooltip.axisPointer.type</a> 设置为 <code class="codespan">'cross'</code>，则此时坐标系会自动选择显示哪个轴的 axisPointer，也可以使用 <a href="#tooltip.axisPointer.axis">tooltip.axisPointer.axis</a> 改变这种选择。注意，轴上如果设置了 axisPointer，会覆盖此设置。</p>
     * </li>
     * </ul>
     * <hr>
     * <p><strong>如何显示 axisPointer 的 label：</strong></p>
     * <p>axisPointer 的 label 默认不显示（也就是默认只显示指示线），除非：</p>
     * <ul>
     * <li><p>设置轴上的 <code class="codespan">axisPointer.label.show</code>（例如 <a href="#xAxis.axisPointer.show">xAxis.axisPointer.label.show</a>）为 <code class="codespan">true</code>，则显示此轴的 axisPointer 的 label。</p>
     * </li>
     * <li><p>设置 <a href="#tooltip.axisPointer.type">tooltip.axisPointer.type</a> 为 <code class="codespan">'cross'</code> 时会自动显示 axisPointer 的 label。</p>
     * </li>
     * </ul>
     * <hr>
     * <p><strong>关于触屏的 axisPointer 的设置</strong></p>
     * <p>设置轴上的 <code class="codespan">axisPointer.handle.show</code>（例如 <a href="#xAxis.axisPointer.handle.show">xAxis.axisPointer.handle.show</a> 为 <code class="codespan">true</code> 则会显示出此 axisPointer 的拖拽按钮。（polar 坐标系暂不支持此功能）。</p>
     * <p><strong>注意：</strong>
     * 如果发现此时 tooltip 效果不良好，可设置 <a href="#tooltip.triggerOn">tooltip.triggerOn</a> 为 <code class="codespan">'none'</code>（于是效果为：手指按住按钮则显示 tooltip，松开按钮则隐藏 tooltip），或者 <a href="#tooltip.alwaysShowContent">tooltip.alwaysShowContent</a> 为 <code class="codespan">true</code>（效果为 tooltip 一直显示）。</p>
     * <p>参见<a href="https://echarts.apache.org/examples/zh/editor.html?c=line-tooltip-touch&amp;edit=1&amp;reset=1" target="_blank">例子</a>。</p>
     * <hr>
     * <p><strong>自动吸附到数据（snap）</strong></p>
     * <p>对于数值轴、时间轴，如果开启了 <a href="#xAxis.axisPointer.snap">snap</a>，则 axisPointer 会自动吸附到最近的点上。</p>
     * <hr>
     * <hr>
     */
    private AxisPointer axisPointer;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox">https://echarts.apache.org/zh/option.html#toolbox</a>
     * <br/>序号: 14
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>工具栏。内置有<a href="#toolbox.feature.saveAsImage">导出图片</a>，<a href="#toolbox.feature.dataView">数据视图</a>，<a href="#toolbox.feature.magicType">动态类型切换</a>，<a href="#toolbox.feature.dataZoom">数据区域缩放</a>，<a href="#toolbox.feature.reset">重置</a>五个工具。</p>
     * <p><strong>如下示例：</strong></p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-marker&amp;reset=1&amp;edit=1" width="600" height="400"></iframe>
     */
    private Toolbox toolbox;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#brush">https://echarts.apache.org/zh/option.html#brush</a>
     * <br/>序号: 15
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">brush</code> 是区域选择组件，用户可以选择图中一部分数据，从而便于向用户展示被选中数据，或者他们的一些统计计算结果。</p>
     * <p><br></p>
     * <hr>
     * <p><strong>刷子的类型和启动按钮</strong></p>
     * <p>目前 <code class="codespan">brush</code> 组件支持的图表类型：<code class="codespan">scatter</code>、<code class="codespan">bar</code>、<code class="codespan">candlestick</code>（<code class="codespan">parallel</code> 本身自带刷选功能，但并非由 brush 组件来提供）。</p>
     * <p>点击 <code class="codespan">toolbox</code> 中的按钮，能够进行『区域选择』、『清除选择』等操作。</p>
     * <p><br>
     * <code class="codespan">横向刷子</code> 的示例如下（点击 <code class="codespan">toolbox</code> 中的按钮启动刷选）：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=candlestick-brush&amp;edit=1&amp;reset=1" width="800" height="500"></iframe>
     *
     *
     * <p><br>
     * <code class="codespan">bar</code> 图中的 <code class="codespan">brush</code>（点击 <code class="codespan">toolbox</code> 中的按钮启动刷选）：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=bar-brush&amp;edit=1&amp;reset=1" width="800" height="400"></iframe>
     *
     *
     *
     * <p>启动 <code class="codespan">brush</code> 的按钮既可以在 <code class="codespan">toolbox</code> 中指定（参见 <a href="#toolbox.feature.brush.type">toolbox.feature.brush.type</a>），也可以在 <code class="codespan">brush</code> 组件的配置中指定（参见 <a href="#brush.toolbox">brush.toolbox</a>）。</p>
     * <p>支持这几种选框：<code class="codespan">矩形刷子</code>，<code class="codespan">任意形状刷子</code>，<code class="codespan">横向刷子</code>，<code class="codespan">纵向刷子</code>。参见 <a href="#brush.toolbox">brush.toolbox</a>。</p>
     * <p>可以使用 <code class="codespan">保持选择</code> 按钮，切换单选和多选模式。</p>
     * <ul>
     * <li>单选即同时只能存在一个选框，可单击空白区域消除选框。</li>
     * <li>多选即同时可存在多个选框，单击空白区域不能消除选框，需要点击『清除按钮』消除线框。</li>
     * </ul>
     * <p><br></p>
     * <hr>
     * <p><strong>刷选和坐标系的关系</strong></p>
     * <p>可以设置 <code class="codespan">brush</code> 是『全局的』还是『属于坐标系的』。</p>
     * <p><strong>全局 brush</strong></p>
     * <p>在 echarts 实例中任意地方刷选。这是默认情况。如果没有指定为『坐标系 brush』，就是『全局 brush』。</p>
     * <p><strong>坐标系 brush</strong></p>
     * <p>在 指定的坐标系中刷选。选框可以跟随坐标系的缩放和平移（roam 和 dataZoom）而移动。</p>
     * <p>坐标系 brush 实际更为常用，尤其是在 geo 中。</p>
     * <p>通过指定 <a href="#brush.geoIndex">brush.geoIndex</a> 或 <a href="#brush.xAxisIndex">brush.xAxisIndex</a> 或 <a href="#brush.yAxisIndex">brush.yAxisIndex</a> 来规定可以在哪些坐标系中进行刷选。</p>
     * <p>这几个配置项的取值可以是：</p>
     * <ul>
     * <li><code class="codespan">'all'</code>，表示所有</li>
     * <li><code class="codespan">number</code>，如 <code class="codespan">0</code>，表示这个 index 所对应的坐标系。</li>
     * <li><code class="codespan">Array</code>，如 <code class="codespan">[0, 4, 2]</code>，表示指定这些 index 所对应的坐标系。</li>
     * <li><code class="codespan">'none'</code> 或 <code class="codespan">null</code> 或 <code class="codespan">undefined</code>，表示不指定。</li>
     * </ul>
     * <p>例如：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">geo</span>: {
     *         ...
     *     },
     *     <span class="hljs-attr">brush</span>: {
     *         <span class="hljs-attr">geoIndex</span>: <span class="hljs-string">'all'</span>, <span class="hljs-comment">// 只可以在所有 geo 坐标系中刷选，也就是上面定义的 geo 组件中。</span>
     *         ...
     *     }
     * };
     * </code></pre>
     * <p>例如：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">grid</span>: [
     *         {...}, <span class="hljs-comment">// grid 0</span>
     *         {...}  <span class="hljs-comment">// grid 1</span>
     *     ],
     *     <span class="hljs-attr">xAxis</span>: [
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">1</span>, ...}, <span class="hljs-comment">// xAxis 0，属于 grid 1。</span>
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">0</span>, ...}  <span class="hljs-comment">// xAxis 1，属于 grid 0。</span>
     *     ],
     *     <span class="hljs-attr">yAxis</span>: [
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">1</span>, ...}, <span class="hljs-comment">// yAxis 0，属于 grid 1。</span>
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">0</span>, ...}  <span class="hljs-comment">// yAxis 1，属于 grid 0。</span>
     *     ],
     *     <span class="hljs-attr">brush</span>: {
     *         <span class="hljs-attr">xAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">1</span>], <span class="hljs-comment">// 只可以在 xAxisIndex 为 `0` 和 `1` 的 xAxis 所在的直角坐标系中刷选。</span>
     *         ...
     *     }
     * };
     * </code></pre>
     * <p><br></p>
     * <hr>
     * <p><strong> 使用 API 控制选框 </strong></p>
     * <p>可以通过调用 <code class="codespan">dispatchAction</code> 来用程序主动渲染选框，例如：</p>
     * <pre><code class="lang-javascript hljs">myChart.dispatchAction({
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'brush'</span>,
     *     <span class="hljs-attr">areas</span>: [
     *         {
     *             <span class="hljs-attr">geoIndex</span>: <span class="hljs-number">0</span>,
     *             <span class="hljs-comment">// 指定选框的类型。</span>
     *             <span class="hljs-attr">brushType</span>: <span class="hljs-string">'polygon'</span>,
     *             <span class="hljs-comment">// 指定选框的形状。</span>
     *             <span class="hljs-attr">coordRange</span>: [[<span class="hljs-number">119.72</span>,<span class="hljs-number">34.85</span>],[<span class="hljs-number">119.68</span>,<span class="hljs-number">34.85</span>],[<span class="hljs-number">119.5</span>,<span class="hljs-number">34.84</span>],[<span class="hljs-number">119.19</span>,<span class="hljs-number">34.77</span>]]
     *         }
     *     ]
     * });
     * </code></pre>
     * <p>详情参见 <a href="api.html#action.brush" target="_blank">action.brush</a></p>
     * <p><br></p>
     * <hr>
     * <p><strong> brushLink </strong></p>
     * <p>不同系列间，选中的项可以联动。</p>
     * <p>参见如下效果（刷选一个 <code class="codespan">scatter</code>，其他 <code class="codespan">scatter</code> 以及 <code class="codespan">parallel</code> 图都会有选中效果）：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-matrix&amp;edit=1&amp;reset=1" width="800" height="550"></iframe>
     *
     *
     * <p><code class="codespan">brushLink</code> 配置项是一个数组，内容是 seriesIndex，指定了哪些 series 可以被联动。例如可以是：</p>
     * <ul>
     * <li><code class="codespan">[3, 4, 5]</code> 表示 seriesIndex 为 <code class="codespan">3</code>, <code class="codespan">4</code>, <code class="codespan">5</code> 的 series 可以被联动。</li>
     * <li><code class="codespan">'all'</code> 表示所有 series 都进行 brushLink。</li>
     * <li><code class="codespan">'none'</code> 或 <code class="codespan">null</code> 或 <code class="codespan">undefined</code> 表示不启用 brushLink 功能。</li>
     * </ul>
     * <p><strong>注意</strong></p>
     * <p>brushLink 是通过 dataIndex 进行映射，所以需要保证，<strong>联动的每个系列的 <code class="codespan">data</code> 都是 <code class="codespan">index</code> 对应的</strong>。*</p>
     * <p>例如：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">brush</span>: {
     *         <span class="hljs-attr">brushLink</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">1</span>]
     *     },
     *     <span class="hljs-attr">series</span>: [
     *         {
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'bar'</span>
     *             <span class="hljs-attr">data</span>: [<span class="hljs-number">232</span>,    <span class="hljs-number">4434</span>,    <span class="hljs-number">545</span>,      <span class="hljs-number">654</span>]     <span class="hljs-comment">// data 有四个项</span>
     *         },
     *         {
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'parallel'</span>,
     *             <span class="hljs-attr">data</span>: [[<span class="hljs-number">4</span>, <span class="hljs-number">5</span>], [<span class="hljs-number">3</span>, <span class="hljs-number">5</span>], [<span class="hljs-number">66</span>, <span class="hljs-number">33</span>], [<span class="hljs-number">99</span>, <span class="hljs-number">66</span>]] <span class="hljs-comment">// data 同样有四个项，两个系列的 data 是对应的。</span>
     *         }
     *     ]
     * };
     * </code></pre>
     * <p>参见 <a href="#brush.brushLink">brush.brushLink</a>。</p>
     * <p><br></p>
     * <hr>
     * <p><strong> throttle / debounce / 事件延迟 </strong></p>
     * <p>默认情况，刷选或者移动选区的时候，会不断得发 <code class="codespan">brushSelected</code> 事件，从而告诉外界选中的内容。</p>
     * <p>但是频繁的事件可能导致性能问题，或者动画效果很差。所以 brush 组件提供了 <a href="#brush.throttleType">brush.throttleType</a>，<a href="#brush.throttleDelay">brush.throttleDelay</a> 来解决这个问题。</p>
     * <p>throttleType 取值可以是：</p>
     * <ul>
     * <li><code class="codespan">'debounce'</code>：表示只有停止动作了（即一段时间没有操作了），才会触发事件。时间阈值由 <a href="#brush.throttleDelay">brush.throttleDelay</a> 指定。</li>
     * <li><code class="codespan">'fixRate'</code>：表示按照一定的频率触发事件，时间间隔由 <a href="#brush.throttleDelay">brush.throttleDelay</a> 指定。</li>
     * </ul>
     * <p><br></p>
     * <hr>
     * <p><strong> 被选中项和未被选中项的视觉设置 </strong></p>
     * <p>参见 <a href="#brush.inBrush">brush.inBrush</a> 和 <a href="#brush.outOfBrush">brush.outOfBrush</a>。</p>
     * <p><br></p>
     * <hr>
     * <p>下面是详细配置。</p>
     */
    private Brush brush;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo">https://echarts.apache.org/zh/option.html#geo</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>地理坐标系组件。</p>
     * <p>地理坐标系组件用于地图的绘制，支持在地理坐标系上绘制<a href="#series-scatter">散点图</a>，<a href="#series-lines">线集</a>。</p>
     * <p><code class="codespan">3.1.10</code> 开始 geo 组件也支持鼠标事件。事件参数为</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">componentType</span>: <span class="hljs-string">'geo'</span>,
     *     <span class="hljs-comment">// Geo 组件在 option 中的 index</span>
     *     <span class="hljs-attr">geoIndex</span>: number,
     *     <span class="hljs-comment">// 点击区域的名称，比如"上海"</span>
     *     <span class="hljs-attr">name</span>: string,
     *     <span class="hljs-comment">// 传入的点击区域的 region 对象，见 geo.regions</span>
     *     <span class="hljs-attr">region</span>: <span class="hljs-built_in">Object</span>
     * }
     * </code></pre>
     * <p><strong>Tip:</strong>
     * geo 区域的颜色也可以被 map series 所控制，参见 <a href="#series-map.geoIndex">series-map.geoIndex</a>。</p>
     */
    private Geo geo;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#parallel">https://echarts.apache.org/zh/option.html#parallel</a>
     * <br/>序号: 17
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><strong>平行坐标系介绍</strong></p>
     * <p><a href="https://en.wikipedia.org/wiki/Parallel_coordinates" target="_blank">平行坐标系（Parallel Coordinates）</a> 是一种常用的可视化高维数据的图表。</p>
     * <p>例如 <a href="#series-parallel.data">series-parallel.data</a> 中有如下数据：</p>
     * <pre><code class="lang-javascript hljs">[
     *     [<span class="hljs-number">1</span>,  <span class="hljs-number">55</span>,  <span class="hljs-number">9</span>,   <span class="hljs-number">56</span>,  <span class="hljs-number">0.46</span>,  <span class="hljs-number">18</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'良'</span>],
     *     [<span class="hljs-number">2</span>,  <span class="hljs-number">25</span>,  <span class="hljs-number">11</span>,  <span class="hljs-number">21</span>,  <span class="hljs-number">0.65</span>,  <span class="hljs-number">34</span>,  <span class="hljs-number">9</span>,  <span class="hljs-string">'优'</span>],
     *     [<span class="hljs-number">3</span>,  <span class="hljs-number">56</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">63</span>,  <span class="hljs-number">0.3</span>,   <span class="hljs-number">14</span>,  <span class="hljs-number">5</span>,  <span class="hljs-string">'良'</span>],
     *     [<span class="hljs-number">4</span>,  <span class="hljs-number">33</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">29</span>,  <span class="hljs-number">0.33</span>,  <span class="hljs-number">16</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'优'</span>],
     *     { <span class="hljs-comment">// 数据项也可以是 Object，从而里面能含有对线条的特殊设置。</span>
     *         <span class="hljs-attr">value</span>: [<span class="hljs-number">5</span>,  <span class="hljs-number">42</span>,  <span class="hljs-number">24</span>,  <span class="hljs-number">44</span>,  <span class="hljs-number">0.76</span>,  <span class="hljs-number">40</span>,  <span class="hljs-number">16</span>, <span class="hljs-string">'优'</span>]
     *         <span class="hljs-attr">lineStyle</span>: {...},
     *     }
     *     ...
     * ]
     * </code></pre>
     * <p>数据中，每一行是一个『数据项』，每一列属于一个『维度』。（例如上面数据每一列的含义分别是：『日期』,『AQI指数』, 『PM2.5』, 『PM10』, 『一氧化碳值』, 『二氧化氮值』, 『二氧化硫值』）。</p>
     * <p>平行坐标系适用于对这种多维数据进行可视化分析。每一个维度（每一列）对应一个坐标轴，每一个『数据项』是一条线，贯穿多个坐标轴。在坐标轴上，可以进行数据选取等操作。如下：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/parallel-all&amp;edit=1&amp;reset=1" width="600" height="400"></iframe>
     *
     *
     * <p><strong>配置方式概要</strong></p>
     * <p>『平行坐标系』的 <code class="codespan">option</code> 基本配置如下例：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">parallelAxis</span>: [                     <span class="hljs-comment">// 这是一个个『坐标轴』的定义</span>
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">0</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">0</span>].text}, <span class="hljs-comment">// 每个『坐标轴』有个 'dim' 属性，表示坐标轴的维度号。</span>
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">1</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">1</span>].text},
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">2</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">2</span>].text},
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">3</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">3</span>].text},
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">4</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">4</span>].text},
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">5</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">5</span>].text},
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">6</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">6</span>].text},
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">7</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">7</span>].text,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'category'</span>,           <span class="hljs-comment">// 坐标轴也可以支持类别型数据</span>
     *             <span class="hljs-attr">data</span>: [<span class="hljs-string">'优'</span>, <span class="hljs-string">'良'</span>, <span class="hljs-string">'轻度污染'</span>, <span class="hljs-string">'中度污染'</span>, <span class="hljs-string">'重度污染'</span>, <span class="hljs-string">'严重污染'</span>]
     *         }
     *     ],
     *     <span class="hljs-attr">parallel</span>: {                         <span class="hljs-comment">// 这是『坐标系』的定义</span>
     *         <span class="hljs-attr">left</span>: <span class="hljs-string">'5%'</span>,                     <span class="hljs-comment">// 平行坐标系的位置设置</span>
     *         <span class="hljs-attr">right</span>: <span class="hljs-string">'13%'</span>,
     *         <span class="hljs-attr">bottom</span>: <span class="hljs-string">'10%'</span>,
     *         <span class="hljs-attr">top</span>: <span class="hljs-string">'20%'</span>,
     *         <span class="hljs-attr">parallelAxisDefault</span>: {          <span class="hljs-comment">// 『坐标轴』的公有属性可以配置在这里避免重复书写</span>
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'value'</span>,
     *             <span class="hljs-attr">nameLocation</span>: <span class="hljs-string">'end'</span>,
     *             <span class="hljs-attr">nameGap</span>: <span class="hljs-number">20</span>
     *         }
     *     },
     *     <span class="hljs-attr">series</span>: [                           <span class="hljs-comment">// 这里三个系列共用一个平行坐标系</span>
     *         {
     *             <span class="hljs-attr">name</span>: <span class="hljs-string">'北京'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'parallel'</span>,           <span class="hljs-comment">// 这个系列类型是 'parallel'</span>
     *             <span class="hljs-attr">data</span>: [
     *                 [<span class="hljs-number">1</span>,  <span class="hljs-number">55</span>,  <span class="hljs-number">9</span>,   <span class="hljs-number">56</span>,  <span class="hljs-number">0.46</span>,  <span class="hljs-number">18</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'良'</span>],
     *                 [<span class="hljs-number">2</span>,  <span class="hljs-number">25</span>,  <span class="hljs-number">11</span>,  <span class="hljs-number">21</span>,  <span class="hljs-number">0.65</span>,  <span class="hljs-number">34</span>,  <span class="hljs-number">9</span>,  <span class="hljs-string">'优'</span>],
     *                 ...
     *             ]
     *         },
     *         {
     *             <span class="hljs-attr">name</span>: <span class="hljs-string">'上海'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'parallel'</span>,
     *             <span class="hljs-attr">data</span>: [
     *                 [<span class="hljs-number">3</span>,  <span class="hljs-number">56</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">63</span>,  <span class="hljs-number">0.3</span>,   <span class="hljs-number">14</span>,  <span class="hljs-number">5</span>,  <span class="hljs-string">'良'</span>],
     *                 [<span class="hljs-number">4</span>,  <span class="hljs-number">33</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">29</span>,  <span class="hljs-number">0.33</span>,  <span class="hljs-number">16</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'优'</span>],
     *                 ...
     *             ]
     *         },
     *         {
     *             <span class="hljs-attr">name</span>: <span class="hljs-string">'广州'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'parallel'</span>,
     *             <span class="hljs-attr">data</span>: [
     *                 [<span class="hljs-number">4</span>,  <span class="hljs-number">33</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">29</span>,  <span class="hljs-number">0.33</span>,  <span class="hljs-number">16</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'优'</span>],
     *                 [<span class="hljs-number">5</span>,  <span class="hljs-number">42</span>,  <span class="hljs-number">24</span>,  <span class="hljs-number">44</span>,  <span class="hljs-number">0.76</span>,  <span class="hljs-number">40</span>,  <span class="hljs-number">16</span>, <span class="hljs-string">'优'</span>],
     *                 ...
     *             ]
     *         }
     *     ]
     * };
     * </code></pre>
     * <p>需要涉及到三个组件：<a href="#parallel">parallel</a>、<a href="#parallelAxis">parallelAxis</a>、<a href="#series-parallel">series-parallel</a></p>
     * <ul>
     * <li><p><a href="#parallel">parallel</a></p>
     * <p>  这个配置项是平行坐标系的『坐标系』本身。一个系列（<code class="codespan">series</code>）或多个系列（如上图中的『北京』、『上海』、『广州』分别各是一个系列）可以共用这个『坐标系』。</p>
     * <p>  和其他坐标系一样，坐标系也可以创建多个。</p>
     * <p>  位置设置，也是放在这里进行。</p>
     * </li>
     * <li><p><a href="#parallelAxis">parallelAxis</a></p>
     * <p>  这个是『坐标系』中的坐标轴的配置。自然，需要有多个坐标轴。</p>
     * <p>  其中有 <a href="#parallelAxis.parallelIndex">parallelAxis.parallelIndex</a> 属性，指定这个『坐标轴』在哪个『坐标系』中。默认使用第一个『坐标系』。</p>
     * </li>
     * <li><p><a href="#series-parallel">series-parallel</a></p>
     * <p>  这个是『系列』的定义。系列被画到『坐标系』上。</p>
     * <p>  其中有 <a href="#series-parallel.parallelIndex">series-parallel.parallelIndex</a> 属性，指定使用哪个『坐标系』。默认使用第一个『坐标系』。</p>
     * </li>
     * </ul>
     * <p><strong>配置注意和最佳实践</strong></p>
     * <p>配置多个 <a href="#parallelAxis">parallelAxis</a> 时，有些值一样的属性，如果书写多遍则比较繁琐，那么可以放置在 <a href="#parallel.parallelAxisDefault">parallel.parallelAxisDefault</a> 里。在坐标轴初始化前，<a href="#parallel.parallelAxisDefault">parallel.parallelAxisDefault</a> 里的配置项，会分别融合进 <a href="#parallelAxis">parallelAxis</a>，形成最终的坐标轴的配置。</p>
     * <p><strong>如果数据量很大并且发生卡顿</strong></p>
     * <p>建议把 <a href="#series-parallel.lineStyle.width">series-parallel.lineStyle.width</a> 设为 <code class="codespan">0.5</code>（或更小），
     * 可能显著改善性能。</p>
     * <p><strong>高维数据的显示</strong></p>
     * <p>维度比较多时，比如有 50+ 的维度，那么就会有 50+ 个轴。那么可能会页面显示不下。</p>
     * <p>可以通过 <a href="#parallel.axisExpandable">parallel.axisExpandable</a> 来改善显示效果。</p>
     */
    private Parallel parallel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#parallelAxis">https://echarts.apache.org/zh/option.html#parallelAxis</a>
     * <br/>序号: 18
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>这个组件是平行坐标系中的坐标轴。</p>
     * <p><strong>平行坐标系介绍</strong></p>
     * <p><a href="https://en.wikipedia.org/wiki/Parallel_coordinates" target="_blank">平行坐标系（Parallel Coordinates）</a> 是一种常用的可视化高维数据的图表。</p>
     * <p>例如 <a href="#series-parallel.data">series-parallel.data</a> 中有如下数据：</p>
     * <pre><code class="lang-javascript hljs">[
     *     [<span class="hljs-number">1</span>,  <span class="hljs-number">55</span>,  <span class="hljs-number">9</span>,   <span class="hljs-number">56</span>,  <span class="hljs-number">0.46</span>,  <span class="hljs-number">18</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'良'</span>],
     *     [<span class="hljs-number">2</span>,  <span class="hljs-number">25</span>,  <span class="hljs-number">11</span>,  <span class="hljs-number">21</span>,  <span class="hljs-number">0.65</span>,  <span class="hljs-number">34</span>,  <span class="hljs-number">9</span>,  <span class="hljs-string">'优'</span>],
     *     [<span class="hljs-number">3</span>,  <span class="hljs-number">56</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">63</span>,  <span class="hljs-number">0.3</span>,   <span class="hljs-number">14</span>,  <span class="hljs-number">5</span>,  <span class="hljs-string">'良'</span>],
     *     [<span class="hljs-number">4</span>,  <span class="hljs-number">33</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">29</span>,  <span class="hljs-number">0.33</span>,  <span class="hljs-number">16</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'优'</span>],
     *     { <span class="hljs-comment">// 数据项也可以是 Object，从而里面能含有对线条的特殊设置。</span>
     *         <span class="hljs-attr">value</span>: [<span class="hljs-number">5</span>,  <span class="hljs-number">42</span>,  <span class="hljs-number">24</span>,  <span class="hljs-number">44</span>,  <span class="hljs-number">0.76</span>,  <span class="hljs-number">40</span>,  <span class="hljs-number">16</span>, <span class="hljs-string">'优'</span>]
     *         <span class="hljs-attr">lineStyle</span>: {...},
     *     }
     *     ...
     * ]
     * </code></pre>
     * <p>数据中，每一行是一个『数据项』，每一列属于一个『维度』。（例如上面数据每一列的含义分别是：『日期』,『AQI指数』, 『PM2.5』, 『PM10』, 『一氧化碳值』, 『二氧化氮值』, 『二氧化硫值』）。</p>
     * <p>平行坐标系适用于对这种多维数据进行可视化分析。每一个维度（每一列）对应一个坐标轴，每一个『数据项』是一条线，贯穿多个坐标轴。在坐标轴上，可以进行数据选取等操作。如下：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/parallel-all&amp;edit=1&amp;reset=1" width="600" height="400"></iframe>
     *
     *
     * <p><strong>配置方式概要</strong></p>
     * <p>『平行坐标系』的 <code class="codespan">option</code> 基本配置如下例：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">parallelAxis</span>: [                     <span class="hljs-comment">// 这是一个个『坐标轴』的定义</span>
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">0</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">0</span>].text}, <span class="hljs-comment">// 每个『坐标轴』有个 'dim' 属性，表示坐标轴的维度号。</span>
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">1</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">1</span>].text},
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">2</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">2</span>].text},
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">3</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">3</span>].text},
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">4</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">4</span>].text},
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">5</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">5</span>].text},
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">6</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">6</span>].text},
     *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">7</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">7</span>].text,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'category'</span>,           <span class="hljs-comment">// 坐标轴也可以支持类别型数据</span>
     *             <span class="hljs-attr">data</span>: [<span class="hljs-string">'优'</span>, <span class="hljs-string">'良'</span>, <span class="hljs-string">'轻度污染'</span>, <span class="hljs-string">'中度污染'</span>, <span class="hljs-string">'重度污染'</span>, <span class="hljs-string">'严重污染'</span>]
     *         }
     *     ],
     *     <span class="hljs-attr">parallel</span>: {                         <span class="hljs-comment">// 这是『坐标系』的定义</span>
     *         <span class="hljs-attr">left</span>: <span class="hljs-string">'5%'</span>,                     <span class="hljs-comment">// 平行坐标系的位置设置</span>
     *         <span class="hljs-attr">right</span>: <span class="hljs-string">'13%'</span>,
     *         <span class="hljs-attr">bottom</span>: <span class="hljs-string">'10%'</span>,
     *         <span class="hljs-attr">top</span>: <span class="hljs-string">'20%'</span>,
     *         <span class="hljs-attr">parallelAxisDefault</span>: {          <span class="hljs-comment">// 『坐标轴』的公有属性可以配置在这里避免重复书写</span>
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'value'</span>,
     *             <span class="hljs-attr">nameLocation</span>: <span class="hljs-string">'end'</span>,
     *             <span class="hljs-attr">nameGap</span>: <span class="hljs-number">20</span>
     *         }
     *     },
     *     <span class="hljs-attr">series</span>: [                           <span class="hljs-comment">// 这里三个系列共用一个平行坐标系</span>
     *         {
     *             <span class="hljs-attr">name</span>: <span class="hljs-string">'北京'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'parallel'</span>,           <span class="hljs-comment">// 这个系列类型是 'parallel'</span>
     *             <span class="hljs-attr">data</span>: [
     *                 [<span class="hljs-number">1</span>,  <span class="hljs-number">55</span>,  <span class="hljs-number">9</span>,   <span class="hljs-number">56</span>,  <span class="hljs-number">0.46</span>,  <span class="hljs-number">18</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'良'</span>],
     *                 [<span class="hljs-number">2</span>,  <span class="hljs-number">25</span>,  <span class="hljs-number">11</span>,  <span class="hljs-number">21</span>,  <span class="hljs-number">0.65</span>,  <span class="hljs-number">34</span>,  <span class="hljs-number">9</span>,  <span class="hljs-string">'优'</span>],
     *                 ...
     *             ]
     *         },
     *         {
     *             <span class="hljs-attr">name</span>: <span class="hljs-string">'上海'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'parallel'</span>,
     *             <span class="hljs-attr">data</span>: [
     *                 [<span class="hljs-number">3</span>,  <span class="hljs-number">56</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">63</span>,  <span class="hljs-number">0.3</span>,   <span class="hljs-number">14</span>,  <span class="hljs-number">5</span>,  <span class="hljs-string">'良'</span>],
     *                 [<span class="hljs-number">4</span>,  <span class="hljs-number">33</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">29</span>,  <span class="hljs-number">0.33</span>,  <span class="hljs-number">16</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'优'</span>],
     *                 ...
     *             ]
     *         },
     *         {
     *             <span class="hljs-attr">name</span>: <span class="hljs-string">'广州'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'parallel'</span>,
     *             <span class="hljs-attr">data</span>: [
     *                 [<span class="hljs-number">4</span>,  <span class="hljs-number">33</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">29</span>,  <span class="hljs-number">0.33</span>,  <span class="hljs-number">16</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'优'</span>],
     *                 [<span class="hljs-number">5</span>,  <span class="hljs-number">42</span>,  <span class="hljs-number">24</span>,  <span class="hljs-number">44</span>,  <span class="hljs-number">0.76</span>,  <span class="hljs-number">40</span>,  <span class="hljs-number">16</span>, <span class="hljs-string">'优'</span>],
     *                 ...
     *             ]
     *         }
     *     ]
     * };
     * </code></pre>
     * <p>需要涉及到三个组件：<a href="#parallel">parallel</a>、<a href="#parallelAxis">parallelAxis</a>、<a href="#series-parallel">series-parallel</a></p>
     * <ul>
     * <li><p><a href="#parallel">parallel</a></p>
     * <p>  这个配置项是平行坐标系的『坐标系』本身。一个系列（<code class="codespan">series</code>）或多个系列（如上图中的『北京』、『上海』、『广州』分别各是一个系列）可以共用这个『坐标系』。</p>
     * <p>  和其他坐标系一样，坐标系也可以创建多个。</p>
     * <p>  位置设置，也是放在这里进行。</p>
     * </li>
     * <li><p><a href="#parallelAxis">parallelAxis</a></p>
     * <p>  这个是『坐标系』中的坐标轴的配置。自然，需要有多个坐标轴。</p>
     * <p>  其中有 <a href="#parallelAxis.parallelIndex">parallelAxis.parallelIndex</a> 属性，指定这个『坐标轴』在哪个『坐标系』中。默认使用第一个『坐标系』。</p>
     * </li>
     * <li><p><a href="#series-parallel">series-parallel</a></p>
     * <p>  这个是『系列』的定义。系列被画到『坐标系』上。</p>
     * <p>  其中有 <a href="#series-parallel.parallelIndex">series-parallel.parallelIndex</a> 属性，指定使用哪个『坐标系』。默认使用第一个『坐标系』。</p>
     * </li>
     * </ul>
     * <p><strong>配置注意和最佳实践</strong></p>
     * <p>配置多个 <a href="#parallelAxis">parallelAxis</a> 时，有些值一样的属性，如果书写多遍则比较繁琐，那么可以放置在 <a href="#parallel.parallelAxisDefault">parallel.parallelAxisDefault</a> 里。在坐标轴初始化前，<a href="#parallel.parallelAxisDefault">parallel.parallelAxisDefault</a> 里的配置项，会分别融合进 <a href="#parallelAxis">parallelAxis</a>，形成最终的坐标轴的配置。</p>
     * <p><strong>如果数据量很大并且发生卡顿</strong></p>
     * <p>建议把 <a href="#series-parallel.lineStyle.width">series-parallel.lineStyle.width</a> 设为 <code class="codespan">0.5</code>（或更小），
     * 可能显著改善性能。</p>
     * <p><strong>高维数据的显示</strong></p>
     * <p>维度比较多时，比如有 50+ 的维度，那么就会有 50+ 个轴。那么可能会页面显示不下。</p>
     * <p>可以通过 <a href="#parallel.axisExpandable">parallel.axisExpandable</a> 来改善显示效果。</p>
     */
    private ParallelAxis parallelAxis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#singleAxis">https://echarts.apache.org/zh/option.html#singleAxis</a>
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单轴。可以被应用到散点图中展现一维数据，如下示例</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-single-axis&amp;edit=1&amp;reset=1" width="700" height="500"></iframe>
     */
    private SingleAxis singleAxis;
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
     */
    private Timeline timeline;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic">https://echarts.apache.org/zh/option.html#graphic</a>
     * <br/>序号: 21
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">graphic</code> 是原生图形元素组件。可以支持的图形元素包括：</p>
     * <p><a href="#graphic.elements-image">image</a>,
     * <a href="#graphic.elements-text">text</a>,
     * <a href="#graphic.elements-circle">circle</a>,
     * <a href="#graphic.elements-sector">sector</a>,
     * <a href="#graphic.elements-ring">ring</a>,
     * <a href="#graphic.elements-polygon">polygon</a>,
     * <a href="#graphic.elements-polyline">polyline</a>,
     * <a href="#graphic.elements-rect">rect</a>,
     * <a href="#graphic.elements-line">line</a>,
     * <a href="#graphic.elements-bezierCurve">bezierCurve</a>,
     * <a href="#graphic.elements-arc">arc</a>,
     * <a href="#graphic.elements-group">group</a>,</p>
     * <p>下面示例中，使用图形元素做了水印，和文本块：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-graphic&amp;edit=1&amp;reset=1" width="600" height="400" data-ll-timeout="18"></iframe>
     *
     *
     * <p>下面示例中，使用隐藏的图形元素实现了拖拽：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-draggable&amp;edit=1&amp;reset=1" width="600" height="400" data-ll-timeout="19"></iframe>
     *
     *
     *
     *
     * <p><br></p>
     * <hr>
     * <p><strong>graphic 设置介绍</strong></p>
     * <p>只配一个图形元素时的简写方法：</p>
     * <pre><code class="lang-javascript hljs">myChart.setOption({
     *     ...,
     *     <span class="hljs-attr">graphic</span>: {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'image'</span>,
     *         ...
     *     }
     * });
     * </code></pre>
     * <p>配多个图形元素：</p>
     * <pre><code class="lang-javascript hljs">myChart.setOption({
     *     ...,
     *     <span class="hljs-attr">graphic</span>: [
     *         { <span class="hljs-comment">// 一个图形元素，类型是 image。</span>
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'image'</span>,
     *             ...
     *         },
     *         { <span class="hljs-comment">// 一个图形元素，类型是 text，指定了 id。</span>
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'text'</span>,
     *             <span class="hljs-attr">id</span>: <span class="hljs-string">'text1'</span>,
     *             ...
     *         },
     *         { <span class="hljs-comment">// 一个图形元素，类型是 group，可以嵌套子节点。</span>
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'group'</span>,
     *             <span class="hljs-attr">children</span>: [
     *                 {
     *                     <span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>,
     *                     <span class="hljs-attr">id</span>: <span class="hljs-string">'rect1'</span>,
     *                     ...
     *                 },
     *                 {
     *                     <span class="hljs-attr">type</span>: <span class="hljs-string">'image'</span>,
     *                     ...
     *                 },
     *                 ...
     *             ]
     *         }
     *         ...
     *     ]
     * });
     *
     * </code></pre>
     * <p>使用 setOption 来删除或更换（替代）已有的图形元素：</p>
     * <pre><code class="lang-javascript hljs">myChart.setOption({
     *     ...,
     *     <span class="hljs-attr">graphic</span>: [
     *         { <span class="hljs-comment">// 删除上例中定义的 'text1' 元素。</span>
     *             <span class="hljs-attr">id</span>: <span class="hljs-string">'text1'</span>,
     *             <span class="hljs-attr">$action</span>: <span class="hljs-string">'remove'</span>,
     *             ...
     *         },
     *         { <span class="hljs-comment">// 将上例中定义的 'rect1' 元素换成 circle。</span>
     *           <span class="hljs-comment">// 注意尽管 'rect1' 在一个 group 中，但这里并不需要顾忌层级，用id指定就可以了。</span>
     *             <span class="hljs-attr">id</span>: <span class="hljs-string">'rect1'</span>,
     *             <span class="hljs-attr">$action</span>: <span class="hljs-string">'replace'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'circle'</span>,
     *             ...
     *         }
     *     ]
     * });
     * </code></pre>
     * <p>注意，如果没有指定 id，第二次 setOption 时会按照元素在 option 中出现的顺序和已有的图形元素进行匹配。这有时会产生不易理解的效果。
     * 所以，一般来说，更新 elements 时推荐使用 id 进行准确的指定，而非省略 id。</p>
     * <p><br></p>
     * <hr>
     * <p><strong>图形元素设置介绍</strong></p>
     * <p>介绍每个图形元素的配置。不同类型的图形元素的设置有这些共性：</p>
     * <pre><code class="lang-javascript hljs">{
     *     <span class="hljs-comment">// id 用于在更新图形元素时指定更新哪个图形元素，如果不需要用可以忽略。</span>
     *     <span class="hljs-attr">id</span>: <span class="hljs-string">'xxx'</span>,
     *
     *     <span class="hljs-comment">// 这个字段在第一次设置时不能忽略，取值见上方『支持的图形元素』。</span>
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'image'</span>,
     *
     *     <span class="hljs-comment">// 下面的各个属性如果不需要设置都可以忽略，忽略则取默认值。</span>
     *
     *     <span class="hljs-comment">// 指定本次 setOption 对此图形元素进行的操作。默认是 'merge'，还可以 'replace' 或 'remove'。</span>
     *     <span class="hljs-attr">$action</span>: <span class="hljs-string">'replace'</span>,
     *
     *     <span class="hljs-comment">// 这是四个相对于父元素的定位属性，每个属性可取『像素值』或者『百分比』或者 'center'/'middle'。</span>
     *     <span class="hljs-attr">left</span>: <span class="hljs-number">10</span>,
     *     <span class="hljs-comment">// right: 10,</span>
     *     <span class="hljs-attr">top</span>: <span class="hljs-string">'center'</span>,
     *     <span class="hljs-comment">// bottom: '10%',</span>
     *
     *     <span class="hljs-attr">shape</span>: {
     *         <span class="hljs-comment">// 定位、形状相关的设置，如 x, y, cx, cy, width, height, r, points 等。</span>
     *         <span class="hljs-comment">// 注意，如果设置了 left/right/top/bottom，这里的定位用的 x/y/cx/cy 会失效。</span>
     *     },
     *
     *     <span class="hljs-attr">style</span>: {
     *         <span class="hljs-comment">// 样式相关的设置，如 fill, stroke, lineWidth, shadowBlur 等。</span>
     *     },
     *
     *     <span class="hljs-comment">// 表示 z 高度，从而指定了图形元素的覆盖关系。</span>
     *     <span class="hljs-attr">z</span>: <span class="hljs-number">10</span>,
     *     <span class="hljs-comment">// 表示不响应事件。</span>
     *     <span class="hljs-attr">silent</span>: <span class="hljs-literal">true</span>,
     *     <span class="hljs-comment">// 表示节点不显示</span>
     *     <span class="hljs-attr">invisible</span>: <span class="hljs-literal">false</span>,
     *     <span class="hljs-comment">// 设置是否整体限制在父节点范围内。可选值：'raw', 'all'。</span>
     *     <span class="hljs-attr">bouding</span>: <span class="hljs-string">'raw'</span>,
     *     <span class="hljs-comment">// 是否可以被拖拽。</span>
     *     <span class="hljs-attr">draggable</span>: <span class="hljs-literal">false</span>,
     *     <span class="hljs-comment">// 事件的监听器，还可以是 onmousemove, ondrag 等。支持的事件参见下。</span>
     *     <span class="hljs-attr">onclick</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params"></span>) </span>{...}
     * }
     * </code></pre>
     * <p><br></p>
     * <hr>
     * <p><strong>图形元素的事件</strong></p>
     * <p>支持这些事件配置：
     * <code class="codespan">onclick</code>, <code class="codespan">onmouseover</code>, <code class="codespan">onmouseout</code>, <code class="codespan">onmousemove</code>, <code class="codespan">onmousewheel</code>, <code class="codespan">onmousedown</code>, <code class="codespan">onmouseup</code>, <code class="codespan">ondrag</code>, <code class="codespan">ondragstart</code>, <code class="codespan">ondragend</code>, <code class="codespan">ondragenter</code>, <code class="codespan">ondragleave</code>, <code class="codespan">ondragover</code>, <code class="codespan">ondrop</code>。</p>
     * <p><br></p>
     * <hr>
     * <p><strong>图形元素的层级关系</strong></p>
     * <p>只有 <code class="codespan">group</code> 元素可以有子节点，从而以该 <code class="codespan">group</code> 元素为根的元素树可以共同定位（共同移动）。</p>
     * <p><br></p>
     * <hr>
     * <p><strong>图形元素的基本形状设置</strong></p>
     * <p>每个图形元素本身有自己的图形基本的位置和尺寸设置，例如：</p>
     * <pre><code class="lang-javascript hljs">{
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>,
     *     <span class="hljs-attr">shape</span>: {
     *         <span class="hljs-attr">x</span>: <span class="hljs-number">10</span>,
     *         <span class="hljs-attr">y</span>: <span class="hljs-number">10</span>,
     *         <span class="hljs-attr">width</span>: <span class="hljs-number">100</span>,
     *         <span class="hljs-attr">height</span>: <span class="hljs-number">200</span>
     *     }
     * },
     * {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'circle'</span>,
     *     <span class="hljs-attr">shape</span>: {
     *         <span class="hljs-attr">cx</span>: <span class="hljs-number">20</span>,
     *         <span class="hljs-attr">cy</span>: <span class="hljs-number">30</span>,
     *         <span class="hljs-attr">r</span>: <span class="hljs-number">100</span>
     *     }
     * },
     * {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'image'</span>,
     *     <span class="hljs-attr">style</span>: {
     *         <span class="hljs-attr">image</span>: <span class="hljs-string">'http://xxx.xxx.xxx/a.png'</span>,
     *         <span class="hljs-attr">x</span>: <span class="hljs-number">100</span>,
     *         <span class="hljs-attr">y</span>: <span class="hljs-number">200</span>,
     *         <span class="hljs-attr">width</span>: <span class="hljs-number">230</span>,
     *         <span class="hljs-attr">height</span>: <span class="hljs-number">400</span>
     *     }
     * },
     * {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'text'</span>,
     *     <span class="hljs-attr">style</span>: {
     *         <span class="hljs-attr">text</span>: <span class="hljs-string">'This text'</span>,
     *         <span class="hljs-attr">x</span>: <span class="hljs-number">100</span>,
     *         <span class="hljs-attr">y</span>: <span class="hljs-number">200</span>
     *     }
     *
     * }
     * </code></pre>
     * <p><br></p>
     * <hr>
     * <p><strong>图形元素的定位和 transfrom</strong></p>
     * <p>除此以外，可以以 transform 的方式对图形进行平移、旋转、缩放，
     * 参见：<a href="#graphic.elements.position">position</a>、<a href="#graphic.elements.rotation">rotation</a>、<a href="#graphic.elements.scale">scale</a>、<a href="#graphic.elements.origin">origin</a>。</p>
     * <pre><code class="lang-javascript hljs">{
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>,
     *     <span class="hljs-attr">position</span>: [<span class="hljs-number">100</span>, <span class="hljs-number">200</span>], <span class="hljs-comment">// 平移，默认值为 [0, 0]。</span>
     *     <span class="hljs-attr">scale</span>: [<span class="hljs-number">2</span>, <span class="hljs-number">4</span>], <span class="hljs-comment">// 缩放，默认值为 [1, 1]。表示缩放的倍数。</span>
     *     <span class="hljs-attr">rotation</span>: <span class="hljs-built_in">Math</span>.PI / <span class="hljs-number">4</span>, <span class="hljs-comment">// 旋转，默认值为 0。表示旋转的弧度值。正值表示逆时针旋转。</span>
     *     <span class="hljs-attr">origin</span>: [<span class="hljs-number">10</span>, <span class="hljs-number">20</span>], <span class="hljs-comment">// 旋转和缩放的中心点，默认值为 [0, 0]。</span>
     *     <span class="hljs-attr">shape</span>: {
     *         <span class="hljs-comment">// ...</span>
     *     }
     * }
     * </code></pre>
     * <ul>
     * <li>每个图形元素在父节点的坐标系中进行 transform，也就是说父子节点的 transform 能『叠加』。</li>
     * <li>每个图形元素进行 transform 顺序是：<ol>
     * <li>平移 [-el.origin[0], -el.origin[1]]。</li>
     * <li>根据 el.scale 缩放。</li>
     * <li>根据 el.rotation 旋转。</li>
     * <li>根据 el.origin 平移。</li>
     * <li>根据 el.position 平移。</li>
     * </ol>
     * </li>
     * <li>也就是说先缩放旋转后平移，这样平移不会影响缩放旋转的 origin。</li>
     * </ul>
     * <p><br></p>
     * <hr>
     * <p><strong>图形元素相对定位</strong></p>
     * <p>以上两者是基本的绝对定位，除此之外，在实际应用中，容器尺寸常常是不确定甚至动态变化的，所以需要提供相对定位的机制。graphic 组件使用 <a href="#graphic.elements.left">left</a> / <a href="#graphic.elements.right">right</a> / <a href="#graphic.elements.top">top</a> / <a href="#graphic.elements.bottom">bottom</a> / <a href="#graphic.elements.width">width</a> / <a href="#graphic.elements.height">height</a> 提供了相对定位的机制。</p>
     * <p>例如：</p>
     * <pre><code class="lang-javascript hljs">{ <span class="hljs-comment">// 将图片定位到最下方的中间：</span>
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'image'</span>,
     *     <span class="hljs-attr">left</span>: <span class="hljs-string">'center'</span>, <span class="hljs-comment">// 水平定位到中间</span>
     *     <span class="hljs-attr">bottom</span>: <span class="hljs-string">'10%'</span>,  <span class="hljs-comment">// 定位到距离下边界 10% 处</span>
     *     <span class="hljs-attr">style</span>: {
     *         <span class="hljs-attr">image</span>: <span class="hljs-string">'http://xxx.xxx.xxx/a.png'</span>,
     *         <span class="hljs-attr">width</span>: <span class="hljs-number">45</span>,
     *         <span class="hljs-attr">height</span>: <span class="hljs-number">45</span>
     *     }
     * },
     * { <span class="hljs-comment">// 将旋转过的 group 整体定位右下角：</span>
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'group'</span>,
     *     <span class="hljs-attr">right</span>: <span class="hljs-number">0</span>,  <span class="hljs-comment">// 定位到右下角</span>
     *     <span class="hljs-attr">bottom</span>: <span class="hljs-number">0</span>, <span class="hljs-comment">// 定位到右下角</span>
     *     <span class="hljs-attr">rotation</span>: <span class="hljs-built_in">Math</span>.PI / <span class="hljs-number">4</span>,
     *     <span class="hljs-attr">children</span>: [
     *         {
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>,
     *             <span class="hljs-attr">left</span>: <span class="hljs-string">'center'</span>, <span class="hljs-comment">// 相对父元素居中</span>
     *             <span class="hljs-attr">top</span>: <span class="hljs-string">'middle'</span>,  <span class="hljs-comment">// 相对父元素居中</span>
     *             <span class="hljs-attr">shape</span>: {
     *                 <span class="hljs-attr">width</span>: <span class="hljs-number">190</span>,
     *                 <span class="hljs-attr">height</span>: <span class="hljs-number">90</span>
     *             },
     *             <span class="hljs-attr">style</span>: {
     *                 <span class="hljs-attr">fill</span>: <span class="hljs-string">'#fff'</span>,
     *                 <span class="hljs-attr">stroke</span>: <span class="hljs-string">'#999'</span>,
     *                 <span class="hljs-attr">lineWidth</span>: <span class="hljs-number">2</span>,
     *                 <span class="hljs-attr">shadowBlur</span>: <span class="hljs-number">8</span>,
     *                 <span class="hljs-attr">shadowOffsetX</span>: <span class="hljs-number">3</span>,
     *                 <span class="hljs-attr">shadowOffsetY</span>: <span class="hljs-number">3</span>,
     *                 <span class="hljs-attr">shadowColor</span>: <span class="hljs-string">'rgba(0,0,0,0.3)'</span>
     *             }
     *         },
     *         {
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'text'</span>,
     *             <span class="hljs-attr">left</span>: <span class="hljs-string">'center'</span>, <span class="hljs-comment">// 相对父元素居中</span>
     *             <span class="hljs-attr">top</span>: <span class="hljs-string">'middle'</span>,  <span class="hljs-comment">// 相对父元素居中</span>
     *             <span class="hljs-attr">style</span>: {
     *                 <span class="hljs-attr">fill</span>: <span class="hljs-string">'#777'</span>,
     *                 <span class="hljs-attr">text</span>: [
     *                     <span class="hljs-string">'This is text'</span>,
     *                     <span class="hljs-string">'这是一段文字'</span>,
     *                     <span class="hljs-string">'Print some text'</span>
     *                 ].join(<span class="hljs-string">'\n'</span>),
     *                 <span class="hljs-attr">font</span>: <span class="hljs-string">'14px Microsoft YaHei'</span>
     *             }
     *         }
     *     ]
     * }
     * </code></pre>
     * <p>注意，可以用 <a href="graphic.elements.bounding" target="_blank">bounding</a> 来设置是否整体限制在父节点范围内。</p>
     */
    private Graphic graphic;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#calendar">https://echarts.apache.org/zh/option.html#calendar</a>
     * <br/>序号: 22
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>日历坐标系组件。</p>
     * <p>在ECharts中，我们非常有创意地实现了日历图，是通过使用日历坐标系组件来达到日历图效果的，如下方的几个示例图所示，我们可以在热力图、散点图、关系图中使用日历坐标系。</p>
     * <p>在日历坐标系中使用热力图的示例:</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=calendar-heatmap&amp;edit=1&amp;reset=1" width="800" height="400" data-ll-timeout="17"></iframe>
     *
     *
     * <p>在日历坐标系中使用散点图的示例:</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=calendar-effectscatter&amp;edit=1&amp;reset=1" width="800" height="600" data-ll-timeout="18"></iframe>
     *
     *
     * <p>在日历坐标系中使用关系图（以及混合图表）的示例:</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=calendar-graph&amp;edit=1&amp;reset=1" width="600" height="600"></iframe>
     *
     *
     * <p>灵活利用 echarts 图表和坐标系的组合，以及 API，可以实现更丰富的效果。
     * <a href="https://echarts.apache.org/examples/zh/editor.html?c=calendar-lunar&amp;edit=1&amp;reset=1" target="_blank">在日历中使用文字</a>、
     * <a href="https://echarts.apache.org/examples/zh/editor.html?c=calendar-pie&amp;edit=1&amp;reset=1" target="_blank">在日历中放置饼图</a></p>
     * <hr>
     * <p><strong>水平和垂直放置日历</strong></p>
     * <p>在日历坐标系可以水平放置，也可以垂直放置。如上面的例子，使用热力图时，经常是水平放置的。但是如果需要格子的尺寸大些，水平放置就过于宽了，于是也可以选择垂直放置。参见 <a href="#calendar.orient">calendar.orient</a>。</p>
     * <hr>
     * <p><strong>尺寸的自适应</strong></p>
     * <p>可以设置日历坐标系使他支持不同尺寸的容器（页面）大小变化的自适应。首先，和 echarts 其他组件一样，日历坐标系可以选择使用 <a href="#calendar.left">left</a> <a href="#calendar.right">right</a> <a href="#calendar.top">top</a> <a href="bottom" target="_blank">bottom</a> <a href="#calendar.width">width</a> <a href="#calendar.height">height</a> 来描述尺寸和位置，从而将日历摆放在上下左右各种位置，并随着页面尺寸变动而改变自身尺寸。另外，也可以使用 <a href="#calendar.cellSize">cellSize</a> 来固定日历格子的长宽。</p>
     * <hr>
     * <p><strong>中西方日历习惯的支持</strong></p>
     * <p>中西方日历有所差别，西方常使用星期日作为一周的第一天，中国使用星期一为一周的第一天。日历坐标系做了这种切换的支持。参见 <a href="#calendar.dayLabel.firstDay">calendar.dayLabel.firstDay</a>。</p>
     * <p>另外，日历上的『月份』和『星期几』的文字，也可以较方便的切换中英文，甚至自定义。参见 <a href="#calendar.dayLabel.nameMap">calendar.dayLabel.nameMap</a> <a href="#calendar.monthLabel.nameMap">calendar.monthLabel.nameMap</a>。</p>
     * <hr>
     */
    private Calendar calendar;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset">https://echarts.apache.org/zh/option.html#dataset</a>
     * <br/>序号: 23
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>ECharts 4 开始支持了 <code class="codespan">数据集</code>（<code class="codespan">dataset</code>）组件用于单独的数据集声明，从而数据可以单独管理，被多个组件复用，并且可以自由指定数据到视觉的映射。这在不少场景下能带来使用上的方便。</p>
     * <p>关于 <code class="codespan">dataset</code> 的详情，请参见<a href="tutorial.html#%E4%BD%BF%E7%94%A8%20dataset%20%E7%AE%A1%E7%90%86%E6%95%B0%E6%8D%AE" target="_blank">教程</a>。</p>
     */
    private Dataset dataset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria">https://echarts.apache.org/zh/option.html#aria</a>
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>W3C 制定了无障碍富互联网应用规范集（<a href="https://www.w3.org/WAI/intro/aria" target="_blank">WAI-ARIA</a>，the Accessible Rich Internet Applications Suite），致力于使得网页内容和网页应用能够被更多残障人士访问。Apache ECharts 4 遵从这一规范，支持自动根据图表配置项智能生成描述，使得盲人可以在朗读设备的帮助下了解图表内容，让图表可以被更多人群访问。除此之外，Apache ECharts 5 新增支持贴花纹理，作为颜色的辅助表达，进一步用以区分数据。</p>
     * <p>默认关闭，需要通过将 <a href="#aria.enabled">aria.enabled</a> 设置为 <code class="codespan">true</code> 开启。</p>
     */
    private Aria aria;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series">https://echarts.apache.org/zh/option.html#series</a>
     * <br/>序号: 25
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     */
    private List<Series> series;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#darkMode">https://echarts.apache.org/zh/option.html#darkMode</a>
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>是否是暗黑模式，默认会根据背景色 <a href="#backgroundColor">backgroundColor</a> 的亮度自动设置。
     * 如果是设置了容器的背景色而无法判断到，就可以使用该配置手动指定，echarts 会根据是否是暗黑模式调整文本等的颜色。</p>
     * <p>该配置通常会被用于主题中。</p>
     */
    private Object darkMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#color">https://echarts.apache.org/zh/option.html#color</a>
     * <br/>序号: 27
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>调色盘颜色列表。如果系列没有设置颜色，则会依次循环从该列表中取颜色作为系列颜色。</p>
     * <p>默认为：</p>
     * <pre><code class="lang-js hljs javascript">[<span class="hljs-string">'#5470c6'</span>, <span class="hljs-string">'#91cc75'</span>, <span class="hljs-string">'#fac858'</span>, <span class="hljs-string">'#ee6666'</span>, <span class="hljs-string">'#73c0de'</span>, <span class="hljs-string">'#3ba272'</span>, <span class="hljs-string">'#fc8452'</span>, <span class="hljs-string">'#9a60b4'</span>, <span class="hljs-string">'#ea7ccc'</span>]
     * </code></pre>
     */
    private Object color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#backgroundColor">https://echarts.apache.org/zh/option.html#backgroundColor</a>
     * <br/>序号: 28
     * <br/>默认值: transparent
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>背景色，默认无背景。</p>
     * <blockquote>
     * <p>颜色可以使用 RGB 表示，比如 <code class="codespan">'rgb(128, 128, 128)'</code>，如果想要加上 alpha 通道表示不透明度，可以使用 RGBA，比如 <code class="codespan">'rgba(128, 128, 128, 0.5)'</code>，也可以使用十六进制格式，比如 <code class="codespan">'#ccc'</code>。除了纯色之外颜色也支持渐变色和纹理填充</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 线性渐变，前四个参数分别是 x0, y0, x2, y2, 范围从 0 - 1，相当于在图形包围盒中的百分比，如果 globalCoord 为 `true`，则该四个值是绝对的像素位置</span>
     * <span class="hljs-attr">color</span>: {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'linear'</span>,
     *     <span class="hljs-attr">x</span>: <span class="hljs-number">0</span>,
     *     <span class="hljs-attr">y</span>: <span class="hljs-number">0</span>,
     *     <span class="hljs-attr">x2</span>: <span class="hljs-number">0</span>,
     *     <span class="hljs-attr">y2</span>: <span class="hljs-number">1</span>,
     *     <span class="hljs-attr">colorStops</span>: [{
     *         <span class="hljs-attr">offset</span>: <span class="hljs-number">0</span>, <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span> <span class="hljs-comment">// 0% 处的颜色</span>
     *     }, {
     *         <span class="hljs-attr">offset</span>: <span class="hljs-number">1</span>, <span class="hljs-attr">color</span>: <span class="hljs-string">'blue'</span> <span class="hljs-comment">// 100% 处的颜色</span>
     *     }],
     *     <span class="hljs-attr">global</span>: <span class="hljs-literal">false</span> <span class="hljs-comment">// 缺省为 false</span>
     * }
     * <span class="hljs-comment">// 径向渐变，前三个参数分别是圆心 x, y 和半径，取值同线性渐变</span>
     * <span class="hljs-attr">color</span>: {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'radial'</span>,
     *     <span class="hljs-attr">x</span>: <span class="hljs-number">0.5</span>,
     *     <span class="hljs-attr">y</span>: <span class="hljs-number">0.5</span>,
     *     <span class="hljs-attr">r</span>: <span class="hljs-number">0.5</span>,
     *     <span class="hljs-attr">colorStops</span>: [{
     *         <span class="hljs-attr">offset</span>: <span class="hljs-number">0</span>, <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span> <span class="hljs-comment">// 0% 处的颜色</span>
     *     }, {
     *         <span class="hljs-attr">offset</span>: <span class="hljs-number">1</span>, <span class="hljs-attr">color</span>: <span class="hljs-string">'blue'</span> <span class="hljs-comment">// 100% 处的颜色</span>
     *     }],
     *     <span class="hljs-attr">global</span>: <span class="hljs-literal">false</span> <span class="hljs-comment">// 缺省为 false</span>
     * }
     * <span class="hljs-comment">// 纹理填充</span>
     * <span class="hljs-attr">color</span>: {
     *     <span class="hljs-attr">image</span>: imageDom, <span class="hljs-comment">// 支持为 HTMLImageElement, HTMLCanvasElement，不支持路径字符串</span>
     *     <span class="hljs-attr">repeat</span>: <span class="hljs-string">'repeat'</span> <span class="hljs-comment">// 是否平铺，可以是 'repeat-x', 'repeat-y', 'no-repeat'</span>
     * }
     * </code></pre>
     * </blockquote>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#textStyle">https://echarts.apache.org/zh/option.html#textStyle</a>
     * <br/>序号: 29
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>全局的字体样式。</p>
     */
    private TextStyle textStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#animation">https://echarts.apache.org/zh/option.html#animation</a>
     * <br/>序号: 30
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#animationThreshold">https://echarts.apache.org/zh/option.html#animationThreshold</a>
     * <br/>序号: 31
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#animationDuration">https://echarts.apache.org/zh/option.html#animationDuration</a>
     * <br/>序号: 32
     * <br/>默认值: 1000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>初始动画的时长，支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的初始动画效果：</p>
     * <pre><code class="lang-js hljs javascript">animationDuration: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Integer animationDuration;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#animationEasing">https://echarts.apache.org/zh/option.html#animationEasing</a>
     * <br/>序号: 33
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#animationDelay">https://echarts.apache.org/zh/option.html#animationDelay</a>
     * <br/>序号: 34
     * <br/>默认值: 0
     * <br/>js类型: ["number"]
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
    private Integer animationDelay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#animationDurationUpdate">https://echarts.apache.org/zh/option.html#animationDurationUpdate</a>
     * <br/>序号: 35
     * <br/>默认值: 300
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>数据更新动画的时长。</p>
     * <p>支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的更新动画效果：</p>
     * <pre><code class="lang-js hljs javascript">animationDurationUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Integer animationDurationUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#animationEasingUpdate">https://echarts.apache.org/zh/option.html#animationEasingUpdate</a>
     * <br/>序号: 36
     * <br/>默认值: cubicInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#animationDelayUpdate">https://echarts.apache.org/zh/option.html#animationDelayUpdate</a>
     * <br/>序号: 37
     * <br/>默认值: 0
     * <br/>js类型: ["number"]
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
    private Integer animationDelayUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#stateAnimation">https://echarts.apache.org/zh/option.html#stateAnimation</a>
     * <br/>序号: 38
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>状态切换的动画配置，支持在每个系列里设置单独针对该系列的配置。</p>
     */
    private StateAnimation stateAnimation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#blendMode">https://echarts.apache.org/zh/option.html#blendMode</a>
     * <br/>序号: 39
     * <br/>默认值: source-over
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图形的混合模式，不同的混合模式见 <a href="https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation" target="_blank">https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation</a> 。</p>
     * <p>默认为 <code class="codespan">'source-over'</code>。 支持每个系列单独设置。</p>
     * <p><code class="codespan">'lighter'</code> 也是比较常见的一种混合模式，该模式下图形数量集中的区域会颜色叠加成高亮度的颜色（白色）。常常能起到突出该区域的效果。见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=lines-airline" target="_blank">全球飞行航线</a></p>
     */
    private String blendMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#hoverLayerThreshold">https://echarts.apache.org/zh/option.html#hoverLayerThreshold</a>
     * <br/>序号: 40
     * <br/>默认值: 3000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形数量阈值，决定是否开启单独的 hover 层，在整个图表的图形数量大于该阈值时开启单独的 hover 层。</p>
     * <p>单独的 hover 层主要是为了在高亮图形的时候不需要重绘整个图表，只需要把高亮的图形放入单独的一个 canvas 层进行绘制，防止在图形数量很多的时候因为高亮重绘所有图形导致卡顿。</p>
     * <p>ECharts 2 里是底层强制使用单独的层绘制高亮图形，但是会带来很多问题，比如高亮的图形可能会不正确的遮挡所有其它图形，还有图形有透明度因为高亮和正常图形叠加导致不正确的透明度显示，还有移动端上因为每个图表都要多一个 canvas 带来的额外内存开销。因此 3 里默认不会开启该优化，只有在图形数量特别多，有必要做该优化时才会自动开启。</p>
     */
    private Integer hoverLayerThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#useUTC">https://echarts.apache.org/zh/option.html#useUTC</a>
     * <br/>序号: 41
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否使用 UTC 时间。</p>
     * <ul>
     * <li><code class="codespan">true</code>: 表示 <code class="codespan">axis.type</code> 为 <code class="codespan">'time'</code> 时，依据 UTC 时间确定 tick 位置，并且 <code class="codespan">axisLabel</code> 和 <code class="codespan">tooltip</code> 默认展示的是 UTC 时间。</li>
     * <li><code class="codespan">false</code>: 表示 <code class="codespan">axis.type</code> 为 <code class="codespan">'time'</code> 时，依据本地时间确定 tick 位置，并且 <code class="codespan">axisLabel</code> 和 <code class="codespan">tooltip</code> 默认展示的是本地时间。</li>
     * </ul>
     * <p>默认取值为false，即使用本地时间。因为考虑到：</p>
     * <ul>
     * <li>很多情况下，需要展示为本地时间（无论服务器存储的是否为 <code class="codespan">UTC</code> 时间）。</li>
     * <li>如果 data 中的时间为 '2012-01-02' 这样的没有指定时区的时间表达式，往往意为本地时间。默认情况下，时间被展示时需要和输入一致而非有时差。</li>
     * </ul>
     * <p>注意，这个参数实际影响的是『展示』，而非用户输入的时间值的解析。
     * 关于用户输入的时间值（例如 <code class="codespan">1491339540396</code>, <code class="codespan">'2013-01-04'</code> 等）的解析，参见 <a href="#series-line.data">date 中时间相关部分</a>。</p>
     */
    private Boolean useUTC;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#options">https://echarts.apache.org/zh/option.html#options</a>
     * <br/>序号: 42
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>用于 <a href="option.html#timeline" target="_blank">timeline</a> 的 option 数组。数组的每一项是一个 echarts option (<code class="codespan">ECUnitOption</code>)。</p>
     */
    private Object options;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#media">https://echarts.apache.org/zh/option.html#media</a>
     * <br/>序号: 43
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>请参见 <a href="tutorial.html#%E7%A7%BB%E5%8A%A8%E7%AB%AF%E8%87%AA%E9%80%82%E5%BA%94" target="_blank">移动端自适应</a>。</p>
     */
    private List<Media> media;
}
