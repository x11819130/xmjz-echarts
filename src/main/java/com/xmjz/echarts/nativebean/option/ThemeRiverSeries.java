package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.themeRiverSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver">https://echarts.apache.org/zh/option.html#series-themeRiver</a>
 * <br/>序号: 0
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong> 主题河流 </strong></p>
 * <p>是一种特殊的流图, 它主要用来表示事件或主题等在一段时间内的变化。</p>
 * <p><strong>示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=themeRiver-lastfm&amp;edit=1&amp;reset=1" width="700" height="580" data-ll-timeout="17"></iframe>
 *
 *
 *
 * <p><br>
 * <strong>可视编码：</strong></p>
 * <p>主题河流中不同颜色的条带状河流分支编码了不同的事件或主题，河流分支的宽度编码了原数据集中的value值。</p>
 * <p>此外，原数据集中的时间属性，映射到单个时间轴上。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class ThemeRiverSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.type">https://echarts.apache.org/zh/option.html#series-themeRiver.type</a>
     * <br/>序号: 1
     * <br/>默认值: themeRiver
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.id">https://echarts.apache.org/zh/option.html#series-themeRiver.id</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.name">https://echarts.apache.org/zh/option.html#series-themeRiver.name</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.zlevel">https://echarts.apache.org/zh/option.html#series-themeRiver.zlevel</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.z">https://echarts.apache.org/zh/option.html#series-themeRiver.z</a>
     * <br/>序号: 5
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.left">https://echarts.apache.org/zh/option.html#series-themeRiver.left</a>
     * <br/>序号: 6
     * <br/>默认值: 5%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>thmemRiver组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.top">https://echarts.apache.org/zh/option.html#series-themeRiver.top</a>
     * <br/>序号: 7
     * <br/>默认值: 5%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>thmemRiver组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.right">https://echarts.apache.org/zh/option.html#series-themeRiver.right</a>
     * <br/>序号: 8
     * <br/>默认值: 5%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>thmemRiver组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.bottom">https://echarts.apache.org/zh/option.html#series-themeRiver.bottom</a>
     * <br/>序号: 9
     * <br/>默认值: 5%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>thmemRiver组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.width">https://echarts.apache.org/zh/option.html#series-themeRiver.width</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>thmemRiver组件的宽度。</p>
     */
    private Object width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.height">https://echarts.apache.org/zh/option.html#series-themeRiver.height</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>thmemRiver组件的高度。</p>
     * <p><strong> 注意：</strong>
     * 整个主题河流view的位置信息复用了单个时间轴的位置信息，即left，top，right，bottom。</p>
     */
    private Object height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.coordinateSystem">https://echarts.apache.org/zh/option.html#series-themeRiver.coordinateSystem</a>
     * <br/>序号: 12
     * <br/>默认值: single
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>坐标系统，主题河流用的是单个的时间轴。</p>
     */
    private String coordinateSystem;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.boundaryGap">https://echarts.apache.org/zh/option.html#series-themeRiver.boundaryGap</a>
     * <br/>序号: 13
     * <br/>默认值: ["10%","10%"]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>图中与坐标轴正交的方向的边界间隙，设置该值是为了调整图的位置，使其尽量处于屏幕的正中间，避免处于屏幕的上方或下方。</p>
     */
    private List<?> boundaryGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.singleAxisIndex">https://echarts.apache.org/zh/option.html#series-themeRiver.singleAxisIndex</a>
     * <br/>序号: 14
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>单个时间轴的index，默认值为0，因为只有单个轴。</p>
     */
    private Integer singleAxisIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.label">https://echarts.apache.org/zh/option.html#series-themeRiver.label</a>
     * <br/>序号: 15
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了主题河流中每个带状河流分支对应的文本标签的样式。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.labelLine">https://echarts.apache.org/zh/option.html#series-themeRiver.labelLine</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.labelLayout">https://echarts.apache.org/zh/option.html#series-themeRiver.labelLayout</a>
     * <br/>序号: 17
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.itemStyle">https://echarts.apache.org/zh/option.html#series-themeRiver.itemStyle</a>
     * <br/>序号: 18
     * <br/>默认值: 自适应
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>主题河流中每个带状河流分支的样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.emphasis">https://echarts.apache.org/zh/option.html#series-themeRiver.emphasis</a>
     * <br/>序号: 19
     * <br/>默认值: none
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态的配置。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.blur">https://echarts.apache.org/zh/option.html#series-themeRiver.blur</a>
     * <br/>序号: 20
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出状态的配置。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.select">https://echarts.apache.org/zh/option.html#series-themeRiver.select</a>
     * <br/>序号: 21
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>选中状态的配置。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.selectedMode">https://echarts.apache.org/zh/option.html#series-themeRiver.selectedMode</a>
     * <br/>序号: 22
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.data">https://echarts.apache.org/zh/option.html#series-themeRiver.data</a>
     * <br/>序号: 23
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <pre><code class="lang-js hljs javascript">data: [
     *     [<span class="hljs-string">"2015/11/09"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"DQ"</span>],
     *     [<span class="hljs-string">"2015/11/10"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"DQ"</span>],
     *     [<span class="hljs-string">"2015/11/11"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"DQ"</span>],
     *     [<span class="hljs-string">"2015/11/08"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"SS"</span>],
     *     [<span class="hljs-string">"2015/11/09"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"SS"</span>],
     *     [<span class="hljs-string">"2015/11/10"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"SS"</span>],
     *     [<span class="hljs-string">"2015/11/11"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"SS"</span>],
     *     [<span class="hljs-string">"2015/11/12"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"SS"</span>],
     *     [<span class="hljs-string">"2015/11/13"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"QG"</span>],
     *     [<span class="hljs-string">"2015/11/08"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"QG"</span>],
     *     [<span class="hljs-string">"2015/11/11"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"QG"</span>],
     *     [<span class="hljs-string">"2015/11/13"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"QG"</span>],
     * ]
     * </code></pre>
     * <p><strong>数据说明：</strong></p>
     * <p>如上所示，主题河流的数据格式是二维数组的形式，里层数组的每一项由事件或主题的时间属性、事件或主题在某个时间点的值，以及事件或主题的名称组成。值得注意的是，一定要提供一个具有完整时间段的事件或主题作为主干河流，其他事件或主题以该主干河流为依据，将缺省的时间点上的值补为0，也就是说其他事件或主题的时间段是包含在主干河流内的，如果超出，布局会出错，这么做的原因是，在计算整个图的布局的时候要计算一条baseline，以便将每个事情画成流带状。如上图中的"SS"这一事件就是一个主干河流，经过处理，我们会将"DQ"中缺省的三个时间点以["2015/11/08",0,"DQ"]，["2015/11/12",0,"DQ"]，［"2015/11/13",0,"DQ"］的格式补齐，使其与主干河流对其。从中还可以看出，我们可以在完整时间段的任意位置缺省。</p>
     */
    private List<?> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.tooltip">https://echarts.apache.org/zh/option.html#series-themeRiver.tooltip</a>
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
