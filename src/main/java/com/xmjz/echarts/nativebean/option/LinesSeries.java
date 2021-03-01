package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.linesSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines">https://echarts.apache.org/zh/option.html#series-lines</a>
 * <br/>序号: 0
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>路径图</strong></p>
 * <p>用于带有起点和终点信息的线数据的绘制，主要用于地图上的航线，路线的可视化。</p>
 * <p>ECharts 2.x 里会用地图上的 <code class="codespan">markLine</code> 去绘制迁徙效果，在 ECharts 3 里建议使用单独的 <code class="codespan">lines</code> 类型图表。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class LinesSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.type
     * <br/>序号: 1
     * <br/>默认值: lines
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.id
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.name
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.coordinateSystem
     * <br/>序号: 4
     * <br/>默认值: geo
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该系列使用的坐标系，可选：</p>
     * <ul>
     * <li><p><code class="codespan">'cartesian2d'</code></p>
     * <p>  使用二维的直角坐标系（也称笛卡尔坐标系），通过 <a href="#series-lines.xAxisIndex">xAxisIndex</a>, <a href="#series-lines.yAxisIndex">yAxisIndex</a>指定相应的坐标轴组件。</p>
     * </li>
     * </ul>
     * <ul>
     * <li><p><code class="codespan">'geo'</code></p>
     * <p>  使用地理坐标系，通过 <a href="#series-lines.geoIndex">geoIndex</a> 指定相应的地理坐标系组件。</p>
     * </li>
     * </ul>
     */
    private String coordinateSystem;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.xAxisIndex
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的 <a href="#xAxis">x 轴</a>的 index，在单个图表实例中存在多个 x 轴的时候有用。</p>
     */
    private Integer xAxisIndex;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.yAxisIndex
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的 <a href="#yAxis">y 轴</a>的 index，在单个图表实例中存在多个 y轴的时候有用。</p>
     */
    private Integer yAxisIndex;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.geoIndex
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的<a href="#geo">地理坐标系</a>的 index，在单个图表实例中存在多个地理坐标系的时候有用。</p>
     */
    private Integer geoIndex;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.polyline
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否是多段线。</p>
     * <p>默认为 <code class="codespan">false</code>，只能用于绘制只有两个端点的线段，线段可以通过 <a href="#series-lines.lineStyle.curveness">lineStyle.curveness</a> 配置为曲线。</p>
     * <p>如果该配置项为 <code class="codespan">true</code>，则可以在 <a href="#series-lines.data.coords">data.coords</a> 中设置多于 2 个的顶点用来绘制多段线，在绘制路线轨迹的时候比较有用，见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=lines-bmap-bus" target="_blank">北京公交路线</a>，设置为多段线后 <a href="#series-lines.lineStyle.curveness">lineStyle.curveness</a> 无效。</p>
     */
    private Boolean polyline;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.effect
     * <br/>序号: 9
     * <br/>默认值: 4
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>线特效的配置，见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=geo-lines" target="_blank">模拟迁徙</a> 和 <a href="https://echarts.apache.org/examples/zh/editor.html?c=lines-bmap-effect" target="_blank">北京公交路线</a></p>
     * <p><strong>注意：</strong> 所有带有尾迹特效的图表需要单独放在一个层，也就是需要单独设置 <a href="#series-lines.zlevel">zlevel</a>，同时建议关闭该层的动画（<a href="#series-lines.animation">animation</a>: false）。不然位于同个层的其它系列的图形，和动画的<a href="#series-lines.label">标签</a>也会产生不必要的残影。</p>
     */
    private Effect effect;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.large
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否启用大规模路径图的优化，在数据图形特别多的时候（&gt;=5k）可以开启。</p>
     * <p>开启后配合 <a href="#series-lines.largeThreshold">largeThreshold</a> 在数据量大于指定阈值的时候对绘制进行优化。</p>
     * <p>缺点：优化后不能自定义设置单个数据项的样式，不能启用 <a href="#series-lines.effect">effect</a>。</p>
     */
    private Boolean large;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.largeThreshold
     * <br/>序号: 11
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>开启绘制优化的阈值。</p>
     */
    private Integer largeThreshold;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.symbol
     * <br/>序号: 12
     * <br/>默认值: none
     * <br/>js类型: ["string","Array"]
     * <br/>描述:
     * <p>线两端的标记类型，可以是一个数组分别指定两端，也可以是单个统一指定。
     * 具体支持的格式可以参考 <a href="#series-line.markLine.data.0.symbol">标线的 symbol</a></p>
     */
    private Object symbol;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.symbolSize
     * <br/>序号: 13
     * <br/>默认值: 10
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>线两端的标记大小，可以是一个数组分别指定两端，也可以是单个统一指定。
     * <strong>注意：</strong> 这里无法像一般的 <code class="codespan">symbolSize</code> 那样通过数组分别指定高宽。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.lineStyle
     * <br/>序号: 14
     * <br/>默认值: 自适应
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.label
     * <br/>序号: 15
     * <br/>默认值: end
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签相关配置。在 <a href="#series-lines.polyline">polyline</a> 设置为 <code class="codespan">true</code> 时无效。</p>
     */
    private Label label;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.labelLayout
     * <br/>序号: 16
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.emphasis
     * <br/>序号: 17
     * <br/>默认值: none
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮的线条和标签样式。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.blur
     * <br/>序号: 18
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出的线条和标签样式。开启 <a href="#series-lines.emphasis.focus">emphasis.focus</a> 后有效。</p>
     */
    private Blur blur;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.select
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>选中的线条和标签样式。开启 <a href="#series-lines.selectedMode">selectedMode</a> 后有效。</p>
     */
    private Select select;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.selectedMode
     * <br/>序号: 20
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.progressive
     * <br/>序号: 21
     * <br/>默认值: 400
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>渐进式渲染时每一帧绘制图形数量，设为 0 时不启用渐进式渲染，支持每个系列单独配置。</p>
     * <p>在图中有数千到几千万图形元素的时候，一下子把图形绘制出来，或者交互重绘的时候可能会造成界面的卡顿甚至假死。ECharts 4 开始全流程支持渐进渲染（progressive rendering），渲染的时候会把创建好的图形分到数帧中渲染，每一帧渲染只渲染指定数量的图形。</p>
     * <p>该配置项就是用于配置该系列每一帧渲染的图形数，可以根据图表图形复杂度的需要适当调整这个数字使得在不影响交互流畅性的前提下达到绘制速度的最大化。比如在 lines 图或者平行坐标中线宽大于 1 的 polyline 绘制会很慢，这个数字就可以设置小一点，而线宽小于等于 1 的 polyline 绘制非常快，该配置项就可以相对调得比较大。</p>
     */
    private Integer progressive;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.progressiveThreshold
     * <br/>序号: 22
     * <br/>默认值: 3000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>启用渐进式渲染的图形数量阈值，在单个系列的图形数量超过该阈值时启用渐进式渲染。</p>
     */
    private Integer progressiveThreshold;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.data
     * <br/>序号: 23
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>线数据集。</p>
     * <p><strong>注：</strong> 为了更好点支持多段线的配置，线数据的格式在 3.2.0 做了一定调整，如下：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 3.2.0 之前</span>
     * <span class="hljs-comment">// [{</span>
     * <span class="hljs-comment">//    // 起点坐标</span>
     * <span class="hljs-comment">//    coord: [120, 66],</span>
     * <span class="hljs-comment">//    lineStyle: { }</span>
     * <span class="hljs-comment">// }, {</span>
     * <span class="hljs-comment">//    // 终点坐标</span>
     * <span class="hljs-comment">//    coord: [122, 67]</span>
     * <span class="hljs-comment">// }]</span>
     *
     * <span class="hljs-comment">// 从 3.2.0 起改为如下配置</span>
     * {
     *     <span class="hljs-attr">coords</span>: [
     *         [<span class="hljs-number">120</span>, <span class="hljs-number">66</span>],  <span class="hljs-comment">// 起点</span>
     *         [<span class="hljs-number">122</span>, <span class="hljs-number">67</span>]   <span class="hljs-comment">// 终点</span>
     *         ...         <span class="hljs-comment">// 如果 polyline 为 true 还可以设置更多的点</span>
     *     ],
     *     <span class="hljs-comment">// 统一的样式设置</span>
     *     <span class="hljs-attr">lineStyle</span>: {
     *     }
     * }
     * </code></pre>
     */
    private List<Object> data;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.markPoint
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标注。</p>
     */
    private Object markPoint;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.markLine
     * <br/>序号: 25
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标线。</p>
     */
    private Object markLine;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.markArea
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。</p>
     */
    private Object markArea;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.clip
     * <br/>序号: 27
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.zlevel
     * <br/>序号: 28
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>路径图所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.z
     * <br/>序号: 29
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>路径图组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.silent
     * <br/>序号: 30
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.animation
     * <br/>序号: 31
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.animationThreshold
     * <br/>序号: 32
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.animationDuration
     * <br/>序号: 33
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.animationEasing
     * <br/>序号: 34
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.animationDelay
     * <br/>序号: 35
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.animationDurationUpdate
     * <br/>序号: 36
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.animationEasingUpdate
     * <br/>序号: 37
     * <br/>默认值: cubicInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-lines.animationDelayUpdate
     * <br/>序号: 38
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
}
