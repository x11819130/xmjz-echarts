package com.xmjz.echarts.nativebean.option.series.sankeySeries.levels.blur;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.blur.lineStyle">#series-sankey.levels.blur.lineStyle</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class LineStyle extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.blur.lineStyle.color">#series-sankey.levels.blur.lineStyle.color</a>
     * <br/>默认值: '#314656'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>桑基图边的颜色。</p>
     * <ul>
     * <li><code class="codespan">'source'</code>: 使用源节点颜色。</li>
     * <li><code class="codespan">'target'</code>: 使用目标节点颜色。</li>
     * <li><code class="codespan">'gradient'</code>: 以源节点和目标节点的颜色做一个渐变过度色。(5.0开始支持)</li>
     * </ul>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.blur.lineStyle.opacity">#series-sankey.levels.blur.lineStyle.opacity</a>
     * <br/>默认值: 0.2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>桑基图边的透明度。</p>
     */
    private Integer opacity;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.blur.lineStyle.curveness">#series-sankey.levels.blur.lineStyle.curveness</a>
     * <br/>默认值: 0.5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>桑基图边的曲度。</p>
     */
    private Integer curveness;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.blur.lineStyle.shadowBlur">#series-sankey.levels.blur.lineStyle.shadowBlur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.blur.lineStyle.shadowColor">#series-sankey.levels.blur.lineStyle.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.blur.lineStyle.shadowOffsetX">#series-sankey.levels.blur.lineStyle.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.blur.lineStyle.shadowOffsetY">#series-sankey.levels.blur.lineStyle.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
}
