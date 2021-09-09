package com.xmjz.echarts.nativebean.option.treeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data">https://echarts.apache.org/v4/zh/option.html#series-tree.data</a>
 * <br/>序号: 29
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p><a href="#series-tree.data">series-tree.data</a> 的数据格式是树状结构的，例如：</p>
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
public class Data implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.name">https://echarts.apache.org/v4/zh/option.html#series-tree.data.name</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>树节点的名称，用来标识每一个节点。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.value">https://echarts.apache.org/v4/zh/option.html#series-tree.data.value</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>节点的值，在 tooltip 中显示。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-tree.data.itemStyle</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该节点的样式。</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.label">https://echarts.apache.org/v4/zh/option.html#series-tree.data.label</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该节点的标签。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.emphasis">https://echarts.apache.org/v4/zh/option.html#series-tree.data.emphasis</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮的节点样式</p>
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.tooltip">https://echarts.apache.org/v4/zh/option.html#series-tree.data.tooltip</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Object tooltip;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.animation">https://echarts.apache.org/v4/zh/option.html#series-tree.data.animation</a>
     * <br/>序号: 7
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationThreshold">https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationThreshold</a>
     * <br/>序号: 8
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationDuration">https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationDuration</a>
     * <br/>序号: 9
     * <br/>默认值: 1000
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>初始动画的时长，支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的初始动画效果：</p>
     * <pre><code class="lang-js hljs javascript">animationDuration: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDuration;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationEasing">https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationEasing</a>
     * <br/>序号: 10
     * <br/>默认值: linear
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationDelay">https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationDelay</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>初始动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的初始动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-js hljs javascript">animationDelay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationDurationUpdate">https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationDurationUpdate</a>
     * <br/>序号: 12
     * <br/>默认值: 300
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的时长。</p>
     * <p>支持回调函数，可以通过每个数据返回不同的时长实现更戏剧的更新动画效果：</p>
     * <pre><code class="lang-js hljs javascript">animationDurationUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据时长越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     */
    private Object animationDurationUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationEasingUpdate">https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationEasingUpdate</a>
     * <br/>序号: 13
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationDelayUpdate">https://echarts.apache.org/v4/zh/option.html#series-tree.data.animationDelayUpdate</a>
     * <br/>序号: 14
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-js hljs javascript">animationDelayUpdate: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">idx</span>) </span>{
     *     <span class="hljs-comment">// 越往后的数据延迟越大</span>
     *     <span class="hljs-keyword">return</span> idx * <span class="hljs-number">100</span>;
     * }
     * </code></pre>
     * <p>也可以看<a href="https://echarts.apache.org/examples/zh/editor.html?c=bar-animation-delay" target="_blank">该示例</a></p>
     */
    private Object animationDelayUpdate;
}
