package com.xmjz.echarts.nativebean.option.mapSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.projection">https://echarts.apache.org/zh/option.html#series-map.projection</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>自定义地图投影，至少需要提供<code class="codespan">project</code>, <code class="codespan">unproject</code>两个方法分别用来计算投影后的坐标以及计算投影前的坐标。</p>
 * <p>比如墨卡托投影：</p>
 * <pre><code class="lang-ts hljs typescript">series: {
 *     <span class="hljs-keyword">type</span>: <span class="hljs-string">'map'</span>,
 *     projection: {
 *         project: <span class="hljs-function">(<span class="hljs-params">point</span>) =&gt;</span> [point[<span class="hljs-number">0</span>] / <span class="hljs-number">180</span> * <span class="hljs-built_in">Math</span>.PI, -<span class="hljs-built_in">Math</span>.log(<span class="hljs-built_in">Math</span>.tan((<span class="hljs-built_in">Math</span>.PI / <span class="hljs-number">2</span> + point[<span class="hljs-number">1</span>] / <span class="hljs-number">180</span> * <span class="hljs-built_in">Math</span>.PI) / <span class="hljs-number">2</span>))],
 *         unproject: <span class="hljs-function">(<span class="hljs-params">point</span>) =&gt;</span> [point[<span class="hljs-number">0</span>] * <span class="hljs-number">180</span> / <span class="hljs-built_in">Math</span>.PI, <span class="hljs-number">2</span> * <span class="hljs-number">180</span> / <span class="hljs-built_in">Math</span>.PI * <span class="hljs-built_in">Math</span>.atan(<span class="hljs-built_in">Math</span>.exp(point[<span class="hljs-number">1</span>])) - <span class="hljs-number">90</span>]
 *     }
 * }
 * </code></pre>
 * <p>除了我们自己实现投影公式，我们也可以使用 <a href="https://github.com/d3/d3-geo" target="_blank">d3-geo</a> 等第三方库提供的现成的投影实现：</p>
 * <pre><code class="lang-ts hljs typescript"><span class="hljs-keyword">const</span> projection = d3.geoConicEqualArea();
 * <span class="hljs-comment">// ...</span>
 * series: {
 *     <span class="hljs-keyword">type</span>: <span class="hljs-string">'map'</span>,
 *     projection: {
 *         project: <span class="hljs-function">(<span class="hljs-params">point</span>) =&gt;</span> projection(point),
 *         unproject: <span class="hljs-function">(<span class="hljs-params">point</span>) =&gt;</span> projection.invert(point)
 *     }
 * }
 * </code></pre>
 * <p>注：自定义投影只有在使用<code class="codespan">GeoJSON</code>作为数据源的时候有用。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Projection implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.projection.project">https://echarts.apache.org/zh/option.html#series-map.projection.project</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Function"]
     * <br/>描述:
     * <pre><code class="lang-ts hljs typescript">(coord: [<span class="hljs-built_in">number</span>, <span class="hljs-built_in">number</span>]) =&gt; [<span class="hljs-built_in">number</span>, <span class="hljs-built_in">number</span>]
     * </code></pre>
     * <p>将经纬度坐标投影为其它坐标。</p>
     */
    private Object project;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.projection.unproject">https://echarts.apache.org/zh/option.html#series-map.projection.unproject</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Function"]
     * <br/>描述:
     * <pre><code class="lang-ts hljs typescript">(point: [<span class="hljs-built_in">number</span>, <span class="hljs-built_in">number</span>]) =&gt; [<span class="hljs-built_in">number</span>, <span class="hljs-built_in">number</span>]
     * </code></pre>
     * <p>根据投影后坐标计算投影前的经纬度坐标</p>
     */
    private Object unproject;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.projection.stream">https://echarts.apache.org/zh/option.html#series-map.projection.stream</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Function"]
     * <br/>描述:
     * <p>该属性主要用于适配 <a href="https://github.com/d3/d3-geo" target="_blank">d3-geo</a> 中使用的 <a href="https://github.com/d3/d3-geo#streams" target="_blank">stream</a> 接口。在引入 stream 后可以同时引入<a href="https://github.com/d3/d3-geo" target="_blank">d3-geo</a> 中实现的<a href="https://bl.ocks.org/mbostock/3788999" target="_blank">Antimeridian Clipping</a>以及<a href="https://bl.ocks.org/mbostock/3795544" target="_blank">Adaptive Sampling</a>算法。</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-keyword">const</span> projection = d3.geoProjection(<span class="hljs-function">(<span class="hljs-params">x, y</span>) =&gt;</span> ([x, y / <span class="hljs-number">0.75</span>]))
     *     .rotate([<span class="hljs-number">-115</span>, <span class="hljs-number">0</span>]);
     * <span class="hljs-comment">// ...</span>
     * series: {
     *     <span class="hljs-keyword">type</span>: <span class="hljs-string">'map'</span>,
     *     projection: {
     *         <span class="hljs-comment">// project 和 unproject 依旧需要配置。</span>
     *         project: <span class="hljs-function">(<span class="hljs-params">point</span>) =&gt;</span> projection(point),
     *         unproject: <span class="hljs-function">(<span class="hljs-params">point</span>) =&gt;</span> projection.invert(point),
     *         <span class="hljs-comment">// 可以直接使用 d3-geo 提供的 stream 方法。</span>
     *         stream: projection.stream
     *     }
     * }
     * </code></pre>
     * <p>该配置并非是必要的。</p>
     */
    private Object stream;
}
