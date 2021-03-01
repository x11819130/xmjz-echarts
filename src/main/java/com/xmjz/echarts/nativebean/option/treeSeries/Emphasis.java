package com.xmjz.echarts.nativebean.option.treeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.emphasis">https://echarts.apache.org/zh/option.html#series-tree.emphasis</a>
 * <br/>序号: 28
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>树图中个图形和标签高亮的样式。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-tree.emphasis.focus
     * <br/>序号: 1
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
     * <ul>
     * <li><code class="codespan">'ancestor'</code> 聚焦所有祖先节点</li>
     * <li><code class="codespan">'descendant'</code> 聚焦所有子孙节点</li>
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-tree.emphasis.blurScope
     * <br/>序号: 2
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-tree.emphasis.itemStyle
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该节点的样式。</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-tree.emphasis.lineStyle
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>定义树图边的样式。</p>
     */
    private Object lineStyle;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-tree.emphasis.label
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
}
