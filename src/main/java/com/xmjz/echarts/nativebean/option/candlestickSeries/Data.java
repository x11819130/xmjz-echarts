package com.xmjz.echarts.nativebean.option.candlestickSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-candlestick.data">https://echarts.apache.org/v4/zh/option.html#series-candlestick.data</a>
 * <br/>序号: 22
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
public class Data implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-candlestick.data.name">https://echarts.apache.org/v4/zh/option.html#series-candlestick.data.name</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据项名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-candlestick.data.value">https://echarts.apache.org/v4/zh/option.html#series-candlestick.data.value</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>数据项值。</p>
     * <pre><code class="lang-javascript hljs">[open, close, lowest, highest] （即：[开盘值, 收盘值, 最低值, 最高值]）
     * </code></pre>
     */
    private List<?> value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-candlestick.data.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-candlestick.data.itemStyle</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个 K 线图数据的图形样式。</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-candlestick.data.emphasis">https://echarts.apache.org/v4/zh/option.html#series-candlestick.data.emphasis</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>单个 K 线图数据的高亮图形样式。</p>
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-candlestick.data.tooltip">https://echarts.apache.org/v4/zh/option.html#series-candlestick.data.tooltip</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
