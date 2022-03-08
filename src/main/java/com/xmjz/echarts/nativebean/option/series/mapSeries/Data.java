package com.xmjz.echarts.nativebean.option.series.mapSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.mapSeries.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.mapSeries.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.mapSeries.data.Label;
import com.xmjz.echarts.nativebean.option.series.mapSeries.data.LabelLine;
import com.xmjz.echarts.nativebean.option.series.mapSeries.data.Select;
import com.xmjz.echarts.nativebean.option.series.mapSeries.data.Tooltip;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.data">#series-map.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>地图系列中的数据内容数组。数组项可以为单个数值，如：</p>
 * <pre><code class="lang-ts hljs typescript">[<span class="hljs-number">12</span>, <span class="hljs-number">34</span>, <span class="hljs-number">56</span>, <span class="hljs-number">10</span>, <span class="hljs-number">23</span>]
 * </code></pre>
 * <p>如果需要在数据中加入其它维度给 <a href="https://echarts.apache.org/zh/option.html#visualMap">visualMap</a> 组件用来映射到颜色等其它图形属性。每个数据项也可以是数组，如：</p>
 * <pre><code class="lang-ts hljs typescript">[[<span class="hljs-number">12</span>, <span class="hljs-number">14</span>], [<span class="hljs-number">34</span>, <span class="hljs-number">50</span>], [<span class="hljs-number">56</span>, <span class="hljs-number">30</span>], [<span class="hljs-number">10</span>, <span class="hljs-number">15</span>], [<span class="hljs-number">23</span>, <span class="hljs-number">10</span>]]
 * </code></pre>
 * <p>这时候可以将每项数组中的第二个值指定给 <a href="https://echarts.apache.org/zh/option.html#visualMap">visualMap</a> 组件。</p>
 * <p>更多时候我们需要指定每个数据项的名称，这时候需要每个项为一个对象：</p>
 * <pre><code class="lang-ts hljs typescript">[{
 *     <span class="hljs-comment">// 数据项的名称</span>
 *     name: <span class="hljs-string">'数据1'</span>,
 *     <span class="hljs-comment">// 数据项值8</span>
 *     value: <span class="hljs-number">10</span>
 * }, {
 *     name: <span class="hljs-string">'数据2'</span>,
 *     value: <span class="hljs-number">20</span>
 * }]
 * </code></pre>
 * <p>需要对个别内容指定进行个性化定义时：</p>
 * <pre><code class="lang-ts hljs typescript">[{
 *     name: <span class="hljs-string">'数据1'</span>,
 *     value: <span class="hljs-number">10</span>
 * }, {
 *     <span class="hljs-comment">// 数据项名称</span>
 *     name: <span class="hljs-string">'数据2'</span>,
 *     value : <span class="hljs-number">56</span>,
 *     <span class="hljs-comment">//自定义特殊 tooltip，仅对该数据项有效</span>
 *     tooltip:{},
 *     <span class="hljs-comment">//自定义特殊itemStyle，仅对该item有效</span>
 *     itemStyle:{}
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.data.name">#series-map.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据所对应的地图区域的名称，例如 <code class="codespan">'广东'</code>，<code class="codespan">'浙江'</code>。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.data.value">#series-map.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>该区域的数据值。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.data.groupId">#series-map.data.groupId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该数据项的组 ID。组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画。</p>
     */
    private String groupId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.data.selected">#series-map.data.selected</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>该区域是否选中。</p>
     */
    private Boolean selected;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.data.itemStyle">#series-map.data.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该数据所在区域的多边形样式设置</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.data.label">#series-map.data.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.data.labelLine">#series-map.data.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标签的视觉引导线配置。</p>
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.data.emphasis">#series-map.data.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该数据所在区域的多边形高亮状态</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.data.select">#series-map.data.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该数据所在区域的多边形选中状态</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.data.tooltip">#series-map.data.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
