package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.parallelSeries.Emphasis;
import com.xmjz.echarts.nativebean.option.parallelSeries.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel">https://echarts.apache.org/zh/option.html#series-parallel</a>
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p>平行坐标系的系列。</p>
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
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/parallel-all&amp;edit=1&amp;reset=1" width="600" height="400"></iframe>
 *
 *
 * <p><strong>配置方式概要</strong></p>
 * <p>『平行坐标系』的 <code class="codespan">option</code> 基本配置如下例：</p>
 * <pre><code class="lang-javascript hljs">option = {
 *     <span class="hljs-attr">parallelAxis</span>: [                     <span class="hljs-comment">// 这是一个个『坐标轴』的定义</span>
 *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">0</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">0</span>].text}, <span class="hljs-comment">// 每个『坐标轴』有个 'dim' 属性，表示坐标轴的维度号。</span>
 *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">1</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">1</span>].text},
 *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">2</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">2</span>].text},
 *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">3</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">3</span>].text},
 *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">4</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">4</span>].text},
 *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">5</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">5</span>].text},
 *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">6</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">6</span>].text},
 *         {<span class="hljs-attr">dim</span>: <span class="hljs-number">7</span>, <span class="hljs-attr">name</span>: schema[<span class="hljs-number">7</span>].text,
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'category'</span>,           <span class="hljs-comment">// 坐标轴也可以支持类别型数据</span>
 *             <span class="hljs-attr">data</span>: [<span class="hljs-string">'优'</span>, <span class="hljs-string">'良'</span>, <span class="hljs-string">'轻度污染'</span>, <span class="hljs-string">'中度污染'</span>, <span class="hljs-string">'重度污染'</span>, <span class="hljs-string">'严重污染'</span>]
 *         }
 *     ],
 *     <span class="hljs-attr">parallel</span>: {                         <span class="hljs-comment">// 这是『坐标系』的定义</span>
 *         <span class="hljs-attr">left</span>: <span class="hljs-string">'5%'</span>,                     <span class="hljs-comment">// 平行坐标系的位置设置</span>
 *         <span class="hljs-attr">right</span>: <span class="hljs-string">'13%'</span>,
 *         <span class="hljs-attr">bottom</span>: <span class="hljs-string">'10%'</span>,
 *         <span class="hljs-attr">top</span>: <span class="hljs-string">'20%'</span>,
 *         <span class="hljs-attr">parallelAxisDefault</span>: {          <span class="hljs-comment">// 『坐标轴』的公有属性可以配置在这里避免重复书写</span>
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'value'</span>,
 *             <span class="hljs-attr">nameLocation</span>: <span class="hljs-string">'end'</span>,
 *             <span class="hljs-attr">nameGap</span>: <span class="hljs-number">20</span>
 *         }
 *     },
 *     <span class="hljs-attr">series</span>: [                           <span class="hljs-comment">// 这里三个系列共用一个平行坐标系</span>
 *         {
 *             <span class="hljs-attr">name</span>: <span class="hljs-string">'北京'</span>,
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'parallel'</span>,           <span class="hljs-comment">// 这个系列类型是 'parallel'</span>
 *             <span class="hljs-attr">data</span>: [
 *                 [<span class="hljs-number">1</span>,  <span class="hljs-number">55</span>,  <span class="hljs-number">9</span>,   <span class="hljs-number">56</span>,  <span class="hljs-number">0.46</span>,  <span class="hljs-number">18</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'良'</span>],
 *                 [<span class="hljs-number">2</span>,  <span class="hljs-number">25</span>,  <span class="hljs-number">11</span>,  <span class="hljs-number">21</span>,  <span class="hljs-number">0.65</span>,  <span class="hljs-number">34</span>,  <span class="hljs-number">9</span>,  <span class="hljs-string">'优'</span>],
 *                 ...
 *             ]
 *         },
 *         {
 *             <span class="hljs-attr">name</span>: <span class="hljs-string">'上海'</span>,
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'parallel'</span>,
 *             <span class="hljs-attr">data</span>: [
 *                 [<span class="hljs-number">3</span>,  <span class="hljs-number">56</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">63</span>,  <span class="hljs-number">0.3</span>,   <span class="hljs-number">14</span>,  <span class="hljs-number">5</span>,  <span class="hljs-string">'良'</span>],
 *                 [<span class="hljs-number">4</span>,  <span class="hljs-number">33</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">29</span>,  <span class="hljs-number">0.33</span>,  <span class="hljs-number">16</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'优'</span>],
 *                 ...
 *             ]
 *         },
 *         {
 *             <span class="hljs-attr">name</span>: <span class="hljs-string">'广州'</span>,
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'parallel'</span>,
 *             <span class="hljs-attr">data</span>: [
 *                 [<span class="hljs-number">4</span>,  <span class="hljs-number">33</span>,  <span class="hljs-number">7</span>,   <span class="hljs-number">29</span>,  <span class="hljs-number">0.33</span>,  <span class="hljs-number">16</span>,  <span class="hljs-number">6</span>,  <span class="hljs-string">'优'</span>],
 *                 [<span class="hljs-number">5</span>,  <span class="hljs-number">42</span>,  <span class="hljs-number">24</span>,  <span class="hljs-number">44</span>,  <span class="hljs-number">0.76</span>,  <span class="hljs-number">40</span>,  <span class="hljs-number">16</span>, <span class="hljs-string">'优'</span>],
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
 * <p><strong>配置注意和最佳实践</strong></p>
 * <p>配置多个 <a href="#parallelAxis">parallelAxis</a> 时，有些值一样的属性，如果书写多遍则比较繁琐，那么可以放置在 <a href="#parallel.parallelAxisDefault">parallel.parallelAxisDefault</a> 里。在坐标轴初始化前，<a href="#parallel.parallelAxisDefault">parallel.parallelAxisDefault</a> 里的配置项，会分别融合进 <a href="#parallelAxis">parallelAxis</a>，形成最终的坐标轴的配置。</p>
 * <p><strong>如果数据量很大并且发生卡顿</strong></p>
 * <p>建议把 <a href="#series-parallel.lineStyle.width">series-parallel.lineStyle.width</a> 设为 <code class="codespan">0.5</code>（或更小），
 * 可能显著改善性能。</p>
 * <p><strong>高维数据的显示</strong></p>
 * <p>维度比较多时，比如有 50+ 的维度，那么就会有 50+ 个轴。那么可能会页面显示不下。</p>
 * <p>可以通过 <a href="#parallel.axisExpandable">parallel.axisExpandable</a> 来改善显示效果。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class ParallelSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.type">https://echarts.apache.org/zh/option.html#series-parallel.type</a>
     * <br/>默认值: parallel
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.id">https://echarts.apache.org/zh/option.html#series-parallel.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.coordinateSystem">https://echarts.apache.org/zh/option.html#series-parallel.coordinateSystem</a>
     * <br/>默认值: parallel
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该系列使用的坐标系，可选：</p>
     * <ul>
     * <li><p><code class="codespan">'parallel'</code></p>
     * <p>  使用平行坐标系，通过 <a href="#series-parallel.parallelIndex">parallelIndex</a> 指定相应的平行坐标系组件。</p>
     * </li>
     * </ul>
     */
    private String coordinateSystem;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.parallelIndex">https://echarts.apache.org/zh/option.html#series-parallel.parallelIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>使用的<a href="#parallel">平行坐标系</a>的 index，在单个图表实例中存在多个平行坐标系的时候有用。</p>
     */
    private Integer parallelIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.name">https://echarts.apache.org/zh/option.html#series-parallel.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.colorBy">https://echarts.apache.org/zh/option.html#series-parallel.colorBy</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.lineStyle">https://echarts.apache.org/zh/option.html#series-parallel.lineStyle</a>
     * <br/>默认值: #000
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>线条样式。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.emphasis">https://echarts.apache.org/zh/option.html#series-parallel.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.inactiveOpacity">https://echarts.apache.org/zh/option.html#series-parallel.inactiveOpacity</a>
     * <br/>默认值: 0.05
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>框选时，未被选中的条线会设置成这个『透明度』（从而可以达到变暗的效果）。</p>
     */
    private Integer inactiveOpacity;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.activeOpacity">https://echarts.apache.org/zh/option.html#series-parallel.activeOpacity</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>框选时，选中的条线会设置成这个『透明度』（从而可以达到高亮的效果）。</p>
     */
    private Integer activeOpacity;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.realtime">https://echarts.apache.org/zh/option.html#series-parallel.realtime</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否实时刷新。</p>
     */
    private Boolean realtime;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.smooth">https://echarts.apache.org/zh/option.html#series-parallel.smooth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","number"]
     * <br/>描述:
     * <p>是否使用平滑曲线。默认为 <code class="codespan">false</code>，可以设置为 <code class="codespan">true</code> 或者一个范围为 <code class="codespan">0</code> 到 <code class="codespan">1</code> 的小数值，指定平滑程度。</p>
     */
    private Object smooth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.progressive">https://echarts.apache.org/zh/option.html#series-parallel.progressive</a>
     * <br/>默认值: 500
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>渐进式渲染时每一帧绘制图形数量，设为 0 时不启用渐进式渲染，支持每个系列单独配置。</p>
     * <p>在图中有数千到几千万图形元素的时候，一下子把图形绘制出来，或者交互重绘的时候可能会造成界面的卡顿甚至假死。ECharts 4 开始全流程支持渐进渲染（progressive rendering），渲染的时候会把创建好的图形分到数帧中渲染，每一帧渲染只渲染指定数量的图形。</p>
     * <p>该配置项就是用于配置该系列每一帧渲染的图形数，可以根据图表图形复杂度的需要适当调整这个数字使得在不影响交互流畅性的前提下达到绘制速度的最大化。比如在 lines 图或者平行坐标中线宽大于 1 的 polyline 绘制会很慢，这个数字就可以设置小一点，而线宽小于等于 1 的 polyline 绘制非常快，该配置项就可以相对调得比较大。</p>
     */
    private Integer progressive;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.progressiveThreshold">https://echarts.apache.org/zh/option.html#series-parallel.progressiveThreshold</a>
     * <br/>默认值: 3000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>启用渐进式渲染的图形数量阈值，在单个系列的图形数量超过该阈值时启用渐进式渲染。</p>
     */
    private Integer progressiveThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.progressiveChunkMode">https://echarts.apache.org/zh/option.html#series-parallel.progressiveChunkMode</a>
     * <br/>默认值: sequential
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.data">https://echarts.apache.org/zh/option.html#series-parallel.data</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
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
     */
    private List<?> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.zlevel">https://echarts.apache.org/zh/option.html#series-parallel.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>平行坐标所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.z">https://echarts.apache.org/zh/option.html#series-parallel.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>平行坐标组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.silent">https://echarts.apache.org/zh/option.html#series-parallel.silent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.animation">https://echarts.apache.org/zh/option.html#series-parallel.animation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.animationThreshold">https://echarts.apache.org/zh/option.html#series-parallel.animationThreshold</a>
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.animationDuration">https://echarts.apache.org/zh/option.html#series-parallel.animationDuration</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.animationEasing">https://echarts.apache.org/zh/option.html#series-parallel.animationEasing</a>
     * <br/>默认值: linear
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.animationDelay">https://echarts.apache.org/zh/option.html#series-parallel.animationDelay</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.animationDurationUpdate">https://echarts.apache.org/zh/option.html#series-parallel.animationDurationUpdate</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.animationEasingUpdate">https://echarts.apache.org/zh/option.html#series-parallel.animationEasingUpdate</a>
     * <br/>默认值: cubicInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-parallel.animationDelayUpdate">https://echarts.apache.org/zh/option.html#series-parallel.animationDelayUpdate</a>
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
