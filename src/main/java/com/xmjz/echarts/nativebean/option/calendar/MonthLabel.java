package com.xmjz.echarts.nativebean.option.calendar;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel</a>
 * <br/>序号: 16
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>设置日历坐标中 月份轴的样式</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class MonthLabel implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.show">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.show</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否在普通状态下显示标签。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.align">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.align</a>
     * <br/>序号: 2
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.margin">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.margin</a>
     * <br/>序号: 3
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>月份标签与轴线之间的距离</p>
     */
    private Integer margin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.position">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.position</a>
     * <br/>序号: 4
     * <br/>默认值: start
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>月份的位置 在开头还是结尾。</p>
     * <p>可选：</p>
     * <ul>
     * <li>'start'</li>
     * <li>'end'</li>
     * </ul>
     */
    private String position;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.nameMap">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.nameMap</a>
     * <br/>序号: 5
     * <br/>默认值: en
     * <br/>js类型: ["string","Array"]
     * <br/>描述:
     * <p>月份显示的效果，默认为'en'
     * 可设置中英文以及自定义
     * 下标0为对应一月的文字显示</p>
     * <p>使用示例：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 快捷设置英文 [</span>
     *                 <span class="hljs-string">'Jan'</span>, <span class="hljs-string">'Feb'</span>, <span class="hljs-string">'Mar'</span>,
     *                 <span class="hljs-string">'Apr'</span>, <span class="hljs-string">'May'</span>, <span class="hljs-string">'Jun'</span>,
     *                 <span class="hljs-string">'Jul'</span>, <span class="hljs-string">'Aug'</span>, <span class="hljs-string">'Sep'</span>,
     *                 <span class="hljs-string">'Oct'</span>, <span class="hljs-string">'Nov'</span>, <span class="hljs-string">'Dec'</span>
     *             ],
     * <span class="hljs-attr">nameMap</span>: <span class="hljs-string">'en'</span>
     * <span class="hljs-comment">// 快捷设置中文 [</span>
     *                 <span class="hljs-string">'一月'</span>, <span class="hljs-string">'二月'</span>, <span class="hljs-string">'三月'</span>,
     *                 <span class="hljs-string">'四月'</span>, <span class="hljs-string">'五月'</span>, <span class="hljs-string">'六月'</span>,
     *                 <span class="hljs-string">'七月'</span>, <span class="hljs-string">'八月'</span>, <span class="hljs-string">'九月'</span>,
     *                 <span class="hljs-string">'十月'</span>, <span class="hljs-string">'十一月'</span>, <span class="hljs-string">'十二月'</span>
     *             ]
     * <span class="hljs-attr">nameMap</span>: <span class="hljs-string">'cn'</span>
     * <span class="hljs-comment">// 自定义设置： 中英文混杂 或者不显示</span>
     * <span class="hljs-attr">nameMap</span>: [
     *             <span class="hljs-string">'一月'</span>, <span class="hljs-string">'Feb'</span>, <span class="hljs-string">'三月'</span>,
     *             <span class="hljs-string">'四月'</span>, <span class="hljs-string">'May'</span>, <span class="hljs-string">'六月'</span>,
     *             <span class="hljs-string">'七月'</span>, <span class="hljs-string">'八月'</span>, <span class="hljs-string">''</span>,
     *             <span class="hljs-string">'十月'</span>, <span class="hljs-string">'Nov'</span>, <span class="hljs-string">'十二月'</span>
     *         ],
     *
     * <span class="hljs-attr">calendar</span>: [{
     *     <span class="hljs-attr">monthLabel</span>: {
     *         <span class="hljs-attr">nameMap</span>: <span class="hljs-string">'en'</span>
     *     }
     * }]
     * </code></pre>
     */
    private Object nameMap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.formatter">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.formatter</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>用来格式化月份文本，支持字符串模板和回调函数两种形式。</p>
     * <p>示例：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 使用字符串模板，例如：2017-02</span>
     * <span class="hljs-comment">/*
     *     模板变量{nameMap} 月份原本名称 eg：'Feb'
     *     模板变量{yyyy}   四位数年份 eg: 2017
     *     模板变量{yy}   后两位数年份 eg: 17
     *     模板变量{MM}   两位数月份 eg: 02
     *     模板变量{M}   一位数月份 eg: 2
     * <i>*</i>/</span>
     * <span class="hljs-attr">formatter</span>: <span class="hljs-string">'{yyyy}-{MM}'</span>
     * <span class="hljs-comment">// 使用回调函数</span>
     * <span class="hljs-comment">/*
     *     param.nameMap 月份原本名称 eg：'Feb'
     *     param.yyyy   四位数年份 eg: 2017
     *     param.yy   后两位数年份 eg: 17
     *     param.MM   两位数月份 eg: 02
     *     param.M   一位数月份 eg: 2
     * <i>*</i>/</span>
     * <span class="hljs-attr">formatter</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">param</span>) </span>{
     *     <span class="hljs-comment">// ...</span>
     *     <span class="hljs-keyword">return</span> param.MM;
     * }
     * </code></pre>
     */
    private Object formatter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.color">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.color</a>
     * <br/>序号: 7
     * <br/>默认值: #000
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字的颜色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.fontStyle">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.fontStyle</a>
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.fontWeight">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.fontWeight</a>
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.fontFamily">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.fontFamily</a>
     * <br/>序号: 10
     * <br/>默认值: sans-serif
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字的字体系列。</p>
     * <p>还可以是 'serif' , 'monospace', 'Arial', 'Courier New', 'Microsoft YaHei', ...</p>
     */
    private String fontFamily;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.fontSize">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.fontSize</a>
     * <br/>序号: 11
     * <br/>默认值: 12
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字的字体大小。</p>
     */
    private Integer fontSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.verticalAlign">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.verticalAlign</a>
     * <br/>序号: 12
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.lineHeight">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.lineHeight</a>
     * <br/>序号: 13
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.backgroundColor">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.backgroundColor</a>
     * <br/>序号: 14
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
     */
    private Object backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.borderColor">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.borderColor</a>
     * <br/>序号: 15
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.borderWidth">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.borderWidth</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块边框宽度。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.borderRadius">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.borderRadius</a>
     * <br/>序号: 17
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>文字块的圆角。</p>
     */
    private Object borderRadius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.padding">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.padding</a>
     * <br/>序号: 18
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.shadowColor">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.shadowColor</a>
     * <br/>序号: 19
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块的背景阴影颜色。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.shadowBlur">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.shadowBlur</a>
     * <br/>序号: 20
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影长度。</p>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.shadowOffsetX">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.shadowOffsetX</a>
     * <br/>序号: 21
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 X 偏移。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.shadowOffsetY">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.shadowOffsetY</a>
     * <br/>序号: 22
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 Y 偏移。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.width">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.width</a>
     * <br/>序号: 23
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>文字块的宽度。一般不用指定，不指定则自动是文字的宽度。在想做表格项或者使用图片（参见 <code class="codespan">backgroundColor</code>）时，可能会使用它。</p>
     * <p>注意，文字块的 <code class="codespan">width</code> 和 <code class="codespan">height</code> 指定的是内容高宽，不包含 <code class="codespan">padding</code>。</p>
     * <p><code class="codespan">width</code> 也可以是百分比字符串，如 <code class="codespan">'100%'</code>。表示的是所在文本块的 <code class="codespan">contentWidth</code>（即不包含文本块的 <code class="codespan">padding</code>）的百分之多少。之所以以 <code class="codespan">contentWidth</code> 做基数，因为每个文本片段只能基于 <code class="codespan">content box</code> 布局。如果以 <code class="codespan">outerWidth</code> 做基数，则百分比的计算在实用中不具有意义，可能会超出。</p>
     * <p>注意，如果不定义 <code class="codespan">rich</code> 属性，则不能指定 <code class="codespan">width</code> 和 <code class="codespan">height</code>。</p>
     */
    private Object width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.height">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.height</a>
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>文字块的高度。一般不用指定，不指定则自动是文字的高度。在使用图片（参见 <code class="codespan">backgroundColor</code>）时，可能会使用它。</p>
     * <p>注意，文字块的 <code class="codespan">width</code> 和 <code class="codespan">height</code> 指定的是内容高宽，不包含 <code class="codespan">padding</code>。</p>
     * <p>注意，如果不定义 <code class="codespan">rich</code> 属性，则不能指定 <code class="codespan">width</code> 和 <code class="codespan">height</code>。</p>
     */
    private Object height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.textBorderColor">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.textBorderColor</a>
     * <br/>序号: 25
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的描边颜色。</p>
     */
    private String textBorderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.textBorderWidth">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.textBorderWidth</a>
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的描边宽度。</p>
     */
    private Integer textBorderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.textShadowColor">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.textShadowColor</a>
     * <br/>序号: 27
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的阴影颜色。</p>
     */
    private String textShadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.textShadowBlur">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.textShadowBlur</a>
     * <br/>序号: 28
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影长度。</p>
     */
    private Integer textShadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.textShadowOffsetX">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.textShadowOffsetX</a>
     * <br/>序号: 29
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 X 偏移。</p>
     */
    private Integer textShadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.textShadowOffsetY">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.textShadowOffsetY</a>
     * <br/>序号: 30
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 Y 偏移。</p>
     */
    private Integer textShadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.rich">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel.rich</a>
     * <br/>序号: 31
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
