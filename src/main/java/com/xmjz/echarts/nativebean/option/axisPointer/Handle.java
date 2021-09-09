package com.xmjz.echarts.nativebean.option.axisPointer;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.handle">https://echarts.apache.org/zh/option.html#axisPointer.handle</a>
 * <br/>序号: 12
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>拖拽手柄，适用于触屏的环境。参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-tooltip-touch&amp;edit=1&amp;reset=1" target="_blank">例子</a>。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Handle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.handle.show">https://echarts.apache.org/zh/option.html#axisPointer.handle.show</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>当 show 设为 <code class="codespan">true</code> 时开启，这时显示手柄，并且 axisPointer 会一直显示。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.handle.icon">https://echarts.apache.org/zh/option.html#axisPointer.handle.icon</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>手柄的图标。</p>
     * <p>可以通过 <code class="codespan">'image://url'</code> 设置为图片，其中 URL 为图片的链接，或者 <code class="codespan">dataURI</code>。</p>
     * <p>URL 为图片链接例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://http://xxx.xxx.xxx/a/b.png'</span>
     * </code></pre><p>URL 为 <code class="codespan">dataURI</code> 例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://data:image/gif;base64,R0lGODlhEAAQAMQAAORHHOVSKudfOulrSOp3WOyDZu6QdvCchPGolfO0o/XBs/fNwfjZ0frl3/zy7////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAkAABAALAAAAAAQABAAAAVVICSOZGlCQAosJ6mu7fiyZeKqNKToQGDsM8hBADgUXoGAiqhSvp5QAnQKGIgUhwFUYLCVDFCrKUE1lBavAViFIDlTImbKC5Gm2hB0SlBCBMQiB0UjIQA7'</span>
     * </code></pre><p>可以通过 <code class="codespan">'path://'</code> 将图标设置为任意的矢量路径。这种方式相比于使用图片的方式，不用担心因为缩放而产生锯齿或模糊，而且可以设置为任意颜色。路径图形会自适应调整为合适的大小。路径的格式参见 <a href="http://www.w3.org/TR/SVG/paths.html#PathData" target="_blank">SVG PathData</a>。可以从 Adobe Illustrator 等工具编辑导出。</p>
     * <p>例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'path://M30.9,53.2C16.8,53.2,5.3,41.7,5.3,27.6S16.8,2,30.9,2C45,2,56.4,13.5,56.4,27.6S45,53.2,30.9,53.2z M30.9,3.5C17.6,3.5,6.8,14.4,6.8,27.6c0,13.3,10.8,24.1,24.101,24.1C44.2,51.7,55,40.9,55,27.6C54.9,14.4,44.1,3.5,30.9,3.5z M36.9,35.8c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H36c0.5,0,0.9,0.4,0.9,1V35.8z M27.8,35.8 c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H27c0.5,0,0.9,0.4,0.9,1L27.8,35.8L27.8,35.8z'</span>
     * </code></pre><p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=doc-example/axisPointer-handle-image&amp;edit=1&amp;reset=1" target="_blank">使用图片的例子</a></p>
     */
    private Object icon;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.handle.size">https://echarts.apache.org/zh/option.html#axisPointer.handle.size</a>
     * <br/>序号: 3
     * <br/>默认值: 45
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>手柄的尺寸，可以设置单值，如 <code class="codespan">45</code>，也可以设置为数组：<code class="codespan">[width, height]</code>。</p>
     */
    private Object size;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.handle.margin">https://echarts.apache.org/zh/option.html#axisPointer.handle.margin</a>
     * <br/>序号: 4
     * <br/>默认值: 50
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>手柄与轴的距离。注意，这是手柄中心点和轴的距离。</p>
     */
    private Integer margin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.handle.color">https://echarts.apache.org/zh/option.html#axisPointer.handle.color</a>
     * <br/>序号: 5
     * <br/>默认值: #333
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>手柄颜色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.handle.throttle">https://echarts.apache.org/zh/option.html#axisPointer.handle.throttle</a>
     * <br/>序号: 6
     * <br/>默认值: 40
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>手柄拖拽时触发视图更新周期，单位毫秒，调大这个数值可以改善性能，但是降低体验。</p>
     */
    private Integer throttle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.handle.shadowBlur">https://echarts.apache.org/zh/option.html#axisPointer.handle.shadowBlur</a>
     * <br/>序号: 7
     * <br/>默认值: 3
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形阴影的模糊大小。该属性配合 <code class="codespan">shadowColor</code>,<code class="codespan">shadowOffsetX</code>, <code class="codespan">shadowOffsetY</code> 一起设置图形的阴影效果。</p>
     * <p>示例：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">shadowColor</span>: <span class="hljs-string">'rgba(0, 0, 0, 0.5)'</span>,
     *     <span class="hljs-attr">shadowBlur</span>: <span class="hljs-number">10</span>
     * }
     * </code></pre>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.handle.shadowColor">https://echarts.apache.org/zh/option.html#axisPointer.handle.shadowColor</a>
     * <br/>序号: 8
     * <br/>默认值: #aaa
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.handle.shadowOffsetX">https://echarts.apache.org/zh/option.html#axisPointer.handle.shadowOffsetX</a>
     * <br/>序号: 9
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#axisPointer.handle.shadowOffsetY">https://echarts.apache.org/zh/option.html#axisPointer.handle.shadowOffsetY</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
}
