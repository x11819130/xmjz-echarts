package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.gaugeSeries.Title;
import com.xmjz.echarts.nativebean.option.gaugeSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge">https://echarts.apache.org/zh/option.html#series-gauge</a>
 * <br/>序号: 0
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>仪表盘</strong></p>
 * <p><strong>示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=gauge&amp;reset=1&amp;edit=1" width="600" height="500" data-ll-timeout="19"></iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class GaugeSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.type">https://echarts.apache.org/zh/option.html#series-gauge.type</a>
     * <br/>序号: 1
     * <br/>默认值: gauge
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.id">https://echarts.apache.org/zh/option.html#series-gauge.id</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.name">https://echarts.apache.org/zh/option.html#series-gauge.name</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.zlevel">https://echarts.apache.org/zh/option.html#series-gauge.zlevel</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.z">https://echarts.apache.org/zh/option.html#series-gauge.z</a>
     * <br/>序号: 5
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.center">https://echarts.apache.org/zh/option.html#series-gauge.center</a>
     * <br/>序号: 6
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.radius">https://echarts.apache.org/zh/option.html#series-gauge.radius</a>
     * <br/>序号: 7
     * <br/>默认值: 75%
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>仪表盘半径，可以是相对于容器高宽中较小的一项的一半的百分比，也可以是绝对的数值。</p>
     */
    private Object radius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.legendHoverLink">https://echarts.apache.org/zh/option.html#series-gauge.legendHoverLink</a>
     * <br/>序号: 8
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否启用<a href="#legend">图例</a> hover 时的联动高亮。</p>
     */
    private Boolean legendHoverLink;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.startAngle">https://echarts.apache.org/zh/option.html#series-gauge.startAngle</a>
     * <br/>序号: 9
     * <br/>默认值: 225
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>仪表盘起始角度。<a href="#series-gauge.center">圆心</a> 正右手侧为<code class="codespan">0</code>度，正上方为<code class="codespan">90</code>度，正左手侧为<code class="codespan">180</code>度。</p>
     */
    private Integer startAngle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.endAngle">https://echarts.apache.org/zh/option.html#series-gauge.endAngle</a>
     * <br/>序号: 10
     * <br/>默认值: -45
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>仪表盘结束角度。</p>
     */
    private Integer endAngle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.clockwise">https://echarts.apache.org/zh/option.html#series-gauge.clockwise</a>
     * <br/>序号: 11
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>仪表盘刻度是否是顺时针增长。</p>
     */
    private Boolean clockwise;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.data">https://echarts.apache.org/zh/option.html#series-gauge.data</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>系列中的数据内容数组。数组项可以为单个数值，如：</p>
     * <pre><code class="lang-js hljs javascript">[<span class="hljs-number">12</span>, <span class="hljs-number">34</span>, <span class="hljs-number">56</span>, <span class="hljs-number">10</span>, <span class="hljs-number">23</span>]
     * </code></pre>
     * <p>如果需要在数据中加入其它维度给 <a href="#visualMap">visualMap</a> 组件用来映射到颜色等其它图形属性。每个数据项也可以是数组，如：</p>
     * <pre><code class="lang-js hljs javascript">[[<span class="hljs-number">12</span>, <span class="hljs-number">14</span>], [<span class="hljs-number">34</span>, <span class="hljs-number">50</span>], [<span class="hljs-number">56</span>, <span class="hljs-number">30</span>], [<span class="hljs-number">10</span>, <span class="hljs-number">15</span>], [<span class="hljs-number">23</span>, <span class="hljs-number">10</span>]]
     * </code></pre>
     * <p>这时候可以将每项数组中的第二个值指定给 <a href="#visualMap">visualMap</a> 组件。</p>
     * <p>更多时候我们需要指定每个数据项的名称，这时候需要每个项为一个对象：</p>
     * <pre><code class="lang-js hljs javascript">[{
     *     <span class="hljs-comment">// 数据项的名称</span>
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'数据1'</span>,
     *     <span class="hljs-comment">// 数据项值8</span>
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">10</span>
     * }, {
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'数据2'</span>,
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">20</span>
     * }]
     * </code></pre>
     * <p>需要对个别内容指定进行个性化定义时：</p>
     * <pre><code class="lang-js hljs javascript">[{
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'数据1'</span>,
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">10</span>
     * }, {
     *     <span class="hljs-comment">// 数据项名称</span>
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'数据2'</span>,
     *     <span class="hljs-attr">value</span> : <span class="hljs-number">56</span>,
     *     <span class="hljs-comment">//自定义特殊 tooltip，仅对该数据项有效</span>
     *     <span class="hljs-attr">tooltip</span>:{},
     *     <span class="hljs-comment">//自定义特殊itemStyle，仅对该item有效</span>
     *     <span class="hljs-attr">itemStyle</span>:{}
     * }]
     * </code></pre>
     */
    private List<?> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.min">https://echarts.apache.org/zh/option.html#series-gauge.min</a>
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>最小的数据值，映射到 <a href="#series-gauge.minAngle">minAngle</a>。</p>
     */
    private Integer min;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.max">https://echarts.apache.org/zh/option.html#series-gauge.max</a>
     * <br/>序号: 14
     * <br/>默认值: 100
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>最大的数据值，映射到 <a href="#series-gauge.maxAngle">maxAngle</a>。</p>
     */
    private Integer max;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.splitNumber">https://echarts.apache.org/zh/option.html#series-gauge.splitNumber</a>
     * <br/>序号: 15
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>仪表盘刻度的分割段数。</p>
     */
    private Integer splitNumber;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisLine">https://echarts.apache.org/zh/option.html#series-gauge.axisLine</a>
     * <br/>序号: 16
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>仪表盘轴线相关配置。</p>
     */
    private AxisLine axisLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.progress">https://echarts.apache.org/zh/option.html#series-gauge.progress</a>
     * <br/>序号: 17
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0</code> 开始支持</p>
     * </blockquote>
     * <p>展示当前进度。</p>
     */
    private Progress progress;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.splitLine">https://echarts.apache.org/zh/option.html#series-gauge.splitLine</a>
     * <br/>序号: 18
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>分隔线样式。</p>
     */
    private SplitLine splitLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisTick">https://echarts.apache.org/zh/option.html#series-gauge.axisTick</a>
     * <br/>序号: 19
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>刻度样式。</p>
     */
    private AxisTick axisTick;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.axisLabel">https://echarts.apache.org/zh/option.html#series-gauge.axisLabel</a>
     * <br/>序号: 20
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>刻度标签。</p>
     */
    private AxisLabel axisLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.pointer">https://echarts.apache.org/zh/option.html#series-gauge.pointer</a>
     * <br/>序号: 21
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>仪表盘指针。</p>
     */
    private Pointer pointer;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.anchor">https://echarts.apache.org/zh/option.html#series-gauge.anchor</a>
     * <br/>序号: 22
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0</code> 开始支持</p>
     * </blockquote>
     * <p>表盘中指针的固定点。</p>
     */
    private Anchor anchor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.itemStyle">https://echarts.apache.org/zh/option.html#series-gauge.itemStyle</a>
     * <br/>序号: 23
     * <br/>默认值: auto
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>仪表盘指针样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.emphasis">https://echarts.apache.org/zh/option.html#series-gauge.emphasis</a>
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮的仪表盘指针样式</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.title">https://echarts.apache.org/zh/option.html#series-gauge.title</a>
     * <br/>序号: 25
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>仪表盘标题。</p>
     */
    private Title title;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.detail">https://echarts.apache.org/zh/option.html#series-gauge.detail</a>
     * <br/>序号: 26
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>仪表盘详情，用于显示数据。</p>
     */
    private Detail detail;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.markPoint">https://echarts.apache.org/zh/option.html#series-gauge.markPoint</a>
     * <br/>序号: 27
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标注。</p>
     */
    private Object markPoint;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.markLine">https://echarts.apache.org/zh/option.html#series-gauge.markLine</a>
     * <br/>序号: 28
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标线。</p>
     */
    private Object markLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.markArea">https://echarts.apache.org/zh/option.html#series-gauge.markArea</a>
     * <br/>序号: 29
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。</p>
     */
    private Object markArea;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.silent">https://echarts.apache.org/zh/option.html#series-gauge.silent</a>
     * <br/>序号: 30
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.animation">https://echarts.apache.org/zh/option.html#series-gauge.animation</a>
     * <br/>序号: 31
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.animationThreshold">https://echarts.apache.org/zh/option.html#series-gauge.animationThreshold</a>
     * <br/>序号: 32
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.animationDuration">https://echarts.apache.org/zh/option.html#series-gauge.animationDuration</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.animationEasing">https://echarts.apache.org/zh/option.html#series-gauge.animationEasing</a>
     * <br/>序号: 34
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.animationDelay">https://echarts.apache.org/zh/option.html#series-gauge.animationDelay</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.animationDurationUpdate">https://echarts.apache.org/zh/option.html#series-gauge.animationDurationUpdate</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.animationEasingUpdate">https://echarts.apache.org/zh/option.html#series-gauge.animationEasingUpdate</a>
     * <br/>序号: 37
     * <br/>默认值: cubicInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.animationDelayUpdate">https://echarts.apache.org/zh/option.html#series-gauge.animationDelayUpdate</a>
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
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.tooltip">https://echarts.apache.org/zh/option.html#series-gauge.tooltip</a>
     * <br/>序号: 39
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
