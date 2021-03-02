package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.candlestickSeries.Blur;
import com.xmjz.echarts.nativebean.option.candlestickSeries.Emphasis;
import com.xmjz.echarts.nativebean.option.candlestickSeries.ItemStyle;
import com.xmjz.echarts.nativebean.option.candlestickSeries.Select;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick">https://echarts.apache.org/zh/option.html#series-candlestick</a>
 * <br/>序号: 0
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><a href="https://en.wikipedia.org/wiki/Candlestick_chart" target="_blank">Candlestick</a> 即我们常说的 <code class="codespan">K线图</code>。</p>
 * <p>在 ECharts3 中，同时支持 <code class="codespan">'candlestick'</code> 和 <code class="codespan">'k'</code>这两种 <code class="codespan">'series.type'</code>（<code class="codespan">'k'</code> 会被自动转为 <code class="codespan">'candlestick'</code>）。</p>
 * <p><strong>示例如下：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=candlestick-sh&amp;edit=1&amp;reset=1" width="600" height="400" data-ll-timeout="18"></iframe>
 *
 *
 *
 * <p><br>
 * <strong>关于『涨』『跌』的颜色：</strong></p>
 * <p>不同国家或地区对于 K线图 的颜色定义不一样，可能是『红涨绿跌』或『红涨蓝跌』（如大陆、台湾、日本、韩国等），可能是『绿涨红跌』（如西方国家、香港、新加坡等）。K线图也不一定要用红蓝、红绿来表示涨跌，也可以是『有色/无色』等表示方法。</p>
 * <p>默认配置项，采用的是『红涨蓝跌』。如果想更改这个颜色配置，在这些配置项中更改即可：</p>
 * <ul>
 * <li><a href="#series-candlestick.itemStyle.color">series-candlestick.itemStyle.color</a>：阳线填充色（即『涨』）</li>
 * <li><a href="#series-candlestick.itemStyle.color0">series-candlestick.itemStyle.color0</a>：阴线填充色（即『跌』）</li>
 * <li><a href="#series-candlestick.itemStyle.borderColor">series-candlestick.itemStyle.borderColor</a>：阳线边框色（即『涨』）</li>
 * <li><a href="series-candlestick.itemStyle.borderColor0" target="_blank">series-candlestick.itemStyle.borderColor0</a>：阴线边框色（即『跌』）</li>
 * </ul>
 * <p><br>
 * <br></p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class CandlestickSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.type">https://echarts.apache.org/zh/option.html#series-candlestick.type</a>
     * <br/>序号: 1
     * <br/>默认值: candlestick
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.id">https://echarts.apache.org/zh/option.html#series-candlestick.id</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.coordinateSystem">https://echarts.apache.org/zh/option.html#series-candlestick.coordinateSystem</a>
     * <br/>序号: 3
     * <br/>默认值: cartesian2d
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该系列使用的坐标系，可选：</p>
     * <ul>
     * <li><p><code class="codespan">'cartesian2d'</code></p>
     * <p>  使用二维的直角坐标系（也称笛卡尔坐标系），通过 <a href="#series-cartesian2d.xAxisIndex">xAxisIndex</a>, <a href="#series-cartesian2d.yAxisIndex">yAxisIndex</a>指定相应的坐标轴组件。</p>
     * </li>
     * </ul>
     */
    private String coordinateSystem;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.xAxisIndex">https://echarts.apache.org/zh/option.html#series-candlestick.xAxisIndex</a>
     * <br/>序号: 4
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.yAxisIndex">https://echarts.apache.org/zh/option.html#series-candlestick.yAxisIndex</a>
     * <br/>序号: 5
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.name">https://echarts.apache.org/zh/option.html#series-candlestick.name</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.legendHoverLink">https://echarts.apache.org/zh/option.html#series-candlestick.legendHoverLink</a>
     * <br/>序号: 7
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否启用<a href="#legend">图例</a> hover 时的联动高亮。</p>
     */
    private Boolean legendHoverLink;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.hoverAnimation">https://echarts.apache.org/zh/option.html#series-candlestick.hoverAnimation</a>
     * <br/>序号: 8
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启 hover 在 box 上的动画效果。</p>
     */
    private Boolean hoverAnimation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.layout">https://echarts.apache.org/zh/option.html#series-candlestick.layout</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>布局方式，可选值：</p>
     * <ul>
     * <li><p><code class="codespan">'horizontal'</code>：水平排布各个 box。</p>
     * </li>
     * <li><p><code class="codespan">'vertical'</code>：竖直排布各个 box。</p>
     * </li>
     * </ul>
     * <p>默认值根据当前坐标系状况决定：如果 <code class="codespan">category</code> 轴为横轴，则水平排布；否则竖直排布；如果没有 <code class="codespan">category</code> 轴则水平排布。</p>
     */
    private String layout;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.barWidth">https://echarts.apache.org/zh/option.html#series-candlestick.barWidth</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指定柱宽度。可以使用绝对数值（如 <code class="codespan">10</code>）或百分比（如 <code class="codespan">'20%'</code>，表示 band width 的百分之多少）。默认自适应。</p>
     */
    private Integer barWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.barMinWidth">https://echarts.apache.org/zh/option.html#series-candlestick.barMinWidth</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>指定柱最小宽度。可以使用绝对数值（如 <code class="codespan">10</code>）或百分比（如 <code class="codespan">'20%'</code>，表示 band width 的百分之多少）。默认自适应。</p>
     */
    private Object barMinWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.barMaxWidth">https://echarts.apache.org/zh/option.html#series-candlestick.barMaxWidth</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>指定柱最大宽度。可以使用绝对数值（如 <code class="codespan">10</code>）或百分比（如 <code class="codespan">'20%'</code>，表示 band width 的百分之多少）。默认自适应。</p>
     */
    private Object barMaxWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle">https://echarts.apache.org/zh/option.html#series-candlestick.itemStyle</a>
     * <br/>序号: 13
     * <br/>默认值: #c23531
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>K 线图的图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.emphasis">https://echarts.apache.org/zh/option.html#series-candlestick.emphasis</a>
     * <br/>序号: 14
     * <br/>默认值: none
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>K 线图的高亮状态。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.blur">https://echarts.apache.org/zh/option.html#series-candlestick.blur</a>
     * <br/>序号: 15
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>K 线图的淡出状态。开启 <a href="#series-candlestick.emphasis.focus">emphasis.focus</a> 后有效</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.select">https://echarts.apache.org/zh/option.html#series-candlestick.select</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>K 线图的选中状态。开启 <a href="#series-candlestick.selectedMode">selectedMode</a> 后有效。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.selectedMode">https://echarts.apache.org/zh/option.html#series-candlestick.selectedMode</a>
     * <br/>序号: 17
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.large">https://echarts.apache.org/zh/option.html#series-candlestick.large</a>
     * <br/>序号: 18
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启大数据量优化，在数据图形特别多而出现卡顿时候可以开启。</p>
     * <p>开启后配合 <code class="codespan">largeThreshold</code> 在数据量大于指定阈值的时候对绘制进行优化。</p>
     * <p>缺点：优化后不能自定义设置单个数据项的样式。</p>
     */
    private Boolean large;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.largeThreshold">https://echarts.apache.org/zh/option.html#series-candlestick.largeThreshold</a>
     * <br/>序号: 19
     * <br/>默认值: 600
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>开启绘制优化的阈值。</p>
     */
    private Integer largeThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.progressive">https://echarts.apache.org/zh/option.html#series-candlestick.progressive</a>
     * <br/>序号: 20
     * <br/>默认值: 3000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>渐进式渲染时每一帧绘制图形数量，设为 0 时不启用渐进式渲染，支持每个系列单独配置。</p>
     * <p>在图中有数千到几千万图形元素的时候，一下子把图形绘制出来，或者交互重绘的时候可能会造成界面的卡顿甚至假死。ECharts 4 开始全流程支持渐进渲染（progressive rendering），渲染的时候会把创建好的图形分到数帧中渲染，每一帧渲染只渲染指定数量的图形。</p>
     * <p>该配置项就是用于配置该系列每一帧渲染的图形数，可以根据图表图形复杂度的需要适当调整这个数字使得在不影响交互流畅性的前提下达到绘制速度的最大化。比如在 lines 图或者平行坐标中线宽大于 1 的 polyline 绘制会很慢，这个数字就可以设置小一点，而线宽小于等于 1 的 polyline 绘制非常快，该配置项就可以相对调得比较大。</p>
     */
    private Integer progressive;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.progressiveThreshold">https://echarts.apache.org/zh/option.html#series-candlestick.progressiveThreshold</a>
     * <br/>序号: 21
     * <br/>默认值: 10000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>启用渐进式渲染的图形数量阈值，在单个系列的图形数量超过该阈值时启用渐进式渲染。</p>
     */
    private Integer progressiveThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.progressiveChunkMode">https://echarts.apache.org/zh/option.html#series-candlestick.progressiveChunkMode</a>
     * <br/>序号: 22
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.dimensions">https://echarts.apache.org/zh/option.html#series-candlestick.dimensions</a>
     * <br/>序号: 23
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.encode">https://echarts.apache.org/zh/option.html#series-candlestick.encode</a>
     * <br/>序号: 24
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data">https://echarts.apache.org/zh/option.html#series-candlestick.data</a>
     * <br/>序号: 25
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>数据格式是如下的二维数组。</p>
     * <pre><code class="lang-javascript hljs">[
     *     [<span class="hljs-number">2320.26</span>, <span class="hljs-number">2320.26</span>, <span class="hljs-number">2287.3</span>,  <span class="hljs-number">2362.94</span>],
     *     [<span class="hljs-number">2300</span>,    <span class="hljs-number">2291.3</span>,  <span class="hljs-number">2288.26</span>, <span class="hljs-number">2308.38</span>],
     *     { <span class="hljs-comment">// 数据项也可以是 Object，从而里面能含有对此数据项的特殊设置。</span>
     *         <span class="hljs-attr">value</span>: [<span class="hljs-number">2300</span>,    <span class="hljs-number">2291.3</span>,  <span class="hljs-number">2288.26</span>, <span class="hljs-number">2308.38</span>],
     *         <span class="hljs-attr">itemStyle</span>: {...}
     *     },
     *     ...
     * ]
     * </code></pre>
     * <p>二维数组的每一数组项（上例中的每行）是渲染一个box，它含有四个量值，依次是：</p>
     * <pre><code class="lang-javascript hljs">[open, close, lowest, highest] （即：[开盘值, 收盘值, 最低值, 最高值]）
     * </code></pre>
     */
    private List<Object> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.markPoint">https://echarts.apache.org/zh/option.html#series-candlestick.markPoint</a>
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标注。</p>
     */
    private Object markPoint;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.markLine">https://echarts.apache.org/zh/option.html#series-candlestick.markLine</a>
     * <br/>序号: 27
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标线。</p>
     */
    private Object markLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.markArea">https://echarts.apache.org/zh/option.html#series-candlestick.markArea</a>
     * <br/>序号: 28
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。</p>
     */
    private Object markArea;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.clip">https://echarts.apache.org/zh/option.html#series-candlestick.clip</a>
     * <br/>序号: 29
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.5.0</code> 开始支持</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.zlevel">https://echarts.apache.org/zh/option.html#series-candlestick.zlevel</a>
     * <br/>序号: 30
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>K线图所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.z">https://echarts.apache.org/zh/option.html#series-candlestick.z</a>
     * <br/>序号: 31
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>K线图组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.silent">https://echarts.apache.org/zh/option.html#series-candlestick.silent</a>
     * <br/>序号: 32
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.animationDuration">https://echarts.apache.org/zh/option.html#series-candlestick.animationDuration</a>
     * <br/>序号: 33
     * <br/>默认值: 300
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.animationEasing">https://echarts.apache.org/zh/option.html#series-candlestick.animationEasing</a>
     * <br/>序号: 34
     * <br/>默认值: linear
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.animationDelay">https://echarts.apache.org/zh/option.html#series-candlestick.animationDelay</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.tooltip">https://echarts.apache.org/zh/option.html#series-candlestick.tooltip</a>
     * <br/>序号: 36
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
