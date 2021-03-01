package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.singleAxis.AxisPointer;
import com.xmjz.echarts.nativebean.option.singleAxis.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#singleAxis">https://echarts.apache.org/zh/option.html#singleAxis</a>
 * <br/>序号: 19
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>单轴。可以被应用到散点图中展现一维数据，如下示例</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-single-axis&amp;edit=1&amp;reset=1" width="700" height="500"></iframe>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class SingleAxis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.id
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.zlevel
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
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.z
     * <br/>序号: 3
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.left
     * <br/>序号: 4
     * <br/>默认值: 5%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>single组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.top
     * <br/>序号: 5
     * <br/>默认值: 5%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>single组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.right
     * <br/>序号: 6
     * <br/>默认值: 5%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>single组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object right;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.bottom
     * <br/>序号: 7
     * <br/>默认值: 5%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>single组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object bottom;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.width
     * <br/>序号: 8
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>single组件的宽度。默认自适应。</p>
     */
    private Object width;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.height
     * <br/>序号: 9
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>single组件的高度。默认自适应。</p>
     */
    private Object height;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.orient
     * <br/>序号: 10
     * <br/>默认值: horizontal
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>轴的朝向，默认水平朝向，可以设置成 <code class="codespan">'vertical'</code> 垂直朝向。</p>
     */
    private String orient;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.type
     * <br/>序号: 11
     * <br/>默认值: value
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>坐标轴类型。</p>
     * <p>可选：</p>
     * <ul>
     * <li><p><code class="codespan">'value'</code>
     *   数值轴，适用于连续数据。</p>
     * </li>
     * <li><p><code class="codespan">'category'</code>
     *   类目轴，适用于离散的类目数据。为该类型时类目数据可自动从 <a href="#series.data">series.data</a> 或 <a href="#dataset.source">dataset.source</a> 中取，或者可通过 <a href="#singleAxis.data">singleAxis.data</a> 设置类目数据。</p>
     * </li>
     * <li><p><code class="codespan">'time'</code>
     *   时间轴，适用于连续的时序数据，与数值轴相比时间轴带有时间的格式化，在刻度计算上也有所不同，例如会根据跨度的范围来决定使用月，星期，日还是小时范围的刻度。</p>
     * </li>
     * <li><p><code class="codespan">'log'</code>
     *   对数轴。适用于对数数据。</p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.name
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>坐标轴名称。</p>
     */
    private String name;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.nameLocation
     * <br/>序号: 13
     * <br/>默认值: end
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>坐标轴名称显示位置。</p>
     * <p><strong>可选：</strong></p>
     * <ul>
     * <li><code class="codespan">'start'</code></li>
     * <li><code class="codespan">'middle'</code> 或者 <code class="codespan">'center'</code></li>
     * <li><code class="codespan">'end'</code></li>
     * </ul>
     */
    private String nameLocation;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.nameTextStyle
     * <br/>序号: 14
     * <br/>默认值: normal
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴名称的文字样式。</p>
     */
    private NameTextStyle nameTextStyle;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.nameGap
     * <br/>序号: 15
     * <br/>默认值: 15
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴名称与轴线之间的距离。</p>
     */
    private Integer nameGap;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.nameRotate
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴名字旋转，角度值。</p>
     */
    private Integer nameRotate;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.inverse
     * <br/>序号: 17
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否是反向坐标轴。</p>
     */
    private Boolean inverse;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.boundaryGap
     * <br/>序号: 18
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","Array"]
     * <br/>描述:
     * <p>坐标轴两边留白策略，类目轴和非类目轴的设置和表现不一样。</p>
     * <p>类目轴中 <code class="codespan">boundaryGap</code> 可以配置为 <code class="codespan">true</code> 和 <code class="codespan">false</code>。默认为 <code class="codespan">true</code>，这时候<a href="#singleAxis.axisTick">刻度</a>只是作为分隔线，标签和数据点都会在两个<a href="#singleAxis.axisTick">刻度</a>之间的带(band)中间。</p>
     * <p>非类目轴，包括时间，数值，对数轴，<code class="codespan">boundaryGap</code>是一个两个值的数组，分别表示数据最小值和最大值的延伸范围，可以直接设置数值或者相对的百分比，在设置 <a href="#singleAxis.min">min</a> 和 <a href="#singleAxis.max">max</a> 后无效。
     * <strong>示例：</strong></p>
     * <pre><code class="lang-js hljs javascript">boundaryGap: [<span class="hljs-string">'20%'</span>, <span class="hljs-string">'20%'</span>]
     * </code></pre>
     */
    private Object boundaryGap;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.min
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Function"]
     * <br/>描述:
     * <p>坐标轴刻度最小值。</p>
     * <p>可以设置成特殊值 <code class="codespan">'dataMin'</code>，此时取数据在该轴上的最小值作为最小刻度。</p>
     * <p>不设置时会自动计算最小值保证坐标轴刻度的均匀分布。</p>
     * <p>在类目轴中，也可以设置为类目的序数（如类目轴 <code class="codespan">data: ['类A', '类B', '类C']</code> 中，序数 <code class="codespan">2</code> 表示 <code class="codespan">'类C'</code>。也可以设置为负数，如 <code class="codespan">-3</code>）。</p>
     * <p>当设置成 <code class="codespan">function</code> 形式时，可以根据计算得出的数据最大最小值设定坐标轴的最小值。如：</p>
     * <pre><code class="lang-js hljs javascript">min: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value</span>) </span>{
     *     <span class="hljs-keyword">return</span> value.min - <span class="hljs-number">20</span>;
     * }
     * </code></pre>
     * <p>其中 <code class="codespan">value</code> 是一个包含 <code class="codespan">min</code> 和 <code class="codespan">max</code> 的对象，分别表示数据的最大最小值，这个函数可返回坐标轴的最小值，也可返回 <code class="codespan">null</code>/<code class="codespan">undefined</code> 来表示“自动计算最小值”（返回 <code class="codespan">null</code>/<code class="codespan">undefined</code> 从 <code class="codespan">v4.8.0</code> 开始支持）。</p>
     */
    private Object min;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.max
     * <br/>序号: 20
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Function"]
     * <br/>描述:
     * <p>坐标轴刻度最大值。</p>
     * <p>可以设置成特殊值 <code class="codespan">'dataMax'</code>，此时取数据在该轴上的最大值作为最大刻度。</p>
     * <p>不设置时会自动计算最大值保证坐标轴刻度的均匀分布。</p>
     * <p>在类目轴中，也可以设置为类目的序数（如类目轴 <code class="codespan">data: ['类A', '类B', '类C']</code> 中，序数 <code class="codespan">2</code> 表示 <code class="codespan">'类C'</code>。也可以设置为负数，如 <code class="codespan">-3</code>）。</p>
     * <p>当设置成 <code class="codespan">function</code> 形式时，可以根据计算得出的数据最大最小值设定坐标轴的最小值。如：</p>
     * <pre><code class="lang-js hljs javascript">max: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value</span>) </span>{
     *     <span class="hljs-keyword">return</span> value.max - <span class="hljs-number">20</span>;
     * }
     * </code></pre>
     * <p>其中 <code class="codespan">value</code> 是一个包含 <code class="codespan">min</code> 和 <code class="codespan">max</code> 的对象，分别表示数据的最大最小值，这个函数可返回坐标轴的最大值，也可返回 <code class="codespan">null</code>/<code class="codespan">undefined</code> 来表示“自动计算最大值”（返回 <code class="codespan">null</code>/<code class="codespan">undefined</code> 从 <code class="codespan">v4.8.0</code> 开始支持）。</p>
     */
    private Object max;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.scale
     * <br/>序号: 21
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>只在数值轴中（<a href="#singleAxis.type">type</a>: 'value'）有效。</p>
     * <p>是否是脱离 0 值比例。设置成 <code class="codespan">true</code> 后坐标刻度不会强制包含零刻度。在双数值轴的散点图中比较有用。</p>
     * <p>在设置 <a href="#singleAxis.min">min</a> 和 <a href="#singleAxis.max">max</a> 之后该配置项无效。</p>
     */
    private Boolean scale;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.splitNumber
     * <br/>序号: 22
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴的分割段数，需要注意的是这个分割段数只是个预估值，最后实际显示的段数会在这个基础上根据分割后坐标轴刻度显示的易读程度作调整。</p>
     * <p>在类目轴中无效。</p>
     */
    private Integer splitNumber;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.minInterval
     * <br/>序号: 23
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>自动计算的坐标轴最小间隔大小。</p>
     * <p>例如可以设置成<code class="codespan">1</code>保证坐标轴分割刻度显示成整数。</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">minInterval</span>: <span class="hljs-number">1</span>
     * }
     * </code></pre>
     * <p>只在数值轴或时间轴中（<a href="#singleAxis.type">type</a>: 'value' 或 'time'）有效。</p>
     */
    private Integer minInterval;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.maxInterval
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>自动计算的坐标轴最大间隔大小。</p>
     * <p>例如，在时间轴（（<a href="#singleAxis.type">type</a>: 'time'））可以设置成 <code class="codespan">3600 * 24 * 1000</code> 保证坐标轴分割刻度最大为一天。</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">maxInterval</span>: <span class="hljs-number">3600</span> * <span class="hljs-number">24</span> * <span class="hljs-number">1000</span>
     * }
     * </code></pre>
     * <p>只在数值轴或时间轴中（<a href="#singleAxis.type">type</a>: 'value' 或 'time'）有效。</p>
     */
    private Integer maxInterval;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.interval
     * <br/>序号: 25
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>强制设置坐标轴分割间隔。</p>
     * <p>因为 <a href="#singleAxis.splitNumber">splitNumber</a> 是预估的值，实际根据策略计算出来的刻度可能无法达到想要的效果，这时候可以使用 interval 配合 <a href="#singleAxis.min">min</a>、<a href="#singleAxis.max">max</a> 强制设定刻度划分，一般不建议使用。</p>
     * <p>无法在类目轴中使用。在时间轴（<a href="#singleAxis.type">type</a>: 'time'）中需要传时间戳，在对数轴（<a href="#singleAxis.type">type</a>: 'log'）中需要传指数值。</p>
     */
    private Integer interval;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.logBase
     * <br/>序号: 26
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>对数轴的底数，只在对数轴中（<a href="#singleAxis.type">type</a>: 'log'）有效。</p>
     */
    private Integer logBase;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.silent
     * <br/>序号: 27
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>坐标轴是否是静态无法交互。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.triggerEvent
     * <br/>序号: 28
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
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.axisLine
     * <br/>序号: 29
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴轴线相关设置。</p>
     */
    private AxisLine axisLine;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.axisTick
     * <br/>序号: 30
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴刻度相关设置。</p>
     */
    private AxisTick axisTick;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.minorTick
     * <br/>序号: 31
     * <br/>默认值: 5
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.6.0</code> 开始支持</p>
     * </blockquote>
     * <p>坐标轴次刻度线相关设置。</p>
     * <p>注意：次刻度线无法在类目轴（<a href="#singleAxis.type">type</a>: <code class="codespan">'category'</code>）中使用。</p>
     * <p>示例：</p>
     * <p>1) 函数绘图中使用次刻度线</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-function&amp;edit=1&amp;reset=1" width="600" height="350"></iframe>
     *
     *
     * <p>2) 在对数轴中使用次刻度线</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-log&amp;edit=1&amp;reset=1" width="600" height="350"></iframe>
     */
    private MinorTick minorTick;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.axisLabel
     * <br/>序号: 32
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴刻度标签的相关设置。</p>
     */
    private AxisLabel axisLabel;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.splitLine
     * <br/>序号: 33
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴在 <a href="#grid">grid</a> 区域中的分隔线。</p>
     */
    private SplitLine splitLine;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.minorSplitLine
     * <br/>序号: 34
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.6.0</code> 开始支持</p>
     * </blockquote>
     * <p>坐标轴在 <a href="#grid">grid</a> 区域中的次分隔线。次分割线会对齐次刻度线 <a href="#singleAxis.minorTick">minorTick</a></p>
     */
    private MinorSplitLine minorSplitLine;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.splitArea
     * <br/>序号: 35
     * <br/>默认值: auto
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴在 <a href="#grid">grid</a> 区域中的分隔区域，默认不显示。</p>
     */
    private SplitArea splitArea;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.data
     * <br/>序号: 36
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>类目数据，在类目轴（<a href="#singleAxis.type">type</a>: <code class="codespan">'category'</code>）中有效。</p>
     * <p>如果没有设置 <a href="#singleAxis.type">type</a>，但是设置了 <code class="codespan">axis.data</code>，则认为 <code class="codespan">type</code> 是 <code class="codespan">'category'</code>。</p>
     * <p>如果设置了 <a href="#singleAxis.type">type</a> 是 <code class="codespan">'category'</code>，但没有设置 <code class="codespan">axis.data</code>，则 <code class="codespan">axis.data</code> 的内容会自动从 <a href="#series.data">series.data</a> 中获取，这会比较方便。不过注意，<code class="codespan">axis.data</code> 指明的是 <code class="codespan">'category'</code> 轴的取值范围。如果不指定而是从 <a href="#series.data">series.data</a> 中获取，那么只能获取到 <a href="#series.data">series.data</a> 中出现的值。比如说，假如 <a href="#series.data">series.data</a> 为空时，就什么也获取不到。</p>
     * <p>示例：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 所有类目名称列表</span>
     * <span class="hljs-attr">data</span>: [<span class="hljs-string">'周一'</span>, <span class="hljs-string">'周二'</span>, <span class="hljs-string">'周三'</span>, <span class="hljs-string">'周四'</span>, <span class="hljs-string">'周五'</span>, <span class="hljs-string">'周六'</span>, <span class="hljs-string">'周日'</span>]
     * <span class="hljs-comment">// 每一项也可以是具体的配置项，此时取配置项中的 `value` 为类目名</span>
     * <span class="hljs-attr">data</span>: [{
     *     <span class="hljs-attr">value</span>: <span class="hljs-string">'周一'</span>,
     *     <span class="hljs-comment">// 突出周一</span>
     *     <span class="hljs-attr">textStyle</span>: {
     *         <span class="hljs-attr">fontSize</span>: <span class="hljs-number">20</span>,
     *         <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>
     *     }
     * }, <span class="hljs-string">'周二'</span>, <span class="hljs-string">'周三'</span>, <span class="hljs-string">'周四'</span>, <span class="hljs-string">'周五'</span>, <span class="hljs-string">'周六'</span>, <span class="hljs-string">'周日'</span>]
     * </code></pre>
     */
    private List<Object> data;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.axisPointer
     * <br/>序号: 37
     * <br/>默认值: line
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴指示器配置项。</p>
     */
    private AxisPointer axisPointer;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#singleAxis.tooltip
     * <br/>序号: 38
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本坐标系特定的 tooltip 设定。</p>
     * <hr>
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
     * <hr>
     */
    private Object tooltip;
}
