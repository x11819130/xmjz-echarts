package com.xmjz.echarts.nativebean.option.legend;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle">https://echarts.apache.org/zh/option.html#legend.textStyle</a>
 * <br/>序号: 23
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>图例的公用文本样式。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class TextStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.color">https://echarts.apache.org/zh/option.html#legend.textStyle.color</a>
     * <br/>序号: 1
     * <br/>默认值: #333
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字的颜色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.fontStyle">https://echarts.apache.org/zh/option.html#legend.textStyle.fontStyle</a>
     * <br/>序号: 2
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.fontWeight">https://echarts.apache.org/zh/option.html#legend.textStyle.fontWeight</a>
     * <br/>序号: 3
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.fontFamily">https://echarts.apache.org/zh/option.html#legend.textStyle.fontFamily</a>
     * <br/>序号: 4
     * <br/>默认值: sans-serif
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字的字体系列。</p>
     * <p>还可以是 'serif' , 'monospace', 'Arial', 'Courier New', 'Microsoft YaHei', ...</p>
     */
    private String fontFamily;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.fontSize">https://echarts.apache.org/zh/option.html#legend.textStyle.fontSize</a>
     * <br/>序号: 5
     * <br/>默认值: 12
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字的字体大小。</p>
     */
    private Integer fontSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.lineHeight">https://echarts.apache.org/zh/option.html#legend.textStyle.lineHeight</a>
     * <br/>序号: 6
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.backgroundColor">https://echarts.apache.org/zh/option.html#legend.textStyle.backgroundColor</a>
     * <br/>序号: 7
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.borderColor">https://echarts.apache.org/zh/option.html#legend.textStyle.borderColor</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.borderWidth">https://echarts.apache.org/zh/option.html#legend.textStyle.borderWidth</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块边框宽度。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.borderRadius">https://echarts.apache.org/zh/option.html#legend.textStyle.borderRadius</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>文字块的圆角。</p>
     */
    private Object borderRadius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.padding">https://echarts.apache.org/zh/option.html#legend.textStyle.padding</a>
     * <br/>序号: 11
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.shadowColor">https://echarts.apache.org/zh/option.html#legend.textStyle.shadowColor</a>
     * <br/>序号: 12
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块的背景阴影颜色。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.shadowBlur">https://echarts.apache.org/zh/option.html#legend.textStyle.shadowBlur</a>
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影长度。</p>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.shadowOffsetX">https://echarts.apache.org/zh/option.html#legend.textStyle.shadowOffsetX</a>
     * <br/>序号: 14
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 X 偏移。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.shadowOffsetY">https://echarts.apache.org/zh/option.html#legend.textStyle.shadowOffsetY</a>
     * <br/>序号: 15
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 Y 偏移。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.width">https://echarts.apache.org/zh/option.html#legend.textStyle.width</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.height">https://echarts.apache.org/zh/option.html#legend.textStyle.height</a>
     * <br/>序号: 17
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示高度。</p>
     */
    private Integer height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.textBorderColor">https://echarts.apache.org/zh/option.html#legend.textStyle.textBorderColor</a>
     * <br/>序号: 18
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的描边颜色。</p>
     */
    private String textBorderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.textBorderWidth">https://echarts.apache.org/zh/option.html#legend.textStyle.textBorderWidth</a>
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的描边宽度。</p>
     */
    private Integer textBorderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.textShadowColor">https://echarts.apache.org/zh/option.html#legend.textStyle.textShadowColor</a>
     * <br/>序号: 20
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的阴影颜色。</p>
     */
    private String textShadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.textShadowBlur">https://echarts.apache.org/zh/option.html#legend.textStyle.textShadowBlur</a>
     * <br/>序号: 21
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影长度。</p>
     */
    private Integer textShadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.textShadowOffsetX">https://echarts.apache.org/zh/option.html#legend.textStyle.textShadowOffsetX</a>
     * <br/>序号: 22
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 X 偏移。</p>
     */
    private Integer textShadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.textShadowOffsetY">https://echarts.apache.org/zh/option.html#legend.textStyle.textShadowOffsetY</a>
     * <br/>序号: 23
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 Y 偏移。</p>
     */
    private Integer textShadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.overflow">https://echarts.apache.org/zh/option.html#legend.textStyle.overflow</a>
     * <br/>序号: 24
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.ellipsis">https://echarts.apache.org/zh/option.html#legend.textStyle.ellipsis</a>
     * <br/>序号: 25
     * <br/>默认值: ...
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>在<code class="codespan">overflow</code>配置为<code class="codespan">'truncate'</code>的时候，可以通过该属性配置末尾显示的文本。</p>
     */
    private String ellipsis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.lineOverflow">https://echarts.apache.org/zh/option.html#legend.textStyle.lineOverflow</a>
     * <br/>序号: 26
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.textStyle.rich">https://echarts.apache.org/zh/option.html#legend.textStyle.rich</a>
     * <br/>序号: 27
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
