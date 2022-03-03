package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.aria.Decal;
import com.xmjz.echarts.nativebean.option.aria.Label;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria">https://echarts.apache.org/zh/option.html#aria</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>W3C 制定了无障碍富互联网应用规范集（<a href="https://www.w3.org/WAI/intro/aria" target="_blank">WAI-ARIA</a>，the Accessible Rich Internet Applications Suite），致力于使得网页内容和网页应用能够被更多残障人士访问。Apache ECharts 4 遵从这一规范，支持自动根据图表配置项智能生成描述，使得盲人可以在朗读设备的帮助下了解图表内容，让图表可以被更多人群访问。除此之外，Apache ECharts 5 新增支持贴花纹理，作为颜色的辅助表达，进一步用以区分数据。</p>
 * <p>默认关闭，需要通过将 <a href="#aria.enabled">aria.enabled</a> 设置为 <code class="codespan">true</code> 开启。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Aria implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.enabled">https://echarts.apache.org/zh/option.html#aria.enabled</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启无障碍访问。如果不开启，则不会开启 <code class="codespan">label</code> 或 <code class="codespan">decal</code> 效果。</p>
     */
    private Boolean enabled;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label">https://echarts.apache.org/zh/option.html#aria.label</a>
     * <br/>默认值: true
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>如果 <a href="#aria.enabled">aria.enabled</a> 设置为 <code class="codespan">true</code>，<code class="codespan">label</code> 默认开启。开启后，会根据图表、数据、标题等情况，自动智能生成关于图表的描述，用户也可以通过配置项修改描述。</p>
     * <p><strong>例子：</strong></p>
     * <pre><code class="lang-ts hljs typescript">option = {
     *     aria: {
     *         <span class="hljs-comment">// 下面几行可以不写，因为 label.enabled 默认 true</span>
     *         <span class="hljs-comment">// label: {</span>
     *         <span class="hljs-comment">//     enabled: true</span>
     *         <span class="hljs-comment">// },</span>
     *         enabled: <span class="hljs-literal">true</span>
     *     },
     *     title: {
     *         text: <span class="hljs-string">'某站点用户访问来源'</span>,
     *         x: <span class="hljs-string">'center'</span>
     *     },
     *     series: [
     *         {
     *             name: <span class="hljs-string">'访问来源'</span>,
     *             <span class="hljs-keyword">type</span>: <span class="hljs-string">'pie'</span>,
     *             data: [
     *                 { value: <span class="hljs-number">335</span>, name: <span class="hljs-string">'直接访问'</span> },
     *                 { value: <span class="hljs-number">310</span>, name: <span class="hljs-string">'邮件营销'</span> },
     *                 { value: <span class="hljs-number">234</span>, name: <span class="hljs-string">'联盟广告'</span> },
     *                 { value: <span class="hljs-number">135</span>, name: <span class="hljs-string">'视频广告'</span> },
     *                 { value: <span class="hljs-number">1548</span>, name: <span class="hljs-string">'搜索引擎'</span> }
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
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.decal">https://echarts.apache.org/zh/option.html#aria.decal</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>为系列数据增加贴花纹理，作为颜色的辅助，帮助区分数据。使用默认贴花图案的方式非常简单，只需要开启即可：</p>
     * <pre><code class="hljs javascript">aria: {
     *     <span class="hljs-attr">enabled</span>: <span class="hljs-literal">true</span>,
     *     <span class="hljs-attr">decal</span>: {
     *         <span class="hljs-attr">show</span>: <span class="hljs-literal">true</span>
     *     }
     * }
     * </code></pre><iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/aria-decal-simple&amp;edit=1&amp;reset=1" width="700" height="300"></iframe>
     *
     *
     * <p>绝大部分支持填充色的系列都支持贴花图案，包括：<code class="codespan">'line'</code>, <code class="codespan">'bar'</code>, <code class="codespan">'pie'</code>, <code class="codespan">'radar'</code>, <code class="codespan">'treemap'</code>, <code class="codespan">'sunburst'</code>, <code class="codespan">'boxplot'</code>, <code class="codespan">'sankey'</code>, <code class="codespan">'funnel'</code>, <code class="codespan">'gauge'</code>, <code class="codespan">'pictorialBar'</code>, <code class="codespan">'themeRiver'</code>, <code class="codespan">'custom'</code> 等。其中，部分系列默认没有填充色（如 <code class="codespan">'line'</code>, <code class="codespan">'radar'</code>, <code class="codespan">'boxplot'</code>）需要在设置了填充样式 <code class="codespan">areaStyle</code> 的情况下才生效。</p>
     */
    private Decal decal;
}
