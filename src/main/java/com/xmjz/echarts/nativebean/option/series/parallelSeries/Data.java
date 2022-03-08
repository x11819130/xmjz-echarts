package com.xmjz.echarts.nativebean.option.series.parallelSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.parallelSeries.data.Emphasis;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data">#series-parallel.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>例如 <a href="https://echarts.apache.org/zh/option.html#series-parallel.data">series-parallel.data</a> 中有如下数据：</p>
 * <pre><code class="lang-javascript hljs">[
 *     [<span class="hljs-number">1</span>,  <span class="hljs-number">55</span>,  <span class="hljs-number">9</span>,   <span class="hljs-number">56</span>,  <span class="hljs-number">0.46</span>,  <span class="hljs-number">18</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'良'</span>],
 *     [<span class="hljs-number">2</span>,  <span class="hljs-number">25</span>,  <span class="hljs-number">11</span>,  <span class="hljs-number">21</span>,  <span class="hljs-number">0.65</span>,  <span class="hljs-number">34</span>,  <span class="hljs-number">9</span>,  <span class="hljs-string">'优'</span>],
 *     [<span class="hljs-number">3</span>,  <span class="hljs-number">56</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">63</span>,  <span class="hljs-number">0.3</span>,   <span class="hljs-number">14</span>,  <span class="hljs-number">5</span>,  <span class="hljs-string">'良'</span>],
 *     [<span class="hljs-number">4</span>,  <span class="hljs-number">33</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">29</span>,  <span class="hljs-number">0.33</span>,  <span class="hljs-number">16</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'优'</span>],
 *     { <span class="hljs-comment">// 数据项也可以是 Object，从而里面能含有对线条的特殊设置。</span>
 *         <span class="hljs-attr">value</span>: [<span class="hljs-number">5</span>,  <span class="hljs-number">42</span>,  <span class="hljs-number">24</span>,  <span class="hljs-number">44</span>,  <span class="hljs-number">0.76</span>,  <span class="hljs-number">40</span>,  <span class="hljs-number">16</span>, <span class="hljs-string">'优'</span>]
 *         <span class="hljs-attr">lineStyle</span>: {...},
 *     }
 *     ...
 * ]
 * </code></pre>
 * <p>数据中，每一行是一个『数据项』，每一列属于一个『维度』。（例如上面数据每一列的含义分别是：『日期』,『AQI指数』, 『PM2.5』, 『PM10』, 『一氧化碳值』, 『二氧化氮值』, 『二氧化硫值』）。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Data extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.name">#series-parallel.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据项名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.value">#series-parallel.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>数据项值。</p>
     */
    private List<?> value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.lineStyle">#series-parallel.data.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>线条样式。</p>
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.color">#series-parallel.data.color</a>
     * <br/>默认值: "#000"
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>线的颜色。</p>
     * <blockquote>
     * <p>支持使用<code class="codespan">rgb(255,255,255)</code>，<code class="codespan">rgba(255,255,255,1)</code>，<code class="codespan">#fff</code>等方式设置为纯色，也支持设置为渐变色和纹理填充，具体见<a href="https://echarts.apache.org/zh/option.html#color">option.color</a></p>
     * </blockquote>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.width">#series-parallel.data.width</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>线宽。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.type">#series-parallel.data.type</a>
     * <br/>默认值: 'solid'
     * <br/>js类型: ["string","number","Array"]
     * <br/>描述:
     * <p>线的类型。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'solid'</code></li>
     * <li><code class="codespan">'dashed'</code></li>
     * <li><code class="codespan">'dotted'</code></li>
     * </ul>
     * <p>自 <code class="codespan">v5.0.0</code> 开始，也可以是 <code class="codespan">number</code> 或者 <code class="codespan">number</code> 数组，用以指定线条的 <a href="https://developer.mozilla.org/zh-CN/docs/Web/SVG/Attribute/stroke-dasharray" target="_blank">dash array</a>，配合
     * <code class="codespan">dashOffset</code>
     *  可实现更灵活的虚线效果。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">{
     *
     * <span class="hljs-keyword">type</span>: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>],
     *
     * dashOffset: <span class="hljs-number">5</span>
     * }
     * </code></pre>
     */
    private Object type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.dashOffset">#series-parallel.data.dashOffset</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>用于设置虚线的偏移量，可搭配
     * <code class="codespan">type</code>
     * 指定 dash array 实现灵活的虚线效果。</p>
     * <p>更多详情可以参考 MDN <a href="https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/lineDashOffset" target="_blank">lineDashOffset</a>。</p>
     */
    private Integer dashOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.cap">#series-parallel.data.cap</a>
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
    private String cap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.join">#series-parallel.data.join</a>
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
     * <code class="codespan">miterLimit</code>
     * 属性看到效果。</li>
     * </ul>
     * <p>默认值为 <code class="codespan">'bevel'</code>。 更多详情可以参考 MDN <a href="https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/lineJoin" target="_blank">lineJoin</a>。</p>
     */
    private String join;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.miterLimit">#series-parallel.data.miterLimit</a>
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>用于设置斜接面限制比例。只有当
     * <code class="codespan">join</code>
     * 为 <code class="codespan">miter</code> 时，
     * <code class="codespan">miterLimit</code>
     * 才有效。</p>
     * <p>默认值为 <code class="codespan">10</code>。负数、<code class="codespan">0</code>、<code class="codespan">Infinity</code> 和 <code class="codespan">NaN</code> 均会被忽略。</p>
     * <p>更多详情可以参考 MDN <a href="https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/miterLimit" target="_blank">miterLimit</a>。</p>
     */
    private Integer miterLimit;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.shadowBlur">#series-parallel.data.shadowBlur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.shadowColor">#series-parallel.data.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.shadowOffsetX">#series-parallel.data.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.shadowOffsetY">#series-parallel.data.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.opacity">#series-parallel.data.opacity</a>
     * <br/>默认值: 0.45
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data.emphasis">#series-parallel.data.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
}
