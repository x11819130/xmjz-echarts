package com.xmjz.echarts.nativebean.option.linesSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-lines.data">https://echarts.apache.org/v4/zh/option.html#series-lines.data</a>
 * <br/>序号: 19
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>线数据集。</p>
 * <p><strong>注：</strong> 为了更好点支持多段线的配置，线数据的格式在 3.2.0 做了一定调整，如下：</p>
 * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 3.2.0 之前</span>
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
 *     <span class="hljs-attr">coords</span>: [
 *         [<span class="hljs-number">120</span>, <span class="hljs-number">66</span>],  <span class="hljs-comment">// 起点</span>
 *         [<span class="hljs-number">122</span>, <span class="hljs-number">67</span>]   <span class="hljs-comment">// 终点</span>
 *         ...         <span class="hljs-comment">// 如果 polyline 为 true 还可以设置更多的点</span>
 *     ],
 *     <span class="hljs-comment">// 统一的样式设置</span>
 *     <span class="hljs-attr">lineStyle</span>: {
 *     }
 * }
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Data implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-lines.data.name">https://echarts.apache.org/v4/zh/option.html#series-lines.data.name</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据名称</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-lines.data.coords">https://echarts.apache.org/v4/zh/option.html#series-lines.data.coords</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>一个包含两个到多个二维坐标的数组。在 <a href="#series-lines.polyline">polyline</a> 设置为 <code class="codespan">true</code> 时支持多于两个的坐标。</p>
     */
    private List<?> coords;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-lines.data.lineStyle">https://echarts.apache.org/v4/zh/option.html#series-lines.data.lineStyle</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据（单条线）的样式设置。</p>
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-lines.data.label">https://echarts.apache.org/v4/zh/option.html#series-lines.data.label</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据（单条线）的标签设置。在 <a href="#series-lines.polyline">polyline</a> 设置为 <code class="codespan">true</code> 时无效。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-lines.data.emphasis">https://echarts.apache.org/v4/zh/option.html#series-lines.data.emphasis</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object emphasis;
}
