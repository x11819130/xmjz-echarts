package com.xmjz.echarts.nativebean.option.customSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem">https://echarts.apache.org/zh/option.html#series-custom.renderItem</a>
 * <br/>序号: 11
 * <br/>默认值: 无
 * <br/>js类型: ["Function"]
 * <br/>描述:
 * <p>custom 系列需要开发者自己提供图形渲染的逻辑。这个渲染逻辑一般命名为 <a href="#series-custom.renderItem">renderItem</a>。例如：</p>
 * <pre><code class="lang-js hljs javascript"><span class="hljs-keyword">var</span> option = {
 *     ...,
 *     <span class="hljs-attr">series</span>: [{
 *         <span class="hljs-attr">type</span>: <span class="hljs-string">'custom'</span>,
 *         <span class="hljs-attr">renderItem</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">params, api</span>) </span>{
 *             <span class="hljs-keyword">var</span> categoryIndex = api.value(<span class="hljs-number">0</span>);
 *             <span class="hljs-keyword">var</span> start = api.coord([api.value(<span class="hljs-number">1</span>), categoryIndex]);
 *             <span class="hljs-keyword">var</span> end = api.coord([api.value(<span class="hljs-number">2</span>), categoryIndex]);
 *             <span class="hljs-keyword">var</span> height = api.size([<span class="hljs-number">0</span>, <span class="hljs-number">1</span>])[<span class="hljs-number">1</span>] * <span class="hljs-number">0.6</span>;
 *
 *             <span class="hljs-keyword">var</span> rectShape = echarts.graphic.clipRectByRect({
 *                 <span class="hljs-attr">x</span>: start[<span class="hljs-number">0</span>],
 *                 <span class="hljs-attr">y</span>: start[<span class="hljs-number">1</span>] - height / <span class="hljs-number">2</span>,
 *                 <span class="hljs-attr">width</span>: end[<span class="hljs-number">0</span>] - start[<span class="hljs-number">0</span>],
 *                 <span class="hljs-attr">height</span>: height
 *             }, {
 *                 <span class="hljs-attr">x</span>: params.coordSys.x,
 *                 <span class="hljs-attr">y</span>: params.coordSys.y,
 *                 <span class="hljs-attr">width</span>: params.coordSys.width,
 *                 <span class="hljs-attr">height</span>: params.coordSys.height
 *             });
 *
 *             <span class="hljs-keyword">return</span> rectShape &amp;&amp; {
 *                 <span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>,
 *                 <span class="hljs-attr">shape</span>: rectShape,
 *                 <span class="hljs-attr">style</span>: api.style()
 *             };
 *         },
 *         <span class="hljs-attr">data</span>: data
 *     }]
 * }
 * </code></pre>
 * <p>对于 <code class="codespan">data</code> 中的每个数据项（为方便描述，这里称为 <code class="codespan">dataItem</code>)，会调用此 <a href="#series-custom.renderItem">renderItem</a> 函数。</p>
 * <p><a href="#series-custom.renderItem">renderItem</a> 函数提供了两个参数：</p>
 * <ul>
 * <li><a href="#series-custom.renderItem.arguments.params">params</a>：包含了当前数据信息和坐标系的信息。</li>
 * <li><a href="#series-custom.renderItem.arguments.api">api</a>：是一些开发者可调用的方法集合。</li>
 * </ul>
 * <p><a href="#series-custom.renderItem">renderItem</a> 函数须返回根据此 <code class="codespan">dataItem</code> 绘制出的图形元素的定义信息，参见 <a href="#series-custom.renderItem.return">renderItem.return</a>。</p>
 * <p>一般来说，<a href="#series-custom.renderItem">renderItem</a> 函数的主要逻辑，是将 <code class="codespan">dataItem</code> 里的值映射到坐标系上的图形元素。这一般需要用到 <a href="#series-custom.renderItem.arguments.api">renderItem.arguments.api</a> 中的两个函数：</p>
 * <ul>
 * <li><a href="#series-custom.renderItem.arguments.api.value">api.value(...)</a>，意思是取出 <code class="codespan">dataItem</code> 中的数值。例如 <code class="codespan">api.value(0)</code> 表示取出当前 <code class="codespan">dataItem</code> 中第一个维度的数值。</li>
 * <li><a href="#series-custom.renderItem.arguments.api.coord">api.coord(...)</a>，意思是进行坐标转换计算。例如 <code class="codespan">var point = api.coord([api.value(0), api.value(1)])</code> 表示 <code class="codespan">dataItem</code> 中的数值转换成坐标系上的点。</li>
 * </ul>
 * <p>有时候还需要用到 <a href="#series-custom.renderItem.arguments.api.size">api.size(...)</a> 函数，表示得到坐标系上一段数值范围对应的长度。</p>
 * <p>返回值中样式的设置可以使用 <a href="#series-custom.renderItem.arguments.api.style">api.style(...)</a> 函数，他能得到 <a href="#series-custom.itemStyle">series.itemStyle</a> 中定义的样式信息，以及视觉映射的样式信息。也可以用这种方式覆盖这些样式信息：<code class="codespan">api.style({fill: 'green', stroke: 'yellow'})</code>。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class RenderItem implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.arguments">https://echarts.apache.org/zh/option.html#series-custom.renderItem.arguments</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>renderItem 函数的参数。</p>
     */
    private Object arguments;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形元素。每个图形元素是一个 object。详细信息参见：<a href="#graphic.elements">graphic</a>。（width\height\top\bottom 不支持）</p>
     * <p>如果什么都不渲染，可以不返回任何东西。</p>
     * <p>例如：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 单独一个矩形</span>
     * {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>,
     *     <span class="hljs-attr">shape</span>: {
     *         <span class="hljs-attr">x</span>: x, <span class="hljs-attr">y</span>: y, <span class="hljs-attr">width</span>: width, <span class="hljs-attr">height</span>: height
     *     },
     *     <span class="hljs-attr">style</span>: api.style()
     * }
     * </code></pre>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 一组图形元素</span>
     * {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'group'</span>,
     *     <span class="hljs-comment">// 如果 diffChildrenByName 设为 true，则会使用 child.name 进行 diff，</span>
     *     <span class="hljs-comment">// 从而能有更好的过度动画，但是降低性能。缺省为 false。</span>
     *     <span class="hljs-comment">// diffChildrenByName: true,</span>
     *     <span class="hljs-attr">children</span>: [{
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'circle'</span>,
     *         <span class="hljs-attr">shape</span>: {
     *             <span class="hljs-attr">cx</span>: cx, <span class="hljs-attr">cy</span>: cy, <span class="hljs-attr">r</span>: r
     *         },
     *         <span class="hljs-attr">style</span>: api.style()
     *     }, {
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'line'</span>,
     *         <span class="hljs-attr">shape</span>: {
     *             <span class="hljs-attr">x1</span>: x1, <span class="hljs-attr">y1</span>: y1, <span class="hljs-attr">x2</span>: x2, <span class="hljs-attr">y2</span>: y2
     *         },
     *         <span class="hljs-attr">style</span>: api.style()
     *     }]
     * }
     * </code></pre>
     */
    private Object return_;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_group">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_group</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>group 是唯一的可以有子节点的容器。group 可以用来整体定位一组图形元素。</p>
     */
    private Object return_group;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_path">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_path</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>可使用 <a href="http://www.w3.org/TR/SVG/paths.html#PathData" target="_blank">SVG PathData</a> 做路径。
     * 可以用来画图标，或者其他各种图形，因为可以很便捷得缩放以适应给定尺寸。</p>
     * <p>参见例子：
     * <a href="https://echarts.apache.org/examples/zh/editor.html?c=custom-calendar-icon" target="_blank">icons</a> 和 <a href="https://echarts.apache.org/examples/zh/editor.html?c=custom-gantt-flight" target="_blank">shapes</a>。</p>
     * <p>关于制定尺寸、拉伸还是平铺，参见 <a href="#series-custom.renderItem.return_path.shape.layout">layout</a>。</p>
     */
    private Object return_path;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_image">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_image</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object return_image;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_text">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_text</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>文本块。</p>
     */
    private Object return_text;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_rect">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_rect</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>矩形。</p>
     */
    private Object return_rect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_circle">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_circle</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>圆。</p>
     */
    private Object return_circle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_ring">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_ring</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>圆环。</p>
     */
    private Object return_ring;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_sector">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_sector</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>扇形。</p>
     */
    private Object return_sector;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_arc">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_arc</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>圆弧。</p>
     */
    private Object return_arc;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_polygon">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_polygon</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>多边形。</p>
     */
    private Object return_polygon;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_polyline">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_polyline</a>
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>折线。</p>
     */
    private Object return_polyline;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_line">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_line</a>
     * <br/>序号: 14
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>直线。</p>
     */
    private Object return_line;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_bezierCurve">https://echarts.apache.org/zh/option.html#series-custom.renderItem.return_bezierCurve</a>
     * <br/>序号: 15
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>二次或三次贝塞尔曲线。</p>
     */
    private Object return_bezierCurve;
}
