package com.xmjz.echarts.nativebean.option.series.boxplotSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.boxplotSeries.data.Blur;
import com.xmjz.echarts.nativebean.option.series.boxplotSeries.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.boxplotSeries.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.boxplotSeries.data.Select;
import com.xmjz.echarts.nativebean.option.series.boxplotSeries.data.Tooltip;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.data">#series-boxplot.data</a>
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
public class Data extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.data.name">#series-boxplot.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据项名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.data.value">#series-boxplot.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>数据值。</p>
     * <pre><code class="lang-javascript hljs">[min,  Q1,  median (or Q2),  Q3,  max]
     * </code></pre>
     */
    private List<?> value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.data.groupId">#series-boxplot.data.groupId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该数据项的组 ID。组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画。</p>
     */
    private String groupId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.data.itemStyle">#series-boxplot.data.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>盒须图单个数据样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.data.emphasis">#series-boxplot.data.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>盒须图单个数据高亮状态配置。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.data.blur">#series-boxplot.data.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>盒须图单个数据淡出状态配置。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.data.select">#series-boxplot.data.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>盒须图单个数据选中状态配置。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.data.tooltip">#series-boxplot.data.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
