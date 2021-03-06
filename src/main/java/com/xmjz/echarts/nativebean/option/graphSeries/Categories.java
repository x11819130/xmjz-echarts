package com.xmjz.echarts.nativebean.option.graphSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories">https://echarts.apache.org/zh/option.html#series-graph.categories</a>
 * <br/>序号: 31
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>节点分类的类目，可选。</p>
 * <p>如果节点有分类的话可以通过 <a href="#series-graph.data.category">data[i].category</a> 指定每个节点的类目，类目的样式会被应用到节点样式上。<a href="#legend">图例</a>也可以基于<code class="codespan">categories</code>名字展现和筛选。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Categories implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories.name">https://echarts.apache.org/zh/option.html#series-graph.categories.name</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>类目名称，用于和 <a href="#legend">legend</a> 对应以及格式化 <a href="#tooltip">tooltip</a> 的内容。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories.symbol">https://echarts.apache.org/zh/option.html#series-graph.categories.symbol</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该类目节点标记的图形。</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories.symbolSize">https://echarts.apache.org/zh/option.html#series-graph.categories.symbolSize</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>该类目节点标记的大小，可以设置成诸如 <code class="codespan">10</code> 这样单一的数字，也可以用数组分开表示宽和高，例如 <code class="codespan">[20, 10]</code> 表示标记宽为<code class="codespan">20</code>，高为<code class="codespan">10</code>。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories.symbolRotate">https://echarts.apache.org/zh/option.html#series-graph.categories.symbolRotate</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>该类目节点标记的旋转角度（而非弧度）。正值表示逆时针旋转。注意在 <code class="codespan">markLine</code> 中当 <code class="codespan">symbol</code> 为 <code class="codespan">'arrow'</code> 时会忽略 <code class="codespan">symbolRotate</code> 强制设置为切线的角度。</p>
     */
    private Integer symbolRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories.symbolKeepAspect">https://echarts.apache.org/zh/option.html#series-graph.categories.symbolKeepAspect</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>如果 <code class="codespan">symbol</code> 是 <code class="codespan">path://</code> 的形式，是否在缩放时保持该图形的长宽比。</p>
     */
    private Boolean symbolKeepAspect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories.symbolOffset">https://echarts.apache.org/zh/option.html#series-graph.categories.symbolOffset</a>
     * <br/>序号: 6
     * <br/>默认值: [0,0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>该类目节点标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。</p>
     * <p>例如 <code class="codespan">[0, '50%']</code> 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。</p>
     */
    private List<?> symbolOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories.itemStyle">https://echarts.apache.org/zh/option.html#series-graph.categories.itemStyle</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该类目节点的样式。</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories.label">https://echarts.apache.org/zh/option.html#series-graph.categories.label</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该类目节点标签的样式。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories.emphasis">https://echarts.apache.org/zh/option.html#series-graph.categories.emphasis</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该类目节点的高亮状态。</p>
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories.blur">https://echarts.apache.org/zh/option.html#series-graph.categories.blur</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>该类目节点的淡出状态。</p>
     */
    private Object blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.categories.select">https://echarts.apache.org/zh/option.html#series-graph.categories.select</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>该类目节点的选中状态。</p>
     */
    private Object select;
}
