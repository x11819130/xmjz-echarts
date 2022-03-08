package com.xmjz.echarts.nativebean.option.series.linesSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.linesSeries.data.Blur;
import com.xmjz.echarts.nativebean.option.series.linesSeries.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.linesSeries.data.Label;
import com.xmjz.echarts.nativebean.option.series.linesSeries.data.LineStyle;
import com.xmjz.echarts.nativebean.option.series.linesSeries.data.Select;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.data">#series-lines.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>线数据集。</p>
 * <p><strong>注：</strong> 为了更好点支持多段线的配置，线数据的格式在 3.2.0 做了一定调整，如下：</p>
 * <pre><code class="lang-ts hljs typescript"><span class="hljs-comment">// 3.2.0 之前</span>
 * <span class="hljs-comment">// [{</span>
 * <span class="hljs-comment">//    // 起点坐标</span>
 * <span class="hljs-comment">//    coord: [120, 66],</span>
 * <span class="hljs-comment">//    lineStyle: { }</span>
 * <span class="hljs-comment">// }, {</span>
 * <span class="hljs-comment">//    // 终点坐标</span>
 * <span class="hljs-comment">//    coord: [122, 67]</span>
 * <span class="hljs-comment">// }]</span>
 *
 * <span class="hljs-comment">// 从 3.2.0 起改为如下配置</span>
 * {
 *     coords: [
 *         [<span class="hljs-number">120</span>, <span class="hljs-number">66</span>],  <span class="hljs-comment">// 起点</span>
 *         [<span class="hljs-number">122</span>, <span class="hljs-number">67</span>]   <span class="hljs-comment">// 终点</span>
 *         ...         <span class="hljs-comment">// 如果 polyline 为 true 还可以设置更多的点</span>
 *     ],
 *     <span class="hljs-comment">// 统一的样式设置</span>
 *     lineStyle: {
 *     }
 * }
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Data extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.data.name">#series-lines.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据名称</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.data.groupId">#series-lines.data.groupId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该数据项的组 ID。组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画。</p>
     */
    private String groupId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.data.coords">#series-lines.data.coords</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>一个包含两个到多个二维坐标的数组。在 <a href="https://echarts.apache.org/zh/option.html#series-lines.polyline">polyline</a> 设置为 <code class="codespan">true</code> 时支持多于两个的坐标。</p>
     */
    private List<?> coords;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.data.lineStyle">#series-lines.data.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据（单条线）的样式设置。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.data.label">#series-lines.data.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据（单条线）的标签设置。在 <a href="https://echarts.apache.org/zh/option.html#series-lines.polyline">polyline</a> 设置为 <code class="codespan">true</code> 时无效。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.data.emphasis">#series-lines.data.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.data.blur">#series-lines.data.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.data.select">#series-lines.data.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Select select;
}
