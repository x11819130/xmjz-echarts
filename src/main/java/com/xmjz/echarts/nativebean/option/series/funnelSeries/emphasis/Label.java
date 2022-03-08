package com.xmjz.echarts.nativebean.option.series.funnelSeries.emphasis;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label">#series-funnel.emphasis.label</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Label extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.show">#series-funnel.emphasis.label.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.formatter">#series-funnel.emphasis.label.formatter</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>标签内容格式器，支持字符串模板和回调函数两种形式，字符串模板与回调函数返回的字符串均支持用 <code class="codespan">\n</code> 换行。</p>
     * <p><strong>字符串模板</strong></p>
     * <p><strong>字符串模板</strong>
     * 模板变量有：</p>
     * <ul>
     * <li><code class="codespan">{a}</code>：系列名。</li>
     * <li><code class="codespan">{b}</code>：数据名。</li>
     * <li><code class="codespan">{c}</code>：数据值。</li>
     * <li><code class="codespan">{d}</code>：百分比。</li>
     * <li><code class="codespan">{@xxx}</code>：数据中名为 <code class="codespan">'xxx'</code> 的维度的值，如 <code class="codespan">{@product}</code> 表示名为 <code class="codespan">'product'</code> 的维度的值。</li>
     * <li><code class="codespan">{@[n]}</code>：数据中维度 <code class="codespan">n</code> 的值，如 <code class="codespan">{@[3]}</code> 表示维度 3 的值，从 0 开始计数。</li>
     * </ul>
     * <p><strong>示例：</strong></p>
     * <pre><code class="lang-ts hljs typescript">formatter: <span class="hljs-string">'{b}: {d}'</span>
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
     *     color: <span class="hljs-built_in">string</span>,
     *     <span class="hljs-comment">// 百分比</span>
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
     */
    private Object formatter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.color">#series-funnel.emphasis.label.color</a>
     * <br/>默认值: '#fff'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字的颜色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.fontStyle">#series-funnel.emphasis.label.fontStyle</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.fontWeight">#series-funnel.emphasis.label.fontWeight</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.fontFamily">#series-funnel.emphasis.label.fontFamily</a>
     * <br/>默认值: 'sans-serif'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字的字体系列。</p>
     * <p>还可以是 'serif' , 'monospace', 'Arial', 'Courier New', 'Microsoft YaHei', ...</p>
     */
    private String fontFamily;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.fontSize">#series-funnel.emphasis.label.fontSize</a>
     * <br/>默认值: 12
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字的字体大小。</p>
     */
    private Integer fontSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.align">#series-funnel.emphasis.label.align</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.verticalAlign">#series-funnel.emphasis.label.verticalAlign</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.lineHeight">#series-funnel.emphasis.label.lineHeight</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.backgroundColor">#series-funnel.emphasis.label.backgroundColor</a>
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
     */
    private Object backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.borderColor">#series-funnel.emphasis.label.borderColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.borderWidth">#series-funnel.emphasis.label.borderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块边框宽度。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.borderType">#series-funnel.emphasis.label.borderType</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.borderDashOffset">#series-funnel.emphasis.label.borderDashOffset</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.borderRadius">#series-funnel.emphasis.label.borderRadius</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>文字块的圆角。</p>
     */
    private Object borderRadius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.padding">#series-funnel.emphasis.label.padding</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.shadowColor">#series-funnel.emphasis.label.shadowColor</a>
     * <br/>默认值: 'transparent'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块的背景阴影颜色。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.shadowBlur">#series-funnel.emphasis.label.shadowBlur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影长度。</p>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.shadowOffsetX">#series-funnel.emphasis.label.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 X 偏移。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.shadowOffsetY">#series-funnel.emphasis.label.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 Y 偏移。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.width">#series-funnel.emphasis.label.width</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.height">#series-funnel.emphasis.label.height</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示高度。</p>
     */
    private Integer height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.textBorderColor">#series-funnel.emphasis.label.textBorderColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的描边颜色。</p>
     */
    private String textBorderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.textBorderWidth">#series-funnel.emphasis.label.textBorderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的描边宽度。</p>
     */
    private Integer textBorderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.textBorderType">#series-funnel.emphasis.label.textBorderType</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.textBorderDashOffset">#series-funnel.emphasis.label.textBorderDashOffset</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.textShadowColor">#series-funnel.emphasis.label.textShadowColor</a>
     * <br/>默认值: 'transparent'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的阴影颜色。</p>
     */
    private String textShadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.textShadowBlur">#series-funnel.emphasis.label.textShadowBlur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影长度。</p>
     */
    private Integer textShadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.textShadowOffsetX">#series-funnel.emphasis.label.textShadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 X 偏移。</p>
     */
    private Integer textShadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.textShadowOffsetY">#series-funnel.emphasis.label.textShadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 Y 偏移。</p>
     */
    private Integer textShadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.overflow">#series-funnel.emphasis.label.overflow</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.ellipsis">#series-funnel.emphasis.label.ellipsis</a>
     * <br/>默认值: '...'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>在<code class="codespan">overflow</code>配置为<code class="codespan">'truncate'</code>的时候，可以通过该属性配置末尾显示的文本。</p>
     */
    private String ellipsis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.emphasis.label.rich">#series-funnel.emphasis.label.rich</a>
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
