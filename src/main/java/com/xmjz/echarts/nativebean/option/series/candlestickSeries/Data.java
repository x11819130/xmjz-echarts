package com.xmjz.echarts.nativebean.option.series.candlestickSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.candlestickSeries.data.Blur;
import com.xmjz.echarts.nativebean.option.series.candlestickSeries.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.candlestickSeries.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.candlestickSeries.data.Select;
import com.xmjz.echarts.nativebean.option.series.candlestickSeries.data.Tooltip;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data">#series-candlestick.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>数据格式是如下的二维数组。</p>
 * <pre><code class="lang-javascript hljs">[
 *     [<span class="hljs-number">2320.26</span>, <span class="hljs-number">2320.26</span>, <span class="hljs-number">2287.3</span>,  <span class="hljs-number">2362.94</span>],
 *     [<span class="hljs-number">2300</span>,    <span class="hljs-number">2291.3</span>,  <span class="hljs-number">2288.26</span>, <span class="hljs-number">2308.38</span>],
 *     { <span class="hljs-comment">// 数据项也可以是 Object，从而里面能含有对此数据项的特殊设置。</span>
 *         <span class="hljs-attr">value</span>: [<span class="hljs-number">2300</span>,    <span class="hljs-number">2291.3</span>,  <span class="hljs-number">2288.26</span>, <span class="hljs-number">2308.38</span>],
 *         <span class="hljs-attr">itemStyle</span>: {...}
 *     },
 *     ...
 * ]
 * </code></pre>
 * <p>二维数组的每一数组项（上例中的每行）是渲染一个box，它含有四个量值，依次是：</p>
 * <pre><code class="lang-javascript hljs">[open, close, lowest, highest] （即：[开盘值, 收盘值, 最低值, 最高值]）
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.name">#series-candlestick.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据项名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.value">#series-candlestick.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>数据项值。</p>
     * <pre><code class="lang-javascript hljs">[open, close, lowest, highest] （即：[开盘值, 收盘值, 最低值, 最高值]）
     * </code></pre>
     */
    private List<?> value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.groupId">#series-candlestick.data.groupId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>该数据项的组 ID。组 ID 会被用于分类数据，并在全局过渡动画中决定如何进行合并和分裂动画。</p>
     */
    private String groupId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.itemStyle">#series-candlestick.data.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个 K 线图数据的图形样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.emphasis">#series-candlestick.data.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个 K 线图数据的高亮状态配置。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.blur">#series-candlestick.data.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>单个 K 线图数据的淡出状态配置。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.select">#series-candlestick.data.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>单个 K 线图数据的选中状态配置。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-candlestick.data.tooltip">#series-candlestick.data.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
