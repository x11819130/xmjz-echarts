package com.xmjz.echarts.nativebean.option.sankeySeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels">https://echarts.apache.org/zh/option.html#series-sankey.levels</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>桑基图每一层的设置。可以逐层设置，如下：</p>
 * <pre><code class="lang-js hljs javascript">levels: [{
 *     <span class="hljs-attr">depth</span>: <span class="hljs-number">0</span>,
 *     <span class="hljs-attr">itemStyle</span>: {
 *         <span class="hljs-attr">color</span>: <span class="hljs-string">'#fbb4ae'</span>
 *     },
 *     <span class="hljs-attr">lineStyle</span>: {
 *         <span class="hljs-attr">color</span>: <span class="hljs-string">'source'</span>,
 *         <span class="hljs-attr">opacity</span>: <span class="hljs-number">0.6</span>
 *     }
 * }, {
 *     <span class="hljs-attr">depth</span>: <span class="hljs-number">1</span>,
 *     <span class="hljs-attr">itemStyle</span>: {
 *         <span class="hljs-attr">color</span>: <span class="hljs-string">'#b3cde3'</span>
 *     },
 *     <span class="hljs-attr">lineStyle</span>: {
 *         <span class="hljs-attr">color</span>: <span class="hljs-string">'source'</span>,
 *         <span class="hljs-attr">opacity</span>: <span class="hljs-number">0.6</span>
 *     }
 * }]
 * </code></pre>
 * <p>也可以只设置某一层：</p>
 * <pre><code class="lang-js hljs javascript">levels: [{
 *     <span class="hljs-attr">depth</span>: <span class="hljs-number">3</span>,
 *     <span class="hljs-attr">itemStyle</span>: {
 *         <span class="hljs-attr">color</span>: <span class="hljs-string">'#fbb4ae'</span>
 *     },
 *     <span class="hljs-attr">lineStyle</span>: {
 *         <span class="hljs-attr">color</span>: <span class="hljs-string">'source'</span>,
 *         <span class="hljs-attr">opacity</span>: <span class="hljs-number">0.6</span>
 *     }
 * }]
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Levels implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.depth">https://echarts.apache.org/zh/option.html#series-sankey.levels.depth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指定设置的是桑基图哪一层，取值从 0 开始。</p>
     */
    private Integer depth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.label">https://echarts.apache.org/zh/option.html#series-sankey.levels.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.itemStyle">https://echarts.apache.org/zh/option.html#series-sankey.levels.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.lineStyle">https://echarts.apache.org/zh/option.html#series-sankey.levels.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.emphasis">https://echarts.apache.org/zh/option.html#series-sankey.levels.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.blur">https://echarts.apache.org/zh/option.html#series-sankey.levels.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Object blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-sankey.levels.select">https://echarts.apache.org/zh/option.html#series-sankey.levels.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     */
    private Object select;
}
