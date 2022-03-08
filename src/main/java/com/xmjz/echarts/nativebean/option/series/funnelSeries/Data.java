package com.xmjz.echarts.nativebean.option.series.funnelSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.funnelSeries.data.Blur;
import com.xmjz.echarts.nativebean.option.series.funnelSeries.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.funnelSeries.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.funnelSeries.data.Label;
import com.xmjz.echarts.nativebean.option.series.funnelSeries.data.LabelLine;
import com.xmjz.echarts.nativebean.option.series.funnelSeries.data.Select;
import com.xmjz.echarts.nativebean.option.series.funnelSeries.data.Tooltip;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.data">#series-funnel.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>系列中的数据内容数组。数组项可以为单个数值，如：</p>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.data.name">#series-funnel.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据项名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.data.value">#series-funnel.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>数据值。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.data.itemStyle">#series-funnel.data.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p> 图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.data.label">#series-funnel.data.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个数据的标签配置。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.data.labelLine">#series-funnel.data.labelLine</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LabelLine labelLine;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.data.emphasis">#series-funnel.data.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.data.blur">#series-funnel.data.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.data.select">#series-funnel.data.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.data.tooltip">#series-funnel.data.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
