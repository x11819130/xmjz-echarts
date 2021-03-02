package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.barSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar">https://echarts.apache.org/zh/option.html#series-bar</a>
 * <br/>序号: 0
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>柱状图</strong></p>
 * <p>柱状图（或称条形图）是一种通过柱形的高度（横向的情况下则是宽度）来表现数据大小的一种常用图表类型。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class BarSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.type">https://echarts.apache.org/zh/option.html#series-bar.type</a>
     * <br/>序号: 1
     * <br/>默认值: bar
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.id">https://echarts.apache.org/zh/option.html#series-bar.id</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.name">https://echarts.apache.org/zh/option.html#series-bar.name</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.legendHoverLink">https://echarts.apache.org/zh/option.html#series-bar.legendHoverLink</a>
     * <br/>序号: 4
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否启用<a href="#legend">图例</a> hover 时的联动高亮。</p>
     */
    private Boolean legendHoverLink;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.coordinateSystem">https://echarts.apache.org/zh/option.html#series-bar.coordinateSystem</a>
     * <br/>序号: 5
     * <br/>默认值: cartesian2d
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该系列使用的坐标系，可选：</p>
     * <ul>
     * <li><p><code class="codespan">'cartesian2d'</code></p>
     * <p>  使用二维的直角坐标系（也称笛卡尔坐标系），通过 <a href="#series-bar.xAxisIndex">xAxisIndex</a>, <a href="#series-bar.yAxisIndex">yAxisIndex</a>指定相应的坐标轴组件。</p>
     * </li>
     * </ul>
     */
    private String coordinateSystem;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.xAxisIndex">https://echarts.apache.org/zh/option.html#series-bar.xAxisIndex</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的 <a href="#xAxis">x 轴</a>的 index，在单个图表实例中存在多个 x 轴的时候有用。</p>
     */
    private Integer xAxisIndex;

    public Integer getxAxisIndex() {
        return this.xAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.yAxisIndex">https://echarts.apache.org/zh/option.html#series-bar.yAxisIndex</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的 <a href="#yAxis">y 轴</a>的 index，在单个图表实例中存在多个 y轴的时候有用。</p>
     */
    private Integer yAxisIndex;

    public Integer getyAxisIndex() {
        return this.yAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.roundCap">https://echarts.apache.org/zh/option.html#series-bar.roundCap</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.5.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>是否在环形柱条两侧使用圆弧效果。</p>
     * <p>仅对极坐标系柱状图有效。</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=polar-roundCap&amp;reset=1&amp;edit=1" width="800" height="500"></iframe>
     */
    private Boolean roundCap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.showBackground">https://echarts.apache.org/zh/option.html#series-bar.showBackground</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.7.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>是否显示柱条的背景色。通过 <a href="#series-bar.backgroundStyle">backgroundStyle</a> 配置背景样式。</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=bar-background&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     */
    private Boolean showBackground;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle">https://echarts.apache.org/zh/option.html#series-bar.backgroundStyle</a>
     * <br/>序号: 10
     * <br/>默认值: rgba(180, 180, 180, 0.2)
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.7.0</code> 开始支持</p>
     * </blockquote>
     * <p>每一个柱条的背景样式。需要将 <a href="#series-bar.showBackground">showBackground</a> 设置为 <code class="codespan">true</code> 时才有效。</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=bar-background&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     */
    private BackgroundStyle backgroundStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.label">https://echarts.apache.org/zh/option.html#series-bar.label</a>
     * <br/>序号: 11
     * <br/>默认值: inside
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.labelLine">https://echarts.apache.org/zh/option.html#series-bar.labelLine</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.itemStyle">https://echarts.apache.org/zh/option.html#series-bar.itemStyle</a>
     * <br/>序号: 13
     * <br/>默认值: 自适应
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p> 图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.labelLayout">https://echarts.apache.org/zh/option.html#series-bar.labelLayout</a>
     * <br/>序号: 14
     * <br/>默认值: 无
     * <br/>js类型: ["Object","Function"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>标签的统一布局配置。</p>
     * <p>该配置项是在每个系列默认的标签布局基础上，统一调整标签的<code class="codespan">(x, y)</code>位置，标签对齐等属性以实现想要的标签布局效果。</p>
     * <p>该配置项也可以是一个有如下参数的回调函数</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 标签对应数据的 dataIndex</span>
     * <span class="hljs-attr">dataIndex</span>: number
     * <span class="hljs-comment">// 标签对应的数据类型，只在关系图中会有 node 和 edge 数据类型的区分</span>
     * dataType?: string
     * <span class="hljs-comment">// 标签对应的系列的 index</span>
     * <span class="hljs-attr">seriesIndex</span>: number
     * <span class="hljs-comment">// 标签显示的文本</span>
     * <span class="hljs-attr">text</span>: string
     * <span class="hljs-comment">// 默认的标签的包围盒，由系列默认的标签布局决定</span>
     * <span class="hljs-attr">labelRect</span>: {<span class="hljs-attr">x</span>: number, <span class="hljs-attr">y</span>: number, <span class="hljs-attr">width</span>: number, <span class="hljs-attr">height</span>: number}
     * <span class="hljs-comment">// 默认的标签水平对齐</span>
     * <span class="hljs-attr">align</span>: <span class="hljs-string">'left'</span> | <span class="hljs-string">'center'</span> | <span class="hljs-string">'right'</span>
     * <span class="hljs-comment">// 默认的标签垂直对齐</span>
     * <span class="hljs-attr">verticalAlign</span>: <span class="hljs-string">'top'</span> | <span class="hljs-string">'middle'</span> | <span class="hljs-string">'bottom'</span>
     * <span class="hljs-comment">// 标签所对应的数据图形的包围盒，可用于定位标签位置</span>
     * <span class="hljs-attr">rect</span>: {<span class="hljs-attr">x</span>: number, <span class="hljs-attr">y</span>: number, <span class="hljs-attr">width</span>: number, <span class="hljs-attr">height</span>: number}
     * <span class="hljs-comment">// 默认引导线的位置，目前只有饼图(pie)和漏斗图(funnel)有默认标签位置</span>
     * <span class="hljs-comment">// 如果没有该值则为 null</span>
     * labelLinePoints?: number[][]
     * </code></pre>
     * <p><strong>示例：</strong></p>
     * <p>将标签显示在图形右侧 10px 的位置，并且垂直居中：</p>
     * <pre><code class="lang-js hljs javascript">labelLayout(params) {
     *     <span class="hljs-keyword">return</span> {
     *         <span class="hljs-attr">x</span>: params.rect.x + <span class="hljs-number">10</span>,
     *         <span class="hljs-attr">y</span>: params.rect.y + params.rect.height / <span class="hljs-number">2</span>,
     *         <span class="hljs-attr">verticalAlign</span>: <span class="hljs-string">'middle'</span>,
     *         <span class="hljs-attr">align</span>: <span class="hljs-string">'left'</span>
     *     }
     * }
     * </code></pre>
     * <p>根据图形的包围盒尺寸决定文本尺寸</p>
     * <pre><code class="lang-js hljs javascript">
     * labelLayout(params) {
     *     <span class="hljs-keyword">return</span> {
     *         <span class="hljs-attr">fontSize</span>: <span class="hljs-built_in">Math</span>.max(params.rect.width / <span class="hljs-number">10</span>, <span class="hljs-number">5</span>)
     *     };
     * }
     * </code></pre>
     */
    private LabelLayout labelLayout;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.emphasis">https://echarts.apache.org/zh/option.html#series-bar.emphasis</a>
     * <br/>序号: 15
     * <br/>默认值: none
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮的图形样式和标签样式。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.blur">https://echarts.apache.org/zh/option.html#series-bar.blur</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>淡出时的图形样式和标签样式。开启 <a href="#series-bar.emphasis.focus">emphasis.focus</a> 后有效。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.select">https://echarts.apache.org/zh/option.html#series-bar.select</a>
     * <br/>序号: 17
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>数据选中时的图形样式和标签样式。开启 <a href="#series-bar.selectedMode">selectedMode</a> 后有效。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.selectedMode">https://echarts.apache.org/zh/option.html#series-bar.selectedMode</a>
     * <br/>序号: 18
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>选中模式的配置，表示是否支持多个选中，默认关闭，支持布尔值和字符串，字符串取值可选<code class="codespan">'single'</code>，<code class="codespan">'multiple'</code>，分别表示单选还是多选。</p>
     */
    private Object selectedMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.stack">https://echarts.apache.org/zh/option.html#series-bar.stack</a>
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据堆叠，同个类目轴上系列配置相同的<code class="codespan">stack</code>值可以堆叠放置。</p>
     */
    private String stack;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.sampling">https://echarts.apache.org/zh/option.html#series-bar.sampling</a>
     * <br/>序号: 20
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>柱状图在数据量远大于像素点时候的降采样策略，开启后可以有效的优化图表的绘制效率，默认关闭，也就是全部绘制不过滤数据点。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'lttb'</code> 采用 Largest-Triangle-Three-Bucket 算法，可以最大程度保证采样后线条的趋势，形状和极值。</li>
     * <li><code class="codespan">'average'</code> 取过滤点的平均值</li>
     * <li><code class="codespan">'max'</code> 取过滤点的最大值</li>
     * <li><code class="codespan">'min'</code> 取过滤点的最小值</li>
     * <li><code class="codespan">'sum'</code> 取过滤点的和</li>
     * </ul>
     */
    private String sampling;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.cursor">https://echarts.apache.org/zh/option.html#series-bar.cursor</a>
     * <br/>序号: 21
     * <br/>默认值: pointer
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>鼠标悬浮时在图形元素上时鼠标的样式是什么。同 CSS 的 <code class="codespan">cursor</code>。</p>
     */
    private String cursor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.barWidth">https://echarts.apache.org/zh/option.html#series-bar.barWidth</a>
     * <br/>序号: 22
     * <br/>默认值: 自适应
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>柱条的宽度，不设时自适应。</p>
     *
     *
     *
     *
     * <p>可以是绝对值例如 <code class="codespan">40</code> 或者百分数例如 <code class="codespan">'60%'</code>。百分数基于自动计算出的每一类目的宽度。</p>
     * <p>在同一坐标系上，此属性会被多个 <code class="codespan">'bar'</code> 系列共享。此属性应设置于此坐标系中最后一个 <code class="codespan">'bar'</code> 系列上才会生效，并且是对此坐标系中所有 <code class="codespan">'bar'</code> 系列生效。</p>
     */
    private Object barWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.barMaxWidth">https://echarts.apache.org/zh/option.html#series-bar.barMaxWidth</a>
     * <br/>序号: 23
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>柱条的最大宽度。</p>
     * <p>比 <a href="#series-bar.barWidth">barWidth</a> 优先级高。</p>
     * <p>可以是绝对值例如 <code class="codespan">40</code> 或者百分数例如 <code class="codespan">'60%'</code>。百分数基于自动计算出的每一类目的宽度。</p>
     * <p>在同一坐标系上，此属性会被多个 <code class="codespan">'bar'</code> 系列共享。此属性应设置于此坐标系中最后一个 <code class="codespan">'bar'</code> 系列上才会生效，并且是对此坐标系中所有 <code class="codespan">'bar'</code> 系列生效。</p>
     */
    private Object barMaxWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.barMinWidth">https://echarts.apache.org/zh/option.html#series-bar.barMinWidth</a>
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>柱条的最小宽度。在直角坐标系中，默认值是 <code class="codespan">1</code>。否则默认值是 <code class="codespan">null</code>。</p>
     * <p>比 <a href="#series-bar.barWidth">barWidth</a> 优先级高。</p>
     * <p>可以是绝对值例如 <code class="codespan">40</code> 或者百分数例如 <code class="codespan">'60%'</code>。百分数基于自动计算出的每一类目的宽度。</p>
     * <p>在同一坐标系上，此属性会被多个 <code class="codespan">'bar'</code> 系列共享。此属性应设置于此坐标系中最后一个 <code class="codespan">'bar'</code> 系列上才会生效，并且是对此坐标系中所有 <code class="codespan">'bar'</code> 系列生效。</p>
     */
    private Object barMinWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.barMinHeight">https://echarts.apache.org/zh/option.html#series-bar.barMinHeight</a>
     * <br/>序号: 25
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>柱条最小高度，可用于防止某数据项的值过小而影响交互。</p>
     */
    private Integer barMinHeight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.barMinAngle">https://echarts.apache.org/zh/option.html#series-bar.barMinAngle</a>
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>柱条最小角度，可用于防止某数据项的值过小而影响交互。</p>
     * <p>仅对极坐标系柱状图有效。</p>
     */
    private Integer barMinAngle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.barGap">https://echarts.apache.org/zh/option.html#series-bar.barGap</a>
     * <br/>序号: 27
     * <br/>默认值: 30%
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>不同系列的柱间距离，为百分比（如 <code class="codespan">'30%'</code>，表示柱子宽度的 <code class="codespan">30%</code>）。</p>
     * <p>如果想要两个系列的柱子重叠，可以设置 barGap 为 <code class="codespan">'-100%'</code>。这在用柱子做背景的时候有用。</p>
     * <p>在同一坐标系上，此属性会被多个 <code class="codespan">'bar'</code> 系列共享。此属性应设置于此坐标系中最后一个 <code class="codespan">'bar'</code> 系列上才会生效，并且是对此坐标系中所有 <code class="codespan">'bar'</code> 系列生效。</p>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/barGrid-barGap&amp;reset=1&amp;edit=1" width="600" height="400"></iframe>
     */
    private String barGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.barCategoryGap">https://echarts.apache.org/zh/option.html#series-bar.barCategoryGap</a>
     * <br/>序号: 28
     * <br/>默认值: 20%
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>同一系列的柱间距离，默认为类目间距的20%，可设固定值</p>
     * <p>在同一坐标系上，此属性会被多个 <code class="codespan">'bar'</code> 系列共享。此属性应设置于此坐标系中最后一个 <code class="codespan">'bar'</code> 系列上才会生效，并且是对此坐标系中所有 <code class="codespan">'bar'</code> 系列生效。</p>
     */
    private String barCategoryGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.large">https://echarts.apache.org/zh/option.html#series-bar.large</a>
     * <br/>序号: 29
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启大数据量优化，在数据图形特别多而出现卡顿时候可以开启。</p>
     * <p>开启后配合 <code class="codespan">largeThreshold</code> 在数据量大于指定阈值的时候对绘制进行优化。</p>
     * <p>缺点：优化后不能自定义设置单个数据项的样式。</p>
     */
    private Boolean large;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.largeThreshold">https://echarts.apache.org/zh/option.html#series-bar.largeThreshold</a>
     * <br/>序号: 30
     * <br/>默认值: 400
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>开启绘制优化的阈值。</p>
     */
    private Integer largeThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.progressive">https://echarts.apache.org/zh/option.html#series-bar.progressive</a>
     * <br/>序号: 31
     * <br/>默认值: 5000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>渐进式渲染时每一帧绘制图形数量，设为 0 时不启用渐进式渲染，支持每个系列单独配置。</p>
     * <p>在图中有数千到几千万图形元素的时候，一下子把图形绘制出来，或者交互重绘的时候可能会造成界面的卡顿甚至假死。ECharts 4 开始全流程支持渐进渲染（progressive rendering），渲染的时候会把创建好的图形分到数帧中渲染，每一帧渲染只渲染指定数量的图形。</p>
     * <p>该配置项就是用于配置该系列每一帧渲染的图形数，可以根据图表图形复杂度的需要适当调整这个数字使得在不影响交互流畅性的前提下达到绘制速度的最大化。比如在 lines 图或者平行坐标中线宽大于 1 的 polyline 绘制会很慢，这个数字就可以设置小一点，而线宽小于等于 1 的 polyline 绘制非常快，该配置项就可以相对调得比较大。</p>
     */
    private Integer progressive;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.progressiveThreshold">https://echarts.apache.org/zh/option.html#series-bar.progressiveThreshold</a>
     * <br/>序号: 32
     * <br/>默认值: 3000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>启用渐进式渲染的图形数量阈值，在单个系列的图形数量超过该阈值时启用渐进式渲染。</p>
     */
    private Integer progressiveThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.progressiveChunkMode">https://echarts.apache.org/zh/option.html#series-bar.progressiveChunkMode</a>
     * <br/>序号: 33
     * <br/>默认值: mod
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>分片的方式。可选值：</p>
     * <ul>
     * <li><code class="codespan">'sequential'</code>: 按照数据的顺序分片。缺点是渲染过程不自然。</li>
     * <li><code class="codespan">'mod'</code>: 取模分片，即每个片段中的点会遍布于整个数据，从而能够视觉上均匀得渲染。</li>
     * </ul>
     */
    private String progressiveChunkMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.dimensions">https://echarts.apache.org/zh/option.html#series-bar.dimensions</a>
     * <br/>序号: 34
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>使用 dimensions 定义 <code class="codespan">series.data</code> 或者 <code class="codespan">dataset.source</code> 的每个维度的信息。</p>
     * <p>注意：如果使用了 <a href="#dataset">dataset</a>，那么可以在 <a href="#dataset.dimensions">dataset.dimensions</a> 中定义 dimension ，或者在 <a href="#dataset.source">dataset.source</a> 的第一行/列中给出 dimension 名称。于是就不用在这里指定 dimension。但如果在这里指定了 <code class="codespan">dimensions</code>，那么优先使用这里的。</p>
     * <p>例如：</p>
     * <pre><code class="lang-js hljs javascript">option = {
     *     <span class="hljs-attr">dataset</span>: {
     *         <span class="hljs-attr">source</span>: [
     *             <span class="hljs-comment">// 有了上面 dimensions 定义后，下面这五个维度的名称分别为：</span>
     *             <span class="hljs-comment">// 'date', 'open', 'close', 'highest', 'lowest'</span>
     *             [<span class="hljs-number">12</span>, <span class="hljs-number">44</span>, <span class="hljs-number">55</span>, <span class="hljs-number">66</span>, <span class="hljs-number">2</span>],
     *             [<span class="hljs-number">23</span>, <span class="hljs-number">6</span>, <span class="hljs-number">16</span>, <span class="hljs-number">23</span>, <span class="hljs-number">1</span>],
     *             ...
     *         ]
     *     },
     *     <span class="hljs-attr">series</span>: {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'xxx'</span>,
     *         <span class="hljs-comment">// 定义了每个维度的名称。这个名称会被显示到默认的 tooltip 中。</span>
     *         <span class="hljs-attr">dimensions</span>: [<span class="hljs-string">'date'</span>, <span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>]
     *     }
     * }
     * </code></pre>
     * <pre><code class="lang-js hljs javascript">series: {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'xxx'</span>,
     *     <span class="hljs-attr">dimensions</span>: [
     *         <span class="hljs-literal">null</span>,                <span class="hljs-comment">// 如果此维度不想给出定义，则使用 null 即可</span>
     *         {<span class="hljs-attr">type</span>: <span class="hljs-string">'ordinal'</span>},   <span class="hljs-comment">// 只定义此维度的类型。</span>
     *                              <span class="hljs-comment">// 'ordinal' 表示离散型，一般文本使用这种类型。</span>
     *                              <span class="hljs-comment">// 如果类型没有被定义，会自动猜测类型。</span>
     *         {<span class="hljs-attr">name</span>: <span class="hljs-string">'good'</span>, <span class="hljs-attr">type</span>: <span class="hljs-string">'number'</span>},
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
     * <li><code class="codespan">time</code>，表示时间类型。设置成 'time' 则能支持自动解析数据成时间戳（timestamp），比如该维度的数据是 '2017-05-10'，会自动被解析。时间类型的支持参见 <a href="#series.data">data</a>。</li>
     * </ul>
     * </li>
     * <li>displayName: 一般用于 tooltip 中维度名的展示。<code class="codespan">string</code> 如果没有指定，默认使用 name 来展示。</li>
     * </ul>
     * </li>
     * </ul>
     * <p>值得一提的是，当定义了 <code class="codespan">dimensions</code> 后，默认 <code class="codespan">tooltip</code> 中对个维度的显示，会变为『竖排』，从而方便显示每个维度的名称。如果没有定义 <code class="codespan">dimensions</code>，则默认 <code class="codespan">tooltip</code> 会横排显示，且只显示数值没有维度名称可显示。</p>
     */
    private List<Object> dimensions;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.encode">https://echarts.apache.org/zh/option.html#series-bar.encode</a>
     * <br/>序号: 35
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>可以定义 <code class="codespan">data</code> 的哪个维度被编码成什么。比如：</p>
     * <pre><code class="lang-js hljs javascript">option = {
     *     <span class="hljs-attr">dataset</span>: {
     *         <span class="hljs-attr">source</span>: [
     *             <span class="hljs-comment">// 每一列称为一个『维度』。</span>
     *             <span class="hljs-comment">// 这里分别是维度 0、1、2、3、4。</span>
     *             [<span class="hljs-number">12</span>, <span class="hljs-number">44</span>, <span class="hljs-number">55</span>, <span class="hljs-number">66</span>, <span class="hljs-number">2</span>],
     *             [<span class="hljs-number">23</span>, <span class="hljs-number">6</span>, <span class="hljs-number">16</span>, <span class="hljs-number">23</span>, <span class="hljs-number">1</span>],
     *             ...
     *         ]
     *     },
     *     <span class="hljs-attr">series</span>: {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'xxx'</span>,
     *         <span class="hljs-attr">encode</span>: {
     *             <span class="hljs-attr">x</span>: [<span class="hljs-number">3</span>, <span class="hljs-number">1</span>, <span class="hljs-number">5</span>],      <span class="hljs-comment">// 表示维度 3、1、5 映射到 x 轴。</span>
     *             <span class="hljs-attr">y</span>: <span class="hljs-number">2</span>,              <span class="hljs-comment">// 表示维度 2 映射到 y 轴。</span>
     *             <span class="hljs-attr">tooltip</span>: [<span class="hljs-number">3</span>, <span class="hljs-number">2</span>, <span class="hljs-number">4</span>] <span class="hljs-comment">// 表示维度 3、2、4 会在 tooltip 中显示。</span>
     *         }
     *     }
     * }
     * </code></pre>
     * <p>当使用 <a href="#series.dimensions">dimensions</a> 给维度定义名称后，<code class="codespan">encode</code> 中可直接引用名称，例如：</p>
     * <pre><code class="lang-js hljs javascript">series: {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'xxx'</span>,
     *     <span class="hljs-attr">dimensions</span>: [<span class="hljs-string">'date'</span>, <span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>],
     *     <span class="hljs-attr">encode</span>: {
     *         <span class="hljs-attr">x</span>: <span class="hljs-string">'date'</span>,
     *         <span class="hljs-attr">y</span>: [<span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>]
     *     }
     * }
     * </code></pre>
     * <p><code class="codespan">encode</code> 声明的基本结构如下，其中冒号左边是坐标系、标签等特定名称，如 <code class="codespan">'x'</code>, <code class="codespan">'y'</code>, <code class="codespan">'tooltip'</code> 等，冒号右边是数据中的维度名（string 格式）或者维度的序号（number 格式，从 0 开始计数），可以指定一个或多个维度（使用数组）。通常情况下，下面各种信息不需要所有的都写，按需写即可。</p>
     * <p>下面是 encode 支持的属性：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 在任何坐标系和系列中，都支持：</span>
     * <span class="hljs-attr">encode</span>: {
     *     <span class="hljs-comment">// 使用 “名为 product 的维度” 和 “名为 score 的维度” 的值在 tooltip 中显示</span>
     *     <span class="hljs-attr">tooltip</span>: [<span class="hljs-string">'product'</span>, <span class="hljs-string">'score'</span>]
     *     <span class="hljs-comment">// 使用 “维度 1” 和 “维度 3” 的维度名连起来作为系列名。（有时候名字比较长，这可以避免在 series.name 重复输入这些名字）</span>
     *     <span class="hljs-attr">seriesName</span>: [<span class="hljs-number">1</span>, <span class="hljs-number">3</span>],
     *     <span class="hljs-comment">// 表示使用 “维度2” 中的值作为 id。这在使用 setOption 动态更新数据时有用处，可以使新老数据用 id 对应起来，从而能够产生合适的数据更新动画。</span>
     *     <span class="hljs-attr">itemId</span>: <span class="hljs-number">2</span>,
     *     <span class="hljs-comment">// 指定数据项的名称使用 “维度3” 在饼图等图表中有用，可以使这个名字显示在图例（legend）中。</span>
     *     <span class="hljs-attr">itemName</span>: <span class="hljs-number">3</span>
     * }
     *
     * <span class="hljs-comment">// 直角坐标系（grid/cartesian）特有的属性：</span>
     * <span class="hljs-attr">encode</span>: {
     *     <span class="hljs-comment">// 把 “维度1”、“维度5”、“名为 score 的维度” 映射到 X 轴：</span>
     *     <span class="hljs-attr">x</span>: [<span class="hljs-number">1</span>, <span class="hljs-number">5</span>, <span class="hljs-string">'score'</span>],
     *     <span class="hljs-comment">// 把“维度0”映射到 Y 轴。</span>
     *     <span class="hljs-attr">y</span>: <span class="hljs-number">0</span>
     * }
     *
     * <span class="hljs-comment">// 单轴（singleAxis）特有的属性：</span>
     * <span class="hljs-attr">encode</span>: {
     *     <span class="hljs-attr">single</span>: <span class="hljs-number">3</span>
     * }
     *
     * <span class="hljs-comment">// 极坐标系（polar）特有的属性：</span>
     * <span class="hljs-attr">encode</span>: {
     *     <span class="hljs-attr">radius</span>: <span class="hljs-number">3</span>,
     *     <span class="hljs-attr">angle</span>: <span class="hljs-number">2</span>
     * }
     *
     * <span class="hljs-comment">// 地理坐标系（geo）特有的属性：</span>
     * <span class="hljs-attr">encode</span>: {
     *     <span class="hljs-attr">lng</span>: <span class="hljs-number">3</span>,
     *     <span class="hljs-attr">lat</span>: <span class="hljs-number">2</span>
     * }
     *
     * <span class="hljs-comment">// 对于一些没有坐标系的图表，例如饼图、漏斗图等，可以是：</span>
     * <span class="hljs-attr">encode</span>: {
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">3</span>
     * }
     * </code></pre>
     * <p>这是个更丰富的 <code class="codespan">encode</code> 的<a href="https://echarts.apache.org/examples/zh/view.html?c=dataset-encode1&amp;edit=1&amp;reset=1" target="_blank">示例</a>：</p>
     * <p>特殊地，在 <a href="#series-custom">自定义系列（custom series）</a> 中，<code class="codespan">encode</code> 中轴可以不指定或设置为 <code class="codespan">null/undefined</code>，从而使系列免于受这个轴控制，也就是说，轴的范围（extent）不会受此系列数值的影响，轴被 <a href="#dataZoom">dataZoom</a> 控制时也不会过滤掉这个系列：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-keyword">var</span> option = {
     *     <span class="hljs-attr">xAxis</span>: {},
     *     <span class="hljs-attr">yAxis</span>: {},
     *     <span class="hljs-attr">dataZoom</span>: [{
     *         <span class="hljs-attr">xAxisIndex</span>: <span class="hljs-number">0</span>
     *     }, {
     *         <span class="hljs-attr">yAxisIndex</span>: <span class="hljs-number">0</span>
     *     }],
     *     <span class="hljs-attr">series</span>: {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'custom'</span>,
     *         <span class="hljs-attr">renderItem</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">params, api</span>) </span>{
     *             <span class="hljs-keyword">return</span> {
     *                 <span class="hljs-attr">type</span>: <span class="hljs-string">'circle'</span>,
     *                 <span class="hljs-attr">shape</span>: {
     *                     <span class="hljs-attr">cx</span>: <span class="hljs-number">100</span>, <span class="hljs-comment">// x 位置永远为 100</span>
     *                     <span class="hljs-attr">cy</span>: api.coord([<span class="hljs-number">0</span>, api.value(<span class="hljs-number">0</span>)])[<span class="hljs-number">1</span>],
     *                     <span class="hljs-attr">r</span>: <span class="hljs-number">30</span>
     *                 },
     *                 <span class="hljs-attr">style</span>: {
     *                     <span class="hljs-attr">fill</span>: <span class="hljs-string">'blue'</span>
     *                 }
     *             };
     *         },
     *         <span class="hljs-attr">encode</span>: {
     *             <span class="hljs-comment">// 这样这个系列就不会被 x 轴以及 x</span>
     *             <span class="hljs-comment">// 轴上的 dataZoom 控制了。</span>
     *             <span class="hljs-attr">x</span>: <span class="hljs-number">-1</span>,
     *             <span class="hljs-attr">y</span>: <span class="hljs-number">1</span>
     *         },
     *         <span class="hljs-attr">data</span>: [ ... ]
     *     }
     * };
     * </code></pre>
     */
    private Object encode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.seriesLayoutBy">https://echarts.apache.org/zh/option.html#series-bar.seriesLayoutBy</a>
     * <br/>序号: 36
     * <br/>默认值: column
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>当使用 <a href="#dataset">dataset</a> 时，<code class="codespan">seriesLayoutBy</code> 指定了 <code class="codespan">dataset</code> 中用行还是列对应到系列上，也就是说，系列“排布”到 <code class="codespan">dataset</code> 的行还是列上。可取值：</p>
     * <ul>
     * <li>'column'：默认，<code class="codespan">dataset</code> 的列对应于系列，从而 <code class="codespan">dataset</code> 中每一列是一个维度（dimension）。</li>
     * <li>'row'：<code class="codespan">dataset</code> 的行对应于系列，从而 <code class="codespan">dataset</code> 中每一行是一个维度（dimension）。</li>
     * </ul>
     * <p>参见这个 <a href="https://echarts.apache.org/examples/zh/editor.html?c=dataset-series-layout-by&amp;theme=lite" target="_blank">示例</a></p>
     */
    private String seriesLayoutBy;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.datasetIndex">https://echarts.apache.org/zh/option.html#series-bar.datasetIndex</a>
     * <br/>序号: 37
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果 <a href="#series.data">series.data</a> 没有指定，并且 <a href="#dataset">dataset</a> 存在，那么就会使用 <a href="#dataset">dataset</a>。<code class="codespan">datasetIndex</code> 指定本系列使用那个 <a href="#dataset">dataset</a>。</p>
     */
    private Integer datasetIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.data">https://echarts.apache.org/zh/option.html#series-bar.data</a>
     * <br/>序号: 38
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>系列中的数据内容数组。数组项通常为具体的数据项。</p>
     * <p>注意，如果系列没有指定 <code class="codespan">data</code>，并且 option 有 <a href="#dataset">dataset</a>，那么默认使用第一个 <a href="#dataset">dataset</a>。如果指定了 <code class="codespan">data</code>，则不会再使用 <a href="#dataset">dataset</a>。</p>
     * <p>可以使用 <code class="codespan">series.datasetIndex</code> 指定其他的 <a href="#dataset">dataset</a>。</p>
     * <p>通常来说，数据用一个二维数组表示。如下，每一列被称为一个『维度』。</p>
     * <pre><code class="lang-js hljs javascript">series: [{
     *     <span class="hljs-attr">data</span>: [
     *         <span class="hljs-comment">// 维度X   维度Y   其他维度 ...</span>
     *         [  <span class="hljs-number">3.4</span>,    <span class="hljs-number">4.5</span>,   <span class="hljs-number">15</span>,   <span class="hljs-number">43</span>],
     *         [  <span class="hljs-number">4.2</span>,    <span class="hljs-number">2.3</span>,   <span class="hljs-number">20</span>,   <span class="hljs-number">91</span>],
     *         [  <span class="hljs-number">10.8</span>,   <span class="hljs-number">9.5</span>,   <span class="hljs-number">30</span>,   <span class="hljs-number">18</span>],
     *         [  <span class="hljs-number">7.2</span>,    <span class="hljs-number">8.8</span>,   <span class="hljs-number">18</span>,   <span class="hljs-number">57</span>]
     *     ]
     * }]
     * </code></pre>
     * <ul>
     * <li>在 <a href="#grid">直角坐标系 (grid)</a> 中『维度X』和『维度Y』会默认对应于 <a href="#xAxis">xAxis</a> 和 <a href="#yAxis">yAxis</a>。</li>
     * <li>在 <a href="#polar">极坐标系 (polar)</a> 中『维度X』和『维度Y』会默认对应于 <a href="#radiusAxis">radiusAxis</a> 和 <a href="#anbleAxis">angleAxis</a>。</li>
     * <li>后面的其他维度是可选的，可以在别处被使用，例如：<ul>
     * <li>在 <a href="#visualMap">visualMap</a> 中可以将一个或多个维度映射到颜色，大小等多个图形属性上。</li>
     * <li>在 <a href="#series.symbolSize">series.symbolSize</a> 中可以使用回调函数，基于某个维度得到 symbolSize 值。</li>
     * <li>使用 <a href="#tooltip.formatter">tooltip.formatter</a> 或 <a href="#series.label.formatter">series.label.formatter</a> 可以把其他维度的值展示出来。</li>
     * </ul>
     * </li>
     * </ul>
     * <p>特别地，当只有一个轴为类目轴（axis.type 为 <code class="codespan">'category'</code>）的时候，数据可以简化用一个一维数组表示。例如：</p>
     * <pre><code class="lang-js hljs javascript">xAxis: {
     *     <span class="hljs-attr">data</span>: [<span class="hljs-string">'a'</span>, <span class="hljs-string">'b'</span>, <span class="hljs-string">'m'</span>, <span class="hljs-string">'n'</span>]
     * },
     * <span class="hljs-attr">series</span>: [{
     *     <span class="hljs-comment">// 与 xAxis.data 一一对应。</span>
     *     <span class="hljs-attr">data</span>: [<span class="hljs-number">23</span>,  <span class="hljs-number">44</span>,  <span class="hljs-number">55</span>,  <span class="hljs-number">19</span>]
     *     <span class="hljs-comment">// 它其实是下面这种形式的简化：</span>
     *     <span class="hljs-comment">// data: [[0, 23], [1, 44], [2, 55], [3, 19]]</span>
     * }]
     * </code></pre>
     * <p><strong>『值』与 <a href="#xAxis.type">轴类型</a> 的关系：</strong></p>
     * <ul>
     * <li><p>当某维度对应于数值轴（axis.type 为 <code class="codespan">'value'</code> 或者 <code class="codespan">'log'</code>）的时候：</p>
     * <p>  其值可以为 <code class="codespan">number</code>（例如 <code class="codespan">12</code>）。（也可以兼容 <code class="codespan">string</code> 形式的 number，例如 <code class="codespan">'12'</code>）</p>
     * </li>
     * <li><p>当某维度对应于类目轴（axis.type 为 <code class="codespan">'category'</code>）的时候：</p>
     * <p>  其值须为类目的『序数』（从 <code class="codespan">0</code> 开始）或者类目的『字符串值』。例如：</p>
     * <pre><code class="lang-js hljs javascript">  xAxis: {
     *       <span class="hljs-attr">type</span>: <span class="hljs-string">'category'</span>,
     *       <span class="hljs-attr">data</span>: [<span class="hljs-string">'星期一'</span>, <span class="hljs-string">'星期二'</span>, <span class="hljs-string">'星期三'</span>, <span class="hljs-string">'星期四'</span>]
     *   },
     *   <span class="hljs-attr">yAxis</span>: {
     *       <span class="hljs-attr">type</span>: <span class="hljs-string">'category'</span>,
     *       <span class="hljs-attr">data</span>: [<span class="hljs-string">'a'</span>, <span class="hljs-string">'b'</span>, <span class="hljs-string">'m'</span>, <span class="hljs-string">'n'</span>, <span class="hljs-string">'p'</span>, <span class="hljs-string">'q'</span>]
     *   },
     *   <span class="hljs-attr">series</span>: [{
     *       <span class="hljs-attr">data</span>: [
     *           <span class="hljs-comment">// xAxis    yAxis</span>
     *           [  <span class="hljs-number">0</span>,        <span class="hljs-number">0</span>,    <span class="hljs-number">2</span>  ], <span class="hljs-comment">// 意思是此点位于 xAxis: '星期一', yAxis: 'a'。</span>
     *           [  <span class="hljs-string">'星期四'</span>,  <span class="hljs-number">2</span>,    <span class="hljs-number">1</span>  ], <span class="hljs-comment">// 意思是此点位于 xAxis: '星期四', yAxis: 'm'。</span>
     *           [  <span class="hljs-number">2</span>,       <span class="hljs-string">'p'</span>,   <span class="hljs-number">2</span>  ], <span class="hljs-comment">// 意思是此点位于 xAxis: '星期三', yAxis: 'p'。</span>
     *           [  <span class="hljs-number">3</span>,        <span class="hljs-number">3</span>,    <span class="hljs-number">5</span>  ]
     *       ]
     *   }]
     * </code></pre>
     * <p>  双类目轴的示例可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=scatter-punchCard" target="_blank">Github Punchcard</a> 示例。</p>
     * </li>
     * <li><p>当某维度对应于时间轴（type 为 <code class="codespan">'time'</code>）的时候，值可以为：</p>
     * <ul>
     * <li>一个时间戳，如 <code class="codespan">1484141700832</code>，表示 UTC 时间。</li>
     * <li>或者字符串形式的时间描述：<ul>
     * <li><a href="http://www.ecma-international.org/ecma-262/5.1/#sec-15.9.1.15" target="_blank">ISO 8601</a> 的子集，只包含这些形式（这几种格式，除非指明时区，否则均表示本地时间，与 <a href="https://momentjs.com/" target="_blank">moment</a> 一致）：<ul>
     * <li>部分年月日时间: <code class="codespan">'2012-03'</code>, <code class="codespan">'2012-03-01'</code>, <code class="codespan">'2012-03-01 05'</code>, <code class="codespan">'2012-03-01 05:06'</code>.</li>
     * <li>使用 <code class="codespan">'T'</code> 或空格分割: <code class="codespan">'2012-03-01T12:22:33.123'</code>, <code class="codespan">'2012-03-01 12:22:33.123'</code>.</li>
     * <li>时区设定: <code class="codespan">'2012-03-01T12:22:33Z'</code>, <code class="codespan">'2012-03-01T12:22:33+8000'</code>, <code class="codespan">'2012-03-01T12:22:33-05:00'</code>.</li>
     * </ul>
     * </li>
     * <li>其他的时间字符串，包括（均表示本地时间）:
     * <code class="codespan">'2012'</code>, <code class="codespan">'2012-3-1'</code>, <code class="codespan">'2012/3/1'</code>, <code class="codespan">'2012/03/01'</code>,
     * <code class="codespan">'2009/6/12 2:00'</code>, <code class="codespan">'2009/6/12 2:05:08'</code>, <code class="codespan">'2009/6/12 2:05:08.123'</code></li>
     * </ul>
     * </li>
     * <li>或者用户自行初始化的 Date 实例：<ul>
     * <li>注意，用户自行初始化 Date 实例的时候，<a href="http://dygraphs.com/date-formats.html" target="_blank">浏览器的行为有差异，不同字符串的表示也不同</a>。</li>
     * <li>例如：在 chrome 中，<code class="codespan">new Date('2012-01-01')</code> 表示 UTC 时间的 2012 年 1 月 1 日，而 <code class="codespan">new Date('2012-1-1')</code> 和 <code class="codespan">new Date('2012/01/01')</code> 表示本地时间的 2012 年 1 月 1 日。在 safari 中，不支持 <code class="codespan">new Date('2012-1-1')</code> 这种表示方法。</li>
     * <li>所以，使用 <code class="codespan">new Date(dataString)</code> 时，可使用第三方库解析（如 <a href="https://momentjs.com/" target="_blank">moment</a>），或者使用 <code class="codespan">echarts.number.parseDate</code>，或者参见 <a href="http://dygraphs.com/date-formats.html" target="_blank">这里</a>。</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p><strong>当需要对个别数据进行个性化定义时：</strong></p>
     * <p>数组项可用对象，其中的 <code class="codespan">value</code> 像表示具体的数值，如：</p>
     * <pre><code class="lang-js hljs javascript">[
     *     <span class="hljs-number">12</span>,
     *     <span class="hljs-number">34</span>,
     *     {
     *         <span class="hljs-attr">value</span> : <span class="hljs-number">56</span>,
     *         <span class="hljs-comment">//自定义标签样式，仅对该数据项有效</span>
     *         <span class="hljs-attr">label</span>: {},
     *         <span class="hljs-comment">//自定义特殊 itemStyle，仅对该数据项有效</span>
     *         <span class="hljs-attr">itemStyle</span>:{}
     *     },
     *     <span class="hljs-number">10</span>
     * ]
     * <span class="hljs-comment">// 或</span>
     * [
     *     [<span class="hljs-number">12</span>, <span class="hljs-number">33</span>],
     *     [<span class="hljs-number">34</span>, <span class="hljs-number">313</span>],
     *     {
     *         <span class="hljs-attr">value</span>: [<span class="hljs-number">56</span>, <span class="hljs-number">44</span>],
     *         <span class="hljs-attr">label</span>: {},
     *         <span class="hljs-attr">itemStyle</span>:{}
     *     },
     *     [<span class="hljs-number">10</span>, <span class="hljs-number">33</span>]
     * ]
     * </code></pre>
     * <p><strong>空值：</strong></p>
     * <p>当某数据不存在时（ps：<em>不存在</em>不代表值为 0），可以用 <code class="codespan">'-'</code> 或者 <code class="codespan">null</code> 或者 <code class="codespan">undefined</code> 或者 <code class="codespan">NaN</code> 表示。</p>
     * <p>例如，无数据在折线图中可表现为该点是断开的，在其它图中可表示为图形不存在。</p>
     */
    private List<Object> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.clip">https://echarts.apache.org/zh/option.html#series-bar.clip</a>
     * <br/>序号: 39
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.4.0</code> 开始支持</p>
     * </blockquote>
     * <p>是否裁剪超出坐标系部分的图形，具体裁剪效果根据系列决定：</p>
     * <ul>
     * <li>散点图：忽略中心点超出坐标系的图形，但是不裁剪单个图形</li>
     * <li>柱状图：裁掉完全超出的柱子，但是不会裁剪只超出部分的柱子</li>
     * <li>折线图：裁掉所有超出坐标系的折线部分，拐点图形的逻辑按照散点图处理</li>
     * <li>路径图：裁掉所有超出坐标系的部分</li>
     * <li>K 线图：忽略整体都超出坐标系的图形，但是不裁剪单个图形</li>
     * <li>自定义系列：裁掉所有超出坐标系的部分</li>
     * </ul>
     * <p>除了自定义系列，其它系列的默认值都为 true，及开启裁剪，如果你觉得不想要裁剪的话，可以设置成 false 关闭。</p>
     */
    private Boolean clip;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.zlevel">https://echarts.apache.org/zh/option.html#series-bar.zlevel</a>
     * <br/>序号: 40
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>柱状图所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.z">https://echarts.apache.org/zh/option.html#series-bar.z</a>
     * <br/>序号: 41
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>柱状图组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.silent">https://echarts.apache.org/zh/option.html#series-bar.silent</a>
     * <br/>序号: 42
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.animation">https://echarts.apache.org/zh/option.html#series-bar.animation</a>
     * <br/>序号: 43
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.animationThreshold">https://echarts.apache.org/zh/option.html#series-bar.animationThreshold</a>
     * <br/>序号: 44
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.animationDuration">https://echarts.apache.org/zh/option.html#series-bar.animationDuration</a>
     * <br/>序号: 45
     * <br/>默认值: 1000
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>初始动画的时长，支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的初始动画效果：</p>
     * <pre><code class="lang-js hljs javascript">animationDuration: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDuration;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.animationEasing">https://echarts.apache.org/zh/option.html#series-bar.animationEasing</a>
     * <br/>序号: 46
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.animationDelay">https://echarts.apache.org/zh/option.html#series-bar.animationDelay</a>
     * <br/>序号: 47
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>初始动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的初始动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-js hljs javascript">animationDelay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.animationDurationUpdate">https://echarts.apache.org/zh/option.html#series-bar.animationDurationUpdate</a>
     * <br/>序号: 48
     * <br/>默认值: 300
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的时长。</p>
     * <p>支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的更新动画效果：</p>
     * <pre><code class="lang-js hljs javascript">animationDurationUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDurationUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.animationEasingUpdate">https://echarts.apache.org/zh/option.html#series-bar.animationEasingUpdate</a>
     * <br/>序号: 49
     * <br/>默认值: cubicInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.animationDelayUpdate">https://echarts.apache.org/zh/option.html#series-bar.animationDelayUpdate</a>
     * <br/>序号: 50
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-js hljs javascript">animationDelayUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelayUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-bar.tooltip">https://echarts.apache.org/zh/option.html#series-bar.tooltip</a>
     * <br/>序号: 51
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
