package com.xmjz.echarts.nativebean.option.toolbox.feature.dataZoom;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle">#toolbox.feature.dataZoom.brushStyle</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>刷选框样式</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class BrushStyle extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.color">#toolbox.feature.dataZoom.brushStyle.color</a>
     * <br/>默认值: 自适应
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>图形的颜色。</p>
     * <blockquote>
     * <p>支持使用<code class="codespan">rgb(255,255,255)</code>，<code class="codespan">rgba(255,255,255,1)</code>，<code class="codespan">#fff</code>等方式设置为纯色，也支持设置为渐变色和纹理填充，具体见<a href="https://echarts.apache.org/zh/option.html#color">option.color</a></p>
     * </blockquote>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.borderColor">#toolbox.feature.dataZoom.brushStyle.borderColor</a>
     * <br/>默认值: '#000'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>图形的描边颜色。支持的颜色格式同 <code class="codespan">color</code>，不支持回调函数。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.borderWidth">#toolbox.feature.dataZoom.brushStyle.borderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>描边线宽。为 0 时无描边。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.borderType">#toolbox.feature.dataZoom.brushStyle.borderType</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.borderDashOffset">#toolbox.feature.dataZoom.brushStyle.borderDashOffset</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.borderCap">#toolbox.feature.dataZoom.brushStyle.borderCap</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.borderJoin">#toolbox.feature.dataZoom.brushStyle.borderJoin</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.borderMiterLimit">#toolbox.feature.dataZoom.brushStyle.borderMiterLimit</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.shadowBlur">#toolbox.feature.dataZoom.brushStyle.shadowBlur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.shadowColor">#toolbox.feature.dataZoom.brushStyle.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.shadowOffsetX">#toolbox.feature.dataZoom.brushStyle.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.shadowOffsetY">#toolbox.feature.dataZoom.brushStyle.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle.opacity">#toolbox.feature.dataZoom.brushStyle.opacity</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
}