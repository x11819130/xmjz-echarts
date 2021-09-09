package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.tooltip.AxisPointer;
import com.xmjz.echarts.nativebean.option.tooltip.TextStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip">https://echarts.apache.org/zh/option.html#tooltip</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>提示框组件。</p>
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
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Tooltip implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.show">https://echarts.apache.org/zh/option.html#tooltip.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示提示框组件。</p>
     * <p>包括提示框浮层和 <a href="#tooltip.axisPointer">axisPointer</a>。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.trigger">https://echarts.apache.org/zh/option.html#tooltip.trigger</a>
     * <br/>默认值: item
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>触发类型。</p>
     * <p>可选：</p>
     * <ul>
     * <li><p><code class="codespan">'item'</code></p>
     * <p>  数据项图形触发，主要在散点图，饼图等无类目轴的图表中使用。</p>
     * </li>
     * <li><p><code class="codespan">'axis'</code></p>
     * <p>  坐标轴触发，主要在柱状图，折线图等会使用类目轴的图表中使用。</p>
     * <p>  在 ECharts 2.x 中只支持类目轴上使用 axis trigger，在 ECharts 3 中支持在<a href="#grid">直角坐标系</a>和<a href="#polar">极坐标系</a>上的所有类型的轴。并且可以通过 <a href="#tooltip.axisPointer.axis">axisPointer.axis</a> 指定坐标轴。</p>
     * </li>
     * <li><p><code class="codespan">'none'</code></p>
     * <p>  什么都不触发。</p>
     * </li>
     * </ul>
     */
    private String trigger;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer">https://echarts.apache.org/zh/option.html#tooltip.axisPointer</a>
     * <br/>默认值: line
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴指示器配置项。</p>
     * <p><code class="codespan">tooltip.axisPointer</code> 是配置坐标轴指示器的快捷方式。实际上坐标轴指示器的全部功能，都可以通过轴上的 axisPointer 配置项完成（例如 <a href="#xAxis.axisPointer">xAxis.axisPointer</a> 或 <a href="#angleAxis.axisPointer">angleAxis.axisPointer</a>）。但是使用 <code class="codespan">tooltip.axisPointer</code> 在简单场景下会更方便一些。</p>
     * <blockquote>
     * <p><strong>注意：</strong> <code class="codespan">tooltip.axisPointer</code> 中诸配置项的优先级低于轴上的 axisPointer 的配置项。</p>
     * </blockquote>
     * <hr>
     * <p>坐标轴指示器是指示坐标轴当前刻度的工具。</p>
     * <p>如下例，鼠标悬浮到图上，可以出现标线和刻度文本。</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/candlestick-axisPointer&amp;edit=1&amp;reset=1" width="600" height="450"></iframe>
     *
     *
     * <p>上例中，使用了 <a href="#axisPointer.link">axisPointer.link</a> 来关联不同的坐标系中的 axisPointer。</p>
     * <p>坐标轴指示器也有适合触屏的交互方式，如下：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-tooltip-touch&amp;edit=1&amp;reset=1" width="600" height="400"></iframe>
     *
     *
     * <p>坐标轴指示器在多轴的场景能起到辅助作用：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=multiple-y-axis&amp;edit=1&amp;reset=1" width="600" height="300"></iframe>
     * <p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=multiple-x-axis&amp;edit=1&amp;reset=1" width="600" height="300"></iframe>
     *
     *
     *
     *
     * <hr>
     * <blockquote>
     * <p><strong>注意：</strong>
     * 一般来说，axisPointer 的具体配置项会配置在各个轴中（如 <a href="#xAxis.axisPointer">xAxis.axisPointer</a>）或者 <code class="codespan">tooltip</code> 中（如 <a href="#tooltip.axisPointer">tooltip.axisPointer</a>）。</p>
     * </blockquote>
     * <blockquote>
     * <p>但是这几个选项只能配置在全局的 axisPointer 中：<a href="#axisPointer.triggerOn">axisPointer.triggerOn</a>、<a href="#axisPointer.link">axisPointer.link</a>。</p>
     * </blockquote>
     * <hr>
     * <p><strong>如何显示 axisPointer：</strong></p>
     * <p>直角坐标系 <a href="#grid">grid</a>、极坐标系 <a href="#polar">polar</a>、单轴坐标系 <a href="#single">single</a> 中的每个轴都自己的 axisPointer。</p>
     * <p>他们的 axisPointer 默认不显示。有两种方法可以让他们显示：</p>
     * <ul>
     * <li><p>设置轴上的 <code class="codespan">axisPointer.show</code>（例如 <a href="#xAxis.axisPointer.show">xAxis.axisPointer.show</a>）为 <code class="codespan">true</code>，则显示此轴的 axisPointer。</p>
     * </li>
     * <li><p>设置 <a href="#tooltip.trigger">tooltip.trigger</a> 设置为 <code class="codespan">'axis'</code> 或者 <a href="#tooltip.axisPointer.type">tooltip.axisPointer.type</a> 设置为 <code class="codespan">'cross'</code>，则此时坐标系会自动选择显示哪个轴的 axisPointer，也可以使用 <a href="#tooltip.axisPointer.axis">tooltip.axisPointer.axis</a> 改变这种选择。注意，轴上如果设置了 axisPointer，会覆盖此设置。</p>
     * </li>
     * </ul>
     * <hr>
     * <p><strong>如何显示 axisPointer 的 label：</strong></p>
     * <p>axisPointer 的 label 默认不显示（也就是默认只显示指示线），除非：</p>
     * <ul>
     * <li><p>设置轴上的 <code class="codespan">axisPointer.label.show</code>（例如 <a href="#xAxis.axisPointer.show">xAxis.axisPointer.label.show</a>）为 <code class="codespan">true</code>，则显示此轴的 axisPointer 的 label。</p>
     * </li>
     * <li><p>设置 <a href="#tooltip.axisPointer.type">tooltip.axisPointer.type</a> 为 <code class="codespan">'cross'</code> 时会自动显示 axisPointer 的 label。</p>
     * </li>
     * </ul>
     * <hr>
     * <p><strong>关于触屏的 axisPointer 的设置</strong></p>
     * <p>设置轴上的 <code class="codespan">axisPointer.handle.show</code>（例如 <a href="#xAxis.axisPointer.handle.show">xAxis.axisPointer.handle.show</a> 为 <code class="codespan">true</code> 则会显示出此 axisPointer 的拖拽按钮。（polar 坐标系暂不支持此功能）。</p>
     * <p><strong>注意：</strong>
     * 如果发现此时 tooltip 效果不良好，可设置 <a href="#tooltip.triggerOn">tooltip.triggerOn</a> 为 <code class="codespan">'none'</code>（于是效果为：手指按住按钮则显示 tooltip，松开按钮则隐藏 tooltip），或者 <a href="#tooltip.alwaysShowContent">tooltip.alwaysShowContent</a> 为 <code class="codespan">true</code>（效果为 tooltip 一直显示）。</p>
     * <p>参见<a href="https://echarts.apache.org/examples/zh/editor.html?c=line-tooltip-touch&amp;edit=1&amp;reset=1" target="_blank">例子</a>。</p>
     * <hr>
     * <p><strong>自动吸附到数据（snap）</strong></p>
     * <p>对于数值轴、时间轴，如果开启了 <a href="#xAxis.axisPointer.snap">snap</a>，则 axisPointer 会自动吸附到最近的点上。</p>
     * <hr>
     */
    private AxisPointer axisPointer;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.showContent">https://echarts.apache.org/zh/option.html#tooltip.showContent</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示提示框浮层，默认显示。只需tooltip触发事件或显示axisPointer而不需要显示内容时可配置该项为<code class="codespan">false</code>。</p>
     */
    private Boolean showContent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.alwaysShowContent">https://echarts.apache.org/zh/option.html#tooltip.alwaysShowContent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否永远显示提示框内容，默认情况下在移出可触发提示框区域后 <a href="#tooltip.hideDelay">一定时间</a> 后隐藏，设置为 <code class="codespan">true</code> 可以保证一直显示提示框内容。</p>
     * <p>该属性为 ECharts 3.0 中新加。</p>
     */
    private Boolean alwaysShowContent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.triggerOn">https://echarts.apache.org/zh/option.html#tooltip.triggerOn</a>
     * <br/>默认值: mousemove|click
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>提示框触发的条件，可选：</p>
     * <ul>
     * <li><p><code class="codespan">'mousemove'</code></p>
     * <p>  鼠标移动时触发。</p>
     * </li>
     * <li><p><code class="codespan">'click'</code></p>
     * <p>  鼠标点击时触发。</p>
     * </li>
     * <li><p><code class="codespan">'mousemove|click'</code></p>
     * <p>  同时鼠标移动和点击时触发。</p>
     * </li>
     * <li><p><code class="codespan">'none'</code></p>
     * <p>  不在 <code class="codespan">'mousemove'</code> 或 <code class="codespan">'click'</code> 时触发，用户可以通过 <a href="api.html#action.tooltip.showTip" target="_blank">action.tooltip.showTip</a> 和 <a href="api.html#action.tooltip.hideTip" target="_blank">action.tooltip.hideTip</a> 来手动触发和隐藏。也可以通过 <a href="#xAxis.axisPointer.handle">axisPointer.handle</a> 来触发或隐藏。</p>
     * </li>
     * </ul>
     * <p>该属性为 ECharts 3.0 中新加。</p>
     */
    private String triggerOn;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.showDelay">https://echarts.apache.org/zh/option.html#tooltip.showDelay</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>浮层显示的延迟，单位为 ms，默认没有延迟，也不建议设置。在 <a href="#tooltip.triggerOn">triggerOn</a> 为 <code class="codespan">'mousemove'</code> 时有效。</p>
     */
    private Integer showDelay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.hideDelay">https://echarts.apache.org/zh/option.html#tooltip.hideDelay</a>
     * <br/>默认值: 100
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>浮层隐藏的延迟，单位为 ms，在 <a href="#tooltip.alwaysShowContent">alwaysShowContent</a> 为 <code class="codespan">true</code> 的时候无效。</p>
     */
    private Integer hideDelay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.enterable">https://echarts.apache.org/zh/option.html#tooltip.enterable</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>鼠标是否可进入提示框浮层中，默认为false，如需详情内交互，如添加链接，按钮，可设置为 <code class="codespan">true</code>。</p>
     */
    private Boolean enterable;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.renderMode">https://echarts.apache.org/zh/option.html#tooltip.renderMode</a>
     * <br/>默认值: html
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>浮层的渲染模式，默认以 <code class="codespan">'html</code> 即额外的 DOM 节点展示 tooltip；此外还可以设置为 <code class="codespan">'richText'</code> 表示以富文本的形式渲染，渲染的结果在图表对应的 Canvas 中（目前 SVG 尚未支持富文本），这对于一些没有 DOM 的环境（如微信小程序）有更好的支持。</p>
     */
    private String renderMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.confine">https://echarts.apache.org/zh/option.html#tooltip.confine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否将 tooltip 框限制在图表的区域内。</p>
     * <p>当图表外层的 dom 被设置为 <code class="codespan">'overflow: hidden'</code>，或者移动端窄屏，导致 tooltip 超出外界被截断时，此配置比较有用。</p>
     */
    private Boolean confine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.appendToBody">https://echarts.apache.org/zh/option.html#tooltip.appendToBody</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.7.0</code> 开始支持</p>
     * </blockquote>
     * <p>是否将 tooltip 的 DOM 节点添加为 HTML 的 <code class="codespan">&lt;body&gt;</code> 的子节点。只有当 <a href="#tooltip.renderMode">renderMode</a> 为 <code class="codespan">'html'</code> 是有意义的。</p>
     * <p>默认值是 <code class="codespan">false</code>。<code class="codespan">false</code> 表示，tooltip 的 DOM 节点会被添加为本图表的 DOM container 的一个子孙节点。但是这种方式导致，如果本图表的 DOM container 的祖先节点有设置 <code class="codespan">overflow: hidden</code>，那么当 tooltip 超出 container 范围使可能被截断。这个问题一定程度上可以用 <a href="#tooltip.confine">tooltip.confine</a> 来解决，但是不一定能解决所有场景。</p>
     * <p>所以这里我们提供了 <code class="codespan">appendToBody: true</code> 来解决这件事。这也是常见的解决此类问题的一种方式。但是 <code class="codespan">true</code> 并不定为默认值，因为要避免 break change，尤其是一些对于 tooltip 深入定制的使用。并且也避免一些未知的 bad case。</p>
     * <p>注：CSS transform 的场景，这也可以使用。</p>
     */
    private Boolean appendToBody;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.className">https://echarts.apache.org/zh/option.html#tooltip.className</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>指定 tooltip 的 DOM 节点的 CSS 类。（只在 <a href="#tooltip.renderMode"><code class="codespan">html</code></a> 模式下生效）。</p>
     * <p>Example:</p>
     * <pre><code class="lang-js hljs javascript">className: <span class="hljs-string">'echarts-tooltip echarts-tooltip-dark'</span>
     * </code></pre>
     */
    private String className;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.transitionDuration">https://echarts.apache.org/zh/option.html#tooltip.transitionDuration</a>
     * <br/>默认值: 0.4
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>提示框浮层的移动动画过渡时间，单位是 s，设置为 0 的时候会紧跟着鼠标移动。</p>
     */
    private Integer transitionDuration;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.position">https://echarts.apache.org/zh/option.html#tooltip.position</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","Array","Function"]
     * <br/>描述:
     * <p>提示框浮层的位置，默认不设置时位置会跟随鼠标的位置。</p>
     * <p>可选：</p>
     * <ul>
     * <li><p><code class="codespan">Array</code></p>
     * <p>  通过数组表示提示框浮层的位置，支持数字设置绝对位置，百分比设置相对位置。</p>
     * <p>  示例:</p>
     * <pre><code class="lang-js hljs javascript">  <span class="hljs-comment">// 绝对位置，相对于容器左侧 10px, 上侧 10 px</span>
     *   <span class="hljs-attr">position</span>: [<span class="hljs-number">10</span>, <span class="hljs-number">10</span>]
     *   <span class="hljs-comment">// 相对位置，放置在容器正中间</span>
     *   <span class="hljs-attr">position</span>: [<span class="hljs-string">'50%'</span>, <span class="hljs-string">'50%'</span>]
     * </code></pre>
     * </li>
     * <li><p><code class="codespan">Function</code></p>
     * <p>  回调函数，格式如下：</p>
     * <pre><code class="lang-js hljs javascript">  (point: <span class="hljs-built_in">Array</span>, <span class="hljs-attr">params</span>: <span class="hljs-built_in">Object</span>|<span class="hljs-built_in">Array</span>.&lt;<span class="hljs-built_in">Object</span>&gt;, <span class="hljs-attr">dom</span>: HTMLDomElement, <span class="hljs-attr">rect</span>: <span class="hljs-built_in">Object</span>, <span class="hljs-attr">size</span>: <span class="hljs-built_in">Object</span>) =&gt; <span class="hljs-built_in">Array</span>
     * </code></pre>
     * <p>  <strong>参数：</strong><br>
     *   point: 鼠标位置，如 [20, 40]。<br>
     *   params: 同 formatter 的参数相同。<br>
     *   dom: tooltip 的 dom 对象。<br>
     *   rect: 只有鼠标在图形上时有效，是一个用<code class="codespan">x</code>, <code class="codespan">y</code>, <code class="codespan">width</code>, <code class="codespan">height</code>四个属性表达的图形包围盒。<br>
     *   size: 包括 dom 的尺寸和 echarts 容器的当前尺寸，例如：<code class="codespan">{contentSize: [width, height], viewSize: [width, height]}</code>。<br></p>
     * <p>  <strong>返回值：</strong><br>
     *   可以是一个表示 tooltip 位置的数组，数组值可以是绝对的像素值，也可以是相  百分比。<br>
     *   也可以是一个对象，如：<code class="codespan">{left: 10, top: 30}</code>，或者 <code class="codespan">{right: '20%', bottom: 40}</code>。<br></p>
     * <p>  如下示例：</p>
     * <pre><code class="lang-js hljs javascript">  position: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">point, params, dom, rect, size</span>) </span>{
     *       <span class="hljs-comment">// 固定在顶部</span>
     *       <span class="hljs-keyword">return</span> [point[<span class="hljs-number">0</span>], <span class="hljs-string">'10%'</span>];
     *   }
     * </code></pre>
     * <p>  或者：</p>
     * <pre><code class="lang-js hljs javascript">  position: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">pos, params, dom, rect, size</span>) </span>{
     *       <span class="hljs-comment">// 鼠标在左侧时 tooltip 显示到右侧，鼠标在右侧时 tooltip 显示到左侧。</span>
     *       <span class="hljs-keyword">var</span> obj = {<span class="hljs-attr">top</span>: <span class="hljs-number">60</span>};
     *       obj[[<span class="hljs-string">'left'</span>, <span class="hljs-string">'right'</span>][+(pos[<span class="hljs-number">0</span>] &lt; size.viewSize[<span class="hljs-number">0</span>] / <span class="hljs-number">2</span>)]] = <span class="hljs-number">5</span>;
     *       <span class="hljs-keyword">return</span> obj;
     *   }
     * </code></pre>
     * </li>
     * </ul>
     * <ul>
     * <li><p><code class="codespan">'inside'</code></p>
     * <p>  鼠标所在图形的内部中心位置，只在 <a href="#tooltip.trigger">trigger</a> 为<code class="codespan">'item'</code>的时候有效。</p>
     * </li>
     * <li><p><code class="codespan">'top'</code></p>
     * <p>  鼠标所在图形上侧，只在 <a href="#tooltip.trigger">trigger</a> 为<code class="codespan">'item'</code>的时候有效。</p>
     * </li>
     * <li><p><code class="codespan">'left'</code></p>
     * <p>  鼠标所在图形左侧，只在 <a href="#tooltip.trigger">trigger</a> 为<code class="codespan">'item'</code>的时候有效。</p>
     * </li>
     * <li><p><code class="codespan">'right'</code></p>
     * <p>  鼠标所在图形右侧，只在 <a href="#tooltip.trigger">trigger</a> 为<code class="codespan">'item'</code>的时候有效。</p>
     * </li>
     * <li><p><code class="codespan">'bottom'</code></p>
     * <p>  鼠标所在图形底侧，只在 <a href="#tooltip.trigger">trigger</a> 为<code class="codespan">'item'</code>的时候有效。</p>
     * </li>
     * </ul>
     */
    private Object position;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.formatter">https://echarts.apache.org/zh/option.html#tooltip.formatter</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>提示框浮层内容格式器，支持字符串模板和回调函数两种形式。</p>
     * <p><strong>1. 字符串模板</strong></p>
     * <p>模板变量有 <code class="codespan">{a}</code>, <code class="codespan">{b}</code>，<code class="codespan">{c}</code>，<code class="codespan">{d}</code>，<code class="codespan">{e}</code>，分别表示系列名，数据名，数据值等。
     * 在 <a href="#tooltip.trigger">trigger</a> 为 <code class="codespan">'axis'</code> 的时候，会有多个系列的数据，此时可以通过 <code class="codespan">{a0}</code>, <code class="codespan">{a1}</code>, <code class="codespan">{a2}</code> 这种后面加索引的方式表示系列的索引。
     * 不同图表类型下的 <code class="codespan">{a}</code>，<code class="codespan">{b}</code>，<code class="codespan">{c}</code>，<code class="codespan">{d}</code> 含义不一样。
     * 其中变量<code class="codespan">{a}</code>, <code class="codespan">{b}</code>, <code class="codespan">{c}</code>, <code class="codespan">{d}</code>在不同图表类型下代表数据含义为：</p>
     * <ul>
     * <li><p>折线（区域）图、柱状（条形）图、K线图 : <code class="codespan">{a}</code>（系列名称），<code class="codespan">{b}</code>（类目值），<code class="codespan">{c}</code>（数值）, <code class="codespan">{d}</code>（无）</p>
     * </li>
     * <li><p>散点图（气泡）图 : <code class="codespan">{a}</code>（系列名称），<code class="codespan">{b}</code>（数据名称），<code class="codespan">{c}</code>（数值数组）, <code class="codespan">{d}</code>（无）</p>
     * </li>
     * <li><p>地图 : <code class="codespan">{a}</code>（系列名称），<code class="codespan">{b}</code>（区域名称），<code class="codespan">{c}</code>（合并数值）, <code class="codespan">{d}</code>（无）</p>
     * </li>
     * <li><p>饼图、仪表盘、漏斗图: <code class="codespan">{a}</code>（系列名称），<code class="codespan">{b}</code>（数据项名称），<code class="codespan">{c}</code>（数值）, <code class="codespan">{d}</code>（百分比）</p>
     * </li>
     * </ul>
     * <p>更多其它图表模板变量的含义可以见相应的图表的 label.formatter 配置项。</p>
     * <p><strong>示例：</strong></p>
     * <pre><code class="lang-js hljs javascript">formatter: <span class="hljs-string">'{b0}: {c0}&lt;br /&gt;{b1}: {c1}'</span>
     * </code></pre>
     * <p><strong>2. 回调函数</strong></p>
     * <p>回调函数格式：</p>
     * <pre><code class="lang-js hljs javascript">(params: <span class="hljs-built_in">Object</span>|<span class="hljs-built_in">Array</span>, <span class="hljs-attr">ticket</span>: string, <span class="hljs-attr">callback</span>: <span class="hljs-function">(<span class="hljs-params">ticket: string, html: string</span>)) =&gt;</span> string | HTMLElement | HTMLElement[]
     * </code></pre>
     * <p>支持返回 HTML 字符串或者创建的 DOM 实例。</p>
     * <p>第一个参数 <code class="codespan">params</code> 是 formatter 需要的数据集。格式如下：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">componentType</span>: <span class="hljs-string">'series'</span>,
     *     <span class="hljs-comment">// 系列类型</span>
     *     <span class="hljs-attr">seriesType</span>: string,
     *     <span class="hljs-comment">// 系列在传入的 option.series 中的 index</span>
     *     <span class="hljs-attr">seriesIndex</span>: number,
     *     <span class="hljs-comment">// 系列名称</span>
     *     <span class="hljs-attr">seriesName</span>: string,
     *     <span class="hljs-comment">// 数据名，类目名</span>
     *     <span class="hljs-attr">name</span>: string,
     *     <span class="hljs-comment">// 数据在传入的 data 数组中的 index</span>
     *     <span class="hljs-attr">dataIndex</span>: number,
     *     <span class="hljs-comment">// 传入的原始数据项</span>
     *     <span class="hljs-attr">data</span>: <span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 传入的数据值。在多数系列下它和 data 相同。在一些系列下是 data 中的分量（如 map、radar 中）</span>
     *     <span class="hljs-attr">value</span>: number|<span class="hljs-built_in">Array</span>|<span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 坐标轴 encode 映射信息，</span>
     *     <span class="hljs-comment">// key 为坐标轴（如 'x' 'y' 'radius' 'angle' 等）</span>
     *     <span class="hljs-comment">// value 必然为数组，不会为 null/undefied，表示 dimension index 。</span>
     *     <span class="hljs-comment">// 其内容如：</span>
     *     <span class="hljs-comment">// {</span>
     *     <span class="hljs-comment">//     x: [2] // dimension index 为 2 的数据映射到 x 轴</span>
     *     <span class="hljs-comment">//     y: [0] // dimension index 为 0 的数据映射到 y 轴</span>
     *     <span class="hljs-comment">// }</span>
     *     <span class="hljs-attr">encode</span>: <span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 维度名列表</span>
     *     <span class="hljs-attr">dimensionNames</span>: <span class="hljs-built_in">Array</span>&lt;<span class="hljs-built_in">String</span>&gt;,
     *     <span class="hljs-comment">// 数据的维度 index，如 0 或 1 或 2 ...</span>
     *     <span class="hljs-comment">// 仅在雷达图中使用。</span>
     *     <span class="hljs-attr">dimensionIndex</span>: number,
     *     <span class="hljs-comment">// 数据图形的颜色</span>
     *     <span class="hljs-attr">color</span>: string,
     *
     *
     *     <span class="hljs-comment">// 饼图的百分比</span>
     *     <span class="hljs-attr">percent</span>: number,
     *
     *
     * }
     * </code></pre>
     * <p>注：encode 和 dimensionNames 的使用方式，例如：</p>
     * <p>如果数据为：</p>
     * <pre><code class="lang-js hljs javascript">dataset: {
     *     <span class="hljs-attr">source</span>: [
     *         [<span class="hljs-string">'Matcha Latte'</span>, <span class="hljs-number">43.3</span>, <span class="hljs-number">85.8</span>, <span class="hljs-number">93.7</span>],
     *         [<span class="hljs-string">'Milk Tea'</span>, <span class="hljs-number">83.1</span>, <span class="hljs-number">73.4</span>, <span class="hljs-number">55.1</span>],
     *         [<span class="hljs-string">'Cheese Cocoa'</span>, <span class="hljs-number">86.4</span>, <span class="hljs-number">65.2</span>, <span class="hljs-number">82.5</span>],
     *         [<span class="hljs-string">'Walnut Brownie'</span>, <span class="hljs-number">72.4</span>, <span class="hljs-number">53.9</span>, <span class="hljs-number">39.1</span>]
     *     ]
     * }
     * </code></pre>
     * <p>则可这样得到 y 轴对应的 value：</p>
     * <pre><code class="lang-js hljs javascript">params.value[params.encode.y[<span class="hljs-number">0</span>]]
     * </code></pre>
     * <p>如果数据为：</p>
     * <pre><code class="lang-js hljs javascript">dataset: {
     *     <span class="hljs-attr">dimensions</span>: [<span class="hljs-string">'product'</span>, <span class="hljs-string">'2015'</span>, <span class="hljs-string">'2016'</span>, <span class="hljs-string">'2017'</span>],
     *     <span class="hljs-attr">source</span>: [
     *         {<span class="hljs-attr">product</span>: <span class="hljs-string">'Matcha Latte'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">43.3</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">85.8</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">93.7</span>},
     *         {<span class="hljs-attr">product</span>: <span class="hljs-string">'Milk Tea'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">83.1</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">73.4</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">55.1</span>},
     *         {<span class="hljs-attr">product</span>: <span class="hljs-string">'Cheese Cocoa'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">86.4</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">65.2</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">82.5</span>},
     *         {<span class="hljs-attr">product</span>: <span class="hljs-string">'Walnut Brownie'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">72.4</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">53.9</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">39.1</span>}
     *     ]
     * }
     * </code></pre>
     * <p>则可这样得到 y 轴对应的 value：</p>
     * <pre><code class="lang-js hljs javascript">params.value[params.dimensionNames[params.encode.y[<span class="hljs-number">0</span>]]]
     * </code></pre>
     * <p>在 <a href="#tooltip.trigger">trigger</a> 为 <code class="codespan">'axis'</code> 的时候，或者 tooltip 被 <a href="#xAxis.axisPointer">axisPointer</a> 触发的时候，<code class="codespan">params</code> 是多个系列的数据数组。其中每项内容格式同上，并且，</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">componentType</span>: <span class="hljs-string">'series'</span>,
     *     <span class="hljs-comment">// 系列类型</span>
     *     <span class="hljs-attr">seriesType</span>: string,
     *     <span class="hljs-comment">// 系列在传入的 option.series 中的 index</span>
     *     <span class="hljs-attr">seriesIndex</span>: number,
     *     <span class="hljs-comment">// 系列名称</span>
     *     <span class="hljs-attr">seriesName</span>: string,
     *     <span class="hljs-comment">// 数据名，类目名</span>
     *     <span class="hljs-attr">name</span>: string,
     *     <span class="hljs-comment">// 数据在传入的 data 数组中的 index</span>
     *     <span class="hljs-attr">dataIndex</span>: number,
     *     <span class="hljs-comment">// 传入的原始数据项</span>
     *     <span class="hljs-attr">data</span>: <span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 传入的数据值。在多数系列下它和 data 相同。在一些系列下是 data 中的分量（如 map、radar 中）</span>
     *     <span class="hljs-attr">value</span>: number|<span class="hljs-built_in">Array</span>|<span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 坐标轴 encode 映射信息，</span>
     *     <span class="hljs-comment">// key 为坐标轴（如 'x' 'y' 'radius' 'angle' 等）</span>
     *     <span class="hljs-comment">// value 必然为数组，不会为 null/undefied，表示 dimension index 。</span>
     *     <span class="hljs-comment">// 其内容如：</span>
     *     <span class="hljs-comment">// {</span>
     *     <span class="hljs-comment">//     x: [2] // dimension index 为 2 的数据映射到 x 轴</span>
     *     <span class="hljs-comment">//     y: [0] // dimension index 为 0 的数据映射到 y 轴</span>
     *     <span class="hljs-comment">// }</span>
     *     <span class="hljs-attr">encode</span>: <span class="hljs-built_in">Object</span>,
     *     <span class="hljs-comment">// 维度名列表</span>
     *     <span class="hljs-attr">dimensionNames</span>: <span class="hljs-built_in">Array</span>&lt;<span class="hljs-built_in">String</span>&gt;,
     *     <span class="hljs-comment">// 数据的维度 index，如 0 或 1 或 2 ...</span>
     *     <span class="hljs-comment">// 仅在雷达图中使用。</span>
     *     <span class="hljs-attr">dimensionIndex</span>: number,
     *     <span class="hljs-comment">// 数据图形的颜色</span>
     *     <span class="hljs-attr">color</span>: string,
     *
     *
     *
     * }
     * </code></pre>
     * <p>注：encode 和 dimensionNames 的使用方式，例如：</p>
     * <p>如果数据为：</p>
     * <pre><code class="lang-js hljs javascript">dataset: {
     *     <span class="hljs-attr">source</span>: [
     *         [<span class="hljs-string">'Matcha Latte'</span>, <span class="hljs-number">43.3</span>, <span class="hljs-number">85.8</span>, <span class="hljs-number">93.7</span>],
     *         [<span class="hljs-string">'Milk Tea'</span>, <span class="hljs-number">83.1</span>, <span class="hljs-number">73.4</span>, <span class="hljs-number">55.1</span>],
     *         [<span class="hljs-string">'Cheese Cocoa'</span>, <span class="hljs-number">86.4</span>, <span class="hljs-number">65.2</span>, <span class="hljs-number">82.5</span>],
     *         [<span class="hljs-string">'Walnut Brownie'</span>, <span class="hljs-number">72.4</span>, <span class="hljs-number">53.9</span>, <span class="hljs-number">39.1</span>]
     *     ]
     * }
     * </code></pre>
     * <p>则可这样得到 y 轴对应的 value：</p>
     * <pre><code class="lang-js hljs javascript">params.value[params.encode.y[<span class="hljs-number">0</span>]]
     * </code></pre>
     * <p>如果数据为：</p>
     * <pre><code class="lang-js hljs javascript">dataset: {
     *     <span class="hljs-attr">dimensions</span>: [<span class="hljs-string">'product'</span>, <span class="hljs-string">'2015'</span>, <span class="hljs-string">'2016'</span>, <span class="hljs-string">'2017'</span>],
     *     <span class="hljs-attr">source</span>: [
     *         {<span class="hljs-attr">product</span>: <span class="hljs-string">'Matcha Latte'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">43.3</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">85.8</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">93.7</span>},
     *         {<span class="hljs-attr">product</span>: <span class="hljs-string">'Milk Tea'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">83.1</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">73.4</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">55.1</span>},
     *         {<span class="hljs-attr">product</span>: <span class="hljs-string">'Cheese Cocoa'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">86.4</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">65.2</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">82.5</span>},
     *         {<span class="hljs-attr">product</span>: <span class="hljs-string">'Walnut Brownie'</span>, <span class="hljs-string">'2015'</span>: <span class="hljs-number">72.4</span>, <span class="hljs-string">'2016'</span>: <span class="hljs-number">53.9</span>, <span class="hljs-string">'2017'</span>: <span class="hljs-number">39.1</span>}
     *     ]
     * }
     * </code></pre>
     * <p>则可这样得到 y 轴对应的 value：</p>
     * <pre><code class="lang-js hljs javascript">params.value[params.dimensionNames[params.encode.y[<span class="hljs-number">0</span>]]]
     * </code></pre>
     * <p><strong>注：</strong> ECharts 2.x 使用数组表示各参数的方式不再支持。</p>
     * <p>第二个参数 <code class="codespan">ticket</code> 是异步回调标识，配合第三个参数 <code class="codespan">callback</code> 使用。
     * 第三个参数 <code class="codespan">callback</code> 是异步回调，在提示框浮层内容是异步获取的时候，可以通过 callback 传入上述的 <code class="codespan">ticket</code> 和 <code class="codespan">html</code> 更新提示框浮层内容。</p>
     * <p>示例：</p>
     * <pre><code class="lang-js hljs javascript">formatter: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">params, ticket, callback</span>) </span>{
     *     $.<span class="hljs-keyword">get</span>('detail?name=' + params.name, function (content) {
     *         callback(ticket, toHTML(content));
     *     });
     *     <span class="hljs-keyword">return</span> <span class="hljs-string">'Loading'</span>;
     * }
     * </code></pre>
     */
    private Object formatter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.backgroundColor">https://echarts.apache.org/zh/option.html#tooltip.backgroundColor</a>
     * <br/>默认值: rgba(50,50,50,0.7)
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>提示框浮层的背景颜色。</p>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.borderColor">https://echarts.apache.org/zh/option.html#tooltip.borderColor</a>
     * <br/>默认值: #333
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>提示框浮层的边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.borderWidth">https://echarts.apache.org/zh/option.html#tooltip.borderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>提示框浮层的边框宽。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.padding">https://echarts.apache.org/zh/option.html#tooltip.padding</a>
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>提示框浮层内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距。</p>
     * <p>使用示例：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 设置内边距为 5</span>
     * <span class="hljs-attr">padding</span>: <span class="hljs-number">5</span>
     * <span class="hljs-comment">// 设置上下的内边距为 5，左右的内边距为 10</span>
     * <span class="hljs-attr">padding</span>: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>]
     * <span class="hljs-comment">// 分别设置四个方向的内边距</span>
     * <span class="hljs-attr">padding</span>: [
     *     <span class="hljs-number">5</span>,  <span class="hljs-comment">// 上</span>
     *     <span class="hljs-number">10</span>, <span class="hljs-comment">// 右</span>
     *     <span class="hljs-number">5</span>,  <span class="hljs-comment">// 下</span>
     *     <span class="hljs-number">10</span>, <span class="hljs-comment">// 左</span>
     * ]
     * </code></pre>
     */
    private Integer padding;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.textStyle">https://echarts.apache.org/zh/option.html#tooltip.textStyle</a>
     * <br/>默认值: #fff
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>提示框浮层的文本样式。</p>
     */
    private TextStyle textStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.extraCssText">https://echarts.apache.org/zh/option.html#tooltip.extraCssText</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>额外附加到浮层的 css 样式。如下为浮层添加阴影的示例：</p>
     * <pre><code class="lang-js hljs javascript">extraCssText: <span class="hljs-string">'box-shadow: 0 0 3px rgba(0, 0, 0, 0.3);'</span>
     * </code></pre>
     */
    private String extraCssText;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.order">https://echarts.apache.org/zh/option.html#tooltip.order</a>
     * <br/>默认值: seriesAsc
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>多系列提示框浮层排列顺序。默认值为 <code class="codespan">'seriesAsc'</code></p>
     * <p>提示框排列顺序可选值:</p>
     * <ul>
     * <li><p><code class="codespan">'seriesAsc'</code></p>
     * <p>  根据系列声明, 升序排列。</p>
     * </li>
     * <li><p><code class="codespan">'seriesDesc'</code></p>
     * <p>  根据系列声明, 降序排列。</p>
     * </li>
     * <li><p><code class="codespan">'valueAsc'</code></p>
     * <p>  根据数据值, 升序排列。</p>
     * </li>
     * <li><p><code class="codespan">'valueDesc'</code></p>
     * <p>  根据数据值, 降序排列。</p>
     * </li>
     * </ul>
     */
    private String order;
}
