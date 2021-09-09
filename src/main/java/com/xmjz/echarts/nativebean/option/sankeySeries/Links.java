package com.xmjz.echarts.nativebean.option.sankeySeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links">https://echarts.apache.org/zh/option.html#series-sankey.links</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>节点间的边。<strong>注意: 桑基图理论上只支持有向无环图（DAG, Directed Acyclic Graph），所以请确保输入的边是无环的.</strong> 示例：</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.source">https://echarts.apache.org/zh/option.html#series-sankey.links.source</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>边的<a href="#series-sankey.data.name">源节点名称</a></p>
     */
    private String source;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.target">https://echarts.apache.org/zh/option.html#series-sankey.links.target</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>边的<a href="#series-sankey.data.name">目标节点名称</a></p>
     */
    private String target;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.value">https://echarts.apache.org/zh/option.html#series-sankey.links.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>边的数值，决定边的宽度。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.lineStyle">https://echarts.apache.org/zh/option.html#series-sankey.links.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>关系边的线条样式。</p>
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.emphasis">https://echarts.apache.org/zh/option.html#series-sankey.links.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.blur">https://echarts.apache.org/zh/option.html#series-sankey.links.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Object blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.links.select">https://echarts.apache.org/zh/option.html#series-sankey.links.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Object select;
}
