package com.xmjz.echarts.nativebean.option.legend;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle">https://echarts.apache.org/zh/option.html#legend.pageTextStyle</a>
 * <br/>序号: 44
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p><a href="#legend.type">legend.type</a> 为 <code class="codespan">'scroll'</code> 时有效。</p>
 * <p>图例页信息的文字样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class PageTextStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.color">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.color</a>
     * <br/>序号: 1
     * <br/>默认值: #333
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字的颜色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.fontStyle">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.fontStyle</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.fontWeight">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.fontWeight</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.fontFamily">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.fontFamily</a>
     * <br/>序号: 4
     * <br/>默认值: sans-serif
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字的字体系列。</p>
     * <p>还可以是 'serif' , 'monospace', 'Arial', 'Courier New', 'Microsoft YaHei', ...</p>
     */
    private String fontFamily;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.fontSize">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.fontSize</a>
     * <br/>序号: 5
     * <br/>默认值: 12
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字的字体大小。</p>
     */
    private Integer fontSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.lineHeight">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.lineHeight</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.width">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.width</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.height">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.height</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示高度。</p>
     */
    private Integer height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.textBorderColor">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.textBorderColor</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的描边颜色。</p>
     */
    private String textBorderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.textBorderWidth">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.textBorderWidth</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的描边宽度。</p>
     */
    private Integer textBorderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.textShadowColor">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.textShadowColor</a>
     * <br/>序号: 11
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的阴影颜色。</p>
     */
    private String textShadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.textShadowBlur">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.textShadowBlur</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影长度。</p>
     */
    private Integer textShadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.textShadowOffsetX">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.textShadowOffsetX</a>
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 X 偏移。</p>
     */
    private Integer textShadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.textShadowOffsetY">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.textShadowOffsetY</a>
     * <br/>序号: 14
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 Y 偏移。</p>
     */
    private Integer textShadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.overflow">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.overflow</a>
     * <br/>序号: 15
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.ellipsis">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.ellipsis</a>
     * <br/>序号: 16
     * <br/>默认值: ...
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>在<code class="codespan">overflow</code>配置为<code class="codespan">'truncate'</code>的时候，可以通过该属性配置末尾显示的文本。</p>
     */
    private String ellipsis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.pageTextStyle.lineOverflow">https://echarts.apache.org/zh/option.html#legend.pageTextStyle.lineOverflow</a>
     * <br/>序号: 17
     * <br/>默认值: none
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文本超出高度部分是否截断，配置<code class="codespan">height</code>时有效。</p>
     * <ul>
     * <li><code class="codespan">'truncate'</code> 在文本行数超出高度部分截断。</li>
     * </ul>
     */
    private String lineOverflow;
}
