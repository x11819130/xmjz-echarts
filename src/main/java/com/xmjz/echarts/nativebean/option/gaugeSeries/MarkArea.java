package com.xmjz.echarts.nativebean.option.gaugeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea</a>
 * <br/>序号: 24
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>图表标域，常用于标记图表中某个范围的数据，例如标出某段时间投放了广告。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class MarkArea implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.silent">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.silent</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。</p>
     */
    private Boolean silent;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.label">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.label</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标域文本配置。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.itemStyle</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该标域的样式。</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.emphasis">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.emphasis</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮的标域样式</p>
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.data">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.data</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     * <p>标域的数据数组。每个数组项是一个两个项的数组，分别表示标域左上角和右下角的位置，每个项支持通过下面几种方式指定自己的位置</p>
     * <ol>
     * <li>通过 <a href="#series-gauge.markArea.data.0.x">x</a>, <a href="#series-gauge.markArea.data.0.y">y</a> 属性指定相对容器的屏幕坐标，单位像素，支持百分比。</li>
     * </ol>
     * <p>当多个属性同时存在时，优先级按上述的顺序。</p>
     * <pre><code class="hljs javascript">data: [
     *     [
     *         {
     *             <span class="hljs-attr">name</span>: <span class="hljs-string">'两个屏幕坐标之间的标域'</span>,
     *             <span class="hljs-attr">x</span>: <span class="hljs-number">100</span>,
     *             <span class="hljs-attr">y</span>: <span class="hljs-number">100</span>
     *         }, {
     *             <span class="hljs-attr">x</span>: <span class="hljs-string">'90%'</span>,
     *             <span class="hljs-attr">y</span>: <span class="hljs-string">'10%'</span>
     *         }
     *     ]
     * ]
     * </code></pre>
     */
    private Object data;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animation">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animation</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启动画。</p>
     */
    private Boolean animation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationThreshold">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationThreshold</a>
     * <br/>序号: 7
     * <br/>默认值: 2000
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>是否开启动画的阈值，当单个系列显示的图形数量大于这个阈值时会关闭动画。</p>
     */
    private Integer animationThreshold;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationDuration">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationDuration</a>
     * <br/>序号: 8
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationEasing">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationEasing</a>
     * <br/>序号: 9
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>初始动画的缓动效果。不同的缓动效果可以参考 <a href="https://echarts.apache.org/examples/zh/editor.html?c=line-easing" target="_blank">缓动示例</a>。</p>
     */
    private String animationEasing;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationDelay">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationDelay</a>
     * <br/>序号: 10
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationDurationUpdate">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationDurationUpdate</a>
     * <br/>序号: 11
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationEasingUpdate">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationEasingUpdate</a>
     * <br/>序号: 12
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>数据更新动画的缓动效果。</p>
     */
    private String animationEasingUpdate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationDelayUpdate">https://echarts.apache.org/v4/zh/option.html#series-gauge.markArea.animationDelayUpdate</a>
     * <br/>序号: 13
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
