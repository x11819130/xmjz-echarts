package com.xmjz.echarts.nativebean.option.pictorialBarSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation">https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation</a>
 * <br/>默认值: 无
 * <br/>js类型: ["boolean"]
 * <br/>描述:
 * <p>是否开启 hover 在图形上的提示动画效果。</p>
 * <p>此属性可以被设置在系列的 <a href="#series-pictorialBar.hoverAnimation">根部</a>，表示对此系列中所有数据都生效；也可以被设置在 <a href="series-pictorialBar.data" target="_blank">data</a> 中的 <a href="#series-pictorialBar.data.hoverAnimation">每个数据项中</a>，表示只对此数据项生效。</p>
 * <p>例如：</p>
 * <pre><code class="lang-js hljs javascript">series: [{
 *     <span class="hljs-attr">hoverAnimation</span>: ... <span class="hljs-comment">// 对 data 中所有数据项生效。</span>
 *     <span class="hljs-attr">data</span>: [<span class="hljs-number">23</span>, <span class="hljs-number">56</span>]
 * }]
 * 或者
 * <span class="hljs-attr">series</span>: [{
 *     <span class="hljs-attr">data</span>: [{
 *         <span class="hljs-attr">value</span>: <span class="hljs-number">23</span>
 *         <span class="hljs-attr">hoverAnimation</span>: ... <span class="hljs-comment">// 只对此数据项生效</span>
 *     }, {
 *         <span class="hljs-attr">value</span>: <span class="hljs-number">56</span>
 *         <span class="hljs-attr">hoverAnimation</span>: ... <span class="hljs-comment">// 只对此数据项生效</span>
 *     }]
 * }]
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class HoverAnimation implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animation">https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animation</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationThreshold">https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationThreshold</a>
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationDuration">https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationDuration</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationEasing">https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationEasing</a>
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationDurationUpdate">https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationDurationUpdate</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationEasingUpdate">https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationEasingUpdate</a>
     * <br/>默认值: cubicInOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationDelay">https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationDelay</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>动画开始之前的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-js hljs javascript">animationDelay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">dataIndex, params</span>) </span>{
     *     <span class="hljs-keyword">return</span> params.index * <span class="hljs-number">30</span>;
     * }
     * 或者反向：
     * <span class="hljs-attr">animationDelay</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">dataIndex, params</span>) </span>{
     *     <span class="hljs-keyword">return</span> (params.count - <span class="hljs-number">1</span> - params.index) * <span class="hljs-number">30</span>;
     * }
     * </code></pre>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeatDirection&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     */
    private Object animationDelay;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationDelayUpdate">https://echarts.apache.org/zh/option.html#series-pictorialBar.hoverAnimation.animationDelayUpdate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>数据更新动画的延迟，支持回调函数，可以通过每个数据返回不同的 delay 时间实现更戏剧的更新动画效果。</p>
     * <p>如下示例：</p>
     * <pre><code class="lang-js hljs javascript">animationDelay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">dataIndex, params</span>) </span>{
     *     <span class="hljs-keyword">return</span> params.index * <span class="hljs-number">30</span>;
     * }
     * 或者反向：
     * <span class="hljs-attr">animationDelay</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">dataIndex, params</span>) </span>{
     *     <span class="hljs-keyword">return</span> (params.count - <span class="hljs-number">1</span> - params.index) * <span class="hljs-number">30</span>;
     * }
     * </code></pre>
     * <p>例子：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/pictorialBar-repeatDirection&amp;reset=1&amp;edit=1" width="800" height="400"></iframe>
     */
    private Object animationDelayUpdate;
}
