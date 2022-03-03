package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.pictorialBarSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar">https://echarts.apache.org/zh/option.html#series-pictorialBar</a>
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>象形柱图</strong></p>
 * <p>象形柱图是可以设置各种具象图形元素（如图片、<a href="http://www.w3.org/TR/SVG/paths.html#PathData" target="_blank">SVG PathData</a> 等）的柱状图。往往用在信息图中。用于有至少一个类目轴或时间轴的<a href="#grid">直角坐标系</a>上。</p>
 * <p><strong>示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=pictorialBar-hill&amp;reset=1&amp;edit=1" width="800" height="400" data-ll-timeout="24"></iframe>
 *
 *
 *
 * <p><strong>布局</strong></p>
 * <p>象形柱图可以被想象为：它首先是个柱状图，但是柱状图的柱子并不显示。这些柱子我们称为『基准柱（reference bar）』，根据基准柱来定位和显示各种象形图形（包括图片）。</p>
 * <p>每个象形图形根据基准柱的定位，是通过 <a href="#series-pictorialBar.symbolPosition">symbolPosition</a>、<a href="#series-pictorialBar.symbolOffset">symbolOffset</a> 来调整其于基准柱的相对位置。</p>
 * <p>参见例子：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-position&amp;reset=1&amp;edit=1" width="800" height="600" data-ll-timeout="25"></iframe>
 *
 *
 * <p>可以使用 <a href="#series-pictorialBar.symbolSize">symbolSize</a> 调整大小，从而形成各种视图效果。</p>
 * <p>参见例子：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-symbolSize&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
 *
 *
 *
 * <p><strong>象形图形类型</strong></p>
 * <p>每个图形可以配置成『单独』和『重复』两种类型，即通过 <a href="#series-pictorialBar.symbolRepeat">symbolRepeat</a> 来设置。</p>
 * <ul>
 * <li>设置为 <code class="codespan">false</code>（默认），则一个图形来代表一个数据项。</li>
 * <li>设置为 <code class="codespan">true</code>，则一组重复的图形来代表一个数据项。</li>
 * </ul>
 * <p>参见例子：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeat&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
 *
 *
 * <p>每个象形图形可以是基本图形（如 <code class="codespan">'circle'</code>, <code class="codespan">'rect'</code>, ...）、<a href="http://www.w3.org/TR/SVG/paths.html#PathData" target="_blank">SVG PathData</a>、图片，参见：<a href="#series-pictorialBar.symbolType">symbolType</a>。</p>
 * <p>参见例子：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-graphicType&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
 *
 *
 * <p>可以使用 <a href="#series-pictorialBar.symbolClip">symbolClip</a> 对图形进行剪裁。</p>
 * <p>参见例子：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-clip&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class PictorialBarSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.type">https://echarts.apache.org/zh/option.html#series-pictorialBar.type</a>
     * <br/>默认值: pictorialBar
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.id">https://echarts.apache.org/zh/option.html#series-pictorialBar.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.name">https://echarts.apache.org/zh/option.html#series-pictorialBar.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.colorBy">https://echarts.apache.org/zh/option.html#series-pictorialBar.colorBy</a>
     * <br/>默认值: series
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.2.0</code> 开始支持</p>
     * </blockquote>
     * <p>从调色盘 <a href="#color">option.color</a> 中取色的策略，可取值为：</p>
     * <ul>
     * <li><code class="codespan">'series'</code>：按照系列分配调色盘中的颜色，同一系列中的所有数据都是用相同的颜色；</li>
     * <li><code class="codespan">'data'</code>：按照数据项分配调色盘中的颜色，每个数据项都使用不同的颜色。</li>
     * </ul>
     */
    private String colorBy;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.legendHoverLink">https://echarts.apache.org/zh/option.html#series-pictorialBar.legendHoverLink</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否启用<a href="#legend">图例</a> hover 时的联动高亮。</p>
     */
    private Boolean legendHoverLink;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.coordinateSystem">https://echarts.apache.org/zh/option.html#series-pictorialBar.coordinateSystem</a>
     * <br/>默认值: cartesian2d
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该系列使用的坐标系，可选：</p>
     * <ul>
     * <li><p><code class="codespan">'cartesian2d'</code></p>
     * <p>  使用二维的直角坐标系（也称笛卡尔坐标系），通过 <a href="#series-pictorialBar.xAxisIndex">xAxisIndex</a>, <a href="#series-pictorialBar.yAxisIndex">yAxisIndex</a>指定相应的坐标轴组件。</p>
     * </li>
     * </ul>
     */
    private String coordinateSystem;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.xAxisIndex">https://echarts.apache.org/zh/option.html#series-pictorialBar.xAxisIndex</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.yAxisIndex">https://echarts.apache.org/zh/option.html#series-pictorialBar.yAxisIndex</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.cursor">https://echarts.apache.org/zh/option.html#series-pictorialBar.cursor</a>
     * <br/>默认值: pointer
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>鼠标悬浮时在图形元素上时鼠标的样式是什么。同 CSS 的 <code class="codespan">cursor</code>。</p>
     */
    private String cursor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.label">https://echarts.apache.org/zh/option.html#series-pictorialBar.label</a>
     * <br/>默认值: inside
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.labelLine">https://echarts.apache.org/zh/option.html#series-pictorialBar.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.labelLayout">https://echarts.apache.org/zh/option.html#series-pictorialBar.labelLayout</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.itemStyle">https://echarts.apache.org/zh/option.html#series-pictorialBar.itemStyle</a>
     * <br/>默认值: 自适应
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p> 图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.emphasis">https://echarts.apache.org/zh/option.html#series-pictorialBar.emphasis</a>
     * <br/>默认值: none
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态配置。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.blur">https://echarts.apache.org/zh/option.html#series-pictorialBar.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出状态配置。开启 <a href="#series-pictorialBar.emphasis.focus">emphasis.focus</a> 后有效。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.select">https://echarts.apache.org/zh/option.html#series-pictorialBar.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>选中状态配置。开启 <a href="#series-bar.selectedMode">selectedMode</a> 后有效。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.selectedMode">https://echarts.apache.org/zh/option.html#series-pictorialBar.selectedMode</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>选中模式的配置，表示是否支持多个选中，默认关闭，支持布尔值和字符串，字符串取值可选<code class="codespan">'single'</code>，<code class="codespan">'multiple'</code>，<code class="codespan">'series'</code> 分别表示单选，多选以及选择整个系列。</p>
     * <blockquote>
     * <p>从 v5.3.0 开始支持 <code class="codespan">'series'</code>。</p>
     * </blockquote>
     */
    private SelectedMode selectedMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.barWidth">https://echarts.apache.org/zh/option.html#series-pictorialBar.barWidth</a>
     * <br/>默认值: 自适应
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>柱条的宽度，不设时自适应。</p>
     *
     *
     *
     *
     * <p>可以是绝对值例如 <code class="codespan">40</code> 或者百分数例如 <code class="codespan">'60%'</code>。百分数基于自动计算出的每一类目的宽度。</p>
     * <p>在同一坐标系上，此属性会被多个 <code class="codespan">'pictorialBar'</code> 系列共享。此属性应设置于此坐标系中最后一个 <code class="codespan">'pictorialBar'</code> 系列上才会生效，并且是对此坐标系中所有 <code class="codespan">'pictorialBar'</code> 系列生效。</p>
     */
    private Object barWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.barMaxWidth">https://echarts.apache.org/zh/option.html#series-pictorialBar.barMaxWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>柱条的最大宽度。</p>
     * <p>比 <a href="#series-bar.barWidth">barWidth</a> 优先级高。</p>
     * <p>可以是绝对值例如 <code class="codespan">40</code> 或者百分数例如 <code class="codespan">'60%'</code>。百分数基于自动计算出的每一类目的宽度。</p>
     * <p>在同一坐标系上，此属性会被多个 <code class="codespan">'pictorialBar'</code> 系列共享。此属性应设置于此坐标系中最后一个 <code class="codespan">'pictorialBar'</code> 系列上才会生效，并且是对此坐标系中所有 <code class="codespan">'pictorialBar'</code> 系列生效。</p>
     */
    private Object barMaxWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.barMinWidth">https://echarts.apache.org/zh/option.html#series-pictorialBar.barMinWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>柱条的最小宽度。在直角坐标系中，默认值是 <code class="codespan">1</code>。否则默认值是 <code class="codespan">null</code>。</p>
     * <p>比 <a href="#series-bar.barWidth">barWidth</a> 优先级高。</p>
     * <p>可以是绝对值例如 <code class="codespan">40</code> 或者百分数例如 <code class="codespan">'60%'</code>。百分数基于自动计算出的每一类目的宽度。</p>
     * <p>在同一坐标系上，此属性会被多个 <code class="codespan">'pictorialBar'</code> 系列共享。此属性应设置于此坐标系中最后一个 <code class="codespan">'pictorialBar'</code> 系列上才会生效，并且是对此坐标系中所有 <code class="codespan">'pictorialBar'</code> 系列生效。</p>
     */
    private Object barMinWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.barMinHeight">https://echarts.apache.org/zh/option.html#series-pictorialBar.barMinHeight</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>柱条最小高度，可用于防止某数据项的值过小而影响交互。</p>
     */
    private Integer barMinHeight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.barMinAngle">https://echarts.apache.org/zh/option.html#series-pictorialBar.barMinAngle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>柱条最小角度，可用于防止某数据项的值过小而影响交互。</p>
     * <p>仅对极坐标系柱状图有效。</p>
     */
    private Integer barMinAngle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.barGap">https://echarts.apache.org/zh/option.html#series-pictorialBar.barGap</a>
     * <br/>默认值: -100%
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>不同系列的柱间距离，为百分比（如 <code class="codespan">'30%'</code>，表示柱子宽度的 <code class="codespan">30%</code>）。</p>
     * <p>如果想要两个系列的柱子重叠，可以设置 barGap 为 <code class="codespan">'-100%'</code>。这在用柱子做背景的时候有用。</p>
     * <p>在同一坐标系上，此属性会被多个 <code class="codespan">'pictorialBar'</code> 系列共享。此属性应设置于此坐标系中最后一个 <code class="codespan">'pictorialBar'</code> 系列上才会生效，并且是对此坐标系中所有 <code class="codespan">'pictorialBar'</code> 系列生效。</p>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/barGrid-barGap&amp;reset=1&amp;edit=1" width="600" height="400"></iframe>
     */
    private String barGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.barCategoryGap">https://echarts.apache.org/zh/option.html#series-pictorialBar.barCategoryGap</a>
     * <br/>默认值: 20%
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>同一系列的柱间距离，默认为类目间距的20%，可设固定值</p>
     * <p>在同一坐标系上，此属性会被多个 <code class="codespan">'pictorialBar'</code> 系列共享。此属性应设置于此坐标系中最后一个 <code class="codespan">'pictorialBar'</code> 系列上才会生效，并且是对此坐标系中所有 <code class="codespan">'pictorialBar'</code> 系列生效。</p>
     */
    private String barCategoryGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbol">https://echarts.apache.org/zh/option.html#series-pictorialBar.symbol</a>
     * <br/>默认值: circle
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图形类型。</p>
     * <p>ECharts 提供的标记类型包括</p>
     * <p><code class="codespan">'circle'</code>, <code class="codespan">'rect'</code>, <code class="codespan">'roundRect'</code>, <code class="codespan">'triangle'</code>, <code class="codespan">'diamond'</code>, <code class="codespan">'pin'</code>, <code class="codespan">'arrow'</code>, <code class="codespan">'none'</code></p>
     * <p>可以通过 <code class="codespan">'image://url'</code> 设置为图片，其中 URL 为图片的链接，或者 <code class="codespan">dataURI</code>。</p>
     * <p>URL 为图片链接例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://http://xxx.xxx.xxx/a/b.png'</span>
     * </code></pre><p>URL 为 <code class="codespan">dataURI</code> 例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://data:image/gif;base64,R0lGODlhEAAQAMQAAORHHOVSKudfOulrSOp3WOyDZu6QdvCchPGolfO0o/XBs/fNwfjZ0frl3/zy7////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAkAABAALAAAAAAQABAAAAVVICSOZGlCQAosJ6mu7fiyZeKqNKToQGDsM8hBADgUXoGAiqhSvp5QAnQKGIgUhwFUYLCVDFCrKUE1lBavAViFIDlTImbKC5Gm2hB0SlBCBMQiB0UjIQA7'</span>
     * </code></pre><p>可以通过 <code class="codespan">'path://'</code> 将图标设置为任意的矢量路径。这种方式相比于使用图片的方式，不用担心因为缩放而产生锯齿或模糊，而且可以设置为任意颜色。路径图形会自适应调整为合适的大小。路径的格式参见 <a href="http://www.w3.org/TR/SVG/paths.html#PathData" target="_blank">SVG PathData</a>。可以从 Adobe Illustrator 等工具编辑导出。</p>
     * <p>例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'path://M30.9,53.2C16.8,53.2,5.3,41.7,5.3,27.6S16.8,2,30.9,2C45,2,56.4,13.5,56.4,27.6S45,53.2,30.9,53.2z M30.9,3.5C17.6,3.5,6.8,14.4,6.8,27.6c0,13.3,10.8,24.1,24.101,24.1C44.2,51.7,55,40.9,55,27.6C54.9,14.4,44.1,3.5,30.9,3.5z M36.9,35.8c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H36c0.5,0,0.9,0.4,0.9,1V35.8z M27.8,35.8 c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H27c0.5,0,0.9,0.4,0.9,1L27.8,35.8L27.8,35.8z'</span>
     * </code></pre><p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-graphicType&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.symbol">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.symbol">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbol: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbol: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbol: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private String symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolSize">https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolSize</a>
     * <br/>默认值: ["100%","100%"]
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>图形的大小。</p>
     * <p>可以用数组分开表示宽和高，例如 <code class="codespan">[20, 10]</code> 表示标记宽为<code class="codespan">20</code>，高为<code class="codespan">10</code>，也可以设置成诸如 <code class="codespan">10</code> 这样单一的数字，表示 <code class="codespan">[10, 10]</code>。</p>
     * <p>可以设置成绝对值（如 <code class="codespan">10</code>），也可以设置成百分比（如 <code class="codespan">'120%'</code>、<code class="codespan">['55%', 23]</code>）。</p>
     * <p>当设置为百分比时，图形的大小是基于 <a href="#series-pictorialBar">基准柱</a> 的尺寸计算出来的。</p>
     * <p>例如，当基准柱基于 x 轴（即柱子是纵向的），<a href="#series-pictorialBar.symbolSize">symbolSize</a> 设置为 <code class="codespan">['30%', '50%']</code>，那么最终图形的尺寸是：</p>
     * <ul>
     * <li>宽度：<code class="codespan">基准柱的宽度 * 30%</code>。</li>
     * <li>高度：<ul>
     * <li>如果 <a href="#series-pictorialBar.symbolRepeat">symbolRepeat</a> 为 <code class="codespan">false</code>：<code class="codespan">基准柱的高度 * 50%</code>。</li>
     * <li>如果 <a href="#series-pictorialBar.symbolRepeat">symbolRepeat</a> 为 <code class="codespan">true</code>：<code class="codespan">基准柱的宽度 * 50%</code>。</li>
     * </ul>
     * </li>
     * </ul>
     * <p>基准柱基于 y 轴（即柱子是横向的）的情况类似对调可得出。</p>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-symbolSize&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.symbolSize">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.symbolSize">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolSize: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolSize: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolSize: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolPosition">https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolPosition</a>
     * <br/>默认值: start
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图形的定位位置。可取值：</p>
     * <ul>
     * <li><code class="codespan">'start'</code>：图形边缘与柱子开始的地方内切。</li>
     * <li><code class="codespan">'end'</code>：图形边缘与柱子结束的地方内切。</li>
     * <li><code class="codespan">'center'</code>：图形在柱子里居中。</li>
     * </ul>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-position&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.symbolPosition">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.symbolPosition">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolPosition: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolPosition: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolPosition: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private String symbolPosition;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolOffset">https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolOffset</a>
     * <br/>默认值: [0,0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>图形相对于原本位置的偏移。<code class="codespan">symbolOffset</code> 是图形定位中最后计算的一个步骤，可以对图形计算出来的位置进行微调。</p>
     * <p>可以设置成绝对值（如 <code class="codespan">10</code>），也可以设置成百分比（如 <code class="codespan">'120%'</code>、<code class="codespan">['55%', 23]</code>）。</p>
     * <p>当设置为百分比时，表示相对于自身尺寸 <a href="#series-pictorialBar.symbolSize">symbolSize</a> 的百分比。</p>
     * <p>例如 <code class="codespan">[0, '-50%']</code> 就是把图形向上移动了自身尺寸的一半的位置。</p>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-position&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.symbolOffset">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.symbolOffset">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolOffset: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolOffset: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolOffset: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private List<?> symbolOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRotate">https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRotate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形的旋转角度。</p>
     * <p>注意，<code class="codespan">symbolRotate</code> 并不会影响图形的定位（哪怕超出基准柱的边界），而只是单纯得绕自身中心旋转。</p>
     * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.symbolRotate">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.symbolRotate">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolRotate: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolRotate: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolRotate: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Integer symbolRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat">https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeat</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","number","string"]
     * <br/>描述:
     * <p>指定图形元素是否重复。值可为：</p>
     * <ul>
     * <li><code class="codespan">false</code>/<code class="codespan">null</code>/<code class="codespan">undefined</code>：不重复，即每个数据值用一个图形元素表示。</li>
     * <li><code class="codespan">true</code>：使图形元素重复，即每个数据值用一组重复的图形元素表示。重复的次数依据 <a href="#series-pictorialBar.data">data</a> 计算得到。</li>
     * <li>a number：使图形元素重复，即每个数据值用一组重复的图形元素表示。重复的次数是给定的定值。</li>
     * <li><code class="codespan">'fixed'</code>：使图形元素重复，即每个数据值用一组重复的图形元素表示。重复的次数依据 <a href="#series-pictorialBar.symbolBoundingData">symbolBoundingData</a> 计算得到，即与 <a href="#series-pictorialBar.data">data</a> 无关。这在此图形被用于做背景时有用。</li>
     * </ul>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeat&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.symbolRepeat">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.symbolRepeat">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolRepeat: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolRepeat: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolRepeat: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Object symbolRepeat;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeatDirection">https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolRepeatDirection</a>
     * <br/>默认值: start
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>指定图形元素重复时，绘制的顺序。这个属性在两种情况下有用处：</p>
     * <ul>
     * <li><p>当 <a href="#series-pictorialBar.symbolMargin">symbolMargin</a> 设置为负值时，重复的图形会互相覆盖，这是可以使用 <code class="codespan">symbolRepeatDirection</code> 来指定覆盖顺序。</p>
     * </li>
     * <li><p>当 <a href="#series-pictorialBar.animationDelay">animationDelay</a> 或 <a href="#series-pictorialBar.animationDelayUpdate">animationDelayUpdate</a> 被使用时，<code class="codespan">symbolRepeatDirection</code> 指定了 index 顺序。</p>
     * </li>
     * </ul>
     * <p>这个属性的值可以是：<code class="codespan">'start'</code> 或 <code class="codespan">'end'</code>。</p>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeatDirection&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.symbolRepeatDirection">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.symbolRepeatDirection">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolRepeatDirection: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolRepeatDirection: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolRepeatDirection: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private String symbolRepeatDirection;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolMargin">https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolMargin</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>图形的两边间隔（『两边』是指其数值轴方向的两边）。可以是绝对数值（如 <code class="codespan">20</code>），或者百分比值（如 <code class="codespan">'-30%'</code>），表示相对于自身尺寸 <a href="#series-pictorialBar.symbolSize">symbolSize</a> 的百分比。只有当 <a href="#series-pictorialBar.symbolRepeat">symbolRepeat</a> 被使用时有意义。</p>
     * <p>可以是正值，表示间隔大；也可以是负数。当 <a href="#series-pictorialBar.symbolRepeat">symbolRepeat</a> 被使用时，负数时能使图形重叠。</p>
     * <p>可以在其值结尾处加一个 <code class="codespan">"!"</code>，如 <code class="codespan">"30%!"</code> 或 <code class="codespan">25!</code>，表示第一个图形的开始和最后一个图形结尾留白，不紧贴边界。默认会紧贴边界。</p>
     * <p>注意：</p>
     * <ul>
     * <li>当 <a href="#series-pictorialBar.symbolRepeat">symbolRepeat</a> 为 <code class="codespan">true</code>/<code class="codespan">'fixed'</code> 的时候：
     *   这里设置的 <code class="codespan">symbolMargin</code> 只是个参考值，真正最后的图形间隔，是根据 <a href="#series-pictorialBar.symbolRepeat">symbolRepeat</a>、<code class="codespan">symbolMargin</code>、<a href="#series-pictorialBar.symbolBoundingData">symbolBoundingData</a> 综合计算得到。</li>
     * <li>当 <a href="#series-pictorialBar.symbolRepeat">symbolRepeat</a> 为一个固定数值的时候：
     *   这里设置的 <code class="codespan">symbolMargin</code> 无效。</li>
     * </ul>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeatLayout&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.symbolMargin">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.symbolMargin">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolMargin: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolMargin: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolMargin: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Object symbolMargin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolClip">https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolClip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否剪裁图形。</p>
     * <ul>
     * <li><code class="codespan">false</code>/null/undefined：图形本身表示数值大小。</li>
     * <li><code class="codespan">true</code>：图形被剪裁后剩余的部分表示数值大小。</li>
     * </ul>
     * <p><code class="codespan">symbolClip</code> 常在这种场景下使用：同时表达『总值』和『当前数值』。在这种场景下，可以使用两个系列，一个系列是完整的图形，当做『背景』来表达总数值，另一个系列是使用 <code class="codespan">symbolClip</code> 进行剪裁过的图形，表达当前数值。</p>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-clip&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     * <p>在这个例子中：</p>
     * <ul>
     * <li>『背景系列』和『当前值系列』使用相同的 <a href="#series.pictorialBar.symbolBoundingData">symbolBoundingData</a>，使得绘制出的图形的大小是一样的。</li>
     * <li>『当前值系列』设置了比『背景系列』更高的 <a href="#series.pictorialBar.z">z</a>，使得其覆盖在『背景系列』上。</li>
     * </ul>
     * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.symbolClip">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.symbolClip">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolClip: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolClip: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolClip: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Boolean symbolClip;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolBoundingData">https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolBoundingData</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>这个属性是『指定图形界限的值』。它指定了一个 data，这个 data 映射在坐标系上的位置，是图形绘制的界限。也就是说，如果设置了 <code class="codespan">symbolBoundingData</code>，图形的尺寸则由 <code class="codespan">symbolBoundingData</code> 决定。</p>
     * <p>当柱子是水平的，symbolBoundingData 对应到 x 轴上，当柱子是竖直的，symbolBoundingData 对应到 y 轴上。</p>
     * <p>规则：</p>
     * <ul>
     * <li><p>没有使用 <a href="#series-pictorialBar.symbolRepeat">symbolRepeat</a> 时：</p>
     * <p>  <code class="codespan">symbolBoundingData</code> 缺省情况下和『参考柱』的尺寸一样。图形的尺寸由零点和 <code class="codespan">symbolBoundingData</code> 决定。举例，当柱子是竖直的，柱子对应的 data 为 <code class="codespan">24</code>，<code class="codespan">symbolSize</code> 设置为 <code class="codespan">[30, '50%']</code>，<code class="codespan">symbolBoundingData</code> 设置为 <code class="codespan">124</code>，那么最终图形的高度为 <code class="codespan">124 * 50% = 62</code>。如果 <code class="codespan">symbolBoundingData</code> 不设置，那么最终图形的高度为 <code class="codespan">24 * 50% = 12</code>。</p>
     * </li>
     * <li><p>使用了 <a href="#series-pictorialBar.symbolRepeat">symbolRepeat</a> 时：</p>
     * <p>  <code class="codespan">symbolBoundingData</code> 缺省情况取当前坐标系所显示出的最值。<code class="codespan">symbolBoundingData</code> 定义了一个 bounding，重复的图形在这个 bounding 中，依据 <a href="#series-pictorialBar.symbolMargin">symbolMargin</a> 和 <a href="#series-pictorialBar.symbolRepeat">symbolRepeat</a> 和 <a href="#series-pictorialBar.symbolSize">symbolSize</a> 进行排布。这几个变量决定了图形的间隔大小。</p>
     * </li>
     * </ul>
     * <p>在这些场景中，你可能会需要设置 <code class="codespan">symbolBoundingData</code>：</p>
     * <ul>
     * <li><p>使用了 <a href="#series-pictorialBar.symbolClip">symbolCilp</a> 时：</p>
     * <p>  使用一个系列表达『总值』，另一个系列表达『当前值』的时候，需要两个系列画出的图形一样大。那么就把两个系列的 <code class="codespan">symbolBoundingData</code> 设为一样大。</p>
     * </li>
     * </ul>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-clip&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     * <ul>
     * <li><p>使用了 <a href="#series-pictorialBar.symbolRepeat">symbolRepeat</a> 时：</p>
     * <p>  如果需要不同柱子中的图形的间隔保持一致，那么可以把 <code class="codespan">symbolBoundingData</code> 设为一致的数值。当然，不设置 <code class="codespan">symbolBoundingData</code> 也是可以的，因为其缺省值就是一个定值（坐标系所显示出的最值）。</p>
     * </li>
     * </ul>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeatLayout&amp;reset=1&amp;edit=1" width="800" height="600"></iframe>
     *
     *
     * <p><br>
     * <code class="codespan">symbolBoundingData</code> 可以是一个数组，例如 <code class="codespan">[-40, 60]</code>，表示同时指定了正值的 <code class="codespan">symbolBoundingData</code> 和负值的 <code class="codespan">symbolBoundingData</code>。</p>
     * <p>参见例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-symbolBoundingDataArray&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.symbolBoundingData">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.symbolBoundingData">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolBoundingData: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolBoundingData: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolBoundingData: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Object symbolBoundingData;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolPatternSize">https://echarts.apache.org/zh/option.html#series-pictorialBar.symbolPatternSize</a>
     * <br/>默认值: 400
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>可以使用图片作为图形的 pattern。</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-keyword">var</span> textureImg = <span class="hljs-keyword">new</span> Image();
     * textureImg.src = <span class="hljs-string">'data:image/jpeg;base64,...'</span>; <span class="hljs-comment">// dataURI</span>
     * <span class="hljs-comment">// 或者</span>
     * <span class="hljs-comment">// textureImg.src = 'http://xxx.xxx.xxx/xx.png'; // URL</span>
     * ...
     * itemStyle: {
     *     color: {
     *         image: textureImg,
     *         repeat: <span class="hljs-string">'repeat'</span>
     *     }
     * }
     * </code></pre>
     * <p>这时候，<code class="codespan">symbolPatternSize</code> 指定了 pattern 的缩放尺寸。比如 <code class="codespan">symbolPatternSize</code> 为 400 时表示图片显示为 <code class="codespan">400px * 400px</code> 的尺寸。</p>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-patternSize&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     *
     *
     *
     *
     * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.symbolPatternSize">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.symbolPatternSize">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     symbolPatternSize: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         symbolPatternSize: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         symbolPatternSize: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private Integer symbolPatternSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation">https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启 hover 在图形上的提示动画效果。</p>
     * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.hoverAnimation">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.hoverAnimation">每个数据项中</a>，表示只对此数据项生效。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     hoverAnimation: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
     *     data: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
     * }]
     * 或者
     * series: [{
     *     data: [{
     *         value: <span class="hljs-number">23</span>
     *         hoverAnimation: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }, {
     *         value: <span class="hljs-number">56</span>
     *         hoverAnimation: ... <span class="hljs-comment">// 只对此数据项生效</span>
     *     }]
     * }]
     * </code></pre>
     */
    private HoverAnimation hoverAnimation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.dimensions">https://echarts.apache.org/zh/option.html#series-pictorialBar.dimensions</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>使用 dimensions 定义 <code class="codespan">series.data</code> 或者 <code class="codespan">dataset.source</code> 的每个维度的信息。</p>
     * <p>注意：如果使用了 <a href="#dataset">dataset</a>，那么可以在 <a href="#dataset.dimensions">dataset.dimensions</a> 中定义 dimension ，或者在 <a href="#dataset.source">dataset.source</a> 的第一行/列中给出 dimension 名称。于是就不用在这里指定 dimension。但如果在这里指定了 <code class="codespan">dimensions</code>，那么优先使用这里的。</p>
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
     * <li><code class="codespan">time</code>，表示时间类型。设置成 'time' 则能支持自动解析数据成时间戳（timestamp），比如该维度的数据是 '2017-05-10'，会自动被解析。时间类型的支持参见 <a href="#series.data">data</a>。</li>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.encode">https://echarts.apache.org/zh/option.html#series-pictorialBar.encode</a>
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
     * <p>当使用 <a href="#series.dimensions">dimensions</a> 给维度定义名称后，<code class="codespan">encode</code> 中可直接引用名称，例如：</p>
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
     * <p>特殊地，在 <a href="#series-custom">自定义系列（custom series）</a> 中，<code class="codespan">encode</code> 中轴可以不指定或设置为 <code class="codespan">null/undefined</code>，从而使系列免于受这个轴控制，也就是说，轴的范围（extent）不会受此系列数值的影响，轴被 <a href="#dataZoom">dataZoom</a> 控制时也不会过滤掉这个系列：</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.dataGroupId">https://echarts.apache.org/zh/option.html#series-pictorialBar.dataGroupId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该系列所有数据共有的组 ID。组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画。</p>
     * <p>如果你使用了<a href="#dataset">dataset</a>组件来表达数据，推荐使用<code class="codespan">encode.itemGroupID</code>来指定哪个维度被编码为组 ID。</p>
     */
    private String dataGroupId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.data">https://echarts.apache.org/zh/option.html#series-pictorialBar.data</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>系列中的数据内容数组。数组项通常为具体的数据项。</p>
     * <p>注意，如果系列没有指定 <code class="codespan">data</code>，并且 option 有 <a href="#dataset">dataset</a>，那么默认使用第一个 <a href="#dataset">dataset</a>。如果指定了 <code class="codespan">data</code>，则不会再使用 <a href="#dataset">dataset</a>。</p>
     * <p>可以使用 <code class="codespan">series.datasetIndex</code> 指定其他的 <a href="#dataset">dataset</a>。</p>
     * <p>通常来说，数据用一个二维数组表示。如下，每一列被称为一个『维度』。</p>
     * <pre><code class="lang-ts hljs typescript">series: [{
     *     data: [
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
     * <pre><code class="lang-ts hljs typescript">xAxis: {
     *     data: [<span class="hljs-string">'a'</span>, <span class="hljs-string">'b'</span>, <span class="hljs-string">'m'</span>, <span class="hljs-string">'n'</span>]
     * },
     * series: [{
     *     <span class="hljs-comment">// 与 xAxis.data 一一对应。</span>
     *     data: [<span class="hljs-number">23</span>,  <span class="hljs-number">44</span>,  <span class="hljs-number">55</span>,  <span class="hljs-number">19</span>]
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
     * <pre><code class="lang-ts hljs typescript">  xAxis: {
     *       <span class="hljs-keyword">type</span>: <span class="hljs-string">'category'</span>,
     *       data: [<span class="hljs-string">'星期一'</span>, <span class="hljs-string">'星期二'</span>, <span class="hljs-string">'星期三'</span>, <span class="hljs-string">'星期四'</span>]
     *   },
     *   yAxis: {
     *       <span class="hljs-keyword">type</span>: <span class="hljs-string">'category'</span>,
     *       data: [<span class="hljs-string">'a'</span>, <span class="hljs-string">'b'</span>, <span class="hljs-string">'m'</span>, <span class="hljs-string">'n'</span>, <span class="hljs-string">'p'</span>, <span class="hljs-string">'q'</span>]
     *   },
     *   series: [{
     *       data: [
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
     * <pre><code class="lang-ts hljs typescript">[
     *     <span class="hljs-number">12</span>,
     *     <span class="hljs-number">34</span>,
     *     {
     *         value : <span class="hljs-number">56</span>,
     *         <span class="hljs-comment">//自定义标签样式，仅对该数据项有效</span>
     *         label: {},
     *         <span class="hljs-comment">//自定义特殊 itemStyle，仅对该数据项有效</span>
     *         itemStyle:{}
     *     },
     *     <span class="hljs-number">10</span>
     * ]
     * <span class="hljs-comment">// 或</span>
     * [
     *     [<span class="hljs-number">12</span>, <span class="hljs-number">33</span>],
     *     [<span class="hljs-number">34</span>, <span class="hljs-number">313</span>],
     *     {
     *         value: [<span class="hljs-number">56</span>, <span class="hljs-number">44</span>],
     *         label: {},
     *         itemStyle:{}
     *     },
     *     [<span class="hljs-number">10</span>, <span class="hljs-number">33</span>]
     * ]
     * </code></pre>
     * <p><strong>空值：</strong></p>
     * <p>当某数据不存在时（ps：<em>不存在</em>不代表值为 0），可以用 <code class="codespan">'-'</code> 或者 <code class="codespan">null</code> 或者 <code class="codespan">undefined</code> 或者 <code class="codespan">NaN</code> 表示。</p>
     * <p>例如，无数据在折线图中可表现为该点是断开的，在其它图中可表示为图形不存在。</p>
     */
    private List<?> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.markPoint">https://echarts.apache.org/zh/option.html#series-pictorialBar.markPoint</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标注。</p>
     */
    private Object markPoint;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.markLine">https://echarts.apache.org/zh/option.html#series-pictorialBar.markLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标线。</p>
     */
    private Object markLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.markArea">https://echarts.apache.org/zh/option.html#series-pictorialBar.markArea</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。</p>
     */
    private Object markArea;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.zlevel">https://echarts.apache.org/zh/option.html#series-pictorialBar.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>象形柱图所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.z">https://echarts.apache.org/zh/option.html#series-pictorialBar.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>象形柱图组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.silent">https://echarts.apache.org/zh/option.html#series-pictorialBar.silent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.animation">https://echarts.apache.org/zh/option.html#series-pictorialBar.animation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.animationThreshold">https://echarts.apache.org/zh/option.html#series-pictorialBar.animationThreshold</a>
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.animationDuration">https://echarts.apache.org/zh/option.html#series-pictorialBar.animationDuration</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.animationEasing">https://echarts.apache.org/zh/option.html#series-pictorialBar.animationEasing</a>
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.animationDurationUpdate">https://echarts.apache.org/zh/option.html#series-pictorialBar.animationDurationUpdate</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.animationEasingUpdate">https://echarts.apache.org/zh/option.html#series-pictorialBar.animationEasingUpdate</a>
     * <br/>默认值: cubicInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.universalTransition">https://echarts.apache.org/zh/option.html#series-pictorialBar.universalTransition</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.tooltip">https://echarts.apache.org/zh/option.html#series-pictorialBar.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
