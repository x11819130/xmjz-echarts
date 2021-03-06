package com.xmjz.echarts.nativebean.option.sankeySeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.lineStyle">https://echarts.apache.org/zh/option.html#series-sankey.lineStyle</a>
 * <br/>序号: 22
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>桑基图边的样式，其中 <a href="#series-sankey.lineStyle.color">lineStyle.color</a> 支持设置为<code class="codespan">'source'</code>或者<code class="codespan">'target'</code>特殊值，此时边会自动取源节点或目标节点的颜色作为自己的颜色。</p>
 * <p>从 5.0 开始, <a href="#series-sankey.lineStyle.color">lineStyle.color</a> 还可以设置为<code class="codespan">'gradient'</code>，取从源节点到目标节点的渐变色。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class LineStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.color">https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.color</a>
     * <br/>序号: 1
     * <br/>默认值: #314656
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>桑基图边的颜色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.opacity">https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.opacity</a>
     * <br/>序号: 2
     * <br/>默认值: 0.2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>桑基图边的透明度。</p>
     */
    private Integer opacity;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.curveness">https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.curveness</a>
     * <br/>序号: 3
     * <br/>默认值: 0.5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>桑基图边的曲度。</p>
     */
    private Integer curveness;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.shadowBlur">https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.shadowBlur</a>
     * <br/>序号: 4
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.shadowColor">https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.shadowColor</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.shadowOffsetX">https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.shadowOffsetX</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.shadowOffsetY">https://echarts.apache.org/zh/option.html#series-sankey.lineStyle.shadowOffsetY</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
}
