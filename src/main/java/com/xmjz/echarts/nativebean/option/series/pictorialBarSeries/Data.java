package com.xmjz.echarts.nativebean.option.series.pictorialBarSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.data.Blur;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.data.Label;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.data.LabelLine;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.data.Select;
import com.xmjz.echarts.nativebean.option.series.pictorialBarSeries.data.Tooltip;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data">#series-pictorialBar.data</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.name">#series-pictorialBar.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据项名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.value">#series-pictorialBar.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>单个数据项的数值。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.groupId">#series-pictorialBar.data.groupId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该数据项的组 ID。组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画。</p>
     */
    private String groupId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbol">#series-pictorialBar.data.symbol</a>
     * <br/>默认值: 'circle'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图形类型。</p>
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
     * </code></pre><p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-graphicType&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbol">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbol">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbol: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbol: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbol: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private String symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolSize">#series-pictorialBar.data.symbolSize</a>
     * <br/>默认值: ['100%', '100%']
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>图形的大小。</p>
     * <p>可以用数组分开表示宽和高，例如 <code class="codespan">[20, 10]</code> 表示标记宽为<code class="codespan">20</code>，高为<code class="codespan">10</code>，也可以设置成诸如 <code class="codespan">10</code> 这样单一的数字，表示 <code class="codespan">[10, 10]</code>。</p>
     * <p>可以设置成绝对值（如 <code class="codespan">10</code>），也可以设置成百分比（如 <code class="codespan">'120%'</code>、<code class="codespan">['55%', 23]</code>）。</p>
     * <p>当设置为百分比时，图形的大小是基于 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar">基准柱</a> 的尺寸计算出来的。</p>
     * <p>例如，当基准柱基于 x 轴（即柱子是纵向的），<a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolSize">symbolSize</a> 设置为 <code class="codespan">['30%', '50%']</code>，那么最终图形的尺寸是：</p>
     * <ul>
     * <li>宽度：<code class="codespan">基准柱的宽度 * 30%</code>。</li>
     * <li>高度：<ul>
     * <li>如果 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">symbolRepeat</a> 为 <code class="codespan">false</code>：<code class="codespan">基准柱的高度 * 50%</code>。</li>
     * <li>如果 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">symbolRepeat</a> 为 <code class="codespan">true</code>：<code class="codespan">基准柱的宽度 * 50%</code>。</li>
     * </ul>
     * </li>
     * </ul>
     * <p>基准柱基于 y 轴（即柱子是横向的）的情况类似对调可得出。</p>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-symbolSize&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolSize">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolSize">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolSize: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolSize: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolSize: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolPosition">#series-pictorialBar.data.symbolPosition</a>
     * <br/>默认值: 'start'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图形的定位位置。可取值：</p>
     * <ul>
     * <li><code class="codespan">'start'</code>：图形边缘与柱子开始的地方内切。</li>
     * <li><code class="codespan">'end'</code>：图形边缘与柱子结束的地方内切。</li>
     * <li><code class="codespan">'center'</code>：图形在柱子里居中。</li>
     * </ul>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-position&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolPosition">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolPosition">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolPosition: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolPosition: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolPosition: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private String symbolPosition;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolOffset">#series-pictorialBar.data.symbolOffset</a>
     * <br/>默认值: [0, 0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>图形相对于原本位置的偏移。<code class="codespan">symbolOffset</code> 是图形定位中最后计算的一个步骤，可以对图形计算出来的位置进行微调。</p>
     * <p>可以设置成绝对值（如 <code class="codespan">10</code>），也可以设置成百分比（如 <code class="codespan">'120%'</code>、<code class="codespan">['55%', 23]</code>）。</p>
     * <p>当设置为百分比时，表示相对于自身尺寸 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolSize">symbolSize</a> 的百分比。</p>
     * <p>例如 <code class="codespan">[0, '-50%']</code> 就是把图形向上移动了自身尺寸的一半的位置。</p>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-position&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolOffset">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolOffset">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolOffset: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolOffset: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolOffset: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private List<?> symbolOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolRotate">#series-pictorialBar.data.symbolRotate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形的旋转角度。</p>
     * <p>注意，<code class="codespan">symbolRotate</code> 并不会影响图形的定位（哪怕超出基准柱的边界），而只是单纯得绕自身中心旋转。</p>
     * <p>此属性可以被设置在系列的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRotate">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolRotate">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolRotate: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolRotate: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolRotate: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Integer symbolRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolRepeat">#series-pictorialBar.data.symbolRepeat</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","number","string"]
     * <br/>描述:
     * <p>指定图形元素是否重复。值可为：</p>
     * <ul>
     * <li><code class="codespan">false</code>/<code class="codespan">null</code>/<code class="codespan">undefined</code>：不重复，即每个数据值用一个图形元素表示。</li>
     * <li><code class="codespan">true</code>：使图形元素重复，即每个数据值用一组重复的图形元素表示。重复的次数依据 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data">data</a> 计算得到。</li>
     * <li>a number：使图形元素重复，即每个数据值用一组重复的图形元素表示。重复的次数是给定的定值。</li>
     * <li><code class="codespan">'fixed'</code>：使图形元素重复，即每个数据值用一组重复的图形元素表示。重复的次数依据 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolBoundingData">symbolBoundingData</a> 计算得到，即与 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data">data</a> 无关。这在此图形被用于做背景时有用。</li>
     * </ul>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeat&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolRepeat">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolRepeat: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolRepeat: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolRepeat: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Object symbolRepeat;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolRepeatDirection">#series-pictorialBar.data.symbolRepeatDirection</a>
     * <br/>默认值: 'start'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>指定图形元素重复时，绘制的顺序。这个属性在两种情况下有用处：</p>
     * <ul>
     * <li><p>当 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolMargin">symbolMargin</a> 设置为负值时，重复的图形会互相覆盖，这是可以使用 <code class="codespan">symbolRepeatDirection</code> 来指定覆盖顺序。</p>
     * </li>
     * <li><p>当 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.animationDelay">animationDelay</a> 或 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.animationDelayUpdate">animationDelayUpdate</a> 被使用时，<code class="codespan">symbolRepeatDirection</code> 指定了 index 顺序。</p>
     * </li>
     * </ul>
     * <p>这个属性的值可以是：<code class="codespan">'start'</code> 或 <code class="codespan">'end'</code>。</p>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeatDirection&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeatDirection">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolRepeatDirection">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolRepeatDirection: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolRepeatDirection: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolRepeatDirection: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private String symbolRepeatDirection;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolMargin">#series-pictorialBar.data.symbolMargin</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>图形的两边间隔（『两边』是指其数值轴方向的两边）。可以是绝对数值（如 <code class="codespan">20</code>），或者百分比值（如 <code class="codespan">'-30%'</code>），表示相对于自身尺寸 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolSize">symbolSize</a> 的百分比。只有当 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">symbolRepeat</a> 被使用时有意义。</p>
     * <p>可以是正值，表示间隔大；也可以是负数。当 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">symbolRepeat</a> 被使用时，负数时能使图形重叠。</p>
     * <p>可以在其值结尾处加一个 <code class="codespan">"!"</code>，如 <code class="codespan">"30%!"</code> 或 <code class="codespan">25!</code>，表示第一个图形的开始和最后一个图形结尾留白，不紧贴边界。默认会紧贴边界。</p>
     * <p>注意：</p>
     * <ul>
     * <li>当 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">symbolRepeat</a> 为 <code class="codespan">true</code>/<code class="codespan">'fixed'</code> 的时候：
     *   这里设置的 <code class="codespan">symbolMargin</code> 只是个参考值，真正最后的图形间隔，是根据 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">symbolRepeat</a>、<code class="codespan">symbolMargin</code>、<a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolBoundingData">symbolBoundingData</a> 综合计算得到。</li>
     * <li>当 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">symbolRepeat</a> 为一个固定数值的时候：
     *   这里设置的 <code class="codespan">symbolMargin</code> 无效。</li>
     * </ul>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeatLayout&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolMargin">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolMargin">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolMargin: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolMargin: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolMargin: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Object symbolMargin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolClip">#series-pictorialBar.data.symbolClip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否剪裁图形。</p>
     * <ul>
     * <li><code class="codespan">false</code>/null/undefined：图形本身表示数值大小。</li>
     * <li><code class="codespan">true</code>：图形被剪裁后剩余的部分表示数值大小。</li>
     * </ul>
     * <p><code class="codespan">symbolClip</code> 常在这种场景下使用：同时表达『总值』和『当前数值』。在这种场景下，可以使用两个系列，一个系列是完整的图形，当做『背景』来表达总数值，另一个系列是使用 <code class="codespan">symbolClip</code> 进行剪裁过的图形，表达当前数值。</p>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-clip&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     * <p>在这个例子中：</p>
     * <ul>
     * <li>『背景系列』和『当前值系列』使用相同的 <a href="https://echarts.apache.org/zh/option.html#series.pictorialBar.symbolBoundingData">symbolBoundingData</a>，使得绘制出的图形的大小是一样的。</li>
     * <li>『当前值系列』设置了比『背景系列』更高的 <a href="https://echarts.apache.org/zh/option.html#series.pictorialBar.z">z</a>，使得其覆盖在『背景系列』上。</li>
     * </ul>
     * <p>此属性可以被设置在系列的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolClip">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolClip">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolClip: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolClip: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolClip: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Boolean symbolClip;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolBoundingData">#series-pictorialBar.data.symbolBoundingData</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>这个属性是『指定图形界限的值』。它指定了一个 data，这个 data 映射在坐标系上的位置，是图形绘制的界限。也就是说，如果设置了 <code class="codespan">symbolBoundingData</code>，图形的尺寸则由 <code class="codespan">symbolBoundingData</code> 决定。</p>
     * <p>当柱子是水平的，symbolBoundingData 对应到 x 轴上，当柱子是竖直的，symbolBoundingData 对应到 y 轴上。</p>
     * <p>规则：</p>
     * <ul>
     * <li><p>没有使用 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">symbolRepeat</a> 时：</p>
     * <p>  <code class="codespan">symbolBoundingData</code> 缺省情况下和『参考柱』的尺寸一样。图形的尺寸由零点和 <code class="codespan">symbolBoundingData</code> 决定。举例，当柱子是竖直的，柱子对应的 data 为 <code class="codespan">24</code>，<code class="codespan">symbolSize</code> 设置为 <code class="codespan">[30, '50%']</code>，<code class="codespan">symbolBoundingData</code> 设置为 <code class="codespan">124</code>，那么最终图形的高度为 <code class="codespan">124 * 50% = 62</code>。如果 <code class="codespan">symbolBoundingData</code> 不设置，那么最终图形的高度为 <code class="codespan">24 * 50% = 12</code>。</p>
     * </li>
     * <li><p>使用了 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">symbolRepeat</a> 时：</p>
     * <p>  <code class="codespan">symbolBoundingData</code> 缺省情况取当前坐标系所显示出的最值。<code class="codespan">symbolBoundingData</code> 定义了一个 bounding，重复的图形在这个 bounding 中，依据 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolMargin">symbolMargin</a> 和 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">symbolRepeat</a> 和 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolSize">symbolSize</a> 进行排布。这几个变量决定了图形的间隔大小。</p>
     * </li>
     * </ul>
     * <p>在这些场景中，你可能会需要设置 <code class="codespan">symbolBoundingData</code>：</p>
     * <ul>
     * <li><p>使用了 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolClip">symbolCilp</a> 时：</p>
     * <p>  使用一个系列表达『总值』，另一个系列表达『当前值』的时候，需要两个系列画出的图形一样大。那么就把两个系列的 <code class="codespan">symbolBoundingData</code> 设为一样大。</p>
     * </li>
     * </ul>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-clip&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     * <ul>
     * <li><p>使用了 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">symbolRepeat</a> 时：</p>
     * <p>  如果需要不同柱子中的图形的间隔保持一致，那么可以把 <code class="codespan">symbolBoundingData</code> 设为一致的数值。当然，不设置 <code class="codespan">symbolBoundingData</code> 也是可以的，因为其缺省值就是一个定值（坐标系所显示出的最值）。</p>
     * </li>
     * </ul>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeatLayout&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     * <p><br>
     * <code class="codespan">symbolBoundingData</code> 可以是一个数组，例如 <code class="codespan">[-40, 60]</code>，表示同时指定了正值的 <code class="codespan">symbolBoundingData</code> 和负值的 <code class="codespan">symbolBoundingData</code>。</p>
     * <p>参见例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-symbolBoundingDataArray&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolBoundingData">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolBoundingData">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolBoundingData: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolBoundingData: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolBoundingData: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Object symbolBoundingData;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolPatternSize">#series-pictorialBar.data.symbolPatternSize</a>
     * <br/>默认值: 400
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>可以使用图片作为图形的 pattern。</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-keyword">var</span> textureImg = <span class="hljs-keyword">new</span> Image();
     * textureImg.src = <span class="hljs-string">'data:image/jpeg;base64,...'</span>; <span class="hljs-comment">// dataURI</span>
     * <span class="hljs-comment">// 或者</span>
     * <span class="hljs-comment">// textureImg.src = 'http://xxx.xxx.xxx/xx.png'; // URL</span>
     * ...
     * itemStyle: {
     *     color: {
     *         image: textureImg,
     *         repeat: <span class="hljs-string">'repeat'</span>
     *     }
     * }
     * </code></pre>
     * <p>这时候，<code class="codespan">symbolPatternSize</code> 指定了 pattern 的缩放尺寸。比如 <code class="codespan">symbolPatternSize</code> 为 400 时表示图片显示为 <code class="codespan">400px * 400px</code> 的尺寸。</p>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-patternSize&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolPatternSize">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.symbolPatternSize">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolPatternSize: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolPatternSize: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolPatternSize: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Integer symbolPatternSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.z">#series-pictorialBar.data.z</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指定图形元素间的覆盖关系。数值越大，越在层叠的上方。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.hoverAnimation">#series-pictorialBar.data.hoverAnimation</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启 hover 在图形上的提示动画效果。</p>
     * <p>此属性可以被设置在系列的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.hoverAnimation">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     hoverAnimation: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         hoverAnimation: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         hoverAnimation: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Boolean hoverAnimation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.animation">#series-pictorialBar.data.animation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.animationThreshold">#series-pictorialBar.data.animationThreshold</a>
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.animationDuration">#series-pictorialBar.data.animationDuration</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.animationEasing">#series-pictorialBar.data.animationEasing</a>
     * <br/>默认值: 'cubicOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.animationDurationUpdate">#series-pictorialBar.data.animationDurationUpdate</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.animationEasingUpdate">#series-pictorialBar.data.animationEasingUpdate</a>
     * <br/>默认值: 'cubicInOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.animationDelay">#series-pictorialBar.data.animationDelay</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>动画开始之前的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-ts hljs typescript">animationDelay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">dataIndex, params</span>) </span>{
     *     <span class="hljs-keyword">return</span> params.index * <span class="hljs-number">30</span>;
     * }
     * 或者反向：
     * animationDelay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">dataIndex, params</span>) </span>{
     *     <span class="hljs-keyword">return</span> (params.count - <span class="hljs-number">1</span> - params.index) * <span class="hljs-number">30</span>;
     * }
     * </code></pre>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeatDirection&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     */
    private Object animationDelay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.animationDelayUpdate">#series-pictorialBar.data.animationDelayUpdate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-ts hljs typescript">animationDelay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">dataIndex, params</span>) </span>{
     *     <span class="hljs-keyword">return</span> params.index * <span class="hljs-number">30</span>;
     * }
     * 或者反向：
     * animationDelay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">dataIndex, params</span>) </span>{
     *     <span class="hljs-keyword">return</span> (params.count - <span class="hljs-number">1</span> - params.index) * <span class="hljs-number">30</span>;
     * }
     * </code></pre>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeatDirection&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     */
    private Object animationDelayUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.label">#series-pictorialBar.data.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个柱条文本的样式设置。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.labelLine">#series-pictorialBar.data.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.itemStyle">#series-pictorialBar.data.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.emphasis">#series-pictorialBar.data.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据的高亮状态配置。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.blur">#series-pictorialBar.data.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>单个数据的淡出状态配置。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.select">#series-pictorialBar.data.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>单个数据的选中状态配置。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data.tooltip">#series-pictorialBar.data.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
