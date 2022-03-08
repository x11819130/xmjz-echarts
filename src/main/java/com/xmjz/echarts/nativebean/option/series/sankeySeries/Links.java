package com.xmjz.echarts.nativebean.option.series.sankeySeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.links.Blur;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.links.Emphasis;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.links.LineStyle;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.links.Select;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links">#series-sankey.links</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>节点间的边。<strong>注意: 桑基图理论上只支持有向无环图（DAG, Directed Acyclic Graph），所以请确保输入的边是无环的.</strong> 示例：</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.source">#series-sankey.links.source</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>边的<a href="https://echarts.apache.org/zh/option.html#series-sankey.data.name">源节点名称</a></p>
     */
    private String source;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.target">#series-sankey.links.target</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>边的<a href="https://echarts.apache.org/zh/option.html#series-sankey.data.name">目标节点名称</a></p>
     */
    private String target;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.value">#series-sankey.links.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>边的数值，决定边的宽度。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.lineStyle">#series-sankey.links.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>关系边的线条样式。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.emphasis">#series-sankey.links.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.blur">#series-sankey.links.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.select">#series-sankey.links.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Select select;
}
