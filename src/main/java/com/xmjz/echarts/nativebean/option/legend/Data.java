package com.xmjz.echarts.nativebean.option.legend;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.legend.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.legend.data.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.data">#legend.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>图例的数据数组。数组项通常为一个字符串，每一项代表一个系列的 <code class="codespan">name</code>（如果是<a href="https://echarts.apache.org/zh/option.html#series-pie">饼图</a>，也可以是饼图单个数据的 <code class="codespan">name</code>）。图例组件会自动根据对应系列的图形标记（symbol）来绘制自己的颜色和标记，特殊字符串 <code class="codespan">''</code>（空字符串）或者 <code class="codespan">'\n'</code>（换行字符串）用于图例的换行。</p>
 * <p>如果 <code class="codespan">data</code> 没有被指定，会自动从当前系列中获取。多数系列会取自 <a href="https://echarts.apache.org/zh/option.html#series.name">series.name</a> 或者 <a href="https://echarts.apache.org/zh/option.html#series.encode">series.encode</a> 的 <code class="codespan">seriesName</code> 所指定的维度。如 <a href="https://echarts.apache.org/zh/option.html#series-pie">饼图</a> and <a href="https://echarts.apache.org/zh/option.html#series-funnel">漏斗图</a> 等会取自 series.data 中的 name。</p>
 * <p>如果要设置单独一项的样式，也可以把该项写成配置项对象。此时必须使用 <code class="codespan">name</code> 属性对应表示系列的 <code class="codespan">name</code>。</p>
 * <p>示例</p>
 * <pre><code class="hljs javascript">data: [{
 *     <span class="hljs-attr">name</span>: <span class="hljs-string">'系列1'</span>,
 *     <span class="hljs-comment">// 强制设置图形为圆。</span>
 *     <span class="hljs-attr">icon</span>: <span class="hljs-string">'circle'</span>,
 *     <span class="hljs-comment">// 设置文本为红色</span>
 *     <span class="hljs-attr">textStyle</span>: {
 *         <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>
 *     }
 * }]
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.data.name">#legend.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图例项的名称，应等于某系列的<code class="codespan">name</code>值（如果是饼图，也可以是饼图单个数据的 <code class="codespan">name</code>）。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.data.icon">#legend.data.icon</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>图例项的 icon。</p>
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
    private String icon;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.data.itemStyle">#legend.data.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图例项的图形样式。其属性的取值为 <code class="codespan">'inherit'</code> 时，表示继承系列中的属性值。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.data.lineStyle">#legend.data.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图例项图形中线的样式，用于诸如折线图图例横线的样式设置。其属性的取值为 <code class="codespan">'inherit'</code> 时，表示继承系列中的属性值。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.data.symbolRotate">#legend.data.symbolRotate</a>
     * <br/>默认值: 'inherit'
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>图形旋转角度，类型为 <code class="codespan">number | 'inherit'</code>。如果为 <code class="codespan">'inherit'</code>，表示取系列的 <code class="codespan">symbolRotate</code>。</p>
     */
    private Object symbolRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#legend.data.textStyle">#legend.data.textStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图例项的文本样式。</p>
     */
    private Object textStyle;
}
