package com.xmjz.echarts.nativebean.option.series;

import com.xmjz.echarts.nativebean.option.Series;
import com.xmjz.echarts.nativebean.option.series.pieSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie">#series-pie</a>
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>饼图</strong></p>
 * <p>饼图主要用于表现不同类目的数据在总和中的占比。每个的弧度表示数据数量的比例。</p>
 * <p>对于一个图表中有多个饼图的场景，可以使用 <a href="https://echarts.apache.org/zh/option.html#series-pie.left">left</a>、<a href="https://echarts.apache.org/zh/option.html#series-pie.right">right</a>、<a href="https://echarts.apache.org/zh/option.html#series-pie.top">top</a>、<a href="https://echarts.apache.org/zh/option.html#series-pie.bottom">bottom</a>、<a href="https://echarts.apache.org/zh/option.html#series-pie.width">width</a>、<a href="https://echarts.apache.org/zh/option.html#series-pie.height">height</a> 配置每个饼图系列的位置和视口大小。<a href="https://echarts.apache.org/zh/option.html#series-pie.radius">radius</a>、<a href="https://echarts.apache.org/zh/option.html#series-pie.label.edgeDistance">label.edgeDistance</a> 等支持百分比的配置项，是相对于该配置项决定的矩形的大小而言的。</p>
 * <p><strong>Tip:</strong> 饼图更适合表现数据相对于总数的百分比等关系。如果只是表示不同类目数据间的大小，建议使用 <a href="bar" target="_blank">柱状图</a>，人们对于微小的弧度差别相比于微小的长度差别更不敏感，或者也可以通过配置 <a href="https://echarts.apache.org/zh/option.html#series-pie.roseType">roseType</a> 显示成南丁格尔图，通过半径大小区分数据的大小。</p>
 * <p><strong>下面是自定义南丁格尔图的示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=pie-custom&amp;edit=1&amp;reset=1" width="500" height="400" data-ll-timeout="33"></iframe>
 *
 *
 *
 *
 * <p>从 ECharts v4.6.0 版本起，我们提供了 <code class="codespan">'labelLine'</code> 与 <code class="codespan">'edge'</code> 两种新的布局方式。详情参见 <a href="https://echarts.apache.org/zh/option.html#series-pie.label.alignTo">label.alignTo</a>。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class PieSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.type">#series-pie.type</a>
     * <br/>默认值: 'pie'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.id">#series-pie.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.name">#series-pie.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="https://echarts.apache.org/zh/option.html#tooltip">tooltip</a>的显示，<a href="https://echarts.apache.org/zh/option.html#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.colorBy">#series-pie.colorBy</a>
     * <br/>默认值: 'data'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.2.0</code> 开始支持</p>
     * </blockquote>
     * <p>从调色盘 <a href="https://echarts.apache.org/zh/option.html#color">option.color</a> 中取色的策略，可取值为：</p>
     * <ul>
     * <li><code class="codespan">'series'</code>：按照系列分配调色盘中的颜色，同一系列中的所有数据都是用相同的颜色；</li>
     * <li><code class="codespan">'data'</code>：按照数据项分配调色盘中的颜色，每个数据项都使用不同的颜色。</li>
     * </ul>
     */
    private String colorBy;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.legendHoverLink">#series-pie.legendHoverLink</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否启用<a href="https://echarts.apache.org/zh/option.html#legend">图例</a> hover 时的联动高亮。</p>
     */
    private Boolean legendHoverLink;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.selectedMode">#series-pie.selectedMode</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>选中模式的配置，表示是否支持多个选中，默认关闭，支持布尔值和字符串，字符串取值可选<code class="codespan">'single'</code>，<code class="codespan">'multiple'</code>，<code class="codespan">'series'</code> 分别表示单选，多选以及选择整个系列。</p>
     * <blockquote>
     * <p>从 v5.3.0 开始支持 <code class="codespan">'series'</code>。</p>
     * </blockquote>
     */
    private Object selectedMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.selectedOffset">#series-pie.selectedOffset</a>
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>选中扇区的偏移距离。</p>
     */
    private Integer selectedOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.clockwise">#series-pie.clockwise</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>饼图的扇区是否是顺时针排布。</p>
     */
    private Boolean clockwise;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.startAngle">#series-pie.startAngle</a>
     * <br/>默认值: 90
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>起始角度，支持范围[0, 360]。</p>
     */
    private Integer startAngle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.minAngle">#series-pie.minAngle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>最小的扇区角度（0 ~ 360），用于防止某个值过小导致扇区太小影响交互。</p>
     */
    private Integer minAngle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.minShowLabelAngle">#series-pie.minShowLabelAngle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>小于这个角度（0 ~ 360）的扇区，不显示标签（label 和 labelLine）。</p>
     */
    private Integer minShowLabelAngle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.roseType">#series-pie.roseType</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>是否展示成南丁格尔图，通过半径区分数据大小。可选择两种模式：</p>
     * <ul>
     * <li><code class="codespan">'radius'</code> 扇区圆心角展现数据的百分比，半径展现数据的大小。</li>
     * <li><code class="codespan">'area'</code> 所有扇区圆心角相同，仅通过半径展现数据大小。</li>
     * </ul>
     */
    private Object roseType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.avoidLabelOverlap">#series-pie.avoidLabelOverlap</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否启用防止标签重叠策略，默认开启，在标签拥挤重叠的情况下会挪动各个标签的位置，防止标签间的重叠。</p>
     * <p>如果不需要开启该策略，例如<a href="https://echarts.apache.org/examples/zh/editor.html?c=pie-doughnut" target="_blank">圆环图</a>这个例子中需要强制所有标签放在中心位置，可以将该值设为 <code class="codespan">false</code>。</p>
     */
    private Boolean avoidLabelOverlap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.stillShowZeroSum">#series-pie.stillShowZeroSum</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否在数据和为<code class="codespan">0</code>（一般情况下所有数据为<code class="codespan">0</code>） 的时候仍显示扇区。</p>
     */
    private Boolean stillShowZeroSum;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.cursor">#series-pie.cursor</a>
     * <br/>默认值: 'pointer'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>鼠标悬浮时在图形元素上时鼠标的样式是什么。同 CSS 的 <code class="codespan">cursor</code>。</p>
     */
    private String cursor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.zlevel">#series-pie.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.z">#series-pie.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.left">#series-pie.left</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>pie chart组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.top">#series-pie.top</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>pie chart组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.right">#series-pie.right</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>pie chart组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.bottom">#series-pie.bottom</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>pie chart组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.width">#series-pie.width</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>pie chart组件的宽度。默认自适应。</p>
     */
    private Object width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.height">#series-pie.height</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>pie chart组件的高度。默认自适应。</p>
     */
    private Object height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.showEmptyCircle">#series-pie.showEmptyCircle</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.2.0</code> 开始支持</p>
     * </blockquote>
     * <p>是否在无数据的时候显示一个占位圆。</p>
     */
    private Boolean showEmptyCircle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.emptyCircleStyle">#series-pie.emptyCircleStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.2.0</code> 开始支持</p>
     * </blockquote>
     * <p>占位圆样式。</p>
     */
    private EmptyCircleStyle emptyCircleStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.label">#series-pie.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>饼图图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.labelLine">#series-pie.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。在 <a href="https://echarts.apache.org/zh/option.html#series-pie.label.position">label 位置</a> 设置为<code class="codespan">'outside'</code>的时候会显示视觉引导线。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.labelLayout">#series-pie.labelLayout</a>
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
     */
    private LabelLayout labelLayout;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.itemStyle">#series-pie.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p> 图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.emphasis">#series-pie.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态的扇区和标签样式。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.blur">#series-pie.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出状态的扇区和标签样式。开启 <a href="https://echarts.apache.org/zh/option.html#series-pie.emphasis.focus">emphasis.focus</a> 后有效。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.select">#series-pie.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>选中状态的扇区和标签样式。开启 <a href="https://echarts.apache.org/zh/option.html#series-pie.selectedMode">selectedMode</a> 后有效。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.center">#series-pie.center</a>
     * <br/>默认值: ['50%', '50%']
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>饼图的中心（圆心）坐标，数组的第一项是横坐标，第二项是纵坐标。</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.radius">#series-pie.radius</a>
     * <br/>默认值: [0, '75%']
     * <br/>js类型: ["number","string","Array"]
     * <br/>描述:
     * <p>饼图的半径。可以为如下类型：</p>
     * <ul>
     * <li><code class="codespan">number</code>：直接指定外半径值。</li>
     * <li><code class="codespan">string</code>：例如，<code class="codespan">'20%'</code>，表示外半径为可视区尺寸（容器高宽中较小一项）的 20% 长度。</li>
     * </ul>
     * <ul>
     * <li><code class="codespan">Array.&lt;number|string&gt;</code>：数组的第一项是内半径，第二项是外半径。每一项遵从上述 <code class="codespan">number</code> <code class="codespan">string</code> 的描述。</li>
     * </ul>
     * <p>可以将内半径设大显示成圆环图（Donut chart）。</p>
     */
    private Object radius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.seriesLayoutBy">#series-pie.seriesLayoutBy</a>
     * <br/>默认值: 'column'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>当使用 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a> 时，<code class="codespan">seriesLayoutBy</code> 指定了 <code class="codespan">dataset</code> 中用行还是列对应到系列上，也就是说，系列“排布”到 <code class="codespan">dataset</code> 的行还是列上。可取值：</p>
     * <ul>
     * <li>'column'：默认，<code class="codespan">dataset</code> 的列对应于系列，从而 <code class="codespan">dataset</code> 中每一列是一个维度（dimension）。</li>
     * <li>'row'：<code class="codespan">dataset</code> 的行对应于系列，从而 <code class="codespan">dataset</code> 中每一行是一个维度（dimension）。</li>
     * </ul>
     * <p>参见这个 <a href="https://echarts.apache.org/examples/zh/editor.html?c=dataset-series-layout-by&amp;theme=lite" target="_blank">示例</a></p>
     */
    private String seriesLayoutBy;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.datasetIndex">#series-pie.datasetIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果 <a href="https://echarts.apache.org/zh/option.html#series.data">series.data</a> 没有指定，并且 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a> 存在，那么就会使用 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>。<code class="codespan">datasetIndex</code> 指定本系列使用那个 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>。</p>
     */
    private Integer datasetIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.dimensions">#series-pie.dimensions</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>使用 dimensions 定义 <code class="codespan">series.data</code> 或者 <code class="codespan">dataset.source</code> 的每个维度的信息。</p>
     * <p>注意：如果使用了 <a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>，那么可以在 <a href="https://echarts.apache.org/zh/option.html#dataset.dimensions">dataset.dimensions</a> 中定义 dimension ，或者在 <a href="https://echarts.apache.org/zh/option.html#dataset.source">dataset.source</a> 的第一行/列中给出 dimension 名称。于是就不用在这里指定 dimension。但如果在这里指定了 <code class="codespan">dimensions</code>，那么优先使用这里的。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">option = {
     *     dataset: {
     *         source: [
     *             <span class="hljs-comment">// 有了上面 dimensions 定义后，下面这五个维度的名称分别为：</span>
     *             <span class="hljs-comment">// 'date', 'open', 'close', 'highest', 'lowest'</span>
     *             [<span class="hljs-number">12</span>, <span class="hljs-number">44</span>, <span class="hljs-number">55</span>, <span class="hljs-number">66</span>, <span class="hljs-number">2</span>],
     *             [<span class="hljs-number">23</span>, <span class="hljs-number">6</span>, <span class="hljs-number">16</span>, <span class="hljs-number">23</span>, <span class="hljs-number">1</span>],
     *             ...
     *         ]
     *     },
     *     series: {
     *         <span class="hljs-keyword">type</span>: <span class="hljs-string">'xxx'</span>,
     *         <span class="hljs-comment">// 定义了每个维度的名称。这个名称会被显示到默认的 tooltip 中。</span>
     *         dimensions: [<span class="hljs-string">'date'</span>, <span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>]
     *     }
     * }
     * </code></pre>
     * <pre><code class="lang-ts hljs typescript">series: {
     *     <span class="hljs-keyword">type</span>: <span class="hljs-string">'xxx'</span>,
     *     dimensions: [
     *         <span class="hljs-literal">null</span>,                <span class="hljs-comment">// 如果此维度不想给出定义，则使用 null 即可</span>
     *         {<span class="hljs-keyword">type</span>: <span class="hljs-string">'ordinal'</span>},   <span class="hljs-comment">// 只定义此维度的类型。</span>
     *                              <span class="hljs-comment">// 'ordinal' 表示离散型，一般文本使用这种类型。</span>
     *                              <span class="hljs-comment">// 如果类型没有被定义，会自动猜测类型。</span>
     *         {name: <span class="hljs-string">'good'</span>, <span class="hljs-keyword">type</span>: <span class="hljs-string">'number'</span>},
     *         <span class="hljs-string">'bad'</span>                <span class="hljs-comment">// 等同于 {name: 'bad'}</span>
     *     ]
     * }
     * </code></pre>
     * <p><code class="codespan">dimensions</code> 数组中的每一项可以是：</p>
     * <ul>
     * <li><code class="codespan">string</code>，如 <code class="codespan">'someName'</code>，等同于 <code class="codespan">{name: 'someName'}</code></li>
     * <li><code class="codespan">Object</code>，属性可以有：<ul>
     * <li>name: <code class="codespan">string</code>。</li>
     * <li>type: <code class="codespan">string</code>，支持<ul>
     * <li><code class="codespan">number</code>，默认，表示普通数据。</li>
     * <li><code class="codespan">ordinal</code>，对于类目、文本这些 string 类型的数据，如果需要能在数轴上使用，须是 'ordinal' 类型。ECharts 默认会自动判断这个类型。但是自动判断也是不可能很完备的，所以使用者也可以手动强制指定。</li>
     * <li><code class="codespan">float</code>，即 <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array" target="_blank">Float64Array</a>。</li>
     * <li><code class="codespan">int</code>，即 <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array" target="_blank">Int32Array</a>。</li>
     * <li><code class="codespan">time</code>，表示时间类型。设置成 'time' 则能支持自动解析数据成时间戳（timestamp），比如该维度的数据是 '2017-05-10'，会自动被解析。时间类型的支持参见 <a href="https://echarts.apache.org/zh/option.html#series.data">data</a>。</li>
     * </ul>
     * </li>
     * <li>displayName: 一般用于 tooltip 中维度名的展示。<code class="codespan">string</code> 如果没有指定，默认使用 name 来展示。</li>
     * </ul>
     * </li>
     * </ul>
     * <p>值得一提的是，当定义了 <code class="codespan">dimensions</code> 后，默认 <code class="codespan">tooltip</code> 中对个维度的显示，会变为『竖排』，从而方便显示每个维度的名称。如果没有定义 <code class="codespan">dimensions</code>，则默认 <code class="codespan">tooltip</code> 会横排显示，且只显示数值没有维度名称可显示。</p>
     */
    private List<?> dimensions;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.encode">#series-pie.encode</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>可以定义 <code class="codespan">data</code> 的哪个维度被编码成什么。比如：</p>
     * <pre><code class="lang-ts hljs typescript">option = {
     *     dataset: {
     *         source: [
     *             <span class="hljs-comment">// 每一列称为一个『维度』。</span>
     *             <span class="hljs-comment">// 这里分别是维度 0、1、2、3、4。</span>
     *             [<span class="hljs-number">12</span>, <span class="hljs-number">44</span>, <span class="hljs-number">55</span>, <span class="hljs-number">66</span>, <span class="hljs-number">2</span>],
     *             [<span class="hljs-number">23</span>, <span class="hljs-number">6</span>, <span class="hljs-number">16</span>, <span class="hljs-number">23</span>, <span class="hljs-number">1</span>],
     *             ...
     *         ]
     *     },
     *     series: {
     *         <span class="hljs-keyword">type</span>: <span class="hljs-string">'xxx'</span>,
     *         encode: {
     *             x: [<span class="hljs-number">3</span>, <span class="hljs-number">1</span>, <span class="hljs-number">5</span>],      <span class="hljs-comment">// 表示维度 3、1、5 映射到 x 轴。</span>
     *             y: <span class="hljs-number">2</span>,              <span class="hljs-comment">// 表示维度 2 映射到 y 轴。</span>
     *             tooltip: [<span class="hljs-number">3</span>, <span class="hljs-number">2</span>, <span class="hljs-number">4</span>] <span class="hljs-comment">// 表示维度 3、2、4 会在 tooltip 中显示。</span>
     *         }
     *     }
     * }
     * </code></pre>
     * <p>当使用 <a href="https://echarts.apache.org/zh/option.html#series.dimensions">dimensions</a> 给维度定义名称后，<code class="codespan">encode</code> 中可直接引用名称，例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: {
     *     <span class="hljs-keyword">type</span>: <span class="hljs-string">'xxx'</span>,
     *     dimensions: [<span class="hljs-string">'date'</span>, <span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>],
     *     encode: {
     *         x: <span class="hljs-string">'date'</span>,
     *         y: [<span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>]
     *     }
     * }
     * </code></pre>
     * <p><code class="codespan">encode</code> 声明的基本结构如下，其中冒号左边是坐标系、标签等特定名称，如 <code class="codespan">'x'</code>, <code class="codespan">'y'</code>, <code class="codespan">'tooltip'</code> 等，冒号右边是数据中的维度名（string 格式）或者维度的序号（number 格式，从 0 开始计数），可以指定一个或多个维度（使用数组）。通常情况下，下面各种信息不需要所有的都写，按需写即可。</p>
     * <p>下面是 encode 支持的属性：</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-comment">// 在任何坐标系和系列中，都支持：</span>
     * encode: {
     *     <span class="hljs-comment">// 使用 “名为 product 的维度” 和 “名为 score 的维度” 的值在 tooltip 中显示</span>
     *     tooltip: [<span class="hljs-string">'product'</span>, <span class="hljs-string">'score'</span>]
     *     <span class="hljs-comment">// 使用第一个维度和第三个维度的维度名连起来作为系列名。（有时候名字比较长，这可以避免在 series.name 重复输入这些名字）</span>
     *     seriesName: [<span class="hljs-number">1</span>, <span class="hljs-number">3</span>],
     *     <span class="hljs-comment">// 表示使用第二个维度中的值作为 id。这在使用 setOption 动态更新数据时有用处，可以使新老数据用 id 对应起来，从而能够产生合适的数据更新动画。</span>
     *     itemId: <span class="hljs-number">2</span>,
     *     <span class="hljs-comment">// 指定数据项的名称使用第三个维度在饼图等图表中有用，可以使这个名字显示在图例（legend）中。</span>
     *     itemName: <span class="hljs-number">3</span>,
     *     <span class="hljs-comment">// 指定数据项的组 ID (groupID)，组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画，具体见 universalTransition</span>
     *     itemGroupId: <span class="hljs-number">4</span>
     * }
     *
     * <span class="hljs-comment">// 直角坐标系（grid/cartesian）特有的属性：</span>
     * encode: {
     *     <span class="hljs-comment">// 把 “维度1”、“维度5”、“名为 score 的维度” 映射到 X 轴：</span>
     *     x: [<span class="hljs-number">1</span>, <span class="hljs-number">5</span>, <span class="hljs-string">'score'</span>],
     *     <span class="hljs-comment">// 把“维度0”映射到 Y 轴。</span>
     *     y: <span class="hljs-number">0</span>
     * }
     *
     * <span class="hljs-comment">// 单轴（singleAxis）特有的属性：</span>
     * encode: {
     *     single: <span class="hljs-number">3</span>
     * }
     *
     * <span class="hljs-comment">// 极坐标系（polar）特有的属性：</span>
     * encode: {
     *     radius: <span class="hljs-number">3</span>,
     *     angle: <span class="hljs-number">2</span>
     * }
     *
     * <span class="hljs-comment">// 地理坐标系（geo）特有的属性：</span>
     * encode: {
     *     lng: <span class="hljs-number">3</span>,
     *     lat: <span class="hljs-number">2</span>
     * }
     *
     * <span class="hljs-comment">// 对于一些没有坐标系的图表，例如饼图、漏斗图等，可以是：</span>
     * encode: {
     *     value: <span class="hljs-number">3</span>
     * }
     * </code></pre>
     * <p>这是个更丰富的 <code class="codespan">encode</code> 的<a href="https://echarts.apache.org/examples/zh/view.html?c=dataset-encode1&amp;edit=1&amp;reset=1" target="_blank">示例</a>：</p>
     * <p>特殊地，在 <a href="https://echarts.apache.org/zh/option.html#series-custom">自定义系列（custom series）</a> 中，<code class="codespan">encode</code> 中轴可以不指定或设置为 <code class="codespan">null/undefined</code>，从而使系列免于受这个轴控制，也就是说，轴的范围（extent）不会受此系列数值的影响，轴被 <a href="https://echarts.apache.org/zh/option.html#dataZoom">dataZoom</a> 控制时也不会过滤掉这个系列：</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-keyword">var</span> option = {
     *     xAxis: {},
     *     yAxis: {},
     *     dataZoom: [{
     *         xAxisIndex: <span class="hljs-number">0</span>
     *     }, {
     *         yAxisIndex: <span class="hljs-number">0</span>
     *     }],
     *     series: {
     *         <span class="hljs-keyword">type</span>: <span class="hljs-string">'custom'</span>,
     *         renderItem: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">params, api</span>) </span>{
     *             <span class="hljs-keyword">return</span> {
     *                 <span class="hljs-keyword">type</span>: <span class="hljs-string">'circle'</span>,
     *                 shape: {
     *                     cx: <span class="hljs-number">100</span>, <span class="hljs-comment">// x 位置永远为 100</span>
     *                     cy: api.coord([<span class="hljs-number">0</span>, api.value(<span class="hljs-number">0</span>)])[<span class="hljs-number">1</span>],
     *                     r: <span class="hljs-number">30</span>
     *                 },
     *                 style: {
     *                     fill: <span class="hljs-string">'blue'</span>
     *                 }
     *             };
     *         },
     *         encode: {
     *             <span class="hljs-comment">// 这样这个系列就不会被 x 轴以及 x</span>
     *             <span class="hljs-comment">// 轴上的 dataZoom 控制了。</span>
     *             x: <span class="hljs-number">-1</span>,
     *             y: <span class="hljs-number">1</span>
     *         },
     *         data: [ ... ]
     *     }
     * };
     * </code></pre>
     */
    private Object encode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.dataGroupId">#series-pie.dataGroupId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该系列所有数据共有的组 ID。组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画。</p>
     * <p>如果你使用了<a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>组件来表达数据，推荐使用<code class="codespan">encode.itemGroupID</code>来指定哪个维度被编码为组 ID。</p>
     */
    private String dataGroupId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.data">#series-pie.data</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>系列中的数据内容数组。数组项可以为单个数值，如：</p>
     * <pre><code class="lang-ts hljs typescript">[<span class="hljs-number">12</span>, <span class="hljs-number">34</span>, <span class="hljs-number">56</span>, <span class="hljs-number">10</span>, <span class="hljs-number">23</span>]
     * </code></pre>
     * <p>如果需要在数据中加入其它维度给 <a href="https://echarts.apache.org/zh/option.html#visualMap">visualMap</a> 组件用来映射到颜色等其它图形属性。每个数据项也可以是数组，如：</p>
     * <pre><code class="lang-ts hljs typescript">[[<span class="hljs-number">12</span>, <span class="hljs-number">14</span>], [<span class="hljs-number">34</span>, <span class="hljs-number">50</span>], [<span class="hljs-number">56</span>, <span class="hljs-number">30</span>], [<span class="hljs-number">10</span>, <span class="hljs-number">15</span>], [<span class="hljs-number">23</span>, <span class="hljs-number">10</span>]]
     * </code></pre>
     * <p>这时候可以将每项数组中的第二个值指定给 <a href="https://echarts.apache.org/zh/option.html#visualMap">visualMap</a> 组件。</p>
     * <p>更多时候我们需要指定每个数据项的名称，这时候需要每个项为一个对象：</p>
     * <pre><code class="lang-ts hljs typescript">[{
     *     <span class="hljs-comment">// 数据项的名称</span>
     *     name: <span class="hljs-string">'数据1'</span>,
     *     <span class="hljs-comment">// 数据项值8</span>
     *     value: <span class="hljs-number">10</span>
     * }, {
     *     name: <span class="hljs-string">'数据2'</span>,
     *     value: <span class="hljs-number">20</span>
     * }]
     * </code></pre>
     * <p>需要对个别内容指定进行个性化定义时：</p>
     * <pre><code class="lang-ts hljs typescript">[{
     *     name: <span class="hljs-string">'数据1'</span>,
     *     value: <span class="hljs-number">10</span>
     * }, {
     *     <span class="hljs-comment">// 数据项名称</span>
     *     name: <span class="hljs-string">'数据2'</span>,
     *     value : <span class="hljs-number">56</span>,
     *     <span class="hljs-comment">//自定义特殊 tooltip，仅对该数据项有效</span>
     *     tooltip:{},
     *     <span class="hljs-comment">//自定义特殊itemStyle，仅对该item有效</span>
     *     itemStyle:{}
     * }]
     * </code></pre>
     */
    private List<Data> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.markPoint">#series-pie.markPoint</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标注。</p>
     */
    private MarkPoint markPoint;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.markLine">#series-pie.markLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标线。</p>
     */
    private MarkLine markLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.markArea">#series-pie.markArea</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。</p>
     */
    private MarkArea markArea;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.silent">#series-pie.silent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.animationType">#series-pie.animationType</a>
     * <br/>默认值: 'expansion'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画效果，可选</p>
     * <ul>
     * <li><code class="codespan">'expansion'</code> 默认沿圆弧展开的效果。</li>
     * <li><code class="codespan">'scale'</code> 缩放效果，配合设置 <code class="codespan">animationEasing='elasticOut'</code> 可以做成 popup 的效果。</li>
     * </ul>
     */
    private String animationType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.animationTypeUpdate">#series-pie.animationTypeUpdate</a>
     * <br/>默认值: 'transition'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.4.0</code> 开始支持</p>
     * </blockquote>
     * <p>更新数据时的动画效果，可选：</p>
     * <ul>
     * <li><code class="codespan">'transition'</code> 通过改变起始和终止角度，从之前的数据过渡到新的数据。</li>
     * <li><code class="codespan">'expansion'</code> 数据将整体重新沿圆弧展开。</li>
     * </ul>
     */
    private String animationTypeUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.animation">#series-pie.animation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.animationThreshold">#series-pie.animationThreshold</a>
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.animationDuration">#series-pie.animationDuration</a>
     * <br/>默认值: 1000
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>初始动画的时长，支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的初始动画效果：</p>
     * <pre><code class="lang-ts hljs typescript">animationDuration: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDuration;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.animationEasing">#series-pie.animationEasing</a>
     * <br/>默认值: 'cubicOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.animationDelay">#series-pie.animationDelay</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>初始动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的初始动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-ts hljs typescript">animationDelay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.animationDurationUpdate">#series-pie.animationDurationUpdate</a>
     * <br/>默认值: 300
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的时长。</p>
     * <p>支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的更新动画效果：</p>
     * <pre><code class="lang-ts hljs typescript">animationDurationUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDurationUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.animationEasingUpdate">#series-pie.animationEasingUpdate</a>
     * <br/>默认值: 'cubicInOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.animationDelayUpdate">#series-pie.animationDelayUpdate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-ts hljs typescript">animationDelayUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelayUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.universalTransition">#series-pie.universalTransition</a>
     * <br/>默认值: 无
     * <br/>js类型: ["object"]
     * <br/>描述:
     * <p>全局过渡动画相关的配置。</p>
     * <p>全局过渡动画（Universal Transition）提供了任意系列之间进行变形动画的功能。开启该功能后，每次<code class="codespan">setOption</code>，相同<code class="codespan">id</code>的系列之间会自动关联进行动画的过渡，更细粒度的关联配置见<code class="codespan">universalTransition.seriesKey</code>配置。</p>
     * <p>通过配置<code class="codespan">encode.itemGroupId</code>或者<code class="codespan">dataGroupId</code>等指定数据的分组，还可以实现诸如下钻，聚合等一对多或者多对一的动画。</p>
     * <p>可以直接在系列中配置 <code class="codespan">universalTransition: true</code> 开启该功能。也可以提供一个对象进行更多属性的配置。</p>
     */
    private UniversalTransition universalTransition;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.tooltip">#series-pie.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
