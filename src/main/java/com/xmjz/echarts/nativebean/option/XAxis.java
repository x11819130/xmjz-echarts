package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.xAxis.AxisPointer;
import com.xmjz.echarts.nativebean.option.xAxis.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis">https://echarts.apache.org/zh/option.html#xAxis</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>直角坐标系 grid 中的 x 轴，一般情况下单个 grid 组件最多只能放上下两个 x 轴，多于两个 x 轴需要通过配置 <a href="#xAxis.offset">offset</a> 属性防止同个位置多个 x 轴的重叠。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class XAxis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.id">https://echarts.apache.org/zh/option.html#xAxis.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.show">https://echarts.apache.org/zh/option.html#xAxis.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示 x 轴。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.gridIndex">https://echarts.apache.org/zh/option.html#xAxis.gridIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>x 轴所在的 grid 的索引，默认位于第一个 grid。</p>
     */
    private Integer gridIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.position">https://echarts.apache.org/zh/option.html#xAxis.position</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>x 轴的位置。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'top'</code></li>
     * <li><code class="codespan">'bottom'</code></li>
     * </ul>
     * <p>默认 grid 中的第一个 x 轴在 grid 的下方（<code class="codespan">'bottom'</code>），第二个 x 轴视第一个 x 轴的位置放在另一侧。</p>
     */
    private String position;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.offset">https://echarts.apache.org/zh/option.html#xAxis.offset</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>X 轴相对于默认位置的偏移，在相同的 <code class="codespan">position</code> 上有多个 X 轴的时候有用。</p>
     */
    private Integer offset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.realtimeSort">https://echarts.apache.org/zh/option.html#xAxis.realtimeSort</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>用于制作动态排序柱状图。设为 <code class="codespan">true</code> 时，表示 X 轴开启实时排序效果，仅当 X 轴的 <a href="#xAxis.type">type</a> 是 <code class="codespan">'value'</code> 时有效。</p>
     * <p>需要配合其他配置项共同实现动态排序柱状图效果，具体参见<a href="https://echarts.apache.org/handbook/zh/how-to/chart-types/bar/bar-race" target="_blank">动态排序柱状图</a>教程。</p>
     */
    private Boolean realtimeSort;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.sortSeriesIndex">https://echarts.apache.org/zh/option.html#xAxis.sortSeriesIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>动态排序柱状图用于排序的系列 id。目前只支持一个系列的柱状图排序效果，所以这个值只能取 0。仅当 X 轴 <a href="#xAxis.realtimeSort">realtimeSort</a> 为 <code class="codespan">true</code> 并且 <a href="#xAxis.type">type</a> 是 <code class="codespan">'value'</code> 时有效。</p>
     * <p>需要配合其他配置项共同实现动态排序柱状图效果，具体参见<a href="https://echarts.apache.org/handbook/zh/how-to/chart-types/bar/bar-race" target="_blank">动态排序柱状图</a>教程。</p>
     */
    private Integer sortSeriesIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.type">https://echarts.apache.org/zh/option.html#xAxis.type</a>
     * <br/>默认值: category
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>坐标轴类型。</p>
     * <p>可选：</p>
     * <ul>
     * <li><p><code class="codespan">'value'</code>
     *   数值轴，适用于连续数据。</p>
     * </li>
     * <li><p><code class="codespan">'category'</code>
     *   类目轴，适用于离散的类目数据。为该类型时类目数据可自动从 <a href="#series.data">series.data</a> 或 <a href="#dataset.source">dataset.source</a> 中取，或者可通过 <a href="#xAxis.data">xAxis.data</a> 设置类目数据。</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.name">https://echarts.apache.org/zh/option.html#xAxis.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>坐标轴名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.nameLocation">https://echarts.apache.org/zh/option.html#xAxis.nameLocation</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.nameTextStyle">https://echarts.apache.org/zh/option.html#xAxis.nameTextStyle</a>
     * <br/>默认值: normal
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴名称的文字样式。</p>
     */
    private NameTextStyle nameTextStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.nameGap">https://echarts.apache.org/zh/option.html#xAxis.nameGap</a>
     * <br/>默认值: 15
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴名称与轴线之间的距离。</p>
     */
    private Integer nameGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.nameRotate">https://echarts.apache.org/zh/option.html#xAxis.nameRotate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴名字旋转，角度值。</p>
     */
    private Integer nameRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.inverse">https://echarts.apache.org/zh/option.html#xAxis.inverse</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否是反向坐标轴。</p>
     */
    private Boolean inverse;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.boundaryGap">https://echarts.apache.org/zh/option.html#xAxis.boundaryGap</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","Array"]
     * <br/>描述:
     * <p>坐标轴两边留白策略，类目轴和非类目轴的设置和表现不一样。</p>
     * <p>类目轴中 <code class="codespan">boundaryGap</code> 可以配置为 <code class="codespan">true</code> 和 <code class="codespan">false</code>。默认为 <code class="codespan">true</code>，这时候<a href="#xAxis.axisTick">刻度</a>只是作为分隔线，标签和数据点都会在两个<a href="#xAxis.axisTick">刻度</a>之间的带(band)中间。</p>
     * <p>非类目轴，包括时间，数值，对数轴，<code class="codespan">boundaryGap</code>是一个两个值的数组，分别表示数据最小值和最大值的延伸范围，可以直接设置数值或者相对的百分比，在设置 <a href="#xAxis.min">min</a> 和 <a href="#xAxis.max">max</a> 后无效。
     * <strong>示例：</strong></p>
     * <pre><code class="lang-js hljs javascript">boundaryGap: [<span class="hljs-string">'20%'</span>, <span class="hljs-string">'20%'</span>]
     * </code></pre>
     */
    private Object boundaryGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.min">https://echarts.apache.org/zh/option.html#xAxis.min</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.max">https://echarts.apache.org/zh/option.html#xAxis.max</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.scale">https://echarts.apache.org/zh/option.html#xAxis.scale</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>只在数值轴中（<a href="#xAxis.type">type</a>: 'value'）有效。</p>
     * <p>是否是脱离 0 值比例。设置成 <code class="codespan">true</code> 后坐标刻度不会强制包含零刻度。在双数值轴的散点图中比较有用。</p>
     * <p>在设置 <a href="#xAxis.min">min</a> 和 <a href="#xAxis.max">max</a> 之后该配置项无效。</p>
     */
    private Boolean scale;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.splitNumber">https://echarts.apache.org/zh/option.html#xAxis.splitNumber</a>
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴的分割段数，需要注意的是这个分割段数只是个预估值，最后实际显示的段数会在这个基础上根据分割后坐标轴刻度显示的易读程度作调整。</p>
     * <p>在类目轴中无效。</p>
     */
    private Integer splitNumber;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.minInterval">https://echarts.apache.org/zh/option.html#xAxis.minInterval</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>自动计算的坐标轴最小间隔大小。</p>
     * <p>例如可以设置成<code class="codespan">1</code>保证坐标轴分割刻度显示成整数。</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">minInterval</span>: <span class="hljs-number">1</span>
     * }
     * </code></pre>
     * <p>只在数值轴或时间轴中（<a href="#xAxis.type">type</a>: 'value' 或 'time'）有效。</p>
     */
    private Integer minInterval;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.maxInterval">https://echarts.apache.org/zh/option.html#xAxis.maxInterval</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>自动计算的坐标轴最大间隔大小。</p>
     * <p>例如，在时间轴（（<a href="#xAxis.type">type</a>: 'time'））可以设置成 <code class="codespan">3600 * 24 * 1000</code> 保证坐标轴分割刻度最大为一天。</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">maxInterval</span>: <span class="hljs-number">3600</span> * <span class="hljs-number">24</span> * <span class="hljs-number">1000</span>
     * }
     * </code></pre>
     * <p>只在数值轴或时间轴中（<a href="#xAxis.type">type</a>: 'value' 或 'time'）有效。</p>
     */
    private Integer maxInterval;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.interval">https://echarts.apache.org/zh/option.html#xAxis.interval</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>强制设置坐标轴分割间隔。</p>
     * <p>因为 <a href="#xAxis.splitNumber">splitNumber</a> 是预估的值，实际根据策略计算出来的刻度可能无法达到想要的效果，这时候可以使用 interval 配合 <a href="#xAxis.min">min</a>、<a href="#xAxis.max">max</a> 强制设定刻度划分，一般不建议使用。</p>
     * <p>无法在类目轴中使用。在时间轴（<a href="#xAxis.type">type</a>: 'time'）中需要传时间戳，在对数轴（<a href="#xAxis.type">type</a>: 'log'）中需要传指数值。</p>
     */
    private Integer interval;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.logBase">https://echarts.apache.org/zh/option.html#xAxis.logBase</a>
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>对数轴的底数，只在对数轴中（<a href="#xAxis.type">type</a>: 'log'）有效。</p>
     */
    private Integer logBase;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.silent">https://echarts.apache.org/zh/option.html#xAxis.silent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>坐标轴是否是静态无法交互。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.triggerEvent">https://echarts.apache.org/zh/option.html#xAxis.triggerEvent</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.axisLine">https://echarts.apache.org/zh/option.html#xAxis.axisLine</a>
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴轴线相关设置。</p>
     */
    private AxisLine axisLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.axisTick">https://echarts.apache.org/zh/option.html#xAxis.axisTick</a>
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴刻度相关设置。</p>
     */
    private AxisTick axisTick;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.minorTick">https://echarts.apache.org/zh/option.html#xAxis.minorTick</a>
     * <br/>默认值: 5
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.6.0</code> 开始支持</p>
     * </blockquote>
     * <p>坐标轴次刻度线相关设置。</p>
     * <p>注意：次刻度线无法在类目轴（<a href="#xAxis.type">type</a>: <code class="codespan">'category'</code>）中使用。</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.axisLabel">https://echarts.apache.org/zh/option.html#xAxis.axisLabel</a>
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴刻度标签的相关设置。</p>
     */
    private AxisLabel axisLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.splitLine">https://echarts.apache.org/zh/option.html#xAxis.splitLine</a>
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴在 <a href="#grid">grid</a> 区域中的分隔线。</p>
     */
    private SplitLine splitLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.minorSplitLine">https://echarts.apache.org/zh/option.html#xAxis.minorSplitLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.6.0</code> 开始支持</p>
     * </blockquote>
     * <p>坐标轴在 <a href="#grid">grid</a> 区域中的次分隔线。次分割线会对齐次刻度线 <a href="#xAxis.minorTick">minorTick</a></p>
     */
    private MinorSplitLine minorSplitLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.splitArea">https://echarts.apache.org/zh/option.html#xAxis.splitArea</a>
     * <br/>默认值: auto
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴在 <a href="#grid">grid</a> 区域中的分隔区域，默认不显示。</p>
     */
    private SplitArea splitArea;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.data">https://echarts.apache.org/zh/option.html#xAxis.data</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>类目数据，在类目轴（<a href="#xAxis.type">type</a>: <code class="codespan">'category'</code>）中有效。</p>
     * <p>如果没有设置 <a href="#xAxis.type">type</a>，但是设置了 <code class="codespan">axis.data</code>，则认为 <code class="codespan">type</code> 是 <code class="codespan">'category'</code>。</p>
     * <p>如果设置了 <a href="#xAxis.type">type</a> 是 <code class="codespan">'category'</code>，但没有设置 <code class="codespan">axis.data</code>，则 <code class="codespan">axis.data</code> 的内容会自动从 <a href="#series.data">series.data</a> 中获取，这会比较方便。不过注意，<code class="codespan">axis.data</code> 指明的是 <code class="codespan">'category'</code> 轴的取值范围。如果不指定而是从 <a href="#series.data">series.data</a> 中获取，那么只能获取到 <a href="#series.data">series.data</a> 中出现的值。比如说，假如 <a href="#series.data">series.data</a> 为空时，就什么也获取不到。</p>
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
    private List<?> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.axisPointer">https://echarts.apache.org/zh/option.html#xAxis.axisPointer</a>
     * <br/>默认值: line
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴指示器配置项。</p>
     */
    private AxisPointer axisPointer;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.zlevel">https://echarts.apache.org/zh/option.html#xAxis.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>X 轴所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.z">https://echarts.apache.org/zh/option.html#xAxis.z</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>X 轴组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
}
