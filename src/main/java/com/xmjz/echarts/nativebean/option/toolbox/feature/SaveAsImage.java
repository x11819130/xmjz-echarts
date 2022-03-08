package com.xmjz.echarts.nativebean.option.toolbox.feature;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.toolbox.feature.saveAsImage.Emphasis;
import com.xmjz.echarts.nativebean.option.toolbox.feature.saveAsImage.IconStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage">#toolbox.feature.saveAsImage</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>保存为图片。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class SaveAsImage extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage.type">#toolbox.feature.saveAsImage.type</a>
     * <br/>默认值: 'png'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>保存的图片格式。</p>
     * <ul>
     * <li>如果 <code class="codespan">renderer</code> 的类型在 <a href="api.html#echarts.init" target="_blank">初始化图表</a> 时被设为 <code class="codespan">'canvas'</code>（默认），则支持 <code class="codespan">'png'</code>（默认）和 <code class="codespan">'jpg'</code>；</li>
     * <li>如果 <code class="codespan">renderer</code> 的类型在 <a href="api.html#echarts.init" target="_blank">初始化图表</a> 时被设为 <code class="codespan">'svg'</code>，则 <code class="codespan">type</code> 只支持 <code class="codespan">'svg'</code>（<code class="codespan">'svg'</code> 格式的图片从 <code class="codespan">v4.8.0</code> 开始支持）。</li>
     * </ul>
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage.name">#toolbox.feature.saveAsImage.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>保存的文件名称，默认使用 <a href="https://echarts.apache.org/zh/option.html#title.text">title.text</a> 作为名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage.backgroundColor">#toolbox.feature.saveAsImage.backgroundColor</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>保存的图片背景色，默认使用 <a href="https://echarts.apache.org/zh/option.html#backgroundColor">backgroundColor</a>，如果<code class="codespan">backgroundColor</code>不存在的话会取白色。</p>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage.connectedBackgroundColor">#toolbox.feature.saveAsImage.connectedBackgroundColor</a>
     * <br/>默认值: '#fff'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>如果图表使用了 <a href="api.html#echarts.connect" target="_blank">echarts.connect</a> 对多个图表进行联动，则在导出图片时会导出这些联动的图表。该配置项决定了图表与图表之间间隙处的填充色。</p>
     */
    private String connectedBackgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage.excludeComponents">#toolbox.feature.saveAsImage.excludeComponents</a>
     * <br/>默认值: ['toolbox']
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>保存为图片时忽略的组件列表，默认忽略工具栏。</p>
     */
    private List<?> excludeComponents;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage.show">#toolbox.feature.saveAsImage.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示该工具。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage.title">#toolbox.feature.saveAsImage.title</a>
     * <br/>默认值: '保存为图片'
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     */
    private Boolean title;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage.icon">#toolbox.feature.saveAsImage.icon</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage.iconStyle">#toolbox.feature.saveAsImage.iconStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>保存为图片 icon 样式设置。由于 icon 的文本信息只在 icon hover 时候才显示，所以文字相关的配置项请在 <code class="codespan">emphasis</code> 下设置。</p>
     */
    private IconStyle iconStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage.emphasis">#toolbox.feature.saveAsImage.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage.pixelRatio">#toolbox.feature.saveAsImage.pixelRatio</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>保存图片的分辨率比例，默认跟容器相同大小，如果需要保存更高分辨率的，可以设置为大于 1 的值，例如 2。</p>
     */
    private Integer pixelRatio;
}
