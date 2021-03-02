package com.xmjz.echarts.nativebean.option.treemapSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">https://echarts.apache.org/zh/option.html#series-treemap.levels</a>
 * <br/>序号: 36
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p><strong>多层配置</strong></p>
 * <p>treemap 中采用『三级配置』：</p>
 * <pre><code class="hljs">『每个节点』-&gt;『每个层级』-&gt;『每个系列』。
 * </code></pre><p>即我们可以对每个节点进行配置，也可以对树的每个层级进行配置，也可以 series 上设置全局配置。节点上的设置，优先级最高。</p>
 * <p>最常用的是『每个层级进行配置』，<code class="codespan">levels</code> 配置项就是每个层级的配置。例如：</p>
 * <pre><code class="lang-javascript hljs"><span class="hljs-comment">// Notice that in fact the data structure is not "tree", but is "forest".</span>
 * <span class="hljs-comment">// 注意，这个数据结构实际不是『树』而是『森林』</span>
 * <span class="hljs-attr">data</span>: [
 *     {
 *         <span class="hljs-attr">name</span>: <span class="hljs-string">'nodeA'</span>,
 *         <span class="hljs-attr">children</span>: [
 *             {<span class="hljs-attr">name</span>: <span class="hljs-string">'nodeAA'</span>},
 *             {<span class="hljs-attr">name</span>: <span class="hljs-string">'nodeAB'</span>},
 *         ]
 *     },
 *     {
 *         <span class="hljs-attr">name</span>: <span class="hljs-string">'nodeB'</span>,
 *         <span class="hljs-attr">children</span>: [
 *             {<span class="hljs-attr">name</span>: <span class="hljs-string">'nodeBA'</span>}
 *         ]
 *     }
 * ],
 * <span class="hljs-attr">levels</span>: [
 *     {...}, <span class="hljs-comment">// 『森林』的顶层配置。即含有 'nodeA', 'nodeB' 的这层。</span>
 *     {...}, <span class="hljs-comment">// 下一层配置，即含有 'nodeAA', 'nodeAB', 'nodeBA' 的这层。</span>
 *     {...}, <span class="hljs-comment">// 再下一层配置。</span>
 *     ...
 * ]
 * </code></pre>
 * <p><strong>视觉映射的规则</strong></p>
 * <p>treemap中首要关注的是如何在视觉上较好得区分『不同层级』、『同层级中不同类别』。这需要合理得设置不同层级的『矩形颜色』、『边界粗细』、『边界颜色』甚至『矩形颜色饱和度』等。</p>
 * <p>参见这个<a href="https://echarts.apache.org/examples/zh/editor.html?c=treemap-disk&amp;edit=1&amp;reset=1" target="_blank">例子</a>，最顶层级用颜色区分，分成了『红』『绿』『蓝』等大块。每个颜色块中是下一个层级，使用颜色的饱和度来区分（参见 <code class="codespan">colorSaturation</code>）。最外层的矩形边界是『白色』，下层级的矩形边界是当前区块颜色加上饱和度处理（参见 <code class="codespan">borderColorSaturation</code>）。</p>
 * <p><code class="codespan">treemap</code> 是通过这样的规则来支持这种配置的：每个层级计算用户配置的 <code class="codespan">color</code>、<code class="codespan">colorSaturation</code>、<code class="codespan">borderColor</code>、<code class="codespan">borderColorSaturation</code>等视觉信息（在levels中配置）。如果子节点没有配置，则继承父的配置，否则使用自己的配置）。</p>
 * <p>这样，可以做到：父层级配置 <code class="codespan">color</code> 列表，子层级配置 <code class="codespan">colorSaturation</code>。父层级的每个节点会从 <code class="codespan">color</code> 列表中得到一个颜色，子层级的节点会从 <code class="codespan">colorSaturation</code> 中得到一个值，并且继承父节点得到的颜色，合成得到自己的最终颜色。</p>
 * <p><strong>维度与『额外的视觉映射』</strong></p>
 * <p>例子：每一个 <code class="codespan">value</code> 字段是一个 Array，其中每个项对应一个维度（dimension）。</p>
 * <pre><code class="lang-javascript hljs">[
 *     {
 *         <span class="hljs-attr">value</span>: [<span class="hljs-number">434</span>, <span class="hljs-number">6969</span>, <span class="hljs-number">8382</span>],
 *         <span class="hljs-attr">children</span>: [
 *             {
 *                 <span class="hljs-attr">value</span>: [<span class="hljs-number">1212</span>, <span class="hljs-number">4943</span>, <span class="hljs-number">5453</span>],
 *                 <span class="hljs-attr">id</span>: <span class="hljs-string">'someid-1'</span>,
 *                 <span class="hljs-attr">name</span>: <span class="hljs-string">'description of this node'</span>,
 *                 <span class="hljs-attr">children</span>: [...]
 *             },
 *             {
 *                 <span class="hljs-attr">value</span>: [<span class="hljs-number">4545</span>, <span class="hljs-number">192</span>, <span class="hljs-number">439</span>],
 *                 <span class="hljs-attr">id</span>: <span class="hljs-string">'someid-2'</span>,
 *                 <span class="hljs-attr">name</span>: <span class="hljs-string">'description of this node'</span>,
 *                 <span class="hljs-attr">children</span>: [...]
 *             },
 *             ...
 *         ]
 *     },
 *     {
 *         <span class="hljs-attr">value</span>: [<span class="hljs-number">23</span>, <span class="hljs-number">59</span>, <span class="hljs-number">12</span>],
 *         <span class="hljs-attr">children</span>: [...]
 *     },
 *     ...
 * ]
 * </code></pre>
 * <p>treemap 默认把第一个维度（Array 第一项）映射到『面积』上。而如果想表达更多信息，用户可以把其他的某一个维度（<a href="#series-treemap.viusalDimension">series-treemap.visualDimension</a>），映射到其他的『视觉元素』上，比如颜色明暗等。参见<a href="https://echarts.apache.org/examples/zh/editor.html?c=treemap-obama&amp;edit=1&amp;reset=1" target="_blank">例子</a>中，legend选择 <code class="codespan">Growth</code>时的状态。</p>
 * <p><strong>矩形边框（border）/缝隙（gap）设置如何避免混淆</strong></p>
 * <p>如果统一用一种颜色设置矩形的缝隙（gap），那么当不同层级的矩形同时展示时可能会出现混淆。</p>
 * <p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=doc-example/treemap-borderColor&amp;edit=1&amp;reset=1" target="_blank">例子</a>，注意其中红色的区块中的子矩形其实是更深层级，和其他用白色缝隙区分的矩形不是在一个层级。所以，红色区块中矩形的分割线的颜色，我们在 <code class="codespan">borderColorSaturation</code> 中设置为『加了饱和度变化的红颜色』，以示区别。</p>
 * <p><strong>borderWidth, gapWidth, borderColor 的解释</strong></p>
 * <p><img width="500" height="auto" src="documents/asset/img/treemap-border-gap.png"></p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Levels implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.visualDimension">https://echarts.apache.org/zh/option.html#series-treemap.levels.visualDimension</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><code class="codespan">treemap</code> 中支持对数据其他维度进行视觉映射。</p>
     * <p>首先，treemap的数据格式（参见 <a href="#series-treemap.data">series-treemap.data</a>）中，每个节点的 <code class="codespan">value</code> 都可以是数组。数组每项是一个『维度』（dimension）。<code class="codespan">visualDimension</code> 指定了额外的『视觉映射』使用的是数组的哪一项。默认为第 <code class="codespan">0</code> 项。</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">visualDimension</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Integer visualDimension;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.visualMin">https://echarts.apache.org/zh/option.html#series-treemap.levels.visualMin</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前层级的最小 value 值。如果不设置则自动统计。</p>
     * <p>手动指定 <code class="codespan">visualMin</code>、<code class="codespan">visualMax</code> ，即手动控制了 visual mapping 的值域（当 <a href="#series-treemap.levels.colorMappingBy">colorMappingBy</a> 为 <code class="codespan">'value'</code> 时有意义）。</p>
     */
    private Integer visualMin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.visualMax">https://echarts.apache.org/zh/option.html#series-treemap.levels.visualMax</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前层级的最大 value 值。如果不设置则自动统计。</p>
     * <p>手动指定 <code class="codespan">visualMin</code>、<code class="codespan">visualMax</code> ，即手动控制了 visual mapping 的值域（当 <a href="#series-treemap.levels.colorMappingBy">colorMappingBy</a> 为 <code class="codespan">'value'</code> 时有意义）。</p>
     */
    private Integer visualMax;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.color">https://echarts.apache.org/zh/option.html#series-treemap.levels.color</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>表示同一层级的节点的 颜色 选取列表（选择规则见 <a href="#series-treemap.colorMappingBy">colorMappingBy</a>）。默认为空时，选取系统color列表。</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">color</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private List<Object> color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.colorAlpha">https://echarts.apache.org/zh/option.html#series-treemap.levels.colorAlpha</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>表示同一层级的节点的颜色透明度选取范围。</p>
     * <p>数值范围 0 ~ 1</p>
     * <p>例如, <code class="codespan">colorAlpha</code> 可以是 <code class="codespan">[0.3, 1]</code>.</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">colorAlpha</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private List<Object> colorAlpha;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.colorSaturation">https://echarts.apache.org/zh/option.html#series-treemap.levels.colorSaturation</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>表示同一层级的节点的颜色饱和度 选取范围。</p>
     * <p>数值范围 0 ~ 1。</p>
     * <p>例如, <code class="codespan">colorSaturation</code> 可以是 <code class="codespan">[0.3, 1]</code>.</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">colorSaturation</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Integer colorSaturation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.colorMappingBy">https://echarts.apache.org/zh/option.html#series-treemap.levels.colorMappingBy</a>
     * <br/>序号: 7
     * <br/>默认值: index
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>表示同一层级节点，在颜色列表中（参见 <code class="codespan">color</code> 属性）选择时，按照什么来选择。可选值：</p>
     * <ul>
     * <li><code class="codespan">'value'</code>：</li>
     * </ul>
     * <p>将节点的值（即 <a href="#series-treemap.data.value">series-treemap.data.value</a>）映射到颜色列表中。</p>
     * <p>这样得到的颜色，反应了节点值的大小。</p>
     * <p>可以使用 <a href="#series-treemap.levels.visualDimension">visualDimension</a> 属性来设置，用 <a href="#series-treemap.data">data</a> 中哪个纬度的值来映射。</p>
     * <ul>
     * <li><code class="codespan">'index'</code>：</li>
     * </ul>
     * <p>将节点的 <code class="codespan">index</code>（序号）映射到颜色列表中。即同一层级中，第一个节点取颜色列表中第一个颜色，第二个节点取第二个。</p>
     * <p>这样得到的颜色，便于区分相邻节点。</p>
     * <ul>
     * <li><code class="codespan">'id'</code>：</li>
     * </ul>
     * <p>将节点的 <code class="codespan">id</code>（即 <a href="#series-treemap.data.id">series-treemap.data.id</a>）映射到颜色列表中。<code class="codespan">id</code> 是用户指定的，这样能够使得，在treemap 通过 setOption 变化数值时，同一 <code class="codespan">id</code> 映射到同一颜色，保持一致性。参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=treemap-obama&amp;edit=1&amp;reset=1" target="_blank">例子</a>。</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">colorMappingBy</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private String colorMappingBy;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.visibleMin">https://echarts.apache.org/zh/option.html#series-treemap.levels.visibleMin</a>
     * <br/>序号: 8
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果某个节点的矩形的面积，小于这个数值（单位：px平方），这个节点就不显示。</p>
     * <p>如果不加这个限制，很小的节点会影响显示效果。</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">visibleMin</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Integer visibleMin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.childrenVisibleMin">https://echarts.apache.org/zh/option.html#series-treemap.levels.childrenVisibleMin</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果某个节点的矩形面积，小于这个数值（单位：px平方），则不显示这个节点的子节点。</p>
     * <p>这能够在矩形面积不足够大时候，隐藏节点的细节。当用户用鼠标缩放节点时，如果面积大于此阈值，又会显示子节点。</p>
     * <p>关于视觉设置，详见 <a href="#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">childrenVisibleMin</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Integer childrenVisibleMin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.label">https://echarts.apache.org/zh/option.html#series-treemap.levels.label</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了每个矩形中，文本标签的样式。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">label</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.upperLabel">https://echarts.apache.org/zh/option.html#series-treemap.levels.upperLabel</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">upperLabel</code> 用于显示矩形的父节点的标签。当 <a href="#series-treemap.upperLabel.show">upperLabel.show</a> 为 <code class="codespan">true</code> 的时候，『显示父节点标签』功能开启。</p>
     * <p>同 <a href="#series-treemap.label">series-treemap.label</a> 一样，<code class="codespan">upperLabel</code> 可以存在于 <a href="#series-treemap">series-treemap</a> 的根节点，或者 <a href="#series-treemap.level">series-treemap.level</a> 中，或者 <a href="#series-treemap.data">series-treemap.data</a> 的每个数据项中。</p>
     * <p><a href="#series-treemap.label">series-treemap.label</a> 描述的是，当前节点为叶节点时标签的样式；<code class="codespan">upperLabel</code> 描述的是，当前节点为非叶节点（即含有子节点）时标签的样式。（此时标签一般会被显示在节点的最上部）</p>
     * <p>参见：</p>
     * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=treemap-show-parent&amp;edit=1&amp;reset=1" width="700" height="500"></iframe>
     *
     *
     *
     *
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">label</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Object upperLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.itemStyle">https://echarts.apache.org/zh/option.html#series-treemap.levels.itemStyle</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">itemStyle</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.emphasis">https://echarts.apache.org/zh/option.html#series-treemap.levels.emphasis</a>
     * <br/>序号: 13
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态配置。</p>
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.blur">https://echarts.apache.org/zh/option.html#series-treemap.levels.blur</a>
     * <br/>序号: 14
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出状态配置。</p>
     */
    private Object blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.select">https://echarts.apache.org/zh/option.html#series-treemap.levels.select</a>
     * <br/>序号: 15
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>选中状态配置。</p>
     */
    private Object select;
}
