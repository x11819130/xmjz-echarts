package com.xmjz.echarts.nativebean.option.gaugeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.itemStyle">https://echarts.apache.org/zh/option.html#series-gauge.itemStyle</a>
 * <br/>序号: 23
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>仪表盘指针样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class ItemStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.color">https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.color</a>
     * <br/>序号: 1
     * <br/>默认值: auto
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>指针颜色，默认取数值所在的<a href="#series-gauge.axisLine.lineStyle.color">区间的颜色</a>。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.borderColor">https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.borderColor</a>
     * <br/>序号: 2
     * <br/>默认值: #000
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>图形的描边颜色。支持的颜色格式同 <code class="codespan">color</code>，不支持回调函数。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.borderWidth">https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.borderWidth</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>描边线宽。为 0 时无描边。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.borderType">https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.borderType</a>
     * <br/>序号: 4
     * <br/>默认值: solid
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>柱条的描边类型，默认为实线，支持 <code class="codespan">'solid'</code>, <code class="codespan">'dashed'</code>, <code class="codespan">'dotted'</code>。</p>
     */
    private String borderType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.shadowBlur">https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.shadowBlur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.shadowColor">https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.shadowColor</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.shadowOffsetX">https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.shadowOffsetX</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.shadowOffsetY">https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.shadowOffsetY</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.opacity">https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.opacity</a>
     * <br/>序号: 9
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.decal(Object%20|%20'none')">https://echarts.apache.org/zh/option.html#series-gauge.itemStyle.decal(Object%20|%20'none')</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>图形的贴花图案，在 <a href="#aria.enabled">aria.enabled</a> 与 <a href="#aria.decal.show">aria.decal.show</a> 都是 <code class="codespan">true</code> 的情况下才生效。</p>
     * <p>如果为 <code class="codespan">'none'</code> 表示不使用贴花图案。</p>
     */
    private Object decal;
}
