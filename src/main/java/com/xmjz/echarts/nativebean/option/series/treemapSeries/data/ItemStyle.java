package com.xmjz.echarts.nativebean.option.series.treemapSeries.data;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.treemapSeries.data.itemStyle.Decal;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class ItemStyle extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.color">#series-treemap.data.itemStyle.color</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>矩形的颜色。默认从全局调色盘 <a href="https://echarts.apache.org/zh/option.html#color">option.color</a> 获取颜色。</p>
     */
    private String color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.colorAlpha">#series-treemap.data.itemStyle.colorAlpha</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>矩形颜色的透明度。取值范围是 0 ~ 1 之间的浮点数。</p>
     */
    private Integer colorAlpha;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.colorSaturation">#series-treemap.data.itemStyle.colorSaturation</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>矩形颜色的饱和度。取值范围是 0 ~ 1 之间的浮点数。</p>
     */
    private Integer colorSaturation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.borderRadius">#series-treemap.data.itemStyle.borderRadius</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>矩形圆角。</p>
     */
    private Object borderRadius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.borderWidth">#series-treemap.data.itemStyle.borderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>矩形边框线宽。为 0 时无边框。而矩形的内部子矩形（子节点）的间隔距离是由 <a href="https://echarts.apache.org/zh/option.html#series-treemap.levels.gapWidth">gapWidth</a> 指定的。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.gapWidth">#series-treemap.data.itemStyle.gapWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>矩形内部子矩形（子节点）的间隔距离。</p>
     * <p><img width="700" height="auto" src="documents/asset/img/treemap-border-gap.png"></p>
     */
    private Integer gapWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.borderColor">#series-treemap.data.itemStyle.borderColor</a>
     * <br/>默认值: '#fff',
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>矩形边框 和 矩形间隔（gap）的颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.borderColorSaturation">#series-treemap.data.itemStyle.borderColorSaturation</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>矩形边框的颜色的饱和度。取值范围是 0 ~ 1 之间的浮点数。</p>
     * <p>注意：</p>
     * <p>如果设置此属性，则 <code class="codespan">borderColor</code> 的设置无效，而是：取当前节点计算出的颜色（比如从父节点遗传而来），在此颜色值上设置 <code class="codespan">borderColorSaturation</code> 得到最终颜色。这种方式，能够做出『不同区块有不同色调的矩形间隔线』的效果，能够便于区分层级。</p>
     * <p><strong>矩形边框（border）/缝隙（gap）设置如何避免混淆</strong></p>
     * <p>如果统一用一种颜色设置矩形的缝隙（gap），那么当不同层级的矩形同时展示时可能会出现混淆。</p>
     * <p>参见 <a href="https://echarts.apache.org/examples/zh/editor.html?c=doc-example/treemap-borderColor&amp;edit=1&amp;reset=1" target="_blank">例子</a>，注意其中红色的区块中的子矩形其实是更深层级，和其他用白色缝隙区分的矩形不是在一个层级。所以，红色区块中矩形的分割线的颜色，我们在 <code class="codespan">borderColorSaturation</code> 中设置为『加了饱和度变化的红颜色』，以示区别。</p>
     */
    private String borderColorSaturation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.shadowBlur">#series-treemap.data.itemStyle.shadowBlur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形阴影的模糊大小。该属性配合 <code class="codespan">shadowColor</code>,<code class="codespan">shadowOffsetX</code>, <code class="codespan">shadowOffsetY</code> 一起设置图形的阴影效果。</p>
     * <p>示例：</p>
     * <pre><code class="lang-ts hljs typescript">{
     *     shadowColor: <span class="hljs-string">'rgba(0, 0, 0, 0.5)'</span>,
     *     shadowBlur: <span class="hljs-number">10</span>
     * }
     * </code></pre>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.shadowColor">#series-treemap.data.itemStyle.shadowColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>阴影颜色。支持的格式同<code class="codespan">color</code>。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.shadowOffsetX">#series-treemap.data.itemStyle.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影水平方向上的偏移距离。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.shadowOffsetY">#series-treemap.data.itemStyle.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>阴影垂直方向上的偏移距离。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.opacity">#series-treemap.data.itemStyle.opacity</a>
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。</p>
     */
    private Integer opacity;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.itemStyle.decal">#series-treemap.data.itemStyle.decal</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形的贴花图案，在 <a href="https://echarts.apache.org/zh/option.html#aria.enabled">aria.enabled</a> 与 <a href="https://echarts.apache.org/zh/option.html#aria.decal.show">aria.decal.show</a> 都是 <code class="codespan">true</code> 的情况下才生效。</p>
     * <p>如果为 <code class="codespan">'none'</code> 表示不使用贴花图案。</p>
     */
    private Decal decal;
}
