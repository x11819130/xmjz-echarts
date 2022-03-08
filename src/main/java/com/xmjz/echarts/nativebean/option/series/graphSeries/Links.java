package com.xmjz.echarts.nativebean.option.series.graphSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.graphSeries.links.Blur;
import com.xmjz.echarts.nativebean.option.series.graphSeries.links.Emphasis;
import com.xmjz.echarts.nativebean.option.series.graphSeries.links.Label;
import com.xmjz.echarts.nativebean.option.series.graphSeries.links.LineStyle;
import com.xmjz.echarts.nativebean.option.series.graphSeries.links.Select;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links">#series-graph.links</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>节点间的关系数据。示例：</p>
 * <pre><code class="lang-ts hljs typescript">links: [{
 *     source: <span class="hljs-string">'n1'</span>,
 *     target: <span class="hljs-string">'n2'</span>
 * }, {
 *     source: <span class="hljs-string">'n2'</span>,
 *     target: <span class="hljs-string">'n3'</span>
 * }]
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Links extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links.source">#series-graph.links.source</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>边的<a href="https://echarts.apache.org/zh/option.html#series-graph.data.name">源节点名称</a>的字符串，也支持使用数字表示源节点的索引。</p>
     */
    private Object source;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links.target">#series-graph.links.target</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>边的<a href="https://echarts.apache.org/zh/option.html#series-graph.data.name">目标节点名称</a>的字符串，也支持使用数字表示源节点的索引。</p>
     */
    private Object target;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links.value">#series-graph.links.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>边的数值，可以在力引导布局中用于映射到边的长度。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links.lineStyle">#series-graph.links.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>关系边的线条样式。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links.label">#series-graph.links.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links.emphasis">#series-graph.links.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该关系边的高亮状态。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links.blur">#series-graph.links.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>该关系边的淡出状态。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links.select">#series-graph.links.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>该关系边的选中状态。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links.symbol">#series-graph.links.symbol</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array","string"]
     * <br/>描述:
     * <p>边两端的标记类型，可以是一个数组分别指定两端，也可以是单个统一指定。</p>
     */
    private Object symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links.symbolSize">#series-graph.links.symbolSize</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array","string"]
     * <br/>描述:
     * <p>边两端的标记大小，可以是一个数组分别指定两端，也可以是单个统一指定。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.links.ignoreForceLayout">#series-graph.links.ignoreForceLayout</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.5.0</code> 开始支持</p>
     * </blockquote>
     * <p>使此边不进行力导图布局的计算。</p>
     */
    private Boolean ignoreForceLayout;
}
