package com.xmjz.echarts.nativebean.option.series.gaugeSeries.axisLine;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisLine.lineStyle">#series-gauge.axisLine.lineStyle</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>仪表盘轴线样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class LineStyle extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisLine.lineStyle.color">#series-gauge.axisLine.lineStyle.color</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>仪表盘的轴线可以被分成不同颜色的多段。每段的结束位置和颜色可以通过一个数组来表示。</p>
     * <p>默认取值：</p>
     * <pre><code class="lang-ts hljs typescript">[[<span class="hljs-number">1</span>, <span class="hljs-string">'#E6EBF8'</span>]]
     * </code></pre>
     * <p>注意: <code class="codespan">color[i][0]</code> 的值代表整根轴线的百分比，应在 0 到 1 之间；<code class="codespan">color[i][1]</code> 是对应的颜色。</p>
     * <pre><code class="lang-js hljs javascript">color: [
     *     [<span class="hljs-number">0.1</span>, <span class="hljs-string">'red'</span>], <span class="hljs-comment">// 0~10% 红轴</span>
     *     [<span class="hljs-number">0.2</span>, <span class="hljs-string">'green'</span>], <span class="hljs-comment">// 10~20% 绿轴</span>
     *     [<span class="hljs-number">0.3</span>, <span class="hljs-string">'blue'</span>], <span class="hljs-comment">// 20~30% 蓝轴</span>
     *     <span class="hljs-comment">// ...</span>
     * ]
     * </code></pre>
     */
    private List<?> color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisLine.lineStyle.width">#series-gauge.axisLine.lineStyle.width</a>
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>轴线宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisLine.lineStyle.shadowBlur">#series-gauge.axisLine.lineStyle.shadowBlur</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisLine.lineStyle.shadowColor">#series-gauge.axisLine.lineStyle.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisLine.lineStyle.shadowOffsetX">#series-gauge.axisLine.lineStyle.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisLine.lineStyle.shadowOffsetY">#series-gauge.axisLine.lineStyle.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisLine.lineStyle.opacity">#series-gauge.axisLine.lineStyle.opacity</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
}
