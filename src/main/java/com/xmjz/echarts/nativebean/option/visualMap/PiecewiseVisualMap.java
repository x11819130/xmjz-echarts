package com.xmjz.echarts.nativebean.option.visualMap;

import com.xmjz.echarts.nativebean.option.VisualMap;
import com.xmjz.echarts.nativebean.option.visualMap.piecewiseVisualMap.Controller;
import com.xmjz.echarts.nativebean.option.visualMap.piecewiseVisualMap.TextStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise">#visualMap-piecewise</a>
 * <br/>默认值: 无
 * <br/>js类型: ["object"]
 * <br/>描述:
 * <p><strong>分段型视觉映射组件（visualMapPiecewise）</strong></p>
 * <p>（参考<a href="https://echarts.apache.org/zh/option.html#visualMap">视觉映射组件（visualMap）的介绍</a>）</p>
 * <p>分段型视觉映射组件，有三种模式：</p>
 * <ul>
 * <li><strong>连续型数据平均分段</strong>: 依据 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.splitNumber">visualMap-piecewise.splitNumber</a> 来自动平均分割成若干块。</li>
 * <li><strong>连续型数据自定义分段</strong>: 依据 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.pieces">visualMap-piecewise.pieces</a> 来定义每块范围。</li>
 * <li><strong>离散数据根据类别分段</strong>: 类别定义在 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.categories">visualMap-piecewise.categories</a> 中。</li>
 * </ul>
 * <p><br>
 * <br></p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class PiecewiseVisualMap extends VisualMap implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.type">#visualMap-piecewise.type</a>
     * <br/>默认值: piecewise
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>类型为分段型。</p>
     */
    private String type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.id">#visualMap-piecewise.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.splitNumber">#visualMap-piecewise.splitNumber</a>
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>对于连续型数据，自动平均切分成几段。默认为5段。
     * 连续数据的范围需要 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.max">max</a> 和 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.min">min</a> 来指定。</p>
     * <p>如果设置了 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.pieces">visualMap-piecewise.pieces</a> 或者 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.categories">visualMap-piecewise.categories</a>，则 <code class="codespan">splitNumber</code> 无效。</p>
     */
    private Integer splitNumber;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.pieces">#visualMap-piecewise.pieces</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>自定义『分段式视觉映射组件（visualMapPiecewise）』的每一段的范围，以及每一段的文字，以及每一段的特别的样式。例如：</p>
     * <pre><code class="lang-javascript hljs">pieces: [
     *     {<span class="hljs-attr">min</span>: <span class="hljs-number">1500</span>}, <span class="hljs-comment">// 不指定 max，表示 max 为无限大（Infinity）。</span>
     *     {<span class="hljs-attr">min</span>: <span class="hljs-number">900</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">1500</span>},
     *     {<span class="hljs-attr">min</span>: <span class="hljs-number">310</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">1000</span>},
     *     {<span class="hljs-attr">min</span>: <span class="hljs-number">200</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">300</span>},
     *     {<span class="hljs-attr">min</span>: <span class="hljs-number">10</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">200</span>, <span class="hljs-attr">label</span>: <span class="hljs-string">'10 到 200（自定义label）'</span>},
     *     {<span class="hljs-attr">value</span>: <span class="hljs-number">123</span>, <span class="hljs-attr">label</span>: <span class="hljs-string">'123（自定义特殊颜色）'</span>, <span class="hljs-attr">color</span>: <span class="hljs-string">'grey'</span>}, <span class="hljs-comment">// 表示 value 等于 123 的情况。</span>
     *     {<span class="hljs-attr">max</span>: <span class="hljs-number">5</span>}     <span class="hljs-comment">// 不指定 min，表示 min 为无限大（-Infinity）。</span>
     * ]
     * </code></pre>
     * <p>或者，更精确得，可以使用 <code class="codespan">lt</code>（小于，less than），<code class="codespan">gt</code>（大于，greater than），<code class="codespan">lte</code>（小于等于 less than or equals），<code class="codespan">gte</code>（大于等于，greater than or equals）来表达边界：</p>
     * <pre><code class="lang-javascript hljs">pieces: [
     *     {<span class="hljs-attr">gt</span>: <span class="hljs-number">1500</span>},            <span class="hljs-comment">// (1500, Infinity]</span>
     *     {<span class="hljs-attr">gt</span>: <span class="hljs-number">900</span>, <span class="hljs-attr">lte</span>: <span class="hljs-number">1500</span>},  <span class="hljs-comment">// (900, 1500]</span>
     *     {<span class="hljs-attr">gt</span>: <span class="hljs-number">310</span>, <span class="hljs-attr">lte</span>: <span class="hljs-number">1000</span>},  <span class="hljs-comment">// (310, 1000]</span>
     *     {<span class="hljs-attr">gt</span>: <span class="hljs-number">200</span>, <span class="hljs-attr">lte</span>: <span class="hljs-number">300</span>},   <span class="hljs-comment">// (200, 300]</span>
     *     {<span class="hljs-attr">gt</span>: <span class="hljs-number">10</span>, <span class="hljs-attr">lte</span>: <span class="hljs-number">200</span>, <span class="hljs-attr">label</span>: <span class="hljs-string">'10 到 200（自定义label）'</span>},       <span class="hljs-comment">// (10, 200]</span>
     *     {<span class="hljs-attr">value</span>: <span class="hljs-number">123</span>, <span class="hljs-attr">label</span>: <span class="hljs-string">'123（自定义特殊颜色）'</span>, <span class="hljs-attr">color</span>: <span class="hljs-string">'grey'</span>},  <span class="hljs-comment">// [123, 123]</span>
     *     {<span class="hljs-attr">lt</span>: <span class="hljs-number">5</span>}                 <span class="hljs-comment">// (-Infinity, 5)</span>
     * ]
     * </code></pre>
     * <p>注意，如果两个 piece 的区间重叠，则会自动进行去重。</p>
     * <p>在每个 piece 中支持的 visualMap 属性有：</p>
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
     * <p><a href="https://echarts.apache.org/examples/zh/editor.html?c=doc-example/map-visualMap-pieces&amp;edit=1&amp;reset=1" target="_blank">参见示例</a></p>
     * <p>（注：在 ECharts2 中，<code class="codespan">pieces</code> 叫做 <code class="codespan">splitList</code>。现在后者仍兼容，但推荐使用 <code class="codespan">pieces</code>）</p>
     * <p><code class="codespan">pieces</code> 中的顺序，其实试试就知道。若要看详细的规则，参见 <a href="https://echarts.apache.org/zh/option.html#visualMap.inverse">visualMap.inverse</a>。</p>
     */
    private List<?> pieces;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.categories">#visualMap-piecewise.categories</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>用于表示离散型数据（或可以称为类别型数据、枚举型数据）的全集。</p>
     * <p>当所指定的维度（<a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.dimension">visualMap-piecewise.dimension</a>）的数据为离散型数据时，例如数据值为『优』、『良』等，那么可如下配置：</p>
     * <pre><code class="lang-javascript hljs">categories: [<span class="hljs-string">'严重污染'</span>, <span class="hljs-string">'重度污染'</span>, <span class="hljs-string">'中度污染'</span>, <span class="hljs-string">'轻度污染'</span>, <span class="hljs-string">'良'</span>, <span class="hljs-string">'优'</span>],
     * </code></pre>
     * <p><a href="https://echarts.apache.org/examples/zh/editor.html?c=doc-example/scatter-visualMap-categories&amp;edit=1&amp;reset=1" target="_blank">参见示例</a></p>
     * <p><code class="codespan">categories</code> 中的顺序，其实试试就知道。若要看详细的规则，参见 <a href="https://echarts.apache.org/zh/option.html#visualMap.inverse">visualMap.inverse</a>。</p>
     */
    private List<?> categories;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.min">#visualMap-piecewise.min</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指定 visualMapPiecewise 组件的最小值。</p>
     * <p>在 <strong>连续型数据自定义分段</strong> 模式（即 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.pieces">visualMap-piecewise.pieces</a> 被使用）或 <strong>离散数据根据类别分段</strong> 模式（即 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.categories">visualMap-piecewise.categories</a> 被使用）时，<code class="codespan">max</code> 和 <code class="codespan">min</code> 不需指定。</p>
     * <p>在 <strong>连续型数据平均分段</strong> 模式（即 (that is, when <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.splitNumber">visualMap-piecewise.splitNumber</a> 被使用时）需指定 <code class="codespan">min</code>、<code class="codespan">max</code>，如果不指定，则默认为 <code class="codespan">[0, 200]</code>（注意并不是默认为
     * series.data 的 <code class="codespan">dataMin</code> 和 <code class="codespan">dataMax</code>）。</p>
     */
    private Integer min;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.max">#visualMap-piecewise.max</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指定 visualMapPiecewise 组件的最大值。参见 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.splitNumber">visualMap-piecewise.splitNumber</a></p>
     * <p><strong>连续型数据自定义分段</strong> 模式（即 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.pieces">visualMap-piecewise.pieces</a> 被使用）或 <strong>离散数据根据类别分段</strong> 模式（即 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.categories">visualMap-piecewise.categories</a> 被使用），<code class="codespan">max</code> 和 <code class="codespan">min</code> 不需指定。</p>
     * <p><strong>连续型数据平均分段</strong> 模式（即 (that is, when <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.splitNumber">visualMap-piecewise.splitNumber</a> 被使用时）需指定 <code class="codespan">min</code>、<code class="codespan">max</code>，如果不指定，则默认为 <code class="codespan">[0, 200]</code>（注意并不是默认为
     * series.data 的 <code class="codespan">dataMin</code> 和 <code class="codespan">dataMax</code>）。</p>
     */
    private Integer max;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.minOpen">#visualMap-piecewise.minOpen</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>当 <code class="codespan">type</code> 为 <code class="codespan">piecewise</code> 且使用 <code class="codespan">min</code>/<code class="codespan">max</code>/<code class="codespan">splitNumber</code> 时，此参数有效。当值为 <code class="codespan">true</code> 时，界面上会额外多出一个『&lt; min』的选块。</p>
     */
    private Boolean minOpen;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.maxOpen">#visualMap-piecewise.maxOpen</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>当 <code class="codespan">type</code> 为 <code class="codespan">piecewise</code> 且使用 <code class="codespan">min</code>/<code class="codespan">max</code>/<code class="codespan">splitNumber</code> 时，此参数有效。当值为 <code class="codespan">true</code> 时，界面上会额外多出一个『&gt; max』的选块。</p>
     */
    private Boolean maxOpen;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.selectedMode">#visualMap-piecewise.selectedMode</a>
     * <br/>默认值: 'multiple'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>选择模式，可以是：</p>
     * <ul>
     * <li><code class="codespan">'multiple'</code>（多选）。</li>
     * <li><code class="codespan">'single'</code>（单选）。</li>
     * </ul>
     */
    private String selectedMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.inverse">#visualMap-piecewise.inverse</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否反转。</p>
     * <ul>
     * <li><p><strong>连续型数据平均分段</strong> 模式（即 (that is, when <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.splitNumber">visualMap-piecewise.splitNumber</a> 被使用时），数据排布规则，同 <a href="https://echarts.apache.org/zh/option.html#visualMap-continuous.inverse">visualMap-continuous.inverse</a>。</p>
     * </li>
     * <li><p><strong>连续型数据自定义分段</strong> 模式（即 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.pieces">visualMap-piecewise.pieces</a> 被使用）或 <strong>离散数据根据类别分段</strong> 模式（即 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.categories">visualMap-piecewise.categories</a> 被使用），每个块的排布位置，取决于 <code class="codespan">pieces</code> 或 <code class="codespan">categories</code> 列表的定义顺序，即：</p>
     * <ul>
     * <li><p>当<code class="codespan">inverse</code>为<code class="codespan">false</code>时：</p>
     * <ul>
     * <li><p>当 <a href="https://echarts.apache.org/zh/option.html#visualMap.orient">visualMap.orient</a> 为 <code class="codespan">'vertical'</code> 时，<code class="codespan">pieces[0]</code> 或 <code class="codespan">categories[0]</code>对应『上方』</p>
     * </li>
     * <li><p>当 <a href="https://echarts.apache.org/zh/option.html#visualMap.orient">visualMap.orient</a> 为 <code class="codespan">'horizontal'</code> 时，<code class="codespan">pieces[0]</code> 或 <code class="codespan">categories[0]</code> 对应『左方』。</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>当 <code class="codespan">inverse</code> 为 <code class="codespan">true</code> 时，与上面相反。</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>其实没有那么复杂，使用时候，试试就知道了。</p>
     */
    private Boolean inverse;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.precision">#visualMap-piecewise.precision</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>数据展示的小数精度。</p>
     * <ul>
     * <li><p><strong>连续型数据平均分段</strong> 模式（即 (that is, when <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.splitNumber">visualMap-piecewise.splitNumber</a> 被使用时），精度根据数据自动适应。</p>
     * </li>
     * <li><p><strong>连续型数据自定义分段</strong> 模式（即 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.pieces">visualMap-piecewise.pieces</a> 被使用）或 <strong>离散数据根据类别分段</strong> 模式（即 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.categories">visualMap-piecewise.categories</a> 被使用），精度默认为0（没有小数）。</p>
     * </li>
     * </ul>
     */
    private Integer precision;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.itemWidth">#visualMap-piecewise.itemWidth</a>
     * <br/>默认值: 20
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形的宽度，即每个小块的宽度。</p>
     */
    private Integer itemWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.itemHeight">#visualMap-piecewise.itemHeight</a>
     * <br/>默认值: 14
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形的高度，即每个小块的高度。</p>
     */
    private Integer itemHeight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.align">#visualMap-piecewise.align</a>
     * <br/>默认值: 'auto'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>指定组件中图形（比如小方块）和文字的摆放关系，可选值为：</p>
     * <ul>
     * <li><code class="codespan">'auto'</code> 自动决定。</li>
     * <li><code class="codespan">'left'</code> 图形在左文字在右。</li>
     * <li><code class="codespan">'right'</code> 图形在右文字在左。</li>
     * </ul>
     */
    private String align;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.text">#visualMap-piecewise.text</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>两端的文本，如['High', 'Low']。<a href="https://echarts.apache.org/examples/zh/editor.html?c=doc-example/map-visualMap-piecewise-text&amp;edit=1&amp;reset=1" target="_blank">参见例子</a>。</p>
     * <p><code class="codespan">text</code> 中的顺序，其实试试就知道。若要看详细的规则，参见 <a href="https://echarts.apache.org/zh/option.html#visualMap.inverse">visualMap.inverse</a>。</p>
     * <p>兼容 ECharts2，当有 <code class="codespan">text</code> 时，label不显示。</p>
     */
    private List<?> text;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.textGap">#visualMap-piecewise.textGap</a>
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>两端文字主体之间的距离，单位为px。参见 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.text">visualMap-piecewise.text</a></p>
     */
    private Integer textGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.showLabel">#visualMap-piecewise.showLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示每项的文本标签。默认情况是，如果 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.text">visualMap-piecewise.text</a> 被使用则不显示文本标签，否则显示。</p>
     */
    private Boolean showLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.itemGap">#visualMap-piecewise.itemGap</a>
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>每两个图元之间的间隔距离，单位为px。</p>
     */
    private Integer itemGap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.itemSymbol">#visualMap-piecewise.itemSymbol</a>
     * <br/>默认值: 'roundRect'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>默认的图形。可选值为：</p>
     * <p><code class="codespan">'circle'</code>, <code class="codespan">'rect'</code>, <code class="codespan">'roundRect'</code>, <code class="codespan">'triangle'</code>, <code class="codespan">'diamond'</code>, <code class="codespan">'pin'</code>, <code class="codespan">'arrow'</code>, <code class="codespan">'none'</code></p>
     * <p>。</p>
     * <p>symbol的设置参见 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.inRange">visualMap-piecewise.inRange</a> 和 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.outOfRange">visualMap-piecewise.outOfRange</a>。</p>
     * <p>当他们没有进行指定时，取此 <code class="codespan">itemSymbol</code> 为默认值（但是只在 visualMap 组件上使用，不在 chart 中使用）。</p>
     */
    private String itemSymbol;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.show">#visualMap-piecewise.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示 visualMap-piecewise 组件。如果设置为 <code class="codespan">false</code>，不会显示，但是数据映射的功能还存在。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.dimension">#visualMap-piecewise.dimension</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指定用数据的『哪个维度』，映射到视觉元素上。『数据』即 <a href="https://echarts.apache.org/zh/option.html#series.data">series.data</a>。
     * 可以把 <a href="https://echarts.apache.org/zh/option.html#series.data">series.data</a> 理解成一个二维数组，例如：</p>
     * <pre><code class="lang-javascript hljs">[
     *     [<span class="hljs-number">12</span>, <span class="hljs-number">23</span>, <span class="hljs-number">43</span>],
     *     [<span class="hljs-number">12</span>, <span class="hljs-number">23</span>, <span class="hljs-number">43</span>],
     *     [<span class="hljs-number">43</span>, <span class="hljs-number">545</span>, <span class="hljs-number">65</span>],
     *     [<span class="hljs-number">92</span>, <span class="hljs-number">23</span>, <span class="hljs-number">33</span>]
     * ]
     * </code></pre>
     * <p>其中每个列是一个维度，即 <code class="codespan">dimension</code>。
     * 例如 <code class="codespan">dimension</code> 为 1 时，取第二列（即 23，23，545，23），映射到视觉元素上。</p>
     * <p>默认取 <code class="codespan">data</code> 中最后一个维度。</p>
     */
    private Integer dimension;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.seriesIndex">#visualMap-piecewise.seriesIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>指定取哪个系列的数据，即哪个系列的 <a href="https://echarts.apache.org/zh/option.html#series.data">series.data</a>。</p>
     * <p>默认取所有系列。</p>
     */
    private Object seriesIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.hoverLink">#visualMap-piecewise.hoverLink</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>打开 <code class="codespan">hoverLink</code> 功能时，鼠标悬浮到 <code class="codespan">visualMap</code> 组件上时，鼠标位置对应的数值 在 图表中对应的图形元素，会高亮。</p>
     * <p>反之，鼠标悬浮到图表中的图形元素上时，在 <code class="codespan">visualMap</code> 组件的相应位置会有三角提示其所对应的数值。</p>
     */
    private Boolean hoverLink;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.inRange">#visualMap-piecewise.inRange</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>定义 <strong>在选中范围中</strong> 的视觉元素。（用户可以和 visualMap 组件交互，用鼠标或触摸选择范围）</p>
     * <p>可选的视觉元素有：</p>
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
     * <p><code class="codespan">inRange</code> 能定义目标系列（参见 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.seriesIndex">visualMap-piecewise.seriesIndex</a>）视觉形式，也同时定义了 <code class="codespan">visualMap-piecewise</code> 本身的视觉样式。通俗来讲就是，假如 <code class="codespan">visualMap-piecewise</code>控制的是散点图，那么 <code class="codespan">inRange</code> 同时定义了散点图的 <code class="codespan">颜色</code>、<code class="codespan">尺寸</code> 等，也定义了 <code class="codespan">visualMap-piecewise</code> 本身的 <code class="codespan">颜色</code>、<code class="codespan">尺寸</code> 等。这二者能对应上。</p>
     * <p>定义方式，例如：</p>
     * <pre><code class="lang-javascript hljs">visualMap: [
     *     {
     *         ...,
     *         <span class="hljs-attr">inRange</span>: {
     *             <span class="hljs-attr">color</span>: [<span class="hljs-string">'#121122'</span>, <span class="hljs-string">'rgba(3,4,5,0.4)'</span>, <span class="hljs-string">'red'</span>],
     *             <span class="hljs-attr">symbolSize</span>: [<span class="hljs-number">30</span>, <span class="hljs-number">100</span>]
     *         }
     *     }
     * ]
     * </code></pre>
     * <p>如果想分别定义 <code class="codespan">visualMap-piecewise</code> 本身的视觉样式和 <code class="codespan">目标系列</code> 的视觉样式，则这样定义：</p>
     * <pre><code class="lang-javascript hljs">visualMap: [
     *     {
     *         ...,
     *         <span class="hljs-comment">// 表示 目标系列 的视觉样式。</span>
     *         <span class="hljs-attr">target</span>: {
     *             <span class="hljs-attr">inRange</span>: {
     *                 <span class="hljs-attr">color</span>: [<span class="hljs-string">'#121122'</span>, <span class="hljs-string">'rgba(3,4,5,0.4)'</span>, <span class="hljs-string">'red'</span>],
     *                 <span class="hljs-attr">symbolSize</span>: [<span class="hljs-number">60</span>, <span class="hljs-number">200</span>]
     *             }
     *         },
     *         <span class="hljs-comment">// 表示 visualMap-piecewise 本身的视觉样式。</span>
     *         <span class="hljs-attr">controller</span>: {
     *             <span class="hljs-attr">inRange</span>: {
     *                 <span class="hljs-attr">symbolSize</span>: [<span class="hljs-number">30</span>, <span class="hljs-number">100</span>]
     *             }
     *         }
     *     }
     * ]
     * </code></pre>
     * <p>或者这样定义：</p>
     * <pre><code class="lang-javascript hljs">visualMap: [
     *     {
     *         ...,
     *         <span class="hljs-comment">// 表示 目标系列 的视觉样式 和 visualMap-piecewise 共有的视觉样式。</span>
     *         <span class="hljs-attr">inRange</span>: {
     *             <span class="hljs-attr">color</span>: [<span class="hljs-string">'#121122'</span>, <span class="hljs-string">'rgba(3,4,5,0.4)'</span>, <span class="hljs-string">'red'</span>],
     *             <span class="hljs-attr">symbolSize</span>: [<span class="hljs-number">60</span>, <span class="hljs-number">200</span>]
     *         },
     *         <span class="hljs-comment">// 表示 visualMap-piecewise 本身的视觉样式，会覆盖共有的视觉样式。比如，symbolSize 覆盖成为 [30, 100]，而 color 不变。</span>
     *         <span class="hljs-attr">controller</span>: {
     *             <span class="hljs-attr">inRange</span>: {
     *                 <span class="hljs-attr">symbolSize</span>: [<span class="hljs-number">30</span>, <span class="hljs-number">100</span>]
     *             }
     *         }
     *     }
     * ]
     * </code></pre>
     * <p><strong>✦ 关于视觉通道 ✦</strong></p>
     * <ul>
     * <li><p>inRange 中，可以有任意几个的『视觉通道』定义（如 <code class="codespan">color</code>、<code class="codespan">symbolSize</code> 等）。这些视觉通道，会被同时采用。</p>
     * </li>
     * <li><p>一般来说，建议使用 <code class="codespan">透明度（opacity）</code> ，而非 <code class="codespan">颜色透明度（colorAlpha）</code> （他们细微的差异在于，前者能也同时控制图元中的附属物（如 label）的透明度，而后者只能控制图元本身颜色的透明度）。</p>
     * </li>
     * <li><p>视觉映射的方式：支持两种方式：线性映射、查表映射。</p>
     * </li>
     * </ul>
     * <p><strong>✦ 视觉通道 -- 线性映射 ✦</strong></p>
     * <p><code class="codespan">线性映射</code> 表示 series.data 中的每一个值（dataValue）会经过线性映射计算，从 <code class="codespan">[visualMap.min, visualMap.max]</code> 映射到设定的 <code class="codespan">[visual value 1, visual value 2]</code> 区间中的某一个视觉的值（下称 visual value）。</p>
     * <p>例如，我们设置了 <code class="codespan">[visualMap.min, visualMap.max] 为 [0, 100]</code>，并且我们有 <code class="codespan">series.data: [50, 10, 100]</code>。我们想将其映射到范围为 <code class="codespan">[0.4, 1]</code> 的 <code class="codespan">opacity</code> 上，从而达到用透明度表达数值大小的目的。那么 visualMap 组件会对 series.data 中的每一个 dataValue 做线性映射计算，得到一个 opacityValue。最终得到的 opacityValues 为 <code class="codespan">[0.7, 0.44, 1]</code>。</p>
     * <p>visual 范围也可以反向，例如上例，可以设定 <code class="codespan">opacity</code> 范围为 <code class="codespan">[1, 0.4]</code>，则上例得到的 opacityValues 为 <code class="codespan">[0.7, 0.96, 0.4]</code>。</p>
     * <p>注意，[visualMap.min, visualMap.max] 须手动设置，不设置则默认取 [0, 100]，而非 series.data 中的 <code class="codespan">dataMin</code> 和 <code class="codespan">dataMax</code>。</p>
     * <p>如何设定为线性映射？以下情况时，会设定为 <code class="codespan">线性映射</code>：</p>
     * <ul>
     * <li><p>当 <code class="codespan">visualMap</code> 为 <a href="https://echarts.apache.org/zh/option.html#visualMap-continuous">visualMap-continuous</a> 时，或者</p>
     * </li>
     * <li><p>当 <code class="codespan">visualMap</code> 为 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise">visualMap-piecewise</a> 且 未设置 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.categories">visualMap-piecewise.categories</a> 时。</p>
     * </li>
     * </ul>
     * <p>视觉通道的值（visual value）：</p>
     * <ul>
     * <li><p>视觉通道的值一般都以 <code class="codespan">Array</code> 形式表示，例如：<code class="codespan">color: ['#333', '#777']</code>。</p>
     * </li>
     * <li><p>如果写成 <code class="codespan">number</code> 或 <code class="codespan">string</code>，会转成 <code class="codespan">Array</code>。例如，写成 <code class="codespan">opacity: 0.4</code> 会转成 <code class="codespan">opacity: [0.4, 0.4]</code>，<code class="codespan">color: '#333'</code> 会转成 <code class="codespan">color: ['#333', '#333']</code>。</p>
     * </li>
     * <li><p>对于 <code class="codespan">图形大小（symbolSize）</code>、<code class="codespan">透明度（opacity）</code>、<code class="codespan">颜色透明度（colorAlpha）</code>、<code class="codespan">颜色明暗度（colorLightness）</code>、<code class="codespan">颜色饱和度（colorSaturation）</code>、<code class="codespan">色调（colorHue）</code>：形如<code class="codespan">Array</code> 的视觉范围总是表示：<code class="codespan">[最小数据值对应的视觉值, 最大数据值对应的视觉值]</code>。比如：<code class="codespan">colorLightness: [0.8, 0.2]</code>，表示 series.data 中，和 <code class="codespan">visualMap.min</code> 相等的值（如果有的话）映射到 <code class="codespan">颜色明暗</code> 的 <code class="codespan">0.8</code>，和 <code class="codespan">visualMap.max</code> 相等的值（如果有的话）映射到 <code class="codespan">颜色明暗</code> 的 <code class="codespan">0.2</code>，中间其他数据值，按照线性计算出映射结果。</p>
     * </li>
     * <li><p>对于 <code class="codespan">颜色（color）</code>，使用数组表示例如：<code class="codespan">['#333', '#78ab23', 'blue']</code>。意思就是以这三个点作为基准，形成一种『渐变』的色带，数据映射到这个色带上。也就是说，与 <code class="codespan">visualMap.min</code> 相等的值会映射到 <code class="codespan">'#333'</code>，与 <code class="codespan">visualMap.max</code> 相等的值会映射到 <code class="codespan">'blue'</code>。对于 <code class="codespan">visualMap.min</code> 和 <code class="codespan">visualMap.max</code> 中间的其他点，以所给定的 <code class="codespan">'#333'</code>, <code class="codespan">'#78ab23'</code>, <code class="codespan">'blue'</code> 这三个颜色作为基准点进行分段线性插值，得到映射结果。</p>
     * </li>
     * <li><p>对于 <code class="codespan">图形类别（symbol）</code>：使用数据表示例如：<code class="codespan">['circle', 'rect', 'diamond']</code>。与 <code class="codespan">visualMap.min</code> 相等的值会映射到 <code class="codespan">'circle'</code>，与 <code class="codespan">visualMap.max</code> 相等的值会映射到 <code class="codespan">'diamond'</code>。对于 中间的其他点，会根据他们和 <code class="codespan">visualMap.min</code> 和 <code class="codespan">visualMap.max</code> 的数值距离，映射到 <code class="codespan">'circle'</code>, <code class="codespan">'rect'</code>, <code class="codespan">'diamond'</code> 中某个值上。</p>
     * </li>
     * </ul>
     * <p>visual value 的取值范围：</p>
     * <ul>
     * <li><p><code class="codespan">透明度（opacity）</code>、<code class="codespan">颜色透明度（colorAlpha）</code>、<code class="codespan">颜色明暗度（colorLightness）</code>、<code class="codespan">颜色饱和度（colorSaturation）</code>、<code class="codespan">visual value</code></p>
     * <p>  取值范围是 <code class="codespan">[0, 1]</code>。</p>
     * </li>
     * <li><p><code class="codespan">色调（colorHue）</code>：</p>
     * <p>  取值范围是 <code class="codespan">[0, 360]</code>。</p>
     * </li>
     * <li><p><code class="codespan">颜色（color）</code>：</p>
     * <p>  颜色可以使用 RGB 表示，比如 <code class="codespan">'rgb(128, 128, 128)'</code>，如果想要加上 alpha 通道，可以使用 RGBA，比如 <code class="codespan">'rgba(128, 128, 128, 0.5)'</code>，也可以使用十六进制格式，比如 '#ccc'。</p>
     * </li>
     * <li><p><code class="codespan">图形类别（symbol）</code>：</p>
     * </li>
     * </ul>
     * <p>ECharts 提供的标记类型包括</p>
     * <p><code class="codespan">'circle'</code>, <code class="codespan">'rect'</code>, <code class="codespan">'roundRect'</code>, <code class="codespan">'triangle'</code>, <code class="codespan">'diamond'</code>, <code class="codespan">'pin'</code>, <code class="codespan">'arrow'</code>, <code class="codespan">'none'</code></p>
     * <p>可以通过 <code class="codespan">'image://url'</code> 设置为图片，其中 URL 为图片的链接，或者 <code class="codespan">dataURI</code>。</p>
     * <p>URL 为图片链接例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://http://xxx.xxx.xxx/a/b.png'</span>
     * </code></pre><p>URL 为 <code class="codespan">dataURI</code> 例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'image://data:image/gif;base64,R0lGODlhEAAQAMQAAORHHOVSKudfOulrSOp3WOyDZu6QdvCchPGolfO0o/XBs/fNwfjZ0frl3/zy7////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAkAABAALAAAAAAQABAAAAVVICSOZGlCQAosJ6mu7fiyZeKqNKToQGDsM8hBADgUXoGAiqhSvp5QAnQKGIgUhwFUYLCVDFCrKUE1lBavAViFIDlTImbKC5Gm2hB0SlBCBMQiB0UjIQA7'</span>
     * </code></pre><p>可以通过 <code class="codespan">'path://'</code> 将图标设置为任意的矢量路径。这种方式相比于使用图片的方式，不用担心因为缩放而产生锯齿或模糊，而且可以设置为任意颜色。路径图形会自适应调整为合适的大小。路径的格式参见 <a href="http://www.w3.org/TR/SVG/paths.html#PathData" target="_blank">SVG PathData</a>。可以从 Adobe Illustrator 等工具编辑导出。</p>
     * <p>例如：</p>
     * <pre><code class="hljs javascript"><span class="hljs-string">'path://M30.9,53.2C16.8,53.2,5.3,41.7,5.3,27.6S16.8,2,30.9,2C45,2,56.4,13.5,56.4,27.6S45,53.2,30.9,53.2z M30.9,3.5C17.6,3.5,6.8,14.4,6.8,27.6c0,13.3,10.8,24.1,24.101,24.1C44.2,51.7,55,40.9,55,27.6C54.9,14.4,44.1,3.5,30.9,3.5z M36.9,35.8c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H36c0.5,0,0.9,0.4,0.9,1V35.8z M27.8,35.8 c0,0.601-0.4,1-0.9,1h-1.3c-0.5,0-0.9-0.399-0.9-1V19.5c0-0.6,0.4-1,0.9-1H27c0.5,0,0.9,0.4,0.9,1L27.8,35.8L27.8,35.8z'</span>
     * </code></pre><p><strong>✦ 视觉通道 -- 查表映射 ✦</strong></p>
     * <p><code class="codespan">查表映射</code> 表示 series.data 中的所有值（dataValue）是可枚举的，会根据给定的映射表查表得到映射结果。</p>
     * <p>例如，在 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise">visualMap-piecewise</a> 中，我们设定了 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.categories">visualMap-piecewise.categories</a> 为 <code class="codespan">['Demon Hunter', 'Blademaster', 'Death Knight', 'Warden', 'Paladin']</code>。我们有 series.data: <code class="codespan">['Demon Hunter', 'Death Knight', 'Warden', 'Paladin']</code>。然后我们可以定立查表映射规则：<code class="codespan">color: {'Warden': 'red', 'Demon Hunter': 'black'}</code>，于是 <code class="codespan">visualMap</code> 组件会按照表来将 <code class="codespan">dataValue</code> 映射到 <code class="codespan">color</code>。</p>
     * <p>如何设定为查表映射？当 <code class="codespan">visualMap</code> 为 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise">visualMap-piecewise</a> 且 设置了 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.categories">visualMap-piecewise.categories</a> 时，会进行查表映射。</p>
     * <p>视觉通道的值（visual value）：一般使用 <code class="codespan">Object</code> 或 <code class="codespan">Array</code> 来表示，例如：</p>
     * <pre><code class="lang-javascript hljs">visualMap: {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'piecewise'</span>,
     *     <span class="hljs-comment">// categories 定义了 visualMap-piecewise 组件显示出来的项。</span>
     *     <span class="hljs-attr">categories</span>: [
     *         <span class="hljs-string">'Demon Hunter'</span>, <span class="hljs-string">'Blademaster'</span>, <span class="hljs-string">'Death Knight'</span>, <span class="hljs-string">'Warden'</span>, <span class="hljs-string">'Paladin'</span>
     *     ],
     *     <span class="hljs-attr">inRange</span>: {
     *         <span class="hljs-comment">// visual value 可以配成 Object：</span>
     *         <span class="hljs-attr">color</span>: {
     *             <span class="hljs-string">'Warden'</span>: <span class="hljs-string">'red'</span>,
     *             <span class="hljs-string">'Demon Hunter'</span>: <span class="hljs-string">'black'</span>,
     *             <span class="hljs-string">''</span>: <span class="hljs-string">'green'</span> <span class="hljs-comment">// 空字串，表示除了'Warden'、'Demon Hunter'外，都对应到 'green'。</span>
     *         }
     *         <span class="hljs-comment">// visual value 也可以只配一个单值，表示所有都映射到一个值，如：</span>
     *         <span class="hljs-attr">color</span>: <span class="hljs-string">'green'</span>,
     *         <span class="hljs-comment">// visual value 也可以配成数组，这个数组须和 categories 数组等长，</span>
     *         <span class="hljs-comment">// 每个数组项和 categories 数组项一一对应：</span>
     *         <span class="hljs-attr">color</span>: [<span class="hljs-string">'red'</span>, <span class="hljs-string">'black'</span>, <span class="hljs-string">'green'</span>, <span class="hljs-string">'yellow'</span>, <span class="hljs-string">'white'</span>]
     *     }
     * }
     * </code></pre>
     * <p><a href="https://echarts.apache.org/examples/zh/editor.html?c=doc-example/scatter-visualMap-categories&amp;edit=1&amp;reset=1" target="_blank">参见示例</a></p>
     * <p><strong>✦ 修改视觉编码 ✦</strong></p>
     * <p>如果在图表被渲染后（即已经使用 <code class="codespan">setOption</code> 设置了初始 <code class="codespan">option</code> 之后），想修改 visualMap 的各种 <code class="codespan">视觉编码</code>，按照惯例，再次使用 <code class="codespan">setOption</code> 即可。例如：</p>
     * <pre><code class="lang-javascript hljs">chart.setOption({
     *     <span class="hljs-attr">visualMap</span>: {
     *         <span class="hljs-attr">inRange</span>: {<span class="hljs-attr">color</span>: [<span class="hljs-string">'red'</span>, <span class="hljs-string">'blue'</span>]}
     *     }
     * });
     * </code></pre>
     * <p>但请注意：</p>
     * <ul>
     * <li><p>visualMap option 中的这几个属性，<code class="codespan">inRange</code>, <code class="codespan">outOfRange</code>, <code class="codespan">target</code>, <code class="codespan">controller</code>，在 setOption 时不支持 merge。否则会带来过于复杂的 merge 逻辑。也就是说，<code class="codespan">setOption</code> 时，一旦修改了以上几个属性中的一项，其他项也会被清空，而非保留当前状态。所以，设置 visual 值时，请一次性全部设置，而非只设置一部分。</p>
     * </li>
     * <li><p><strong>不推荐使用 <code class="codespan">getOption -&gt; 修改option -&gt; setOption</code> 的方式：</strong></p>
     * </li>
     * </ul>
     * <pre><code class="lang-javascript hljs"><span class="hljs-comment">// 不推荐这样做（尽管也能达到和上面的例子相同的结果）：</span>
     * <span class="hljs-keyword">var</span> option = chart.getOption(); <span class="hljs-comment">// 获取所有option。</span>
     * option.visualMap.inRange.color = [<span class="hljs-string">'red'</span>, <span class="hljs-string">'blue'</span>]; <span class="hljs-comment">// 改动color（我想要改变 color）。</span>
     *
     * <span class="hljs-comment">// 如下两处也要进行同步改动，否则可能达不到期望效果。</span>
     * option.visualMap.target.inRange.color = [<span class="hljs-string">'red'</span>, <span class="hljs-string">'blue'</span>];
     * option.visualMap.controller.inRange.color = [<span class="hljs-string">'red'</span>, <span class="hljs-string">'blue'</span>];
     *
     * chart.setOption(option); <span class="hljs-comment">// option设置回 visualMap</span>
     * </code></pre>
     * <p><strong>注意</strong>，inRange 没有指定，则会默认会设置 color: <code class="codespan">['#f6efa6', '#d88273', '#bf444c']</code>，如果你不想要这个color，可以
     * <code class="codespan">inRange: {color: null}</code> 来去除。</p>
     */
    private Object inRange;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.outOfRange">#visualMap-piecewise.outOfRange</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>定义 <strong>在选中范围外</strong> 的视觉元素。（用户可以和 visualMap 组件交互，用鼠标或触摸选择范围）</p>
     * <p>配置参考 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.inRange">visualMap-piecewise.inRange</a></p>
     */
    private Object outOfRange;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.controller">#visualMap-piecewise.controller</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>visualMap 组件中，<code class="codespan">控制器</code> 的 <code class="codespan">inRange</code> <code class="codespan">outOfRange</code> 设置。如果没有这个 <code class="codespan">controller</code> 设置，<code class="codespan">控制器</code> 会使用外层的 <code class="codespan">inRange</code> <code class="codespan">outOfRange</code> 设置；如果有这个 <code class="codespan">controller</code> 设置，则会采用这个设置。适用于一些控制器视觉效果需要特殊定制或调整的场景。</p>
     */
    private Controller controller;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.zlevel">#visualMap-piecewise.zlevel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>所有图形的 zlevel 值。</p>
     * <p><code class="codespan">zlevel</code>用于 Canvas 分层，不同<code class="codespan">zlevel</code>值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的<code class="codespan">zlevel</code>。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。</p>
     * <p><code class="codespan">zlevel</code> 大的 Canvas 会放在 <code class="codespan">zlevel</code> 小的 Canvas 的上面。</p>
     */
    private Integer zlevel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.z">#visualMap-piecewise.z</a>
     * <br/>默认值: 4
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>组件的所有图形的<code class="codespan">z</code>值。控制图形的前后顺序。<code class="codespan">z</code>值小的图形会被<code class="codespan">z</code>值大的图形覆盖。</p>
     * <p><code class="codespan">z</code>相比<code class="codespan">zlevel</code>优先级更低，而且不会创建新的 Canvas。</p>
     */
    private Integer z;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.left">#visualMap-piecewise.left</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>visualMap 组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.top">#visualMap-piecewise.top</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>visualMap 组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.right">#visualMap-piecewise.right</a>
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>visualMap 组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.bottom">#visualMap-piecewise.bottom</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>visualMap 组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.orient">#visualMap-piecewise.orient</a>
     * <br/>默认值: 'vertical'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>如何放置 visualMap 组件，水平（<code class="codespan">'horizontal'</code>）或者竖直（<code class="codespan">'vertical'</code>）。</p>
     */
    private String orient;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.padding">#visualMap-piecewise.padding</a>
     * <br/>默认值: 5
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>visualMap-piecewise内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距。</p>
     * <p>使用示例：</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-comment">// 设置内边距为 5</span>
     * padding: <span class="hljs-number">5</span>
     * <span class="hljs-comment">// 设置上下的内边距为 5，左右的内边距为 10</span>
     * padding: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>]
     * <span class="hljs-comment">// 分别设置四个方向的内边距</span>
     * padding: [
     *     <span class="hljs-number">5</span>,  <span class="hljs-comment">// 上</span>
     *     <span class="hljs-number">10</span>, <span class="hljs-comment">// 右</span>
     *     <span class="hljs-number">5</span>,  <span class="hljs-comment">// 下</span>
     *     <span class="hljs-number">10</span>, <span class="hljs-comment">// 左</span>
     * ]
     * </code></pre>
     */
    private Object padding;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.backgroundColor">#visualMap-piecewise.backgroundColor</a>
     * <br/>默认值: 'rgba(0,0,0,0)'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>背景色。</p>
     */
    private String backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.borderColor">#visualMap-piecewise.borderColor</a>
     * <br/>默认值: '#ccc'
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.borderWidth">#visualMap-piecewise.borderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>边框线宽，单位px。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.color">#visualMap-piecewise.color</a>
     * <br/>默认值: ['#bf444c', '#d88273', '#f6efa6']
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>这个配置项，是为了兼容 ECharts2 而存在，ECharts3 中已经不推荐使用。它的功能已经移到了 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.inRange">visualMap-piecewise.inRange</a> 和 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.outOfRange">visualMap-piecewise.outOfRange</a> 中。</p>
     * <p>如果要使用，则须注意，<code class="codespan">color</code>属性中的顺序是由数值 <code class="codespan">大</code> 到 <code class="codespan">小</code>，但是 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.inRange">visualMap-piecewise.inRange</a> 或 <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.outOfRange">visualMap-piecewise.outOfRange</a> 中 <code class="codespan">color</code> 的顺序，总是由数值 <code class="codespan">小</code> 到 <code class="codespan">大</code>。二者不一致。</p>
     */
    private List<?> color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.textStyle">#visualMap-piecewise.textStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private TextStyle textStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-piecewise.formatter">#visualMap-piecewise.formatter</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>标签的格式化工具。</p>
     * <ul>
     * <li>如果为<code class="codespan">string</code>，表示模板，例如：<code class="codespan">aaaa{value}bbbb{value2}</code>。其中 <code class="codespan">{value}</code> 和 <code class="codespan">{value2}</code> 是当前的范围边界值。</li>
     * <li>如果为 <code class="codespan">Function</code>，表示回调函数，形如：</li>
     * </ul>
     * <pre><code class="lang-javascript hljs">formatter: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value, value2</span>) </span>{
     *     <span class="hljs-keyword">return</span> <span class="hljs-string">'aaaa'</span> + value + <span class="hljs-string">'bbbb'</span> + value2; <span class="hljs-comment">// 范围标签显示内容。</span>
     * }
     * </code></pre>
     */
    private Object formatter;
}
