package com.xmjz.echarts.nativebean.option.series.barSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.barSeries.data.Blur;
import com.xmjz.echarts.nativebean.option.series.barSeries.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.barSeries.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.barSeries.data.Label;
import com.xmjz.echarts.nativebean.option.series.barSeries.data.LabelLine;
import com.xmjz.echarts.nativebean.option.series.barSeries.data.Select;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data">#series-bar.data</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.name">#series-bar.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据项名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.value">#series-bar.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>单个数据项的数值。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.groupId">#series-bar.data.groupId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该数据项的组 ID。组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画。</p>
     */
    private String groupId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.label">#series-bar.data.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据的文本配置。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.labelLine">#series-bar.data.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle">#series-bar.data.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据的图形样式设置。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.emphasis">#series-bar.data.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据的高亮状态配置。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.blur">#series-bar.data.blur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.select">#series-bar.data.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>单个数据的选中状态配置。</p>
     */
    private Select select;
}
