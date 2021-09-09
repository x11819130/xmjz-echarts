package com.xmjz.echarts.nativebean.option.timeline;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle">https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle</a>
 * <br/>序号: 28
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>『当前项』（<code class="codespan">checkpoint</code>）的图形样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class CheckpointStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.symbol">https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.symbol</a>
     * <br/>序号: 1
     * <br/>默认值: circle
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>timeline.checkpointStyle 标记的图形。</p>
     * <p>ECharts 提供的标记类型包括
     * <code class="codespan">'circle'</code>, <code class="codespan">'rect'</code>, <code class="codespan">'roundRect'</code>, <code class="codespan">'triangle'</code>, <code class="codespan">'diamond'</code>, <code class="codespan">'pin'</code>, <code class="codespan">'arrow'</code>, <code class="codespan">'none'</code></p>
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.symbolSize">https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.symbolSize</a>
     * <br/>序号: 2
     * <br/>默认值: 13
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>timeline.checkpointStyle 标记的大小，可以设置成诸如 <code class="codespan">10</code> 这样单一的数字，也可以用数组分开表示宽和高，例如 <code class="codespan">[20, 10]</code> 表示标记宽为<code class="codespan">20</code>，高为<code class="codespan">10</code>。</p>
     */
    private Object symbolSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.symbolRotate">https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.symbolRotate</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>timeline.checkpointStyle 标记的旋转角度（而非弧度）。正值表示逆时针旋转。注意在 <code class="codespan">markLine</code> 中当 <code class="codespan">symbol</code> 为 <code class="codespan">'arrow'</code> 时会忽略 <code class="codespan">symbolRotate</code> 强制设置为切线的角度。</p>
     */
    private Integer symbolRotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.symbolKeepAspect">https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.symbolKeepAspect</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>如果 <code class="codespan">symbol</code> 是 <code class="codespan">path://</code> 的形式，是否在缩放时保持该图形的长宽比。</p>
     */
    private Boolean symbolKeepAspect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.symbolOffset">https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.symbolOffset</a>
     * <br/>序号: 5
     * <br/>默认值: [0,0]
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>timeline.checkpointStyle 标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。</p>
     * <p>例如 <code class="codespan">[0, '50%']</code> 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。</p>
     */
    private List<?> symbolOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.color">https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.color</a>
     * <br/>序号: 6
     * <br/>默认值: #c23531
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p><code class="codespan">timeline</code>组件中『当前项』（<code class="codespan">checkpoint</code>）的颜色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.borderWidth">https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.borderWidth</a>
     * <br/>序号: 7
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><code class="codespan">timeline</code>组件中『当前项』（<code class="codespan">checkpoint</code>）的边框宽度。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.borderColor">https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.borderColor</a>
     * <br/>序号: 8
     * <br/>默认值: rgba(194,53,49, 0.5)
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p><code class="codespan">timeline</code>组件中『当前项』（<code class="codespan">checkpoint</code>）的边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.animation">https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.animation</a>
     * <br/>序号: 9
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p><code class="codespan">timeline</code>组件中『当前项』（<code class="codespan">checkpoint</code>）在 <code class="codespan">timeline</code> 播放切换中的移动，是否有动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.animationDuration">https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.animationDuration</a>
     * <br/>序号: 10
     * <br/>默认值: 300
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><code class="codespan">timeline</code>组件中『当前项』（<code class="codespan">checkpoint</code>）的动画时长。</p>
     */
    private Integer animationDuration;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.animationEasing">https://echarts.apache.org/v4/zh/option.html#timeline.checkpointStyle.animationEasing</a>
     * <br/>序号: 11
     * <br/>默认值: quinticInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p><code class="codespan">timeline</code>组件中『当前项』（<code class="codespan">checkpoint</code>）的动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/view.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
}
