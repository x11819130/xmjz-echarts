package com.xmjz.echarts.nativebean.option.boxplotSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-boxplot.data">https://echarts.apache.org/v4/zh/option.html#series-boxplot.data</a>
 * <br/>序号: 15
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>数据格式是如下的二维数组。</p>
 * <pre><code class="lang-javascript hljs">[
 *     [<span class="hljs-number">655</span>, <span class="hljs-number">850</span>, <span class="hljs-number">940</span>, <span class="hljs-number">980</span>, <span class="hljs-number">1175</span>],
 *     [<span class="hljs-number">672.5</span>, <span class="hljs-number">800</span>, <span class="hljs-number">845</span>, <span class="hljs-number">885</span>, <span class="hljs-number">1012.5</span>],
 *     [<span class="hljs-number">780</span>, <span class="hljs-number">840</span>, <span class="hljs-number">855</span>, <span class="hljs-number">880</span>, <span class="hljs-number">940</span>],
 *     [<span class="hljs-number">621.25</span>, <span class="hljs-number">767.5</span>, <span class="hljs-number">815</span>, <span class="hljs-number">865</span>, <span class="hljs-number">1011.25</span>],
 *     { <span class="hljs-comment">// 数据项也可以是 Object，从而里面能含有对此数据项的特殊设置。</span>
 *         <span class="hljs-attr">value</span>: [<span class="hljs-number">713.75</span>, <span class="hljs-number">807.5</span>, <span class="hljs-number">810</span>, <span class="hljs-number">870</span>, <span class="hljs-number">963.75</span>],
 *         <span class="hljs-attr">itemStyle</span>: {...}
 *     },
 *     ...
 * ]
 * </code></pre>
 * <p>二维数组的每一数组项（上例中的每行）是渲染一个box，它含有五个量值，依次是：</p>
 * <pre><code class="lang-javascript hljs">[min,  Q1,  median (or Q2),  Q3,  max]
 * </code></pre>
 * <p><strong>数据的处理</strong></p>
 * <p>ECharts 并不内置对原始数据的处理，输入给 <code class="codespan">boxplot</code> 的数据须是如上五个统计结果量值。</p>
 * <p>但是 ECharts 也额外提供了简单的 <a href="https://github.com/apache/echarts/tree/master/extension/dataTool" target="_blank">原始数据处理函数</a>，如这个 <a href="https://echarts.apache.org/examples/zh/editor.html?c=boxplot-light-velocity&amp;edit=1&amp;reset=1" target="_blank">例子</a> 使用了<code class="codespan">echarts.dataTool.prepareBoxplotData</code> 来进行简单的数据统计。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Data implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-boxplot.data.name">https://echarts.apache.org/v4/zh/option.html#series-boxplot.data.name</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据项名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-boxplot.data.value">https://echarts.apache.org/v4/zh/option.html#series-boxplot.data.value</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>数据值。</p>
     * <pre><code class="lang-javascript hljs">[min,  Q1,  median (or Q2),  Q3,  max]
     * </code></pre>
     */
    private List<?> value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-boxplot.data.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-boxplot.data.itemStyle</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据盒须图样式。</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-boxplot.data.emphasis">https://echarts.apache.org/v4/zh/option.html#series-boxplot.data.emphasis</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据盒须图高亮样式</p>
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-boxplot.data.tooltip">https://echarts.apache.org/v4/zh/option.html#series-boxplot.data.tooltip</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
