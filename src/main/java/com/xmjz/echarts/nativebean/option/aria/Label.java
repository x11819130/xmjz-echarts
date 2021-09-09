package com.xmjz.echarts.nativebean.option.aria;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label">https://echarts.apache.org/zh/option.html#aria.label</a>
 * <br/>序号: 2
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>如果 <a href="#aria.enabled">aria.enabled</a> 设置为 <code class="codespan">true</code>，<code class="codespan">label</code> 默认开启。开启后，会根据图表、数据、标题等情况，自动智能生成关于图表的描述，用户也可以通过配置项修改描述。</p>
 * <p><strong>例子：</strong></p>
 * <pre><code class="lang-js hljs javascript">option = {
 *     <span class="hljs-attr">aria</span>: {
 *         <span class="hljs-comment">// 下面几行可以不写，因为 label.enabled 默认 true</span>
 *         <span class="hljs-comment">// label: {</span>
 *         <span class="hljs-comment">//     enabled: true</span>
 *         <span class="hljs-comment">// },</span>
 *         <span class="hljs-attr">enabled</span>: <span class="hljs-literal">true</span>
 *     },
 *     <span class="hljs-attr">title</span>: {
 *         <span class="hljs-attr">text</span>: <span class="hljs-string">'某站点用户访问来源'</span>,
 *         <span class="hljs-attr">x</span>: <span class="hljs-string">'center'</span>
 *     },
 *     <span class="hljs-attr">series</span>: [
 *         {
 *             <span class="hljs-attr">name</span>: <span class="hljs-string">'访问来源'</span>,
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'pie'</span>,
 *             <span class="hljs-attr">data</span>: [
 *                 { <span class="hljs-attr">value</span>: <span class="hljs-number">335</span>, <span class="hljs-attr">name</span>: <span class="hljs-string">'直接访问'</span> },
 *                 { <span class="hljs-attr">value</span>: <span class="hljs-number">310</span>, <span class="hljs-attr">name</span>: <span class="hljs-string">'邮件营销'</span> },
 *                 { <span class="hljs-attr">value</span>: <span class="hljs-number">234</span>, <span class="hljs-attr">name</span>: <span class="hljs-string">'联盟广告'</span> },
 *                 { <span class="hljs-attr">value</span>: <span class="hljs-number">135</span>, <span class="hljs-attr">name</span>: <span class="hljs-string">'视频广告'</span> },
 *                 { <span class="hljs-attr">value</span>: <span class="hljs-number">1548</span>, <span class="hljs-attr">name</span>: <span class="hljs-string">'搜索引擎'</span> }
 *             ]
 *         }
 *     ]
 * };
 * </code></pre>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/aria-pie&amp;edit=1&amp;reset=1" width="700" height="300"></iframe>
 *
 *
 * <p>生成的图表 DOM 上，会有一个 <code class="codespan">aria-label</code> 属性，在朗读设备的帮助下，盲人能够了解图表的内容。其值为：</p>
 * <blockquote>
 * <p>这是一个关于“某站点用户访问来源”的图表。图表类型是饼图，表示访问来源。其数据是——直接访问的数据是335，邮件营销的数据是310，联盟广告的数据是234，视频广告的数据是135，搜索引擎的数据是1548。</p>
 * </blockquote>
 * <p>生成描述的基本流程为，如果 <a href="#aria.enabled">aria.enabled</a> 设置为 <code class="codespan">true</code>（非默认）且 <a href="#aria.label.enabled">aria.label.enabled</a> 设置为 <code class="codespan">true</code>（默认），则生成无障碍访问描述，否则不生成。如果定义了 <a href="#aria.label.description">aria.label.description</a>，则将其作为图表的完整描述，否则根据模板拼接生成描述。我们提供了默认的生成描述的算法，仅当生成的描述不太合适时，才需要修改这些模板，甚至使用 <code class="codespan">aria.label.description</code> 完全覆盖。</p>
 * <p>使用模板拼接时，先根据是否存在标题 <a href="#title.text">title.text</a> 决定使用 <a href="#aria.label.general.withTitle">aria.label.general.withTitle</a> 还是 <a href="#aria.label.general.withoutTitle">aria.label.general.withoutTitle</a> 作为整体性描述。其中，<code class="codespan">aria.label.general.withTitle</code> 配置项包括模板变量 <code class="codespan">'{title}'</code>，将会被替换成图表标题。也就是说，如果 <code class="codespan">aria.label.general.withTitle</code> 被设置为 <code class="codespan">'图表的标题是：{title}。'</code>，则如果包含标题 <code class="codespan">'价格分布图'</code>，这部分的描述为 <code class="codespan">'图表的标题是：价格分布图。'</code>。</p>
 * <p>拼接完标题之后，会依次拼接系列的描述（<a href="#aria.label.series">aria.label.series</a>），和每个系列的数据的描述（<a href="#aria.label.data">aria.label.data</a>）。同样，每个模板都有可能包括模板变量，用以替换实际的值。</p>
 * <p>完整的描述生成流程为：</p>
 * <p><img width="800" height="auto" src="documents/asset/img/echarts-aria.jpg"></p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Label implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.enabled">https://echarts.apache.org/zh/option.html#aria.label.enabled</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启无障碍访问的标签生成。开启后将生成 <code class="codespan">aria-label</code> 属性。</p>
     */
    private Boolean enabled;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.description">https://echarts.apache.org/zh/option.html#aria.label.description</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>默认采用算法自动生成图表描述，如果用户需要完全自定义，可以将这个值设为描述。如将其设置为 <code class="codespan">'这是一个展示了价格走势的图表'</code>，则图表 DOM 元素的 <code class="codespan">aria-label</code> 属性值即为该字符串。</p>
     * <p>这一配置项常用于展示单个的数据并不能展示图表内容时，用户显示指定概括性描述图表的文字。例如图表是一个包含大量散点图的地图，默认的算法只能显示数据点的位置，不能从整体上传达作者的意图。这时候，可以将 <code class="codespan">description</code> 指定为作者想表达的内容即可。</p>
     */
    private String description;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.general">https://echarts.apache.org/zh/option.html#aria.label.general</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>对于图表的整体性描述。</p>
     */
    private Object general;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series">https://echarts.apache.org/zh/option.html#aria.label.series</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>系列相关的配置项。</p>
     */
    private Object series;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.data">https://echarts.apache.org/zh/option.html#aria.label.data</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>数据相关的配置项。</p>
     */
    private Object data;
}
