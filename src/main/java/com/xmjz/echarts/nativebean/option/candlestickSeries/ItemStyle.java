package com.xmjz.echarts.nativebean.option.candlestickSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle">https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>K 线图的图形样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class ItemStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.color">https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.color</a>
     * <br/>默认值: #c23531
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p><code class="codespan">阳线</code> 图形的颜色。</p>
     * <blockquote>
     * <p>支持使用<code class="codespan">rgb(255,255,255)</code>，<code class="codespan">rgba(255,255,255,1)</code>，<code class="codespan">#fff</code>等方式设置为纯色，也支持设置为渐变色和纹理填充，具体见<a href="#color">option.color</a></p>
     * </blockquote>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.color0">https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.color0</a>
     * <br/>默认值: #314656
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p><code class="codespan">阴线</code> 图形的颜色。</p>
     * <blockquote>
     * <p>支持使用<code class="codespan">rgb(255,255,255)</code>，<code class="codespan">rgba(255,255,255,1)</code>，<code class="codespan">#fff</code>等方式设置为纯色，也支持设置为渐变色和纹理填充，具体见<a href="#color">option.color</a></p>
     * </blockquote>
     */
    private String color0;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.borderColor">https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.borderColor</a>
     * <br/>默认值: #c23531
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p><code class="codespan">阳线</code> 图形的描边颜色。</p>
     * <blockquote>
     * <p>支持使用<code class="codespan">rgb(255,255,255)</code>，<code class="codespan">rgba(255,255,255,1)</code>，<code class="codespan">#fff</code>等方式设置为纯色，也支持设置为渐变色和纹理填充，具体见<a href="#color">option.color</a></p>
     * </blockquote>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.borderColor0">https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.borderColor0</a>
     * <br/>默认值: #314656
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p><code class="codespan">阴线</code> 图形的描边颜色。</p>
     * <blockquote>
     * <p>支持使用<code class="codespan">rgb(255,255,255)</code>，<code class="codespan">rgba(255,255,255,1)</code>，<code class="codespan">#fff</code>等方式设置为纯色，也支持设置为渐变色和纹理填充，具体见<a href="#color">option.color</a></p>
     * </blockquote>
     */
    private String borderColor0;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.borderWidth">https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.borderWidth</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>candlestick 描边线宽。为 0 时无描边。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.shadowBlur">https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.shadowBlur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.shadowColor">https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.shadowOffsetX">https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.shadowOffsetY">https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.opacity">https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle.opacity</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
}
