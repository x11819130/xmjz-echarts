package com.xmjz.echarts.nativebean.option.heatmapSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object","Function"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 * <p>标签的统一布局配置。</p>
 * <p>该配置项是在每个系列默认的标签布局基础上，统一调整标签的<code class="codespan">(x, y)</code>位置，标签对齐等属性以实现想要的标签布局效果。</p>
 * <p>该配置项也可以是一个有如下参数的回调函数</p>
 * <pre><code class="lang-ts hljs typescript"><span class="hljs-comment">// 标签对应数据的 dataIndex</span>
 * dataIndex: <span class="hljs-built_in">number</span>
 * <span class="hljs-comment">// 标签对应的数据类型，只在关系图中会有 node 和 edge 数据类型的区分</span>
 * dataType?: <span class="hljs-built_in">string</span>
 * <span class="hljs-comment">// 标签对应的系列的 index</span>
 * seriesIndex: <span class="hljs-built_in">number</span>
 * <span class="hljs-comment">// 标签显示的文本</span>
 * text: <span class="hljs-built_in">string</span>
 * <span class="hljs-comment">// 默认的标签的包围盒，由系列默认的标签布局决定</span>
 * labelRect: {x: <span class="hljs-built_in">number</span>, y: <span class="hljs-built_in">number</span>, width: <span class="hljs-built_in">number</span>, height: <span class="hljs-built_in">number</span>}
 * <span class="hljs-comment">// 默认的标签水平对齐</span>
 * align: <span class="hljs-string">'left'</span> | <span class="hljs-string">'center'</span> | <span class="hljs-string">'right'</span>
 * <span class="hljs-comment">// 默认的标签垂直对齐</span>
 * verticalAlign: <span class="hljs-string">'top'</span> | <span class="hljs-string">'middle'</span> | <span class="hljs-string">'bottom'</span>
 * <span class="hljs-comment">// 标签所对应的数据图形的包围盒，可用于定位标签位置</span>
 * rect: {x: <span class="hljs-built_in">number</span>, y: <span class="hljs-built_in">number</span>, width: <span class="hljs-built_in">number</span>, height: <span class="hljs-built_in">number</span>}
 * <span class="hljs-comment">// 默认引导线的位置，目前只有饼图(pie)和漏斗图(funnel)有默认标签位置</span>
 * <span class="hljs-comment">// 如果没有该值则为 null</span>
 * labelLinePoints?: <span class="hljs-built_in">number</span>[][]
 * </code></pre>
 * <p><strong>示例：</strong></p>
 * <p>将标签显示在图形右侧 10px 的位置，并且垂直居中：</p>
 * <pre><code class="lang-ts hljs typescript">labelLayout(params) {
 *     <span class="hljs-keyword">return</span> {
 *         x: params.rect.x + <span class="hljs-number">10</span>,
 *         y: params.rect.y + params.rect.height / <span class="hljs-number">2</span>,
 *         verticalAlign: <span class="hljs-string">'middle'</span>,
 *         align: <span class="hljs-string">'left'</span>
 *     }
 * }
 * </code></pre>
 * <p>根据图形的包围盒尺寸决定文本尺寸</p>
 * <pre><code class="lang-ts hljs typescript">
 * labelLayout(params) {
 *     <span class="hljs-keyword">return</span> {
 *         fontSize: <span class="hljs-built_in">Math</span>.max(params.rect.width / <span class="hljs-number">10</span>, <span class="hljs-number">5</span>)
 *     };
 * }
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class LabelLayout implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.hideOverlap">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.hideOverlap</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否隐藏重叠的标签。</p>
     * <p>下面示例演示了在关系图中开启该配置后，在缩放时可以实现自动的标签隐藏。</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=graph-label-overlap&amp;edit=1&amp;reset=1" width="600" height="400"></iframe>
     */
    private Boolean hideOverlap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.moveOverlap">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.moveOverlap</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>在标签重叠的时候是否挪动标签位置以防止重叠。</p>
     * <p>目前支持配置为：</p>
     * <ul>
     * <li><code class="codespan">'shiftX'</code> 水平方向依次位移，在水平方向对齐时使用</li>
     * <li><code class="codespan">'shiftY'</code> 垂直方向依次位移，在垂直方向对齐时使用</li>
     * </ul>
     * <p>下面是标签右对齐并配置垂直方向依次位移以防止重叠的示例。</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-label-align-right&amp;edit=1&amp;reset=1" width="600" height="400"></iframe>
     */
    private String moveOverlap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.x">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.x</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>标签的 x 位置。支持绝对的像素值或者<code class="codespan">'20%'</code>这样的相对值。</p>
     */
    private Object x;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.y">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.y</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>标签的 y 位置。支持绝对的像素值或者<code class="codespan">'20%'</code>这样的相对值。</p>
     */
    private Object y;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.dx">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.dx</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标签在 x 方向上的像素偏移。可以和<code class="codespan">x</code>一起使用。</p>
     */
    private Integer dx;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.dy">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.dy</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标签在 y 方向上的像素偏移。可以和<code class="codespan">y</code>一起使用</p>
     */
    private Integer dy;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.rotate">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.rotate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标签旋转角度。</p>
     */
    private Integer rotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.width">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.width</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标签显示的宽度。可以配合<code class="codespan">overflow</code>使用控制标签显示在固定宽度内</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.height">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.height</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标签显示的高度。</p>
     */
    private Integer height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.align">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.align</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>标签水平对齐方式。可以设置<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     */
    private String align;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.verticalAlign">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.verticalAlign</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>标签垂直对齐方式。可以设置<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     */
    private String verticalAlign;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.fontSize">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.fontSize</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>The text size of the label.</p>
     */
    private Integer fontSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.draggable">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.draggable</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>标签是否可以允许用户通过拖拽二次调整位置。</p>
     */
    private Boolean draggable;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.labelLinePoints">https://echarts.apache.org/zh/option.html#series-heatmap.labelLayout.labelLinePoints</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>标签引导线三个点的位置。格式为：</p>
     * <pre><code class="lang-ts hljs typescript">[[x, y], [x, y], [x, y]]
     * </code></pre>
     * <p>在饼图中常用来微调已经计算好的引导线，其它情况一般不建议设置。</p>
     */
    private List<?> labelLinePoints;
}
