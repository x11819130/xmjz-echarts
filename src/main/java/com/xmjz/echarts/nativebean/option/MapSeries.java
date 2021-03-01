package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.mapSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map">https://echarts.apache.org/zh/option.html#series-map</a>
 * <br/>序号: 0
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>地图。</strong></p>
 * <p>地图主要用于地理区域数据的可视化，配合 <a href="#visualMap">visualMap</a> 组件用于展示不同区域的人口分布密度等数据。</p>
 * <p>多个<a href="#series-map.map">地图类型</a>相同的系列会在同一地图上显示，这时候使用第一个系列的配置项作为地图绘制的配置。</p>
 * <p><strong>Tip: </strong>在 ECharts 3 中不再建议在地图类型的图表使用 <code class="codespan">markLine</code> 和 <code class="codespan">markPoint</code>。如果要实现点数据或者线数据的可视化，可以使用在<a href="#geo">地理坐标系组件</a>上的<a href="#series-scatter">散点图</a>和<a href="#series-lines">线图</a>。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class MapSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.type
     * <br/>序号: 1
     * <br/>默认值: map
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.id
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.name
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.map
     * <br/>序号: 4
     * <br/>默认值:
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>地图类型。</p>
     * <p>ECharts 3 中因为地图精度的提高，不再内置地图数据增大代码体积，你可以在<a href="http://ecomfe.github.io/echarts-builder-web/map3.html" target="_blank">地图下载界面</a>下载到需要的地图文件引入并注册到 ECharts 中。</p>
     * <p>ECharts 中提供了两种格式的地图数据，一种是可以直接 script 标签引入的 js 文件，引入后会自动注册地图名字和数据。还有一种是 JSON 文件，需要通过 AJAX 异步加载后手动注册。</p>
     * <p>下面是两种类型的使用示例：</p>
     * <p><strong> JavaScript 引入示例 </strong></p>
     * <pre><code class="lang-html hljs xml"><span class="hljs-tag">&lt;<span class="hljs-name">script</span> <span class="hljs-attr">src</span>=<span class="hljs-string">"echarts.js"</span>&gt;</span><span class="hljs-tag">&lt;/<span class="hljs-name">script</span>&gt;</span>
     * <span class="hljs-tag">&lt;<span class="hljs-name">script</span> <span class="hljs-attr">src</span>=<span class="hljs-string">"map/js/china.js"</span>&gt;</span><span class="hljs-tag">&lt;/<span class="hljs-name">script</span>&gt;</span>
     * <span class="hljs-tag">&lt;<span class="hljs-name">script</span>&gt;</span><span class="javascript">
     * <span class="hljs-keyword">var</span> chart = echarts.init(<span class="hljs-built_in">document</span>.getElementById(<span class="hljs-string">'main'</span>));
     * chart.setOption({
     *     <span class="hljs-attr">series</span>: [{
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'map'</span>,
     *         <span class="hljs-attr">map</span>: <span class="hljs-string">'china'</span>
     *     }]
     * });
     * </span><span class="hljs-tag">&lt;/<span class="hljs-name">script</span>&gt;</span>
     * </code></pre>
     * <p><strong> JSON 引入示例 </strong></p>
     * <pre><code class="lang-js hljs javascript">$.<span class="hljs-keyword">get</span>('map/json/china.json', function (chinaJson) {
     *     echarts.registerMap(<span class="hljs-string">'china'</span>, chinaJson);
     *     <span class="hljs-keyword">var</span> chart = echarts.init(<span class="hljs-built_in">document</span>.getElementById(<span class="hljs-string">'main'</span>));
     *     chart.setOption({
     *         <span class="hljs-attr">series</span>: [{
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'map'</span>,
     *             <span class="hljs-attr">map</span>: <span class="hljs-string">'china'</span>
     *         }]
     *     });
     * });
     * </code></pre>
     * <p>ECharts 使用 <a href="http://geojson.org/" target="_blank">geoJSON</a> 格式的数据作为地图的轮廓，除了上述数据，你也可以通过其它手段获取地图的 <a href="http://geojson.org/" target="_blank">geoJSON</a> 数据注册到 ECharts 中。参见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=map-usa" target="_blank">USA Population Estimates</a></p>
     */
    private String map;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.roam
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>是否开启鼠标缩放和平移漫游。默认不开启。如果只想要开启缩放或者平移，可以设置成 <code class="codespan">'scale'</code> 或者 <code class="codespan">'move'</code>。设置成 <code class="codespan">true</code> 为都开启</p>
     */
    private Object roam;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.center
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>当前视角的中心点，用经纬度表示</p>
     * <p>例如：</p>
     * <pre><code class="lang-js hljs javascript">center: [<span class="hljs-number">115.97</span>, <span class="hljs-number">29.71</span>]
     * </code></pre>
     */
    private List<Object> center;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.aspectScale
     * <br/>序号: 7
     * <br/>默认值: 0.75
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>这个参数用于 scale 地图的长宽比。</p>
     * <p>最终的 <code class="codespan">aspect</code> 的计算方式是：<code class="codespan">geoBoundingRect.width / geoBoundingRect.height * aspectScale</code></p>
     */
    private Integer aspectScale;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.boundingCoords
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>二维数组，定义定位的左上角以及右下角分别所对应的经纬度。例如</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 设置为一张完整经纬度的世界地图</span>
     * <span class="hljs-attr">map</span>: <span class="hljs-string">'world'</span>,
     * <span class="hljs-attr">left</span>: <span class="hljs-number">0</span>, <span class="hljs-attr">top</span>: <span class="hljs-number">0</span>, <span class="hljs-attr">right</span>: <span class="hljs-number">0</span>, <span class="hljs-attr">bottom</span>: <span class="hljs-number">0</span>,
     * <span class="hljs-attr">boundingCoords</span>: [
     *     <span class="hljs-comment">// 定位左上角经纬度</span>
     *     [<span class="hljs-number">-180</span>, <span class="hljs-number">90</span>],
     *     <span class="hljs-comment">// 定位右下角经纬度</span>
     *     [<span class="hljs-number">180</span>, <span class="hljs-number">-90</span>]
     * ],
     * </code></pre>
     */
    private List<Object> boundingCoords;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.zoom
     * <br/>序号: 9
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前视角的缩放比例。</p>
     */
    private Integer zoom;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.scaleLimit
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>滚轮缩放的极限控制，通过<code class="codespan">min</code>, <code class="codespan">max</code>最小和最大的缩放值，默认的缩放为<code class="codespan">1</code>。</p>
     */
    private ScaleLimit scaleLimit;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.nameMap
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>自定义地区的名称映射，如：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-string">'China'</span> : <span class="hljs-string">'中国'</span>
     * }
     * </code></pre>
     */
    private Object nameMap;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.nameProperty
     * <br/>序号: 12
     * <br/>默认值: name
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.8.0</code> 开始支持</p>
     * </blockquote>
     * <p>默认是 <code class="codespan">'name'</code>，针对 GeoJSON 要素的自定义属性名称，作为主键用于关联数据点和 GeoJSON 地理要素。
     * 例如：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">nameProperty</span>: <span class="hljs-string">'NAME'</span>, <span class="hljs-comment">// 数据点中的 name：Alabama 会关联到 GeoJSON 中 NAME 属性值为 Alabama 的地理要素{"type":"Feature","id":"01","properties":{"NAME":"Alabama"}, "geometry": { ... }}</span>
     *     <span class="hljs-attr">data</span>:[
     *         {<span class="hljs-attr">name</span>: <span class="hljs-string">'Alabama'</span>, <span class="hljs-attr">value</span>: <span class="hljs-number">4822023</span>},
     *         {<span class="hljs-attr">name</span>: <span class="hljs-string">'Alaska'</span>, <span class="hljs-attr">value</span>: <span class="hljs-number">731449</span>},
     *     ]
     * }
     * </code></pre>
     */
    private String nameProperty;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.selectedMode
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>选中模式，表示是否支持多个选中，默认关闭，支持布尔值和字符串，字符串取值可选<code class="codespan">'single'</code>表示单选，或者<code class="codespan">'multiple'</code>表示多选。</p>
     */
    private Object selectedMode;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.label
     * <br/>序号: 14
     * <br/>默认值: 5
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.itemStyle
     * <br/>序号: 15
     * <br/>默认值: #eee
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>地图区域的多边形 图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.emphasis
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态下的多边形和标签样式。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.select
     * <br/>序号: 17
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>选中状态下的多边形和标签样式。</p>
     */
    private Select select;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.zlevel
     * <br/>序号: 18
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.z
     * <br/>序号: 19
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.left
     * <br/>序号: 20
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.top
     * <br/>序号: 21
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.right
     * <br/>序号: 22
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.bottom
     * <br/>序号: 23
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.layoutCenter
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p><code class="codespan">layoutCenter</code> 和 <code class="codespan">layoutSize</code> 提供了除了 <code class="codespan">left/right/top/bottom/width/height</code> 之外的布局手段。</p>
     * <p>在使用 <code class="codespan">left/right/top/bottom/width/height</code> 的时候，可能很难在保持地图高宽比的情况下把地图放在某个盒形区域的正中间，并且保证不超出盒形的范围。此时可以通过 <code class="codespan">layoutCenter</code> 属性定义地图中心在屏幕中的位置，<code class="codespan">layoutSize</code> 定义地图的大小。如下示例</p>
     * <pre><code class="lang-js hljs javascript">layoutCenter: [<span class="hljs-string">'30%'</span>, <span class="hljs-string">'30%'</span>],
     * <span class="hljs-comment">// 如果宽高比大于 1 则宽度为 100，如果小于 1 则高度为 100，保证了不超过 100x100 的区域</span>
     * <span class="hljs-attr">layoutSize</span>: <span class="hljs-number">100</span>
     * </code></pre>
     * <p>设置这两个值后 <code class="codespan">left/right/top/bottom/width/height</code> 无效。</p>
     */
    private List<Object> layoutCenter;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.layoutSize
     * <br/>序号: 25
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>地图的大小，见 <code class="codespan">layoutCenter</code>。支持相对于屏幕宽高的百分比或者绝对的像素大小。</p>
     */
    private Object layoutSize;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.geoIndex
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>默认情况下，map series 会自己生成内部专用的 <code class="codespan">geo</code> 组件。但是也可以用这个 <code class="codespan">geoIndex</code> 指定一个 <a href="#geo">geo</a> 组件。这样的话，map 和 其他 series（例如散点图）就可以共享一个 <a href="#geo">geo</a> 组件了。并且，<a href="#geo">geo</a> 组件的颜色也可以被这个 map series 控制，从而用 <a href="#visualMap">visualMap</a> 来更改。</p>
     * <p>当设定了 <code class="codespan">geoIndex</code> 后，<a href="#series-map.map">series-map.map</a> 属性，以及 <a href="#series-map.itemStyle">series-map.itemStyle</a> 等样式配置不再起作用，而是采用 <a href="#geo">geo</a> 中的相应属性。</p>
     */
    private Integer geoIndex;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.mapValueCalculation
     * <br/>序号: 27
     * <br/>默认值: sum
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>多个拥有相同<a href="#series-map.map">地图类型</a>的系列会使用同一个地图展现，如果多个系列都在同一个区域有值，ECharts 会对这些值统计得到一个数据。这个配置项就是用于配置统计的方式，目前有：</p>
     * <ul>
     * <li><code class="codespan">'sum'</code>   取和。</li>
     * <li><code class="codespan">'average'</code> 取平均值。</li>
     * <li><code class="codespan">'max'</code>   取最大值。</li>
     * <li><code class="codespan">'min'</code>   取最小值。</li>
     * </ul>
     */
    private String mapValueCalculation;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.showLegendSymbol
     * <br/>序号: 28
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>在图例相应区域显示图例的颜色标识（系列标识的小圆点），存在 <a href="#legend">legend</a> 组件时生效。</p>
     */
    private Boolean showLegendSymbol;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.seriesLayoutBy
     * <br/>序号: 29
     * <br/>默认值: column
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>当使用 <a href="#dataset">dataset</a> 时，<code class="codespan">seriesLayoutBy</code> 指定了 <code class="codespan">dataset</code> 中用行还是列对应到系列上，也就是说，系列“排布”到 <code class="codespan">dataset</code> 的行还是列上。可取值：</p>
     * <ul>
     * <li>'column'：默认，<code class="codespan">dataset</code> 的列对应于系列，从而 <code class="codespan">dataset</code> 中每一列是一个维度（dimension）。</li>
     * <li>'row'：<code class="codespan">dataset</code> 的行对应于系列，从而 <code class="codespan">dataset</code> 中每一行是一个维度（dimension）。</li>
     * </ul>
     * <p>参见这个 <a href="https://echarts.apache.org/examples/zh/editor.html?c=dataset-series-layout-by&amp;theme=lite" target="_blank">示例</a></p>
     */
    private String seriesLayoutBy;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.datasetIndex
     * <br/>序号: 30
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果 <a href="#series.data">series.data</a> 没有指定，并且 <a href="#dataset">dataset</a> 存在，那么就会使用 <a href="#dataset">dataset</a>。<code class="codespan">datasetIndex</code> 指定本系列使用那个 <a href="#dataset">dataset</a>。</p>
     */
    private Integer datasetIndex;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.labelLayout
     * <br/>序号: 31
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.labelLine
     * <br/>序号: 32
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.data
     * <br/>序号: 33
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>地图系列中的数据内容数组。数组项可以为单个数值，如：</p>
     * <pre><code class="lang-js hljs javascript">[<span class="hljs-number">12</span>, <span class="hljs-number">34</span>, <span class="hljs-number">56</span>, <span class="hljs-number">10</span>, <span class="hljs-number">23</span>]
     * </code></pre>
     * <p>如果需要在数据中加入其它维度给 <a href="#visualMap">visualMap</a> 组件用来映射到颜色等其它图形属性。每个数据项也可以是数组，如：</p>
     * <pre><code class="lang-js hljs javascript">[[<span class="hljs-number">12</span>, <span class="hljs-number">14</span>], [<span class="hljs-number">34</span>, <span class="hljs-number">50</span>], [<span class="hljs-number">56</span>, <span class="hljs-number">30</span>], [<span class="hljs-number">10</span>, <span class="hljs-number">15</span>], [<span class="hljs-number">23</span>, <span class="hljs-number">10</span>]]
     * </code></pre>
     * <p>这时候可以将每项数组中的第二个值指定给 <a href="#visualMap">visualMap</a> 组件。</p>
     * <p>更多时候我们需要指定每个数据项的名称，这时候需要每个项为一个对象：</p>
     * <pre><code class="lang-js hljs javascript">[{
     *     <span class="hljs-comment">// 数据项的名称</span>
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'数据1'</span>,
     *     <span class="hljs-comment">// 数据项值8</span>
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">10</span>
     * }, {
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'数据2'</span>,
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">20</span>
     * }]
     * </code></pre>
     * <p>需要对个别内容指定进行个性化定义时：</p>
     * <pre><code class="lang-js hljs javascript">[{
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'数据1'</span>,
     *     <span class="hljs-attr">value</span>: <span class="hljs-number">10</span>
     * }, {
     *     <span class="hljs-comment">// 数据项名称</span>
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'数据2'</span>,
     *     <span class="hljs-attr">value</span> : <span class="hljs-number">56</span>,
     *     <span class="hljs-comment">//自定义特殊 tooltip，仅对该数据项有效</span>
     *     <span class="hljs-attr">tooltip</span>:{},
     *     <span class="hljs-comment">//自定义特殊itemStyle，仅对该item有效</span>
     *     <span class="hljs-attr">itemStyle</span>:{}
     * }]
     * </code></pre>
     */
    private List<Object> data;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.markPoint
     * <br/>序号: 34
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标注。</p>
     */
    private Object markPoint;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.markLine
     * <br/>序号: 35
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标线。</p>
     */
    private Object markLine;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.markArea
     * <br/>序号: 36
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。</p>
     */
    private Object markArea;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.silent
     * <br/>序号: 37
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-map.tooltip
     * <br/>序号: 38
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
