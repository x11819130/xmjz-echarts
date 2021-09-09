package com.xmjz.echarts.nativebean.option.axisPointer;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle">https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p><a href="#tooltip.axisPointer.type">axisPointer.type</a> 为 <code class="codespan">'shadow'</code> 时有效。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class ShadowStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle.color">https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle.color</a>
     * <br/>默认值: rgba(150,150,150,0.3)
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>填充的颜色。</p>
     * <blockquote>
     * <p>支持使用<code class="codespan">rgb(255,255,255)</code>，<code class="codespan">rgba(255,255,255,1)</code>，<code class="codespan">#fff</code>等方式设置为纯色，也支持设置为渐变色和纹理填充，具体见<a href="#color">option.color</a></p>
     * </blockquote>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle.shadowBlur">https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle.shadowBlur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle.shadowColor">https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle.shadowOffsetX">https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle.shadowOffsetY">https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle.opacity">https://echarts.apache.org/zh/option.html#axisPointer.shadowStyle.opacity</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
}
