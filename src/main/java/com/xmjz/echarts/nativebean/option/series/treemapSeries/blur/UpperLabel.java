package com.xmjz.echarts.nativebean.option.series.treemapSeries.blur;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel">#series-treemap.blur.upperLabel</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class UpperLabel extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.show">#series-treemap.blur.upperLabel.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示标签。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.position">#series-treemap.blur.upperLabel.position</a>
     * <br/>默认值: 'inside'
     * <br/>js类型: ["string","Array"]
     * <br/>描述:
     * <p>标签的位置。</p>
     * <ul>
     * <li><p>可以通过内置的语义声明位置：</p>
     * <p>  示例：</p>
     * <pre><code class="lang-ts hljs typescript">  position: <span class="hljs-string">'top'</span>
     * </code></pre>
     * <p>  支持：<code class="codespan">top</code> / <code class="codespan">left</code> / <code class="codespan">right</code> / <code class="codespan">bottom</code> / <code class="codespan">inside</code> / <code class="codespan">insideLeft</code> / <code class="codespan">insideRight</code> / <code class="codespan">insideTop</code> / <code class="codespan">insideBottom</code> / <code class="codespan">insideTopLeft</code> / <code class="codespan">insideBottomLeft</code> / <code class="codespan">insideTopRight</code> / <code class="codespan">insideBottomRight</code></p>
     * </li>
     * <li><p>也可以用一个数组表示相对的百分比或者绝对像素值表示标签相对于图形包围盒左上角的位置。</p>
     * <p>  示例：</p>
     * <pre><code class="lang-ts hljs typescript">  <span class="hljs-comment">// 绝对的像素值</span>
     *   position: [<span class="hljs-number">10</span>, <span class="hljs-number">10</span>],
     *   <span class="hljs-comment">// 相对的百分比</span>
     *   position: [<span class="hljs-string">'50%'</span>, <span class="hljs-string">'50%'</span>]
     * </code></pre>
     * </li>
     * </ul>
     * <p>参见：<a href="https://echarts.apache.org/examples/zh/view.html?c=doc-example/label-position" target="_blank">label position</a>。</p>
     */
    private Object position;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.distance">#series-treemap.blur.upperLabel.distance</a>
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>距离图形元素的距离。</p>
     * <p>当 position 为字符描述值（如 <code class="codespan">'top'</code>、<code class="codespan">'insideRight'</code>）时候有效。</p>
     * <p>参见：<a href="https://echarts.apache.org/examples/zh/editor.html?c=doc-example/label-position" target="_blank">label position</a>。</p>
     */
    private Integer distance;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.rotate">#series-treemap.blur.upperLabel.rotate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标签旋转。从 -90 度到 90 度。正值是逆时针。</p>
     * <p>参见：<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-label-rotation" target="_blank">label rotation</a>。</p>
     */
    private Integer rotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.offset">#series-treemap.blur.upperLabel.offset</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>是否对文字进行偏移。默认不偏移。例如：<code class="codespan">[30, 40]</code> 表示文字在横向上偏移 <code class="codespan">30</code>，纵向上偏移 <code class="codespan">40</code>。</p>
     */
    private List<?> offset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.formatter">#series-treemap.blur.upperLabel.formatter</a>
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
     * <pre><code class="lang-ts hljs typescript">formatter: <span class="hljs-string">'{b}: {@score}'</span>
     * </code></pre>
     * <p><strong>回调函数</strong></p>
     * <p>回调函数格式：</p>
     * <pre><code class="lang-ts hljs typescript">(params: <span class="hljs-built_in">Object</span>|<span class="hljs-built_in">Array</span>) =&gt; <span class="hljs-built_in">string</span>
     * </code></pre>
     * <p>参数 <code class="codespan">params</code> 是 formatter 需要的单个数据集。格式如下：</p>
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
     */
    private Object formatter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.color">#series-treemap.blur.upperLabel.color</a>
     * <br/>默认值: '#fff'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字的颜色。</p>
     * <p>如果设置为 <code class="codespan">'inherit'</code>，则为视觉映射得到的颜色，如系列色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.fontStyle">#series-treemap.blur.upperLabel.fontStyle</a>
     * <br/>默认值: 'normal'
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.fontWeight">#series-treemap.blur.upperLabel.fontWeight</a>
     * <br/>默认值: 'normal'
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.fontFamily">#series-treemap.blur.upperLabel.fontFamily</a>
     * <br/>默认值: 'sans-serif'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字的字体系列。</p>
     * <p>还可以是 'serif' , 'monospace', 'Arial', 'Courier New', 'Microsoft YaHei', ...</p>
     */
    private String fontFamily;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.fontSize">#series-treemap.blur.upperLabel.fontSize</a>
     * <br/>默认值: 12
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字的字体大小。</p>
     */
    private Integer fontSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.align">#series-treemap.blur.upperLabel.align</a>
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
     * <pre><code class="lang-ts hljs typescript">{
     *     align: right,
     *     rich: {
     *         a: {
     *             <span class="hljs-comment">// 没有设置 `align`，则 `align` 为 right</span>
     *         }
     *     }
     * }
     * </code></pre>
     */
    private String align;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.verticalAlign">#series-treemap.blur.upperLabel.verticalAlign</a>
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
     * <pre><code class="lang-ts hljs typescript">{
     *     verticalAlign: bottom,
     *     rich: {
     *         a: {
     *             <span class="hljs-comment">// 没有设置 `verticalAlign`，则 `verticalAlign` 为 bottom</span>
     *         }
     *     }
     * }
     * </code></pre>
     */
    private String verticalAlign;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.lineHeight">#series-treemap.blur.upperLabel.lineHeight</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>行高。</p>
     * <p><code class="codespan">rich</code> 中如果没有设置 <code class="codespan">lineHeight</code>，则会取父层级的 <code class="codespan">lineHeight</code>。例如：</p>
     * <pre><code class="lang-ts hljs typescript">{
     *     lineHeight: <span class="hljs-number">56</span>,
     *     rich: {
     *         a: {
     *             <span class="hljs-comment">// 没有设置 `lineHeight`，则 `lineHeight` 为 56</span>
     *         }
     *     }
     * }
     * </code></pre>
     */
    private Integer lineHeight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.backgroundColor">#series-treemap.blur.upperLabel.backgroundColor</a>
     * <br/>默认值: 'transparent'
     * <br/>js类型: ["string","Object"]
     * <br/>描述:
     * <p>文字块背景色。</p>
     * <p>可以使用颜色值，例如：<code class="codespan">'#123234'</code>, <code class="codespan">'red'</code>, <code class="codespan">'rgba(0,23,11,0.3)'</code>。</p>
     * <p>也可以直接使用图片，例如：</p>
     * <pre><code class="lang-ts hljs typescript">backgroundColor: {
     *     image: <span class="hljs-string">'xxx/xxx.png'</span>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.borderColor">#series-treemap.blur.upperLabel.borderColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块边框颜色。</p>
     * <p>如果设置为 <code class="codespan">'inherit'</code>，则为视觉映射得到的颜色，如系列色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.borderWidth">#series-treemap.blur.upperLabel.borderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块边框宽度。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.borderType">#series-treemap.blur.upperLabel.borderType</a>
     * <br/>默认值: 'solid'
     * <br/>js类型: ["string","number","Array"]
     * <br/>描述:
     * <p>文字块边框描边类型。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'solid'</code></li>
     * <li><code class="codespan">'dashed'</code></li>
     * <li><code class="codespan">'dotted'</code></li>
     * </ul>
     * <p>自 <code class="codespan">v5.0.0</code> 开始，也可以是 <code class="codespan">number</code> 或者 <code class="codespan">number</code> 数组，用以指定线条的 <a href="https://developer.mozilla.org/zh-CN/docs/Web/SVG/Attribute/stroke-dasharray" target="_blank">dash array</a>，配合
     * <code class="codespan">borderDashOffset</code>
     *  可实现更灵活的虚线效果。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">{
     *
     * borderType: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>],
     *
     * borderDashOffset: <span class="hljs-number">5</span>
     * }
     * </code></pre>
     */
    private Object borderType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.borderDashOffset">#series-treemap.blur.upperLabel.borderDashOffset</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>用于设置虚线的偏移量，可搭配
     * <code class="codespan">borderType</code>
     * 指定 dash array 实现灵活的虚线效果。</p>
     * <p>更多详情可以参考 MDN <a href="https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/lineDashOffset" target="_blank">lineDashOffset</a>。</p>
     */
    private Integer borderDashOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.borderRadius">#series-treemap.blur.upperLabel.borderRadius</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>文字块的圆角。</p>
     */
    private Object borderRadius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.padding">#series-treemap.blur.upperLabel.padding</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.shadowColor">#series-treemap.blur.upperLabel.shadowColor</a>
     * <br/>默认值: 'transparent'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块的背景阴影颜色。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.shadowBlur">#series-treemap.blur.upperLabel.shadowBlur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影长度。</p>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.shadowOffsetX">#series-treemap.blur.upperLabel.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 X 偏移。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.shadowOffsetY">#series-treemap.blur.upperLabel.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 Y 偏移。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.width">#series-treemap.blur.upperLabel.width</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.height">#series-treemap.blur.upperLabel.height</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示高度。</p>
     */
    private Integer height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.textBorderColor">#series-treemap.blur.upperLabel.textBorderColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的描边颜色。</p>
     * <p>如果设置为 <code class="codespan">'inherit'</code>，则为视觉映射得到的颜色，如系列色。</p>
     */
    private String textBorderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.textBorderWidth">#series-treemap.blur.upperLabel.textBorderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的描边宽度。</p>
     */
    private Integer textBorderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.textBorderType">#series-treemap.blur.upperLabel.textBorderType</a>
     * <br/>默认值: 'solid'
     * <br/>js类型: ["string","number","Array"]
     * <br/>描述:
     * <p>文字本身的描边类型。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'solid'</code></li>
     * <li><code class="codespan">'dashed'</code></li>
     * <li><code class="codespan">'dotted'</code></li>
     * </ul>
     * <p>自 <code class="codespan">v5.0.0</code> 开始，也可以是 <code class="codespan">number</code> 或者 <code class="codespan">number</code> 数组，用以指定线条的 <a href="https://developer.mozilla.org/zh-CN/docs/Web/SVG/Attribute/stroke-dasharray" target="_blank">dash array</a>，配合
     * <code class="codespan">textBorderDashOffset</code>
     *  可实现更灵活的虚线效果。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">{
     *
     * textBorderType: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>],
     *
     * textBorderDashOffset: <span class="hljs-number">5</span>
     * }
     * </code></pre>
     */
    private Object textBorderType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.textBorderDashOffset">#series-treemap.blur.upperLabel.textBorderDashOffset</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>用于设置虚线的偏移量，可搭配
     * <code class="codespan">textBorderType</code>
     * 指定 dash array 实现灵活的虚线效果。</p>
     * <p>更多详情可以参考 MDN <a href="https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/lineDashOffset" target="_blank">lineDashOffset</a>。</p>
     */
    private Integer textBorderDashOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.textShadowColor">#series-treemap.blur.upperLabel.textShadowColor</a>
     * <br/>默认值: 'transparent'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的阴影颜色。</p>
     */
    private String textShadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.textShadowBlur">#series-treemap.blur.upperLabel.textShadowBlur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影长度。</p>
     */
    private Integer textShadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.textShadowOffsetX">#series-treemap.blur.upperLabel.textShadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 X 偏移。</p>
     */
    private Integer textShadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.textShadowOffsetY">#series-treemap.blur.upperLabel.textShadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 Y 偏移。</p>
     */
    private Integer textShadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.overflow">#series-treemap.blur.upperLabel.overflow</a>
     * <br/>默认值: 'none'
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.ellipsis">#series-treemap.blur.upperLabel.ellipsis</a>
     * <br/>默认值: '...'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>在<code class="codespan">overflow</code>配置为<code class="codespan">'truncate'</code>的时候，可以通过该属性配置末尾显示的文本。</p>
     */
    private String ellipsis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.blur.upperLabel.rich">#series-treemap.blur.upperLabel.rich</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>在 <code class="codespan">rich</code> 里面，可以自定义富文本样式。利用富文本样式，可以在标签中做出非常丰富的效果。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">label: {
     *     <span class="hljs-comment">// 在文本中，可以对部分文本采用 rich 中定义样式。</span>
     *     <span class="hljs-comment">// 这里需要在文本中使用标记符号：</span>
     *     <span class="hljs-comment">// `{styleName|text content text content}` 标记样式名。</span>
     *     <span class="hljs-comment">// 注意，换行仍是使用 '\n'。</span>
     *     formatter: [
     *         <span class="hljs-string">'{a|这段文本采用样式a}'</span>,
     *         <span class="hljs-string">'{b|这段文本采用样式b}这段用默认样式{x|这段用样式x}'</span>
     *     ].join(<span class="hljs-string">'\n'</span>),
     *
     *     rich: {
     *         a: {
     *             color: <span class="hljs-string">'red'</span>,
     *             lineHeight: <span class="hljs-number">10</span>
     *         },
     *         b: {
     *             backgroundColor: {
     *                 image: <span class="hljs-string">'xxx/xxx.jpg'</span>
     *             },
     *             height: <span class="hljs-number">40</span>
     *         },
     *         x: {
     *             fontSize: <span class="hljs-number">18</span>,
     *             fontFamily: <span class="hljs-string">'Microsoft YaHei'</span>,
     *             borderColor: <span class="hljs-string">'#449933'</span>,
     *             borderRadius: <span class="hljs-number">4</span>
     *         },
     *         ...
     *     }
     * }
     * </code></pre>
     * <p>详情参见教程：<a href="tutorial.html#%E5%AF%8C%E6%96%87%E6%9C%AC%E6%A0%87%E7%AD%BE" target="_blank">富文本标签</a></p>
     */
    private Object rich;
}
