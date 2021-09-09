package com.xmjz.echarts.nativebean.option.pieSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.emphasis">https://echarts.apache.org/zh/option.html#series-pie.emphasis</a>
 * <br/>序号: 27
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>高亮状态的扇区和标签样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.emphasis.scale">https://echarts.apache.org/zh/option.html#series-pie.emphasis.scale</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启高亮后扇区的放大效果。</p>
     */
    private Boolean scale;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.emphasis.scaleSize">https://echarts.apache.org/zh/option.html#series-pie.emphasis.scaleSize</a>
     * <br/>序号: 2
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>高亮后扇区的放大尺寸, 在开启 <a href="#series-pie.emphasis.scale">emphasis.scale</a> 后有效。</p>
     */
    private Integer scaleSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.emphasis.focus">https://echarts.apache.org/zh/option.html#series-pie.emphasis.focus</a>
     * <br/>序号: 3
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
     * <li><code class="codespan">'series'</code> 聚焦当前高亮的数据所在的系列的所有图形。</li>
     * </ul>
     * <p><strong>示例：</strong></p>
     * <p>下面代码配置了柱状图在高亮一个图形的时候，淡出当前直角坐标系所有其它的系列。</p>
     * <pre><code class="lang-js hljs javascript">emphasis: {
     *     <span class="hljs-attr">focus</span>: <span class="hljs-string">'series'</span>,
     *     <span class="hljs-attr">blurScope</span>: <span class="hljs-string">'coordinateSystem'</span>
     * }
     * </code></pre>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=bar-y-category-stack&amp;reset=1&amp;edit=1" width="600" height="400"></iframe>
     */
    private String focus;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.emphasis.blurScope">https://echarts.apache.org/zh/option.html#series-pie.emphasis.blurScope</a>
     * <br/>序号: 4
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.emphasis.label">https://echarts.apache.org/zh/option.html#series-pie.emphasis.label</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.emphasis.labelLine">https://echarts.apache.org/zh/option.html#series-pie.emphasis.labelLine</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.emphasis.itemStyle">https://echarts.apache.org/zh/option.html#series-pie.emphasis.itemStyle</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
}
