package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap">#visualMap</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p><code class="codespan">visualMap</code> 是视觉映射组件，用于进行『视觉编码』，也就是将数据映射到视觉元素（视觉通道）。</p>
 * <p>视觉元素可以是：<br></p>
 * <ul>
 * <li><code class="codespan">symbol</code>: 图元的图形类别。</li>
 * <li><code class="codespan">symbolSize</code>: 图元的大小。</li>
 * <li><code class="codespan">color</code>: 图元的颜色。</li>
 * <li><code class="codespan">colorAlpha</code>: 图元的颜色的透明度。</li>
 * <li><code class="codespan">opacity</code>: 图元以及其附属物（如文字标签）的透明度。</li>
 * <li><code class="codespan">colorLightness</code>: 颜色的明暗度，参见 <a href="https://en.wikipedia.org/wiki/HSL_and_HSV" target="_blank">HSL</a>。</li>
 * <li><code class="codespan">colorSaturation</code>: 颜色的饱和度，参见 <a href="https://en.wikipedia.org/wiki/HSL_and_HSV" target="_blank">HSL</a>。</li>
 * <li><code class="codespan">colorHue</code>: 颜色的色调，参见 <a href="https://en.wikipedia.org/wiki/HSL_and_HSV" target="_blank">HSL</a>。</li>
 * </ul>
 * <p><code class="codespan">visualMap</code> 组件可以定义多个，从而可以同时对数据中的多个维度进行视觉映射。</p>
 * <p><code class="codespan">visualMap</code> 组件可以定义为 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise">分段型（visualMapPiecewise）</a> 或 <a href="https://echarts.apache.org/zh/option.html#visualMap-continuous">连续型（visualMapContinuous）</a>，通过 <code class="codespan">type</code> 来区分。例如：</p>
 * <pre><code class="lang-javascript hljs">option = {
 *     <span class="hljs-attr">visualMap</span>: [
 *         { <span class="hljs-comment">// 第一个 visualMap 组件</span>
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'continuous'</span>, <span class="hljs-comment">// 定义为连续型 visualMap</span>
 *             ...
 *         },
 *         { <span class="hljs-comment">// 第二个 visualMap 组件</span>
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'piecewise'</span>, <span class="hljs-comment">// 定义为分段型 visualMap</span>
 *             ...
 *         }
 *     ],
 *     ...
 * };
 * </code></pre>
 * <p><br>
 * <strong>✦ 视觉映射方式的配置 ✦</strong></p>
 * <p>既然是『数据』到『视觉元素』的映射，<code class="codespan">visualMap</code> 中可以指定数据的『哪个维度』（参见<a href="https://echarts.apache.org/zh/option.html#visualMap.dimension">visualMap.dimension</a>）映射到哪些『视觉元素』（参见<a href="https://echarts.apache.org/zh/option.html#visualMap.inRange">visualMap.inRange</a> 和 <a href="https://echarts.apache.org/zh/option.html#visualMap.outOfRange">visualMap.outOfRange</a>）中。</p>
 * <p><br>
 * 在 visualMap 组件所控制的 series 中，如果 series 中某个数据项需要避开 visualMap 映射，可以这么配置：</p>
 * <pre><code class="hljs typescript">series: {
 *     <span class="hljs-keyword">type</span>: <span class="hljs-string">'...'</span>,
 *     data: [
 *         {name: <span class="hljs-string">'Shanghai'</span>, value: <span class="hljs-number">251</span>},
 *         {name: <span class="hljs-string">'Haikou'</span>, value: <span class="hljs-number">21</span>},
 *         <span class="hljs-comment">// 设置 `visualMap: false` 则 visualMap 不对此项进行控制，此时系列</span>
 *         <span class="hljs-comment">// 可使用自身的视觉参数（color/symbol/ ...控制此项的显示。</span>
 *         {name: <span class="hljs-string">'Beijing'</span>, value: <span class="hljs-number">821</span>, visualMap: <span class="hljs-literal">false</span>},
 *         ...
 *     ]
 * }
 * </code></pre><p><br>
 * <strong>✦ 与 ECharts2 中 dataRange 的关系 ✦</strong></p>
 * <p><code class="codespan">visualMap</code> 是由 ECharts2 中的 <code class="codespan">dataRange</code> 组件改名以及扩展而来。ECharts3里 <code class="codespan">option</code> 中的 <code class="codespan">dataRange</code> 配置项仍然被兼容，会自动转换成 <code class="codespan">visualMap</code> 配置项。在option中推荐写 <code class="codespan">visualMap</code> 而非 <code class="codespan">dataRange</code>。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class VisualMap extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

}
