package com.xmjz.echarts.nativebean.option.graphSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-graph.links">https://echarts.apache.org/v4/zh/option.html#series-graph.links</a>
 * <br/>序号: 38
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>节点间的关系数据。示例：</p>
 * <pre><code class="lang-js hljs javascript">links: [{
 *     <span class="hljs-attr">source</span>: <span class="hljs-string">'n1'</span>,
 *     <span class="hljs-attr">target</span>: <span class="hljs-string">'n2'</span>
 * }, {
 *     <span class="hljs-attr">source</span>: <span class="hljs-string">'n2'</span>,
 *     <span class="hljs-attr">target</span>: <span class="hljs-string">'n3'</span>
 * }]
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Links implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-graph.links.source">https://echarts.apache.org/v4/zh/option.html#series-graph.links.source</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>边的<a href="#series-graph.data.name">源节点名称</a>的字符串，也支持使用数字表示源节点的索引。</p>
     */
    private Object source;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-graph.links.target">https://echarts.apache.org/v4/zh/option.html#series-graph.links.target</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>边的<a href="#series-graph.data.name">目标节点名称</a>的字符串，也支持使用数字表示源节点的索引。</p>
     */
    private Object target;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-graph.links.value">https://echarts.apache.org/v4/zh/option.html#series-graph.links.value</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>边的数值，可以在力引导布局中用于映射到边的长度。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-graph.links.lineStyle">https://echarts.apache.org/v4/zh/option.html#series-graph.links.lineStyle</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>关系边的线条样式。</p>
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-graph.links.label">https://echarts.apache.org/v4/zh/option.html#series-graph.links.label</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-graph.links.emphasis">https://echarts.apache.org/v4/zh/option.html#series-graph.links.emphasis</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-graph.links.symbol">https://echarts.apache.org/v4/zh/option.html#series-graph.links.symbol</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Array","string"]
     * <br/>描述:
     * <p>边两端的标记类型，可以是一个数组分别指定两端，也可以是单个统一指定。</p>
     */
    private Object symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-graph.links.symbolSize">https://echarts.apache.org/v4/zh/option.html#series-graph.links.symbolSize</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["Array","string"]
     * <br/>描述:
     * <p>边两端的标记大小，可以是一个数组分别指定两端，也可以是单个统一指定。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-graph.links.ignoreForceLayout">https://echarts.apache.org/v4/zh/option.html#series-graph.links.ignoreForceLayout</a>
     * <br/>序号: 9
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
