package com.xmjz.echarts.nativebean.option.gaugeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.anchor">https://echarts.apache.org/zh/option.html#series-gauge.anchor</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0</code> 开始支持</p>
 * </blockquote>
 * <p>表盘中指针的固定点。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Anchor implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.anchor.show">https://echarts.apache.org/zh/option.html#series-gauge.anchor.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示固定点。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.anchor.showAbove">https://echarts.apache.org/zh/option.html#series-gauge.anchor.showAbove</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>固定点是否显示在指针上面。</p>
     */
    private Boolean showAbove;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.anchor.size">https://echarts.apache.org/zh/option.html#series-gauge.anchor.size</a>
     * <br/>默认值: 6
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>固定点大小。</p>
     */
    private Integer size;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.anchor.icon">https://echarts.apache.org/zh/option.html#series-gauge.anchor.icon</a>
     * <br/>默认值: circle
     * <br/>js类型: ["string"]
     * <br/>描述:
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.anchor.offsetCenter">https://echarts.apache.org/zh/option.html#series-gauge.anchor.offsetCenter</a>
     * <br/>默认值: [0,0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>相对于仪表盘中心的偏移位置，数组第一项是水平方向的偏移，第二项是垂直方向的偏移。可以是绝对的数值，也可以是相对于仪表盘半径的百分比。</p>
     */
    private List<?> offsetCenter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.anchor.keepAspect">https://echarts.apache.org/zh/option.html#series-gauge.anchor.keepAspect</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>如果图标是 <code class="codespan">path://</code> 的形式，是否在缩放时保持该图形的长宽比。</p>
     */
    private Boolean keepAspect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.anchor.itemStyle">https://echarts.apache.org/zh/option.html#series-gauge.anchor.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>指针固定点样式。</p>
     */
    private Object itemStyle;
}
