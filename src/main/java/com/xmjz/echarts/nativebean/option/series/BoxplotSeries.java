package com.xmjz.echarts.nativebean.option.series;

import com.xmjz.echarts.nativebean.option.Series;
import com.xmjz.echarts.nativebean.option.series.boxplotSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot">#series-boxplot</a>
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><a href="https://en.wikipedia.org/wiki/Box_plot" target="_blank">Boxplot</a> 中文可以称为『箱形图』、『盒须图』、『盒式图』、『盒状图』、『箱线图』，是一种用作显示一组数据分散情况资料的统计图。它能显示出一组数据的最大值、最小值、中位数、下四分位数及上四分位数。</p>
 * <p><strong>示例如下：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=boxplot-light-velocity&amp;edit=1&amp;reset=1" width="600" height="400" data-ll-timeout="25"></iframe>
 *
 *
 * <p>也支持多个 <code class="codespan">series</code> 在同一个坐标系中，参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=boxplot-multi&amp;edit=1&amp;reset=1" target="_blank">例子</a>。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class BoxplotSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.type">#series-boxplot.type</a>
     * <br/>默认值: 'boxplot'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.id">#series-boxplot.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.coordinateSystem">#series-boxplot.coordinateSystem</a>
     * <br/>默认值: 'cartesian2d'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该系列使用的坐标系，可选：</p>
     * <ul>
     * <li><p><code class="codespan">'cartesian2d'</code></p>
     * <p>  使用二维的直角坐标系（也称笛卡尔坐标系），通过 <a href="https://echarts.apache.org/zh/option.html#series-cartesian2d.xAxisIndex">xAxisIndex</a>, <a href="https://echarts.apache.org/zh/option.html#series-cartesian2d.yAxisIndex">yAxisIndex</a>指定相应的坐标轴组件。</p>
     * </li>
     * </ul>
     */
    private String coordinateSystem;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.xAxisIndex">#series-boxplot.xAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的 <a href="https://echarts.apache.org/zh/option.html#xAxis">x 轴</a>的 index，在单个图表实例中存在多个 x 轴的时候有用。</p>
     */
    private Integer xAxisIndex;

    public Integer getxAxisIndex() {
        return this.xAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.yAxisIndex">#series-boxplot.yAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的 <a href="https://echarts.apache.org/zh/option.html#yAxis">y 轴</a>的 index，在单个图表实例中存在多个 y轴的时候有用。</p>
     */
    private Integer yAxisIndex;

    public Integer getyAxisIndex() {
        return this.yAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.name">#series-boxplot.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="https://echarts.apache.org/zh/option.html#tooltip">tooltip</a>的显示，<a href="https://echarts.apache.org/zh/option.html#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.colorBy">#series-boxplot.colorBy</a>
     * <br/>默认值: 'series'
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.legendHoverLink">#series-boxplot.legendHoverLink</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否启用<a href="https://echarts.apache.org/zh/option.html#legend">图例</a> hover 时的联动高亮。</p>
     */
    private Boolean legendHoverLink;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.hoverAnimation">#series-boxplot.hoverAnimation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启 hover 在 box 上的动画效果。</p>
     */
    private Boolean hoverAnimation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.layout">#series-boxplot.layout</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.boxWidth">#series-boxplot.boxWidth</a>
     * <br/>默认值: [7, 50]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>box 的宽度的上下限。数组的意思是：<code class="codespan">[min, max]</code>。</p>
     * <p>可以是绝对数值，如 <code class="codespan">[7, 50]</code>，也可以是百分比，如 <code class="codespan">['40%', '90%']</code>。百分比的意思是，最大可能宽度（bandWidth）的百分之多少。</p>
     */
    private List<?> boxWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.itemStyle">#series-boxplot.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>盒须图样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.emphasis">#series-boxplot.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>盒须图高亮样式</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.blur">#series-boxplot.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出时的图形样式和标签样式。开启 <a href="https://echarts.apache.org/zh/option.html#series-boxplot.emphasis.focus">emphasis.focus</a> 后有效</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.select">#series-boxplot.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>数据选中时的图形样式和标签样式。开启 <a href="https://echarts.apache.org/zh/option.html#series-funnel.selectedMode">selectedMode</a> 后有效。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.selectedMode">#series-boxplot.selectedMode</a>
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
    private Object selectedMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.dimensions">#series-boxplot.dimensions</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.encode">#series-boxplot.encode</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.dataGroupId">#series-boxplot.dataGroupId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该系列所有数据共有的组 ID。组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画。</p>
     * <p>如果你使用了<a href="https://echarts.apache.org/zh/option.html#dataset">dataset</a>组件来表达数据，推荐使用<code class="codespan">encode.itemGroupID</code>来指定哪个维度被编码为组 ID。</p>
     */
    private String dataGroupId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.data">#series-boxplot.data</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>数据格式是如下的二维数组。</p>
     * <pre><code class="lang-javascript hljs">[
     *     [<span class="hljs-number">655</span>, <span class="hljs-number">850</span>, <span class="hljs-number">940</span>, <span class="hljs-number">980</span>, <span class="hljs-number">1175</span>],
     *     [<span class="hljs-number">672.5</span>, <span class="hljs-number">800</span>, <span class="hljs-number">845</span>, <span class="hljs-number">885</span>, <span class="hljs-number">1012.5</span>],
     *     [<span class="hljs-number">780</span>, <span class="hljs-number">840</span>, <span class="hljs-number">855</span>, <span class="hljs-number">880</span>, <span class="hljs-number">940</span>],
     *     [<span class="hljs-number">621.25</span>, <span class="hljs-number">767.5</span>, <span class="hljs-number">815</span>, <span class="hljs-number">865</span>, <span class="hljs-number">1011.25</span>],
     *     { <span class="hljs-comment">// 数据项也可以是 Object，从而里面能含有对此数据项的特殊设置。</span>
     *         <span class="hljs-attr">value</span>: [<span class="hljs-number">713.75</span>, <span class="hljs-number">807.5</span>, <span class="hljs-number">810</span>, <span class="hljs-number">870</span>, <span class="hljs-number">963.75</span>],
     *         <span class="hljs-attr">itemStyle</span>: {...}
     *     },
     *     ...
     * ]
     * </code></pre>
     * <p>二维数组的每一数组项（上例中的每行）是渲染一个box，它含有五个量值，依次是：</p>
     * <pre><code class="lang-javascript hljs">[min,  Q1,  median (or Q2),  Q3,  max]
     * </code></pre>
     * <p><strong>数据的处理</strong></p>
     * <p>ECharts 并不内置对原始数据的处理，输入给 <code class="codespan">boxplot</code> 的数据须是如上五个统计结果量值。</p>
     * <p>但是 ECharts 也额外提供了简单的 <a href="https://github.com/apache/echarts/tree/master/extension/dataTool" target="_blank">原始数据处理函数</a>，如这个 <a href="https://echarts.apache.org/examples/zh/editor.html?c=boxplot-light-velocity&amp;edit=1&amp;reset=1" target="_blank">例子</a> 使用了<code class="codespan">echarts.dataTool.prepareBoxplotData</code> 来进行简单的数据统计。</p>
     */
    private List<Data> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.markPoint">#series-boxplot.markPoint</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标注。</p>
     */
    private MarkPoint markPoint;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.markLine">#series-boxplot.markLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标线。</p>
     */
    private MarkLine markLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.markArea">#series-boxplot.markArea</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。</p>
     */
    private MarkArea markArea;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.zlevel">#series-boxplot.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>盒须图所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.z">#series-boxplot.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>盒须图组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.silent">#series-boxplot.silent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.animationDuration">#series-boxplot.animationDuration</a>
     * <br/>默认值: 800
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.animationEasing">#series-boxplot.animationEasing</a>
     * <br/>默认值: elasticOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.animationDelay">#series-boxplot.animationDelay</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.universalTransition">#series-boxplot.universalTransition</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-boxplot.tooltip">#series-boxplot.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
