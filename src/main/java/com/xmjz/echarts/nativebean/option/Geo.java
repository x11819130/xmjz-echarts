package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.geo.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo">https://echarts.apache.org/zh/option.html#geo</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>地理坐标系组件。</p>
 * <p>地理坐标系组件用于地图的绘制，支持在地理坐标系上绘制<a href="#series-scatter">散点图</a>，<a href="#series-lines">线集</a>。</p>
 * <p><code class="codespan">3.1.10</code> 开始 geo 组件也支持鼠标事件。事件参数为</p>
 * <pre><code class="lang-js hljs javascript">{
 *     <span class="hljs-attr">componentType</span>: <span class="hljs-string">'geo'</span>,
 *     <span class="hljs-comment">// Geo 组件在 option 中的 index</span>
 *     <span class="hljs-attr">geoIndex</span>: number,
 *     <span class="hljs-comment">// 点击区域的名称，比如"上海"</span>
 *     <span class="hljs-attr">name</span>: string,
 *     <span class="hljs-comment">// 传入的点击区域的 region 对象，见 geo.regions</span>
 *     <span class="hljs-attr">region</span>: <span class="hljs-built_in">Object</span>
 * }
 * </code></pre>
 * <p><strong>Tip:</strong>
 * geo 区域的颜色也可以被 map series 所控制，参见 <a href="#series-map.geoIndex">series-map.geoIndex</a>。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Geo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.id">https://echarts.apache.org/zh/option.html#geo.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.show">https://echarts.apache.org/zh/option.html#geo.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示地理坐标系组件。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.map">https://echarts.apache.org/zh/option.html#geo.map</a>
     * <br/>默认值:
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>使用 <a href="api.html#echarts.registerMap" target="_blank">registerMap</a> 注册的地图名称。</p>
     * <p><strong>geoJSON 引入示例</strong></p>
     * <pre><code class="lang-js hljs javascript">$.<span class="hljs-keyword">get</span>('map/china_geo.json', function (chinaJson) {
     *     echarts.registerMap(<span class="hljs-string">'china'</span>, {<span class="hljs-attr">geoJSON</span>: geoJson});
     *     <span class="hljs-keyword">var</span> chart = echarts.init(<span class="hljs-built_in">document</span>.getElementById(<span class="hljs-string">'main'</span>));
     *     chart.setOption({
     *         <span class="hljs-attr">geo</span>: [{
     *             <span class="hljs-attr">map</span>: <span class="hljs-string">'china'</span>,
     *             ...
     *         }]
     *     });
     * });
     * </code></pre>
     * <p>也参见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=custom-hexbin" target="_blank">geoJSON hexbin</a>。</p>
     * <p>如上所示，ECharts 可以使用 <a href="http://geojson.org/" target="_blank">GeoJSON</a> 格式的数据作为地图的轮廓，你可以获取第三方的 <a href="http://geojson.org/" target="_blank">GeoJSON</a> 数据注册到 ECharts 中。例如第三方资源 <a href="https://github.com/echarts-maps" target="_blank">maps</a>。</p>
     * <p><strong>SVG 引入示例</strong></p>
     * <pre><code class="lang-js hljs javascript">$.<span class="hljs-keyword">get</span>('map/topographic_map.svg', function (svg) {
     *     echarts.registerMap(<span class="hljs-string">'topo'</span>, {<span class="hljs-attr">svg</span>: svg});
     *     <span class="hljs-keyword">var</span> chart = echarts.init(<span class="hljs-built_in">document</span>.getElementById(<span class="hljs-string">'main'</span>));
     *     chart.setOption({
     *         <span class="hljs-attr">geo</span>: [{
     *             <span class="hljs-attr">map</span>: <span class="hljs-string">'topo'</span>,
     *             ...
     *         }]
     *     });
     * });
     * </code></pre>
     * <p>也参见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=geo-seatmap-flight" target="_blank">Flight Seatmap</a>。</p>
     * <p>如上所示，ECharts 也可以使用 SVG 格式的地图。详情参见：<a href="tutorial.html#%E5%9C%B0%E7%90%86%E5%9D%90%E6%A0%87%E7%B3%BB%E5%92%8C%E5%9C%B0%E5%9B%BE%E7%B3%BB%E5%88%97%E7%9A%84%20SVG%20%E5%BA%95%E5%9B%BE" target="_blank">SVG 底图</a>。</p>
     */
    private String map;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.roam">https://echarts.apache.org/zh/option.html#geo.roam</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>是否开启鼠标缩放和平移漫游。默认不开启。如果只想要开启缩放或者平移，可以设置成 <code class="codespan">'scale'</code> 或者 <code class="codespan">'move'</code>。设置成 <code class="codespan">true</code> 为都开启</p>
     */
    private Object roam;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.center">https://echarts.apache.org/zh/option.html#geo.center</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.aspectScale">https://echarts.apache.org/zh/option.html#geo.aspectScale</a>
     * <br/>默认值: 0.75
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>这个参数用于 scale 地图的长宽比。</p>
     * <p>最终的 <code class="codespan">aspect</code> 的计算方式是：<code class="codespan">geoBoundingRect.width / geoBoundingRect.height * aspectScale</code></p>
     */
    private Integer aspectScale;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.boundingCoords">https://echarts.apache.org/zh/option.html#geo.boundingCoords</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.zoom">https://echarts.apache.org/zh/option.html#geo.zoom</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前视角的缩放比例。</p>
     */
    private Integer zoom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.scaleLimit">https://echarts.apache.org/zh/option.html#geo.scaleLimit</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>滚轮缩放的极限控制，通过<code class="codespan">min</code>, <code class="codespan">max</code>最小和最大的缩放值，默认的缩放为<code class="codespan">1</code>。</p>
     */
    private ScaleLimit scaleLimit;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.nameMap">https://echarts.apache.org/zh/option.html#geo.nameMap</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.nameProperty">https://echarts.apache.org/zh/option.html#geo.nameProperty</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.selectedMode">https://echarts.apache.org/zh/option.html#geo.selectedMode</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>选中模式，表示是否支持多个选中，默认关闭，支持布尔值和字符串，字符串取值可选<code class="codespan">'single'</code>表示单选，或者<code class="codespan">'multiple'</code>表示多选。</p>
     */
    private Object selectedMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.label">https://echarts.apache.org/zh/option.html#geo.label</a>
     * <br/>默认值: 5
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.itemStyle">https://echarts.apache.org/zh/option.html#geo.itemStyle</a>
     * <br/>默认值: #eee
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>地图区域的多边形 图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.emphasis">https://echarts.apache.org/zh/option.html#geo.emphasis</a>
     * <br/>默认值: none
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态下的多边形和标签样式。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.select">https://echarts.apache.org/zh/option.html#geo.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>选中状态下的多边形和标签样式。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.blur">https://echarts.apache.org/zh/option.html#geo.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.1.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出状态下的多边形和标签样式。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.zlevel">https://echarts.apache.org/zh/option.html#geo.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.z">https://echarts.apache.org/zh/option.html#geo.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.left">https://echarts.apache.org/zh/option.html#geo.left</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.top">https://echarts.apache.org/zh/option.html#geo.top</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.right">https://echarts.apache.org/zh/option.html#geo.right</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.bottom">https://echarts.apache.org/zh/option.html#geo.bottom</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.layoutCenter">https://echarts.apache.org/zh/option.html#geo.layoutCenter</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.layoutSize">https://echarts.apache.org/zh/option.html#geo.layoutSize</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>地图的大小，见 <code class="codespan">layoutCenter</code>。支持相对于屏幕宽高的百分比或者绝对的像素大小。</p>
     */
    private Object layoutSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.regions">https://echarts.apache.org/zh/option.html#geo.regions</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>在地图中对特定的区域配置样式。</p>
     * <p>例如：</p>
     * <pre><code class="lang-js hljs javascript">regions: [{
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'广东'</span>,
     *     <span class="hljs-attr">itemStyle</span>: {
     *         <span class="hljs-attr">areaColor</span>: <span class="hljs-string">'red'</span>,
     *         <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>
     *     }
     * }]
     * </code></pre>
     * <p>geo 区域的颜色也可以被 map series 所控制，参见 <a href="#series-map.geoIndex">series-map.geoIndex</a>。</p>
     */
    private List<Regions> regions;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.silent">https://echarts.apache.org/zh/option.html#geo.silent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.tooltip">https://echarts.apache.org/zh/option.html#geo.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.1.0</code> 开始支持</p>
     * </blockquote>
     * <p>本坐标系特定的 tooltip 设定。</p>
     * <hr>
     * <p><strong>提示框组件的通用介绍：</strong></p>
     * <p>提示框组件可以设置在多种地方：</p>
     * <ul>
     * <li><p>可以设置在全局，即 <a href="#tooltip">tooltip</a></p>
     * </li>
     * <li><p>可以设置在坐标系中，即 <a href="#grid.tooltip">grid.tooltip</a>、<a href="#polar.tooltip">polar.tooltip</a>、<a href="#single.tooltip">single.tooltip</a></p>
     * </li>
     * <li><p>可以设置在系列中，即 <a href="#series.tooltip">series.tooltip</a></p>
     * </li>
     * <li><p>可以设置在系列的每个数据项中，即 <a href="#series.data.tooltip">series.data.tooltip</a></p>
     * </li>
     * </ul>
     * <hr>
     */
    private Object tooltip;
}
