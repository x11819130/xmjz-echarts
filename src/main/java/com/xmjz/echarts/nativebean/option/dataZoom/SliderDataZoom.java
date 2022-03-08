package com.xmjz.echarts.nativebean.option.dataZoom;

import com.xmjz.echarts.nativebean.option.DataZoom;
import com.xmjz.echarts.nativebean.option.dataZoom.sliderDataZoom.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider">#dataZoom-slider</a>
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>滑动条型数据区域缩放组件（dataZoomInside）</strong></p>
 * <p>滑动条型数据区域缩放组件提供了数据缩略图显示，缩放，刷选，拖拽，点击快速定位等数据筛选的功能。下图显示了该组件可交互部分</p>
 * <p><img width="600" height="auto" src="documents/asset/img/dataZoom-zone.png"></p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class SliderDataZoom extends DataZoom implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.type">#dataZoom-slider.type</a>
     * <br/>默认值: 'slider'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.id">#dataZoom-slider.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.show">#dataZoom-slider.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示  组件。如果设置为 <code class="codespan">false</code>，不会显示，但是数据过滤的功能还存在。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.backgroundColor">#dataZoom-slider.backgroundColor</a>
     * <br/>默认值: 'rgba(47,69,84,0)'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>组件的背景颜色。</p>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.dataBackground">#dataZoom-slider.dataBackground</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>数据阴影的样式。</p>
     */
    private DataBackground dataBackground;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.selectedDataBackground">#dataZoom-slider.selectedDataBackground</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>选中部分数据阴影的样式。</p>
     */
    private SelectedDataBackground selectedDataBackground;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.fillerColor">#dataZoom-slider.fillerColor</a>
     * <br/>默认值: 'rgba(167,183,204,0.4)'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>选中范围的填充颜色。</p>
     */
    private String fillerColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.borderColor">#dataZoom-slider.borderColor</a>
     * <br/>默认值: '#ddd'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.handleIcon">#dataZoom-slider.handleIcon</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>两侧缩放手柄的 icon 形状，支持路径字符串，默认为：</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-string">'M-9.35,34.56V42m0-40V9.5m-2,0h4a2,2,0,0,1,2,2v21a2,2,0,0,1-2,2h-4a2,2,0,0,1-2-2v-21A2,2,0,0,1-11.35,9.5Z'</span>
     * </code></pre>
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
    private String handleIcon;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.handleSize">#dataZoom-slider.handleSize</a>
     * <br/>默认值: '100%'
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>控制手柄的尺寸，可以是像素大小，也可以是相对于 dataZoom 组件宽度的百分比，默认跟 dataZoom 宽度相同。</p>
     */
    private Object handleSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.handleStyle">#dataZoom-slider.handleStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>两侧缩放手柄的样式配置。</p>
     */
    private HandleStyle handleStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.moveHandleIcon">#dataZoom-slider.moveHandleIcon</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>移动手柄中间的 icon，支持路径字符串，默认为：</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-string">'M-320.9-50L-320.9-50c18.1,0,27.1,9,27.1,27.1V85.7c0,18.1-9,27.1-27.1,27.1l0,0c-18.1,0-27.1-9-27.1-27.1V-22.9C-348-41-339-50-320.9-50z M-212.3-50L-212.3-50c18.1,0,27.1,9,27.1,27.1V85.7c0,18.1-9,27.1-27.1,27.1l0,0c-18.1,0-27.1-9-27.1-27.1V-22.9C-239.4-41-230.4-50-212.3-50z M-103.7-50L-103.7-50c18.1,0,27.1,9,27.1,27.1V85.7c0,18.1-9,27.1-27.1,27.1l0,0c-18.1,0-27.1-9-27.1-27.1V-22.9C-130.9-41-121.8-50-103.7-50z'</span>
     * </code></pre>
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
    private String moveHandleIcon;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.moveHandleSize">#dataZoom-slider.moveHandleSize</a>
     * <br/>默认值: 7
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>移动手柄的尺寸高度。</p>
     */
    private Integer moveHandleSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.moveHandleStyle">#dataZoom-slider.moveHandleStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>移动手柄的样式配置。</p>
     */
    private MoveHandleStyle moveHandleStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.labelPrecision">#dataZoom-slider.labelPrecision</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>显示label的小数精度。默认根据数据自动决定。</p>
     */
    private Object labelPrecision;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.labelFormatter">#dataZoom-slider.labelFormatter</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>显示的label的格式化器。</p>
     * <ul>
     * <li><p>如果为 <code class="codespan">string</code>，表示模板，例如：<code class="codespan">aaaa{value}bbbb</code>，其中<code class="codespan">{value}</code>会被替换为实际的数值。</p>
     * </li>
     * <li><p>如果为 <code class="codespan">Function</code>，表示回调函数，例如：</p>
     * </li>
     * </ul>
     * <pre><code class="lang-javascript hljs"><span class="hljs-comment">/**
     *  * <span class="hljs-doctag">@param <span class="hljs-type">{*}</span> </span>value 如果 axis.type 为 'category'，则 `value` 为 axis.data 的 index。
     *  *                  否则 `value` 是当前值。
     *  * <span class="hljs-doctag">@param <span class="hljs-type">{strign}</span> </span>valueStr 内部格式化的结果。
     *  * <span class="hljs-doctag">@return <span class="hljs-type">{string}</span> </span>返回最终的label内容。
     *  <i>*</i>/</span>
     * <span class="hljs-attr">labelFormatter</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value</span>) </span>{
     *     <span class="hljs-keyword">return</span> <span class="hljs-string">'aaa'</span> + value + <span class="hljs-string">'bbb'</span>;
     * }
     * </code></pre>
     */
    private Object labelFormatter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.showDetail">#dataZoom-slider.showDetail</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示detail，即拖拽时候显示详细数值信息。</p>
     */
    private Boolean showDetail;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.showDataShadow">#dataZoom-slider.showDataShadow</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>是否在 <code class="codespan">dataZoom-silder</code> 组件中显示数据阴影。数据阴影可以简单地反应数据走势。</p>
     */
    private String showDataShadow;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.realtime">#dataZoom-slider.realtime</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>拖动时，是否实时更新系列的视图。如果设置为 <code class="codespan">false</code>，则只在拖拽结束的时候更新。</p>
     */
    private Boolean realtime;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.textStyle">#dataZoom-slider.textStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private TextStyle textStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.xAxisIndex">#dataZoom-slider.xAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>设置 <code class="codespan">dataZoom-slider</code> 组件控制的 <code class="codespan">x轴</code>（即<a href="https://echarts.apache.org/zh/option.html#xAxis">xAxis</a>，是直角坐标系中的概念，参见 <a href="https://echarts.apache.org/zh/option.html#grid">grid</a>）。</p>
     * <p>不指定时，当 <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.orient">dataZoom-slider.orient</a> 为 <code class="codespan">'horizontal'</code>时，默认控制和 dataZoom 平行的第一个 <code class="codespan">xAxis</code>。但是不建议使用默认值，建议显式指定。</p>
     * <p>如果是 <code class="codespan">number</code> 表示控制一个轴，如果是 <code class="codespan">Array</code> 表示控制多个轴。</p>
     * <p>例如有如下 ECharts option：</p>
     * <pre><code class="lang-javascript hljs">option: {
     *     <span class="hljs-attr">xAxis</span>: [
     *         {...}, <span class="hljs-comment">// 第一个 xAxis</span>
     *         {...}, <span class="hljs-comment">// 第二个 xAxis</span>
     *         {...}, <span class="hljs-comment">// 第三个 xAxis</span>
     *         {...}  <span class="hljs-comment">// 第四个 xAxis</span>
     *     ],
     *     <span class="hljs-attr">dataZoom</span>: [
     *         { <span class="hljs-comment">// 第一个 dataZoom 组件</span>
     *             <span class="hljs-attr">xAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">2</span>] <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第一个 和 第三个 xAxis</span>
     *         },
     *         { <span class="hljs-comment">// 第二个 dataZoom 组件</span>
     *             <span class="hljs-attr">xAxisIndex</span>: <span class="hljs-number">3</span>      <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第四个 xAxis</span>
     *         }
     *     ]
     * }
     * </code></pre>
     */
    private Object xAxisIndex;

    public Object getxAxisIndex() {
        return this.xAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.yAxisIndex">#dataZoom-slider.yAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>设置 <code class="codespan">dataZoom-slider</code> 组件控制的 <code class="codespan">y轴</code>（即<a href="https://echarts.apache.org/zh/option.html#yAxis">yAxis</a>，是直角坐标系中的概念，参见 <a href="https://echarts.apache.org/zh/option.html#grid">grid</a>）。</p>
     * <p>不指定时，当 <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.orient">dataZoom-slider.orient</a> 为 <code class="codespan">'vertical'</code>时，默认控制和 dataZoom 平行的第一个 <code class="codespan">yAxis</code>。但是不建议使用默认值，建议显式指定。</p>
     * <p>如果是 <code class="codespan">number</code> 表示控制一个轴，如果是 <code class="codespan">Array</code> 表示控制多个轴。</p>
     * <p>例如有如下 ECharts option：</p>
     * <pre><code class="lang-javascript hljs">option: {
     *     <span class="hljs-attr">yAxis</span>: [
     *         {...}, <span class="hljs-comment">// 第一个 yAxis</span>
     *         {...}, <span class="hljs-comment">// 第二个 yAxis</span>
     *         {...}, <span class="hljs-comment">// 第三个 yAxis</span>
     *         {...}  <span class="hljs-comment">// 第四个 yAxis</span>
     *     ],
     *     <span class="hljs-attr">dataZoom</span>: [
     *         { <span class="hljs-comment">// 第一个 dataZoom 组件</span>
     *             <span class="hljs-attr">yAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">2</span>] <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第一个 和 第三个 yAxis</span>
     *         },
     *         { <span class="hljs-comment">// 第二个 dataZoom 组件</span>
     *             <span class="hljs-attr">yAxisIndex</span>: <span class="hljs-number">3</span>      <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第四个 yAxis</span>
     *         }
     *     ]
     * }
     * </code></pre>
     */
    private Object yAxisIndex;

    public Object getyAxisIndex() {
        return this.yAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.radiusAxisIndex">#dataZoom-slider.radiusAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>设置 <code class="codespan">dataZoom-slider</code> 组件控制的 <code class="codespan">radius 轴</code>（即<a href="https://echarts.apache.org/zh/option.html#radiusAxis">radiusAxis</a>，是直角坐标系中的概念，参见 <a href="https://echarts.apache.org/zh/option.html#polar">polar</a>）。</p>
     * <p>如果是 <code class="codespan">number</code> 表示控制一个轴，如果是 <code class="codespan">Array</code> 表示控制多个轴。</p>
     * <p>例如有如下 ECharts option：</p>
     * <pre><code class="lang-javascript hljs">option: {
     *     <span class="hljs-attr">radiusAxis</span>: [
     *         {...}, <span class="hljs-comment">// 第一个 radiusAxis</span>
     *         {...}, <span class="hljs-comment">// 第二个 radiusAxis</span>
     *         {...}, <span class="hljs-comment">// 第三个 radiusAxis</span>
     *         {...}  <span class="hljs-comment">// 第四个 radiusAxis</span>
     *     ],
     *     <span class="hljs-attr">dataZoom</span>: [
     *         { <span class="hljs-comment">// 第一个 dataZoom 组件</span>
     *             <span class="hljs-attr">radiusAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">2</span>] <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第一个 和 第三个 radiusAxis</span>
     *         },
     *         { <span class="hljs-comment">// 第二个 dataZoom 组件</span>
     *             <span class="hljs-attr">radiusAxisIndex</span>: <span class="hljs-number">3</span>      <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第四个 radiusAxis</span>
     *         }
     *     ]
     * }
     * </code></pre>
     */
    private Object radiusAxisIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.angleAxisIndex">#dataZoom-slider.angleAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>设置 <code class="codespan">dataZoom-slider</code> 组件控制的 <code class="codespan">angle 轴</code>（即<a href="https://echarts.apache.org/zh/option.html#angleAxis">angleAxis</a>，是直角坐标系中的概念，参见 <a href="https://echarts.apache.org/zh/option.html#polar">polar</a>）。</p>
     * <p>如果是 <code class="codespan">number</code> 表示控制一个轴，如果是 <code class="codespan">Array</code> 表示控制多个轴。</p>
     * <p>例如有如下 ECharts option：</p>
     * <pre><code class="lang-javascript hljs">option: {
     *     <span class="hljs-attr">angleAxis</span>: [
     *         {...}, <span class="hljs-comment">// 第一个 angleAxis</span>
     *         {...}, <span class="hljs-comment">// 第二个 angleAxis</span>
     *         {...}, <span class="hljs-comment">// 第三个 angleAxis</span>
     *         {...}  <span class="hljs-comment">// 第四个 angleAxis</span>
     *     ],
     *     <span class="hljs-attr">dataZoom</span>: [
     *         { <span class="hljs-comment">// 第一个 dataZoom 组件</span>
     *             <span class="hljs-attr">angleAxisIndex</span>: [<span class="hljs-number">0</span>, <span class="hljs-number">2</span>] <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第一个 和 第三个 angleAxis</span>
     *         },
     *         { <span class="hljs-comment">// 第二个 dataZoom 组件</span>
     *             <span class="hljs-attr">angleAxisIndex</span>: <span class="hljs-number">3</span>      <span class="hljs-comment">// 表示这个 dataZoom 组件控制 第四个 angleAxis</span>
     *         }
     *     ]
     * }
     * </code></pre>
     */
    private Object angleAxisIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.filterMode">#dataZoom-slider.filterMode</a>
     * <br/>默认值: 'filter'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p><code class="codespan">dataZoom</code> 的运行原理是通过 <code class="codespan">数据过滤</code> 以及在内部设置轴的显示窗口来达到 <code class="codespan">数据窗口缩放</code> 的效果。</p>
     * <p>数据过滤模式（<a href="https://echarts.apache.org/zh/option.html#dataZoom.filterMode">dataZoom.filterMode</a>）的设置不同，效果也不同。</p>
     * <p>可选值为：</p>
     * <ul>
     * <li><p>'filter'：当前数据窗口外的数据，被 <strong>过滤掉</strong>。即 <strong>会</strong> 影响其他轴的数据范围。每个数据项，只要有一个维度在数据窗口外，整个数据项就会被过滤掉。</p>
     * </li>
     * <li><p>'weakFilter'：当前数据窗口外的数据，被 <strong>过滤掉</strong>。即 <strong>会</strong> 影响其他轴的数据范围。每个数据项，只有当全部维度都在数据窗口同侧外部，整个数据项才会被过滤掉。</p>
     * </li>
     * <li><p>'empty'：当前数据窗口外的数据，被 <strong>设置为空</strong>。即 <strong>不会</strong> 影响其他轴的数据范围。</p>
     * </li>
     * <li><p>'none': 不过滤数据，只改变数轴范围。</p>
     * </li>
     * </ul>
     * <p>如何设置，由用户根据场景和需求自己决定。经验来说：</p>
     * <ul>
     * <li><p>当『只有 X 轴 或 只有 Y 轴受 <code class="codespan">dataZoom</code> 组件控制』时，常使用 <code class="codespan">filterMode: 'filter'</code>，这样能使另一个轴自适应过滤后的数值范围。</p>
     * </li>
     * <li><p>当『X 轴 Y 轴分别受 <code class="codespan">dataZoom</code> 组件控制』时：</p>
     * <ul>
     * <li><p>如果 X 轴和 Y 轴是『同等地位的、不应互相影响的』，比如在『双数值轴散点图』中，那么两个轴可都设为 <code class="codespan">fiterMode: 'empty'</code>。</p>
     * </li>
     * <li><p>如果 X 轴为主，Y 轴为辅，比如在『柱状图』中，需要『拖动 <code class="codespan">dataZoomX</code> 改变 X 轴过滤柱子时，Y 轴的范围也自适应剩余柱子的高度』，『拖动 <code class="codespan">dataZoomY</code> 改变 Y 轴过滤柱子时，X 轴范围不受影响』，那么就 X轴设为 <code class="codespan">fiterMode: 'filter'</code>，Y 轴设为 <code class="codespan">fiterMode: 'empty'</code>，即主轴 <code class="codespan">'filter'</code>，辅轴 <code class="codespan">'empty'</code>。</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>下面是个具体例子：</p>
     * <pre><code class="lang-javascript hljs">option = {
     *     <span class="hljs-attr">dataZoom</span>: [
     *         {
     *             <span class="hljs-attr">id</span>: <span class="hljs-string">'dataZoomX'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'slider'</span>,
     *             <span class="hljs-attr">xAxisIndex</span>: [<span class="hljs-number">0</span>],
     *             <span class="hljs-attr">filterMode</span>: <span class="hljs-string">'filter'</span>
     *         },
     *         {
     *             <span class="hljs-attr">id</span>: <span class="hljs-string">'dataZoomY'</span>,
     *             <span class="hljs-attr">type</span>: <span class="hljs-string">'slider'</span>,
     *             <span class="hljs-attr">yAxisIndex</span>: [<span class="hljs-number">0</span>],
     *             <span class="hljs-attr">filterMode</span>: <span class="hljs-string">'empty'</span>
     *         }
     *     ],
     *     <span class="hljs-attr">xAxis</span>: {<span class="hljs-attr">type</span>: <span class="hljs-string">'value'</span>},
     *     <span class="hljs-attr">yAxis</span>: {<span class="hljs-attr">type</span>: <span class="hljs-string">'value'</span>},
     *     series{
     *         <span class="hljs-attr">type</span>: <span class="hljs-string">'bar'</span>,
     *         <span class="hljs-attr">data</span>: [
     *             <span class="hljs-comment">// 第一列对应 X 轴，第二列对应 Y 轴。</span>
     *             [<span class="hljs-number">12</span>, <span class="hljs-number">24</span>, <span class="hljs-number">36</span>],
     *             [<span class="hljs-number">90</span>, <span class="hljs-number">80</span>, <span class="hljs-number">70</span>],
     *             [<span class="hljs-number">3</span>, <span class="hljs-number">9</span>, <span class="hljs-number">27</span>],
     *             [<span class="hljs-number">1</span>, <span class="hljs-number">11</span>, <span class="hljs-number">111</span>]
     *         ]
     *     }
     * }
     * </code></pre>
     * <p>上例中，<code class="codespan">dataZoomX</code> 的 <code class="codespan">filterMode</code> 设置为 <code class="codespan">'filter'</code>。于是，假设当用户拖拽 <code class="codespan">dataZoomX</code>（不去动 <code class="codespan">dataZoomY</code>）导致其 valueWindow 变为 <code class="codespan">[2, 50]</code> 时，<code class="codespan">dataZoomX</code> 对 series.data 的第一列进行遍历，窗口外的整项去掉，最终得到的 series.data 为：</p>
     * <pre><code class="lang-javascript hljs">[
     *     <span class="hljs-comment">// 第一列对应 X 轴，第二列对应 Y 轴。</span>
     *     [<span class="hljs-number">12</span>, <span class="hljs-number">24</span>, <span class="hljs-number">36</span>],
     *     <span class="hljs-comment">// [90, 80, 70] 整项被过滤掉，因为 90 在 dataWindow 之外。</span>
     *     [<span class="hljs-number">3</span>, <span class="hljs-number">9</span>, <span class="hljs-number">27</span>]
     *     <span class="hljs-comment">// [1, 11, 111] 整项被过滤掉，因为 1 在 dataWindow 之外。</span>
     * ]
     * </code></pre>
     * <p>过滤前，series.data 中对应 Y 轴的值有 <code class="codespan">24</code>、<code class="codespan">80</code>、<code class="codespan">9</code>、<code class="codespan">11</code>，过滤后，只剩下 <code class="codespan">24</code> 和 <code class="codespan">9</code>，那么 Y 轴的显示范围就会自动改变以适应剩下的这两个值的显示（如果 Y 轴没有被设置 <code class="codespan">min</code>、<code class="codespan">max</code> 固定其显示范围的话）。</p>
     * <p>所以，<code class="codespan">filterMode: 'filter'</code> 的效果是：过滤数据后使另外的轴也能自动适应当前数据的范围。</p>
     * <p>再从头来，上例中 <code class="codespan">dataZoomY</code> 的 <code class="codespan">filterMode</code> 设置为 <code class="codespan">'empty'</code>。于是，假设当用户拖拽 <code class="codespan">dataZoomY</code>（不去动 <code class="codespan">dataZoomX</code>）导致其 dataWindow 变为 <code class="codespan">[10, 60]</code> 时，<code class="codespan">dataZoomY</code> 对 series.data 的第二列进行遍历，窗口外的值被设置为 empty （即替换为 NaN，这样设置为空的项，其所对应柱形，在 X 轴还有占位，只是不显示出来）。最终得到的 series.data 为：</p>
     * <pre><code class="lang-javascript hljs">[
     *     <span class="hljs-comment">// 第一列对应 X 轴，第二列对应 Y 轴。</span>
     *     [<span class="hljs-number">12</span>, <span class="hljs-number">24</span>, <span class="hljs-number">36</span>],
     *     [<span class="hljs-number">90</span>, <span class="hljs-literal">NaN</span>, <span class="hljs-number">70</span>], <span class="hljs-comment">// 设置为 empty (NaN)</span>
     *     [<span class="hljs-number">3</span>, <span class="hljs-literal">NaN</span>, <span class="hljs-number">27</span>],  <span class="hljs-comment">// 设置为 empty (NaN)</span>
     *     [<span class="hljs-number">1</span>, <span class="hljs-number">11</span>, <span class="hljs-number">111</span>]
     * ]
     * </code></pre>
     * <p>这时，series.data 中对应于 X 轴的值仍然全部保留不受影响，为 <code class="codespan">12</code>、<code class="codespan">90</code>、<code class="codespan">3</code>、<code class="codespan">1</code>。那么用户对 <code class="codespan">dataZoomY</code> 的拖拽操作不会影响到 X 轴的范围。这样的效果，对于离群点（outlier）过滤功能，比较清晰。</p>
     * <p>如下面的例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/bar-dataZoom-filterMode&amp;edit=1&amp;reset=1" width="600" height="400"></iframe>
     */
    private String filterMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.start">#dataZoom-slider.start</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>数据窗口范围的起始百分比。范围是：0 ~ 100。表示 0% ~ 100%。</p>
     * <p><a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.start">dataZoom-slider.start</a> 和 <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.end">dataZoom-slider.end</a> 共同用 <strong>百分比</strong> 的形式定义了数据窗口范围。</p>
     * <p>关于坐标轴范围（axis extent）和 <code class="codespan">dataZoom-slider.start</code> 的关系的更多信息，请参见：<a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.rangeMode">dataZoom-slider.rangeMode</a>。</p>
     */
    private Integer start;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.end">#dataZoom-slider.end</a>
     * <br/>默认值: 100
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>数据窗口范围的结束百分比。范围是：0 ~ 100。</p>
     * <p><a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.start">dataZoom-slider.start</a> 和 <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.end">dataZoom-slider.end</a> 共同用 <strong>百分比</strong> 的形式定义了数据窗口范围。</p>
     * <p>关于坐标轴范围（axis extent）和 <code class="codespan">dataZoom-slider.end</code> 的关系的更多信息，请参见：<a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.rangeMode">dataZoom-slider.rangeMode</a>。</p>
     */
    private Integer end;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.startValue">#dataZoom-slider.startValue</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Date"]
     * <br/>描述:
     * <p>数据窗口范围的起始数值。如果设置了 <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.start">dataZoom-slider.start</a> 则 <code class="codespan">startValue</code> 失效。</p>
     * <p><a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.startValue">dataZoom-slider.startValue</a> 和 <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.endValue">dataZoom-slider.endValue</a> 共同用 <strong>绝对数值</strong> 的形式定义了数据窗口范围。</p>
     * <p>注意，如果轴的类型为 <code class="codespan">category</code>，则 <code class="codespan">startValue</code> 既可以设置为 <code class="codespan">axis.data</code> 数组的 <code class="codespan">index</code>，也可以设置为数组值本身。
     * 但是如果设置为数组值本身，会在内部自动转化为数组的 index。</p>
     * <p>关于坐标轴范围（axis extent）和 <code class="codespan">dataZoom-slider.startValue</code> 的关系的更多信息，请参见：<a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.rangeMode">dataZoom-slider.rangeMode</a>。</p>
     */
    private Object startValue;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.endValue">#dataZoom-slider.endValue</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Date"]
     * <br/>描述:
     * <p>数据窗口范围的结束数值。如果设置了 <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.end">dataZoom-slider.end</a> 则 <code class="codespan">endValue</code> 失效。</p>
     * <p><a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.startValue">dataZoom-slider.startValue</a> 和 <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.endValue">dataZoom-slider.endValue</a> 共同用 <strong>绝对数值</strong> 的形式定义了数据窗口范围。</p>
     * <p>注意，如果轴的类型为 <code class="codespan">category</code>，则 <code class="codespan">endValue</code> 即可以设置为 <code class="codespan">axis.data</code> 数组的 <code class="codespan">index</code>，也可以设置为数组值本身。
     * 但是如果设置为数组值本身，会在内部自动转化为数组的 index。</p>
     * <p>关于坐标轴范围（axis extent）和 <code class="codespan">dataZoom-slider.endValue</code> 的关系的更多信息，请参见：<a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.rangeMode">dataZoom-slider.rangeMode</a>。</p>
     */
    private Object endValue;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.minSpan">#dataZoom-slider.minSpan</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>用于限制窗口大小的最小值（百分比值），取值范围是 <code class="codespan">0</code> ~ <code class="codespan">100</code>。</p>
     * <p>如果设置了 <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.minValueSpan">dataZoom-slider.minValueSpan</a> 则 <code class="codespan">minSpan</code> 失效。</p>
     */
    private Integer minSpan;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.maxSpan">#dataZoom-slider.maxSpan</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>用于限制窗口大小的最大值（百分比值），取值范围是 <code class="codespan">0</code> ~ <code class="codespan">100</code>。</p>
     * <p>如果设置了 <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.maxValueSpan">dataZoom-slider.maxValueSpan</a> 则 <code class="codespan">maxSpan</code> 失效。</p>
     */
    private Integer maxSpan;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.minValueSpan">#dataZoom-slider.minValueSpan</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Date"]
     * <br/>描述:
     * <p>用于限制窗口大小的最小值（实际数值）。</p>
     * <p>如在时间轴上可以设置为：<code class="codespan">3600 * 24 * 1000 * 5</code> 表示 5 天。
     * 在类目轴上可以设置为 <code class="codespan">5</code> 表示 5 个类目。</p>
     */
    private Object minValueSpan;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.maxValueSpan">#dataZoom-slider.maxValueSpan</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","string","Date"]
     * <br/>描述:
     * <p>用于限制窗口大小的最大值（实际数值）。</p>
     * <p>如在时间轴上可以设置为：<code class="codespan">3600 * 24 * 1000 * 5</code> 表示 5 天。
     * 在类目轴上可以设置为 <code class="codespan">5</code> 表示 5 个类目。</p>
     */
    private Object maxValueSpan;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.orient">#dataZoom-slider.orient</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>布局方式是横还是竖。不仅是布局方式，对于直角坐标系而言，也决定了，缺省情况控制横向数轴还是纵向数轴。</p>
     * <p>可选值为：</p>
     * <ul>
     * <li><p><code class="codespan">'horizontal'</code>：水平。</p>
     * </li>
     * <li><p><code class="codespan">'vertical'</code>：竖直。</p>
     * </li>
     * </ul>
     */
    private String orient;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.zoomLock">#dataZoom-slider.zoomLock</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否锁定选择区域（或叫做数据窗口）的大小。</p>
     * <p>如果设置为 <code class="codespan">true</code> 则锁定选择区域的大小，也就是说，只能平移，不能缩放。</p>
     */
    private Boolean zoomLock;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.throttle">#dataZoom-slider.throttle</a>
     * <br/>默认值: 100
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>设置触发视图刷新的频率。单位为毫秒（ms）。</p>
     * <p>如果 <a href="https://echarts.apache.org/zh/option.html#animation">animation</a> 设为 <code class="codespan">true</code> 且 <a href="https://echarts.apache.org/zh/option.html#animationDurationUpdate">animationDurationUpdate</a> 大于 <code class="codespan">0</code>，可以保持 <code class="codespan">throttle</code> 为默认值 <code class="codespan">100</code>（或者设置为大于 <code class="codespan">0</code> 的值），否则拖拽时有可能画面感觉卡顿。</p>
     * <p>如果 <a href="https://echarts.apache.org/zh/option.html#animation">animation</a> 设为 <code class="codespan">false</code> 或者 <a href="https://echarts.apache.org/zh/option.html#animationDurationUpdate">animationDurationUpdate</a> 设为 <code class="codespan">0</code>，且在数据量不大时，拖拽时画面感觉卡顿，可以把尝试把 <code class="codespan">throttle</code> 设为 <code class="codespan">0</code> 来改善。</p>
     */
    private Integer throttle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.rangeMode">#dataZoom-slider.rangeMode</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>形式为：<code class="codespan">[rangeModeForStart, rangeModeForEnd]</code>。</p>
     * <p>例如 <code class="codespan">rangeMode: ['value', 'percent']</code>，表示 start 值取绝对数值，end 取百分比。</p>
     * <p>每项可选值为：<code class="codespan">'value'</code>, <code class="codespan">'percent'</code></p>
     * <ul>
     * <li><code class="codespan">'value'</code> 模式：处于此模式下，坐标轴范围（axis extent）总只会被<code class="codespan">dataZoom.startValue</code> and <code class="codespan">dataZoom.endValue</code> 决定，而不管数据是多少，以及不管，<code class="codespan">axis.min</code> 和 <code class="codespan">axis.max</code> 怎么设置。</li>
     * <li><code class="codespan">'percent'</code> 模式：处于此模式下，<code class="codespan">100</code> 代表 100% 的 <code class="codespan">[dMin, dMax]</code>。这里 <code class="codespan">dMin</code> 表示，如果 <code class="codespan">axis.min</code> 设置了就是 <code class="codespan">axis.min</code>，否则是 <code class="codespan">data.extent[0]</code>；<code class="codespan">dMax</code> 表示，如果 <code class="codespan">axis.max</code> 设置了就是 <code class="codespan">axis.max</code>，否则是 <code class="codespan">data.extent[1]</code>。<code class="codespan">[dMin, dMax]</code> 乘以 percent 的结果得到坐标轴范围（axis extent）。</li>
     * </ul>
     * <p>默认情况下，<code class="codespan">rangeMode</code> 总是被自动设定。如果指定了 <code class="codespan">option.start</code>/<code class="codespan">option.end</code> 那么就设定为 <code class="codespan">'percent'</code>，如果指定了 <code class="codespan">option.startValue</code>/<code class="codespan">option.endValue</code> 那么就设定为 <code class="codespan">'value'</code>。以及当用户用不用操作触发视图改变时，<code class="codespan">rangeMode</code> 也可能会相应得变化（如，通过 <code class="codespan">toolbox.dataZoom</code> 触发视图改变时，<code class="codespan">rangeMode</code> 会自动被设置为 <code class="codespan">value</code>，通过 <code class="codespan">dataZoom-inside</code> 和 <code class="codespan">dataZoom-slider</code> 触发视图改变时，会自动被设置为 <code class="codespan">'percent'</code>）。</p>
     * <p>如果我们手动在 <code class="codespan">option</code> 中设定了 <code class="codespan">rangeMode</code>，那么它只在 <code class="codespan">start</code> 和 <code class="codespan">startValue</code> 都设置了或者 <code class="codespan">end</code> 和 <code class="codespan">endValue</code> 都设置了才有意义。所以通常我们没必要在 <code class="codespan">option</code> 中指定 <code class="codespan">rangeMode</code>。</p>
     * <p>举例一个使用场景：当我们使用动态数据时（即，周期性得通过 <code class="codespan">setOption</code> 来改变数据），如果 <code class="codespan">rangeMode</code> 在 <code class="codespan">'value</code>' 模式，<code class="codespan">dataZoom</code> 的窗口会一直保持在一个固定的值区间，无论数据怎么改变添加了多少；如果 <code class="codespan">rangeMode</code> 在 <code class="codespan">'percent'</code> 模式，窗口会随着数据的添加而改变（假设 <code class="codespan">axis.min</code> 和 <code class="codespan">axis.max</code> 没有被设置）。</p>
     */
    private List<?> rangeMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.zlevel">#dataZoom-slider.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.z">#dataZoom-slider.z</a>
     * <br/>默认值: 2
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.left">#dataZoom-slider.left</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>dataZoom-slider组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.top">#dataZoom-slider.top</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>dataZoom-slider组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.right">#dataZoom-slider.right</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>dataZoom-slider组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.bottom">#dataZoom-slider.bottom</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>dataZoom-slider组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.brushSelect">#dataZoom-slider.brushSelect</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>是否开启刷选功能。在下图的 brush 区域你可以按住鼠标左键后框选出选中部分。</p>
     * <p><img width="600" height="auto" src="documents/asset/img/dataZoom-zone.png"></p>
     */
    private Boolean brushSelect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.brushStyle">#dataZoom-slider.brushStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>刷选框样式设置。</p>
     */
    private BrushStyle brushStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataZoom-slider.emphasis">#dataZoom-slider.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>高亮样式设置。</p>
     */
    private Emphasis emphasis;
}
