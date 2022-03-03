package com.xmjz.echarts.nativebean.option;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#polar">https://echarts.apache.org/zh/option.html#polar</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>极坐标系，可以用于散点图和折线图。每个极坐标系拥有一个<a href="#angleAxis">角度轴</a>和一个<a href="#radiusAxis">半径轴</a>。</p>
 * <p><strong>示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-polar-punchCard&amp;edit=1&amp;reset=1" width="600" height="400" data-ll-timeout="25"></iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Polar implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#polar.id">https://echarts.apache.org/zh/option.html#polar.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#polar.zlevel">https://echarts.apache.org/zh/option.html#polar.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#polar.z">https://echarts.apache.org/zh/option.html#polar.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#polar.center">https://echarts.apache.org/zh/option.html#polar.center</a>
     * <br/>默认值: ["50%","50%"]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>极坐标系的中心（圆心）坐标，数组的第一项是横坐标，第二项是纵坐标。</p>
     * <p>支持设置成百分比，设置成百分比时第一项是相对于容器宽度，第二项是相对于容器高度。</p>
     * <p><strong>使用示例：</strong></p>
     * <pre><code class="hljs javascript"><span class="hljs-comment">// 设置成绝对的像素值</span>
     * <span class="hljs-attr">center</span>: [<span class="hljs-number">400</span>, <span class="hljs-number">300</span>]
     * <span class="hljs-comment">// 设置成相对的百分比</span>
     * <span class="hljs-attr">center</span>: [<span class="hljs-string">'50%'</span>, <span class="hljs-string">'50%'</span>]
     * </code></pre>
     */
    private List<?> center;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#polar.radius">https://echarts.apache.org/zh/option.html#polar.radius</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Array"]
     * <br/>描述:
     * <p>极坐标系的半径。可以为如下类型：</p>
     * <ul>
     * <li><code class="codespan">number</code>：直接指定外半径值。</li>
     * <li><code class="codespan">string</code>：例如，<code class="codespan">'20%'</code>，表示外半径为可视区尺寸（容器高宽中较小一项）的 20% 长度。</li>
     * </ul>
     * <ul>
     * <li><code class="codespan">Array.&lt;number|string&gt;</code>：数组的第一项是内半径，第二项是外半径。每一项遵从上述 <code class="codespan">number</code> <code class="codespan">string</code> 的描述。</li>
     * </ul>
     */
    private Object radius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#polar.tooltip">https://echarts.apache.org/zh/option.html#polar.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本坐标系特定的 tooltip 设定。</p>
     * <p><strong>提示框组件的通用介绍：</strong></p>
     * <p>提示框组件可以设置在多种地方：</p>
     * <ul>
     * <li><p>可以设置在全局，即 <a href="#tooltip">tooltip</a></p>
     * </li>
     * <li><p>可以设置在坐标系中，即 <a href="#grid.tooltip">grid.tooltip</a>、<a href="#polar.tooltip">polar.tooltip</a>、<a href="#single.tooltip">single.tooltip</a></p>
     * </li>
     * <li><p>可以设置在系列中，即 <a href="#series.tooltip">series.tooltip</a></p>
     * </li>
     * <li><p>可以设置在系列的每个数据项中，即 <a href="#series.data.tooltip">series.data.tooltip</a></p>
     * </li>
     * </ul>
     */
    private Object tooltip;
}
