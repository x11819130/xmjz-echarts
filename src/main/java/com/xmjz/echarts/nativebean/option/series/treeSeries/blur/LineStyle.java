package com.xmjz.echarts.nativebean.option.series.treeSeries.blur;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.blur.lineStyle">#series-tree.blur.lineStyle</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>定义树图边的样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class LineStyle extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.blur.lineStyle.color">#series-tree.blur.lineStyle.color</a>
     * <br/>默认值: '#ccc'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>树图边的颜色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.blur.lineStyle.width">#series-tree.blur.lineStyle.width</a>
     * <br/>默认值: 1.5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>树图边的宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.blur.lineStyle.curveness">#series-tree.blur.lineStyle.curveness</a>
     * <br/>默认值: 0.5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>树图边的曲度。</p>
     */
    private Integer curveness;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.blur.lineStyle.shadowBlur">#series-tree.blur.lineStyle.shadowBlur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.blur.lineStyle.shadowColor">#series-tree.blur.lineStyle.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.blur.lineStyle.shadowOffsetX">#series-tree.blur.lineStyle.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.blur.lineStyle.shadowOffsetY">#series-tree.blur.lineStyle.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
}
