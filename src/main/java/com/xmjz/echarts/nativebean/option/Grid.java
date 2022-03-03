package com.xmjz.echarts.nativebean.option;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid">https://echarts.apache.org/zh/option.html#grid</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>直角坐标系内绘图网格，单个 grid 内最多可以放置上下两个 X 轴，左右两个 Y 轴。可以在网格上绘制<a href="#series-line">折线图</a>，<a href="#series-bar">柱状图</a>，<a href="#series-scatter">散点图（气泡图）</a>。</p>
 * <p>在 ECharts 2.x 里单个 echarts 实例中最多只能存在一个 grid 组件，在 ECharts 3 中可以存在任意个 grid 组件。</p>
 * <p><strong>例如下面这个 Anscombe Quartet 的示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=scatter-anscombe-quartet&amp;edit=1&amp;reset=1" width="600" height="400" class="loaded" src="https://echarts.apache.org/examples/zh/view.html?c=scatter-anscombe-quartet&amp;edit=1&amp;reset=1" data-was-processed="true"></iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Grid implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.id">https://echarts.apache.org/zh/option.html#grid.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.show">https://echarts.apache.org/zh/option.html#grid.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示直角坐标系网格。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.zlevel">https://echarts.apache.org/zh/option.html#grid.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.z">https://echarts.apache.org/zh/option.html#grid.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.left">https://echarts.apache.org/zh/option.html#grid.left</a>
     * <br/>默认值: 10%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>grid 组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.top">https://echarts.apache.org/zh/option.html#grid.top</a>
     * <br/>默认值: 60
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>grid 组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.right">https://echarts.apache.org/zh/option.html#grid.right</a>
     * <br/>默认值: 10%
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>grid 组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.bottom">https://echarts.apache.org/zh/option.html#grid.bottom</a>
     * <br/>默认值: 60
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>grid 组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.width">https://echarts.apache.org/zh/option.html#grid.width</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>grid 组件的宽度。默认自适应。</p>
     */
    private Object width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.height">https://echarts.apache.org/zh/option.html#grid.height</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>grid 组件的高度。默认自适应。</p>
     */
    private Object height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.containLabel">https://echarts.apache.org/zh/option.html#grid.containLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>grid 区域是否包含坐标轴的<a href="#yAxis.axisLabel">刻度标签</a>。</p>
     * <ul>
     * <li>containLabel 为 <code class="codespan">false</code> 的时候：<ul>
     * <li><code class="codespan">grid.left</code> <code class="codespan">grid.right</code> <code class="codespan">grid.top</code> <code class="codespan">grid.bottom</code> <code class="codespan">grid.width</code> <code class="codespan">grid.height</code> 决定的是由坐标轴形成的矩形的尺寸和位置。</li>
     * <li>这比较适用于多个 <code class="codespan">grid</code> 进行对齐的场景，因为往往多个 <code class="codespan">grid</code> 对齐的时候，是依据坐标轴来对齐的。</li>
     * </ul>
     * </li>
     * <li>containLabel 为 <code class="codespan">true</code> 的时候：<ul>
     * <li><code class="codespan">grid.left</code> <code class="codespan">grid.right</code> <code class="codespan">grid.top</code> <code class="codespan">grid.bottom</code> <code class="codespan">grid.width</code> <code class="codespan">grid.height</code> 决定的是包括了坐标轴标签在内的所有内容所形成的矩形的位置。</li>
     * <li>这常用于『防止标签溢出』的场景，标签溢出指的是，标签长度动态变化时，可能会溢出容器或者覆盖其他组件。</li>
     * </ul>
     * </li>
     * </ul>
     */
    private Boolean containLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.backgroundColor">https://echarts.apache.org/zh/option.html#grid.backgroundColor</a>
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>网格背景色，默认透明。</p>
     * <blockquote>
     * <p>颜色可以使用 RGB 表示，比如 <code class="codespan">'rgb(128, 128, 128)'</code>   ，如果想要加上 alpha 通道，可以使用 RGBA，比如 <code class="codespan">'rgba(128, 128, 128, 0.5)'</code>，也可以使用十六进制格式，比如 <code class="codespan">'#ccc'</code></p>
     * </blockquote>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code>。</p>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.borderColor">https://echarts.apache.org/zh/option.html#grid.borderColor</a>
     * <br/>默认值: #ccc
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>网格的边框颜色。支持的颜色格式同 backgroundColor。</p>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code>。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.borderWidth">https://echarts.apache.org/zh/option.html#grid.borderWidth</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>网格的边框线宽。</p>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code>。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.shadowBlur">https://echarts.apache.org/zh/option.html#grid.shadowBlur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形阴影的模糊大小。该属性配合 <code class="codespan">shadowColor</code>,<code class="codespan">shadowOffsetX</code>, <code class="codespan">shadowOffsetY</code> 一起设置图形的阴影效果。</p>
     * <p>示例：</p>
     * <pre><code class="lang-ts hljs typescript">{
     *     shadowColor: <span class="hljs-string">'rgba(0, 0, 0, 0.5)'</span>,
     *     shadowBlur: <span class="hljs-number">10</span>
     * }
     * </code></pre>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code> 以及值不为 <code class="codespan">tranparent</code> 的背景色 <code class="codespan">backgroundColor</code>。</p>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.shadowColor">https://echarts.apache.org/zh/option.html#grid.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.shadowOffsetX">https://echarts.apache.org/zh/option.html#grid.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code>。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.shadowOffsetY">https://echarts.apache.org/zh/option.html#grid.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code>。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#grid.tooltip">https://echarts.apache.org/zh/option.html#grid.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本坐标系特定的 tooltip 设定。</p>
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
     */
    private Object tooltip;
}
