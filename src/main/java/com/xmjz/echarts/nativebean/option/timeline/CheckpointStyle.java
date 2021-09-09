package com.xmjz.echarts.nativebean.option.timeline;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>『当前项』（<code class="codespan">checkpoint</code>）的图形样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class CheckpointStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.symbol">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.symbol</a>
     * <br/>默认值: circle
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>timeline.checkpointStyle 标记的图形。</p>
     * <p>ECharts 提供的标记类型包括</p>
     * <p><code class="codespan">'circle'</code>, <code class="codespan">'rect'</code>, <code class="codespan">'roundRect'</code>, <code class="codespan">'triangle'</code>, <code class="codespan">'diamond'</code>, <code class="codespan">'pin'</code>, <code class="codespan">'arrow'</code>, <code class="codespan">'none'</code></p>
     * <p>可以通过 <code class="codespan">'image://url'</code> 设置为图片，其中 URL 为图片的链接，或者 <code class="codespan">dataURI</code>。</p>
     * <p>URL 为图片链接例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://http://xxx.xxx.xxx/a/b.png'</span>
     * </code></pre><p>URL 为 <code class="codespan">dataURI</code> 例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://data:image/gif;base64,R0lGODlhEAAQAMQAAORHHOVSKudfOulrSOp3WOyDZu6QdvCchPGolfO0o/XBs/fNwfjZ0frl3/zy7////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAkAABAALAAAAAAQABAAAAVVICSOZGlCQAosJ6mu7fiyZeKqNKToQGDsM8hBADgUXoGAiqhSvp5QAnQKGIgUhwFUYLCVDFCrKUE1lBavAViFIDlTImbKC5Gm2hB0SlBCBMQiB0UjIQA7'</span>
     * </code></pre><p>可以通过 <code class="codespan">'path://'</code> 将图标设置为任意的矢量路径。这种方式相比于使用图片的方式，不用担心因为缩放而产生锯齿或模糊，而且可以设置为任意颜色。路径图形会自适应调整为合适的大小。路径的格式参见 <a href="http://www.w3.org/TR/SVG/paths.html#PathData" target="_blank">SVG PathData</a>。可以从 Adobe Illustrator 等工具编辑导出。</p>
     * <p>例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'path://M30.9,53.2C16.8,53.2,5.3,41.7,5.3,27.6S16.8,2,30.9,2C45,2,56.4,13.5,56.4,27.6S45,53.2,30.9,53.2z M30.9,3.5C17.6,3.5,6.8,14.4,6.8,27.6c0,13.3,10.8,24.1,24.101,24.1C44.2,51.7,55,40.9,55,27.6C54.9,14.4,44.1,3.5,30.9,3.5z M36.9,35.8c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H36c0.5,0,0.9,0.4,0.9,1V35.8z M27.8,35.8 c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H27c0.5,0,0.9,0.4,0.9,1L27.8,35.8L27.8,35.8z'</span>
     * </code></pre>
     */
    private String symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.symbolSize">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.symbolSize</a>
     * <br/>默认值: 13
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>timeline.checkpointStyle 标记的大小，可以设置成诸如 <code class="codespan">10</code> 这样单一的数字，也可以用数组分开表示宽和高，例如 <code class="codespan">[20, 10]</code> 表示标记宽为<code class="codespan">20</code>，高为<code class="codespan">10</code>。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.symbolRotate">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.symbolRotate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>timeline.checkpointStyle 标记的旋转角度（而非弧度）。正值表示逆时针旋转。注意在 <code class="codespan">markLine</code> 中当 <code class="codespan">symbol</code> 为 <code class="codespan">'arrow'</code> 时会忽略 <code class="codespan">symbolRotate</code> 强制设置为切线的角度。</p>
     */
    private Integer symbolRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.symbolKeepAspect">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.symbolKeepAspect</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>如果 <code class="codespan">symbol</code> 是 <code class="codespan">path://</code> 的形式，是否在缩放时保持该图形的长宽比。</p>
     */
    private Boolean symbolKeepAspect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.symbolOffset">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.symbolOffset</a>
     * <br/>默认值: [0,0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>timeline.checkpointStyle 标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。</p>
     * <p>例如 <code class="codespan">[0, '-50%']</code> 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。</p>
     */
    private List<?> symbolOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.color">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.color</a>
     * <br/>默认值: #316bf3
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>图形的颜色。</p>
     * <blockquote>
     * <p>支持使用<code class="codespan">rgb(255,255,255)</code>，<code class="codespan">rgba(255,255,255,1)</code>，<code class="codespan">#fff</code>等方式设置为纯色，也支持设置为渐变色和纹理填充，具体见<a href="#color">option.color</a></p>
     * </blockquote>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderColor">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderColor</a>
     * <br/>默认值: #fff
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>图形的描边颜色。支持的颜色格式同 <code class="codespan">color</code>，不支持回调函数。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderWidth">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderWidth</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>描边线宽。为 0 时无描边。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderType">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderType</a>
     * <br/>默认值: solid
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
     * <pre><code class="lang-js hljs javascript">{
     *
     * <span class="hljs-attr">borderType</span>: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>],
     *
     * <span class="hljs-attr">borderDashOffset</span>: <span class="hljs-number">5</span>
     * }
     * </code></pre>
     */
    private Object borderType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderDashOffset">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderDashOffset</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderCap">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderCap</a>
     * <br/>默认值: butt
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderJoin">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderJoin</a>
     * <br/>默认值: bevel
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderMiterLimit">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.borderMiterLimit</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.shadowBlur">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.shadowBlur</a>
     * <br/>默认值: 2
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.shadowColor">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.shadowColor</a>
     * <br/>默认值: rgba(0, 0, 0, 0.3)
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.shadowOffsetX">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.shadowOffsetX</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.shadowOffsetY">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.shadowOffsetY</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.opacity">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.opacity</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.animation">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.animation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p><code class="codespan">timeline</code>组件中『当前项』（<code class="codespan">checkpoint</code>）在 <code class="codespan">timeline</code> 播放切换中的移动，是否有动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.animationDuration">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.animationDuration</a>
     * <br/>默认值: 300
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><code class="codespan">timeline</code>组件中『当前项』（<code class="codespan">checkpoint</code>）的动画时长。</p>
     */
    private Integer animationDuration;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.animationEasing">https://echarts.apache.org/zh/option.html#timeline.checkpointStyle.animationEasing</a>
     * <br/>默认值: quinticInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p><code class="codespan">timeline</code>组件中『当前项』（<code class="codespan">checkpoint</code>）的动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/view.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
}
