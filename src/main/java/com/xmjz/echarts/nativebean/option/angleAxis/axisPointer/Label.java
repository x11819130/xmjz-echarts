package com.xmjz.echarts.nativebean.option.angleAxis.axisPointer;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label">#angleAxis.axisPointer.label</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>坐标轴指示器的文本标签。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Label extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.show">#angleAxis.axisPointer.label.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示文本标签。如果 <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.type">tooltip.axisPointer.type</a> 设置为 <code class="codespan">'cross'</code> 则默认显示标签，否则默认不显示。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.precision">#angleAxis.axisPointer.label.precision</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>文本标签中数值的小数点精度。默认根据当前轴的值自动判断。也可以指定如 <code class="codespan">2</code> 表示保留两位小数。</p>
     */
    private Object precision;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.formatter">#angleAxis.axisPointer.label.formatter</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>文本标签文字的格式化器。</p>
     * <p>如果为 <code class="codespan">string</code>，可以是例如：<code class="codespan">formatter: 'some text {value} some text</code>，其中 <code class="codespan">{value}</code> 会被自动替换为轴的值。</p>
     * <p>如果为 <code class="codespan">function</code>，可以是例如：</p>
     * <p><strong>参数：</strong></p>
     * <p><code class="codespan">{Object}</code> params: 含有：</p>
     * <p><code class="codespan">{Object}</code> params.value: 轴当前值，如果 axis.type 为 'category' 时，其值为 axis.data 里的数值。如果 axis.type 为 <code class="codespan">'time'</code>，其值为时间戳。</p>
     * <p><code class="codespan">{Array.&lt;Object&gt;}</code> params.seriesData: 一个数组，是当前 axisPointer 最近的点的信息，每项内容为</p>
     * <p><code class="codespan">{string}</code> params.axisDimension: 轴的维度名，例如直角坐标系中是 <code class="codespan">'x'</code>、<code class="codespan">'y'</code>，极坐标系中是 <code class="codespan">'radius'</code>、<code class="codespan">'angle'</code>。</p>
     * <p><code class="codespan">{number}</code> params.axisIndex: 轴的 index，<code class="codespan">0</code>、<code class="codespan">1</code>、<code class="codespan">2</code>、...</p>
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
     * <p>每项内容还包括轴的信息：</p>
     * <pre><code class="lang-ts hljs typescript">{
     *     axisDim: <span class="hljs-string">'x'</span>, <span class="hljs-comment">// 'x', 'y', 'angle', 'radius', 'single'</span>
     *     axisId: <span class="hljs-string">'xxx'</span>,
     *     axisName: <span class="hljs-string">'xxx'</span>,
     *     axisIndex: <span class="hljs-number">3</span>,
     *     axisValue: <span class="hljs-number">121</span>, <span class="hljs-comment">// 当前 axisPointer 对应的 value。</span>
     *     axisValueLabel: <span class="hljs-string">'文本'</span>
     * }
     * </code></pre>
     * <p><strong>返回值：</strong></p>
     * <p>显示的 string。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">formatter: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">params</span>) </span>{
     *     <span class="hljs-comment">// 假设此轴的 type 为 'time'。</span>
     *     <span class="hljs-keyword">return</span> <span class="hljs-string">'some text'</span> + echarts.format.formatTime(params.value);
     * }
     * </code></pre>
     */
    private Object formatter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.margin">#angleAxis.axisPointer.label.margin</a>
     * <br/>默认值: 3
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>label 距离轴的距离。</p>
     */
    private Integer margin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.color">#angleAxis.axisPointer.label.color</a>
     * <br/>默认值: '#fff'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字的颜色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.fontStyle">#angleAxis.axisPointer.label.fontStyle</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.fontWeight">#angleAxis.axisPointer.label.fontWeight</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.fontFamily">#angleAxis.axisPointer.label.fontFamily</a>
     * <br/>默认值: 'sans-serif'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字的字体系列。</p>
     * <p>还可以是 'serif' , 'monospace', 'Arial', 'Courier New', 'Microsoft YaHei', ...</p>
     */
    private String fontFamily;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.fontSize">#angleAxis.axisPointer.label.fontSize</a>
     * <br/>默认值: 12
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字的字体大小。</p>
     */
    private Integer fontSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.lineHeight">#angleAxis.axisPointer.label.lineHeight</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.width">#angleAxis.axisPointer.label.width</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.height">#angleAxis.axisPointer.label.height</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示高度。</p>
     */
    private Integer height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.textBorderColor">#angleAxis.axisPointer.label.textBorderColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的描边颜色。</p>
     */
    private String textBorderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.textBorderWidth">#angleAxis.axisPointer.label.textBorderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的描边宽度。</p>
     */
    private Integer textBorderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.textBorderType">#angleAxis.axisPointer.label.textBorderType</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.textBorderDashOffset">#angleAxis.axisPointer.label.textBorderDashOffset</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.textShadowColor">#angleAxis.axisPointer.label.textShadowColor</a>
     * <br/>默认值: 'transparent'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的阴影颜色。</p>
     */
    private String textShadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.textShadowBlur">#angleAxis.axisPointer.label.textShadowBlur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影长度。</p>
     */
    private Integer textShadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.textShadowOffsetX">#angleAxis.axisPointer.label.textShadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 X 偏移。</p>
     */
    private Integer textShadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.textShadowOffsetY">#angleAxis.axisPointer.label.textShadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 Y 偏移。</p>
     */
    private Integer textShadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.overflow">#angleAxis.axisPointer.label.overflow</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.ellipsis">#angleAxis.axisPointer.label.ellipsis</a>
     * <br/>默认值: '...'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>在<code class="codespan">overflow</code>配置为<code class="codespan">'truncate'</code>的时候，可以通过该属性配置末尾显示的文本。</p>
     */
    private String ellipsis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.padding">#angleAxis.axisPointer.label.padding</a>
     * <br/>默认值: [5, 7, 5, 7]
     * <br/>js类型: ["string","Array"]
     * <br/>描述:
     * <p>axisPointer内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距。</p>
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
    private Object padding;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.backgroundColor">#angleAxis.axisPointer.label.backgroundColor</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文本标签的背景颜色，默认是和 <a href="https://echarts.apache.org/zh/option.html#xAxis.axisLine.lineStyle.color">axis.axisLine.lineStyle.color</a> 相同。</p>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.borderColor">#angleAxis.axisPointer.label.borderColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文本标签的边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.borderWidth">#angleAxis.axisPointer.label.borderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文本标签的边框宽度。</p>
     */
    private String borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.shadowBlur">#angleAxis.axisPointer.label.shadowBlur</a>
     * <br/>默认值: 3
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形阴影的模糊大小。该属性配合 <code class="codespan">shadowColor</code>,<code class="codespan">shadowOffsetX</code>, <code class="codespan">shadowOffsetY</code> 一起设置图形的阴影效果。</p>
     * <p>示例：</p>
     * <pre><code class="lang-ts hljs typescript">{
     *     shadowColor: <span class="hljs-string">'rgba(0, 0, 0, 0.5)'</span>,
     *     shadowBlur: <span class="hljs-number">10</span>
     * }
     * </code></pre>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.shadowColor">#angleAxis.axisPointer.label.shadowColor</a>
     * <br/>默认值: #aaa
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.shadowOffsetX">#angleAxis.axisPointer.label.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisPointer.label.shadowOffsetY">#angleAxis.axisPointer.label.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
}
