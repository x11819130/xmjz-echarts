package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.radar.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar">https://echarts.apache.org/zh/option.html#radar</a>
 * <br/>序号: 9
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>雷达图坐标系组件，只适用于<a href="#series-radar">雷达图</a>。该组件等同 ECharts 2 中的 polar 组件。因为 3 中的 polar 被重构为标准的极坐标组件，为避免混淆，雷达图使用 radar 组件作为其坐标系。</p>
 * <p>雷达图坐标系与极坐标系不同的是它的每一个轴（indicator 指示器）都是一个单独的维度，可以通过 <a href="#radar.name">name</a>、<a href="#radar.axisLine">axisLine</a>、<a href="#radar.axisTick">axisTick</a>、<a href="#radar.axisLabel">axisLabel</a>、<a href="#radar.splitLine">splitLine</a>、 <a href="#radar.splitArea">splitArea</a> 几个配置项配置指示器坐标轴线的样式。</p>
 * <p>下面是一个 radar 组件的一个自定义例子。</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/radar&amp;edit=1&amp;reset=1" width="400" height="400"></iframe>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Radar implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.id">https://echarts.apache.org/zh/option.html#radar.id</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.zlevel">https://echarts.apache.org/zh/option.html#radar.zlevel</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.z">https://echarts.apache.org/zh/option.html#radar.z</a>
     * <br/>序号: 3
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.center">https://echarts.apache.org/zh/option.html#radar.center</a>
     * <br/>序号: 4
     * <br/>默认值: ["50%","50%"]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>的中心（圆心）坐标，数组的第一项是横坐标，第二项是纵坐标。</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.radius">https://echarts.apache.org/zh/option.html#radar.radius</a>
     * <br/>序号: 5
     * <br/>默认值: 75%
     * <br/>js类型: ["number","string","Array"]
     * <br/>描述:
     * <p>的半径。可以为如下类型：</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.startAngle">https://echarts.apache.org/zh/option.html#radar.startAngle</a>
     * <br/>序号: 6
     * <br/>默认值: 90
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标系起始角度，也就是第一个指示器轴的角度。</p>
     */
    private Integer startAngle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.name">https://echarts.apache.org/zh/option.html#radar.name</a>
     * <br/>序号: 7
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>雷达图每个指示器名称的配置项。</p>
     */
    private Name name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.nameGap">https://echarts.apache.org/zh/option.html#radar.nameGap</a>
     * <br/>序号: 8
     * <br/>默认值: 15
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指示器名称和指示器轴的距离。</p>
     */
    private Integer nameGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.splitNumber">https://echarts.apache.org/zh/option.html#radar.splitNumber</a>
     * <br/>序号: 9
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指示器轴的分割段数。</p>
     */
    private Integer splitNumber;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.shape">https://echarts.apache.org/zh/option.html#radar.shape</a>
     * <br/>序号: 10
     * <br/>默认值: polygon
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>雷达图绘制类型，支持 <code class="codespan">'polygon'</code> 和 <code class="codespan">'circle'</code>。</p>
     */
    private String shape;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.scale">https://echarts.apache.org/zh/option.html#radar.scale</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否是脱离 0 值比例。设置成 <code class="codespan">true</code> 后坐标刻度不会强制包含零刻度。在双数值轴的散点图中比较有用。</p>
     */
    private Boolean scale;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.silent">https://echarts.apache.org/zh/option.html#radar.silent</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>坐标轴是否是静态无法交互。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.triggerEvent">https://echarts.apache.org/zh/option.html#radar.triggerEvent</a>
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>坐标轴的标签是否响应和触发鼠标事件，默认不响应。</p>
     * <p>事件参数如下：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-comment">// 组件类型，xAxis, yAxis, radiusAxis, angleAxis</span>
     *     <span class="hljs-comment">// 对应组件类型都会有一个属性表示组件的 index，例如 xAxis 就是 xAxisIndex</span>
     *     <span class="hljs-attr">componentType</span>: string,
     *     <span class="hljs-comment">// 未格式化过的刻度值, 点击刻度标签有效</span>
     *     <span class="hljs-attr">value</span>: <span class="hljs-string">''</span>,
     *     <span class="hljs-comment">// 坐标轴名称, 点击坐标轴名称有效</span>
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">''</span>
     * }
     * </code></pre>
     */
    private Boolean triggerEvent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLine">https://echarts.apache.org/zh/option.html#radar.axisLine</a>
     * <br/>序号: 14
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴轴线相关设置。</p>
     */
    private AxisLine axisLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisTick">https://echarts.apache.org/zh/option.html#radar.axisTick</a>
     * <br/>序号: 15
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴刻度相关设置。</p>
     */
    private AxisTick axisTick;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel">https://echarts.apache.org/zh/option.html#radar.axisLabel</a>
     * <br/>序号: 16
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴刻度标签的相关设置。</p>
     */
    private AxisLabel axisLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.splitLine">https://echarts.apache.org/zh/option.html#radar.splitLine</a>
     * <br/>序号: 17
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴在 <a href="#grid">grid</a> 区域中的分隔线。</p>
     */
    private SplitLine splitLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.splitArea">https://echarts.apache.org/zh/option.html#radar.splitArea</a>
     * <br/>序号: 18
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴在 <a href="#grid">grid</a> 区域中的分隔区域，默认不显示。</p>
     */
    private SplitArea splitArea;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.indicator">https://echarts.apache.org/zh/option.html#radar.indicator</a>
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>雷达图的指示器，用来指定雷达图中的多个变量（维度），如下示例。</p>
     * <pre><code class="lang-js hljs javascript">indicator: [
     *    { <span class="hljs-attr">name</span>: <span class="hljs-string">'销售（sales）'</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">6500</span>},
     *    { <span class="hljs-attr">name</span>: <span class="hljs-string">'管理（Administration）'</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">16000</span>, <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>}, <span class="hljs-comment">// 标签设置为红色</span>
     *    { <span class="hljs-attr">name</span>: <span class="hljs-string">'信息技术（Information Techology）'</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">30000</span>},
     *    { <span class="hljs-attr">name</span>: <span class="hljs-string">'客服（Customer Support）'</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">38000</span>},
     *    { <span class="hljs-attr">name</span>: <span class="hljs-string">'研发（Development）'</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">52000</span>},
     *    { <span class="hljs-attr">name</span>: <span class="hljs-string">'市场（Marketing）'</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">25000</span>}
     * ]
     * </code></pre>
     */
    private List<Indicator> indicator;
}
