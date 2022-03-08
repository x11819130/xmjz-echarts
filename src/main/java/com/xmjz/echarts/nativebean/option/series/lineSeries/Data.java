package com.xmjz.echarts.nativebean.option.series.lineSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.lineSeries.data.Blur;
import com.xmjz.echarts.nativebean.option.series.lineSeries.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.lineSeries.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.lineSeries.data.Label;
import com.xmjz.echarts.nativebean.option.series.lineSeries.data.LabelLine;
import com.xmjz.echarts.nativebean.option.series.lineSeries.data.Select;
import com.xmjz.echarts.nativebean.option.series.lineSeries.data.Tooltip;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data">#series-line.data</a>
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
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Data extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.name">#series-line.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据项名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.value">#series-line.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>单个数据项的数值。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.groupId">#series-line.data.groupId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该数据项的组 ID。组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画。</p>
     */
    private String groupId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.symbol">#series-line.data.symbol</a>
     * <br/>默认值: 'circle'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>单个数据标记的图形。</p>
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
    private String symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.symbolSize">#series-line.data.symbolSize</a>
     * <br/>默认值: 4
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>单个数据标记的大小，可以设置成诸如 <code class="codespan">10</code> 这样单一的数字，也可以用数组分开表示宽和高，例如 <code class="codespan">[20, 10]</code> 表示标记宽为<code class="codespan">20</code>，高为<code class="codespan">10</code>。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.symbolRotate">#series-line.data.symbolRotate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>单个数据标记的旋转角度（而非弧度）。正值表示逆时针旋转。注意在 <code class="codespan">markLine</code> 中当 <code class="codespan">symbol</code> 为 <code class="codespan">'arrow'</code> 时会忽略 <code class="codespan">symbolRotate</code> 强制设置为切线的角度。</p>
     */
    private Integer symbolRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.symbolKeepAspect">#series-line.data.symbolKeepAspect</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>如果 <code class="codespan">symbol</code> 是 <code class="codespan">path://</code> 的形式，是否在缩放时保持该图形的长宽比。</p>
     */
    private Boolean symbolKeepAspect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.symbolOffset">#series-line.data.symbolOffset</a>
     * <br/>默认值: [0, 0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>单个数据标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。</p>
     * <p>例如 <code class="codespan">[0, '-50%']</code> 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。</p>
     */
    private List<?> symbolOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.label">#series-line.data.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个拐点文本的样式设置。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.labelLine">#series-line.data.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.itemStyle">#series-line.data.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个拐点标志的样式设置。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.emphasis">#series-line.data.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个拐点的高亮样式和标签设置。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.blur">#series-line.data.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个拐点的淡出样式和标签设置。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.select">#series-line.data.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个拐点的选中样式和标签设置。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.data.tooltip">#series-line.data.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
