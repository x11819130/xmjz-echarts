package com.xmjz.echarts.nativebean.option.series.sankeySeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.levels.Blur;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.levels.Emphasis;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.levels.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.levels.Label;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.levels.LineStyle;
import com.xmjz.echarts.nativebean.option.series.sankeySeries.levels.Select;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels">#series-sankey.levels</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>桑基图每一层的设置。可以逐层设置，如下：</p>
 * <pre><code class="lang-ts hljs typescript">levels: [{
 *     depth: <span class="hljs-number">0</span>,
 *     itemStyle: {
 *         color: <span class="hljs-string">'#fbb4ae'</span>
 *     },
 *     lineStyle: {
 *         color: <span class="hljs-string">'source'</span>,
 *         opacity: <span class="hljs-number">0.6</span>
 *     }
 * }, {
 *     depth: <span class="hljs-number">1</span>,
 *     itemStyle: {
 *         color: <span class="hljs-string">'#b3cde3'</span>
 *     },
 *     lineStyle: {
 *         color: <span class="hljs-string">'source'</span>,
 *         opacity: <span class="hljs-number">0.6</span>
 *     }
 * }]
 * </code></pre>
 * <p>也可以只设置某一层：</p>
 * <pre><code class="lang-ts hljs typescript">levels: [{
 *     depth: <span class="hljs-number">3</span>,
 *     itemStyle: {
 *         color: <span class="hljs-string">'#fbb4ae'</span>
 *     },
 *     lineStyle: {
 *         color: <span class="hljs-string">'source'</span>,
 *         opacity: <span class="hljs-number">0.6</span>
 *     }
 * }]
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Levels extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.depth">#series-sankey.levels.depth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指定设置的是桑基图哪一层，取值从 0 开始。</p>
     */
    private Integer depth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.label">#series-sankey.levels.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.itemStyle">#series-sankey.levels.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.lineStyle">#series-sankey.levels.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.emphasis">#series-sankey.levels.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.blur">#series-sankey.levels.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.select">#series-sankey.levels.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Select select;
}
