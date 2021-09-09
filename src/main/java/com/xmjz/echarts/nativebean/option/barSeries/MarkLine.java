package com.xmjz.echarts.nativebean.option.barSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine</a>
 * <br/>序号: 33
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>图表标线。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class MarkLine implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.silent">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.silent</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.symbol">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.symbol</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string","Array"]
     * <br/>描述:
     * <p>标线两端的标记类型，可以是一个数组分别指定两端，也可以是单个统一指定，具体格式见 <a href="#series-bar.markLine.data.0.symbol">data.symbol</a>。</p>
     */
    private Object symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.symbolSize">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.symbolSize</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>标线两端的标记大小，可以是一个数组分别指定两端，也可以是单个统一指定。</p>
     * <p><strong>注意：</strong> 这里无法像一般的 <code class="codespan">symbolSize</code> 那样通过数组分别指定高宽。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.precision">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.precision</a>
     * <br/>序号: 4
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标线数值的精度，在显示平均值线的时候有用。</p>
     */
    private Integer precision;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.label">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.label</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标线的文本。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.lineStyle">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.lineStyle</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标线的样式</p>
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.emphasis">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.emphasis</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标线的高亮样式。</p>
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.data">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.data</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>标线的数据数组。每个数组项可以是一个两个值的数组，分别表示线的起点和终点，每一项是一个对象，有下面几种方式指定起点或终点的位置。</p>
     * <ol>
     * <li><p>通过 <a href="#series-bar.markLine.data.0.x">x</a>, <a href="#series-bar.markLine.data.0.y">y</a> 属性指定相对容器的屏幕坐标，单位像素，支持百分比。</p>
     * </li>
     * <li><p>用 <a href="#series-bar.markLine.data.0.coord">coord</a> 属性指定数据在相应坐标系上的坐标位置，单个维度支持设置 <code class="codespan">'min'</code>, <code class="codespan">'max'</code>, <code class="codespan">'average'</code>。</p>
     * </li>
     * <li><p>直接用 <a href="#series-bar.markLine.data.0.type">type</a> 属性标注系列中的最大值，最小值。这时候可以使用 <a href="#series-bar.markLine.data.0.valueIndex">valueIndex</a> 或者 <a href="#series-bar.markLine.data.0.valueDim">valueDim</a> 指定是在哪个维度上的最大值、最小值、平均值。</p>
     * </li>
     * <li><p>如果是笛卡尔坐标系的话，也可以通过只指定 <code class="codespan">xAxis</code> 或者 <code class="codespan">yAxis</code> 来实现 X 轴或者 Y 轴为某值的标线，见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=scatter-weight" target="_blank">scatter-weight</a></p>
     * </li>
     * </ol>
     * <p>当多个属性同时存在时，优先级按上述的顺序。</p>
     * <p>也可以是直接通过 <code class="codespan">type</code> 设置该标线的类型，是最大值的线还是平均线。同样的，这时候可以通过使用 <code class="codespan">valueIndex</code> 指定维度。</p>
     * <pre><code class="hljs javascript">data: [
     *     {
     *         <span class="hljs-attr">name</span>: <span class="hljs-string">'平均线'</span>,
     *         <span class="hljs-comment">// 支持 'average', 'min', 'max'</span>
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'average'</span>
     *     },
     *     {
     *         <span class="hljs-attr">name</span>: <span class="hljs-string">'Y 轴值为 100 的水平线'</span>,
     *         <span class="hljs-attr">yAxis</span>: <span class="hljs-number">100</span>
     *     },
     *     [
     *         {
     *             <span class="hljs-comment">// 起点和终点的项会共用一个 name</span>
     *             <span class="hljs-attr">name</span>: <span class="hljs-string">'最小值到最大值'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'min'</span>
     *         },
     *         {
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'max'</span>
     *         }
     *     ],
     *     [
     *         {
     *             <span class="hljs-attr">name</span>: <span class="hljs-string">'两个坐标之间的标线'</span>,
     *             <span class="hljs-attr">coord</span>: [<span class="hljs-number">10</span>, <span class="hljs-number">20</span>]
     *         },
     *         {
     *             <span class="hljs-attr">coord</span>: [<span class="hljs-number">20</span>, <span class="hljs-number">30</span>]
     *         }
     *     ], [{
     *         <span class="hljs-comment">// 固定起点的 x 像素位置，用于模拟一条指向最大值的水平线</span>
     *         <span class="hljs-attr">yAxis</span>: <span class="hljs-string">'max'</span>,
     *         <span class="hljs-attr">x</span>: <span class="hljs-string">'90%'</span>
     *     }, {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'max'</span>
     *     }],
     *     [
     *         {
     *             <span class="hljs-attr">name</span>: <span class="hljs-string">'两个屏幕坐标之间的标线'</span>,
     *             <span class="hljs-attr">x</span>: <span class="hljs-number">100</span>,
     *             <span class="hljs-attr">y</span>: <span class="hljs-number">100</span>
     *         },
     *         {
     *             <span class="hljs-attr">x</span>: <span class="hljs-number">500</span>,
     *             <span class="hljs-attr">y</span>: <span class="hljs-number">200</span>
     *         }
     *     ]
     * ]
     * </code></pre>
     */
    private Object data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animation">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animation</a>
     * <br/>序号: 9
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationThreshold">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationThreshold</a>
     * <br/>序号: 10
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationDuration">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationDuration</a>
     * <br/>序号: 11
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationEasing">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationEasing</a>
     * <br/>序号: 12
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationDelay">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationDelay</a>
     * <br/>序号: 13
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationDurationUpdate">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationDurationUpdate</a>
     * <br/>序号: 14
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationEasingUpdate">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationEasingUpdate</a>
     * <br/>序号: 15
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationDelayUpdate">https://echarts.apache.org/v4/zh/option.html#series-bar.markLine.animationDelayUpdate</a>
     * <br/>序号: 16
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
