package com.xmjz.echarts.nativebean.option.sunburstSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle</a>
 * <br/>序号: 10
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>旭日图扇形块的样式。</p>
 * <p>可以在 <a href="#series-sunburst.itemStyle">series.itemStyle</a> 定义所有扇形块的样式，也可以在 <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> 定义每一层扇形块的样式，还可以在 <a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a> 定义每个扇形块单独的样式，这三者的优先级从低到高。也就是说，如果定义了 <a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a>，将会覆盖 <a href="#series-sunburst.itemStyle">series.itemStyle</a> 和 <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a>。</p>
 * <p><strong>优先级：<a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a> &gt; <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> &gt; <a href="#series-sunburst.itemStyle">series.itemStyle</a>。</strong></p>
 * <p>ECharts 中，通常使用 <em>emphasis</em> 表示鼠标移动到图形上后的高亮状态。对于旭日图而言，我们引入了另两种状态：<em>highlight</em> 表示由于高亮了某个扇形块引起的其他相关扇形块的高亮；<em>downplay</em> 表示除了 highlight 扇形块之外的被淡化的扇形块。参见 <a href="#series-sunburst.highlightPolicy">highlightPolicy</a>。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class ItemStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.color">https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.color</a>
     * <br/>序号: 1
     * <br/>默认值: 自适应
     * <br/>js类型: ["Color"]
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
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.borderColor">https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.borderColor</a>
     * <br/>序号: 2
     * <br/>默认值: white
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>图形的描边颜色。支持的颜色格式同 <code class="codespan">color</code>，不支持回调函数。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.borderWidth">https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.borderWidth</a>
     * <br/>序号: 3
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>描边线宽。为 0 时无描边。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.borderType">https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.borderType</a>
     * <br/>序号: 4
     * <br/>默认值: solid
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>柱条的描边类型，默认为实线，支持 <code class="codespan">'solid'</code>, <code class="codespan">'dashed'</code>, <code class="codespan">'dotted'</code>。</p>
     */
    private String borderType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.shadowBlur">https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.shadowBlur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.shadowColor">https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.shadowColor</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.shadowOffsetX">https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.shadowOffsetX</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.shadowOffsetY">https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.shadowOffsetY</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.opacity">https://echarts.apache.org/v4/zh/option.html#series-sunburst.itemStyle.opacity</a>
     * <br/>序号: 9
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
}
