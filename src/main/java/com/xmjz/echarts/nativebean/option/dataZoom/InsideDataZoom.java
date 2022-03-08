package com.xmjz.echarts.nativebean.option.dataZoom;

import com.xmjz.echarts.nativebean.option.DataZoom;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside">#dataZoom-inside</a>
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>内置型数据区域缩放组件（dataZoomInside）</strong></p>
 * <p>（参考<a href="https://echarts.apache.org/zh/option.html#dataZoom">数据区域缩放组件（dataZoom）的介绍</a>）</p>
 * <p>所谓『内置』，即内置在坐标系中。</p>
 * <ul>
 * <li>平移：在坐标系中滑动拖拽进行数据区域平移。</li>
 * <li>缩放：<ul>
 * <li>PC端：鼠标在坐标系范围内滚轮滚动（MAC触控板类同）</li>
 * <li>移动端：在移动端触屏上，支持两指滑动缩放。</li>
 * </ul>
 * </li>
 * </ul>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class InsideDataZoom extends DataZoom implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.type">#dataZoom-inside.type</a>
     * <br/>默认值: 'inside'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.id">#dataZoom-inside.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.disabled">#dataZoom-inside.disabled</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否停止组件的功能。</p>
     */
    private Boolean disabled;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.xAxisIndex">#dataZoom-inside.xAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>设置 <code class="codespan">dataZoom-inside</code> 组件控制的 <code class="codespan">x轴</code>（即<a href="https://echarts.apache.org/zh/option.html#xAxis">xAxis</a>，是直角坐标系中的概念，参见 <a href="https://echarts.apache.org/zh/option.html#grid">grid</a>）。</p>
     * <p>不指定时，当 <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.orient">dataZoom-inside.orient</a> 为 <code class="codespan">'horizontal'</code>时，默认控制和 dataZoom 平行的第一个 <code class="codespan">xAxis</code>。但是不建议使用默认值，建议显式指定。</p>
     * <p>如果是 <code class="codespan">number</code> 表示控制一个轴，如果是 <code class="codespan">Array</code> 表示控制多个轴。</p>
     * <p>例如有如下 ECharts option：</p>
     * <pre><code class="lang-javascript hljs">option: {
     *     <span class="hljs-attr">xAxis</span>: [
     *         {...}, <span class="hljs-comment">// 第一个 xAxis</span>
     *         {...}, <span class="hljs-comment">// 第二个 xAxis</span>
     *         {...}, <span class="hljs-comment">// 第三个 xAxis</span>
     *         {...}  <span class="hljs-comment">// 第四个 xAxis</span>
     *     ],
     *     <span class="hljs-attr">dataZoom</span>: [
     *         { <span class="hljs-comment">// 第一个 dataZoom 组件</span>
     *             <span class="hljs-attr">xAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">2</span>] <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第一个 和 第三个 xAxis</span>
     *         },
     *         { <span class="hljs-comment">// 第二个 dataZoom 组件</span>
     *             <span class="hljs-attr">xAxisIndex</span>: <span class="hljs-number">3</span>      <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第四个 xAxis</span>
     *         }
     *     ]
     * }
     * </code></pre>
     */
    private Object xAxisIndex;

    public Object getxAxisIndex() {
        return this.xAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.yAxisIndex">#dataZoom-inside.yAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>设置 <code class="codespan">dataZoom-inside</code> 组件控制的 <code class="codespan">y轴</code>（即<a href="https://echarts.apache.org/zh/option.html#yAxis">yAxis</a>，是直角坐标系中的概念，参见 <a href="https://echarts.apache.org/zh/option.html#grid">grid</a>）。</p>
     * <p>不指定时，当 <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.orient">dataZoom-inside.orient</a> 为 <code class="codespan">'vertical'</code>时，默认控制和 dataZoom 平行的第一个 <code class="codespan">yAxis</code>。但是不建议使用默认值，建议显式指定。</p>
     * <p>如果是 <code class="codespan">number</code> 表示控制一个轴，如果是 <code class="codespan">Array</code> 表示控制多个轴。</p>
     * <p>例如有如下 ECharts option：</p>
     * <pre><code class="lang-javascript hljs">option: {
     *     <span class="hljs-attr">yAxis</span>: [
     *         {...}, <span class="hljs-comment">// 第一个 yAxis</span>
     *         {...}, <span class="hljs-comment">// 第二个 yAxis</span>
     *         {...}, <span class="hljs-comment">// 第三个 yAxis</span>
     *         {...}  <span class="hljs-comment">// 第四个 yAxis</span>
     *     ],
     *     <span class="hljs-attr">dataZoom</span>: [
     *         { <span class="hljs-comment">// 第一个 dataZoom 组件</span>
     *             <span class="hljs-attr">yAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">2</span>] <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第一个 和 第三个 yAxis</span>
     *         },
     *         { <span class="hljs-comment">// 第二个 dataZoom 组件</span>
     *             <span class="hljs-attr">yAxisIndex</span>: <span class="hljs-number">3</span>      <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第四个 yAxis</span>
     *         }
     *     ]
     * }
     * </code></pre>
     */
    private Object yAxisIndex;

    public Object getyAxisIndex() {
        return this.yAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.radiusAxisIndex">#dataZoom-inside.radiusAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>设置 <code class="codespan">dataZoom-inside</code> 组件控制的 <code class="codespan">radius 轴</code>（即<a href="https://echarts.apache.org/zh/option.html#radiusAxis">radiusAxis</a>，是直角坐标系中的概念，参见 <a href="https://echarts.apache.org/zh/option.html#polar">polar</a>）。</p>
     * <p>如果是 <code class="codespan">number</code> 表示控制一个轴，如果是 <code class="codespan">Array</code> 表示控制多个轴。</p>
     * <p>例如有如下 ECharts option：</p>
     * <pre><code class="lang-javascript hljs">option: {
     *     <span class="hljs-attr">radiusAxis</span>: [
     *         {...}, <span class="hljs-comment">// 第一个 radiusAxis</span>
     *         {...}, <span class="hljs-comment">// 第二个 radiusAxis</span>
     *         {...}, <span class="hljs-comment">// 第三个 radiusAxis</span>
     *         {...}  <span class="hljs-comment">// 第四个 radiusAxis</span>
     *     ],
     *     <span class="hljs-attr">dataZoom</span>: [
     *         { <span class="hljs-comment">// 第一个 dataZoom 组件</span>
     *             <span class="hljs-attr">radiusAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">2</span>] <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第一个 和 第三个 radiusAxis</span>
     *         },
     *         { <span class="hljs-comment">// 第二个 dataZoom 组件</span>
     *             <span class="hljs-attr">radiusAxisIndex</span>: <span class="hljs-number">3</span>      <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第四个 radiusAxis</span>
     *         }
     *     ]
     * }
     * </code></pre>
     */
    private Object radiusAxisIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.angleAxisIndex">#dataZoom-inside.angleAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>设置 <code class="codespan">dataZoom-inside</code> 组件控制的 <code class="codespan">angle 轴</code>（即<a href="https://echarts.apache.org/zh/option.html#angleAxis">angleAxis</a>，是直角坐标系中的概念，参见 <a href="https://echarts.apache.org/zh/option.html#polar">polar</a>）。</p>
     * <p>如果是 <code class="codespan">number</code> 表示控制一个轴，如果是 <code class="codespan">Array</code> 表示控制多个轴。</p>
     * <p>例如有如下 ECharts option：</p>
     * <pre><code class="lang-javascript hljs">option: {
     *     <span class="hljs-attr">angleAxis</span>: [
     *         {...}, <span class="hljs-comment">// 第一个 angleAxis</span>
     *         {...}, <span class="hljs-comment">// 第二个 angleAxis</span>
     *         {...}, <span class="hljs-comment">// 第三个 angleAxis</span>
     *         {...}  <span class="hljs-comment">// 第四个 angleAxis</span>
     *     ],
     *     <span class="hljs-attr">dataZoom</span>: [
     *         { <span class="hljs-comment">// 第一个 dataZoom 组件</span>
     *             <span class="hljs-attr">angleAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">2</span>] <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第一个 和 第三个 angleAxis</span>
     *         },
     *         { <span class="hljs-comment">// 第二个 dataZoom 组件</span>
     *             <span class="hljs-attr">angleAxisIndex</span>: <span class="hljs-number">3</span>      <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第四个 angleAxis</span>
     *         }
     *     ]
     * }
     * </code></pre>
     */
    private Object angleAxisIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.filterMode">#dataZoom-inside.filterMode</a>
     * <br/>默认值: 'filter'
     * <br/>js类型: ["string"]
     * <br/>描述:
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
     */
    private String filterMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.start">#dataZoom-inside.start</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>数据窗口范围的起始百分比。范围是：0 ~ 100。表示 0% ~ 100%。</p>
     * <p><a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.start">dataZoom-inside.start</a> 和 <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.end">dataZoom-inside.end</a> 共同用 <strong>百分比</strong> 的形式定义了数据窗口范围。</p>
     * <p>关于坐标轴范围（axis extent）和 <code class="codespan">dataZoom-inside.start</code> 的关系的更多信息，请参见：<a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.rangeMode">dataZoom-inside.rangeMode</a>。</p>
     */
    private Integer start;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.end">#dataZoom-inside.end</a>
     * <br/>默认值: 100
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>数据窗口范围的结束百分比。范围是：0 ~ 100。</p>
     * <p><a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.start">dataZoom-inside.start</a> 和 <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.end">dataZoom-inside.end</a> 共同用 <strong>百分比</strong> 的形式定义了数据窗口范围。</p>
     * <p>关于坐标轴范围（axis extent）和 <code class="codespan">dataZoom-inside.end</code> 的关系的更多信息，请参见：<a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.rangeMode">dataZoom-inside.rangeMode</a>。</p>
     */
    private Integer end;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.startValue">#dataZoom-inside.startValue</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Date"]
     * <br/>描述:
     * <p>数据窗口范围的起始数值。如果设置了 <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.start">dataZoom-inside.start</a> 则 <code class="codespan">startValue</code> 失效。</p>
     * <p><a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.startValue">dataZoom-inside.startValue</a> 和 <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.endValue">dataZoom-inside.endValue</a> 共同用 <strong>绝对数值</strong> 的形式定义了数据窗口范围。</p>
     * <p>注意，如果轴的类型为 <code class="codespan">category</code>，则 <code class="codespan">startValue</code> 既可以设置为 <code class="codespan">axis.data</code> 数组的 <code class="codespan">index</code>，也可以设置为数组值本身。
     * 但是如果设置为数组值本身，会在内部自动转化为数组的 index。</p>
     * <p>关于坐标轴范围（axis extent）和 <code class="codespan">dataZoom-inside.startValue</code> 的关系的更多信息，请参见：<a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.rangeMode">dataZoom-inside.rangeMode</a>。</p>
     */
    private Object startValue;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.endValue">#dataZoom-inside.endValue</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Date"]
     * <br/>描述:
     * <p>数据窗口范围的结束数值。如果设置了 <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.end">dataZoom-inside.end</a> 则 <code class="codespan">endValue</code> 失效。</p>
     * <p><a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.startValue">dataZoom-inside.startValue</a> 和 <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.endValue">dataZoom-inside.endValue</a> 共同用 <strong>绝对数值</strong> 的形式定义了数据窗口范围。</p>
     * <p>注意，如果轴的类型为 <code class="codespan">category</code>，则 <code class="codespan">endValue</code> 即可以设置为 <code class="codespan">axis.data</code> 数组的 <code class="codespan">index</code>，也可以设置为数组值本身。
     * 但是如果设置为数组值本身，会在内部自动转化为数组的 index。</p>
     * <p>关于坐标轴范围（axis extent）和 <code class="codespan">dataZoom-inside.endValue</code> 的关系的更多信息，请参见：<a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.rangeMode">dataZoom-inside.rangeMode</a>。</p>
     */
    private Object endValue;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.minSpan">#dataZoom-inside.minSpan</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>用于限制窗口大小的最小值（百分比值），取值范围是 <code class="codespan">0</code> ~ <code class="codespan">100</code>。</p>
     * <p>如果设置了 <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.minValueSpan">dataZoom-inside.minValueSpan</a> 则 <code class="codespan">minSpan</code> 失效。</p>
     */
    private Integer minSpan;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.maxSpan">#dataZoom-inside.maxSpan</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>用于限制窗口大小的最大值（百分比值），取值范围是 <code class="codespan">0</code> ~ <code class="codespan">100</code>。</p>
     * <p>如果设置了 <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.maxValueSpan">dataZoom-inside.maxValueSpan</a> 则 <code class="codespan">maxSpan</code> 失效。</p>
     */
    private Integer maxSpan;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.minValueSpan">#dataZoom-inside.minValueSpan</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Date"]
     * <br/>描述:
     * <p>用于限制窗口大小的最小值（实际数值）。</p>
     * <p>如在时间轴上可以设置为：<code class="codespan">3600 * 24 * 1000 * 5</code> 表示 5 天。
     * 在类目轴上可以设置为 <code class="codespan">5</code> 表示 5 个类目。</p>
     */
    private Object minValueSpan;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.maxValueSpan">#dataZoom-inside.maxValueSpan</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Date"]
     * <br/>描述:
     * <p>用于限制窗口大小的最大值（实际数值）。</p>
     * <p>如在时间轴上可以设置为：<code class="codespan">3600 * 24 * 1000 * 5</code> 表示 5 天。
     * 在类目轴上可以设置为 <code class="codespan">5</code> 表示 5 个类目。</p>
     */
    private Object maxValueSpan;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.orient">#dataZoom-inside.orient</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>布局方式是横还是竖。不仅是布局方式，对于直角坐标系而言，也决定了，缺省情况控制横向数轴还是纵向数轴。</p>
     * <p>可选值为：</p>
     * <ul>
     * <li><p><code class="codespan">'horizontal'</code>：水平。</p>
     * </li>
     * <li><p><code class="codespan">'vertical'</code>：竖直。</p>
     * </li>
     * </ul>
     */
    private String orient;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.zoomLock">#dataZoom-inside.zoomLock</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否锁定选择区域（或叫做数据窗口）的大小。</p>
     * <p>如果设置为 <code class="codespan">true</code> 则锁定选择区域的大小，也就是说，只能平移，不能缩放。</p>
     */
    private Boolean zoomLock;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.throttle">#dataZoom-inside.throttle</a>
     * <br/>默认值: 100
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>设置触发视图刷新的频率。单位为毫秒（ms）。</p>
     * <p>如果 <a href="https://echarts.apache.org/zh/option.html#animation">animation</a> 设为 <code class="codespan">true</code> 且 <a href="https://echarts.apache.org/zh/option.html#animationDurationUpdate">animationDurationUpdate</a> 大于 <code class="codespan">0</code>，可以保持 <code class="codespan">throttle</code> 为默认值 <code class="codespan">100</code>（或者设置为大于 <code class="codespan">0</code> 的值），否则拖拽时有可能画面感觉卡顿。</p>
     * <p>如果 <a href="https://echarts.apache.org/zh/option.html#animation">animation</a> 设为 <code class="codespan">false</code> 或者 <a href="https://echarts.apache.org/zh/option.html#animationDurationUpdate">animationDurationUpdate</a> 设为 <code class="codespan">0</code>，且在数据量不大时，拖拽时画面感觉卡顿，可以把尝试把 <code class="codespan">throttle</code> 设为 <code class="codespan">0</code> 来改善。</p>
     */
    private Integer throttle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.rangeMode">#dataZoom-inside.rangeMode</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>形式为：<code class="codespan">[rangeModeForStart, rangeModeForEnd]</code>。</p>
     * <p>例如 <code class="codespan">rangeMode: ['value', 'percent']</code>，表示 start 值取绝对数值，end 取百分比。</p>
     * <p>每项可选值为：<code class="codespan">'value'</code>, <code class="codespan">'percent'</code></p>
     * <ul>
     * <li><code class="codespan">'value'</code> 模式：处于此模式下，坐标轴范围（axis extent）总只会被<code class="codespan">dataZoom.startValue</code> and <code class="codespan">dataZoom.endValue</code> 决定，而不管数据是多少，以及不管，<code class="codespan">axis.min</code> 和 <code class="codespan">axis.max</code> 怎么设置。</li>
     * <li><code class="codespan">'percent'</code> 模式：处于此模式下，<code class="codespan">100</code> 代表 100% 的 <code class="codespan">[dMin, dMax]</code>。这里 <code class="codespan">dMin</code> 表示，如果 <code class="codespan">axis.min</code> 设置了就是 <code class="codespan">axis.min</code>，否则是 <code class="codespan">data.extent[0]</code>；<code class="codespan">dMax</code> 表示，如果 <code class="codespan">axis.max</code> 设置了就是 <code class="codespan">axis.max</code>，否则是 <code class="codespan">data.extent[1]</code>。<code class="codespan">[dMin, dMax]</code> 乘以 percent 的结果得到坐标轴范围（axis extent）。</li>
     * </ul>
     * <p>默认情况下，<code class="codespan">rangeMode</code> 总是被自动设定。如果指定了 <code class="codespan">option.start</code>/<code class="codespan">option.end</code> 那么就设定为 <code class="codespan">'percent'</code>，如果指定了 <code class="codespan">option.startValue</code>/<code class="codespan">option.endValue</code> 那么就设定为 <code class="codespan">'value'</code>。以及当用户用不用操作触发视图改变时，<code class="codespan">rangeMode</code> 也可能会相应得变化（如，通过 <code class="codespan">toolbox.dataZoom</code> 触发视图改变时，<code class="codespan">rangeMode</code> 会自动被设置为 <code class="codespan">value</code>，通过 <code class="codespan">dataZoom-inside</code> 和 <code class="codespan">dataZoom-slider</code> 触发视图改变时，会自动被设置为 <code class="codespan">'percent'</code>）。</p>
     * <p>如果我们手动在 <code class="codespan">option</code> 中设定了 <code class="codespan">rangeMode</code>，那么它只在 <code class="codespan">start</code> 和 <code class="codespan">startValue</code> 都设置了或者 <code class="codespan">end</code> 和 <code class="codespan">endValue</code> 都设置了才有意义。所以通常我们没必要在 <code class="codespan">option</code> 中指定 <code class="codespan">rangeMode</code>。</p>
     * <p>举例一个使用场景：当我们使用动态数据时（即，周期性得通过 <code class="codespan">setOption</code> 来改变数据），如果 <code class="codespan">rangeMode</code> 在 <code class="codespan">'value</code>' 模式，<code class="codespan">dataZoom</code> 的窗口会一直保持在一个固定的值区间，无论数据怎么改变添加了多少；如果 <code class="codespan">rangeMode</code> 在 <code class="codespan">'percent'</code> 模式，窗口会随着数据的添加而改变（假设 <code class="codespan">axis.min</code> 和 <code class="codespan">axis.max</code> 没有被设置）。</p>
     */
    private List<?> rangeMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.zoomOnMouseWheel">#dataZoom-inside.zoomOnMouseWheel</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>如何触发缩放。可选值为：</p>
     * <ul>
     * <li><code class="codespan">true</code>：表示不按任何功能键，鼠标滚轮能触发缩放。</li>
     * <li><code class="codespan">false</code>：表示鼠标滚轮不能触发缩放。</li>
     * <li><code class="codespan">'shift'</code>：表示按住 <code class="codespan">shift</code> 和鼠标滚轮能触发缩放。</li>
     * <li><code class="codespan">'ctrl'</code>：表示按住 <code class="codespan">ctrl</code> 和鼠标滚轮能触发缩放。</li>
     * <li><code class="codespan">'alt'</code>：表示按住 <code class="codespan">alt</code> 和鼠标滚轮能触发缩放。</li>
     * </ul>
     */
    private Object zoomOnMouseWheel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.moveOnMouseMove">#dataZoom-inside.moveOnMouseMove</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>如何触发数据窗口平移。可选值为：</p>
     * <ul>
     * <li><code class="codespan">true</code>：表示不按任何功能键，鼠标移动能触发数据窗口平移。</li>
     * <li><code class="codespan">false</code>：表示鼠标移动不能触发平移。</li>
     * <li><code class="codespan">'shift'</code>：表示按住 <code class="codespan">shift</code> 和鼠标移动能触发数据窗口平移。</li>
     * <li><code class="codespan">'ctrl'</code>：表示按住 <code class="codespan">ctrl</code> 和鼠标移动能触发数据窗口平移。</li>
     * <li><code class="codespan">'alt'</code>：表示按住 <code class="codespan">alt</code> 和鼠标移动能触发数据窗口平移。</li>
     * </ul>
     */
    private Object moveOnMouseMove;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.moveOnMouseWheel">#dataZoom-inside.moveOnMouseWheel</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>如何触发数据窗口平移。可选值为：</p>
     * <ul>
     * <li><code class="codespan">true</code>：表示不按任何功能键，鼠标滚轮能触发数据窗口平移。</li>
     * <li><code class="codespan">false</code>：表示鼠标滚轮不能触发平移。</li>
     * <li><code class="codespan">'shift'</code>：表示按住 <code class="codespan">shift</code> 和鼠标滚轮能触发数据窗口平移。</li>
     * <li><code class="codespan">'ctrl'</code>：表示按住 <code class="codespan">ctrl</code> 和鼠标滚轮能触发数据窗口平移。</li>
     * <li><code class="codespan">'alt'</code>：表示按住 <code class="codespan">alt</code> 和鼠标滚轮能触发数据窗口平移。</li>
     * </ul>
     */
    private Object moveOnMouseWheel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-inside.preventDefaultMouseMove">#dataZoom-inside.preventDefaultMouseMove</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否阻止 mousemove 事件的默认行为。</p>
     */
    private Boolean preventDefaultMouseMove;
}
