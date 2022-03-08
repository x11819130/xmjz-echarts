package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom">#dataZoom</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p><code class="codespan">dataZoom</code> 组件 用于区域缩放，从而能自由关注细节的数据信息，或者概览数据整体，或者去除离群点的影响。</p>
 * <p>现在支持这几种类型的 <code class="codespan">dataZoom</code> 组件：</p>
 * <ul>
 * <li><p><a href="https://echarts.apache.org/zh/option.html#dataZoom-inside">内置型数据区域缩放组件（dataZoomInside）</a>：内置于坐标系中，使用户可以在坐标系上通过鼠标拖拽、鼠标滚轮、手指滑动（触屏上）来缩放或漫游坐标系。</p>
 * </li>
 * <li><p><a href="https://echarts.apache.org/zh/option.html#dataZoom-slider">滑动条型数据区域缩放组件（dataZoomSlider）</a>：有单独的滑动条，用户在滑动条上进行缩放或漫游。</p>
 * </li>
 * <li><p><a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom">框选型数据区域缩放组件（dataZoomSelect）</a>：提供一个选框进行数据区域缩放。即 <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom">toolbox.feature.dataZoom</a>，配置项在 <code class="codespan">toolbox</code> 中。</p>
 * </li>
 * </ul>
 * <p>如下例子：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/scatter-dataZoom-all&amp;edit=1&amp;reset=1" width="600" height="400" class="loaded" src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/scatter-dataZoom-all&amp;edit=1&amp;reset=1" data-was-processed="true"></iframe>
 *
 *
 * <p><br></p>
 * <hr>
 * <p><strong>✦ dataZoom 和 数轴的关系 ✦</strong></p>
 * <p><code class="codespan">dataZoom</code> 主要是对 <code class="codespan">数轴（axis）</code> 进行操作（控制数轴的显示范围，或称窗口（window））。</p>
 * <blockquote>
 * <p>可以通过 <a href="https://echarts.apache.org/zh/option.html#dataZoom.xAxisIndex">dataZoom.xAxisIndex</a> 或 <a href="https://echarts.apache.org/zh/option.html#dataZoom.yAxisIndex">dataZoom.yAxisIndex</a> 或 <a href="https://echarts.apache.org/zh/option.html#dataZoom.radiusAxisIndex">dataZoom.radiusAxisIndex</a> 或 <a href="https://echarts.apache.org/zh/option.html#dataZoom.angleAxisIndex">dataZoom.angleAxisIndex</a> 来指定 <code class="codespan">dataZoom</code> 控制哪个或哪些数轴。</p>
 * </blockquote>
 * <p><code class="codespan">dataZoom</code> 组件可 <strong>同时存在多个</strong>，起到共同控制的作用。如果多个 <code class="codespan">dataZoom</code> 组件共同控制同一个数轴，他们会自动联动。</p>
 * <p><br></p>
 * <hr>
 * <p><strong>✦ dataZoom 组件如何影响轴和数据 ✦</strong></p>
 * <p><code class="codespan">dataZoom</code> 的运行原理是通过 <code class="codespan">数据过滤</code> 以及在内部设置轴的显示窗口来达到 <code class="codespan">数据窗口缩放</code> 的效果。</p>
 * <p>数据过滤模式（<a href="https://echarts.apache.org/zh/option.html#dataZoom.filterMode">dataZoom.filterMode</a>）的设置不同，效果也不同。</p>
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
 * <li><p>百分比形式：即设置 <a href="https://echarts.apache.org/zh/option.html#dataZoom.start">dataZoom.start</a> 和 <a href="https://echarts.apache.org/zh/option.html#dataZoom.end">dataZoom.end</a>。</p>
 * </li>
 * <li><p>绝对数值形式：即设置 <a href="https://echarts.apache.org/zh/option.html#dataZoom.startValue">dataZoom.startValue</a> 和 <a href="https://echarts.apache.org/zh/option.html#dataZoom.endValue">dataZoom.endValue</a>。</p>
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
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class DataZoom extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

}
