package com.xmjz.echarts.nativebean.option.linesSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.effect">https://echarts.apache.org/zh/option.html#series-lines.effect</a>
 * <br/>序号: 9
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>线特效的配置，见示例 <a href="https://echarts.apache.org/examples/zh/editor.html?c=geo-lines" target="_blank">模拟迁徙</a> 和 <a href="https://echarts.apache.org/examples/zh/editor.html?c=lines-bmap-effect" target="_blank">北京公交路线</a></p>
 * <p><strong>注意：</strong> 所有带有尾迹特效的图表需要单独放在一个层，也就是需要单独设置 <a href="#series-lines.zlevel">zlevel</a>，同时建议关闭该层的动画（<a href="#series-lines.animation">animation</a>: false）。不然位于同个层的其它系列的图形，和动画的<a href="#series-lines.label">标签</a>也会产生不必要的残影。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Effect implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.effect.show">https://echarts.apache.org/zh/option.html#series-lines.effect.show</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示特效。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.effect.period">https://echarts.apache.org/zh/option.html#series-lines.effect.period</a>
     * <br/>序号: 2
     * <br/>默认值: 4
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>特效动画的时间，单位为 s。</p>
     */
    private Integer period;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.effect.delay">https://echarts.apache.org/zh/option.html#series-lines.effect.delay</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>特效动画的延时，支持设置成数字或者回调。单位<code class="codespan">ms</code></p>
     */
    private Object delay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.effect.constantSpeed">https://echarts.apache.org/zh/option.html#series-lines.effect.constantSpeed</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>配置特效图形的移动动画是否是固定速度，单位<code class="codespan">像素/秒</code>，设置为大于 0 的值后会忽略 <a href="#series-lines.effect.period">period</a> 配置项。</p>
     */
    private Integer constantSpeed;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.effect.symbol">https://echarts.apache.org/zh/option.html#series-lines.effect.symbol</a>
     * <br/>序号: 5
     * <br/>默认值: circle
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>特效图形的标记。</p>
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
     * </code></pre><p>上面示例中就是使用自定义 path 的 symbol 表现飞机的图形。</p>
     * <p><strong>Tip:</strong> symbol 的角度会随着轨迹的切线变化，如果使用自定义 path 的 symbol，需要保证 path 图形的朝向是朝上的，这样在 symbol 沿着轨迹运动的时候可以保证图形始终朝着运动的方向。</p>
     */
    private String symbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.effect.symbolSize">https://echarts.apache.org/zh/option.html#series-lines.effect.symbolSize</a>
     * <br/>序号: 6
     * <br/>默认值: 3
     * <br/>js类型: ["Array","number"]
     * <br/>描述:
     * <p>特效标记的大小，可以设置成诸如 <code class="codespan">10</code> 这样单一的数字，也可以用数组分开表示高和宽，例如 <code class="codespan">[20, 10]</code> 表示标记宽为<code class="codespan">20</code>，高为<code class="codespan">10</code>。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.effect.color">https://echarts.apache.org/zh/option.html#series-lines.effect.color</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>特效标记的颜色，默认取 <a href="#series-lines.lineStyle.color">lineStyle.color</a>。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.effect.trailLength">https://echarts.apache.org/zh/option.html#series-lines.effect.trailLength</a>
     * <br/>序号: 8
     * <br/>默认值: 0.2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>特效尾迹的长度。取从 0 到 1 的值，数值越大尾迹越长。</p>
     */
    private Integer trailLength;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-lines.effect.loop">https://echarts.apache.org/zh/option.html#series-lines.effect.loop</a>
     * <br/>序号: 9
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否循环显示特效。</p>
     */
    private Boolean loop;
}
