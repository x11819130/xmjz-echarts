package com.xmjz.echarts.nativebean.option.geo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.emphasis">https://echarts.apache.org/zh/option.html#geo.emphasis</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>高亮状态下的多边形和标签样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.emphasis.disabled">https://echarts.apache.org/zh/option.html#geo.emphasis.disabled</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.emphasis.focus">https://echarts.apache.org/zh/option.html#geo.emphasis.focus</a>
     * <br/>默认值: none
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.1.0</code> 开始支持</p>
     * </blockquote>
     * <p>在高亮图形时，是否淡出其它数据的图形已达到聚焦的效果。支持如下配置：</p>
     * <ul>
     * <li><code class="codespan">'none'</code> 不淡出其它图形，默认使用该配置。</li>
     * <li><code class="codespan">'self'</code> 只聚焦（不淡出）当前高亮的数据的图形。</li>
     * </ul>
     * <p><strong>示例：</strong></p>
     * <p>下面代码配置了 geo 在高亮一个图形的时候，淡出所有其它的图形。</p>
     * <pre><code class="lang-ts hljs typescript">emphasis: {
     *     focus: <span class="hljs-string">'self'</span>
     * }
     * </code></pre>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=geo-organ&amp;reset=1&amp;edit=1" width="600" height="400"></iframe>
     */
    private String focus;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.emphasis.label">https://echarts.apache.org/zh/option.html#geo.emphasis.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.emphasis.itemStyle">https://echarts.apache.org/zh/option.html#geo.emphasis.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
}
