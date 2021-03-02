package com.xmjz.echarts.nativebean.option.tooltip;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer">https://echarts.apache.org/zh/option.html#tooltip.axisPointer</a>
 * <br/>序号: 3
 * <br/>默认值: 无
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
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class AxisPointer implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.type">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.type</a>
     * <br/>序号: 1
     * <br/>默认值: line
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>指示器类型。</p>
     * <p>可选</p>
     * <ul>
     * <li><p><code class="codespan">'line'</code> 直线指示器</p>
     * </li>
     * <li><p><code class="codespan">'shadow'</code> 阴影指示器</p>
     * </li>
     * <li><p><code class="codespan">'none'</code> 无指示器</p>
     * </li>
     * <li><p><code class="codespan">'cross'</code> 十字准星指示器。其实是种简写，表示启用两个正交的轴的 axisPointer。</p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.axis">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.axis</a>
     * <br/>序号: 2
     * <br/>默认值: auto
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>指示器的坐标轴。</p>
     * <p>默认情况，坐标系会自动选择显示哪个轴的 axisPointer（默认取类目轴或者时间轴）。</p>
     * <p>可以是 <code class="codespan">'x'</code>, <code class="codespan">'y'</code>, <code class="codespan">'radius'</code>, <code class="codespan">'angle'</code>。</p>
     */
    private String axis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.snap">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.snap</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>坐标轴指示器是否自动吸附到点上。默认自动判断。</p>
     * <p>这个功能在数值轴和时间轴上比较有意义，可以自动寻找细小的数值点。</p>
     */
    private Boolean snap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.z">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.z</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴指示器的 z 值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.label">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.label</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>坐标轴指示器的文本标签。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.lineStyle">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.lineStyle</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><a href="#tooltip.axisPointer.type">axisPointer.type</a> 为 <code class="codespan">'line'</code> 时有效。</p>
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.shadowStyle">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.shadowStyle</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><a href="#tooltip.axisPointer.type">axisPointer.type</a> 为 <code class="codespan">'shadow'</code> 时有效。</p>
     */
    private Object shadowStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.crossStyle">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.crossStyle</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><a href="#tooltip.axisPointer.type">axisPointer.type</a> 为 <code class="codespan">'cross'</code> 时有效。</p>
     */
    private Object crossStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animation">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animation</a>
     * <br/>序号: 9
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationThreshold">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationThreshold</a>
     * <br/>序号: 10
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationDuration">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationDuration</a>
     * <br/>序号: 11
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationEasing">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationEasing</a>
     * <br/>序号: 12
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationDelay">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationDelay</a>
     * <br/>序号: 13
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationDurationUpdate">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationDurationUpdate</a>
     * <br/>序号: 14
     * <br/>默认值: 200
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationEasingUpdate">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationEasingUpdate</a>
     * <br/>序号: 15
     * <br/>默认值: exponentialOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationDelayUpdate">https://echarts.apache.org/zh/option.html#tooltip.axisPointer.animationDelayUpdate</a>
     * <br/>序号: 16
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
}
