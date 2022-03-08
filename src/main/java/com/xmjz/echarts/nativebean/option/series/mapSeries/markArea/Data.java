package com.xmjz.echarts.nativebean.option.series.mapSeries.markArea;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.mapSeries.markArea.data.Blur;
import com.xmjz.echarts.nativebean.option.series.mapSeries.markArea.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.mapSeries.markArea.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.mapSeries.markArea.data.Label;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data">#series-map.markArea.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["any"]
 * <br/>描述:
 * <p>标域的数据数组。每个数组项是一个两个项的数组，分别表示标域左上角和右下角的位置，每个项支持通过下面几种方式指定自己的位置</p>
 * <ol>
 * <li>通过 <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.x">x</a>, <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.y">y</a> 属性指定相对容器的屏幕坐标，单位像素，支持百分比。</li>
 * </ol>
 * <ol start="2">
 * <li>用 <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.coord">coord</a> 属性指定数据在相应坐标系上的坐标位置，单个维度支持设置 <code class="codespan">'min'</code>, <code class="codespan">'max'</code>, <code class="codespan">'average'</code>。</li>
 * </ol>
 * <p>当多个属性同时存在时，优先级按上述的顺序。</p>
 * <pre><code class="hljs javascript">data: [
 *
 *
 *     [
 *         {
 *             <span class="hljs-attr">name</span>: <span class="hljs-string">'两个坐标之间的标域'</span>,
 *             <span class="hljs-attr">coord</span>: [<span class="hljs-number">10</span>, <span class="hljs-number">20</span>]
 *         },
 *         {
 *             <span class="hljs-attr">coord</span>: [<span class="hljs-number">20</span>, <span class="hljs-number">30</span>]
 *         }
 *     ], [
 *         {
 *             <span class="hljs-attr">name</span>: <span class="hljs-string">'60分到80分'</span>,
 *             <span class="hljs-attr">yAxis</span>: <span class="hljs-number">60</span>
 *         },
 *         {
 *             <span class="hljs-attr">yAxis</span>: <span class="hljs-number">80</span>
 *         }
 *     ], [
 *         {
 *             <span class="hljs-attr">name</span>: <span class="hljs-string">'所有数据范围区间'</span>,
 *             <span class="hljs-attr">coord</span>: [<span class="hljs-string">'min'</span>, <span class="hljs-string">'min'</span>]
 *         },
 *         {
 *             <span class="hljs-attr">coord</span>: [<span class="hljs-string">'max'</span>, <span class="hljs-string">'max'</span>]
 *         }
 *     ],
 * [
 *         {
 *             <span class="hljs-attr">name</span>: <span class="hljs-string">'两个屏幕坐标之间的标域'</span>,
 *             <span class="hljs-attr">x</span>: <span class="hljs-number">100</span>,
 *             <span class="hljs-attr">y</span>: <span class="hljs-number">100</span>
 *         }, {
 *             <span class="hljs-attr">x</span>: <span class="hljs-string">'90%'</span>,
 *             <span class="hljs-attr">y</span>: <span class="hljs-string">'10%'</span>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.valueIndex">#series-map.markArea.data.0.valueIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>在使用 <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.type">type</a> 时有效，用于指定在哪个维度上指定最大值最小值，可以是 <code class="codespan">0</code>（xAxis, radiusAxis），<code class="codespan">1</code>（yAxis, angleAxis），默认使用第一个数值轴所在的维度。</p>
     */
    private Integer valueIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.valueDim">#series-map.markArea.data.0.valueDim</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>在使用 <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.type">type</a> 时有效，用于指定在哪个维度上指定最大值最小值。这可以是维度的直接名称，例如折线图时可以是<code class="codespan">x</code>、<code class="codespan">angle</code>等、candlestick 图时可以是<code class="codespan">open</code>、<code class="codespan">close</code>等维度名称。</p>
     */
    private String valueDim;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.coord">#series-map.markArea.data.0.coord</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>起点或终点的坐标。坐标格式视系列的坐标系而定，可以是<a href="https://echarts.apache.org/zh/option.html#grid">直角坐标系</a>上的 <code class="codespan">x</code>, <code class="codespan">y</code>，也可以是<a href="https://echarts.apache.org/zh/option.html#polar">极坐标系</a>上的 <code class="codespan">radius</code>, <code class="codespan">angle</code>。</p>
     */
    private List<?> coord;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.name">#series-map.markArea.data.0.name</a>
     * <br/>默认值: '起点'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>标注名称，将会作为文字显示。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.x">#series-map.markArea.data.0.x</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>相对容器的屏幕 x 坐标，单位像素，支持百分比形式，例如 <code class="codespan">'20%'</code>。</p>
     */
    private Integer x;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.y">#series-map.markArea.data.0.y</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>相对容器的屏幕 y 坐标，单位像素，支持百分比形式，例如 <code class="codespan">'20%'</code>。</p>
     */
    private Integer y;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.value">#series-map.markArea.data.0.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标域值，可以不设。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.itemStyle">#series-map.markArea.data.0.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该数据项区域的样式，起点和终点项的<code class="codespan">itemStyle</code>会合并到一起。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.label">#series-map.markArea.data.0.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该数据项标签的样式，起点和终点项的<code class="codespan">label</code>会合并到一起。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.emphasis">#series-map.markArea.data.0.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.blur">#series-map.markArea.data.0.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Blur blur;
}
