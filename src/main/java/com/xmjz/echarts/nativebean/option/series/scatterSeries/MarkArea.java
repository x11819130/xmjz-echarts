package com.xmjz.echarts.nativebean.option.series.scatterSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.scatterSeries.markArea.Blur;
import com.xmjz.echarts.nativebean.option.series.scatterSeries.markArea.Data;
import com.xmjz.echarts.nativebean.option.series.scatterSeries.markArea.Emphasis;
import com.xmjz.echarts.nativebean.option.series.scatterSeries.markArea.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.scatterSeries.markArea.Label;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea">#series-scatter.markArea</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class MarkArea extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.silent">#series-scatter.markArea.silent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.label">#series-scatter.markArea.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标域文本配置。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.itemStyle">#series-scatter.markArea.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该标域的样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.emphasis">#series-scatter.markArea.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮的标域样式</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.blur">#series-scatter.markArea.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出的标域样式。淡出的规则跟随所在系列。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.data">#series-scatter.markArea.data</a>
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>标域的数据数组。每个数组项是一个两个项的数组，分别表示标域左上角和右下角的位置，每个项支持通过下面几种方式指定自己的位置</p>
     * <ol>
     * <li>通过 <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.data.0.x">x</a>, <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.data.0.y">y</a> 属性指定相对容器的屏幕坐标，单位像素，支持百分比。</li>
     * </ol>
     * <ol start="2">
     * <li><p>用 <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.data.0.coord">coord</a> 属性指定数据在相应坐标系上的坐标位置，单个维度支持设置 <code class="codespan">'min'</code>, <code class="codespan">'max'</code>, <code class="codespan">'average'</code>。</p>
     * </li>
     * <li><p>直接用 <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.data.0.type">type</a> 属性标注系列中的最大值，最小值。这时候可以使用 <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.data.0.valueIndex">valueIndex</a> 或者 <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.data.0.valueDim">valueDim</a> 指定是在哪个维度上的最大值、最小值、平均值。</p>
     * </li>
     * <li><p>如果是笛卡尔坐标系的话，也可以通过只指定 <code class="codespan">xAxis</code> 或者 <code class="codespan">yAxis</code> 来实现 X 轴或者 Y 轴为某值的标域，见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=scatter-weight" target="_blank">scatter-weight</a></p>
     * </li>
     * </ol>
     * <p>当多个属性同时存在时，优先级按上述的顺序。</p>
     * <pre><code class="hljs typescript">data: [
     *
     *
     *     [
     *         {
     *             name: <span class="hljs-string">'平均值到最大值'</span>,
     *             <span class="hljs-keyword">type</span>: <span class="hljs-string">'average'</span>
     *         },
     *         {
     *             <span class="hljs-keyword">type</span>: <span class="hljs-string">'max'</span>
     *         }
     *     ],
     *
     *     [
     *         {
     *             name: <span class="hljs-string">'两个坐标之间的标域'</span>,
     *             coord: [<span class="hljs-number">10</span>, <span class="hljs-number">20</span>]
     *         },
     *         {
     *             coord: [<span class="hljs-number">20</span>, <span class="hljs-number">30</span>]
     *         }
     *     ], [
     *         {
     *             name: <span class="hljs-string">'60分到80分'</span>,
     *             yAxis: <span class="hljs-number">60</span>
     *         },
     *         {
     *             yAxis: <span class="hljs-number">80</span>
     *         }
     *     ], [
     *         {
     *             name: <span class="hljs-string">'所有数据范围区间'</span>,
     *             coord: [<span class="hljs-string">'min'</span>, <span class="hljs-string">'min'</span>]
     *         },
     *         {
     *             coord: [<span class="hljs-string">'max'</span>, <span class="hljs-string">'max'</span>]
     *         }
     *     ],
     * [
     *         {
     *             name: <span class="hljs-string">'两个屏幕坐标之间的标域'</span>,
     *             x: <span class="hljs-number">100</span>,
     *             y: <span class="hljs-number">100</span>
     *         }, {
     *             x: <span class="hljs-string">'90%'</span>,
     *             y: <span class="hljs-string">'10%'</span>
     *         }
     *     ]
     * ]
     * </code></pre>
     */
    private Data data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.animation">#series-scatter.markArea.animation</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.animationThreshold">#series-scatter.markArea.animationThreshold</a>
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.animationDuration">#series-scatter.markArea.animationDuration</a>
     * <br/>默认值: 1000
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.animationEasing">#series-scatter.markArea.animationEasing</a>
     * <br/>默认值: 'cubicOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.animationDelay">#series-scatter.markArea.animationDelay</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.animationDurationUpdate">#series-scatter.markArea.animationDurationUpdate</a>
     * <br/>默认值: 300
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的时长。</p>
     * <p>支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的更新动画效果：</p>
     * <pre><code class="lang-ts hljs typescript">animationDurationUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDurationUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.animationEasingUpdate">#series-scatter.markArea.animationEasingUpdate</a>
     * <br/>默认值: 'cubicInOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markArea.animationDelayUpdate">#series-scatter.markArea.animationDelayUpdate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-ts hljs typescript">animationDelayUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelayUpdate;
}
