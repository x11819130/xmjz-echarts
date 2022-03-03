package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.toolbox.Emphasis;
import com.xmjz.echarts.nativebean.option.toolbox.Feature;
import com.xmjz.echarts.nativebean.option.toolbox.IconStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox">https://echarts.apache.org/zh/option.html#toolbox</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>工具栏。内置有<a href="#toolbox.feature.saveAsImage">导出图片</a>，<a href="#toolbox.feature.dataView">数据视图</a>，<a href="#toolbox.feature.magicType">动态类型切换</a>，<a href="#toolbox.feature.dataZoom">数据区域缩放</a>，<a href="#toolbox.feature.reset">重置</a>五个工具。</p>
 * <p><strong>如下示例：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-marker&amp;reset=1&amp;edit=1" width="600" height="400"></iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Toolbox implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.id">https://echarts.apache.org/zh/option.html#toolbox.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.show">https://echarts.apache.org/zh/option.html#toolbox.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示工具栏组件。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.orient">https://echarts.apache.org/zh/option.html#toolbox.orient</a>
     * <br/>默认值: horizontal
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>工具栏 icon 的布局朝向。</p>
     * <p>可选：</p>
     * <ul>
     * <li>'horizontal'</li>
     * <li>'vertical'</li>
     * </ul>
     */
    private String orient;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.itemSize">https://echarts.apache.org/zh/option.html#toolbox.itemSize</a>
     * <br/>默认值: 15
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>工具栏 icon 的大小。</p>
     */
    private Integer itemSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.itemGap">https://echarts.apache.org/zh/option.html#toolbox.itemGap</a>
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>工具栏 icon 每项之间的间隔。横向布局时为水平间隔，纵向布局时为纵向间隔。</p>
     */
    private Integer itemGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.showTitle">https://echarts.apache.org/zh/option.html#toolbox.showTitle</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否在鼠标 hover 的时候显示每个工具 icon 的标题。</p>
     */
    private Boolean showTitle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature">https://echarts.apache.org/zh/option.html#toolbox.feature</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>各工具配置项。</p>
     * <p>除了各个内置的工具按钮外，还可以自定义工具按钮。</p>
     * <p>注意，自定义的工具名字，只能以 <code class="codespan">my</code> 开头，例如下例中的 <code class="codespan">myTool1</code>，<code class="codespan">myTool2</code>：</p>
     * <pre><code class="lang-javascript hljs">{
     *     <span class="hljs-attr">toolbox</span>: {
     *         <span class="hljs-attr">feature</span>: {
     *             <span class="hljs-attr">myTool1</span>: {
     *                 <span class="hljs-attr">show</span>: <span class="hljs-literal">true</span>,
     *                 <span class="hljs-attr">title</span>: <span class="hljs-string">'自定义扩展方法1'</span>,
     *                 <span class="hljs-attr">icon</span>: <span class="hljs-string">'path://M432.45,595.444c0,2.177-4.661,6.82-11.305,6.82c-6.475,0-11.306-4.567-11.306-6.82s4.852-6.812,11.306-6.812C427.841,588.632,432.452,593.191,432.45,595.444L432.45,595.444z M421.155,589.876c-3.009,0-5.448,2.495-5.448,5.572s2.439,5.572,5.448,5.572c3.01,0,5.449-2.495,5.449-5.572C426.604,592.371,424.165,589.876,421.155,589.876L421.155,589.876z M421.146,591.891c-1.916,0-3.47,1.589-3.47,3.549c0,1.959,1.554,3.548,3.47,3.548s3.469-1.589,3.469-3.548C424.614,593.479,423.062,591.891,421.146,591.891L421.146,591.891zM421.146,591.891'</span>,
     *                 <span class="hljs-attr">onclick</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params"></span>)</span>{
     *                     alert(<span class="hljs-string">'myToolHandler1'</span>)
     *                 }
     *             },
     *             <span class="hljs-attr">myTool2</span>: {
     *                 <span class="hljs-attr">show</span>: <span class="hljs-literal">true</span>,
     *                 <span class="hljs-attr">title</span>: <span class="hljs-string">'自定义扩展方法'</span>,
     *                 <span class="hljs-attr">icon</span>: <span class="hljs-string">'image://http://echarts.baidu.com/images/favicon.png'</span>,
     *                 <span class="hljs-attr">onclick</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params"></span>)</span>{
     *                     alert(<span class="hljs-string">'myToolHandler2'</span>)
     *                 }
     *             }
     *         }
     *     }
     * }
     * </code></pre>
     */
    private Feature feature;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.iconStyle">https://echarts.apache.org/zh/option.html#toolbox.iconStyle</a>
     * <br/>默认值: none
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>公用的 icon 样式设置。由于 icon 的文本信息只在 icon hover 时候才显示，所以文字相关的配置项请在 <code class="codespan">emphasis</code> 下设置。</p>
     */
    private IconStyle iconStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.emphasis">https://echarts.apache.org/zh/option.html#toolbox.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.zlevel">https://echarts.apache.org/zh/option.html#toolbox.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.z">https://echarts.apache.org/zh/option.html#toolbox.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.left">https://echarts.apache.org/zh/option.html#toolbox.left</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>工具栏组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.top">https://echarts.apache.org/zh/option.html#toolbox.top</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>工具栏组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.right">https://echarts.apache.org/zh/option.html#toolbox.right</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>工具栏组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.bottom">https://echarts.apache.org/zh/option.html#toolbox.bottom</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>工具栏组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.width">https://echarts.apache.org/zh/option.html#toolbox.width</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>工具栏组件的宽度。默认自适应。</p>
     */
    private Object width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.height">https://echarts.apache.org/zh/option.html#toolbox.height</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>工具栏组件的高度。默认自适应。</p>
     */
    private Object height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.tooltip">https://echarts.apache.org/zh/option.html#toolbox.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>工具箱的 tooltip 配置，配置项同 <a href="#tooltip">tooltip</a>。默认不显示，可以在需要特殊定制文字样式（尤其是想用自定义 CSS 控制文字样式）的时候开启 tooltip，如下示例：</p>
     * <pre><code class="lang-ts hljs typescript">option = {
     *     tooltip: {
     *         show: <span class="hljs-literal">true</span> <span class="hljs-comment">// 必须引入 tooltip 组件</span>
     *     },
     *     toolbox: {
     *         show: <span class="hljs-literal">true</span>,
     *         showTitle: <span class="hljs-literal">false</span>, <span class="hljs-comment">// 隐藏默认文字，否则两者位置会重叠</span>
     *         feature: {
     *             saveAsImage: {
     *                 show: <span class="hljs-literal">true</span>,
     *                 title: <span class="hljs-string">'Save As Image'</span>
     *             },
     *             dataView: {
     *                 show: <span class="hljs-literal">true</span>,
     *                 title: <span class="hljs-string">'Data View'</span>
     *             },
     *         },
     *         tooltip: { <span class="hljs-comment">// 和 option.tooltip 的配置项相同</span>
     *             show: <span class="hljs-literal">true</span>,
     *             formatter: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">param</span>) </span>{
     *                 <span class="hljs-keyword">return</span> <span class="hljs-keyword">return</span> <span class="hljs-string">'&lt;div&gt;'</span> + param.title + <span class="hljs-string">'&lt;/div&gt;'</span>; <span class="hljs-comment">// 自定义的 DOM 结构</span>
     *             },
     *             backgroundColor: <span class="hljs-string">'#222'</span>,
     *             textStyle: {
     *                 fontSize: <span class="hljs-number">12</span>,
     *             },
     *             extraCssText: <span class="hljs-string">'box-shadow: 0 0 3px rgba(0, 0, 0, 0.3);'</span> <span class="hljs-comment">// 自定义的 CSS 样式</span>
     *         }
     *     },
     *     ...
     * }
     * </code></pre>
     */
    private Object tooltip;
}
