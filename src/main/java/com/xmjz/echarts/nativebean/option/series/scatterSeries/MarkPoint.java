package com.xmjz.echarts.nativebean.option.series.scatterSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.scatterSeries.markPoint.Blur;
import com.xmjz.echarts.nativebean.option.series.scatterSeries.markPoint.Data;
import com.xmjz.echarts.nativebean.option.series.scatterSeries.markPoint.Emphasis;
import com.xmjz.echarts.nativebean.option.series.scatterSeries.markPoint.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.scatterSeries.markPoint.Label;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint">#series-scatter.markPoint</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>图表标注。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class MarkPoint extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.symbol">#series-scatter.markPoint.symbol</a>
     * <br/>默认值: 'pin'
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>标记的图形。</p>
     * <p>ECharts 提供的标记类型包括</p>
     * <p><code class="codespan">'circle'</code>, <code class="codespan">'rect'</code>, <code class="codespan">'roundRect'</code>, <code class="codespan">'triangle'</code>, <code class="codespan">'diamond'</code>, <code class="codespan">'pin'</code>, <code class="codespan">'arrow'</code>, <code class="codespan">'none'</code></p>
     * <p>可以通过 <code class="codespan">'image://url'</code> 设置为图片，其中 URL 为图片的链接，或者 <code class="codespan">dataURI</code>。</p>
     * <p>URL 为图片链接例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://http://xxx.xxx.xxx/a/b.png'</span>
     * </code></pre><p>URL 为 <code class="codespan">dataURI</code> 例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://data:image/gif;base64,R0lGODlhEAAQAMQAAORHHOVSKudfOulrSOp3WOyDZu6QdvCchPGolfO0o/XBs/fNwfjZ0frl3/zy7////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAkAABAALAAAAAAQABAAAAVVICSOZGlCQAosJ6mu7fiyZeKqNKToQGDsM8hBADgUXoGAiqhSvp5QAnQKGIgUhwFUYLCVDFCrKUE1lBavAViFIDlTImbKC5Gm2hB0SlBCBMQiB0UjIQA7'</span>
     * </code></pre><p>可以通过 <code class="codespan">'path://'</code> 将图标设置为任意的矢量路径。这种方式相比于使用图片的方式，不用担心因为缩放而产生锯齿或模糊，而且可以设置为任意颜色。路径图形会自适应调整为合适的大小。路径的格式参见 <a href="http://www.w3.org/TR/SVG/paths.html#PathData" target="_blank">SVG PathData</a>。可以从 Adobe Illustrator 等工具编辑导出。</p>
     * <p>例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'path://M30.9,53.2C16.8,53.2,5.3,41.7,5.3,27.6S16.8,2,30.9,2C45,2,56.4,13.5,56.4,27.6S45,53.2,30.9,53.2z M30.9,3.5C17.6,3.5,6.8,14.4,6.8,27.6c0,13.3,10.8,24.1,24.101,24.1C44.2,51.7,55,40.9,55,27.6C54.9,14.4,44.1,3.5,30.9,3.5z M36.9,35.8c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H36c0.5,0,0.9,0.4,0.9,1V35.8z M27.8,35.8 c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H27c0.5,0,0.9,0.4,0.9,1L27.8,35.8L27.8,35.8z'</span>
     * </code></pre><p>如果需要每个数据的图形不一样，可以设置为如下格式的回调函数：</p>
     * <pre><code class="lang-ts hljs typescript">(value: <span class="hljs-built_in">Array</span>|<span class="hljs-built_in">number</span>, params: <span class="hljs-built_in">Object</span>) =&gt; <span class="hljs-built_in">string</span>
     * </code></pre>
     * <p>其中第一个参数 <code class="codespan">value</code> 为 <a href="https://echarts.apache.org/zh/option.html#series-scatter.data">data</a> 中的数据值。第二个参数<code class="codespan">params</code> 是其它的数据项参数。</p>
     */
    private Object symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.symbolSize">#series-scatter.markPoint.symbolSize</a>
     * <br/>默认值: 50
     * <br/>js类型: ["number","Array","Function"]
     * <br/>描述:
     * <p>标记的大小，可以设置成诸如 <code class="codespan">10</code> 这样单一的数字，也可以用数组分开表示宽和高，例如 <code class="codespan">[20, 10]</code> 表示标记宽为<code class="codespan">20</code>，高为<code class="codespan">10</code>。</p>
     * <p>如果需要每个数据的图形大小不一样，可以设置为如下格式的回调函数：</p>
     * <pre><code class="lang-ts hljs typescript">(value: <span class="hljs-built_in">Array</span>|<span class="hljs-built_in">number</span>, params: <span class="hljs-built_in">Object</span>) =&gt; <span class="hljs-built_in">number</span>|<span class="hljs-built_in">Array</span>
     * </code></pre>
     * <p>其中第一个参数 <code class="codespan">value</code> 为 <a href="https://echarts.apache.org/zh/option.html#series-scatter.data">data</a> 中的数据值。第二个参数<code class="codespan">params</code> 是其它的数据项参数。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.symbolRotate">#series-scatter.markPoint.symbolRotate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>标记的旋转角度（而非弧度）。正值表示逆时针旋转。注意在 <code class="codespan">markLine</code> 中当 <code class="codespan">symbol</code> 为 <code class="codespan">'arrow'</code> 时会忽略 <code class="codespan">symbolRotate</code> 强制设置为切线的角度。</p>
     * <p>如果需要每个数据的旋转角度不一样，可以设置为如下格式的回调函数：</p>
     * <pre><code class="lang-ts hljs typescript">(value: <span class="hljs-built_in">Array</span>|<span class="hljs-built_in">number</span>, params: <span class="hljs-built_in">Object</span>) =&gt; <span class="hljs-built_in">number</span>
     * </code></pre>
     * <p>其中第一个参数 <code class="codespan">value</code> 为 <a href="https://echarts.apache.org/zh/option.html#series-scatter.data">data</a> 中的数据值。第二个参数<code class="codespan">params</code> 是其它的数据项参数。</p>
     * <blockquote>
     * <p>从 4.8.0 开始支持回调函数。</p>
     * </blockquote>
     */
    private Object symbolRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.symbolKeepAspect">#series-scatter.markPoint.symbolKeepAspect</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>如果 <code class="codespan">symbol</code> 是 <code class="codespan">path://</code> 的形式，是否在缩放时保持该图形的长宽比。</p>
     */
    private Boolean symbolKeepAspect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.symbolOffset">#series-scatter.markPoint.symbolOffset</a>
     * <br/>默认值: [0, 0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。</p>
     * <p>例如 <code class="codespan">[0, '-50%']</code> 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。</p>
     */
    private List<?> symbolOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.silent">#series-scatter.markPoint.silent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.label">#series-scatter.markPoint.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标注的文本。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.itemStyle">#series-scatter.markPoint.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标注的样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.emphasis">#series-scatter.markPoint.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标注的高亮样式。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.blur">#series-scatter.markPoint.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>标注的淡出样式。淡出的规则跟随所在系列。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.data">#series-scatter.markPoint.data</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>标注的数据数组。每个数组项是一个对象，有下面几种方式指定标注的位置。</p>
     * <ol>
     * <li>通过 <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.data.x">x</a>, <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.data.y">y</a> 属性指定相对容器的屏幕坐标，单位像素，支持百分比。</li>
     * </ol>
     * <ol start="2">
     * <li><p>用 <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.data.coord">coord</a> 属性指定数据在相应坐标系上的坐标位置，单个维度支持设置 <code class="codespan">'min'</code>, <code class="codespan">'max'</code>, <code class="codespan">'average'</code>。</p>
     * </li>
     * <li><p>直接用 <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.data.type">type</a> 属性标注系列中的最大值，最小值。这时候可以使用 <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.data.valueIndex">valueIndex</a> 或者 <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.data.valueDim">valueDim</a> 指定是在哪个维度上的最大值、最小值、平均值。</p>
     * </li>
     * </ol>
     * <p>当多个属性同时存在时，优先级按上述的顺序。</p>
     * <p><strong>示例：</strong></p>
     * <pre><code class="lang-ts hljs typescript">data: [
     *     {
     *         name: <span class="hljs-string">'最大值'</span>,
     *         <span class="hljs-keyword">type</span>: <span class="hljs-string">'max'</span>
     *     },
     *     {
     *         name: <span class="hljs-string">'某个坐标'</span>,
     *         coord: [<span class="hljs-number">10</span>, <span class="hljs-number">20</span>]
     *     }, {
     *         name: <span class="hljs-string">'固定 x 像素位置'</span>,
     *         yAxis: <span class="hljs-number">10</span>,
     *         x: <span class="hljs-string">'90%'</span>
     *     },
     *
     *     {
     *         name: <span class="hljs-string">'某个屏幕坐标'</span>,
     *         x: <span class="hljs-number">100</span>,
     *         y: <span class="hljs-number">100</span>
     *     }
     * ]
     * </code></pre>
     */
    private List<Data> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.animation">#series-scatter.markPoint.animation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.animationThreshold">#series-scatter.markPoint.animationThreshold</a>
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.animationDuration">#series-scatter.markPoint.animationDuration</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.animationEasing">#series-scatter.markPoint.animationEasing</a>
     * <br/>默认值: 'cubicOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.animationDelay">#series-scatter.markPoint.animationDelay</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.animationDurationUpdate">#series-scatter.markPoint.animationDurationUpdate</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.animationEasingUpdate">#series-scatter.markPoint.animationEasingUpdate</a>
     * <br/>默认值: 'cubicInOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-scatter.markPoint.animationDelayUpdate">#series-scatter.markPoint.animationDelayUpdate</a>
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
