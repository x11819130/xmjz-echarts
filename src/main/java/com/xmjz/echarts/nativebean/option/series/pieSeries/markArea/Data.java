package com.xmjz.echarts.nativebean.option.series.pieSeries.markArea;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.pieSeries.markArea.data.Blur;
import com.xmjz.echarts.nativebean.option.series.pieSeries.markArea.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.pieSeries.markArea.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.pieSeries.markArea.data.Label;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.markArea.data">#series-pie.markArea.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["any"]
 * <br/>描述:
 * <p>标域的数据数组。每个数组项是一个两个项的数组，分别表示标域左上角和右下角的位置，每个项支持通过下面几种方式指定自己的位置</p>
 * <ol>
 * <li>通过 <a href="https://echarts.apache.org/zh/option.html#series-pie.markArea.data.0.x">x</a>, <a href="https://echarts.apache.org/zh/option.html#series-pie.markArea.data.0.y">y</a> 属性指定相对容器的屏幕坐标，单位像素，支持百分比。</li>
 * </ol>
 * <p>当多个属性同时存在时，优先级按上述的顺序。</p>
 * <pre><code class="hljs javascript">data: [
 *
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.markArea.data.0.name">#series-pie.markArea.data.0.name</a>
     * <br/>默认值: '起点'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>标注名称，将会作为文字显示。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.markArea.data.0.x">#series-pie.markArea.data.0.x</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>相对容器的屏幕 x 坐标，单位像素，支持百分比形式，例如 <code class="codespan">'20%'</code>。</p>
     */
    private Integer x;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.markArea.data.0.y">#series-pie.markArea.data.0.y</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>相对容器的屏幕 y 坐标，单位像素，支持百分比形式，例如 <code class="codespan">'20%'</code>。</p>
     */
    private Integer y;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.markArea.data.0.value">#series-pie.markArea.data.0.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>标域值，可以不设。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.markArea.data.0.itemStyle">#series-pie.markArea.data.0.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该数据项区域的样式，起点和终点项的<code class="codespan">itemStyle</code>会合并到一起。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.markArea.data.0.label">#series-pie.markArea.data.0.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该数据项标签的样式，起点和终点项的<code class="codespan">label</code>会合并到一起。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.markArea.data.0.emphasis">#series-pie.markArea.data.0.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pie.markArea.data.0.blur">#series-pie.markArea.data.0.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Blur blur;
}
