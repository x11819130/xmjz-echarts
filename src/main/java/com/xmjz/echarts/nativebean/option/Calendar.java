package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.calendar.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar">https://echarts.apache.org/v4/zh/option.html#calendar</a>
 * <br/>序号: 22
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>日历坐标系组件。</p>
 * <p>在ECharts中，我们非常有创意地实现了日历图，是通过使用日历坐标系组件来达到日历图效果的，如下方的几个示例图所示，我们可以在热力图、散点图、关系图中使用日历坐标系。</p>
 * <p>在日历坐标系中使用热力图的示例:</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=calendar-heatmap&amp;edit=1&amp;reset=1" width="800" height="400"><iframe />
 *
 *
 * <p>在日历坐标系中使用散点图的示例:</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=calendar-effectscatter&edit=1&reset=1" width="800" height="600"><iframe />
 *
 *
 * <p>在日历坐标系中使用关系图（以及混合图表）的示例:</p>
 * <iframe  data-src="https://echarts.apache.org/examples/zh/view.html?c=calendar-graph&edit=1&reset=1" width="600" height="600"><iframe />
 *
 *
 * <p>灵活利用 echarts 图表和坐标系的组合，以及 API，可以实现更丰富的效果。
 * <a href="https://echarts.apache.org/examples/zh/editor.html?c=calendar-lunar&amp;edit=1&amp;reset=1" target="_blank">在日历中使用文字</a>、
 * <a href="https://echarts.apache.org/examples/zh/editor.html?c=calendar-pie&amp;edit=1&amp;reset=1" target="_blank">在日历中放置饼图</a></p>
 * <hr>
 * <p><strong>水平和垂直放置日历</strong></p>
 * <p>在日历坐标系可以水平放置，也可以垂直放置。如上面的例子，使用热力图时，经常是水平放置的。但是如果需要格子的尺寸大些，水平放置就过于宽了，于是也可以选择垂直放置。参见 <a href="#calendar.orient">calendar.orient</a>。</p>
 * <hr>
 * <p><strong>尺寸的自适应</strong></p>
 * <p>可以设置日历坐标系使他支持不同尺寸的容器（页面）大小变化的自适应。首先，和 echarts 其他组件一样，日历坐标系可以选择使用 <a href="#calendar.left">left</a> <a href="#calendar.right">right</a> <a href="#calendar.top">top</a> <a href="bottom" target="_blank">bottom</a> <a href="#calendar.width">width</a> <a href="#calendar.height">height</a> 来描述尺寸和位置，从而将日历摆放在上下左右各种位置，并随着页面尺寸变动而改变自身尺寸。另外，也可以使用 <a href="#calendar.cellSize">cellSize</a> 来固定日历格子的长宽。</p>
 * <hr>
 * <p><strong>中西方日历习惯的支持</strong></p>
 * <p>中西方日历有所差别，西方常使用星期日作为一周的第一天，中国使用星期一为一周的第一天。日历坐标系做了这种切换的支持。参见 <a href="#calendar.dayLabel.firstDay">calendar.dayLabel.firstDay</a>。</p>
 * <p>另外，日历上的『月份』和『星期几』的文字，也可以较方便的切换中英文，甚至自定义。参见 <a href="#calendar.dayLabel.nameMap">calendar.dayLabel.nameMap</a> <a href="#calendar.monthLabel.nameMap">calendar.monthLabel.nameMap</a>。</p>
 * <hr>
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
public class Calendar implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.id">https://echarts.apache.org/v4/zh/option.html#calendar.id</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.zlevel">https://echarts.apache.org/v4/zh/option.html#calendar.zlevel</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.z">https://echarts.apache.org/v4/zh/option.html#calendar.z</a>
     * <br/>序号: 3
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.left">https://echarts.apache.org/v4/zh/option.html#calendar.left</a>
     * <br/>序号: 4
     * <br/>默认值: 80
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>calendar组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.top">https://echarts.apache.org/v4/zh/option.html#calendar.top</a>
     * <br/>序号: 5
     * <br/>默认值: 60
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>calendar组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.right">https://echarts.apache.org/v4/zh/option.html#calendar.right</a>
     * <br/>序号: 6
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>calendar组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.bottom">https://echarts.apache.org/v4/zh/option.html#calendar.bottom</a>
     * <br/>序号: 7
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>calendar组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.width">https://echarts.apache.org/v4/zh/option.html#calendar.width</a>
     * <br/>序号: 8
     * <br/>默认值: auto
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>日历坐标的整体宽度</p>
     * <p>注意: 默认cellSize 为20，若设置了<code class="codespan">width</code>的值, 则<code class="codespan">cellSize</code>中的宽度强制转为<code class="codespan">auto</code>;</p>
     */
    private Object width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.height">https://echarts.apache.org/v4/zh/option.html#calendar.height</a>
     * <br/>序号: 9
     * <br/>默认值: auto
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>日历坐标的整体高度，</p>
     * <p>注意: 默认cellSize 为20，若设置了<code class="codespan">height</code>的值, 则<code class="codespan">cellSize</code>中的高度强制转为<code class="codespan">auto</code>;</p>
     */
    private Object height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.range">https://echarts.apache.org/v4/zh/option.html#calendar.range</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Array"]
     * <br/>描述:
     * <p>必填，日历坐标的范围 支持多种格式</p>
     * <p>使用示例：</p>
     * <pre><code class="lang-js hljs javascript">
     * <span class="hljs-comment">// 某一年</span>
     * <span class="hljs-attr">range</span>: <span class="hljs-number">2017</span>
     *
     * <span class="hljs-comment">// 某个月</span>
     * <span class="hljs-attr">range</span>: <span class="hljs-string">'2017-02'</span>
     *
     * <span class="hljs-comment">// 某个区间</span>
     * <span class="hljs-attr">range</span>: [<span class="hljs-string">'2017-01-02'</span>, <span class="hljs-string">'2017-02-23'</span>]
     *
     * <span class="hljs-comment">// 注意 此写法会识别为['2017-01-01', '2017-02-01']</span>
     * <span class="hljs-attr">range</span>: [<span class="hljs-string">'2017-01'</span>, <span class="hljs-string">'2017-02'</span>]
     *
     * </code></pre>
     */
    private Object range;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.cellSize">https://echarts.apache.org/v4/zh/option.html#calendar.cellSize</a>
     * <br/>序号: 11
     * <br/>默认值: 20
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>日历每格框的大小，可设置单值 或数组  第一个元素是宽 第二个元素是高。
     * 支持设置自适应：<code class="codespan">auto</code>, 默认为高宽均为20</p>
     * <p>使用示例：</p>
     * <pre><code class="lang-js hljs javascript">
     * <span class="hljs-comment">// 设置宽高均为20</span>
     * <span class="hljs-attr">cellSize</span>: <span class="hljs-number">20</span>
     *
     * <span class="hljs-comment">// 设置宽为20，高为40</span>
     * <span class="hljs-attr">cellSize</span>: [<span class="hljs-number">20</span>, <span class="hljs-number">40</span>]
     *
     * <span class="hljs-comment">// 设置宽高均为40</span>
     * <span class="hljs-attr">cellSize</span>: [<span class="hljs-number">40</span>]
     *
     * <span class="hljs-comment">// 设置宽高均自适应</span>
     * <span class="hljs-attr">cellSize</span>: <span class="hljs-string">'auto'</span>
     *
     * <span class="hljs-comment">// 设置宽自适应，高为40</span>
     * <span class="hljs-attr">cellSize</span>: [<span class="hljs-string">'auto'</span>, <span class="hljs-number">40</span>]
     *
     * </code></pre>
     */
    private Object cellSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.orient">https://echarts.apache.org/v4/zh/option.html#calendar.orient</a>
     * <br/>序号: 12
     * <br/>默认值: horizontal
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>日历坐标的布局朝向。</p>
     * <p>可选：</p>
     * <ul>
     * <li>'horizontal'</li>
     * <li>'vertical'</li>
     * </ul>
     */
    private String orient;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.splitLine">https://echarts.apache.org/v4/zh/option.html#calendar.splitLine</a>
     * <br/>序号: 13
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>设置日历坐标分隔线的样式。</p>
     */
    private SplitLine splitLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.itemStyle">https://echarts.apache.org/v4/zh/option.html#calendar.itemStyle</a>
     * <br/>序号: 14
     * <br/>默认值: #fff
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>设置日历格的样式</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.dayLabel">https://echarts.apache.org/v4/zh/option.html#calendar.dayLabel</a>
     * <br/>序号: 15
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>设置日历坐标中 星期轴的样式</p>
     */
    private DayLabel dayLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel">https://echarts.apache.org/v4/zh/option.html#calendar.monthLabel</a>
     * <br/>序号: 16
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>设置日历坐标中 月份轴的样式</p>
     */
    private MonthLabel monthLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.yearLabel">https://echarts.apache.org/v4/zh/option.html#calendar.yearLabel</a>
     * <br/>序号: 17
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>设置日历坐标中 年的样式</p>
     */
    private YearLabel yearLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#calendar.silent">https://echarts.apache.org/v4/zh/option.html#calendar.silent</a>
     * <br/>序号: 18
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
}
