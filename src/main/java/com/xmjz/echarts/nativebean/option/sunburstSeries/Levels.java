package com.xmjz.echarts.nativebean.option.sunburstSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.levels">https://echarts.apache.org/v4/zh/option.html#series-sunburst.levels</a>
 * <br/>序号: 18
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p><strong>多层配置</strong></p>
 * <p>旭日图是一种有层次的结构，为了方便同一层样式的配置，我们提供了 levels 配置项。它是一个数组，其中的第 0 项表示数据下钻后返回上级的图形，其后的每一项分别表示从圆心向外层的层级。</p>
 * <p>例如，假设我们没有数据下钻功能，并且希望将最内层的扇形块的颜色设为红色，文字设为蓝色，可以这样设置：</p>
 * <pre><code class="lang-js hljs javascript">series: {
 *     <span class="hljs-comment">// ...</span>
 *     <span class="hljs-attr">levels</span>: [
 *         {
 *             <span class="hljs-comment">// 留给数据下钻点的空白配置</span>
 *         },
 *         {
 *             <span class="hljs-comment">// 最靠内测的第一层</span>
 *             <span class="hljs-attr">itemStyle</span>: {
 *                 <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>
 *             },
 *             <span class="hljs-attr">label</span>: {
 *                 <span class="hljs-attr">color</span>: <span class="hljs-string">'blue'</span>
 *             }
 *         },
 *         {
 *             <span class="hljs-comment">// 第二层 ...</span>
 *         }
 *     ]
 * }
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Levels implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.levels.label">https://echarts.apache.org/v4/zh/option.html#series-sunburst.levels.label</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了每个扇形块中，文本标签的样式。</p>
     * <p><strong>优先级：<a href="#series-sunburst.data.label">series.data.label</a> &gt; <a href="#series-sunburst.levels.label">series.levels.label</a> &gt; <a href="#series-sunburst.label">series.label</a>。</strong></p>
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等，<code class="codespan">label</code>选项在 ECharts 2.x 中放置于<code class="codespan">itemStyle</code>下，在 ECharts 3 中为了让整个配置项结构更扁平合理，<code class="codespan">label</code> 被拿出来跟 <code class="codespan">itemStyle</code> 平级，并且跟 <code class="codespan">itemStyle</code> 一样拥有 <code class="codespan">emphasis</code> 状态。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.levels.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-sunburst.levels.itemStyle</a>
     * <br/>序号: 2
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.levels.emphasis">https://echarts.apache.org/v4/zh/option.html#series-sunburst.levels.emphasis</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>鼠标悬停后的配置项。</p>
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.levels.highlight">https://echarts.apache.org/v4/zh/option.html#series-sunburst.levels.highlight</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>鼠标悬停后相关扇形块的配置项。参见 <a href="#series-sunburst.highlightPolicy">highlightPolicy</a>。</p>
     */
    private Object highlight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-sunburst.levels.downplay">https://echarts.apache.org/v4/zh/option.html#series-sunburst.levels.downplay</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>鼠标悬停后不相关扇形块的配置项。参见 <a href="#series-sunburst.highlightPolicy">highlightPolicy</a>。</p>
     */
    private Object downplay;
}
