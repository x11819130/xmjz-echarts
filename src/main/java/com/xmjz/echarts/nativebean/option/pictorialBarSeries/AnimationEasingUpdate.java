package com.xmjz.echarts.nativebean.option.pictorialBarSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-pictorialBar.animationEasingUpdate">https://echarts.apache.org/zh/option.html#series-pictorialBar.animationEasingUpdate</a>
 * <br/>序号: 50
 * <br/>默认值: 无
 * <br/>js类型: ["string"]
 * <br/>描述:
 * <p>数据更新动画的缓动效果。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class AnimationEasingUpdate implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-pictorialBar.animationEasingUpdate.animationDelay
     * <br/>序号: 1
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
     * 官方文档: https://echarts.apache.org/zh/option.html#series-pictorialBar.animationEasingUpdate.animationDelayUpdate
     * <br/>序号: 2
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
