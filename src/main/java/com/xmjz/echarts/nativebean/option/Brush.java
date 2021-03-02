package com.xmjz.echarts.nativebean.option;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#brush">https://echarts.apache.org/zh/option.html#brush</a>
 * <br/>序号: 15
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p><code class="codespan">brush</code> 是区域选择组件，用户可以选择图中一部分数据，从而便于向用户展示被选中数据，或者他们的一些统计计算结果。</p>
 * <p><br></p>
 * <hr>
 * <p><strong>刷子的类型和启动按钮</strong></p>
 * <p>目前 <code class="codespan">brush</code> 组件支持的图表类型：<code class="codespan">scatter</code>、<code class="codespan">bar</code>、<code class="codespan">candlestick</code>（<code class="codespan">parallel</code> 本身自带刷选功能，但并非由 brush 组件来提供）。</p>
 * <p>点击 <code class="codespan">toolbox</code> 中的按钮，能够进行『区域选择』、『清除选择』等操作。</p>
 * <p><br>
 * <code class="codespan">横向刷子</code> 的示例如下（点击 <code class="codespan">toolbox</code> 中的按钮启动刷选）：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=candlestick-brush&amp;edit=1&amp;reset=1" width="800" height="500"></iframe>
 *
 *
 * <p><br>
 * <code class="codespan">bar</code> 图中的 <code class="codespan">brush</code>（点击 <code class="codespan">toolbox</code> 中的按钮启动刷选）：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=bar-brush&amp;edit=1&amp;reset=1" width="800" height="400"></iframe>
 *
 *
 *
 * <p>启动 <code class="codespan">brush</code> 的按钮既可以在 <code class="codespan">toolbox</code> 中指定（参见 <a href="#toolbox.feature.brush.type">toolbox.feature.brush.type</a>），也可以在 <code class="codespan">brush</code> 组件的配置中指定（参见 <a href="#brush.toolbox">brush.toolbox</a>）。</p>
 * <p>支持这几种选框：<code class="codespan">矩形刷子</code>，<code class="codespan">任意形状刷子</code>，<code class="codespan">横向刷子</code>，<code class="codespan">纵向刷子</code>。参见 <a href="#brush.toolbox">brush.toolbox</a>。</p>
 * <p>可以使用 <code class="codespan">保持选择</code> 按钮，切换单选和多选模式。</p>
 * <ul>
 * <li>单选即同时只能存在一个选框，可单击空白区域消除选框。</li>
 * <li>多选即同时可存在多个选框，单击空白区域不能消除选框，需要点击『清除按钮』消除线框。</li>
 * </ul>
 * <p><br></p>
 * <hr>
 * <p><strong>刷选和坐标系的关系</strong></p>
 * <p>可以设置 <code class="codespan">brush</code> 是『全局的』还是『属于坐标系的』。</p>
 * <p><strong>全局 brush</strong></p>
 * <p>在 echarts 实例中任意地方刷选。这是默认情况。如果没有指定为『坐标系 brush』，就是『全局 brush』。</p>
 * <p><strong>坐标系 brush</strong></p>
 * <p>在 指定的坐标系中刷选。选框可以跟随坐标系的缩放和平移（roam 和 dataZoom）而移动。</p>
 * <p>坐标系 brush 实际更为常用，尤其是在 geo 中。</p>
 * <p>通过指定 <a href="#brush.geoIndex">brush.geoIndex</a> 或 <a href="#brush.xAxisIndex">brush.xAxisIndex</a> 或 <a href="#brush.yAxisIndex">brush.yAxisIndex</a> 来规定可以在哪些坐标系中进行刷选。</p>
 * <p>这几个配置项的取值可以是：</p>
 * <ul>
 * <li><code class="codespan">'all'</code>，表示所有</li>
 * <li><code class="codespan">number</code>，如 <code class="codespan">0</code>，表示这个 index 所对应的坐标系。</li>
 * <li><code class="codespan">Array</code>，如 <code class="codespan">[0, 4, 2]</code>，表示指定这些 index 所对应的坐标系。</li>
 * <li><code class="codespan">'none'</code> 或 <code class="codespan">null</code> 或 <code class="codespan">undefined</code>，表示不指定。</li>
 * </ul>
 * <p>例如：</p>
 * <pre><code class="lang-javascript hljs">option = {
 *     <span class="hljs-attr">geo</span>: {
 *         ...
 *     },
 *     <span class="hljs-attr">brush</span>: {
 *         <span class="hljs-attr">geoIndex</span>: <span class="hljs-string">'all'</span>, <span class="hljs-comment">// 只可以在所有 geo 坐标系中刷选，也就是上面定义的 geo 组件中。</span>
 *         ...
 *     }
 * };
 * </code></pre>
 * <p>例如：</p>
 * <pre><code class="lang-javascript hljs">option = {
 *     <span class="hljs-attr">grid</span>: [
 *         {...}, <span class="hljs-comment">// grid 0</span>
 *         {...}  <span class="hljs-comment">// grid 1</span>
 *     ],
 *     <span class="hljs-attr">xAxis</span>: [
 *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">1</span>, ...}, <span class="hljs-comment">// xAxis 0，属于 grid 1。</span>
 *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">0</span>, ...}  <span class="hljs-comment">// xAxis 1，属于 grid 0。</span>
 *     ],
 *     <span class="hljs-attr">yAxis</span>: [
 *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">1</span>, ...}, <span class="hljs-comment">// yAxis 0，属于 grid 1。</span>
 *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">0</span>, ...}  <span class="hljs-comment">// yAxis 1，属于 grid 0。</span>
 *     ],
 *     <span class="hljs-attr">brush</span>: {
 *         <span class="hljs-attr">xAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">1</span>], <span class="hljs-comment">// 只可以在 xAxisIndex 为 `0` 和 `1` 的 xAxis 所在的直角坐标系中刷选。</span>
 *         ...
 *     }
 * };
 * </code></pre>
 * <p><br></p>
 * <hr>
 * <p><strong> 使用 API 控制选框 </strong></p>
 * <p>可以通过调用 <code class="codespan">dispatchAction</code> 来用程序主动渲染选框，例如：</p>
 * <pre><code class="lang-javascript hljs">myChart.dispatchAction({
 *     <span class="hljs-attr">type</span>: <span class="hljs-string">'brush'</span>,
 *     <span class="hljs-attr">areas</span>: [
 *         {
 *             <span class="hljs-attr">geoIndex</span>: <span class="hljs-number">0</span>,
 *             <span class="hljs-comment">// 指定选框的类型。</span>
 *             <span class="hljs-attr">brushType</span>: <span class="hljs-string">'polygon'</span>,
 *             <span class="hljs-comment">// 指定选框的形状。</span>
 *             <span class="hljs-attr">coordRange</span>: [[<span class="hljs-number">119.72</span>,<span class="hljs-number">34.85</span>],[<span class="hljs-number">119.68</span>,<span class="hljs-number">34.85</span>],[<span class="hljs-number">119.5</span>,<span class="hljs-number">34.84</span>],[<span class="hljs-number">119.19</span>,<span class="hljs-number">34.77</span>]]
 *         }
 *     ]
 * });
 * </code></pre>
 * <p>详情参见 <a href="api.html#action.brush" target="_blank">action.brush</a></p>
 * <p><br></p>
 * <hr>
 * <p><strong> brushLink </strong></p>
 * <p>不同系列间，选中的项可以联动。</p>
 * <p>参见如下效果（刷选一个 <code class="codespan">scatter</code>，其他 <code class="codespan">scatter</code> 以及 <code class="codespan">parallel</code> 图都会有选中效果）：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-matrix&amp;edit=1&amp;reset=1" width="800" height="550"></iframe>
 *
 *
 * <p><code class="codespan">brushLink</code> 配置项是一个数组，内容是 seriesIndex，指定了哪些 series 可以被联动。例如可以是：</p>
 * <ul>
 * <li><code class="codespan">[3, 4, 5]</code> 表示 seriesIndex 为 <code class="codespan">3</code>, <code class="codespan">4</code>, <code class="codespan">5</code> 的 series 可以被联动。</li>
 * <li><code class="codespan">'all'</code> 表示所有 series 都进行 brushLink。</li>
 * <li><code class="codespan">'none'</code> 或 <code class="codespan">null</code> 或 <code class="codespan">undefined</code> 表示不启用 brushLink 功能。</li>
 * </ul>
 * <p><strong>注意</strong></p>
 * <p>brushLink 是通过 dataIndex 进行映射，所以需要保证，<strong>联动的每个系列的 <code class="codespan">data</code> 都是 <code class="codespan">index</code> 对应的</strong>。*</p>
 * <p>例如：</p>
 * <pre><code class="lang-javascript hljs">option = {
 *     <span class="hljs-attr">brush</span>: {
 *         <span class="hljs-attr">brushLink</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">1</span>]
 *     },
 *     <span class="hljs-attr">series</span>: [
 *         {
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'bar'</span>
 *             <span class="hljs-attr">data</span>: [<span class="hljs-number">232</span>,    <span class="hljs-number">4434</span>,    <span class="hljs-number">545</span>,      <span class="hljs-number">654</span>]     <span class="hljs-comment">// data 有四个项</span>
 *         },
 *         {
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'parallel'</span>,
 *             <span class="hljs-attr">data</span>: [[<span class="hljs-number">4</span>, <span class="hljs-number">5</span>], [<span class="hljs-number">3</span>, <span class="hljs-number">5</span>], [<span class="hljs-number">66</span>, <span class="hljs-number">33</span>], [<span class="hljs-number">99</span>, <span class="hljs-number">66</span>]] <span class="hljs-comment">// data 同样有四个项，两个系列的 data 是对应的。</span>
 *         }
 *     ]
 * };
 * </code></pre>
 * <p>参见 <a href="#brush.brushLink">brush.brushLink</a>。</p>
 * <p><br></p>
 * <hr>
 * <p><strong> throttle / debounce / 事件延迟 </strong></p>
 * <p>默认情况，刷选或者移动选区的时候，会不断得发 <code class="codespan">brushSelected</code> 事件，从而告诉外界选中的内容。</p>
 * <p>但是频繁的事件可能导致性能问题，或者动画效果很差。所以 brush 组件提供了 <a href="#brush.throttleType">brush.throttleType</a>，<a href="#brush.throttleDelay">brush.throttleDelay</a> 来解决这个问题。</p>
 * <p>throttleType 取值可以是：</p>
 * <ul>
 * <li><code class="codespan">'debounce'</code>：表示只有停止动作了（即一段时间没有操作了），才会触发事件。时间阈值由 <a href="#brush.throttleDelay">brush.throttleDelay</a> 指定。</li>
 * <li><code class="codespan">'fixRate'</code>：表示按照一定的频率触发事件，时间间隔由 <a href="#brush.throttleDelay">brush.throttleDelay</a> 指定。</li>
 * </ul>
 * <p><br></p>
 * <hr>
 * <p><strong> 被选中项和未被选中项的视觉设置 </strong></p>
 * <p>参见 <a href="#brush.inBrush">brush.inBrush</a> 和 <a href="#brush.outOfBrush">brush.outOfBrush</a>。</p>
 * <p><br></p>
 * <hr>
 * <p>下面是详细配置。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Brush implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.id
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.toolbox
     * <br/>序号: 2
     * <br/>默认值: ["rect","polygon","keep","clear"]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>使用在 toolbox 中的按钮。</p>
     * <p>brush 相关的 toolbox 按钮有：</p>
     * <ul>
     * <li><code class="codespan">'rect'</code>：开启矩形选框选择功能。</li>
     * <li><code class="codespan">'polygon'</code>：开启任意形状选框选择功能。</li>
     * <li><code class="codespan">'lineX'</code>：开启横向选择功能。</li>
     * <li><code class="codespan">'lineY'</code>：开启纵向选择功能。</li>
     * <li><code class="codespan">'keep'</code>：切换『单选』和『多选』模式。后者可支持同时画多个选框。前者支持单击清除所有选框。</li>
     * <li><code class="codespan">'clear'</code>：清空所有选框。</li>
     * </ul>
     */
    private List<Object> toolbox;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.brushLink
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Array","string"]
     * <br/>描述:
     * <p>不同系列间，选中的项可以联动。</p>
     * <p>参见如下效果（刷选一个 <code class="codespan">scatter</code>，其他 <code class="codespan">scatter</code> 以及 <code class="codespan">parallel</code> 图都会有选中效果）：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-matrix&amp;edit=1&amp;reset=1" width="800" height="550"></iframe>
     *
     *
     * <p><code class="codespan">brushLink</code> 配置项是一个数组，内容是 seriesIndex，指定了哪些 series 可以被联动。例如可以是：</p>
     * <ul>
     * <li><code class="codespan">[3, 4, 5]</code> 表示 seriesIndex 为 <code class="codespan">3</code>, <code class="codespan">4</code>, <code class="codespan">5</code> 的 series 可以被联动。</li>
     * <li><code class="codespan">'all'</code> 表示所有 series 都进行 brushLink。</li>
     * <li><code class="codespan">'none'</code> 或 <code class="codespan">null</code> 或 <code class="codespan">undefined</code> 表示不启用 brushLink 功能。</li>
     * </ul>
     * <p><strong>注意</strong></p>
     * <p>brushLink 是通过 dataIndex 进行映射，所以需要保证，<strong>联动的每个系列的 <code class="codespan">data</code> 都是 <code class="codespan">index</code> 对应的</strong>。*</p>
     * <p>例如：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">brush</span>: {
     *         <span class="hljs-attr">brushLink</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">1</span>]
     *     },
     *     <span class="hljs-attr">series</span>: [
     *         {
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'bar'</span>
     *             <span class="hljs-attr">data</span>: [<span class="hljs-number">232</span>,    <span class="hljs-number">4434</span>,    <span class="hljs-number">545</span>,      <span class="hljs-number">654</span>]     <span class="hljs-comment">// data 有四个项</span>
     *         },
     *         {
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'parallel'</span>,
     *             <span class="hljs-attr">data</span>: [[<span class="hljs-number">4</span>, <span class="hljs-number">5</span>], [<span class="hljs-number">3</span>, <span class="hljs-number">5</span>], [<span class="hljs-number">66</span>, <span class="hljs-number">33</span>], [<span class="hljs-number">99</span>, <span class="hljs-number">66</span>]] <span class="hljs-comment">// data 同样有四个项，两个系列的 data 是对应的。</span>
     *         }
     *     ]
     * };
     * </code></pre>
     */
    private Object brushLink;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.seriesIndex
     * <br/>序号: 4
     * <br/>默认值: all
     * <br/>js类型: ["Array","number","string"]
     * <br/>描述:
     * <p>指定哪些 series 可以被刷选，可取值为：</p>
     * <ul>
     * <li><code class="codespan">'all'</code>: 所有 series</li>
     * <li><code class="codespan">'Array'</code>: series index 列表</li>
     * <li><code class="codespan">'number'</code>: 某个 series index</li>
     * </ul>
     */
    private Object seriesIndex;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.geoIndex
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Array","number","string"]
     * <br/>描述:
     * <p>指定哪些 geo 可以被刷选。</p>
     * <p>可以设置 <code class="codespan">brush</code> 是『全局的』还是『属于坐标系的』。</p>
     * <p><strong>全局 brush</strong></p>
     * <p>在 echarts 实例中任意地方刷选。这是默认情况。如果没有指定为『坐标系 brush』，就是『全局 brush』。</p>
     * <p><strong>坐标系 brush</strong></p>
     * <p>在 指定的坐标系中刷选。选框可以跟随坐标系的缩放和平移（roam 和 dataZoom）而移动。</p>
     * <p>坐标系 brush 实际更为常用，尤其是在 geo 中。</p>
     * <p>通过指定 <a href="#brush.geoIndex">brush.geoIndex</a> 或 <a href="#brush.xAxisIndex">brush.xAxisIndex</a> 或 <a href="#brush.yAxisIndex">brush.yAxisIndex</a> 来规定可以在哪些坐标系中进行刷选。</p>
     * <p>这几个配置项的取值可以是：</p>
     * <ul>
     * <li><code class="codespan">'all'</code>，表示所有</li>
     * <li><code class="codespan">number</code>，如 <code class="codespan">0</code>，表示这个 index 所对应的坐标系。</li>
     * <li><code class="codespan">Array</code>，如 <code class="codespan">[0, 4, 2]</code>，表示指定这些 index 所对应的坐标系。</li>
     * <li><code class="codespan">'none'</code> 或 <code class="codespan">null</code> 或 <code class="codespan">undefined</code>，表示不指定。</li>
     * </ul>
     * <p>例如：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">geo</span>: {
     *         ...
     *     },
     *     <span class="hljs-attr">brush</span>: {
     *         <span class="hljs-attr">geoIndex</span>: <span class="hljs-string">'all'</span>, <span class="hljs-comment">// 只可以在所有 geo 坐标系中刷选，也就是上面定义的 geo 组件中。</span>
     *         ...
     *     }
     * };
     * </code></pre>
     * <p>例如：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">grid</span>: [
     *         {...}, <span class="hljs-comment">// grid 0</span>
     *         {...}  <span class="hljs-comment">// grid 1</span>
     *     ],
     *     <span class="hljs-attr">xAxis</span>: [
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">1</span>, ...}, <span class="hljs-comment">// xAxis 0，属于 grid 1。</span>
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">0</span>, ...}  <span class="hljs-comment">// xAxis 1，属于 grid 0。</span>
     *     ],
     *     <span class="hljs-attr">yAxis</span>: [
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">1</span>, ...}, <span class="hljs-comment">// yAxis 0，属于 grid 1。</span>
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">0</span>, ...}  <span class="hljs-comment">// yAxis 1，属于 grid 0。</span>
     *     ],
     *     <span class="hljs-attr">brush</span>: {
     *         <span class="hljs-attr">xAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">1</span>], <span class="hljs-comment">// 只可以在 xAxisIndex 为 `0` 和 `1` 的 xAxis 所在的直角坐标系中刷选。</span>
     *         ...
     *     }
     * };
     * </code></pre>
     */
    private Object geoIndex;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.xAxisIndex
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Array","number","string"]
     * <br/>描述:
     * <p>指定哪些 xAxisIndex 可以被刷选。</p>
     * <p>可以设置 <code class="codespan">brush</code> 是『全局的』还是『属于坐标系的』。</p>
     * <p><strong>全局 brush</strong></p>
     * <p>在 echarts 实例中任意地方刷选。这是默认情况。如果没有指定为『坐标系 brush』，就是『全局 brush』。</p>
     * <p><strong>坐标系 brush</strong></p>
     * <p>在 指定的坐标系中刷选。选框可以跟随坐标系的缩放和平移（roam 和 dataZoom）而移动。</p>
     * <p>坐标系 brush 实际更为常用，尤其是在 geo 中。</p>
     * <p>通过指定 <a href="#brush.geoIndex">brush.geoIndex</a> 或 <a href="#brush.xAxisIndex">brush.xAxisIndex</a> 或 <a href="#brush.yAxisIndex">brush.yAxisIndex</a> 来规定可以在哪些坐标系中进行刷选。</p>
     * <p>这几个配置项的取值可以是：</p>
     * <ul>
     * <li><code class="codespan">'all'</code>，表示所有</li>
     * <li><code class="codespan">number</code>，如 <code class="codespan">0</code>，表示这个 index 所对应的坐标系。</li>
     * <li><code class="codespan">Array</code>，如 <code class="codespan">[0, 4, 2]</code>，表示指定这些 index 所对应的坐标系。</li>
     * <li><code class="codespan">'none'</code> 或 <code class="codespan">null</code> 或 <code class="codespan">undefined</code>，表示不指定。</li>
     * </ul>
     * <p>例如：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">geo</span>: {
     *         ...
     *     },
     *     <span class="hljs-attr">brush</span>: {
     *         <span class="hljs-attr">geoIndex</span>: <span class="hljs-string">'all'</span>, <span class="hljs-comment">// 只可以在所有 geo 坐标系中刷选，也就是上面定义的 geo 组件中。</span>
     *         ...
     *     }
     * };
     * </code></pre>
     * <p>例如：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">grid</span>: [
     *         {...}, <span class="hljs-comment">// grid 0</span>
     *         {...}  <span class="hljs-comment">// grid 1</span>
     *     ],
     *     <span class="hljs-attr">xAxis</span>: [
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">1</span>, ...}, <span class="hljs-comment">// xAxis 0，属于 grid 1。</span>
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">0</span>, ...}  <span class="hljs-comment">// xAxis 1，属于 grid 0。</span>
     *     ],
     *     <span class="hljs-attr">yAxis</span>: [
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">1</span>, ...}, <span class="hljs-comment">// yAxis 0，属于 grid 1。</span>
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">0</span>, ...}  <span class="hljs-comment">// yAxis 1，属于 grid 0。</span>
     *     ],
     *     <span class="hljs-attr">brush</span>: {
     *         <span class="hljs-attr">xAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">1</span>], <span class="hljs-comment">// 只可以在 xAxisIndex 为 `0` 和 `1` 的 xAxis 所在的直角坐标系中刷选。</span>
     *         ...
     *     }
     * };
     * </code></pre>
     */
    private Object xAxisIndex;

    public Object getxAxisIndex() {
        return this.xAxisIndex;
    }

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.yAxisIndex
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Array","number","string"]
     * <br/>描述:
     * <p>指定哪些 yAxisIndex 可以被刷选。</p>
     * <p>可以设置 <code class="codespan">brush</code> 是『全局的』还是『属于坐标系的』。</p>
     * <p><strong>全局 brush</strong></p>
     * <p>在 echarts 实例中任意地方刷选。这是默认情况。如果没有指定为『坐标系 brush』，就是『全局 brush』。</p>
     * <p><strong>坐标系 brush</strong></p>
     * <p>在 指定的坐标系中刷选。选框可以跟随坐标系的缩放和平移（roam 和 dataZoom）而移动。</p>
     * <p>坐标系 brush 实际更为常用，尤其是在 geo 中。</p>
     * <p>通过指定 <a href="#brush.geoIndex">brush.geoIndex</a> 或 <a href="#brush.xAxisIndex">brush.xAxisIndex</a> 或 <a href="#brush.yAxisIndex">brush.yAxisIndex</a> 来规定可以在哪些坐标系中进行刷选。</p>
     * <p>这几个配置项的取值可以是：</p>
     * <ul>
     * <li><code class="codespan">'all'</code>，表示所有</li>
     * <li><code class="codespan">number</code>，如 <code class="codespan">0</code>，表示这个 index 所对应的坐标系。</li>
     * <li><code class="codespan">Array</code>，如 <code class="codespan">[0, 4, 2]</code>，表示指定这些 index 所对应的坐标系。</li>
     * <li><code class="codespan">'none'</code> 或 <code class="codespan">null</code> 或 <code class="codespan">undefined</code>，表示不指定。</li>
     * </ul>
     * <p>例如：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">geo</span>: {
     *         ...
     *     },
     *     <span class="hljs-attr">brush</span>: {
     *         <span class="hljs-attr">geoIndex</span>: <span class="hljs-string">'all'</span>, <span class="hljs-comment">// 只可以在所有 geo 坐标系中刷选，也就是上面定义的 geo 组件中。</span>
     *         ...
     *     }
     * };
     * </code></pre>
     * <p>例如：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">grid</span>: [
     *         {...}, <span class="hljs-comment">// grid 0</span>
     *         {...}  <span class="hljs-comment">// grid 1</span>
     *     ],
     *     <span class="hljs-attr">xAxis</span>: [
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">1</span>, ...}, <span class="hljs-comment">// xAxis 0，属于 grid 1。</span>
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">0</span>, ...}  <span class="hljs-comment">// xAxis 1，属于 grid 0。</span>
     *     ],
     *     <span class="hljs-attr">yAxis</span>: [
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">1</span>, ...}, <span class="hljs-comment">// yAxis 0，属于 grid 1。</span>
     *         {<span class="hljs-attr">gridIndex</span>: <span class="hljs-number">0</span>, ...}  <span class="hljs-comment">// yAxis 1，属于 grid 0。</span>
     *     ],
     *     <span class="hljs-attr">brush</span>: {
     *         <span class="hljs-attr">xAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">1</span>], <span class="hljs-comment">// 只可以在 xAxisIndex 为 `0` 和 `1` 的 xAxis 所在的直角坐标系中刷选。</span>
     *         ...
     *     }
     * };
     * </code></pre>
     */
    private Object yAxisIndex;

    public Object getyAxisIndex() {
        return this.yAxisIndex;
    }

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.brushType
     * <br/>序号: 8
     * <br/>默认值: rect
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>默认的刷子类型。</p>
     * <ul>
     * <li><code class="codespan">'rect'</code>：矩形选框。</li>
     * <li><code class="codespan">'polygon'</code>：任意形状选框。</li>
     * <li><code class="codespan">'lineX'</code>：横向选择。</li>
     * <li><code class="codespan">'lineY'</code>：纵向选择。</li>
     * </ul>
     */
    private String brushType;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.brushMode
     * <br/>序号: 9
     * <br/>默认值: single
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>默认的刷子的模式。可取值为：</p>
     * <ul>
     * <li><code class="codespan">'single'</code>：单选。</li>
     * <li><code class="codespan">'multiple'</code>：多选。</li>
     * </ul>
     */
    private String brushMode;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.transformable
     * <br/>序号: 10
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>已经选好的选框是否可以被调整形状或平移。</p>
     */
    private Boolean transformable;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.brushStyle
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>选框的默认样式，值为：</p>
     * <pre><code class="lang-javascript hljs">{
     *     <span class="hljs-attr">borderWidth</span>: <span class="hljs-number">1</span>,
     *     <span class="hljs-attr">color</span>: <span class="hljs-string">'rgba(120,140,180,0.3)'</span>,
     *     <span class="hljs-attr">borderColor</span>: <span class="hljs-string">'rgba(120,140,180,0.8)'</span>
     * },
     * </code></pre>
     */
    private Object brushStyle;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.throttleType
     * <br/>序号: 12
     * <br/>默认值: fixRate
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>默认情况，刷选或者移动选区的时候，会不断得发 <code class="codespan">brushSelected</code> 事件，从而告诉外界选中的内容。</p>
     * <p>但是频繁的事件可能导致性能问题，或者动画效果很差。所以 brush 组件提供了 <a href="#brush.throttleType">brush.throttleType</a>，<a href="#brush.throttleDelay">brush.throttleDelay</a> 来解决这个问题。</p>
     * <p>throttleType 取值可以是：</p>
     * <ul>
     * <li><code class="codespan">'debounce'</code>：表示只有停止动作了（即一段时间没有操作了），才会触发事件。时间阈值由 <a href="#brush.throttleDelay">brush.throttleDelay</a> 指定。</li>
     * <li><code class="codespan">'fixRate'</code>：表示按照一定的频率触发事件，时间间隔由 <a href="#brush.throttleDelay">brush.throttleDelay</a> 指定。</li>
     * </ul>
     */
    private String throttleType;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.throttleDelay
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>默认为 <code class="codespan">0</code> 表示不开启 throttle。</p>
     * <p>默认情况，刷选或者移动选区的时候，会不断得发 <code class="codespan">brushSelected</code> 事件，从而告诉外界选中的内容。</p>
     * <p>但是频繁的事件可能导致性能问题，或者动画效果很差。所以 brush 组件提供了 <a href="#brush.throttleType">brush.throttleType</a>，<a href="#brush.throttleDelay">brush.throttleDelay</a> 来解决这个问题。</p>
     * <p>throttleType 取值可以是：</p>
     * <ul>
     * <li><code class="codespan">'debounce'</code>：表示只有停止动作了（即一段时间没有操作了），才会触发事件。时间阈值由 <a href="#brush.throttleDelay">brush.throttleDelay</a> 指定。</li>
     * <li><code class="codespan">'fixRate'</code>：表示按照一定的频率触发事件，时间间隔由 <a href="#brush.throttleDelay">brush.throttleDelay</a> 指定。</li>
     * </ul>
     */
    private Integer throttleDelay;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.removeOnClick
     * <br/>序号: 14
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>在 <a href="#brush.brushMode">brush.brushMode</a> 为 <code class="codespan">'single'</code> 的情况下，是否支持『单击清除所有选框』。</p>
     */
    private Boolean removeOnClick;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.inBrush
     * <br/>序号: 15
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>定义 <strong>在选中范围中</strong> 的视觉元素。</p>
     * <p>可选的视觉元素有：</p>
     * <ul>
     * <li><code class="codespan">symbol</code>: 图元的图形类别。</li>
     * <li><code class="codespan">symbolSize</code>: 图元的大小。</li>
     * <li><code class="codespan">color</code>: 图元的颜色。</li>
     * <li><code class="codespan">colorAlpha</code>: 图元的颜色的透明度。</li>
     * <li><code class="codespan">opacity</code>: 图元以及其附属物（如文字标签）的透明度。</li>
     * <li><code class="codespan">colorLightness</code>: 颜色的明暗度，参见 <a href="https://en.wikipedia.org/wiki/HSL_and_HSV" target="_blank">HSL</a>。</li>
     * <li><code class="codespan">colorSaturation</code>: 颜色的饱和度，参见 <a href="https://en.wikipedia.org/wiki/HSL_and_HSV" target="_blank">HSL</a>。</li>
     * <li><code class="codespan">colorHue</code>: 颜色的色调，参见 <a href="https://en.wikipedia.org/wiki/HSL_and_HSV" target="_blank">HSL</a>。</li>
     * </ul>
     * <p>大多数情况下，inBrush 可以不指定，维持本来的视觉配置。</p>
     */
    private Object inBrush;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.outOfBrush
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>定义 <strong>在选中范围外</strong> 的视觉元素。</p>
     * <p>可选的视觉元素有：</p>
     * <ul>
     * <li><code class="codespan">symbol</code>: 图元的图形类别。</li>
     * <li><code class="codespan">symbolSize</code>: 图元的大小。</li>
     * <li><code class="codespan">color</code>: 图元的颜色。</li>
     * <li><code class="codespan">colorAlpha</code>: 图元的颜色的透明度。</li>
     * <li><code class="codespan">opacity</code>: 图元以及其附属物（如文字标签）的透明度。</li>
     * <li><code class="codespan">colorLightness</code>: 颜色的明暗度，参见 <a href="https://en.wikipedia.org/wiki/HSL_and_HSV" target="_blank">HSL</a>。</li>
     * <li><code class="codespan">colorSaturation</code>: 颜色的饱和度，参见 <a href="https://en.wikipedia.org/wiki/HSL_and_HSV" target="_blank">HSL</a>。</li>
     * <li><code class="codespan">colorHue</code>: 颜色的色调，参见 <a href="https://en.wikipedia.org/wiki/HSL_and_HSV" target="_blank">HSL</a>。</li>
     * </ul>
     * <p><strong>注意</strong>，如果 outOfBrush 没有指定，默认会设置 color: <code class="codespan">'#ddd'</code>，如果你不想要这个color，比如可以
     * 换成：</p>
     * <pre><code class="lang-javascript hljs">brush: {
     *     ...,
     *     <span class="hljs-attr">outOfBrush</span>: {
     *         <span class="hljs-attr">colorAlpha</span>: <span class="hljs-number">0.1</span>
     *     }
     * }
     * </code></pre>
     */
    private Object outOfBrush;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#brush.z
     * <br/>序号: 17
     * <br/>默认值: 10000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>brush 选框的 z-index。当有和不想管组件有不正确的重叠时，可以进行调整。</p>
     */
    private Integer z;
}
