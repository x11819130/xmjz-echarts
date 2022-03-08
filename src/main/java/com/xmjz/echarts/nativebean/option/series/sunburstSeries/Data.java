package com.xmjz.echarts.nativebean.option.series.sunburstSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.sunburstSeries.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.sunburstSeries.data.Label;
import com.xmjz.echarts.nativebean.option.series.sunburstSeries.data.LabelLine;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data">#series-sunburst.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p><a href="https://echarts.apache.org/zh/option.html#series-sunburst.data">series-sunburst.data</a> 的数据格式是树状的，例如：</p>
 * <pre><code class="lang-ts hljs typescript">[{
 *     name: <span class="hljs-string">'parent1'</span>,
 *     value: <span class="hljs-number">10</span>,          <span class="hljs-comment">// 可以不写父元素的 value，则为子元素之和；</span>
 *                         <span class="hljs-comment">// 如果写了，并且大于子元素之和，可以用来表示还有其他子元素未显示</span>
 *     children: [{
 *         value: <span class="hljs-number">5</span>,
 *         name: <span class="hljs-string">'child1'</span>,
 *         children: [{
 *             value: <span class="hljs-number">2</span>,
 *             name: <span class="hljs-string">'grandchild1'</span>,
 *             itemStyle: {
 *                 <span class="hljs-comment">// 每个数据可以有自己的样式，覆盖 series.itemStyle 和 level.itemStyle</span>
 *             },
 *             label: {
 *                 <span class="hljs-comment">// 标签样式，同上</span>
 *             }
 *         }]
 *     }, {
 *         value: <span class="hljs-number">3</span>,
 *         name: <span class="hljs-string">'child2'</span>
 *     }],
 *     itemStyle: {
 *         <span class="hljs-comment">// parent1 的图形样式，不会被后代继承</span>
 *     },
 *     label: {
 *         <span class="hljs-comment">// parent1 的标签样式，不会被后代继承</span>
 *     }
 * }, {
 *     name: <span class="hljs-string">'parent2'</span>,
 *     value: <span class="hljs-number">4</span>
 * }]
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.value">#series-sunburst.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>数据值，如果包含 children，则可以不写 value 值。这时，将使用子元素的 value 之和作为父元素的 value。如果 value 大于子元素之和，可以用来表示还有其他子元素未显示。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.name">#series-sunburst.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>显示在扇形块中的描述文字。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.link">#series-sunburst.data.link</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>点击此节点可跳转的超链接。须 <a href="https://echarts.apache.org/zh/option.html#series-treemap.nodeClick">series-sunburst.nodeClick</a> 值为 <code class="codespan">'link'</code> 时才生效。</p>
     * <p>参见 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.target">series-sunburst.data.target</a>。</p>
     */
    private String link;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.target">#series-sunburst.data.target</a>
     * <br/>默认值: 'blank'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>意义同 HTML <code class="codespan">&lt;a&gt;</code> 标签中的 <code class="codespan">target</code>，参见 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.link">series-sunburst.data.link</a>。可选值为：<code class="codespan">'blank'</code> 或 <code class="codespan">'self'</code>。</p>
     */
    private String target;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.label">#series-sunburst.data.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了每个扇形块中，文本标签的样式。</p>
     * <p><strong>优先级：<a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.label">series.data.label</a> &gt; <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.label">series.levels.label</a> &gt; <a href="https://echarts.apache.org/zh/option.html#series-sunburst.label">series.label</a>。</strong></p>
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.labelLine">#series-sunburst.data.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle">#series-sunburst.data.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>旭日图扇形块的样式。</p>
     * <p>可以在 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.itemStyle">series.itemStyle</a> 定义所有扇形块的样式，也可以在 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> 定义每一层扇形块的样式，还可以在 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle">series.data.itemStyle</a> 定义每个扇形块单独的样式，这三者的优先级从低到高。也就是说，如果定义了 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle">series.data.itemStyle</a>，将会覆盖 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.itemStyle">series.itemStyle</a> 和 <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.itemStyle">series.levels.itemStyle</a>。</p>
     * <p><strong>优先级：<a href="https://echarts.apache.org/zh/option.html#series-sunburst.data.itemStyle">series.data.itemStyle</a> &gt; <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> &gt; <a href="https://echarts.apache.org/zh/option.html#series-sunburst.itemStyle">series.itemStyle</a>。</strong></p>
     */
    private ItemStyle itemStyle;
}
