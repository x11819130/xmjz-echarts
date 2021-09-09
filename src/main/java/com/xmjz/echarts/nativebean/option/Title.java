package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.title.SubtextStyle;
import com.xmjz.echarts.nativebean.option.title.TextStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title">https://echarts.apache.org/v4/zh/option.html#title</a>
 * <br/>序号: 1
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>标题组件，包含主标题和副标题。</p>
 * <p>在 ECharts 2.x 中单个 ECharts 实例最多只能拥有一个标题组件。但是在 ECharts 3 中可以存在任意多个标题组件，这在需要标题进行排版，或者单个实例中的多个图表都需要标题时会比较有用。</p>
 * <p><strong>例如下面不同缓动函数效果的示例，每一个缓动效果图都带有一个标题组件：</strong></p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-easing&amp;edit=1&amp;reset=1" width="700" height="400" data-ll-timeout="16"><iframe />
 *
 *
 *
 *
 *
 * </iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Title implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.id">https://echarts.apache.org/v4/zh/option.html#title.id</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.show">https://echarts.apache.org/v4/zh/option.html#title.show</a>
     * <br/>序号: 2
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示标题组件。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.text">https://echarts.apache.org/v4/zh/option.html#title.text</a>
     * <br/>序号: 3
     * <br/>默认值:
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>主标题文本，支持使用 <code class="codespan">\n</code> 换行。</p>
     */
    private String text;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.link">https://echarts.apache.org/v4/zh/option.html#title.link</a>
     * <br/>序号: 4
     * <br/>默认值:
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>主标题文本超链接。</p>
     */
    private String link;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.target">https://echarts.apache.org/v4/zh/option.html#title.target</a>
     * <br/>序号: 5
     * <br/>默认值: blank
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>指定窗口打开主标题超链接。</p>
     * <p><strong>可选：</strong></p>
     * <ul>
     * <li><p><code class="codespan">'self'</code> 当前窗口打开</p>
     * </li>
     * <li><p><code class="codespan">'blank'</code> 新窗口打开</p>
     * </li>
     * </ul>
     */
    private String target;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.textStyle">https://echarts.apache.org/v4/zh/option.html#title.textStyle</a>
     * <br/>序号: 6
     * <br/>默认值: #333
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private TextStyle textStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.subtext">https://echarts.apache.org/v4/zh/option.html#title.subtext</a>
     * <br/>序号: 7
     * <br/>默认值:
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>副标题文本，支持使用 <code class="codespan">\n</code> 换行。</p>
     */
    private String subtext;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.sublink">https://echarts.apache.org/v4/zh/option.html#title.sublink</a>
     * <br/>序号: 8
     * <br/>默认值:
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>副标题文本超链接。</p>
     */
    private String sublink;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.subtarget">https://echarts.apache.org/v4/zh/option.html#title.subtarget</a>
     * <br/>序号: 9
     * <br/>默认值: blank
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>指定窗口打开副标题超链接，可选：</p>
     * <ul>
     * <li><p><code class="codespan">'self'</code> 当前窗口打开</p>
     * </li>
     * <li><p><code class="codespan">'blank'</code> 新窗口打开</p>
     * </li>
     * </ul>
     */
    private String subtarget;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.subtextStyle">https://echarts.apache.org/v4/zh/option.html#title.subtextStyle</a>
     * <br/>序号: 10
     * <br/>默认值: #aaa
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private SubtextStyle subtextStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.textAlign">https://echarts.apache.org/v4/zh/option.html#title.textAlign</a>
     * <br/>序号: 11
     * <br/>默认值: auto
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>整体（包括 text 和 subtext）的水平对齐。</p>
     * <p>可选值：<code class="codespan">'auto'</code>、<code class="codespan">'left'</code>、<code class="codespan">'right'</code>、<code class="codespan">'center'</code>。</p>
     */
    private String textAlign;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.textVerticalAlign">https://echarts.apache.org/v4/zh/option.html#title.textVerticalAlign</a>
     * <br/>序号: 12
     * <br/>默认值: auto
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>整体（包括 text 和 subtext）的垂直对齐。</p>
     * <p>可选值：<code class="codespan">'auto'</code>、<code class="codespan">'top'</code>、<code class="codespan">'bottom'</code>、<code class="codespan">'middle'</code>。</p>
     */
    private String textVerticalAlign;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.triggerEvent">https://echarts.apache.org/v4/zh/option.html#title.triggerEvent</a>
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否触发事件。</p>
     */
    private Boolean triggerEvent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.padding">https://echarts.apache.org/v4/zh/option.html#title.padding</a>
     * <br/>序号: 14
     * <br/>默认值: 5
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>标题内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距。</p>
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
    private Object padding;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.itemGap">https://echarts.apache.org/v4/zh/option.html#title.itemGap</a>
     * <br/>序号: 15
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>主副标题之间的间距。</p>
     */
    private Integer itemGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.zlevel">https://echarts.apache.org/v4/zh/option.html#title.zlevel</a>
     * <br/>序号: 16
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.z">https://echarts.apache.org/v4/zh/option.html#title.z</a>
     * <br/>序号: 17
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.left">https://echarts.apache.org/v4/zh/option.html#title.left</a>
     * <br/>序号: 18
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>title 组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.top">https://echarts.apache.org/v4/zh/option.html#title.top</a>
     * <br/>序号: 19
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>title 组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.right">https://echarts.apache.org/v4/zh/option.html#title.right</a>
     * <br/>序号: 20
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>title 组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.bottom">https://echarts.apache.org/v4/zh/option.html#title.bottom</a>
     * <br/>序号: 21
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>title 组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.backgroundColor">https://echarts.apache.org/v4/zh/option.html#title.backgroundColor</a>
     * <br/>序号: 22
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>标题背景色，默认透明。</p>
     * <blockquote>
     * <p>颜色可以使用 RGB 表示，比如 <code class="codespan">'rgb(128, 128, 128)'</code>   ，如果想要加上 alpha 通道，可以使用 RGBA，比如 <code class="codespan">'rgba(128, 128, 128, 0.5)'</code>，也可以使用十六进制格式，比如 <code class="codespan">'#ccc'</code></p>
     * </blockquote>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.borderColor">https://echarts.apache.org/v4/zh/option.html#title.borderColor</a>
     * <br/>序号: 23
     * <br/>默认值: #ccc
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>标题的边框颜色。支持的颜色格式同 backgroundColor。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.borderWidth">https://echarts.apache.org/v4/zh/option.html#title.borderWidth</a>
     * <br/>序号: 24
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标题的边框线宽。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.borderRadius">https://echarts.apache.org/v4/zh/option.html#title.borderRadius</a>
     * <br/>序号: 25
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>圆角半径，单位px，支持传入数组分别指定 4 个圆角半径。
     * 如:</p>
     * <pre><code class="hljs javascript">borderRadius: <span class="hljs-number">5</span>, <span class="hljs-comment">// 统一设置四个角的圆角大小</span>
     * <span class="hljs-attr">borderRadius</span>: [<span class="hljs-number">5</span>, <span class="hljs-number">5</span>, <span class="hljs-number">0</span>, <span class="hljs-number">0</span>] <span class="hljs-comment">//（顺时针左上，右上，右下，左下）</span>
     * </code></pre>
     */
    private Object borderRadius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.shadowBlur">https://echarts.apache.org/v4/zh/option.html#title.shadowBlur</a>
     * <br/>序号: 26
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形阴影的模糊大小。该属性配合 <code class="codespan">shadowColor</code>,<code class="codespan">shadowOffsetX</code>, <code class="codespan">shadowOffsetY</code> 一起设置图形的阴影效果。</p>
     * <p>示例：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">shadowColor</span>: <span class="hljs-string">'rgba(0, 0, 0, 0.5)'</span>,
     *     <span class="hljs-attr">shadowBlur</span>: <span class="hljs-number">10</span>
     * }
     * </code></pre>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code> 以及值不为 <code class="codespan">tranparent</code> 的背景色 <code class="codespan">backgroundColor</code>。</p>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.shadowColor">https://echarts.apache.org/v4/zh/option.html#title.shadowColor</a>
     * <br/>序号: 27
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.shadowOffsetX">https://echarts.apache.org/v4/zh/option.html#title.shadowOffsetX</a>
     * <br/>序号: 28
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code>。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#title.shadowOffsetY">https://echarts.apache.org/v4/zh/option.html#title.shadowOffsetY</a>
     * <br/>序号: 29
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     * <p><strong>注意</strong>：此配置项生效的前提是，设置了 <code class="codespan">show: true</code>。</p>
     */
    private Integer shadowOffsetY;
}
