package com.xmjz.echarts.nativebean.option.lineSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.emphasis">https://echarts.apache.org/zh/option.html#series-line.emphasis</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>折线图的高亮状态。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.emphasis.disabled">https://echarts.apache.org/zh/option.html#series-line.emphasis.disabled</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.3.0</code> 开始支持</p>
     * </blockquote>
     * <p>是否关闭高亮状态。</p>
     * <p>关闭高亮状态可以在鼠标移到图形上，tooltip 触发，或者图例联动的时候不再触发高亮效果。在图形非常多的时候可以关闭以提升交互流畅性。</p>
     */
    private Boolean disabled;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.emphasis.scale">https://echarts.apache.org/zh/option.html#series-line.emphasis.scale</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启 hover 在拐点标志上的放大效果。</p>
     */
    private Boolean scale;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.emphasis.focus">https://echarts.apache.org/zh/option.html#series-line.emphasis.focus</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.emphasis.blurScope">https://echarts.apache.org/zh/option.html#series-line.emphasis.blurScope</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.emphasis.label">https://echarts.apache.org/zh/option.html#series-line.emphasis.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.emphasis.labelLine">https://echarts.apache.org/zh/option.html#series-line.emphasis.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private Object labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.emphasis.itemStyle">https://echarts.apache.org/zh/option.html#series-line.emphasis.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.emphasis.lineStyle">https://echarts.apache.org/zh/option.html#series-line.emphasis.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.emphasis.areaStyle">https://echarts.apache.org/zh/option.html#series-line.emphasis.areaStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object areaStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-line.emphasis.endLabel">https://echarts.apache.org/zh/option.html#series-line.emphasis.endLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Object endLabel;
}
