package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.parallel.ParallelAxisDefault;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#parallel">https://echarts.apache.org/zh/option.html#parallel</a>
 * <br/>序号: 17
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
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
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Parallel implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.id
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.zlevel
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
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.z
     * <br/>序号: 3
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.left
     * <br/>序号: 4
     * <br/>默认值: 80
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>parallel 组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.top
     * <br/>序号: 5
     * <br/>默认值: 60
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>parallel 组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.right
     * <br/>序号: 6
     * <br/>默认值: 80
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>parallel 组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object right;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.bottom
     * <br/>序号: 7
     * <br/>默认值: 60
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>parallel 组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object bottom;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.width
     * <br/>序号: 8
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>parallel 组件的宽度。默认自适应。</p>
     */
    private Object width;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.height
     * <br/>序号: 9
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>parallel 组件的高度。默认自适应。</p>
     */
    private Object height;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.layout
     * <br/>序号: 10
     * <br/>默认值: horizontal
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>布局方式，可选值为：</p>
     * <ul>
     * <li><p><code class="codespan">'horizontal'</code>：水平排布各个坐标轴。</p>
     * </li>
     * <li><p><code class="codespan">'vertical'</code>：竖直排布各个坐标轴。</p>
     * </li>
     * </ul>
     */
    private String layout;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.axisExpandable
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>维度比较多时，比如有 50+ 的维度，那么就会有 50+ 个轴。那么可能会页面显示不下。</p>
     * <p>可以通过 <a href="#parallel.axisExpandable">parallel.axisExpandable</a> 来改善显示效果。</p>
     * <p>是否允许点击展开折叠 axis。</p>
     */
    private Boolean axisExpandable;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.axisExpandCenter
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>初始时，以哪个轴为中心展开，这里给出轴的 index。没有默认值，需要手动指定。</p>
     * <p>参见 <a href="#parallel.axisExpandable">parallel.axisExpandable</a></p>
     */
    private Integer axisExpandCenter;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.axisExpandCount
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>初始时，有多少个轴会处于展开状态。建议根据你的维度个数而手动指定。</p>
     * <p>参见 <a href="#parallel.axisExpandCenter">parallel.axisExpandCenter</a>
     * 参见 <a href="#parallel.axisExpandable">parallel.axisExpandable</a></p>
     */
    private Integer axisExpandCount;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.axisExpandWidth
     * <br/>序号: 14
     * <br/>默认值: 50
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>在展开状态，轴的间距是多少，单位为像素。</p>
     * <p>参见 <a href="#parallel.axisExpandable">parallel.axisExpandable</a></p>
     */
    private Integer axisExpandWidth;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.axisExpandTriggerOn
     * <br/>序号: 15
     * <br/>默认值: click
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>可取值：</p>
     * <ul>
     * <li><code class="codespan">'click'</code>：鼠标点击的时候 expand。</li>
     * <li><code class="codespan">'mousemove'</code>：鼠标悬浮的时候 expand。</li>
     * </ul>
     */
    private String axisExpandTriggerOn;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallel.parallelAxisDefault
     * <br/>序号: 16
     * <br/>默认值: value
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>配置多个 <a href="#parallelAxis">parallelAxis</a> 时，有些值一样的属性，如果书写多遍则比较繁琐，那么可以放置在 <a href="#parallel.parallelAxisDefault">parallel.parallelAxisDefault</a> 里。在坐标轴初始化前，<a href="#parallel.parallelAxisDefault">parallel.parallelAxisDefault</a> 里的配置项，会分别融合进 <a href="#parallelAxis">parallelAxis</a>，形成最终的坐标轴的配置。</p>
     * <p><a href="https://echarts.apache.org/examples/zh/editor.html?c=doc-example/parallel-all&amp;edit=1&amp;reset=1" target="_blank">参见示例</a></p>
     * <p><br></p>
     */
    private ParallelAxisDefault parallelAxisDefault;
}
