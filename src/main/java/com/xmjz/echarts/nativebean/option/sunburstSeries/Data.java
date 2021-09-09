package com.xmjz.echarts.nativebean.option.sunburstSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.data">https://echarts.apache.org/v4/zh/option.html#series-sunburst.data</a>
 * <br/>序号: 8
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p><a href="#series-sunburst.data">series-sunburst.data</a> 的数据格式是树状的，例如：</p>
 * <pre><code class="lang-js hljs javascript">[{
 *     <span class="hljs-attr">name</span>: <span class="hljs-string">'parent1'</span>,
 *     <span class="hljs-attr">value</span>: <span class="hljs-number">10</span>,          <span class="hljs-comment">// 可以不写父元素的 value，则为子元素之和；</span>
 *                         <span class="hljs-comment">// 如果写了，并且大于子元素之和，可以用来表示还有其他子元素未显示</span>
 *     <span class="hljs-attr">children</span>: [{
 *         <span class="hljs-attr">value</span>: <span class="hljs-number">5</span>,
 *         <span class="hljs-attr">name</span>: <span class="hljs-string">'child1'</span>,
 *         <span class="hljs-attr">children</span>: [{
 *             <span class="hljs-attr">value</span>: <span class="hljs-number">2</span>,
 *             <span class="hljs-attr">name</span>: <span class="hljs-string">'grandchild1'</span>,
 *             <span class="hljs-attr">itemStyle</span>: {
 *                 <span class="hljs-comment">// 每个数据可以有自己的样式，覆盖 series.itemStyle 和 level.itemStyle</span>
 *             },
 *             <span class="hljs-attr">label</span>: {
 *                 <span class="hljs-comment">// 标签样式，同上</span>
 *             }
 *         }]
 *     }, {
 *         <span class="hljs-attr">value</span>: <span class="hljs-number">3</span>,
 *         <span class="hljs-attr">name</span>: <span class="hljs-string">'child2'</span>
 *     }],
 *     <span class="hljs-attr">itemStyle</span>: {
 *         <span class="hljs-comment">// parent1 的图形样式，不会被后代继承</span>
 *     },
 *     <span class="hljs-attr">label</span>: {
 *         <span class="hljs-comment">// parent1 的标签样式，不会被后代继承</span>
 *     }
 * }, {
 *     <span class="hljs-attr">name</span>: <span class="hljs-string">'parent2'</span>,
 *     <span class="hljs-attr">value</span>: <span class="hljs-number">4</span>
 * }]
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.value">https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.value</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>数据值，如果包含 children，则可以不写 value 值。这时，将使用子元素的 value 之和作为父元素的 value。如果 value 大于子元素之和，可以用来表示还有其他子元素未显示。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.name">https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.name</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>显示在扇形块中的描述文字。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.link">https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.link</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>点击此节点可跳转的超链接。须 <a href="#series-treemap.nodeClick">series-sunburst.nodeClick</a> 值为 <code class="codespan">'link'</code> 时才生效。</p>
     * <p>参见 <a href="#series-sunburst.data.target">series-sunburst.data.target</a>。</p>
     */
    private String link;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.target">https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.target</a>
     * <br/>序号: 4
     * <br/>默认值: blank
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>意义同 HTML <code class="codespan">&lt;a&gt;</code> 标签中的 <code class="codespan">target</code>，参见 <a href="#series-sunburst.data.link">series-sunburst.data.link</a>。可选值为：<code class="codespan">'blank'</code> 或 <code class="codespan">'self'</code>。</p>
     */
    private String target;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.label">https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.label</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了每个扇形块中，文本标签的样式。</p>
     * <p><strong>优先级：<a href="#series-sunburst.data.label">series.data.label</a> &gt; <a href="#series-sunburst.levels.label">series.levels.label</a> &gt; <a href="#series-sunburst.label">series.label</a>。</strong></p>
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等，<code class="codespan">label</code>选项在 ECharts 2.x 中放置于<code class="codespan">itemStyle</code>下，在 ECharts 3 中为了让整个配置项结构更扁平合理，<code class="codespan">label</code> 被拿出来跟 <code class="codespan">itemStyle</code> 平级，并且跟 <code class="codespan">itemStyle</code> 一样拥有 <code class="codespan">emphasis</code> 状态。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.itemStyle</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>旭日图扇形块的样式。</p>
     * <p>可以在 <a href="#series-sunburst.itemStyle">series.itemStyle</a> 定义所有扇形块的样式，也可以在 <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> 定义每一层扇形块的样式，还可以在 <a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a> 定义每个扇形块单独的样式，这三者的优先级从低到高。也就是说，如果定义了 <a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a>，将会覆盖 <a href="#series-sunburst.itemStyle">series.itemStyle</a> 和 <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a>。</p>
     * <p><strong>优先级：<a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a> &gt; <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> &gt; <a href="#series-sunburst.itemStyle">series.itemStyle</a>。</strong></p>
     * <p>ECharts 中，通常使用 <em>emphasis</em> 表示鼠标移动到图形上后的高亮状态。对于旭日图而言，我们引入了另两种状态：<em>highlight</em> 表示由于高亮了某个扇形块引起的其他相关扇形块的高亮；<em>downplay</em> 表示除了 highlight 扇形块之外的被淡化的扇形块。参见 <a href="#series-sunburst.highlightPolicy">highlightPolicy</a>。</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.emphasis">https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.emphasis</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>鼠标悬停后的配置项。</p>
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.highlight">https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.highlight</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>鼠标悬停后相关扇形块的配置项。参见 <a href="#series-sunburst.highlightPolicy">highlightPolicy</a>。</p>
     */
    private Object highlight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.downplay">https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.downplay</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>鼠标悬停后不相关扇形块的配置项。参见 <a href="#series-sunburst.highlightPolicy">highlightPolicy</a>。</p>
     */
    private Object downplay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.children">https://echarts.apache.org/v4/zh/option.html#series-sunburst.data.children</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>子节点，递归定义，格式同 <a href="#series-sunburst.data">series-sunburst.data</a>。</p>
     */
    private List<?> children;
}
