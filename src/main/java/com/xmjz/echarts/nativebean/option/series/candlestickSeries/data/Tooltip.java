package com.xmjz.echarts.nativebean.option.series.candlestickSeries.data;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.candlestickSeries.data.tooltip.TextStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.tooltip">#series-candlestick.data.tooltip</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>本系列每个数据项中特定的 tooltip 设定。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Tooltip extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.tooltip.position">#series-candlestick.data.tooltip.position</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","Array","Function"]
     * <br/>描述:
     * <blockquote>
     * <p><strong>注意：</strong><code class="codespan">series.data.tooltip</code> 仅在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">tooltip.trigger</a> 为 <code class="codespan">'item'</code> 时有效。<br></p>
     * </blockquote>
     * <p>提示框浮层的位置，默认不设置时位置会跟随鼠标的位置。</p>
     * <p>可选：</p>
     * <ul>
     * <li><p><code class="codespan">Array</code></p>
     * <p>  通过数组表示提示框浮层的位置，支持数字设置绝对位置，百分比设置相对位置。</p>
     * <p>  示例:</p>
     * <pre><code class="lang-ts hljs typescript">  <span class="hljs-comment">// 绝对位置，相对于容器左侧 10px, 上侧 10 px</span>
     *   position: [<span class="hljs-number">10</span>, <span class="hljs-number">10</span>]
     *   <span class="hljs-comment">// 相对位置，放置在容器正中间</span>
     *   position: [<span class="hljs-string">'50%'</span>, <span class="hljs-string">'50%'</span>]
     * </code></pre>
     * </li>
     * <li><p><code class="codespan">Function</code></p>
     * <p>  回调函数，格式如下：</p>
     * <pre><code class="lang-ts hljs typescript">  (point: <span class="hljs-built_in">Array</span>, params: <span class="hljs-built_in">Object</span>|<span class="hljs-built_in">Array</span>.&lt;<span class="hljs-built_in">Object</span>&gt;, dom: HTMLDomElement, rect: <span class="hljs-built_in">Object</span>, size: <span class="hljs-built_in">Object</span>) =&gt; <span class="hljs-built_in">Array</span>
     * </code></pre>
     * <p>  <strong>参数：</strong><br>
     *   point: 鼠标位置，如 [20, 40]。<br>
     *   params: 同 formatter 的参数相同。<br>
     *   dom: tooltip 的 dom 对象。<br>
     *   rect: 只有鼠标在图形上时有效，是一个用<code class="codespan">x</code>, <code class="codespan">y</code>, <code class="codespan">width</code>, <code class="codespan">height</code>四个属性表达的图形包围盒。<br>
     *   size: 包括 dom 的尺寸和 echarts 容器的当前尺寸，例如：<code class="codespan">{contentSize: [width, height], viewSize: [width, height]}</code>。<br></p>
     * <p>  <strong>返回值：</strong><br>
     *   可以是一个表示 tooltip 位置的数组，数组值可以是绝对的像素值，也可以是相  百分比。<br>
     *   也可以是一个对象，如：<code class="codespan">{left: 10, top: 30}</code>，或者 <code class="codespan">{right: '20%', bottom: 40}</code>。<br></p>
     * <p>  如下示例：</p>
     * <pre><code class="lang-ts hljs typescript">  position: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">point, params, dom, rect, size</span>) </span>{
     *       <span class="hljs-comment">// 固定在顶部</span>
     *       <span class="hljs-keyword">return</span> [point[<span class="hljs-number">0</span>], <span class="hljs-string">'10%'</span>];
     *   }
     * </code></pre>
     * <p>  或者：</p>
     * <pre><code class="lang-ts hljs typescript">  position: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">pos, params, dom, rect, size</span>) </span>{
     *       <span class="hljs-comment">// 鼠标在左侧时 tooltip 显示到右侧，鼠标在右侧时 tooltip 显示到左侧。</span>
     *       <span class="hljs-keyword">var</span> obj = {top: <span class="hljs-number">60</span>};
     *       obj[[<span class="hljs-string">'left'</span>, <span class="hljs-string">'right'</span>][+(pos[<span class="hljs-number">0</span>] &lt; size.viewSize[<span class="hljs-number">0</span>] / <span class="hljs-number">2</span>)]] = <span class="hljs-number">5</span>;
     *       <span class="hljs-keyword">return</span> obj;
     *   }
     * </code></pre>
     * </li>
     * </ul>
     * <ul>
     * <li><p><code class="codespan">'inside'</code></p>
     * <p>  鼠标所在图形的内部中心位置，只在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">trigger</a> 为<code class="codespan">'item'</code>的时候有效。</p>
     * </li>
     * <li><p><code class="codespan">'top'</code></p>
     * <p>  鼠标所在图形上侧，只在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">trigger</a> 为<code class="codespan">'item'</code>的时候有效。</p>
     * </li>
     * <li><p><code class="codespan">'left'</code></p>
     * <p>  鼠标所在图形左侧，只在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">trigger</a> 为<code class="codespan">'item'</code>的时候有效。</p>
     * </li>
     * <li><p><code class="codespan">'right'</code></p>
     * <p>  鼠标所在图形右侧，只在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">trigger</a> 为<code class="codespan">'item'</code>的时候有效。</p>
     * </li>
     * <li><p><code class="codespan">'bottom'</code></p>
     * <p>  鼠标所在图形底侧，只在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">trigger</a> 为<code class="codespan">'item'</code>的时候有效。</p>
     * </li>
     * </ul>
     */
    private Object position;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.tooltip.formatter">#series-candlestick.data.tooltip.formatter</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <blockquote>
     * <p><strong>注意：</strong><code class="codespan">series.data.tooltip</code> 仅在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">tooltip.trigger</a> 为 <code class="codespan">'item'</code> 时有效。<br></p>
     * </blockquote>
     * <p>提示框浮层内容格式器，支持字符串模板和回调函数两种形式。</p>
     * <p><strong>1. 字符串模板</strong></p>
     * <p>模板变量有 <code class="codespan">{a}</code>, <code class="codespan">{b}</code>，<code class="codespan">{c}</code>，<code class="codespan">{d}</code>，<code class="codespan">{e}</code>，分别表示系列名，数据名，数据值等。
     * 在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">trigger</a> 为 <code class="codespan">'axis'</code> 的时候，会有多个系列的数据，此时可以通过 <code class="codespan">{a0}</code>, <code class="codespan">{a1}</code>, <code class="codespan">{a2}</code> 这种后面加索引的方式表示系列的索引。
     * 不同图表类型下的 <code class="codespan">{a}</code>，<code class="codespan">{b}</code>，<code class="codespan">{c}</code>，<code class="codespan">{d}</code> 含义不一样。
     * 其中变量<code class="codespan">{a}</code>, <code class="codespan">{b}</code>, <code class="codespan">{c}</code>, <code class="codespan">{d}</code>在不同图表类型下代表数据含义为：</p>
     * <ul>
     * <li><p>折线（区域）图、柱状（条形）图、K线图 : <code class="codespan">{a}</code>（系列名称），<code class="codespan">{b}</code>（类目值），<code class="codespan">{c}</code>（数值）, <code class="codespan">{d}</code>（无）</p>
     * </li>
     * <li><p>散点图（气泡）图 : <code class="codespan">{a}</code>（系列名称），<code class="codespan">{b}</code>（数据名称），<code class="codespan">{c}</code>（数值数组）, <code class="codespan">{d}</code>（无）</p>
     * </li>
     * <li><p>地图 : <code class="codespan">{a}</code>（系列名称），<code class="codespan">{b}</code>（区域名称），<code class="codespan">{c}</code>（合并数值）, <code class="codespan">{d}</code>（无）</p>
     * </li>
     * <li><p>饼图、仪表盘、漏斗图: <code class="codespan">{a}</code>（系列名称），<code class="codespan">{b}</code>（数据项名称），<code class="codespan">{c}</code>（数值）, <code class="codespan">{d}</code>（百分比）</p>
     * </li>
     * </ul>
     * <p>更多其它图表模板变量的含义可以见相应的图表的 label.formatter 配置项。</p>
     * <p><strong>示例：</strong></p>
     * <pre><code class="lang-ts hljs typescript">formatter: <span class="hljs-string">'{b0}: {c0}&lt;br /&gt;{b1}: {c1}'</span>
     * </code></pre>
     * <p><strong>2. 回调函数</strong></p>
     * <p>回调函数格式：</p>
     * <pre><code class="lang-ts hljs typescript">(params: <span class="hljs-built_in">Object</span>|<span class="hljs-built_in">Array</span>, ticket: <span class="hljs-built_in">string</span>, callback: <span class="hljs-function">(<span class="hljs-params">ticket: <span class="hljs-built_in">string</span>, html: <span class="hljs-built_in">string</span></span>)) =&gt;</span> <span class="hljs-built_in">string</span> | HTMLElement | HTMLElement[]
     * </code></pre>
     * <p>支持返回 HTML 字符串或者创建的 DOM 实例。</p>
     * <p>第一个参数 <code class="codespan">params</code> 是 formatter 需要的数据集。格式如下：</p>
     * <pre><code class="lang-ts hljs typescript">{
     *     componentType: <span class="hljs-string">'series'</span>,
     *     <span class="hljs-comment">// 系列类型</span>
     *     seriesType: <span class="hljs-built_in">string</span>,
     *     <span class="hljs-comment">// 系列在传入的 option.series 中的 index</span>
     *     seriesIndex: <span class="hljs-built_in">number</span>,
     *     <span class="hljs-comment">// 系列名称</span>
     *     seriesName: <span class="hljs-built_in">string</span>,
     *     <span class="hljs-comment">// 数据名，类目名</span>
     *     name: <span class="hljs-built_in">string</span>,
     *     <span class="hljs-comment">// 数据在传入的 data 数组中的 index</span>
     *     dataIndex: <span class="hljs-built_in">number</span>,
     *     <span class="hljs-comment">// 传入的原始数据项</span>
     *     data: <span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 传入的数据值。在多数系列下它和 data 相同。在一些系列下是 data 中的分量（如 map、radar 中）</span>
     *     value: <span class="hljs-built_in">number</span>|<span class="hljs-built_in">Array</span>|<span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 坐标轴 encode 映射信息，</span>
     *     <span class="hljs-comment">// key 为坐标轴（如 'x' 'y' 'radius' 'angle' 等）</span>
     *     <span class="hljs-comment">// value 必然为数组，不会为 null/undefied，表示 dimension index 。</span>
     *     <span class="hljs-comment">// 其内容如：</span>
     *     <span class="hljs-comment">// {</span>
     *     <span class="hljs-comment">//     x: [2] // dimension index 为 2 的数据映射到 x 轴</span>
     *     <span class="hljs-comment">//     y: [0] // dimension index 为 0 的数据映射到 y 轴</span>
     *     <span class="hljs-comment">// }</span>
     *     encode: <span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 维度名列表</span>
     *     dimensionNames: <span class="hljs-built_in">Array</span>&lt;<span class="hljs-built_in">String</span>&gt;,
     *     <span class="hljs-comment">// 数据的维度 index，如 0 或 1 或 2 ...</span>
     *     <span class="hljs-comment">// 仅在雷达图中使用。</span>
     *     dimensionIndex: <span class="hljs-built_in">number</span>,
     *     <span class="hljs-comment">// 数据图形的颜色</span>
     *     color: <span class="hljs-built_in">string</span>,
     *     <span class="hljs-comment">// 饼图，漏斗图的百分比</span>
     *     percent: <span class="hljs-built_in">number</span>
     * }
     * </code></pre>
     * <p>注：encode 和 dimensionNames 的使用方式，例如：</p>
     * <p>如果数据为：</p>
     * <pre><code class="lang-ts hljs typescript">dataset: {
     *     source: [
     *         [<span class="hljs-string">'Matcha Latte'</span>, <span class="hljs-number">43.3</span>, <span class="hljs-number">85.8</span>, <span class="hljs-number">93.7</span>],
     *         [<span class="hljs-string">'Milk Tea'</span>, <span class="hljs-number">83.1</span>, <span class="hljs-number">73.4</span>, <span class="hljs-number">55.1</span>],
     *         [<span class="hljs-string">'Cheese Cocoa'</span>, <span class="hljs-number">86.4</span>, <span class="hljs-number">65.2</span>, <span class="hljs-number">82.5</span>],
     *         [<span class="hljs-string">'Walnut Brownie'</span>, <span class="hljs-number">72.4</span>, <span class="hljs-number">53.9</span>, <span class="hljs-number">39.1</span>]
     *     ]
     * }
     * </code></pre>
     * <p>则可这样得到 y 轴对应的 value：</p>
     * <pre><code class="lang-ts hljs typescript">params.value[params.encode.y[<span class="hljs-number">0</span>]]
     * </code></pre>
     * <p>如果数据为：</p>
     * <pre><code class="lang-ts hljs typescript">dataset: {
     *     dimensions: [<span class="hljs-string">'product'</span>, <span class="hljs-string">'2015'</span>, <span class="hljs-string">'2016'</span>, <span class="hljs-string">'2017'</span>],
     *     source: [
     *         {product: <span class="hljs-string">'Matcha Latte'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">43.3</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">85.8</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">93.7</span>},
     *         {product: <span class="hljs-string">'Milk Tea'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">83.1</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">73.4</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">55.1</span>},
     *         {product: <span class="hljs-string">'Cheese Cocoa'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">86.4</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">65.2</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">82.5</span>},
     *         {product: <span class="hljs-string">'Walnut Brownie'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">72.4</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">53.9</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">39.1</span>}
     *     ]
     * }
     * </code></pre>
     * <p>则可这样得到 y 轴对应的 value：</p>
     * <pre><code class="lang-ts hljs typescript">params.value[params.dimensionNames[params.encode.y[<span class="hljs-number">0</span>]]]
     * </code></pre>
     * <p>在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">trigger</a> 为 <code class="codespan">'axis'</code> 的时候，或者 tooltip 被 <a href="https://echarts.apache.org/zh/option.html#xAxis.axisPointer">axisPointer</a> 触发的时候，<code class="codespan">params</code> 是多个系列的数据数组。其中每项内容格式同上，并且，</p>
     * <pre><code class="lang-ts hljs typescript">{
     *     componentType: <span class="hljs-string">'series'</span>,
     *     <span class="hljs-comment">// 系列类型</span>
     *     seriesType: <span class="hljs-built_in">string</span>,
     *     <span class="hljs-comment">// 系列在传入的 option.series 中的 index</span>
     *     seriesIndex: <span class="hljs-built_in">number</span>,
     *     <span class="hljs-comment">// 系列名称</span>
     *     seriesName: <span class="hljs-built_in">string</span>,
     *     <span class="hljs-comment">// 数据名，类目名</span>
     *     name: <span class="hljs-built_in">string</span>,
     *     <span class="hljs-comment">// 数据在传入的 data 数组中的 index</span>
     *     dataIndex: <span class="hljs-built_in">number</span>,
     *     <span class="hljs-comment">// 传入的原始数据项</span>
     *     data: <span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 传入的数据值。在多数系列下它和 data 相同。在一些系列下是 data 中的分量（如 map、radar 中）</span>
     *     value: <span class="hljs-built_in">number</span>|<span class="hljs-built_in">Array</span>|<span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 坐标轴 encode 映射信息，</span>
     *     <span class="hljs-comment">// key 为坐标轴（如 'x' 'y' 'radius' 'angle' 等）</span>
     *     <span class="hljs-comment">// value 必然为数组，不会为 null/undefied，表示 dimension index 。</span>
     *     <span class="hljs-comment">// 其内容如：</span>
     *     <span class="hljs-comment">// {</span>
     *     <span class="hljs-comment">//     x: [2] // dimension index 为 2 的数据映射到 x 轴</span>
     *     <span class="hljs-comment">//     y: [0] // dimension index 为 0 的数据映射到 y 轴</span>
     *     <span class="hljs-comment">// }</span>
     *     encode: <span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 维度名列表</span>
     *     dimensionNames: <span class="hljs-built_in">Array</span>&lt;<span class="hljs-built_in">String</span>&gt;,
     *     <span class="hljs-comment">// 数据的维度 index，如 0 或 1 或 2 ...</span>
     *     <span class="hljs-comment">// 仅在雷达图中使用。</span>
     *     dimensionIndex: <span class="hljs-built_in">number</span>,
     *     <span class="hljs-comment">// 数据图形的颜色</span>
     *     color: <span class="hljs-built_in">string</span>
     * }
     * </code></pre>
     * <p>注：encode 和 dimensionNames 的使用方式，例如：</p>
     * <p>如果数据为：</p>
     * <pre><code class="lang-ts hljs typescript">dataset: {
     *     source: [
     *         [<span class="hljs-string">'Matcha Latte'</span>, <span class="hljs-number">43.3</span>, <span class="hljs-number">85.8</span>, <span class="hljs-number">93.7</span>],
     *         [<span class="hljs-string">'Milk Tea'</span>, <span class="hljs-number">83.1</span>, <span class="hljs-number">73.4</span>, <span class="hljs-number">55.1</span>],
     *         [<span class="hljs-string">'Cheese Cocoa'</span>, <span class="hljs-number">86.4</span>, <span class="hljs-number">65.2</span>, <span class="hljs-number">82.5</span>],
     *         [<span class="hljs-string">'Walnut Brownie'</span>, <span class="hljs-number">72.4</span>, <span class="hljs-number">53.9</span>, <span class="hljs-number">39.1</span>]
     *     ]
     * }
     * </code></pre>
     * <p>则可这样得到 y 轴对应的 value：</p>
     * <pre><code class="lang-ts hljs typescript">params.value[params.encode.y[<span class="hljs-number">0</span>]]
     * </code></pre>
     * <p>如果数据为：</p>
     * <pre><code class="lang-ts hljs typescript">dataset: {
     *     dimensions: [<span class="hljs-string">'product'</span>, <span class="hljs-string">'2015'</span>, <span class="hljs-string">'2016'</span>, <span class="hljs-string">'2017'</span>],
     *     source: [
     *         {product: <span class="hljs-string">'Matcha Latte'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">43.3</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">85.8</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">93.7</span>},
     *         {product: <span class="hljs-string">'Milk Tea'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">83.1</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">73.4</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">55.1</span>},
     *         {product: <span class="hljs-string">'Cheese Cocoa'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">86.4</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">65.2</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">82.5</span>},
     *         {product: <span class="hljs-string">'Walnut Brownie'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">72.4</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">53.9</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">39.1</span>}
     *     ]
     * }
     * </code></pre>
     * <p>则可这样得到 y 轴对应的 value：</p>
     * <pre><code class="lang-ts hljs typescript">params.value[params.dimensionNames[params.encode.y[<span class="hljs-number">0</span>]]]
     * </code></pre>
     * <p>第二个参数 <code class="codespan">ticket</code> 是异步回调标识，配合第三个参数 <code class="codespan">callback</code> 使用。
     * 第三个参数 <code class="codespan">callback</code> 是异步回调，在提示框浮层内容是异步获取的时候，可以通过 callback 传入上述的 <code class="codespan">ticket</code> 和 <code class="codespan">html</code> 更新提示框浮层内容。</p>
     * <p>示例：</p>
     * <pre><code class="lang-ts hljs typescript">formatter: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">params, ticket, callback</span>) </span>{
     *     $.<span class="hljs-keyword">get</span>(<span class="hljs-string">'detail?name='</span> + params.name, <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">content</span>) </span>{
     *         callback(ticket, toHTML(content));
     *     });
     *     <span class="hljs-keyword">return</span> <span class="hljs-string">'Loading'</span>;
     * }
     * </code></pre>
     */
    private Object formatter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.tooltip.valueFormatter">#series-candlestick.data.tooltip.valueFormatter</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.3.0</code> 开始支持</p>
     * </blockquote>
     * <p>tooltip 中数值显示部分的格式化回调函数。</p>
     * <p>回调函数格式：</p>
     * <pre><code class="lang-ts hljs typescript">(value: <span class="hljs-built_in">number</span> | <span class="hljs-built_in">string</span>) =&gt; <span class="hljs-built_in">string</span>
     * </code></pre>
     * <p>示例：</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-comment">// 添加 $ 前缀</span>
     * valueFormatter: <span class="hljs-function">(<span class="hljs-params">value</span>) =&gt;</span> <span class="hljs-string">'$'</span> + value.toFixed(<span class="hljs-number">2</span>)
     * </code></pre>
     */
    private String valueFormatter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.tooltip.backgroundColor">#series-candlestick.data.tooltip.backgroundColor</a>
     * <br/>默认值: 'rgba(50,50,50,0.7)'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <blockquote>
     * <p><strong>注意：</strong><code class="codespan">series.data.tooltip</code> 仅在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">tooltip.trigger</a> 为 <code class="codespan">'item'</code> 时有效。<br></p>
     * </blockquote>
     * <p>提示框浮层的背景颜色。</p>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.tooltip.borderColor">#series-candlestick.data.tooltip.borderColor</a>
     * <br/>默认值: '#333'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <blockquote>
     * <p><strong>注意：</strong><code class="codespan">series.data.tooltip</code> 仅在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">tooltip.trigger</a> 为 <code class="codespan">'item'</code> 时有效。<br></p>
     * </blockquote>
     * <p>提示框浮层的边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.tooltip.borderWidth">#series-candlestick.data.tooltip.borderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p><strong>注意：</strong><code class="codespan">series.data.tooltip</code> 仅在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">tooltip.trigger</a> 为 <code class="codespan">'item'</code> 时有效。<br></p>
     * </blockquote>
     * <p>提示框浮层的边框宽。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.tooltip.padding">#series-candlestick.data.tooltip.padding</a>
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p><strong>注意：</strong><code class="codespan">series.data.tooltip</code> 仅在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">tooltip.trigger</a> 为 <code class="codespan">'item'</code> 时有效。<br></p>
     * </blockquote>
     *
     *
     * <p>提示框浮层内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距。</p>
     * <p>使用示例：</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-comment">// 设置内边距为 5</span>
     * padding: <span class="hljs-number">5</span>
     * <span class="hljs-comment">// 设置上下的内边距为 5，左右的内边距为 10</span>
     * padding: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>]
     * <span class="hljs-comment">// 分别设置四个方向的内边距</span>
     * padding: [
     *     <span class="hljs-number">5</span>,  <span class="hljs-comment">// 上</span>
     *     <span class="hljs-number">10</span>, <span class="hljs-comment">// 右</span>
     *     <span class="hljs-number">5</span>,  <span class="hljs-comment">// 下</span>
     *     <span class="hljs-number">10</span>, <span class="hljs-comment">// 左</span>
     * ]
     * </code></pre>
     */
    private Integer padding;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.tooltip.textStyle">#series-candlestick.data.tooltip.textStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p><strong>注意：</strong><code class="codespan">series.data.tooltip</code> 仅在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">tooltip.trigger</a> 为 <code class="codespan">'item'</code> 时有效。<br></p>
     * </blockquote>
     * <p>提示框浮层的文本样式。</p>
     */
    private TextStyle textStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.tooltip.extraCssText">#series-candlestick.data.tooltip.extraCssText</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p><strong>注意：</strong><code class="codespan">series.data.tooltip</code> 仅在 <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">tooltip.trigger</a> 为 <code class="codespan">'item'</code> 时有效。<br></p>
     * </blockquote>
     * <p>额外附加到浮层的 css 样式。如下为浮层添加阴影的示例：</p>
     * <pre><code class="lang-ts hljs typescript">extraCssText: <span class="hljs-string">'box-shadow: 0 0 3px rgba(0, 0, 0, 0.3);'</span>
     * </code></pre>
     */
    private String extraCssText;
}
