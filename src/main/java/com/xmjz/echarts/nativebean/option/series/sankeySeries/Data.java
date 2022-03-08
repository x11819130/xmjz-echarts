package com.xmjz.echarts.nativebean.option.series.sankeySeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.data.Blur;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.data.Label;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.data.Select;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.data.Tooltip;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data">#series-sankey.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>桑基图节点数据列表。</p>
 * <pre><code class="lang-ts hljs typescript">data: [{
 *     name: <span class="hljs-string">'node1'</span>,
 *     <span class="hljs-comment">// This attribute decides the layer of the current node.</span>
 *     depth: <span class="hljs-number">0</span>
 * }, {
 *     name: <span class="hljs-string">'node2'</span>,
 *     depth: <span class="hljs-number">1</span>
 * }]
 * </code></pre>
 * <p><strong>注意:</strong> 节点的<code class="codespan">name</code>不能重复。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Data extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.name">#series-sankey.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>节点的名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.value">#series-sankey.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>节点的值，可用来指定节点的纵向高度或横向的宽度。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.depth">#series-sankey.data.depth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>节点所在的层，取值从 0 开始。</p>
     */
    private Integer depth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.itemStyle">#series-sankey.data.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该节点的样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.label">#series-sankey.data.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该节点标签的样式。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.emphasis">#series-sankey.data.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.blur">#series-sankey.data.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.select">#series-sankey.data.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.tooltip">#series-sankey.data.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
