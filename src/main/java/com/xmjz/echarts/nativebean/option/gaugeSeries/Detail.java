package com.xmjz.echarts.nativebean.option.gaugeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail">https://echarts.apache.org/zh/option.html#series-gauge.detail</a>
 * <br/>序号: 26
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>仪表盘详情，用于显示数据。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Detail implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.show">https://echarts.apache.org/zh/option.html#series-gauge.detail.show</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示详情。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.color">https://echarts.apache.org/zh/option.html#series-gauge.detail.color</a>
     * <br/>序号: 2
     * <br/>默认值: #464646
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文本颜色，默认取数值所在的<a href="#series-gauge.axisLine.lineStyle.color">区间的颜色</a>。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.fontStyle">https://echarts.apache.org/zh/option.html#series-gauge.detail.fontStyle</a>
     * <br/>序号: 3
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.fontWeight">https://echarts.apache.org/zh/option.html#series-gauge.detail.fontWeight</a>
     * <br/>序号: 4
     * <br/>默认值: bold
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.fontFamily">https://echarts.apache.org/zh/option.html#series-gauge.detail.fontFamily</a>
     * <br/>序号: 5
     * <br/>默认值: sans-serif
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字的字体系列。</p>
     * <p>还可以是 'serif' , 'monospace', 'Arial', 'Courier New', 'Microsoft YaHei', ...</p>
     */
    private String fontFamily;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.fontSize">https://echarts.apache.org/zh/option.html#series-gauge.detail.fontSize</a>
     * <br/>序号: 6
     * <br/>默认值: 30
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字的字体大小。</p>
     */
    private Integer fontSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.lineHeight">https://echarts.apache.org/zh/option.html#series-gauge.detail.lineHeight</a>
     * <br/>序号: 7
     * <br/>默认值: 30
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.backgroundColor">https://echarts.apache.org/zh/option.html#series-gauge.detail.backgroundColor</a>
     * <br/>序号: 8
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>详情背景色。</p>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.borderColor">https://echarts.apache.org/zh/option.html#series-gauge.detail.borderColor</a>
     * <br/>序号: 9
     * <br/>默认值: #ccc
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>详情边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.borderWidth">https://echarts.apache.org/zh/option.html#series-gauge.detail.borderWidth</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>详情边框宽度。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.borderRadius">https://echarts.apache.org/zh/option.html#series-gauge.detail.borderRadius</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>文字块的圆角。</p>
     */
    private Object borderRadius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.padding">https://echarts.apache.org/zh/option.html#series-gauge.detail.padding</a>
     * <br/>序号: 12
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.shadowColor">https://echarts.apache.org/zh/option.html#series-gauge.detail.shadowColor</a>
     * <br/>序号: 13
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块的背景阴影颜色。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.shadowBlur">https://echarts.apache.org/zh/option.html#series-gauge.detail.shadowBlur</a>
     * <br/>序号: 14
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影长度。</p>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.shadowOffsetX">https://echarts.apache.org/zh/option.html#series-gauge.detail.shadowOffsetX</a>
     * <br/>序号: 15
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 X 偏移。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.shadowOffsetY">https://echarts.apache.org/zh/option.html#series-gauge.detail.shadowOffsetY</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 Y 偏移。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.width">https://echarts.apache.org/zh/option.html#series-gauge.detail.width</a>
     * <br/>序号: 17
     * <br/>默认值: 100
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>详情宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.height">https://echarts.apache.org/zh/option.html#series-gauge.detail.height</a>
     * <br/>序号: 18
     * <br/>默认值: 40
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>详情高度。</p>
     */
    private Integer height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.textBorderColor">https://echarts.apache.org/zh/option.html#series-gauge.detail.textBorderColor</a>
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的描边颜色。</p>
     */
    private String textBorderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.textBorderWidth">https://echarts.apache.org/zh/option.html#series-gauge.detail.textBorderWidth</a>
     * <br/>序号: 20
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的描边宽度。</p>
     */
    private Integer textBorderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.textShadowColor">https://echarts.apache.org/zh/option.html#series-gauge.detail.textShadowColor</a>
     * <br/>序号: 21
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的阴影颜色。</p>
     */
    private String textShadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.textShadowBlur">https://echarts.apache.org/zh/option.html#series-gauge.detail.textShadowBlur</a>
     * <br/>序号: 22
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影长度。</p>
     */
    private Integer textShadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.textShadowOffsetX">https://echarts.apache.org/zh/option.html#series-gauge.detail.textShadowOffsetX</a>
     * <br/>序号: 23
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 X 偏移。</p>
     */
    private Integer textShadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.textShadowOffsetY">https://echarts.apache.org/zh/option.html#series-gauge.detail.textShadowOffsetY</a>
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 Y 偏移。</p>
     */
    private Integer textShadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.overflow">https://echarts.apache.org/zh/option.html#series-gauge.detail.overflow</a>
     * <br/>序号: 25
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.ellipsis">https://echarts.apache.org/zh/option.html#series-gauge.detail.ellipsis</a>
     * <br/>序号: 26
     * <br/>默认值: ...
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>在<code class="codespan">overflow</code>配置为<code class="codespan">'truncate'</code>的时候，可以通过该属性配置末尾显示的文本。</p>
     */
    private String ellipsis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.lineOverflow">https://echarts.apache.org/zh/option.html#series-gauge.detail.lineOverflow</a>
     * <br/>序号: 27
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.rich">https://echarts.apache.org/zh/option.html#series-gauge.detail.rich</a>
     * <br/>序号: 28
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
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.valueAnimation">https://echarts.apache.org/zh/option.html#series-gauge.detail.valueAnimation</a>
     * <br/>序号: 29
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>是否开启标签的数字动画。</p>
     */
    private Boolean valueAnimation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.offsetCenter">https://echarts.apache.org/zh/option.html#series-gauge.detail.offsetCenter</a>
     * <br/>序号: 30
     * <br/>默认值: [0,"40%"]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>相对于仪表盘中心的偏移位置，数组第一项是水平方向的偏移，第二项是垂直方向的偏移。可以是绝对的数值，也可以是相对于仪表盘半径的百分比。</p>
     */
    private List<Object> offsetCenter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail.formatter">https://echarts.apache.org/zh/option.html#series-gauge.detail.formatter</a>
     * <br/>序号: 31
     * <br/>默认值: 无
     * <br/>js类型: ["Function","string"]
     * <br/>描述:
     * <p>格式化函数或者字符串</p>
     * <pre><code class="lang-js hljs javascript">formatter: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value</span>) </span>{
     *     <span class="hljs-keyword">return</span> value.toFixed(<span class="hljs-number">0</span>);
     * }
     * </code></pre>
     */
    private Object formatter;
}
