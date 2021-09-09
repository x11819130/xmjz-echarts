package com.xmjz.echarts.nativebean.option.sankeySeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.data">https://echarts.apache.org/v4/zh/option.html#series-sankey.data</a>
 * <br/>序号: 24
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>桑基图节点数据列表。</p>
 * <pre><code class="lang-js hljs javascript">data: [{
 *     <span class="hljs-attr">name</span>: <span class="hljs-string">'node1'</span>,
 *     <span class="hljs-comment">// This attribute decides the layer of the current node.</span>
 *     <span class="hljs-attr">depth</span>: <span class="hljs-number">0</span>
 * }, {
 *     <span class="hljs-attr">name</span>: <span class="hljs-string">'node2'</span>,
 *     <span class="hljs-attr">depth</span>: <span class="hljs-number">1</span>
 * }]
 * </code></pre>
 * <p><strong>注意:</strong> 节点的<code class="codespan">name</code>不能重复。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Data implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.data.name">https://echarts.apache.org/v4/zh/option.html#series-sankey.data.name</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>节点的名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.data.value">https://echarts.apache.org/v4/zh/option.html#series-sankey.data.value</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>节点的值，可用来指定节点的纵向高度或横向的宽度。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.data.depth">https://echarts.apache.org/v4/zh/option.html#series-sankey.data.depth</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>节点所在的层，取值从 0 开始。</p>
     */
    private Integer depth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.data.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-sankey.data.itemStyle</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该节点的样式。</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.data.label">https://echarts.apache.org/v4/zh/option.html#series-sankey.data.label</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该节点标签的样式。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.data.emphasis">https://echarts.apache.org/v4/zh/option.html#series-sankey.data.emphasis</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sankey.data.tooltip">https://echarts.apache.org/v4/zh/option.html#series-sankey.data.tooltip</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
