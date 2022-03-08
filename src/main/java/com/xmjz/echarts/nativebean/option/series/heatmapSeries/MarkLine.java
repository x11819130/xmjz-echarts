package com.xmjz.echarts.nativebean.option.series.heatmapSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.heatmapSeries.markLine.Blur;
import com.xmjz.echarts.nativebean.option.series.heatmapSeries.markLine.Data;
import com.xmjz.echarts.nativebean.option.series.heatmapSeries.markLine.Emphasis;
import com.xmjz.echarts.nativebean.option.series.heatmapSeries.markLine.Label;
import com.xmjz.echarts.nativebean.option.series.heatmapSeries.markLine.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine">#series-heatmap.markLine</a>
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
public class MarkLine extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.silent">#series-heatmap.markLine.silent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.symbol">#series-heatmap.markLine.symbol</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","Array"]
     * <br/>描述:
     * <p>标线两端的标记类型，可以是一个数组分别指定两端，也可以是单个统一指定，具体格式见 <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.data.0.symbol">data.symbol</a>。</p>
     */
    private Object symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.symbolSize">#series-heatmap.markLine.symbolSize</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>标线两端的标记大小，可以是一个数组分别指定两端，也可以是单个统一指定。</p>
     * <p><strong>注意：</strong> 这里无法像一般的 <code class="codespan">symbolSize</code> 那样通过数组分别指定高宽。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.precision">#series-heatmap.markLine.precision</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标线数值的精度，在显示平均值线的时候有用。</p>
     */
    private Integer precision;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.label">#series-heatmap.markLine.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标线的文本。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.lineStyle">#series-heatmap.markLine.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标线的样式</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.emphasis">#series-heatmap.markLine.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标线的高亮样式。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.blur">#series-heatmap.markLine.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>标线的淡出样式。淡出的规则跟随所在系列。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.data">#series-heatmap.markLine.data</a>
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>标线的数据数组。每个数组项可以是一个两个值的数组，分别表示线的起点和终点，每一项是一个对象，有下面几种方式指定起点或终点的位置。</p>
     * <ol>
     * <li>通过 <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.data.0.x">x</a>, <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.data.0.y">y</a> 属性指定相对容器的屏幕坐标，单位像素，支持百分比。</li>
     * </ol>
     * <p>当多个属性同时存在时，优先级按上述的顺序。</p>
     * <pre><code class="hljs javascript">data: [
     *
     * [
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
    private Data data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.animation">#series-heatmap.markLine.animation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.animationThreshold">#series-heatmap.markLine.animationThreshold</a>
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.animationDuration">#series-heatmap.markLine.animationDuration</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.animationEasing">#series-heatmap.markLine.animationEasing</a>
     * <br/>默认值: 'cubicOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.animationDelay">#series-heatmap.markLine.animationDelay</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.animationDurationUpdate">#series-heatmap.markLine.animationDurationUpdate</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.animationEasingUpdate">#series-heatmap.markLine.animationEasingUpdate</a>
     * <br/>默认值: 'cubicInOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-heatmap.markLine.animationDelayUpdate">#series-heatmap.markLine.animationDelayUpdate</a>
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