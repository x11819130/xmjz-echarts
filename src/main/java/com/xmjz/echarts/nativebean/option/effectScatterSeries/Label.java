package com.xmjz.echarts.nativebean.option.effectScatterSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label">https://echarts.apache.org/zh/option.html#series-effectScatter.label</a>
 * <br/>序号: 20
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Label implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.show">https://echarts.apache.org/zh/option.html#series-effectScatter.label.show</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示标签。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.position">https://echarts.apache.org/zh/option.html#series-effectScatter.label.position</a>
     * <br/>序号: 2
     * <br/>默认值: inside
     * <br/>js类型: ["string","Array"]
     * <br/>描述:
     * <p>标签的位置。</p>
     * <ul>
     * <li><p>可以通过内置的语义声明位置：</p>
     * <p>  示例：</p>
     * <pre><code class="lang-js hljs javascript">  position: <span class="hljs-string">'top'</span>
     * </code></pre>
     * <p>  支持：<code class="codespan">top</code> / <code class="codespan">left</code> / <code class="codespan">right</code> / <code class="codespan">bottom</code> / <code class="codespan">inside</code> / <code class="codespan">insideLeft</code> / <code class="codespan">insideRight</code> / <code class="codespan">insideTop</code> / <code class="codespan">insideBottom</code> / <code class="codespan">insideTopLeft</code> / <code class="codespan">insideBottomLeft</code> / <code class="codespan">insideTopRight</code> / <code class="codespan">insideBottomRight</code></p>
     * </li>
     * <li><p>也可以用一个数组表示相对的百分比或者绝对像素值表示标签相对于图形包围盒左上角的位置。</p>
     * <p>  示例：</p>
     * <pre><code class="lang-js hljs javascript">  <span class="hljs-comment">// 绝对的像素值</span>
     *   <span class="hljs-attr">position</span>: [<span class="hljs-number">10</span>, <span class="hljs-number">10</span>],
     *   <span class="hljs-comment">// 相对的百分比</span>
     *   <span class="hljs-attr">position</span>: [<span class="hljs-string">'50%'</span>, <span class="hljs-string">'50%'</span>]
     * </code></pre>
     * </li>
     * </ul>
     * <p>参见：<a href="https://echarts.apache.org/examples/zh/view.html?c=doc-example/label-position" target="_blank">label position</a>。</p>
     */
    private Object position;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.distance">https://echarts.apache.org/zh/option.html#series-effectScatter.label.distance</a>
     * <br/>序号: 3
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>距离图形元素的距离。</p>
     * <p>当 position 为字符描述值（如 <code class="codespan">'top'</code>、<code class="codespan">'insideRight'</code>）时候有效。</p>
     * <p>参见：<a href="https://echarts.apache.org/examples/zh/editor.html?c=doc-example/label-position" target="_blank">label position</a>。</p>
     */
    private Integer distance;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.rotate">https://echarts.apache.org/zh/option.html#series-effectScatter.label.rotate</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标签旋转。从 -90 度到 90 度。正值是逆时针。</p>
     * <p>参见：<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-label-rotation" target="_blank">label rotation</a>。</p>
     */
    private Integer rotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.offset">https://echarts.apache.org/zh/option.html#series-effectScatter.label.offset</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>是否对文字进行偏移。默认不偏移。例如：<code class="codespan">[30, 40]</code> 表示文字在横向上偏移 <code class="codespan">30</code>，纵向上偏移 <code class="codespan">40</code>。</p>
     */
    private List<?> offset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.formatter">https://echarts.apache.org/zh/option.html#series-effectScatter.label.formatter</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>标签内容格式器，支持字符串模板和回调函数两种形式，字符串模板与回调函数返回的字符串均支持用 <code class="codespan">\n</code> 换行。</p>
     * <p><strong>字符串模板</strong>
     * 模板变量有：</p>
     * <ul>
     * <li><code class="codespan">{a}</code>：系列名。</li>
     * <li><code class="codespan">{b}</code>：数据名。</li>
     * <li><code class="codespan">{c}</code>：数据值。</li>
     * <li><code class="codespan">{@xxx}</code>：数据中名为 <code class="codespan">'xxx'</code> 的维度的值，如 <code class="codespan">{@product}</code> 表示名为 <code class="codespan">'product'</code> 的维度的值。</li>
     * <li><code class="codespan">{@[n]}</code>：数据中维度 <code class="codespan">n</code> 的值，如 <code class="codespan">{@[3]}</code> 表示维度 3 的值，从 0 开始计数。</li>
     * </ul>
     * <p><strong>示例：</strong></p>
     * <pre><code class="lang-js hljs javascript">formatter: <span class="hljs-string">'{b}: {@score}'</span>
     * </code></pre>
     * <p><strong>回调函数</strong></p>
     * <p>回调函数格式：</p>
     * <pre><code class="lang-js hljs javascript">(params: <span class="hljs-built_in">Object</span>|<span class="hljs-built_in">Array</span>) =&gt; string
     * </code></pre>
     * <p>参数 <code class="codespan">params</code> 是 formatter 需要的单个数据集。格式如下：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">componentType</span>: <span class="hljs-string">'series'</span>,
     *     <span class="hljs-comment">// 系列类型</span>
     *     <span class="hljs-attr">seriesType</span>: string,
     *     <span class="hljs-comment">// 系列在传入的 option.series 中的 index</span>
     *     <span class="hljs-attr">seriesIndex</span>: number,
     *     <span class="hljs-comment">// 系列名称</span>
     *     <span class="hljs-attr">seriesName</span>: string,
     *     <span class="hljs-comment">// 数据名，类目名</span>
     *     <span class="hljs-attr">name</span>: string,
     *     <span class="hljs-comment">// 数据在传入的 data 数组中的 index</span>
     *     <span class="hljs-attr">dataIndex</span>: number,
     *     <span class="hljs-comment">// 传入的原始数据项</span>
     *     <span class="hljs-attr">data</span>: <span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 传入的数据值。在多数系列下它和 data 相同。在一些系列下是 data 中的分量（如 map、radar 中）</span>
     *     <span class="hljs-attr">value</span>: number|<span class="hljs-built_in">Array</span>|<span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 坐标轴 encode 映射信息，</span>
     *     <span class="hljs-comment">// key 为坐标轴（如 'x' 'y' 'radius' 'angle' 等）</span>
     *     <span class="hljs-comment">// value 必然为数组，不会为 null/undefied，表示 dimension index 。</span>
     *     <span class="hljs-comment">// 其内容如：</span>
     *     <span class="hljs-comment">// {</span>
     *     <span class="hljs-comment">//     x: [2] // dimension index 为 2 的数据映射到 x 轴</span>
     *     <span class="hljs-comment">//     y: [0] // dimension index 为 0 的数据映射到 y 轴</span>
     *     <span class="hljs-comment">// }</span>
     *     <span class="hljs-attr">encode</span>: <span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 维度名列表</span>
     *     <span class="hljs-attr">dimensionNames</span>: <span class="hljs-built_in">Array</span>&lt;<span class="hljs-built_in">String</span>&gt;,
     *     <span class="hljs-comment">// 数据的维度 index，如 0 或 1 或 2 ...</span>
     *     <span class="hljs-comment">// 仅在雷达图中使用。</span>
     *     <span class="hljs-attr">dimensionIndex</span>: number,
     *     <span class="hljs-comment">// 数据图形的颜色</span>
     *     <span class="hljs-attr">color</span>: string,
     *
     *
     *
     * }
     * </code></pre>
     * <p>注：encode 和 dimensionNames 的使用方式，例如：</p>
     * <p>如果数据为：</p>
     * <pre><code class="lang-js hljs javascript">dataset: {
     *     <span class="hljs-attr">source</span>: [
     *         [<span class="hljs-string">'Matcha Latte'</span>, <span class="hljs-number">43.3</span>, <span class="hljs-number">85.8</span>, <span class="hljs-number">93.7</span>],
     *         [<span class="hljs-string">'Milk Tea'</span>, <span class="hljs-number">83.1</span>, <span class="hljs-number">73.4</span>, <span class="hljs-number">55.1</span>],
     *         [<span class="hljs-string">'Cheese Cocoa'</span>, <span class="hljs-number">86.4</span>, <span class="hljs-number">65.2</span>, <span class="hljs-number">82.5</span>],
     *         [<span class="hljs-string">'Walnut Brownie'</span>, <span class="hljs-number">72.4</span>, <span class="hljs-number">53.9</span>, <span class="hljs-number">39.1</span>]
     *     ]
     * }
     * </code></pre>
     * <p>则可这样得到 y 轴对应的 value：</p>
     * <pre><code class="lang-js hljs javascript">params.value[params.encode.y[<span class="hljs-number">0</span>]]
     * </code></pre>
     * <p>如果数据为：</p>
     * <pre><code class="lang-js hljs javascript">dataset: {
     *     <span class="hljs-attr">dimensions</span>: [<span class="hljs-string">'product'</span>, <span class="hljs-string">'2015'</span>, <span class="hljs-string">'2016'</span>, <span class="hljs-string">'2017'</span>],
     *     <span class="hljs-attr">source</span>: [
     *         {<span class="hljs-attr">product</span>: <span class="hljs-string">'Matcha Latte'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">43.3</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">85.8</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">93.7</span>},
     *         {<span class="hljs-attr">product</span>: <span class="hljs-string">'Milk Tea'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">83.1</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">73.4</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">55.1</span>},
     *         {<span class="hljs-attr">product</span>: <span class="hljs-string">'Cheese Cocoa'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">86.4</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">65.2</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">82.5</span>},
     *         {<span class="hljs-attr">product</span>: <span class="hljs-string">'Walnut Brownie'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">72.4</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">53.9</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">39.1</span>}
     *     ]
     * }
     * </code></pre>
     * <p>则可这样得到 y 轴对应的 value：</p>
     * <pre><code class="lang-js hljs javascript">params.value[params.dimensionNames[params.encode.y[<span class="hljs-number">0</span>]]]
     * </code></pre>
     */
    private Object formatter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.color">https://echarts.apache.org/zh/option.html#series-effectScatter.label.color</a>
     * <br/>序号: 7
     * <br/>默认值: #fff
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字的颜色。</p>
     * <p>如果设置为 <code class="codespan">'inherit'</code>，则为视觉映射得到的颜色，如系列色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.fontStyle">https://echarts.apache.org/zh/option.html#series-effectScatter.label.fontStyle</a>
     * <br/>序号: 8
     * <br/>默认值: normal
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字字体的风格。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'normal'</code></li>
     * <li><code class="codespan">'italic'</code></li>
     * <li><code class="codespan">'oblique'</code></li>
     * </ul>
     */
    private String fontStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.fontWeight">https://echarts.apache.org/zh/option.html#series-effectScatter.label.fontWeight</a>
     * <br/>序号: 9
     * <br/>默认值: normal
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>文字字体的粗细。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'normal'</code></li>
     * <li><code class="codespan">'bold'</code></li>
     * <li><code class="codespan">'bolder'</code></li>
     * <li><code class="codespan">'lighter'</code></li>
     * <li>100 | 200 | 300 | 400...</li>
     * </ul>
     */
    private Object fontWeight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.fontFamily">https://echarts.apache.org/zh/option.html#series-effectScatter.label.fontFamily</a>
     * <br/>序号: 10
     * <br/>默认值: sans-serif
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字的字体系列。</p>
     * <p>还可以是 'serif' , 'monospace', 'Arial', 'Courier New', 'Microsoft YaHei', ...</p>
     */
    private String fontFamily;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.fontSize">https://echarts.apache.org/zh/option.html#series-effectScatter.label.fontSize</a>
     * <br/>序号: 11
     * <br/>默认值: 12
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字的字体大小。</p>
     */
    private Integer fontSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.align">https://echarts.apache.org/zh/option.html#series-effectScatter.label.align</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字水平对齐方式，默认自动。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'left'</code></li>
     * <li><code class="codespan">'center'</code></li>
     * <li><code class="codespan">'right'</code></li>
     * </ul>
     * <p><code class="codespan">rich</code> 中如果没有设置 <code class="codespan">align</code>，则会取父层级的 <code class="codespan">align</code>。例如：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">align</span>: right,
     *     <span class="hljs-attr">rich</span>: {
     *         <span class="hljs-attr">a</span>: {
     *             <span class="hljs-comment">// 没有设置 `align`，则 `align` 为 right</span>
     *         }
     *     }
     * }
     * </code></pre>
     */
    private String align;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.verticalAlign">https://echarts.apache.org/zh/option.html#series-effectScatter.label.verticalAlign</a>
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字垂直对齐方式，默认自动。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'top'</code></li>
     * <li><code class="codespan">'middle'</code></li>
     * <li><code class="codespan">'bottom'</code></li>
     * </ul>
     * <p><code class="codespan">rich</code> 中如果没有设置 <code class="codespan">verticalAlign</code>，则会取父层级的 <code class="codespan">verticalAlign</code>。例如：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">verticalAlign</span>: bottom,
     *     <span class="hljs-attr">rich</span>: {
     *         <span class="hljs-attr">a</span>: {
     *             <span class="hljs-comment">// 没有设置 `verticalAlign`，则 `verticalAlign` 为 bottom</span>
     *         }
     *     }
     * }
     * </code></pre>
     */
    private String verticalAlign;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.lineHeight">https://echarts.apache.org/zh/option.html#series-effectScatter.label.lineHeight</a>
     * <br/>序号: 14
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>行高。</p>
     * <p><code class="codespan">rich</code> 中如果没有设置 <code class="codespan">lineHeight</code>，则会取父层级的 <code class="codespan">lineHeight</code>。例如：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">lineHeight</span>: <span class="hljs-number">56</span>,
     *     <span class="hljs-attr">rich</span>: {
     *         <span class="hljs-attr">a</span>: {
     *             <span class="hljs-comment">// 没有设置 `lineHeight`，则 `lineHeight` 为 56</span>
     *         }
     *     }
     * }
     * </code></pre>
     */
    private Integer lineHeight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.backgroundColor">https://echarts.apache.org/zh/option.html#series-effectScatter.label.backgroundColor</a>
     * <br/>序号: 15
     * <br/>默认值: transparent
     * <br/>js类型: ["string","Object"]
     * <br/>描述:
     * <p>文字块背景色。</p>
     * <p>可以使用颜色值，例如：<code class="codespan">'#123234'</code>, <code class="codespan">'red'</code>, <code class="codespan">'rgba(0,23,11,0.3)'</code>。</p>
     * <p>也可以直接使用图片，例如：</p>
     * <pre><code class="lang-js hljs javascript">backgroundColor: {
     *     <span class="hljs-attr">image</span>: <span class="hljs-string">'xxx/xxx.png'</span>
     *     <span class="hljs-comment">// 这里可以是图片的 URL，</span>
     *     <span class="hljs-comment">// 或者图片的 dataURI，</span>
     *     <span class="hljs-comment">// 或者 HTMLImageElement 对象，</span>
     *     <span class="hljs-comment">// 或者 HTMLCanvasElement 对象。</span>
     * }
     * </code></pre>
     * <p>当使用图片的时候，可以使用 <code class="codespan">width</code> 或 <code class="codespan">height</code> 指定高宽，也可以不指定自适应。</p>
     * <p>如果设置为 <code class="codespan">'inherit'</code>，则为视觉映射得到的颜色，如系列色。</p>
     */
    private Object backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.borderColor">https://echarts.apache.org/zh/option.html#series-effectScatter.label.borderColor</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块边框颜色。</p>
     * <p>如果设置为 <code class="codespan">'inherit'</code>，则为视觉映射得到的颜色，如系列色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.borderWidth">https://echarts.apache.org/zh/option.html#series-effectScatter.label.borderWidth</a>
     * <br/>序号: 17
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块边框宽度。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.borderRadius">https://echarts.apache.org/zh/option.html#series-effectScatter.label.borderRadius</a>
     * <br/>序号: 18
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>文字块的圆角。</p>
     */
    private Object borderRadius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.padding">https://echarts.apache.org/zh/option.html#series-effectScatter.label.padding</a>
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>文字块的内边距。例如：</p>
     * <ul>
     * <li><code class="codespan">padding: [3, 4, 5, 6]</code>：表示 <code class="codespan">[上, 右, 下, 左]</code> 的边距。</li>
     * <li><code class="codespan">padding: 4</code>：表示 <code class="codespan">padding: [4, 4, 4, 4]</code>。</li>
     * <li><code class="codespan">padding: [3, 4]</code>：表示 <code class="codespan">padding: [3, 4, 3, 4]</code>。</li>
     * </ul>
     * <p>注意，文字块的 <code class="codespan">width</code> 和 <code class="codespan">height</code> 指定的是内容高宽，不包含 <code class="codespan">padding</code>。</p>
     */
    private Object padding;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.shadowColor">https://echarts.apache.org/zh/option.html#series-effectScatter.label.shadowColor</a>
     * <br/>序号: 20
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块的背景阴影颜色。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.shadowBlur">https://echarts.apache.org/zh/option.html#series-effectScatter.label.shadowBlur</a>
     * <br/>序号: 21
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影长度。</p>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.shadowOffsetX">https://echarts.apache.org/zh/option.html#series-effectScatter.label.shadowOffsetX</a>
     * <br/>序号: 22
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 X 偏移。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.shadowOffsetY">https://echarts.apache.org/zh/option.html#series-effectScatter.label.shadowOffsetY</a>
     * <br/>序号: 23
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 Y 偏移。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.width">https://echarts.apache.org/zh/option.html#series-effectScatter.label.width</a>
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.height">https://echarts.apache.org/zh/option.html#series-effectScatter.label.height</a>
     * <br/>序号: 25
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示高度。</p>
     */
    private Integer height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.textBorderColor">https://echarts.apache.org/zh/option.html#series-effectScatter.label.textBorderColor</a>
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的描边颜色。</p>
     * <p>如果设置为 <code class="codespan">'inherit'</code>，则为视觉映射得到的颜色，如系列色。</p>
     */
    private String textBorderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.textBorderWidth">https://echarts.apache.org/zh/option.html#series-effectScatter.label.textBorderWidth</a>
     * <br/>序号: 27
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的描边宽度。</p>
     */
    private Integer textBorderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.textShadowColor">https://echarts.apache.org/zh/option.html#series-effectScatter.label.textShadowColor</a>
     * <br/>序号: 28
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的阴影颜色。</p>
     */
    private String textShadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.textShadowBlur">https://echarts.apache.org/zh/option.html#series-effectScatter.label.textShadowBlur</a>
     * <br/>序号: 29
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影长度。</p>
     */
    private Integer textShadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.textShadowOffsetX">https://echarts.apache.org/zh/option.html#series-effectScatter.label.textShadowOffsetX</a>
     * <br/>序号: 30
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 X 偏移。</p>
     */
    private Integer textShadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.textShadowOffsetY">https://echarts.apache.org/zh/option.html#series-effectScatter.label.textShadowOffsetY</a>
     * <br/>序号: 31
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 Y 偏移。</p>
     */
    private Integer textShadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.overflow">https://echarts.apache.org/zh/option.html#series-effectScatter.label.overflow</a>
     * <br/>序号: 32
     * <br/>默认值: none
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字超出宽度是否截断或者换行。配置<code class="codespan">width</code>时有效</p>
     * <ul>
     * <li><code class="codespan">'truncate'</code> 截断，并在末尾显示<code class="codespan">ellipsis</code>配置的文本，默认为<code class="codespan">...</code></li>
     * <li><code class="codespan">'break'</code> 换行</li>
     * <li><code class="codespan">'breakAll'</code> 换行，跟<code class="codespan">'break'</code>不同的是，在英语等拉丁文中，<code class="codespan">'breakAll'</code>还会强制单词内换行</li>
     * </ul>
     */
    private String overflow;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.ellipsis">https://echarts.apache.org/zh/option.html#series-effectScatter.label.ellipsis</a>
     * <br/>序号: 33
     * <br/>默认值: ...
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>在<code class="codespan">overflow</code>配置为<code class="codespan">'truncate'</code>的时候，可以通过该属性配置末尾显示的文本。</p>
     */
    private String ellipsis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.lineOverflow">https://echarts.apache.org/zh/option.html#series-effectScatter.label.lineOverflow</a>
     * <br/>序号: 34
     * <br/>默认值: none
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文本超出高度部分是否截断，配置<code class="codespan">height</code>时有效。</p>
     * <ul>
     * <li><code class="codespan">'truncate'</code> 在文本行数超出高度部分截断。</li>
     * </ul>
     */
    private String lineOverflow;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-effectScatter.label.rich">https://echarts.apache.org/zh/option.html#series-effectScatter.label.rich</a>
     * <br/>序号: 35
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>在 <code class="codespan">rich</code> 里面，可以自定义富文本样式。利用富文本样式，可以在标签中做出非常丰富的效果。</p>
     * <p>例如：</p>
     * <pre><code class="lang-js hljs javascript">label: {
     *     <span class="hljs-comment">// 在文本中，可以对部分文本采用 rich 中定义样式。</span>
     *     <span class="hljs-comment">// 这里需要在文本中使用标记符号：</span>
     *     <span class="hljs-comment">// `{styleName|text content text content}` 标记样式名。</span>
     *     <span class="hljs-comment">// 注意，换行仍是使用 '\n'。</span>
     *     <span class="hljs-attr">formatter</span>: [
     *         <span class="hljs-string">'{a|这段文本采用样式a}'</span>,
     *         <span class="hljs-string">'{b|这段文本采用样式b}这段用默认样式{x|这段用样式x}'</span>
     *     ].join(<span class="hljs-string">'\n'</span>),
     *
     *     <span class="hljs-attr">rich</span>: {
     *         <span class="hljs-attr">a</span>: {
     *             <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>,
     *             <span class="hljs-attr">lineHeight</span>: <span class="hljs-number">10</span>
     *         },
     *         <span class="hljs-attr">b</span>: {
     *             <span class="hljs-attr">backgroundColor</span>: {
     *                 <span class="hljs-attr">image</span>: <span class="hljs-string">'xxx/xxx.jpg'</span>
     *             },
     *             <span class="hljs-attr">height</span>: <span class="hljs-number">40</span>
     *         },
     *         <span class="hljs-attr">x</span>: {
     *             <span class="hljs-attr">fontSize</span>: <span class="hljs-number">18</span>,
     *             <span class="hljs-attr">fontFamily</span>: <span class="hljs-string">'Microsoft YaHei'</span>,
     *             <span class="hljs-attr">borderColor</span>: <span class="hljs-string">'#449933'</span>,
     *             <span class="hljs-attr">borderRadius</span>: <span class="hljs-number">4</span>
     *         },
     *         ...
     *     }
     * }
     * </code></pre>
     * <p>详情参见教程：<a href="tutorial.html#%E5%AF%8C%E6%96%87%E6%9C%AC%E6%A0%87%E7%AD%BE" target="_blank">富文本标签</a></p>
     */
    private Object rich;
}
