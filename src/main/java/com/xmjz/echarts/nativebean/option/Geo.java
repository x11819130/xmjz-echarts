package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.geo.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo">https://echarts.apache.org/zh/option.html#geo</a>
 * <br/>序号: 16
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
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.show">https://echarts.apache.org/zh/option.html#geo.show</a>
     * <br/>序号: 2
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示地理坐标系组件。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.map">https://echarts.apache.org/zh/option.html#geo.map</a>
     * <br/>序号: 3
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.roam">https://echarts.apache.org/zh/option.html#geo.roam</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>是否开启鼠标缩放和平移漫游。默认不开启。如果只想要开启缩放或者平移，可以设置成 <code class="codespan">'scale'</code> 或者 <code class="codespan">'move'</code>。设置成 <code class="codespan">true</code> 为都开启</p>
     */
    private Object roam;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.center">https://echarts.apache.org/zh/option.html#geo.center</a>
     * <br/>序号: 5
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
     * <br/>序号: 6
     * <br/>默认值: 0.75
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>这个参数用于 scale 地图的长宽比。</p>
     * <p>最终的 <code class="codespan">aspect</code> 的计算方式是：<code class="codespan">geoBoundingRect.width / geoBoundingRect.height * aspectScale</code></p>
     */
    private Integer aspectScale;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.boundingCoords">https://echarts.apache.org/zh/option.html#geo.boundingCoords</a>
     * <br/>序号: 7
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
     * <br/>序号: 8
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前视角的缩放比例。</p>
     */
    private Integer zoom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.scaleLimit">https://echarts.apache.org/zh/option.html#geo.scaleLimit</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>滚轮缩放的极限控制，通过<code class="codespan">min</code>, <code class="codespan">max</code>最小和最大的缩放值，默认的缩放为<code class="codespan">1</code>。</p>
     */
    private ScaleLimit scaleLimit;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.nameMap">https://echarts.apache.org/zh/option.html#geo.nameMap</a>
     * <br/>序号: 10
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
     * <br/>序号: 11
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
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","string"]
     * <br/>描述:
     * <p>选中模式，表示是否支持多个选中，默认关闭，支持布尔值和字符串，字符串取值可选<code class="codespan">'single'</code>表示单选，或者<code class="codespan">'multiple'</code>表示多选。</p>
     */
    private Object selectedMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.label">https://echarts.apache.org/zh/option.html#geo.label</a>
     * <br/>序号: 13
     * <br/>默认值: 5
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.itemStyle">https://echarts.apache.org/zh/option.html#geo.itemStyle</a>
     * <br/>序号: 14
     * <br/>默认值: #eee
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>地图区域的多边形 图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.emphasis">https://echarts.apache.org/zh/option.html#geo.emphasis</a>
     * <br/>序号: 15
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态下的多边形和标签样式。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.select">https://echarts.apache.org/zh/option.html#geo.select</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>选中状态下的多边形和标签样式。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.zlevel">https://echarts.apache.org/zh/option.html#geo.zlevel</a>
     * <br/>序号: 17
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
     * <br/>序号: 18
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.left">https://echarts.apache.org/zh/option.html#geo.left</a>
     * <br/>序号: 19
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
     * <br/>序号: 20
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
     * <br/>序号: 21
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
     * <br/>序号: 22
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
     * <br/>序号: 23
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
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>地图的大小，见 <code class="codespan">layoutCenter</code>。支持相对于屏幕宽高的百分比或者绝对的像素大小。</p>
     */
    private Object layoutSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.regions">https://echarts.apache.org/zh/option.html#geo.regions</a>
     * <br/>序号: 25
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
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
}
