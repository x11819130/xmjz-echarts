package com.xmjz.echarts.nativebean.option.radarSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.areaStyle">https://echarts.apache.org/zh/option.html#series-radar.areaStyle</a>
 * <br/>序号: 14
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>区域填充样式。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class AreaStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.areaStyle.color">https://echarts.apache.org/zh/option.html#series-radar.areaStyle.color</a>
     * <br/>序号: 1
     * <br/>默认值: #000
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>填充的颜色。</p>
     * <blockquote>
     * <p>颜色可以使用 RGB 表示，比如 <code class="codespan">'rgb(128, 128, 128)'</code>，如果想要加上 alpha 通道表示不透明度，可以使用 RGBA，比如 <code class="codespan">'rgba(128, 128, 128, 0.5)'</code>，也可以使用十六进制格式，比如 <code class="codespan">'#ccc'</code>。除了纯色之外颜色也支持渐变色和纹理填充</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 线性渐变，前四个参数分别是 x0, y0, x2, y2, 范围从 0 - 1，相当于在图形包围盒中的百分比，如果 globalCoord 为 `true`，则该四个值是绝对的像素位置</span>
     * <span class="hljs-attr">color</span>: {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'linear'</span>,
     *     <span class="hljs-attr">x</span>: <span class="hljs-number">0</span>,
     *     <span class="hljs-attr">y</span>: <span class="hljs-number">0</span>,
     *     <span class="hljs-attr">x2</span>: <span class="hljs-number">0</span>,
     *     <span class="hljs-attr">y2</span>: <span class="hljs-number">1</span>,
     *     <span class="hljs-attr">colorStops</span>: [{
     *         <span class="hljs-attr">offset</span>: <span class="hljs-number">0</span>, <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span> <span class="hljs-comment">// 0% 处的颜色</span>
     *     }, {
     *         <span class="hljs-attr">offset</span>: <span class="hljs-number">1</span>, <span class="hljs-attr">color</span>: <span class="hljs-string">'blue'</span> <span class="hljs-comment">// 100% 处的颜色</span>
     *     }],
     *     <span class="hljs-attr">global</span>: <span class="hljs-literal">false</span> <span class="hljs-comment">// 缺省为 false</span>
     * }
     * <span class="hljs-comment">// 径向渐变，前三个参数分别是圆心 x, y 和半径，取值同线性渐变</span>
     * <span class="hljs-attr">color</span>: {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'radial'</span>,
     *     <span class="hljs-attr">x</span>: <span class="hljs-number">0.5</span>,
     *     <span class="hljs-attr">y</span>: <span class="hljs-number">0.5</span>,
     *     <span class="hljs-attr">r</span>: <span class="hljs-number">0.5</span>,
     *     <span class="hljs-attr">colorStops</span>: [{
     *         <span class="hljs-attr">offset</span>: <span class="hljs-number">0</span>, <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span> <span class="hljs-comment">// 0% 处的颜色</span>
     *     }, {
     *         <span class="hljs-attr">offset</span>: <span class="hljs-number">1</span>, <span class="hljs-attr">color</span>: <span class="hljs-string">'blue'</span> <span class="hljs-comment">// 100% 处的颜色</span>
     *     }],
     *     <span class="hljs-attr">global</span>: <span class="hljs-literal">false</span> <span class="hljs-comment">// 缺省为 false</span>
     * }
     * <span class="hljs-comment">// 纹理填充</span>
     * <span class="hljs-attr">color</span>: {
     *     <span class="hljs-attr">image</span>: imageDom, <span class="hljs-comment">// 支持为 HTMLImageElement, HTMLCanvasElement，不支持路径字符串</span>
     *     <span class="hljs-attr">repeat</span>: <span class="hljs-string">'repeat'</span> <span class="hljs-comment">// 是否平铺，可以是 'repeat-x', 'repeat-y', 'no-repeat'</span>
     * }
     * </code></pre>
     * </blockquote>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.areaStyle.shadowBlur">https://echarts.apache.org/zh/option.html#series-radar.areaStyle.shadowBlur</a>
     * <br/>序号: 2
     * <br/>默认值: 无
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.areaStyle.shadowColor">https://echarts.apache.org/zh/option.html#series-radar.areaStyle.shadowColor</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.areaStyle.shadowOffsetX">https://echarts.apache.org/zh/option.html#series-radar.areaStyle.shadowOffsetX</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.areaStyle.shadowOffsetY">https://echarts.apache.org/zh/option.html#series-radar.areaStyle.shadowOffsetY</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.areaStyle.opacity">https://echarts.apache.org/zh/option.html#series-radar.areaStyle.opacity</a>
     * <br/>序号: 6
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
}
