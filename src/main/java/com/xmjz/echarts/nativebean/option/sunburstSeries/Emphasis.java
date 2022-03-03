package com.xmjz.echarts.nativebean.option.sunburstSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.emphasis">https://echarts.apache.org/zh/option.html#series-sunburst.emphasis</a>
 * <br/>默认值: 无
 * <br/>js类型: ["any"]
 * <br/>描述:
 * <p>高亮状态配置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.emphasis.focus">https://echarts.apache.org/zh/option.html#series-sunburst.emphasis.focus</a>
     * <br/>默认值: none
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>在高亮图形时，是否淡出其它数据的图形已达到聚焦的效果。支持如下配置：</p>
     * <ul>
     * <li><code class="codespan">'none'</code> 不淡出其它图形，默认使用该配置。</li>
     * <li><code class="codespan">'self'</code> 只聚焦（不淡出）当前高亮的数据的图形。</li>
     * </ul>
     * <ul>
     * <li><code class="codespan">'series'</code> 聚焦当前高亮的数据所在的系列的所有图形。</li>
     * </ul>
     * <ul>
     * <li><code class="codespan">'ancestor'</code> 聚焦所有祖先节点</li>
     * <li><code class="codespan">'descendant'</code> 聚焦所有子孙节点</li>
     * </ul>
     * <p><strong>示例：</strong></p>
     * <p>下面代码配置了柱状图在高亮一个图形的时候，淡出当前直角坐标系所有其它的系列。</p>
     * <pre><code class="lang-ts hljs typescript">emphasis: {
     *     focus: <span class="hljs-string">'series'</span>,
     *     blurScope: <span class="hljs-string">'coordinateSystem'</span>
     * }
     * </code></pre>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=bar-y-category-stack&amp;reset=1&amp;edit=1" width="600" height="400"></iframe>
     */
    private String focus;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.emphasis.blurScope">https://echarts.apache.org/zh/option.html#series-sunburst.emphasis.blurScope</a>
     * <br/>默认值: coordinateSystem
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>在开启<code class="codespan">focus</code>的时候，可以通过<code class="codespan">blurScope</code>配置淡出的范围。支持如下配置</p>
     * <ul>
     * <li><code class="codespan">'coordinateSystem'</code> 淡出范围为坐标系，默认使用该配置。</li>
     * <li><code class="codespan">'series'</code> 淡出范围为系列。</li>
     * <li><code class="codespan">'global'</code> 淡出范围为全局。</li>
     * </ul>
     */
    private String blurScope;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.emphasis.label">https://echarts.apache.org/zh/option.html#series-sunburst.emphasis.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了每个扇形块中，文本标签的样式。</p>
     * <p><strong>优先级：<a href="#series-sunburst.data.label">series.data.label</a> &gt; <a href="#series-sunburst.levels.label">series.levels.label</a> &gt; <a href="#series-sunburst.label">series.label</a>。</strong></p>
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.emphasis.labelLine">https://echarts.apache.org/zh/option.html#series-sunburst.emphasis.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private Object labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sunburst.emphasis.itemStyle">https://echarts.apache.org/zh/option.html#series-sunburst.emphasis.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>旭日图扇形块的样式。</p>
     * <p>可以在 <a href="#series-sunburst.itemStyle">series.itemStyle</a> 定义所有扇形块的样式，也可以在 <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> 定义每一层扇形块的样式，还可以在 <a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a> 定义每个扇形块单独的样式，这三者的优先级从低到高。也就是说，如果定义了 <a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a>，将会覆盖 <a href="#series-sunburst.itemStyle">series.itemStyle</a> 和 <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a>。</p>
     * <p><strong>优先级：<a href="#series-sunburst.data.itemStyle">series.data.itemStyle</a> &gt; <a href="#series-sunburst.levels.itemStyle">series.levels.itemStyle</a> &gt; <a href="#series-sunburst.itemStyle">series.itemStyle</a>。</strong></p>
     */
    private Object itemStyle;
}
