package com.xmjz.echarts.nativebean.option.sunburstSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels">https://echarts.apache.org/zh/option.html#series-sunburst.levels</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p><strong>多层配置</strong></p>
 * <p>旭日图是一种有层次的结构，为了方便同一层样式的配置，我们提供了 levels 配置项。它是一个数组，其中的第 0 项表示数据下钻后返回上级的图形，其后的每一项分别表示从圆心向外层的层级。</p>
 * <p>例如，假设我们没有数据下钻功能，并且希望将最内层的扇形块的颜色设为红色，文字设为蓝色，可以这样设置：</p>
 * <pre><code class="lang-ts hljs typescript">series: {
 *     <span class="hljs-comment">// ...</span>
 *     levels: [
 *         {
 *             <span class="hljs-comment">// 留给数据下钻点的空白配置</span>
 *         },
 *         {
 *             <span class="hljs-comment">// 最靠内测的第一层</span>
 *             itemStyle: {
 *                 color: <span class="hljs-string">'red'</span>
 *             },
 *             label: {
 *                 color: <span class="hljs-string">'blue'</span>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.radius">https://echarts.apache.org/zh/option.html#series-sunburst.levels.radius</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.2.0</code> 开始支持</p>
     * </blockquote>
     * <p>当前层的内半径和外半径，注意其它层的内外半径不会因为该层的改变自适应。</p>
     */
    private List<?> radius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.label">https://echarts.apache.org/zh/option.html#series-sunburst.levels.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了每个扇形块中，文本标签的样式。</p>
     * <p><strong>优先级：<a href="#series-sunburst.data.label">series.data.label</a> &gt; <a href="#series-sunburst.levels.label">series.levels.label</a> &gt; <a href="#series-sunburst.label">series.label</a>。</strong></p>
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.labelLine">https://echarts.apache.org/zh/option.html#series-sunburst.levels.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private Object labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.itemStyle">https://echarts.apache.org/zh/option.html#series-sunburst.levels.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>旭日图扇形块的样式。</p>
     * <p>可以在 <a href="#series-sunburst.itemStyle">series.itemStyle</a> 定义所有扇形块的样式，也可以在 <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> 定义每一层扇形块的样式，还可以在 <a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a> 定义每个扇形块单独的样式，这三者的优先级从低到高。也就是说，如果定义了 <a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a>，将会覆盖 <a href="#series-sunburst.itemStyle">series.itemStyle</a> 和 <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a>。</p>
     * <p><strong>优先级：<a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a> &gt; <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> &gt; <a href="#series-sunburst.itemStyle">series.itemStyle</a>。</strong></p>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.emphasis">https://echarts.apache.org/zh/option.html#series-sunburst.levels.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>高亮状态配置。</p>
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.blur">https://echarts.apache.org/zh/option.html#series-sunburst.levels.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>淡出状态配置。</p>
     */
    private Object blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.levels.select">https://echarts.apache.org/zh/option.html#series-sunburst.levels.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>选中状态配置。</p>
     */
    private Object select;
}
