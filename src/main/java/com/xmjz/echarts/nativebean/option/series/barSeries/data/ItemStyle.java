package com.xmjz.echarts.nativebean.option.series.barSeries.data;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.barSeries.data.itemStyle.Decal;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle">#series-bar.data.itemStyle</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>单个数据的图形样式设置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class ItemStyle extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle.color">#series-bar.data.itemStyle.color</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>柱条的颜色。 </p>
     * <blockquote>
     * <p>支持使用<code class="codespan">rgb(255,255,255)</code>，<code class="codespan">rgba(255,255,255,1)</code>，<code class="codespan">#fff</code>等方式设置为纯色，也支持设置为渐变色和纹理填充，具体见<a href="https://echarts.apache.org/zh/option.html#color">option.color</a></p>
     * </blockquote>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle.borderColor">#series-bar.data.itemStyle.borderColor</a>
     * <br/>默认值: '#000'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>柱条的描边颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle.borderWidth">#series-bar.data.itemStyle.borderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>柱条的描边宽度，默认不描边。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle.borderType">#series-bar.data.itemStyle.borderType</a>
     * <br/>默认值: 'solid'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>柱条的描边类型，默认为实线，支持 <code class="codespan">'dashed'</code>, <code class="codespan">'dotted'</code>。</p>
     */
    private String borderType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle.borderRadius">#series-bar.data.itemStyle.borderRadius</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle.shadowBlur">#series-bar.data.itemStyle.shadowBlur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle.shadowColor">#series-bar.data.itemStyle.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle.shadowOffsetX">#series-bar.data.itemStyle.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle.shadowOffsetY">#series-bar.data.itemStyle.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle.opacity">#series-bar.data.itemStyle.opacity</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data.itemStyle.decal">#series-bar.data.itemStyle.decal</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形的贴花图案，在 <a href="https://echarts.apache.org/zh/option.html#aria.enabled">aria.enabled</a> 与 <a href="https://echarts.apache.org/zh/option.html#aria.decal.show">aria.decal.show</a> 都是 <code class="codespan">true</code> 的情况下才生效。</p>
     * <p>如果为 <code class="codespan">'none'</code> 表示不使用贴花图案。</p>
     */
    private Decal decal;
}
