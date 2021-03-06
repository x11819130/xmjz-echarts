package com.xmjz.echarts.nativebean.option.axisPointer;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label">https://echarts.apache.org/zh/option.html#axisPointer.label</a>
 * <br/>序号: 6
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>坐标轴指示器的文本标签。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Label implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.show">https://echarts.apache.org/zh/option.html#axisPointer.label.show</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示文本标签。如果 <a href="#tooltip.axisPointer.type">tooltip.axisPointer.type</a> 设置为 <code class="codespan">'cross'</code> 则默认显示标签，否则默认不显示。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.precision">https://echarts.apache.org/zh/option.html#axisPointer.label.precision</a>
     * <br/>序号: 2
     * <br/>默认值: auto
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>文本标签中数值的小数点精度。默认根据当前轴的值自动判断。也可以指定如 <code class="codespan">2</code> 表示保留两位小数。</p>
     */
    private Object precision;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.formatter">https://echarts.apache.org/zh/option.html#axisPointer.label.formatter</a>
     * <br/>序号: 3
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
     * <p>每项内容还包括轴的信息：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">axisDim</span>: <span class="hljs-string">'x'</span>, <span class="hljs-comment">// 'x', 'y', 'angle', 'radius', 'single'</span>
     *     <span class="hljs-attr">axisId</span>: <span class="hljs-string">'xxx'</span>,
     *     <span class="hljs-attr">axisName</span>: <span class="hljs-string">'xxx'</span>,
     *     <span class="hljs-attr">axisIndex</span>: <span class="hljs-number">3</span>,
     *     <span class="hljs-attr">axisValue</span>: <span class="hljs-number">121</span>, <span class="hljs-comment">// 当前 axisPointer 对应的 value。</span>
     *     <span class="hljs-attr">axisValueLabel</span>: <span class="hljs-string">'文本'</span>
     * }
     * </code></pre>
     * <p><strong>返回值：</strong></p>
     * <p>显示的 string。</p>
     * <p>例如：</p>
     * <pre><code class="lang-js hljs javascript">formatter: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">params</span>) </span>{
     *     <span class="hljs-comment">// 假设此轴的 type 为 'time'。</span>
     *     <span class="hljs-keyword">return</span> <span class="hljs-string">'some text'</span> + echarts.format.formatTime(params.value);
     * }
     * </code></pre>
     */
    private Object formatter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.margin">https://echarts.apache.org/zh/option.html#axisPointer.label.margin</a>
     * <br/>序号: 4
     * <br/>默认值: 3
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>label 距离轴的距离。</p>
     */
    private Boolean margin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.color">https://echarts.apache.org/zh/option.html#axisPointer.label.color</a>
     * <br/>序号: 5
     * <br/>默认值: #fff
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字的颜色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.fontStyle">https://echarts.apache.org/zh/option.html#axisPointer.label.fontStyle</a>
     * <br/>序号: 6
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.fontWeight">https://echarts.apache.org/zh/option.html#axisPointer.label.fontWeight</a>
     * <br/>序号: 7
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.fontFamily">https://echarts.apache.org/zh/option.html#axisPointer.label.fontFamily</a>
     * <br/>序号: 8
     * <br/>默认值: sans-serif
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字的字体系列。</p>
     * <p>还可以是 'serif' , 'monospace', 'Arial', 'Courier New', 'Microsoft YaHei', ...</p>
     */
    private String fontFamily;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.fontSize">https://echarts.apache.org/zh/option.html#axisPointer.label.fontSize</a>
     * <br/>序号: 9
     * <br/>默认值: 12
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字的字体大小。</p>
     */
    private Integer fontSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.lineHeight">https://echarts.apache.org/zh/option.html#axisPointer.label.lineHeight</a>
     * <br/>序号: 10
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.width">https://echarts.apache.org/zh/option.html#axisPointer.label.width</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.height">https://echarts.apache.org/zh/option.html#axisPointer.label.height</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示高度。</p>
     */
    private Integer height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.textBorderColor">https://echarts.apache.org/zh/option.html#axisPointer.label.textBorderColor</a>
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的描边颜色。</p>
     */
    private String textBorderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.textBorderWidth">https://echarts.apache.org/zh/option.html#axisPointer.label.textBorderWidth</a>
     * <br/>序号: 14
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的描边宽度。</p>
     */
    private Integer textBorderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.textShadowColor">https://echarts.apache.org/zh/option.html#axisPointer.label.textShadowColor</a>
     * <br/>序号: 15
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的阴影颜色。</p>
     */
    private String textShadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.textShadowBlur">https://echarts.apache.org/zh/option.html#axisPointer.label.textShadowBlur</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影长度。</p>
     */
    private Integer textShadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.textShadowOffsetX">https://echarts.apache.org/zh/option.html#axisPointer.label.textShadowOffsetX</a>
     * <br/>序号: 17
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 X 偏移。</p>
     */
    private Integer textShadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.textShadowOffsetY">https://echarts.apache.org/zh/option.html#axisPointer.label.textShadowOffsetY</a>
     * <br/>序号: 18
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 Y 偏移。</p>
     */
    private Integer textShadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.overflow">https://echarts.apache.org/zh/option.html#axisPointer.label.overflow</a>
     * <br/>序号: 19
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.ellipsis">https://echarts.apache.org/zh/option.html#axisPointer.label.ellipsis</a>
     * <br/>序号: 20
     * <br/>默认值: ...
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>在<code class="codespan">overflow</code>配置为<code class="codespan">'truncate'</code>的时候，可以通过该属性配置末尾显示的文本。</p>
     */
    private String ellipsis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.lineOverflow">https://echarts.apache.org/zh/option.html#axisPointer.label.lineOverflow</a>
     * <br/>序号: 21
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.padding">https://echarts.apache.org/zh/option.html#axisPointer.label.padding</a>
     * <br/>序号: 22
     * <br/>默认值: [5,7,5,7]
     * <br/>js类型: ["string","Array"]
     * <br/>描述:
     * <p>axisPointer内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距。</p>
     * <p>使用示例：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 设置内边距为 5</span>
     * <span class="hljs-attr">padding</span>: <span class="hljs-number">5</span>
     * <span class="hljs-comment">// 设置上下的内边距为 5，左右的内边距为 10</span>
     * <span class="hljs-attr">padding</span>: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>]
     * <span class="hljs-comment">// 分别设置四个方向的内边距</span>
     * <span class="hljs-attr">padding</span>: [
     *     <span class="hljs-number">5</span>,  <span class="hljs-comment">// 上</span>
     *     <span class="hljs-number">10</span>, <span class="hljs-comment">// 右</span>
     *     <span class="hljs-number">5</span>,  <span class="hljs-comment">// 下</span>
     *     <span class="hljs-number">10</span>, <span class="hljs-comment">// 左</span>
     * ]
     * </code></pre>
     */
    private Object padding;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.backgroundColor">https://echarts.apache.org/zh/option.html#axisPointer.label.backgroundColor</a>
     * <br/>序号: 23
     * <br/>默认值: auto
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文本标签的背景颜色，默认是和 <a href="#xAxis.axisLine.lineStyle.color">axis.axisLine.lineStyle.color</a> 相同。</p>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.borderColor">https://echarts.apache.org/zh/option.html#axisPointer.label.borderColor</a>
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文本标签的边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.borderWidth">https://echarts.apache.org/zh/option.html#axisPointer.label.borderWidth</a>
     * <br/>序号: 25
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文本标签的边框宽度。</p>
     */
    private String borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.shadowBlur">https://echarts.apache.org/zh/option.html#axisPointer.label.shadowBlur</a>
     * <br/>序号: 26
     * <br/>默认值: 3
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形阴影的模糊大小。该属性配合 <code class="codespan">shadowColor</code>,<code class="codespan">shadowOffsetX</code>, <code class="codespan">shadowOffsetY</code> 一起设置图形的阴影效果。</p>
     * <p>示例：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">shadowColor</span>: <span class="hljs-string">'rgba(0, 0, 0, 0.5)'</span>,
     *     <span class="hljs-attr">shadowBlur</span>: <span class="hljs-number">10</span>
     * }
     * </code></pre>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.shadowColor">https://echarts.apache.org/zh/option.html#axisPointer.label.shadowColor</a>
     * <br/>序号: 27
     * <br/>默认值: #aaa
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.shadowOffsetX">https://echarts.apache.org/zh/option.html#axisPointer.label.shadowOffsetX</a>
     * <br/>序号: 28
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.label.shadowOffsetY">https://echarts.apache.org/zh/option.html#axisPointer.label.shadowOffsetY</a>
     * <br/>序号: 29
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
}
