package com.xmjz.echarts.nativebean.option.series.sunburstSeries.data;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.sunburstSeries.data.itemStyle.Decal;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle">#series-sunburst.data.itemStyle</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>旭日图扇形块的样式。</p>
 * <p>可以在 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.itemStyle">series.itemStyle</a> 定义所有扇形块的样式，也可以在 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> 定义每一层扇形块的样式，还可以在 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle">series.data.itemStyle</a> 定义每个扇形块单独的样式，这三者的优先级从低到高。也就是说，如果定义了 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle">series.data.itemStyle</a>，将会覆盖 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.itemStyle">series.itemStyle</a> 和 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.itemStyle">series.levels.itemStyle</a>。</p>
 * <p><strong>优先级：<a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle">series.data.itemStyle</a> &gt; <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> &gt; <a href="https://echarts.apache.org/zh/option.html#series-sunburst.itemStyle">series.itemStyle</a>。</strong></p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class ItemStyle extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.color">#series-sunburst.data.itemStyle.color</a>
     * <br/>默认值: 自适应
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>图形的颜色。 默认从全局调色盘 <a href="https://echarts.apache.org/zh/option.html#color">option.color</a> 获取颜色。</p>
     * <blockquote>
     * <p>支持使用<code class="codespan">rgb(255,255,255)</code>，<code class="codespan">rgba(255,255,255,1)</code>，<code class="codespan">#fff</code>等方式设置为纯色，也支持设置为渐变色和纹理填充，具体见<a href="https://echarts.apache.org/zh/option.html#color">option.color</a></p>
     * </blockquote>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.borderColor">#series-sunburst.data.itemStyle.borderColor</a>
     * <br/>默认值: 'white'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>图形的描边颜色。支持的颜色格式同 <code class="codespan">color</code>，不支持回调函数。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.borderWidth">#series-sunburst.data.itemStyle.borderWidth</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>描边线宽。为 0 时无描边。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.borderType">#series-sunburst.data.itemStyle.borderType</a>
     * <br/>默认值: 'solid'
     * <br/>js类型: ["string","number","Array"]
     * <br/>描述:
     * <p>描边类型。</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.borderDashOffset">#series-sunburst.data.itemStyle.borderDashOffset</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.borderCap">#series-sunburst.data.itemStyle.borderCap</a>
     * <br/>默认值: 'butt'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>用于指定线段末端的绘制方式，可以是：</p>
     * <ul>
     * <li><code class="codespan">'butt'</code>: 线段末端以方形结束。</li>
     * <li><code class="codespan">'round'</code>: 线段末端以圆形结束。</li>
     * <li><code class="codespan">'square'</code>: 线段末端以方形结束，但是增加了一个宽度和线段相同，高度是线段厚度一半的矩形区域。</li>
     * </ul>
     * <p>默认值为 <code class="codespan">'butt'</code>。 更多详情可以参考 MDN <a href="https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/lineCap" target="_blank">lineCap</a>。</p>
     */
    private String borderCap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.borderJoin">#series-sunburst.data.itemStyle.borderJoin</a>
     * <br/>默认值: 'bevel'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>用于设置2个长度不为0的相连部分（线段，圆弧，曲线）如何连接在一起的属性（长度为0的变形部分，其指定的末端和控制点在同一位置，会被忽略）。</p>
     * <p>可以是：</p>
     * <ul>
     * <li><code class="codespan">'bevel'</code>: 在相连部分的末端填充一个额外的以三角形为底的区域， 每个部分都有各自独立的矩形拐角。</li>
     * <li><code class="codespan">'round'</code>: 通过填充一个额外的，圆心在相连部分末端的扇形，绘制拐角的形状。 圆角的半径是线段的宽度。</li>
     * <li><code class="codespan">'miter'</code>: 通过延伸相连部分的外边缘，使其相交于一点，形成一个额外的菱形区域。这个设置可以通过
     * <code class="codespan">borderMiterLimit</code>
     * 属性看到效果。</li>
     * </ul>
     * <p>默认值为 <code class="codespan">'bevel'</code>。 更多详情可以参考 MDN <a href="https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/lineJoin" target="_blank">lineJoin</a>。</p>
     */
    private String borderJoin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.borderMiterLimit">#series-sunburst.data.itemStyle.borderMiterLimit</a>
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>用于设置斜接面限制比例。只有当
     * <code class="codespan">borderJoin</code>
     * 为 <code class="codespan">miter</code> 时，
     * <code class="codespan">borderMiterLimit</code>
     * 才有效。</p>
     * <p>默认值为 <code class="codespan">10</code>。负数、<code class="codespan">0</code>、<code class="codespan">Infinity</code> 和 <code class="codespan">NaN</code> 均会被忽略。</p>
     * <p>更多详情可以参考 MDN <a href="https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/miterLimit" target="_blank">miterLimit</a>。</p>
     */
    private Integer borderMiterLimit;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.shadowBlur">#series-sunburst.data.itemStyle.shadowBlur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.shadowColor">#series-sunburst.data.itemStyle.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.shadowOffsetX">#series-sunburst.data.itemStyle.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.shadowOffsetY">#series-sunburst.data.itemStyle.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.opacity">#series-sunburst.data.itemStyle.opacity</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.decal">#series-sunburst.data.itemStyle.decal</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形的贴花图案，在 <a href="https://echarts.apache.org/zh/option.html#aria.enabled">aria.enabled</a> 与 <a href="https://echarts.apache.org/zh/option.html#aria.decal.show">aria.decal.show</a> 都是 <code class="codespan">true</code> 的情况下才生效。</p>
     * <p>如果为 <code class="codespan">'none'</code> 表示不使用贴花图案。</p>
     */
    private Decal decal;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle.borderRadius">#series-sunburst.data.itemStyle.borderRadius</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Array"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>用于指定旭日图扇形区块的内外圆角半径，支持设置固定数值或者相对于扇形区块的半径的百分比值。</p>
     * <p>从 <code class="codespan">v5.3.0</code> 开始，支持分别配置从内到外顺时针方向四个角的圆角半径，百分比值从相对于内外扇形的半径更改为相对于内外扇形的半径差。</p>
     * <p>例如：</p>
     * <p><code class="codespan">v5.3.0</code> 之前</p>
     * <ul>
     * <li><code class="codespan">borderRadius: 10</code>：表示内圆角半径和外圆角半径都是 <code class="codespan">10px</code>。</li>
     * <li><code class="codespan">borderRadius: '20%'</code>：表示内圆角半径和外圆角半径都是扇形区块半径的 <code class="codespan">20%</code>。</li>
     * <li><code class="codespan">borderRadius: [10, 20]</code>：表示为环形图时，内圆角半径是 <code class="codespan">10px</code>、外圆角半径是 <code class="codespan">20px</code>。</li>
     * <li><code class="codespan">borderRadius: ['20%', '50%']</code>：表示为环形图时，内圆角半径是内圆半径的 <code class="codespan">20%</code>、外圆角半径是外圆半径的 <code class="codespan">50%</code>。</li>
     * </ul>
     * <p><code class="codespan">v5.3.0</code> 之后</p>
     * <ul>
     * <li><code class="codespan">borderRadius: 10</code>：表示内圆角半径和外圆角半径都是 <code class="codespan">10px</code>。</li>
     * <li><code class="codespan">borderRadius: '20%'</code>：表示内圆角半径和外圆角半径都是扇形区块半径的 <code class="codespan">20%</code>。</li>
     * <li><code class="codespan">borderRadius: [10, 20]</code>：表示为环形图时，内圆角半径是 <code class="codespan">10px</code>、外圆角半径是 <code class="codespan">20px</code>。</li>
     * <li><code class="codespan">borderRadius: ['20%', '50%']</code>：表示为环形图时，内圆角半径是内外圆半径差的 <code class="codespan">20%</code>、外圆角半径是内外圆半径差的 <code class="codespan">50%</code>。</li>
     * <li><code class="codespan">borderRadius: [5, 10, 15, 20]</code>：表示内圆角半径分别为 <code class="codespan">5px</code> 和 <code class="codespan">10px</code>，外圆角半径分别为 <code class="codespan">15px</code> 和 <code class="codespan">20px</code>。</li>
     * </ul>
     */
    private Object borderRadius;
}
