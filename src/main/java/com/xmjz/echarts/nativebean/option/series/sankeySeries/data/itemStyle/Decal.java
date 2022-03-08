package com.xmjz.echarts.nativebean.option.series.sankeySeries.data.itemStyle;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.itemStyle.decal">#series-sankey.data.itemStyle.decal</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>图形的贴花图案，在 <a href="https://echarts.apache.org/zh/option.html#aria.enabled">aria.enabled</a> 与 <a href="https://echarts.apache.org/zh/option.html#aria.decal.show">aria.decal.show</a> 都是 <code class="codespan">true</code> 的情况下才生效。</p>
 * <p>如果为 <code class="codespan">'none'</code> 表示不使用贴花图案。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Decal extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.itemStyle.decal.symbol">#series-sankey.data.itemStyle.decal.symbol</a>
     * <br/>默认值: 'rect'
     * <br/>js类型: ["string","Array"]
     * <br/>描述:
     * <p>贴花的图案，如果是 <code class="codespan">string[]</code> 表示循环使用数组中的图案。</p>
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
    private Object symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.itemStyle.decal.symbolSize">#series-sankey.data.itemStyle.decal.symbolSize</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>取值范围：<code class="codespan">0</code> 到 <code class="codespan">1</code>，表示占图案区域的百分比。</p>
     */
    private Integer symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.itemStyle.decal.symbolKeepAspect">#series-sankey.data.itemStyle.decal.symbolKeepAspect</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否保持图案的长宽比。</p>
     */
    private Boolean symbolKeepAspect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.itemStyle.decal.color">#series-sankey.data.itemStyle.decal.color</a>
     * <br/>默认值: 'rgba(0, 0, 0, 0.2)'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>贴花图案的颜色，建议使用半透明色，这样能叠加在系列本身的颜色上。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.itemStyle.decal.backgroundColor">#series-sankey.data.itemStyle.decal.backgroundColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>贴花的背景色，将会覆盖在系列本身颜色之上，贴花图案之下。</p>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.itemStyle.decal.dashArrayX">#series-sankey.data.itemStyle.decal.dashArrayX</a>
     * <br/>默认值: 5
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>贴花图案的基本模式是在横向和纵向上分别以<code class="codespan">图案 - 空白 - 图案 - 空白 - 图案 - 空白</code>的形式无限循环。通过设置每个图案和空白的长度，可以实现复杂的图案效果。</p>
     * <p><code class="codespan">dashArrayX</code> 控制了横向的图案模式。当其值为 <code class="codespan">number</code> 或 <code class="codespan">number[]</code> 类型时，与 <a href="https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-dasharray" target="_blank">SVG stroke-dasharray</a> 类似。</p>
     * <ul>
     * <li><p>如果是 <code class="codespan">number</code> 类型，表示图案和空白分别是这个值。如 <code class="codespan">5</code> 表示先显示宽度为 5 的图案，然后空 5 像素，再然后显示宽度为 5 的图案……</p>
     * </li>
     * <li><p>如果是 <code class="codespan">number[]</code> 类型，则表示图案和空白依次为数组值的循环。如：<code class="codespan">[5, 10, 2, 6]</code> 表示图案宽 5 像素，然后空 10 像素，然后图案宽 2 像素，然后空 6 像素，然后图案宽 5 像素……</p>
     * </li>
     * <li><p>如果是 <code class="codespan">(number | number[])[]</code> 类型，表示每行的图案和空白依次为数组值的循环。如：<code class="codespan">[10, [2, 5]]</code> 表示第一行以图案 10 像素空 10 像素循环，第二行以图案 2 像素空 5 像素循环，第三行以图案 10 像素空 10 像素循环……</p>
     * </li>
     * </ul>
     * <p>可以结合以下的例子理解本接口：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/aria-decal&amp;edit=1&amp;reset=1" width="700" height="300"></iframe>
     */
    private Object dashArrayX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.itemStyle.decal.dashArrayY">#series-sankey.data.itemStyle.decal.dashArrayY</a>
     * <br/>默认值: 5
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>贴花图案的基本模式是在横向和纵向上分别以<code class="codespan">图案 - 空白 - 图案 - 空白 - 图案 - 空白</code>的形式无限循环。通过设置每个图案和空白的长度，可以实现复杂的图案效果。</p>
     * <p><code class="codespan">dashArrayY</code> 控制了横向的图案模式。与 <a href="https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke-dasharray" target="_blank">SVG stroke-dasharray</a> 类似。</p>
     * <ul>
     * <li><p>如果是 <code class="codespan">number</code> 类型，表示图案和空白分别是这个值。如 <code class="codespan">5</code> 表示先显示高度为 5 的图案，然后空 5 像素，再然后显示高度为 5 的图案……</p>
     * </li>
     * <li><p>如果是 <code class="codespan">number[]</code> 类型，则表示图案和空白依次为数组值的循环。如：<code class="codespan">[5, 10, 2, 6]</code> 表示图案高 5 像素，然后空 10 像素，然后图案高 2 像素，然后空 6 像素，然后图案高 5 像素……</p>
     * </li>
     * </ul>
     * <p>可以结合以下的例子理解本接口：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/aria-decal&amp;edit=1&amp;reset=1" width="700" height="300"></iframe>
     */
    private Object dashArrayY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.itemStyle.decal.rotation">#series-sankey.data.itemStyle.decal.rotation</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图案的整体旋转角度（弧度制），取值范围从 <code class="codespan">-Math.PI</code> 到 <code class="codespan">Math.PI</code>。</p>
     */
    private Integer rotation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.itemStyle.decal.maxTileWidth">#series-sankey.data.itemStyle.decal.maxTileWidth</a>
     * <br/>默认值: 512
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>生成的图案在未重复之前的宽度上限。通常不需要设置该值，当你发现图案在重复的时候出现不连续的接缝时，可以尝试提高该值。</p>
     */
    private Integer maxTileWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.data.itemStyle.decal.maxTileHeight">#series-sankey.data.itemStyle.decal.maxTileHeight</a>
     * <br/>默认值: 512
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>生成的图案在未重复之前的高度上限。通常不需要设置该值，当你发现图案在重复的时候出现不连续的接缝时，可以尝试提高该值。</p>
     */
    private Integer maxTileHeight;
}
