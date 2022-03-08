package com.xmjz.echarts.nativebean.option.series.treeSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.treeSeries.data.Blur;
import com.xmjz.echarts.nativebean.option.series.treeSeries.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.treeSeries.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.treeSeries.data.Label;
import com.xmjz.echarts.nativebean.option.series.treeSeries.data.LineStyle;
import com.xmjz.echarts.nativebean.option.series.treeSeries.data.Select;
import com.xmjz.echarts.nativebean.option.series.treeSeries.data.Tooltip;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data">#series-tree.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p><a href="https://echarts.apache.org/zh/option.html#series-tree.data">series-tree.data</a> 的数据格式是树状结构的，例如：</p>
 * <pre><code class="lang-javascript hljs">{ <span class="hljs-comment">// 注意，最外层是一个对象，代表树的根节点</span>
 *     <span class="hljs-attr">name</span>: <span class="hljs-string">"flare"</span>,    <span class="hljs-comment">// 节点的名称，当前节点 label 对应的文本</span>
 *     <span class="hljs-attr">label</span>: {          <span class="hljs-comment">// 此节点特殊的 label 配置（如果需要的话）。</span>
 *         ...           <span class="hljs-comment">// label的格式参见 series-tree.label。</span>
 *     },
 *     <span class="hljs-attr">itemStyle</span>: {      <span class="hljs-comment">// 此节点特殊的 itemStyle 配置（如果需要的话）。</span>
 *         ...           <span class="hljs-comment">// label的格式参见 series-tree.itemStyle。</span>
 *     },
 *     <span class="hljs-attr">children</span>: [
 *         {
 *             <span class="hljs-attr">name</span>: <span class="hljs-string">"flex"</span>,
 *             <span class="hljs-attr">value</span>: <span class="hljs-number">4116</span>,    <span class="hljs-comment">// value 值，只在 tooltip 中显示</span>
 *             <span class="hljs-attr">label</span>: {
 *                 ...
 *             },
 *             <span class="hljs-attr">itemStyle</span>: {
 *                 ...
 *             },
 *             <span class="hljs-attr">collapsed</span>: <span class="hljs-literal">null</span>, <span class="hljs-comment">// 如果为 true，表示此节点默认折叠。</span>
 *             <span class="hljs-attr">children</span>: [...] <span class="hljs-comment">// 叶子节点没有 children, 可以不写</span>
 *         },
 *         ...
 *     ]
 * };
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.name">#series-tree.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>树节点的名称，用来标识每一个节点。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.value">#series-tree.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>节点的值，在 tooltip 中显示。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.itemStyle">#series-tree.data.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该节点的样式。</p>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.lineStyle">#series-tree.data.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该节点对应的边的样式。</p>
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.label">#series-tree.data.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该节点的标签。</p>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.emphasis">#series-tree.data.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>节点高亮状态的配置。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.blur">#series-tree.data.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>节点淡出状态的配置。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.select">#series-tree.data.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>节点选中状态的配置。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.tooltip">#series-tree.data.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.animation">#series-tree.data.animation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.animationThreshold">#series-tree.data.animationThreshold</a>
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.animationDuration">#series-tree.data.animationDuration</a>
     * <br/>默认值: 1000
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>初始动画的时长，支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的初始动画效果：</p>
     * <pre><code class="lang-ts hljs typescript">animationDuration: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDuration;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.animationEasing">#series-tree.data.animationEasing</a>
     * <br/>默认值: 'linear'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.animationDelay">#series-tree.data.animationDelay</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>初始动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的初始动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-ts hljs typescript">animationDelay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.animationDurationUpdate">#series-tree.data.animationDurationUpdate</a>
     * <br/>默认值: 300
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的时长。</p>
     * <p>支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的更新动画效果：</p>
     * <pre><code class="lang-ts hljs typescript">animationDurationUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDurationUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.animationEasingUpdate">#series-tree.data.animationEasingUpdate</a>
     * <br/>默认值: 'cubicInOut'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-tree.data.animationDelayUpdate">#series-tree.data.animationDelayUpdate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-ts hljs typescript">animationDelayUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelayUpdate;
}
