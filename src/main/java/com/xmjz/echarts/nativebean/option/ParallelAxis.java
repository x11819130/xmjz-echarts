package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.parallelAxis.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis">https://echarts.apache.org/v4/zh/option.html#parallelAxis</a>
 * <br/>序号: 18
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>这个组件是平行坐标系中的坐标轴。</p>
 * <p><br></p>
 * <hr>
 * <p><strong>平行坐标系介绍</strong></p>
 * <p><a href="https://en.wikipedia.org/wiki/Parallel_coordinates" target="_blank">平行坐标系（Parallel Coordinates）</a> 是一种常用的可视化高维数据的图表。</p>
 * <p>例如 <a href="#series-parallel.data">series-parallel.data</a> 中有如下数据：</p>
 * <pre><code class="lang-javascript hljs">[
 *     [<span class="hljs-number">1</span>,  <span class="hljs-number">55</span>,  <span class="hljs-number">9</span>,   <span class="hljs-number">56</span>,  <span class="hljs-number">0.46</span>,  <span class="hljs-number">18</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'良'</span>],
 *     [<span class="hljs-number">2</span>,  <span class="hljs-number">25</span>,  <span class="hljs-number">11</span>,  <span class="hljs-number">21</span>,  <span class="hljs-number">0.65</span>,  <span class="hljs-number">34</span>,  <span class="hljs-number">9</span>,  <span class="hljs-string">'优'</span>],
 *     [<span class="hljs-number">3</span>,  <span class="hljs-number">56</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">63</span>,  <span class="hljs-number">0.3</span>,   <span class="hljs-number">14</span>,  <span class="hljs-number">5</span>,  <span class="hljs-string">'良'</span>],
 *     [<span class="hljs-number">4</span>,  <span class="hljs-number">33</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">29</span>,  <span class="hljs-number">0.33</span>,  <span class="hljs-number">16</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'优'</span>],
 *     { <span class="hljs-comment">// 数据项也可以是 Object，从而里面能含有对线条的特殊设置。</span>
 *         <span class="hljs-attr">value</span>: [<span class="hljs-number">5</span>,  <span class="hljs-number">42</span>,  <span class="hljs-number">24</span>,  <span class="hljs-number">44</span>,  <span class="hljs-number">0.76</span>,  <span class="hljs-number">40</span>,  <span class="hljs-number">16</span>, <span class="hljs-string">'优'</span>]
 *         <span class="hljs-attr">lineStyle</span>: {...},
 *     }
 *     ...
 * ]
 * </code></pre>
 * <p>数据中，每一行是一个『数据项』，每一列属于一个『维度』。（例如上面数据每一列的含义分别是：『日期』,『AQI指数』, 『PM2.5』, 『PM10』, 『一氧化碳值』, 『二氧化氮值』, 『二氧化硫值』）。</p>
 * <p>平行坐标系适用于对这种多维数据进行可视化分析。每一个维度（每一列）对应一个坐标轴，每一个『数据项』是一条线，贯穿多个坐标轴。在坐标轴上，可以进行数据选取等操作。如下：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/parallel-all&amp;edit=1&amp;reset=1" width="600" height="400" data-ll-timeout="23"><iframe />
 *
 *
 * <p><br></p>
 * <hr>
 * <p><strong>配置方式概要</strong></p>
 * <p>『平行坐标系』的 <code class="codespan">option</code> 基本配置如下例：</p>
 * <pre><code class="lang-javascript">option = {
 *     parallelAxis: [                     // 这是一个个『坐标轴』的定义
 *         {dim: 0, name: schema[0].text}, // 每个『坐标轴』有个 &#39;dim&#39; 属性，表示坐标轴的维度号。
 *         {dim: 1, name: schema[1].text},
 *         {dim: 2, name: schema[2].text},
 *         {dim: 3, name: schema[3].text},
 *         {dim: 4, name: schema[4].text},
 *         {dim: 5, name: schema[5].text},
 *         {dim: 6, name: schema[6].text},
 *         {dim: 7, name: schema[7].text,
 *             type: &#39;category&#39;,           // 坐标轴也可以支持类别型数据
 *             data: [&#39;优&#39;, &#39;良&#39;, &#39;轻度污染&#39;, &#39;中度污染&#39;, &#39;重度污染&#39;, &#39;严重污染&#39;]
 *         }
 *     ],
 *     parallel: {                         // 这是『坐标系』的定义
 *         left: &#39;5%&#39;,                     // 平行坐标系的位置设置
 *         right: &#39;13%&#39;,
 *         bottom: &#39;10%&#39;,
 *         top: &#39;20%&#39;,
 *         parallelAxisDefault: {          // 『坐标轴』的公有属性可以配置在这里避免重复书写
 *             type: &#39;value&#39;,
 *             nameLocation: &#39;end&#39;,
 *             nameGap: 20
 *         }
 *     },
 *     series: [                           // 这里三个系列共用一个平行坐标系
 *         {
 *             name: &#39;北京&#39;,
 *             type: &#39;parallel&#39;,           // 这个系列类型是 &#39;parallel&#39;
 *             data: [
 *                 [1,  55,  9,   56,  0.46,  18,  6,  &#39;良&#39;],
 *                 [2,  25,  11,  21,  0.65,  34,  9,  &#39;优&#39;],
 *                 ...
 *             ]
 *         },
 *         {
 *             name: &#39;上海&#39;,
 *             type: &#39;parallel&#39;,
 *             data: [
 *                 [3,  56,  7,   63,  0.3,   14,  5,  &#39;良&#39;],
 *                 [4,  33,  7,   29,  0.33,  16,  6,  &#39;优&#39;],
 *                 ...
 *             ]
 *         },
 *         {
 *             name: &#39;广州&#39;,
 *             type: &#39;parallel&#39;,
 *             data: [
 *                 [4,  33,  7,   29,  0.33,  16,  6,  &#39;优&#39;],
 *                 [5,  42,  24,  44,  0.76,  40,  16, &#39;优&#39;],
 *                 ...
 *             ]
 *         }
 *     ]
 * };
 * </code></pre>
 * <p>需要涉及到三个组件：<a href="#parallel">parallel</a>、<a href="#parallelAxis">parallelAxis</a>、<a href="#series-parallel">series-parallel</a></p>
 * <ul>
 * <li><p><a href="#parallel">parallel</a></p>
 * <p>  这个配置项是平行坐标系的『坐标系』本身。一个系列（<code class="codespan">series</code>）或多个系列（如上图中的『北京』、『上海』、『广州』分别各是一个系列）可以共用这个『坐标系』。</p>
 * <p>  和其他坐标系一样，坐标系也可以创建多个。</p>
 * <p>  位置设置，也是放在这里进行。</p>
 * </li>
 * <li><p><a href="#parallelAxis">parallelAxis</a></p>
 * <p>  这个是『坐标系』中的坐标轴的配置。自然，需要有多个坐标轴。</p>
 * <p>  其中有 <a href="#parallelAxis.parallelIndex">parallelAxis.parallelIndex</a> 属性，指定这个『坐标轴』在哪个『坐标系』中。默认使用第一个『坐标系』。</p>
 * </li>
 * <li><p><a href="#series-parallel">series-parallel</a></p>
 * <p>  这个是『系列』的定义。系列被画到『坐标系』上。</p>
 * <p>  其中有 <a href="#series-parallel.parallelIndex">series-parallel.parallelIndex</a> 属性，指定使用哪个『坐标系』。默认使用第一个『坐标系』。</p>
 * </li>
 * </ul>
 * <p><br></p>
 * <hr>
 * <p><strong>配置注意和最佳实践</strong></p>
 * <p>配置多个 <a href="#parallelAxis">parallelAxis</a> 时，有些值一样的属性，如果书写多遍则比较繁琐，那么可以放置在 <a href="#parallel.parallelAxisDefault">parallel.parallelAxisDefault</a> 里。在坐标轴初始化前，<a href="#parallel.parallelAxisDefault">parallel.parallelAxisDefault</a> 里的配置项，会分别融合进 <a href="#parallelAxis">parallelAxis</a>，形成最终的坐标轴的配置。</p>
 * <p><strong>如果数据量很大并且发生卡顿</strong></p>
 * <p>建议把 <a href="#series-parallel.lineStyle.width">series-parallel.lineStyle.width</a> 设为 <code class="codespan">0.5</code>（或更小），
 * 可能显著改善性能。</p>
 * <p><br></p>
 * <hr>
 * <p><strong>高维数据的显示</strong></p>
 * <p>维度比较多时，比如有 50+ 的维度，那么就会有 50+ 个轴。那么可能会页面显示不下。</p>
 * <p>可以通过 <a href="#parallel.axisExpandable">parallel.axisExpandable</a> 来改善显示效果。</p>
 *
 *
 *
 *
 * </iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class ParallelAxis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.id">https://echarts.apache.org/v4/zh/option.html#parallelAxis.id</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.dim">https://echarts.apache.org/v4/zh/option.html#parallelAxis.dim</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴的维度序号。</p>
     * <p>例如 <a href="#series-parallel.data">series-parallel.data</a> 中有如下数据：</p>
     * <pre><code class="lang-javascript hljs">[
     *     [<span class="hljs-number">1</span>,  <span class="hljs-number">55</span>,  <span class="hljs-number">9</span>,   <span class="hljs-number">56</span>,  <span class="hljs-number">0.46</span>,  <span class="hljs-number">18</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'良'</span>],
     *     [<span class="hljs-number">2</span>,  <span class="hljs-number">25</span>,  <span class="hljs-number">11</span>,  <span class="hljs-number">21</span>,  <span class="hljs-number">0.65</span>,  <span class="hljs-number">34</span>,  <span class="hljs-number">9</span>,  <span class="hljs-string">'优'</span>],
     *     [<span class="hljs-number">3</span>,  <span class="hljs-number">56</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">63</span>,  <span class="hljs-number">0.3</span>,   <span class="hljs-number">14</span>,  <span class="hljs-number">5</span>,  <span class="hljs-string">'良'</span>],
     *     [<span class="hljs-number">4</span>,  <span class="hljs-number">33</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">29</span>,  <span class="hljs-number">0.33</span>,  <span class="hljs-number">16</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'优'</span>],
     *     { <span class="hljs-comment">// 数据项也可以是 Object，从而里面能含有对线条的特殊设置。</span>
     *         <span class="hljs-attr">value</span>: [<span class="hljs-number">5</span>,  <span class="hljs-number">42</span>,  <span class="hljs-number">24</span>,  <span class="hljs-number">44</span>,  <span class="hljs-number">0.76</span>,  <span class="hljs-number">40</span>,  <span class="hljs-number">16</span>, <span class="hljs-string">'优'</span>]
     *         <span class="hljs-attr">lineStyle</span>: {...},
     *     }
     *     ...
     * ]
     * </code></pre>
     * <p>数据中，每一行是一个『数据项』，每一列属于一个『维度』。（例如上面数据每一列的含义分别是：『日期』,『AQI指数』, 『PM2.5』, 『PM10』, 『一氧化碳值』, 『二氧化氮值』, 『二氧化硫值』）。</p>
     * <p><code class="codespan">dim</code> 定义了数据的哪个维度（即哪个『列』）会对应到此坐标轴上。</p>
     * <p>从 <code class="codespan">0</code> 开始计数。例如，假设坐标轴的 <code class="codespan">dim</code> 为 <code class="codespan">1</code>，则表示数据中的第二列会对应到此坐标轴上。</p>
     */
    private Integer dim;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.parallelIndex">https://echarts.apache.org/v4/zh/option.html#parallelAxis.parallelIndex</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>用于定义『坐标轴』对应到哪个『坐标系』中。</p>
     * <p>比如有如下配置：</p>
     * <pre><code class="lang-javascript hljs">myChart.setOption({
     *     <span class="hljs-attr">parallel</span>: [
     *         {...},                      <span class="hljs-comment">// 第一个平行坐标系</span>
     *         {...}                       <span class="hljs-comment">// 第二个平行坐标系</span>
     *     ],
     *     <span class="hljs-attr">parallelAxis</span>: [
     *         {<span class="hljs-attr">parallelIndex</span>: <span class="hljs-number">1</span>, ...},    <span class="hljs-comment">// 第一个坐标轴，对应到第二个平行坐标系</span>
     *         {<span class="hljs-attr">parallelIndex</span>: <span class="hljs-number">0</span>, ...},    <span class="hljs-comment">// 第二个坐标轴，对应到第一个平行坐标系</span>
     *         {<span class="hljs-attr">parallelIndex</span>: <span class="hljs-number">1</span>, ...},    <span class="hljs-comment">// 第三个坐标轴，对应到第二个平行坐标系</span>
     *         {<span class="hljs-attr">parallelIndex</span>: <span class="hljs-number">0</span>, ...}     <span class="hljs-comment">// 第四个坐标轴，对应到第一个平行坐标系</span>
     *     ],
     *     ...
     * });
     * </code></pre>
     * <p>只有一个平行坐标系时可不用设置，自动取默认值 <code class="codespan">0</code>。</p>
     */
    private Integer parallelIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.realtime">https://echarts.apache.org/v4/zh/option.html#parallelAxis.realtime</a>
     * <br/>序号: 4
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否坐标轴刷选的时候，实时刷新视图。如果设为 <code class="codespan">false</code>，则在刷选动作结束时候，才刷新视图。</p>
     * <p>大数据量时，建议设置成 <code class="codespan">false</code>，从而避免卡顿。</p>
     */
    private Boolean realtime;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.areaSelectStyle">https://echarts.apache.org/v4/zh/option.html#parallelAxis.areaSelectStyle</a>
     * <br/>序号: 5
     * <br/>默认值: 20
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>在坐标轴上可以进行框选，这里是一些框选的设置。</p>
     */
    private AreaSelectStyle areaSelectStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.type">https://echarts.apache.org/v4/zh/option.html#parallelAxis.type</a>
     * <br/>序号: 6
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
     *   类目轴，适用于离散的类目数据。为该类型时类目数据可自动从 <a href="#series.data">series.data</a> 或 <a href="#dataset.source">dataset.source</a> 中取，或者可通过 <a href="#parallelAxis.data">parallelAxis.data</a> 设置类目数据。</p>
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.name">https://echarts.apache.org/v4/zh/option.html#parallelAxis.name</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>坐标轴名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.nameLocation">https://echarts.apache.org/v4/zh/option.html#parallelAxis.nameLocation</a>
     * <br/>序号: 8
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.nameTextStyle">https://echarts.apache.org/v4/zh/option.html#parallelAxis.nameTextStyle</a>
     * <br/>序号: 9
     * <br/>默认值: normal
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴名称的文字样式。</p>
     */
    private NameTextStyle nameTextStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.nameGap">https://echarts.apache.org/v4/zh/option.html#parallelAxis.nameGap</a>
     * <br/>序号: 10
     * <br/>默认值: 15
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴名称与轴线之间的距离。</p>
     */
    private Integer nameGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.nameRotate">https://echarts.apache.org/v4/zh/option.html#parallelAxis.nameRotate</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴名字旋转，角度值。</p>
     */
    private Integer nameRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.inverse">https://echarts.apache.org/v4/zh/option.html#parallelAxis.inverse</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否是反向坐标轴。</p>
     */
    private Boolean inverse;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.boundaryGap">https://echarts.apache.org/v4/zh/option.html#parallelAxis.boundaryGap</a>
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","Array"]
     * <br/>描述:
     * <p>坐标轴两边留白策略，类目轴和非类目轴的设置和表现不一样。</p>
     * <p>类目轴中 <code class="codespan">boundaryGap</code> 可以配置为 <code class="codespan">true</code> 和 <code class="codespan">false</code>。默认为 <code class="codespan">true</code>，这时候<a href="#parallelAxis.axisTick">刻度</a>只是作为分隔线，标签和数据点都会在两个<a href="#parallelAxis.axisTick">刻度</a>之间的带(band)中间。</p>
     * <p>非类目轴，包括时间，数值，对数轴，<code class="codespan">boundaryGap</code>是一个两个值的数组，分别表示数据最小值和最大值的延伸范围，可以直接设置数值或者相对的百分比，在设置 <a href="#parallelAxis.min">min</a> 和 <a href="#parallelAxis.max">max</a> 后无效。
     * <strong>示例：</strong></p>
     * <pre><code class="lang-js hljs javascript">boundaryGap: [<span class="hljs-string">'20%'</span>, <span class="hljs-string">'20%'</span>]
     * </code></pre>
     */
    private Object boundaryGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.min">https://echarts.apache.org/v4/zh/option.html#parallelAxis.min</a>
     * <br/>序号: 14
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.max">https://echarts.apache.org/v4/zh/option.html#parallelAxis.max</a>
     * <br/>序号: 15
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.scale">https://echarts.apache.org/v4/zh/option.html#parallelAxis.scale</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>只在数值轴中（<a href="#parallelAxis.type">type</a>: 'value'）有效。</p>
     * <p>是否是脱离 0 值比例。设置成 <code class="codespan">true</code> 后坐标刻度不会强制包含零刻度。在双数值轴的散点图中比较有用。</p>
     * <p>在设置 <a href="#parallelAxis.min">min</a> 和 <a href="#parallelAxis.max">max</a> 之后该配置项无效。</p>
     */
    private Boolean scale;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.splitNumber">https://echarts.apache.org/v4/zh/option.html#parallelAxis.splitNumber</a>
     * <br/>序号: 17
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴的分割段数，需要注意的是这个分割段数只是个预估值，最后实际显示的段数会在这个基础上根据分割后坐标轴刻度显示的易读程度作调整。</p>
     * <p>在类目轴中无效。</p>
     */
    private Integer splitNumber;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.minInterval">https://echarts.apache.org/v4/zh/option.html#parallelAxis.minInterval</a>
     * <br/>序号: 18
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>自动计算的坐标轴最小间隔大小。</p>
     * <p>例如可以设置成<code class="codespan">1</code>保证坐标轴分割刻度显示成整数。</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">minInterval</span>: <span class="hljs-number">1</span>
     * }
     * </code></pre>
     * <p>只在数值轴或时间轴中（<a href="#parallelAxis.type">type</a>: 'value' 或 'time'）有效。</p>
     */
    private Integer minInterval;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.maxInterval">https://echarts.apache.org/v4/zh/option.html#parallelAxis.maxInterval</a>
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>自动计算的坐标轴最大间隔大小。</p>
     * <p>例如，在时间轴（（<a href="#parallelAxis.type">type</a>: 'time'））可以设置成 <code class="codespan">3600 * 24 * 1000</code> 保证坐标轴分割刻度最大为一天。</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">maxInterval</span>: <span class="hljs-number">3600</span> * <span class="hljs-number">24</span> * <span class="hljs-number">1000</span>
     * }
     * </code></pre>
     * <p>只在数值轴或时间轴中（<a href="#parallelAxis.type">type</a>: 'value' 或 'time'）有效。</p>
     */
    private Integer maxInterval;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.interval">https://echarts.apache.org/v4/zh/option.html#parallelAxis.interval</a>
     * <br/>序号: 20
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>强制设置坐标轴分割间隔。</p>
     * <p>因为 <a href="#parallelAxis.splitNumber">splitNumber</a> 是预估的值，实际根据策略计算出来的刻度可能无法达到想要的效果，这时候可以使用 interval 配合 <a href="#parallelAxis.min">min</a>、<a href="#parallelAxis.max">max</a> 强制设定刻度划分，一般不建议使用。</p>
     * <p>无法在类目轴中使用。在时间轴（<a href="#parallelAxis.type">type</a>: 'time'）中需要传时间戳，在对数轴（<a href="#parallelAxis.type">type</a>: 'log'）中需要传指数值。</p>
     */
    private Integer interval;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.logBase">https://echarts.apache.org/v4/zh/option.html#parallelAxis.logBase</a>
     * <br/>序号: 21
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>对数轴的底数，只在对数轴中（<a href="#parallelAxis.type">type</a>: 'log'）有效。</p>
     */
    private Integer logBase;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.silent">https://echarts.apache.org/v4/zh/option.html#parallelAxis.silent</a>
     * <br/>序号: 22
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>坐标轴是否是静态无法交互。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.triggerEvent">https://echarts.apache.org/v4/zh/option.html#parallelAxis.triggerEvent</a>
     * <br/>序号: 23
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.axisLine">https://echarts.apache.org/v4/zh/option.html#parallelAxis.axisLine</a>
     * <br/>序号: 24
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴轴线相关设置。</p>
     */
    private AxisLine axisLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.axisTick">https://echarts.apache.org/v4/zh/option.html#parallelAxis.axisTick</a>
     * <br/>序号: 25
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴刻度相关设置。</p>
     */
    private AxisTick axisTick;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.minorTick">https://echarts.apache.org/v4/zh/option.html#parallelAxis.minorTick</a>
     * <br/>序号: 26
     * <br/>默认值: 5
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.6.0</code> 开始支持</p>
     * </blockquote>
     * <p>坐标轴次刻度线相关设置。</p>
     * <p>注意：次刻度线无法在类目轴（<a href="#parallelAxis.type">type</a>: <code class="codespan">'category'</code>）中使用。</p>
     * <p>示例：</p>
     * <p>1) 函数绘图中使用次刻度线</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-function&amp;edit=1&amp;reset=1" width="600" height="350"><iframe />
     *
     *
     * <p>2) 在对数轴中使用次刻度线</p>
     * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=line-log&edit=1&reset=1" width="600" height="350"><iframe />
     *
     * </iframe>
     */
    private MinorTick minorTick;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.axisLabel">https://echarts.apache.org/v4/zh/option.html#parallelAxis.axisLabel</a>
     * <br/>序号: 27
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴刻度标签的相关设置。</p>
     */
    private AxisLabel axisLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#parallelAxis.data">https://echarts.apache.org/v4/zh/option.html#parallelAxis.data</a>
     * <br/>序号: 28
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>类目数据，在类目轴（<a href="#parallelAxis.type">type</a>: <code class="codespan">'category'</code>）中有效。</p>
     * <p>如果没有设置 <a href="#parallelAxis.type">type</a>，但是设置了 <code class="codespan">axis.data</code>，则认为 <code class="codespan">type</code> 是 <code class="codespan">'category'</code>。</p>
     * <p>如果设置了 <a href="#parallelAxis.type">type</a> 是 <code class="codespan">'category'</code>，但没有设置 <code class="codespan">axis.data</code>，则 <code class="codespan">axis.data</code> 的内容会自动从 <a href="#series.data">series.data</a> 中获取，这会比较方便。不过注意，<code class="codespan">axis.data</code> 指明的是 <code class="codespan">'category'</code> 轴的取值范围。如果不指定而是从 <a href="#series.data">series.data</a> 中获取，那么只能获取到 <a href="#series.data">series.data</a> 中出现的值。比如说，假如 <a href="#series.data">series.data</a> 为空时，就什么也获取不到。</p>
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
    private List<Data> data;
}
