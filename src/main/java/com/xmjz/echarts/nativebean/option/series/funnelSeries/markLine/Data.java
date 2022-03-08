package com.xmjz.echarts.nativebean.option.series.funnelSeries.markLine;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.funnelSeries.markLine.data.Blur;
import com.xmjz.echarts.nativebean.option.series.funnelSeries.markLine.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.funnelSeries.markLine.data.Label;
import com.xmjz.echarts.nativebean.option.series.funnelSeries.markLine.data.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data">#series-funnel.markLine.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["any"]
 * <br/>描述:
 * <p>标线的数据数组。每个数组项可以是一个两个值的数组，分别表示线的起点和终点，每一项是一个对象，有下面几种方式指定起点或终点的位置。</p>
 * <ol>
 * <li>通过 <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.x">x</a>, <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.y">y</a> 属性指定相对容器的屏幕坐标，单位像素，支持百分比。</li>
 * </ol>
 * <p>当多个属性同时存在时，优先级按上述的顺序。</p>
 * <pre><code class="hljs javascript">data: [
 *
 * [
 *         {
 *             <span class="hljs-attr">name</span>: <span class="hljs-string">'两个屏幕坐标之间的标线'</span>,
 *             <span class="hljs-attr">x</span>: <span class="hljs-number">100</span>,
 *             <span class="hljs-attr">y</span>: <span class="hljs-number">100</span>
 *         },
 *         {
 *             <span class="hljs-attr">x</span>: <span class="hljs-number">500</span>,
 *             <span class="hljs-attr">y</span>: <span class="hljs-number">200</span>
 *         }
 *     ]
 * ]
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Data extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.name">#series-funnel.markLine.data.0.name</a>
     * <br/>默认值: '起点'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>标注名称，将会作为文字显示。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.x">#series-funnel.markLine.data.0.x</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>相对容器的屏幕 x 坐标，单位像素。</p>
     */
    private Integer x;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.y">#series-funnel.markLine.data.0.y</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>相对容器的屏幕 y 坐标，单位像素。</p>
     */
    private Integer y;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.xAxis">#series-funnel.markLine.data.0.xAxis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>x 值为给定值的标记线，仅对数据值是一项的设置有效。例如：</p>
     * <pre><code class="hljs javascript">data: [{
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'X 轴值为 100 的竖直线'</span>,
     *     <span class="hljs-attr">xAxis</span>: <span class="hljs-number">100</span>
     * }]
     * </code></pre><p>或对于 <code class="codespan">'time'</code> 类型的 xAxis，可以设置为：</p>
     * <pre><code class="hljs javascript">{
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'X 轴值为 "2020-01-01" 的竖直线'</span>,
     *     <span class="hljs-attr">xAxis</span>: <span class="hljs-string">'2020-01-01'</span>
     * }]
     * </code></pre>
     */
    private Object xAxis;

    public Object getxAxis() {
        return this.xAxis;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.yAxis">#series-funnel.markLine.data.0.yAxis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>Y 值为给定值的标记线，仅对数据值是一项的设置有效。例如：</p>
     * <pre><code class="hljs javascript">data: [{
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'Y 轴值为 100 的水平线'</span>,
     *     <span class="hljs-attr">yAxis</span>: <span class="hljs-number">100</span>
     * }]
     * </code></pre><p>或对于 <code class="codespan">'time'</code> 类型的 yAxis，可以设置为：</p>
     * <pre><code class="hljs javascript">{
     *     <span class="hljs-attr">name</span>: <span class="hljs-string">'Y 轴值为 "2020-01-01" 的水平线'</span>,
     *     <span class="hljs-attr">yAxis</span>: <span class="hljs-string">'2020-01-01'</span>
     * }]
     * </code></pre>
     */
    private Object yAxis;

    public Object getyAxis() {
        return this.yAxis;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.value">#series-funnel.markLine.data.0.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标注值，可以不设。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.symbol">#series-funnel.markLine.data.0.symbol</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>起点标记的图形。</p>
     * <p>ECharts 提供的标记类型包括</p>
     * <p><code class="codespan">'circle'</code>, <code class="codespan">'rect'</code>, <code class="codespan">'roundRect'</code>, <code class="codespan">'triangle'</code>, <code class="codespan">'diamond'</code>, <code class="codespan">'pin'</code>, <code class="codespan">'arrow'</code>, <code class="codespan">'none'</code></p>
     * <p>可以通过 <code class="codespan">'image://url'</code> 设置为图片，其中 URL 为图片的链接，或者 <code class="codespan">dataURI</code>。</p>
     * <p>URL 为图片链接例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://http://xxx.xxx.xxx/a/b.png'</span>
     * </code></pre><p>URL 为 <code class="codespan">dataURI</code> 例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://data:image/gif;base64,R0lGODlhEAAQAMQAAORHHOVSKudfOulrSOp3WOyDZu6QdvCchPGolfO0o/XBs/fNwfjZ0frl3/zy7////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAkAABAALAAAAAAQABAAAAVVICSOZGlCQAosJ6mu7fiyZeKqNKToQGDsM8hBADgUXoGAiqhSvp5QAnQKGIgUhwFUYLCVDFCrKUE1lBavAViFIDlTImbKC5Gm2hB0SlBCBMQiB0UjIQA7'</span>
     * </code></pre><p>可以通过 <code class="codespan">'path://'</code> 将图标设置为任意的矢量路径。这种方式相比于使用图片的方式，不用担心因为缩放而产生锯齿或模糊，而且可以设置为任意颜色。路径图形会自适应调整为合适的大小。路径的格式参见 <a href="http://www.w3.org/TR/SVG/paths.html#PathData" target="_blank">SVG PathData</a>。可以从 Adobe Illustrator 等工具编辑导出。</p>
     * <p>例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'path://M30.9,53.2C16.8,53.2,5.3,41.7,5.3,27.6S16.8,2,30.9,2C45,2,56.4,13.5,56.4,27.6S45,53.2,30.9,53.2z M30.9,3.5C17.6,3.5,6.8,14.4,6.8,27.6c0,13.3,10.8,24.1,24.101,24.1C44.2,51.7,55,40.9,55,27.6C54.9,14.4,44.1,3.5,30.9,3.5z M36.9,35.8c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H36c0.5,0,0.9,0.4,0.9,1V35.8z M27.8,35.8 c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H27c0.5,0,0.9,0.4,0.9,1L27.8,35.8L27.8,35.8z'</span>
     * </code></pre>
     */
    private String symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.symbolSize">#series-funnel.markLine.data.0.symbolSize</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>起点标记的大小，可以设置成诸如 <code class="codespan">10</code> 这样单一的数字，也可以用数组分开表示宽和高，例如 <code class="codespan">[20, 10]</code> 表示标记宽为<code class="codespan">20</code>，高为<code class="codespan">10</code>。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.symbolRotate">#series-funnel.markLine.data.0.symbolRotate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>起点标记的旋转角度（而非弧度）。正值表示逆时针旋转。注意在 <code class="codespan">markLine</code> 中当 <code class="codespan">symbol</code> 为 <code class="codespan">'arrow'</code> 时会忽略 <code class="codespan">symbolRotate</code> 强制设置为切线的角度。</p>
     */
    private Integer symbolRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.symbolKeepAspect">#series-funnel.markLine.data.0.symbolKeepAspect</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>如果 <code class="codespan">symbol</code> 是 <code class="codespan">path://</code> 的形式，是否在缩放时保持该图形的长宽比。</p>
     */
    private Boolean symbolKeepAspect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.symbolOffset">#series-funnel.markLine.data.0.symbolOffset</a>
     * <br/>默认值: [0, 0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>起点标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。</p>
     * <p>例如 <code class="codespan">[0, '-50%']</code> 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。</p>
     */
    private List<?> symbolOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.lineStyle">#series-funnel.markLine.data.0.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该数据项线的样式，起点和终点项的 <code class="codespan">lineStyle</code>会合并到一起。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.label">#series-funnel.markLine.data.0.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该数据项标签的样式，起点和终点项的 <code class="codespan">label</code>会合并到一起。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.emphasis">#series-funnel.markLine.data.0.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.markLine.data.0.blur">#series-funnel.markLine.data.0.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Blur blur;
}
