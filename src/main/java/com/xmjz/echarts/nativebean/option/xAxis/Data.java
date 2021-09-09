package com.xmjz.echarts.nativebean.option.xAxis;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#xAxis.data">https://echarts.apache.org/v4/zh/option.html#xAxis.data</a>
 * <br/>序号: 31
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>类目数据，在类目轴（<a href="#xAxis.type">type</a>: <code class="codespan">'category'</code>）中有效。</p>
 * <p>如果没有设置 <a href="#xAxis.type">type</a>，但是设置了 <code class="codespan">axis.data</code>，则认为 <code class="codespan">type</code> 是 <code class="codespan">'category'</code>。</p>
 * <p>如果设置了 <a href="#xAxis.type">type</a> 是 <code class="codespan">'category'</code>，但没有设置 <code class="codespan">axis.data</code>，则 <code class="codespan">axis.data</code> 的内容会自动从 <a href="#series.data">series.data</a> 中获取，这会比较方便。不过注意，<code class="codespan">axis.data</code> 指明的是 <code class="codespan">'category'</code> 轴的取值范围。如果不指定而是从 <a href="#series.data">series.data</a> 中获取，那么只能获取到 <a href="#series.data">series.data</a> 中出现的值。比如说，假如 <a href="#series.data">series.data</a> 为空时，就什么也获取不到。</p>
 * <p>示例：</p>
 * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 所有类目名称列表</span>
 * <span class="hljs-attr">data</span>: [<span class="hljs-string">'周一'</span>, <span class="hljs-string">'周二'</span>, <span class="hljs-string">'周三'</span>, <span class="hljs-string">'周四'</span>, <span class="hljs-string">'周五'</span>, <span class="hljs-string">'周六'</span>, <span class="hljs-string">'周日'</span>]
 * <span class="hljs-comment">// 每一项也可以是具体的配置项，此时取配置项中的 `value` 为类目名</span>
 * <span class="hljs-attr">data</span>: [{
 *     <span class="hljs-attr">value</span>: <span class="hljs-string">'周一'</span>,
 *     <span class="hljs-comment">// 突出周一</span>
 *     <span class="hljs-attr">textStyle</span>: {
 *         <span class="hljs-attr">fontSize</span>: <span class="hljs-number">20</span>,
 *         <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>
 *     }
 * }, <span class="hljs-string">'周二'</span>, <span class="hljs-string">'周三'</span>, <span class="hljs-string">'周四'</span>, <span class="hljs-string">'周五'</span>, <span class="hljs-string">'周六'</span>, <span class="hljs-string">'周日'</span>]
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#xAxis.data.value">https://echarts.apache.org/v4/zh/option.html#xAxis.data.value</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>单个类目名称。</p>
     */
    private String value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#xAxis.data.textStyle">https://echarts.apache.org/v4/zh/option.html#xAxis.data.textStyle</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>类目标签的文字样式。</p>
     */
    private Object textStyle;
}
