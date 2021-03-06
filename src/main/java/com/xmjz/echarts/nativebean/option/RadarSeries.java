package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.radarSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar">https://echarts.apache.org/zh/option.html#series-radar</a>
 * <br/>序号: 0
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>雷达图</strong></p>
 * <p>雷达图主要用于表现多变量的数据，例如球员的各个属性分析。依赖 <a href="#radar">radar</a> 组件。</p>
 * <p>下面是 AQI 数据用雷达图表现的示例。</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=radar-aqi&amp;edit=1&amp;reset=1" width="600" height="500" data-ll-timeout="18"></iframe>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class RadarSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.type">https://echarts.apache.org/zh/option.html#series-radar.type</a>
     * <br/>序号: 1
     * <br/>默认值: radar
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.id">https://echarts.apache.org/zh/option.html#series-radar.id</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.name">https://echarts.apache.org/zh/option.html#series-radar.name</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.radarIndex">https://echarts.apache.org/zh/option.html#series-radar.radarIndex</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>雷达图所使用的 <a href="#radar">radar</a> 组件的 index。</p>
     */
    private Integer radarIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.symbol">https://echarts.apache.org/zh/option.html#series-radar.symbol</a>
     * <br/>序号: 5
     * <br/>默认值: circle
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
     * <pre><code class="lang-js hljs javascript">(value: <span class="hljs-built_in">Array</span>|number, <span class="hljs-attr">params</span>: <span class="hljs-built_in">Object</span>) =&gt; string
     * </code></pre>
     * <p>其中第一个参数 <code class="codespan">value</code> 为 <a href="#series-radar.data">data</a> 中的数据值。第二个参数<code class="codespan">params</code> 是其它的数据项参数。</p>
     */
    private Object symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.symbolSize">https://echarts.apache.org/zh/option.html#series-radar.symbolSize</a>
     * <br/>序号: 6
     * <br/>默认值: 4
     * <br/>js类型: ["number","Array","Function"]
     * <br/>描述:
     * <p>标记的大小，可以设置成诸如 <code class="codespan">10</code> 这样单一的数字，也可以用数组分开表示宽和高，例如 <code class="codespan">[20, 10]</code> 表示标记宽为<code class="codespan">20</code>，高为<code class="codespan">10</code>。</p>
     * <p>如果需要每个数据的图形大小不一样，可以设置为如下格式的回调函数：</p>
     * <pre><code class="lang-js hljs javascript">(value: <span class="hljs-built_in">Array</span>|number, <span class="hljs-attr">params</span>: <span class="hljs-built_in">Object</span>) =&gt; number|<span class="hljs-built_in">Array</span>
     * </code></pre>
     * <p>其中第一个参数 <code class="codespan">value</code> 为 <a href="#series-radar.data">data</a> 中的数据值。第二个参数<code class="codespan">params</code> 是其它的数据项参数。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.symbolRotate">https://echarts.apache.org/zh/option.html#series-radar.symbolRotate</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>标记的旋转角度（而非弧度）。正值表示逆时针旋转。注意在 <code class="codespan">markLine</code> 中当 <code class="codespan">symbol</code> 为 <code class="codespan">'arrow'</code> 时会忽略 <code class="codespan">symbolRotate</code> 强制设置为切线的角度。</p>
     * <p>如果需要每个数据的旋转角度不一样，可以设置为如下格式的回调函数：</p>
     * <pre><code class="lang-js hljs javascript">(value: <span class="hljs-built_in">Array</span>|number, <span class="hljs-attr">params</span>: <span class="hljs-built_in">Object</span>) =&gt; number
     * </code></pre>
     * <p>其中第一个参数 <code class="codespan">value</code> 为 <a href="#series-radar.data">data</a> 中的数据值。第二个参数<code class="codespan">params</code> 是其它的数据项参数。</p>
     * <blockquote>
     * <p>从 4.8.0 开始支持回调函数。</p>
     * </blockquote>
     */
    private Object symbolRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.symbolKeepAspect">https://echarts.apache.org/zh/option.html#series-radar.symbolKeepAspect</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>如果 <code class="codespan">symbol</code> 是 <code class="codespan">path://</code> 的形式，是否在缩放时保持该图形的长宽比。</p>
     */
    private Boolean symbolKeepAspect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.symbolOffset">https://echarts.apache.org/zh/option.html#series-radar.symbolOffset</a>
     * <br/>序号: 9
     * <br/>默认值: [0,0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。</p>
     * <p>例如 <code class="codespan">[0, '50%']</code> 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。</p>
     */
    private List<?> symbolOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.label">https://echarts.apache.org/zh/option.html#series-radar.label</a>
     * <br/>序号: 10
     * <br/>默认值: top
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.labelLayout">https://echarts.apache.org/zh/option.html#series-radar.labelLayout</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["Object","Function"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>标签的统一布局配置。</p>
     * <p>该配置项是在每个系列默认的标签布局基础上，统一调整标签的<code class="codespan">(x, y)</code>位置，标签对齐等属性以实现想要的标签布局效果。</p>
     * <p>该配置项也可以是一个有如下参数的回调函数</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 标签对应数据的 dataIndex</span>
     * <span class="hljs-attr">dataIndex</span>: number
     * <span class="hljs-comment">// 标签对应的数据类型，只在关系图中会有 node 和 edge 数据类型的区分</span>
     * dataType?: string
     * <span class="hljs-comment">// 标签对应的系列的 index</span>
     * <span class="hljs-attr">seriesIndex</span>: number
     * <span class="hljs-comment">// 标签显示的文本</span>
     * <span class="hljs-attr">text</span>: string
     * <span class="hljs-comment">// 默认的标签的包围盒，由系列默认的标签布局决定</span>
     * <span class="hljs-attr">labelRect</span>: {<span class="hljs-attr">x</span>: number, <span class="hljs-attr">y</span>: number, <span class="hljs-attr">width</span>: number, <span class="hljs-attr">height</span>: number}
     * <span class="hljs-comment">// 默认的标签水平对齐</span>
     * <span class="hljs-attr">align</span>: <span class="hljs-string">'left'</span> | <span class="hljs-string">'center'</span> | <span class="hljs-string">'right'</span>
     * <span class="hljs-comment">// 默认的标签垂直对齐</span>
     * <span class="hljs-attr">verticalAlign</span>: <span class="hljs-string">'top'</span> | <span class="hljs-string">'middle'</span> | <span class="hljs-string">'bottom'</span>
     * <span class="hljs-comment">// 标签所对应的数据图形的包围盒，可用于定位标签位置</span>
     * <span class="hljs-attr">rect</span>: {<span class="hljs-attr">x</span>: number, <span class="hljs-attr">y</span>: number, <span class="hljs-attr">width</span>: number, <span class="hljs-attr">height</span>: number}
     * <span class="hljs-comment">// 默认引导线的位置，目前只有饼图(pie)和漏斗图(funnel)有默认标签位置</span>
     * <span class="hljs-comment">// 如果没有该值则为 null</span>
     * labelLinePoints?: number[][]
     * </code></pre>
     * <p><strong>示例：</strong></p>
     * <p>将标签显示在图形右侧 10px 的位置，并且垂直居中：</p>
     * <pre><code class="lang-js hljs javascript">labelLayout(params) {
     *     <span class="hljs-keyword">return</span> {
     *         <span class="hljs-attr">x</span>: params.rect.x + <span class="hljs-number">10</span>,
     *         <span class="hljs-attr">y</span>: params.rect.y + params.rect.height / <span class="hljs-number">2</span>,
     *         <span class="hljs-attr">verticalAlign</span>: <span class="hljs-string">'middle'</span>,
     *         <span class="hljs-attr">align</span>: <span class="hljs-string">'left'</span>
     *     }
     * }
     * </code></pre>
     * <p>根据图形的包围盒尺寸决定文本尺寸</p>
     * <pre><code class="lang-js hljs javascript">
     * labelLayout(params) {
     *     <span class="hljs-keyword">return</span> {
     *         <span class="hljs-attr">fontSize</span>: <span class="hljs-built_in">Math</span>.max(params.rect.width / <span class="hljs-number">10</span>, <span class="hljs-number">5</span>)
     *     };
     * }
     * </code></pre>
     */
    private LabelLayout labelLayout;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.itemStyle">https://echarts.apache.org/zh/option.html#series-radar.itemStyle</a>
     * <br/>序号: 12
     * <br/>默认值: 自适应
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>折线拐点标志的样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.lineStyle">https://echarts.apache.org/zh/option.html#series-radar.lineStyle</a>
     * <br/>序号: 13
     * <br/>默认值: #000
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>线条样式。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.areaStyle">https://echarts.apache.org/zh/option.html#series-radar.areaStyle</a>
     * <br/>序号: 14
     * <br/>默认值: #000
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>区域填充样式。</p>
     */
    private AreaStyle areaStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.emphasis">https://echarts.apache.org/zh/option.html#series-radar.emphasis</a>
     * <br/>序号: 15
     * <br/>默认值: none
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态的配置。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.blur">https://echarts.apache.org/zh/option.html#series-radar.blur</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出状态的配置。开启 <a href="#series-radar.emphasis.focus">emphasis.focus</a> 后有效。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.select">https://echarts.apache.org/zh/option.html#series-radar.select</a>
     * <br/>序号: 17
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>选中状态的配置。开启 <a href="#series-radar.selectedMode">selectedMode</a> 后有效。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.selectedMode">https://echarts.apache.org/zh/option.html#series-radar.selectedMode</a>
     * <br/>序号: 18
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.data">https://echarts.apache.org/zh/option.html#series-radar.data</a>
     * <br/>序号: 19
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>雷达图的数据是多变量（维度）的，如下示例：</p>
     * <pre><code class="lang-js hljs javascript">data : [
     *     {
     *         <span class="hljs-attr">value</span> : [<span class="hljs-number">4300</span>, <span class="hljs-number">10000</span>, <span class="hljs-number">28000</span>, <span class="hljs-number">35000</span>, <span class="hljs-number">50000</span>, <span class="hljs-number">19000</span>],
     *         <span class="hljs-attr">name</span> : <span class="hljs-string">'预算分配（Allocated Budget）'</span>
     *     },
     *     {
     *         <span class="hljs-attr">value</span> : [<span class="hljs-number">5000</span>, <span class="hljs-number">14000</span>, <span class="hljs-number">28000</span>, <span class="hljs-number">31000</span>, <span class="hljs-number">42000</span>, <span class="hljs-number">21000</span>],
     *         <span class="hljs-attr">name</span> : <span class="hljs-string">'实际开销（Actual Spending）'</span>
     *     }
     * ]
     * </code></pre>
     * <p>其中的<code class="codespan">value</code>项数组是具体的数据，每个值跟 <a href="#radar.indicator">radar.indicator</a> 一一对应。</p>
     */
    private List<?> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.zlevel">https://echarts.apache.org/zh/option.html#series-radar.zlevel</a>
     * <br/>序号: 20
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>雷达图所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.z">https://echarts.apache.org/zh/option.html#series-radar.z</a>
     * <br/>序号: 21
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>雷达图组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.silent">https://echarts.apache.org/zh/option.html#series-radar.silent</a>
     * <br/>序号: 22
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.animation">https://echarts.apache.org/zh/option.html#series-radar.animation</a>
     * <br/>序号: 23
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.animationThreshold">https://echarts.apache.org/zh/option.html#series-radar.animationThreshold</a>
     * <br/>序号: 24
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.animationDuration">https://echarts.apache.org/zh/option.html#series-radar.animationDuration</a>
     * <br/>序号: 25
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.animationEasing">https://echarts.apache.org/zh/option.html#series-radar.animationEasing</a>
     * <br/>序号: 26
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.animationDelay">https://echarts.apache.org/zh/option.html#series-radar.animationDelay</a>
     * <br/>序号: 27
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.animationDurationUpdate">https://echarts.apache.org/zh/option.html#series-radar.animationDurationUpdate</a>
     * <br/>序号: 28
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.animationEasingUpdate">https://echarts.apache.org/zh/option.html#series-radar.animationEasingUpdate</a>
     * <br/>序号: 29
     * <br/>默认值: cubicInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.animationDelayUpdate">https://echarts.apache.org/zh/option.html#series-radar.animationDelayUpdate</a>
     * <br/>序号: 30
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
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-radar.tooltip">https://echarts.apache.org/zh/option.html#series-radar.tooltip</a>
     * <br/>序号: 31
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
