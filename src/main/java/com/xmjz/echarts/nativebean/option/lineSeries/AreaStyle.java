package com.xmjz.echarts.nativebean.option.lineSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.areaStyle">https://echarts.apache.org/zh/option.html#series-line.areaStyle</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>区域填充样式。设置后显示成区域面积图。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class AreaStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.areaStyle.color">https://echarts.apache.org/zh/option.html#series-line.areaStyle.color</a>
     * <br/>默认值: #000
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>填充的颜色。</p>
     * <blockquote>
     * <p>支持使用<code class="codespan">rgb(255,255,255)</code>，<code class="codespan">rgba(255,255,255,1)</code>，<code class="codespan">#fff</code>等方式设置为纯色，也支持设置为渐变色和纹理填充，具体见<a href="#color">option.color</a></p>
     * </blockquote>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.areaStyle.origin">https://echarts.apache.org/zh/option.html#series-line.areaStyle.origin</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图形区域的起始位置。</p>
     * <p>默认情况下，图形会从坐标轴轴线到数据间进行填充。如果需要填充的区域是坐标轴最大值到数据间，或者坐标轴最小值到数据间，则可以通过这个配置项进行设置。</p>
     * <p>可选值包括 <code class="codespan">'auto'</code>（默认值）、 <code class="codespan">'start'</code>、 <code class="codespan">'end'</code>。</p>
     * <ul>
     * <li><code class="codespan">'auto'</code> 填充坐标轴轴线到数据间的区域；</li>
     * <li><code class="codespan">'start'</code> 填充坐标轴底部（非 <code class="codespan">inverse</code> 情况是最小值）到数据间的区域；</li>
     * <li><code class="codespan">'end'</code> 填充坐标轴顶部（非 <code class="codespan">inverse</code> 情况是最大值）到数据间的区域。</li>
     * </ul>
     */
    private String origin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.areaStyle.shadowBlur">https://echarts.apache.org/zh/option.html#series-line.areaStyle.shadowBlur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.areaStyle.shadowColor">https://echarts.apache.org/zh/option.html#series-line.areaStyle.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.areaStyle.shadowOffsetX">https://echarts.apache.org/zh/option.html#series-line.areaStyle.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.areaStyle.shadowOffsetY">https://echarts.apache.org/zh/option.html#series-line.areaStyle.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.areaStyle.opacity">https://echarts.apache.org/zh/option.html#series-line.areaStyle.opacity</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
}
