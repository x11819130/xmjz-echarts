package com.xmjz.echarts.nativebean.option.toolbox.feature;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.toolbox.feature.dataView.Emphasis;
import com.xmjz.echarts.nativebean.option.toolbox.feature.dataView.IconStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView">#toolbox.feature.dataView</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>数据视图工具，可以展现当前图表所用的数据，编辑后可以动态更新。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class DataView extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.show">#toolbox.feature.dataView.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示该工具。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.title">#toolbox.feature.dataView.title</a>
     * <br/>默认值: '数据视图'
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     */
    private Boolean title;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.icon">#toolbox.feature.dataView.icon</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.iconStyle">#toolbox.feature.dataView.iconStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>数据视图 icon 样式设置。由于 icon 的文本信息只在 icon hover 时候才显示，所以文字相关的配置项请在 <code class="codespan">emphasis</code> 下设置。</p>
     */
    private IconStyle iconStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.emphasis">#toolbox.feature.dataView.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.readOnly">#toolbox.feature.dataView.readOnly</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否不可编辑（只读）。</p>
     */
    private Boolean readOnly;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.optionToContent">#toolbox.feature.dataView.optionToContent</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Function"]
     * <br/>描述:
     * <pre><code class="lang-ts hljs typescript">(option:<span class="hljs-built_in">Object</span>) =&gt; HTMLDomElement|<span class="hljs-built_in">string</span>
     * </code></pre>
     * <p>自定义 dataView 展现函数，用以取代默认的 textarea 使用更丰富的数据编辑。可以返回 dom 对象或者 html 字符串。</p>
     * <p>如下示例使用表格展现数据值：</p>
     * <pre><code class="lang-ts hljs typescript">optionToContent: <span class="hljs-function"><span class="hljs-keyword">function</span>(<span class="hljs-params">opt</span>) </span>{
     *     <span class="hljs-keyword">var</span> axisData = opt.xAxis[<span class="hljs-number">0</span>].data;
     *     <span class="hljs-keyword">var</span> series = opt.series;
     *     <span class="hljs-keyword">var</span> table = <span class="hljs-string">'&lt;table style="width:100%;text-align:center"&gt;&lt;tbody&gt;&lt;tr&gt;'</span>
     *                  + <span class="hljs-string">'&lt;td&gt;时间&lt;/td&gt;'</span>
     *                  + <span class="hljs-string">'&lt;td&gt;'</span> + series[<span class="hljs-number">0</span>].name + <span class="hljs-string">'&lt;/td&gt;'</span>
     *                  + <span class="hljs-string">'&lt;td&gt;'</span> + series[<span class="hljs-number">1</span>].name + <span class="hljs-string">'&lt;/td&gt;'</span>
     *                  + <span class="hljs-string">'&lt;/tr&gt;'</span>;
     *     <span class="hljs-keyword">for</span> (<span class="hljs-keyword">var</span> i = <span class="hljs-number">0</span>, l = axisData.length; i &lt; l; i++) {
     *         table += <span class="hljs-string">'&lt;tr&gt;'</span>
     *                  + <span class="hljs-string">'&lt;td&gt;'</span> + axisData[i] + <span class="hljs-string">'&lt;/td&gt;'</span>
     *                  + <span class="hljs-string">'&lt;td&gt;'</span> + series[<span class="hljs-number">0</span>].data[i] + <span class="hljs-string">'&lt;/td&gt;'</span>
     *                  + <span class="hljs-string">'&lt;td&gt;'</span> + series[<span class="hljs-number">1</span>].data[i] + <span class="hljs-string">'&lt;/td&gt;'</span>
     *                  + <span class="hljs-string">'&lt;/tr&gt;'</span>;
     *     }
     *     table += <span class="hljs-string">'&lt;/tbody&gt;&lt;/table&gt;'</span>;
     *     <span class="hljs-keyword">return</span> table;
     * }
     * </code></pre>
     */
    private Object optionToContent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.contentToOption">#toolbox.feature.dataView.contentToOption</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Function"]
     * <br/>描述:
     * <pre><code class="lang-ts hljs typescript">(container:HTMLDomElement, option:<span class="hljs-built_in">Object</span>) =&gt; <span class="hljs-built_in">Object</span>
     * </code></pre>
     * <p>在使用 optionToContent 的情况下，如果支持数据编辑后的刷新，需要自行通过该函数实现组装 option 的逻辑。</p>
     */
    private Object contentToOption;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.lang">#toolbox.feature.dataView.lang</a>
     * <br/>默认值: ['数据视图', '关闭', '刷新']
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>数据视图上有三个话术，默认是<code class="codespan">['数据视图', '关闭', '刷新']</code>。</p>
     */
    private List<?> lang;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.backgroundColor">#toolbox.feature.dataView.backgroundColor</a>
     * <br/>默认值: '#fff'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据视图浮层背景色。</p>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.textareaColor">#toolbox.feature.dataView.textareaColor</a>
     * <br/>默认值: '#fff'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据视图浮层文本输入区背景色。</p>
     */
    private String textareaColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.textareaBorderColor">#toolbox.feature.dataView.textareaBorderColor</a>
     * <br/>默认值: '#333'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据视图浮层文本输入区边框颜色。</p>
     */
    private String textareaBorderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.textColor">#toolbox.feature.dataView.textColor</a>
     * <br/>默认值: '#000'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文本颜色。</p>
     */
    private String textColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.buttonColor">#toolbox.feature.dataView.buttonColor</a>
     * <br/>默认值: '#c23531'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>按钮颜色。</p>
     */
    private String buttonColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataView.buttonTextColor">#toolbox.feature.dataView.buttonTextColor</a>
     * <br/>默认值: '#fff'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>按钮文本颜色。</p>
     */
    private String buttonTextColor;
}
