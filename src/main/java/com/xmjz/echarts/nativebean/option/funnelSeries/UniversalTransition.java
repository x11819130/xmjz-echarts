package com.xmjz.echarts.nativebean.option.funnelSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.universalTransition">https://echarts.apache.org/zh/option.html#series-funnel.universalTransition</a>
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p>全局过渡动画相关的配置。</p>
 * <p>全局过渡动画（Universal Transition）提供了任意系列之间进行变形动画的功能。开启该功能后，每次<code class="codespan">setOption</code>，相同<code class="codespan">id</code>的系列之间会自动关联进行动画的过渡，更细粒度的关联配置见<code class="codespan">universalTransition.seriesKey</code>配置。</p>
 * <p>通过配置<code class="codespan">encode.itemGroupId</code>或者<code class="codespan">dataGroupId</code>等指定数据的分组，还可以实现诸如下钻，聚合等一对多或者多对一的动画。</p>
 * <p>可以直接在系列中配置 <code class="codespan">universalTransition: true</code> 开启该功能。也可以提供一个对象进行更多属性的配置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class UniversalTransition implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.universalTransition.enabled">https://echarts.apache.org/zh/option.html#series-funnel.universalTransition.enabled</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否开启全局过渡动画。</p>
     */
    private Boolean enabled;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.universalTransition.seriesKey">https://echarts.apache.org/zh/option.html#series-funnel.universalTransition.seriesKey</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","Array"]
     * <br/>描述:
     * <p><code class="codespan">seriesKey</code>决定了如何关联需要动画的系列，未配置时会默认取系列的<code class="codespan">id</code>。</p>
     * <p>通常该配置为一个字符串，配置为相同<code class="codespan">seriesKey</code>的系列之间会进行动画的过渡。也可以像下面配置为一个数组：</p>
     * <pre><code class="lang-ts hljs typescript">seriesKey: [<span class="hljs-string">'male'</span>, <span class="hljs-string">'female'</span>]
     * </code></pre>
     * <p>配置为数组意味着在动画的时候所有数组项指定的系列会合并为当前系列。比如该配置是指<code class="codespan">id</code>或者<code class="codespan">seriesKey</code>为<code class="codespan">'male'</code>和<code class="codespan">'female'</code>的系列会合并成当前系列。</p>
     */
    private Object seriesKey;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.universalTransition.divideShape">https://echarts.apache.org/zh/option.html#series-funnel.universalTransition.divideShape</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p><code class="codespan">divideShape</code>决定在一对多或者多对一的动画中，当前系列的图形如何分裂成多个图形。目前支持</p>
     * <ul>
     * <li><code class="codespan">'split'</code> 通过一定的算法将分割图形成为多个。</li>
     * <li><code class="codespan">'clone'</code> 从当前图形克隆得到多个。</li>
     * </ul>
     * <p>为了较好的效果，不同的系列会默认有不同的配置，比如散点图这种图形比较小且复杂的默认采用了<code class="codespan">'clone'</code>，而柱状图这种更加规则的则默认是<code class="codespan">'split'</code>。你可以根据你自己的场景需求设置为需要的分裂策略。</p>
     */
    private String divideShape;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-funnel.universalTransition.delay">https://echarts.apache.org/zh/option.html#series-funnel.universalTransition.delay</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Function"]
     * <br/>描述:
     * <pre><code class="lang-ts hljs typescript">(index: <span class="hljs-built_in">number</span>, count: <span class="hljs-built_in">number</span>) =&gt; <span class="hljs-built_in">number</span>
     * </code></pre>
     * <p>配置一对多或者多对一的动画中每个图形的动画延时，设置不同的动画延时可以给动画带来一定的趣味性。比如下面代码每个图形通过一个随机的延时造成一种错落的效果：</p>
     * <pre><code class="lang-ts hljs typescript">delay: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">index, count</span>) </span>{
     *     <span class="hljs-keyword">return</span> <span class="hljs-built_in">Math</span>.random() * <span class="hljs-number">1000</span>;
     * }
     * </code></pre>
     */
    private Object delay;
}
