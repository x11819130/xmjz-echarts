package com.xmjz.echarts.nativebean.option.series.treemapSeries;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.data.Blur;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.data.Emphasis;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.data.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.data.Label;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.data.Select;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.data.Tooltip;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.data.UpperLabel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">#series-treemap.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p><a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a> 的数据格式是树状的，例如：</p>
 * <pre><code class="lang-javascript hljs">[ <span class="hljs-comment">// 注意，最外层是一个数组，而非从某个根节点开始。</span>
 *     {
 *         <span class="hljs-attr">value</span>: <span class="hljs-number">1212</span>,
 *         <span class="hljs-attr">children</span>: [
 *             {
 *                 <span class="hljs-attr">value</span>: <span class="hljs-number">2323</span>,    <span class="hljs-comment">// value字段的值，对应到面积大小。</span>
 *                                 <span class="hljs-comment">// 也可以是数组，如 [2323, 43, 55]，则数组第一项对应到面积大小。</span>
 *                                 <span class="hljs-comment">// 数组其他项可以用于额外的视觉映射，详情参见 series-treemp.levels。</span>
 *                 <span class="hljs-attr">id</span>: <span class="hljs-string">'someid-1'</span>, <span class="hljs-comment">// id 不是必须设置的。</span>
 *                                 <span class="hljs-comment">// 但是如果想使用 API 来改变某个节点，需要用 id 来定位。</span>
 *                 <span class="hljs-attr">name</span>: <span class="hljs-string">'description of this node'</span>, <span class="hljs-comment">// 显示在矩形中的描述文字。</span>
 *                 <span class="hljs-attr">children</span>: [...],
 *                 <span class="hljs-attr">label</span>: {        <span class="hljs-comment">// 此节点特殊的 label 定义（如果需要的话）。</span>
 *                     ...         <span class="hljs-comment">// label的格式参见 series-treemap.label。</span>
 *                 },
 *                 <span class="hljs-attr">itemStyle</span>: {    <span class="hljs-comment">// 此节点特殊的 itemStyle 定义（如果需要的话）。</span>
 *                     ...         <span class="hljs-comment">// label的格式参见 series-treemap.itemStyle。</span>
 *                 }
 *             },
 *             {
 *                 <span class="hljs-attr">value</span>: <span class="hljs-number">4545</span>,
 *                 <span class="hljs-attr">id</span>: <span class="hljs-string">'someid-2'</span>,
 *                 <span class="hljs-attr">name</span>: <span class="hljs-string">'description of this node'</span>,
 *                 <span class="hljs-attr">children</span>: [
 *                     {
 *                         <span class="hljs-attr">value</span>: <span class="hljs-number">5656</span>,
 *                         <span class="hljs-attr">id</span>: <span class="hljs-string">'someid-3'</span>,
 *                         <span class="hljs-attr">name</span>: <span class="hljs-string">'description of this node'</span>,
 *                         <span class="hljs-attr">children</span>: [...]
 *                     },
 *                     ...
 *                 ]
 *             }
 *         ]
 *     },
 *     {
 *         <span class="hljs-attr">value</span>: [<span class="hljs-number">23</span>, <span class="hljs-number">59</span>, <span class="hljs-number">12</span>]
 *         <span class="hljs-comment">// 如果没有children，可以不写</span>
 *     },
 *     ...
 * ]
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.value">#series-treemap.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>每个树节点的值，对应到面积大小。可以是number，也可以是数组，如 <code class="codespan">[2323, 43, 55]</code>，则数组第一项对应到面积大小。</p>
     */
    private Object value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.id">#series-treemap.data.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>每个树节点的id。id 不是必须设置的。但是如果想使用 API 来改变某个节点，需要用 id 来定位。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.name">#series-treemap.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>显示在矩形中的描述文字。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.visualDimension">#series-treemap.data.visualDimension</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><code class="codespan">treemap</code> 中支持对数据其他维度进行视觉映射。</p>
     * <p>首先，treemap的数据格式（参见 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a>）中，每个节点的 <code class="codespan">value</code> 都可以是数组。数组每项是一个『维度』（dimension）。<code class="codespan">visualDimension</code> 指定了额外的『视觉映射』使用的是数组的哪一项。默认为第 <code class="codespan">0</code> 项。</p>
     * <p>关于视觉设置，详见 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">visualDimension</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Integer visualDimension;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.visualMin">#series-treemap.data.visualMin</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前层级的最小 value 值。如果不设置则自动统计。</p>
     * <p>手动指定 <code class="codespan">visualMin</code>、<code class="codespan">visualMax</code> ，即手动控制了 visual mapping 的值域（当 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.colorMappingBy">colorMappingBy</a> 为 <code class="codespan">'value'</code> 时有意义）。</p>
     */
    private Integer visualMin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.visualMax">#series-treemap.data.visualMax</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当前层级的最大 value 值。如果不设置则自动统计。</p>
     * <p>手动指定 <code class="codespan">visualMin</code>、<code class="codespan">visualMax</code> ，即手动控制了 visual mapping 的值域（当 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.colorMappingBy">colorMappingBy</a> 为 <code class="codespan">'value'</code> 时有意义）。</p>
     */
    private Integer visualMax;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.color">#series-treemap.data.color</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>表示同一层级的节点的 颜色 选取列表（选择规则见 <a href="https://echarts.apache.org/zh/option.html#series-treemap.colorMappingBy">colorMappingBy</a>）。默认为空时，选取系统color列表。</p>
     * <p>关于视觉设置，详见 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">color</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private List<?> color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.colorAlpha">#series-treemap.data.colorAlpha</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>表示同一层级的节点的颜色透明度选取范围。</p>
     * <p>数值范围 0 ~ 1</p>
     * <p>例如, <code class="codespan">colorAlpha</code> 可以是 <code class="codespan">[0.3, 1]</code>.</p>
     * <p>关于视觉设置，详见 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">colorAlpha</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private List<?> colorAlpha;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.colorSaturation">#series-treemap.data.colorSaturation</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>表示同一层级的节点的颜色饱和度 选取范围。</p>
     * <p>数值范围 0 ~ 1。</p>
     * <p>例如, <code class="codespan">colorSaturation</code> 可以是 <code class="codespan">[0.3, 1]</code>.</p>
     * <p>关于视觉设置，详见 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">colorSaturation</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Integer colorSaturation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.colorMappingBy">#series-treemap.data.colorMappingBy</a>
     * <br/>默认值: 'index'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>表示同一层级节点，在颜色列表中（参见 <code class="codespan">color</code> 属性）选择时，按照什么来选择。可选值：</p>
     * <ul>
     * <li><code class="codespan">'value'</code>：</li>
     * </ul>
     * <p>将节点的值（即 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.value">series-treemap.data.value</a>）映射到颜色列表中。</p>
     * <p>这样得到的颜色，反应了节点值的大小。</p>
     * <p>可以使用 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.visualDimension">visualDimension</a> 属性来设置，用 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">data</a> 中哪个纬度的值来映射。</p>
     * <ul>
     * <li><code class="codespan">'index'</code>：</li>
     * </ul>
     * <p>将节点的 <code class="codespan">index</code>（序号）映射到颜色列表中。即同一层级中，第一个节点取颜色列表中第一个颜色，第二个节点取第二个。</p>
     * <p>这样得到的颜色，便于区分相邻节点。</p>
     * <ul>
     * <li><code class="codespan">'id'</code>：</li>
     * </ul>
     * <p>将节点的 <code class="codespan">id</code>（即 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.id">series-treemap.data.id</a>）映射到颜色列表中。<code class="codespan">id</code> 是用户指定的，这样能够使得，在treemap 通过 setOption 变化数值时，同一 <code class="codespan">id</code> 映射到同一颜色，保持一致性。参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=treemap-obama&amp;edit=1&amp;reset=1" target="_blank">例子</a>。</p>
     * <p>关于视觉设置，详见 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">colorMappingBy</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private String colorMappingBy;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.visibleMin">#series-treemap.data.visibleMin</a>
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果某个节点的矩形的面积，小于这个数值（单位：px平方），这个节点就不显示。</p>
     * <p>如果不加这个限制，很小的节点会影响显示效果。</p>
     * <p>关于视觉设置，详见 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">visibleMin</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Integer visibleMin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.childrenVisibleMin">#series-treemap.data.childrenVisibleMin</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果某个节点的矩形面积，小于这个数值（单位：px平方），则不显示这个节点的子节点。</p>
     * <p>这能够在矩形面积不足够大时候，隐藏节点的细节。当用户用鼠标缩放节点时，如果面积大于此阈值，又会显示子节点。</p>
     * <p>关于视觉设置，详见 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a>。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">childrenVisibleMin</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Integer childrenVisibleMin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.label">#series-treemap.data.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">label</code> 描述了每个矩形中，文本标签的样式。</p>
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">label</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.upperLabel">#series-treemap.data.upperLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p><code class="codespan">upperLabel</code> 用于显示矩形的父节点的标签。当 <a href="https://echarts.apache.org/zh/option.html#series-treemap.upperLabel.show">upperLabel.show</a> 为 <code class="codespan">true</code> 的时候，『显示父节点标签』功能开启。</p>
     * <p>同 <a href="https://echarts.apache.org/zh/option.html#series-treemap.label">series-treemap.label</a> 一样，<code class="codespan">upperLabel</code> 可以存在于 <a href="https://echarts.apache.org/zh/option.html#series-treemap">series-treemap</a> 的根节点，或者 <a href="https://echarts.apache.org/zh/option.html#series-treemap.level">series-treemap.level</a> 中，或者 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a> 的每个数据项中。</p>
     * <p><a href="https://echarts.apache.org/zh/option.html#series-treemap.label">series-treemap.label</a> 描述的是，当前节点为叶节点时标签的样式；<code class="codespan">upperLabel</code> 描述的是，当前节点为非叶节点（即含有子节点）时标签的样式。（此时标签一般会被显示在节点的最上部）</p>
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
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private UpperLabel upperLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle">#series-treemap.data.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>注：treemap中 <code class="codespan">itemStyle</code> 属性可能在多处地方存在：</p>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap">sereis-treemap</a> 根下，表示本系列全局的统一设置。</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels">series-treemap.levels</a> 的每个数组元素中，表示树每个层级的统一设置。</li>
     * <li>于 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a> 的每个节点中，表示每个节点的特定设置。</li>
     * </ul>
     * </blockquote>
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.emphasis">#series-treemap.data.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态配置。</p>
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.blur">#series-treemap.data.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出状态配置。</p>
     */
    private Blur blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.select">#series-treemap.data.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     * <p>选中状态配置。</p>
     */
    private Select select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.link">#series-treemap.data.link</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>点击此节点可跳转的超链接。须 <a href="https://echarts.apache.org/zh/option.html#series-treemap.nodeClick">series-treemap.nodeClick</a> 值为 <code class="codespan">'link'</code> 时才生效。</p>
     * <p>参见 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.target">series-treemap.data.target</a>。</p>
     */
    private String link;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.target">#series-treemap.data.target</a>
     * <br/>默认值: 'blank'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>意义同 <code class="codespan">html</code> <code class="codespan">&lt;a&gt;</code> 标签中的 <code class="codespan">target</code>，参见 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.link">series-treemap.data.link</a>。可选值为：<code class="codespan">'blank'</code> 或 <code class="codespan">'self'</code>。</p>
     */
    private String target;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.children">#series-treemap.data.children</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>子节点，递归定义，格式同 <a href="https://echarts.apache.org/zh/option.html#series-treemap.data">series-treemap.data</a>。</p>
     */
    private List<?> children;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.tooltip">#series-treemap.data.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>本系列每个数据项中特定的 tooltip 设定。</p>
     */
    private Tooltip tooltip;
}
