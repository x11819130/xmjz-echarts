package com.xmjz.echarts.nativebean.option.funnelSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.itemStyle">https://echarts.apache.org/zh/option.html#series-funnel.itemStyle</a>
 * <br/>序号: 15
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p> 图形样式。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class ItemStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-funnel.itemStyle.color
     * <br/>序号: 1
     * <br/>默认值: 自适应
     * <br/>js类型: ["Color","Function"]
     * <br/>描述:
     * <p>图形的颜色。 默认从全局调色盘 <a href="#color">option.color</a> 获取颜色 </p>
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
     * <p>支持使用回调函数。回调函数格式如下：</p>
     * <pre><code class="lang-js hljs javascript">(params: <span class="hljs-built_in">Object</span>) =&gt; Color
     * </code></pre>
     * <p>传入的是数据项 <code class="codespan">seriesIndex</code>, <code class="codespan">dataIndex</code>, <code class="codespan">data</code>, <code class="codespan">value</code> 等各个参数。</p>
     */
    private Object color;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-funnel.itemStyle.borderColor
     * <br/>序号: 2
     * <br/>默认值: #000
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>图形的描边颜色。支持的颜色格式同 <code class="codespan">color</code>，不支持回调函数。</p>
     */
    private String borderColor;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-funnel.itemStyle.borderWidth
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>描边线宽。为 0 时无描边。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-funnel.itemStyle.borderType
     * <br/>序号: 4
     * <br/>默认值: solid
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>柱条的描边类型，默认为实线，支持 <code class="codespan">'solid'</code>, <code class="codespan">'dashed'</code>, <code class="codespan">'dotted'</code>。</p>
     */
    private String borderType;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-funnel.itemStyle.shadowBlur
     * <br/>序号: 5
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-funnel.itemStyle.shadowColor
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-funnel.itemStyle.shadowOffsetX
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-funnel.itemStyle.shadowOffsetY
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-funnel.itemStyle.opacity
     * <br/>序号: 9
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-funnel.itemStyle.decal(Object%20|%20'none')
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>图形的贴花图案，在 <a href="#aria.enabled">aria.enabled</a> 与 <a href="#aria.decal.show">aria.decal.show</a> 都是 <code class="codespan">true</code> 的情况下才生效。</p>
     * <p>如果为 <code class="codespan">'none'</code> 表示不使用贴花图案。</p>
     */
    private Object decal;
}