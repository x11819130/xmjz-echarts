package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.mapSeries.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map">https://echarts.apache.org/zh/option.html#series-map</a>
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>地图。</strong></p>
 * <p>地图主要用于地理区域数据的可视化，配合 <a href="#visualMap">visualMap</a> 组件用于展示不同区域的人口分布密度等数据。</p>
 * <p>多个<a href="#series-map.map">地图类型</a>相同的系列会在同一地图上显示，这时候使用第一个系列的配置项作为地图绘制的配置。</p>
 * <p><strong>Tip: </strong>在 ECharts 3 中不再建议在地图类型的图表使用 <code class="codespan">markLine</code> 和 <code class="codespan">markPoint</code>。如果要实现点数据或者线数据的可视化，可以使用在<a href="#geo">地理坐标系组件</a>上的<a href="#series-scatter">散点图</a>和<a href="#series-lines">线图</a>。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class MapSeries extends Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.type">https://echarts.apache.org/zh/option.html#series-map.type</a>
     * <br/>默认值: map
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.id">https://echarts.apache.org/zh/option.html#series-map.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.name">https://echarts.apache.org/zh/option.html#series-map.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>系列名称，用于<a href="#tooltip">tooltip</a>的显示，<a href="#legend">legend</a> 的图例筛选，在 <code class="codespan">setOption</code> 更新数据和配置项时用于指定对应的系列。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.colorBy">https://echarts.apache.org/zh/option.html#series-map.colorBy</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.map">https://echarts.apache.org/zh/option.html#series-map.map</a>
     * <br/>默认值:
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>使用 <a href="api.html#echarts.registerMap" target="_blank">registerMap</a> 注册的地图名称。</p>
     * <p><strong>geoJSON 引入示例</strong></p>
     * <pre><code class="lang-js hljs javascript">$.<span class="hljs-keyword">get</span>('map/china_geo.json', function (geoJson) {
     *     echarts.registerMap(<span class="hljs-string">'china'</span>, {<span class="hljs-attr">geoJSON</span>: geoJson});
     *     <span class="hljs-keyword">var</span> chart = echarts.init(<span class="hljs-built_in">document</span>.getElementById(<span class="hljs-string">'main'</span>));
     *     chart.setOption({
     *         <span class="hljs-attr">series</span>: [{
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'map'</span>,
     *             <span class="hljs-attr">map</span>: <span class="hljs-string">'china'</span>,
     *             ...
     *         }]
     *     });
     * });
     * </code></pre>
     * <p>也参见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=map-usa" target="_blank">USA Population Estimates</a>。</p>
     * <p>如上所示，ECharts 可以使用 <a href="http://geojson.org/" target="_blank">GeoJSON</a> 格式的数据作为地图的轮廓，你可以获取第三方的 <a href="http://geojson.org/" target="_blank">GeoJSON</a> 数据注册到 ECharts 中。例如第三方资源 <a href="https://github.com/echarts-maps" target="_blank">maps</a>。</p>
     * <p><strong>SVG 引入示例</strong></p>
     * <pre><code class="lang-js hljs javascript">$.<span class="hljs-keyword">get</span>('map/topographic_map.svg', function (svg) {
     *     echarts.registerMap(<span class="hljs-string">'topo'</span>, {<span class="hljs-attr">svg</span>: svg});
     *     <span class="hljs-keyword">var</span> chart = echarts.init(<span class="hljs-built_in">document</span>.getElementById(<span class="hljs-string">'main'</span>));
     *     chart.setOption({
     *         <span class="hljs-attr">series</span>: [{
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'map'</span>,
     *             <span class="hljs-attr">map</span>: <span class="hljs-string">'topo'</span>,
     *             ...
     *         }]
     *     });
     * });
     * </code></pre>
     * <p>也参见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=geo-beef-cuts" target="_blank">Beef Cuts</a>。</p>
     * <p>如上所示，ECharts 也可以使用 SVG 格式的地图。详情参见：<a href="tutorial.html#%E5%9C%B0%E7%90%86%E5%9D%90%E6%A0%87%E7%B3%BB%E5%92%8C%E5%9C%B0%E5%9B%BE%E7%B3%BB%E5%88%97%E7%9A%84%20SVG%20%E5%BA%95%E5%9B%BE" target="_blank">SVG 底图</a>。</p>
     */
    private String map;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.roam">https://echarts.apache.org/zh/option.html#series-map.roam</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>是否开启鼠标缩放和平移漫游。默认不开启。如果只想要开启缩放或者平移，可以设置成 <code class="codespan">'scale'</code> 或者 <code class="codespan">'move'</code>。设置成 <code class="codespan">true</code> 为都开启</p>
     */
    private Object roam;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.center">https://echarts.apache.org/zh/option.html#series-map.center</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>当前视角的中心点，用经纬度表示</p>
     * <p>例如：</p>
     * <pre><code class="lang-js hljs javascript">center: [<span class="hljs-number">115.97</span>, <span class="hljs-number">29.71</span>]
     * </code></pre>
     */
    private List<?> center;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.aspectScale">https://echarts.apache.org/zh/option.html#series-map.aspectScale</a>
     * <br/>默认值: 0.75
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>这个参数用于 scale 地图的长宽比。</p>
     * <p>最终的 <code class="codespan">aspect</code> 的计算方式是：<code class="codespan">geoBoundingRect.width / geoBoundingRect.height * aspectScale</code></p>
     */
    private Integer aspectScale;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.boundingCoords">https://echarts.apache.org/zh/option.html#series-map.boundingCoords</a>
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
    private List<?> boundingCoords;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.zoom">https://echarts.apache.org/zh/option.html#series-map.zoom</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前视角的缩放比例。</p>
     */
    private Integer zoom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.scaleLimit">https://echarts.apache.org/zh/option.html#series-map.scaleLimit</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>滚轮缩放的极限控制，通过<code class="codespan">min</code>, <code class="codespan">max</code>最小和最大的缩放值，默认的缩放为<code class="codespan">1</code>。</p>
     */
    private ScaleLimit scaleLimit;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.nameMap">https://echarts.apache.org/zh/option.html#series-map.nameMap</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.nameProperty">https://echarts.apache.org/zh/option.html#series-map.nameProperty</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.selectedMode">https://echarts.apache.org/zh/option.html#series-map.selectedMode</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>选中模式，表示是否支持多个选中，默认关闭，支持布尔值和字符串，字符串取值可选<code class="codespan">'single'</code>表示单选，或者<code class="codespan">'multiple'</code>表示多选。</p>
     */
    private Object selectedMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.label">https://echarts.apache.org/zh/option.html#series-map.label</a>
     * <br/>默认值: 5
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.itemStyle">https://echarts.apache.org/zh/option.html#series-map.itemStyle</a>
     * <br/>默认值: #eee
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>地图区域的多边形 图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.emphasis">https://echarts.apache.org/zh/option.html#series-map.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态下的多边形和标签样式。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.select">https://echarts.apache.org/zh/option.html#series-map.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>选中状态下的多边形和标签样式。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.zlevel">https://echarts.apache.org/zh/option.html#series-map.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.z">https://echarts.apache.org/zh/option.html#series-map.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.left">https://echarts.apache.org/zh/option.html#series-map.left</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.top">https://echarts.apache.org/zh/option.html#series-map.top</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.right">https://echarts.apache.org/zh/option.html#series-map.right</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.bottom">https://echarts.apache.org/zh/option.html#series-map.bottom</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.layoutCenter">https://echarts.apache.org/zh/option.html#series-map.layoutCenter</a>
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
    private List<?> layoutCenter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.layoutSize">https://echarts.apache.org/zh/option.html#series-map.layoutSize</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>地图的大小，见 <code class="codespan">layoutCenter</code>。支持相对于屏幕宽高的百分比或者绝对的像素大小。</p>
     */
    private Object layoutSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.geoIndex">https://echarts.apache.org/zh/option.html#series-map.geoIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>默认情况下，map series 会自己生成内部专用的 <code class="codespan">geo</code> 组件。但是也可以用这个 <code class="codespan">geoIndex</code> 指定一个 <a href="#geo">geo</a> 组件。这样的话，map 和 其他 series（例如散点图）就可以共享一个 <a href="#geo">geo</a> 组件了。并且，<a href="#geo">geo</a> 组件的颜色也可以被这个 map series 控制，从而用 <a href="#visualMap">visualMap</a> 来更改。</p>
     * <p>当设定了 <code class="codespan">geoIndex</code> 后，<a href="#series-map.map">series-map.map</a> 属性，以及 <a href="#series-map.itemStyle">series-map.itemStyle</a> 等样式配置不再起作用，而是采用 <a href="#geo">geo</a> 中的相应属性。</p>
     */
    private Integer geoIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.mapValueCalculation">https://echarts.apache.org/zh/option.html#series-map.mapValueCalculation</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.showLegendSymbol">https://echarts.apache.org/zh/option.html#series-map.showLegendSymbol</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>在图例相应区域显示图例的颜色标识（系列标识的小圆点），存在 <a href="#legend">legend</a> 组件时生效。</p>
     */
    private Boolean showLegendSymbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.seriesLayoutBy">https://echarts.apache.org/zh/option.html#series-map.seriesLayoutBy</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.datasetIndex">https://echarts.apache.org/zh/option.html#series-map.datasetIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果 <a href="#series.data">series.data</a> 没有指定，并且 <a href="#dataset">dataset</a> 存在，那么就会使用 <a href="#dataset">dataset</a>。<code class="codespan">datasetIndex</code> 指定本系列使用那个 <a href="#dataset">dataset</a>。</p>
     */
    private Integer datasetIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.dataGroupId">https://echarts.apache.org/zh/option.html#series-map.dataGroupId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该系列所有数据共有的组 ID。组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画。</p>
     * <p>如果你使用了<a href="#dataset">dataset</a>组件来表达数据，推荐使用<code class="codespan">encode.itemGroupID</code>来指定哪个维度被编码为组 ID。</p>
     */
    private String dataGroupId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.labelLayout">https://echarts.apache.org/zh/option.html#series-map.labelLayout</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.labelLine">https://echarts.apache.org/zh/option.html#series-map.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.data">https://echarts.apache.org/zh/option.html#series-map.data</a>
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
    private List<?> data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markPoint">https://echarts.apache.org/zh/option.html#series-map.markPoint</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标注。</p>
     */
    private Object markPoint;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markLine">https://echarts.apache.org/zh/option.html#series-map.markLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标线。</p>
     */
    private Object markLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea">https://echarts.apache.org/zh/option.html#series-map.markArea</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。</p>
     */
    private Object markArea;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.silent">https://echarts.apache.org/zh/option.html#series-map.silent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.universalTransition">https://echarts.apache.org/zh/option.html#series-map.universalTransition</a>
     * <br/>默认值: 无
     * <br/>js类型: ["object"]
     * <br/>描述:
     * <p>全局过渡动画相关的配置。</p>
     * <p>全局过渡动画（Universal Transition）提供了任意系列之间进行变形动画的功能。开启该功能后，每次<code class="codespan">setOption</code>，相同<code class="codespan">id</code>的系列之间会自动关联进行动画的过渡，更细粒度的关联配置见<code class="codespan">universalTransition.seriesKey</code>配置。</p>
     * <p>通过配置<code class="codespan">encode.itemGroupId</code>或者<code class="codespan">dataGroupId</code>等指定数据的分组，还可以实现诸如下钻，聚合等一对多或者多对一的动画。</p>
     * <p>可以直接在系列中配置 <code class="codespan">universalTransition: true</code> 开启该功能。也可以提供一个对象进行更多属性的配置。</p>
     */
    private UniversalTransition universalTransition;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.tooltip">https://echarts.apache.org/zh/option.html#series-map.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
