package com.xmjz.echarts.nativebean.option.series.barSeries;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle">#series-bar.backgroundStyle</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v4.7.0</code> 开始支持</p>
 * </blockquote>
 * <p>每一个柱条的背景样式。需要将 <a href="https://echarts.apache.org/zh/option.html#series-bar.showBackground">showBackground</a> 设置为 <code class="codespan">true</code> 时才有效。</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=bar-background&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class BackgroundStyle extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle.color">#series-bar.backgroundStyle.color</a>
     * <br/>默认值: 'rgba(180, 180, 180, 0.2)'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>柱条的颜色。 </p>
     * <blockquote>
     * <p>支持使用<code class="codespan">rgb(255,255,255)</code>，<code class="codespan">rgba(255,255,255,1)</code>，<code class="codespan">#fff</code>等方式设置为纯色，也支持设置为渐变色和纹理填充，具体见<a href="https://echarts.apache.org/zh/option.html#color">option.color</a></p>
     * </blockquote>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle.borderColor">#series-bar.backgroundStyle.borderColor</a>
     * <br/>默认值: '#000'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>柱条的描边颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle.borderWidth">#series-bar.backgroundStyle.borderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>柱条的描边宽度，默认不描边。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle.borderType">#series-bar.backgroundStyle.borderType</a>
     * <br/>默认值: 'solid'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>柱条的描边类型，默认为实线，支持 <code class="codespan">'dashed'</code>, <code class="codespan">'dotted'</code>。</p>
     */
    private String borderType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle.borderRadius">#series-bar.backgroundStyle.borderRadius</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>圆角半径，单位px，支持传入数组分别指定 4 个圆角半径。
     * 如:</p>
     * <pre><code class="hljs javascript">borderRadius: <span class="hljs-number">5</span>, <span class="hljs-comment">// 统一设置四个角的圆角大小</span>
     * <span class="hljs-attr">borderRadius</span>: [<span class="hljs-number">5</span>, <span class="hljs-number">5</span>, <span class="hljs-number">0</span>, <span class="hljs-number">0</span>] <span class="hljs-comment">//（顺时针左上，右上，右下，左下）</span>
     * </code></pre>
     */
    private Object borderRadius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle.shadowBlur">#series-bar.backgroundStyle.shadowBlur</a>
     * <br/>默认值: 无
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle.shadowColor">#series-bar.backgroundStyle.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle.shadowOffsetX">#series-bar.backgroundStyle.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle.shadowOffsetY">#series-bar.backgroundStyle.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle.opacity">#series-bar.backgroundStyle.opacity</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
}
