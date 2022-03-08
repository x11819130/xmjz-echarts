package com.xmjz.echarts.nativebean.option.toolbox.feature;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.toolbox.feature.magicType.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType">#toolbox.feature.magicType</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>动态类型切换
 * <strong>示例：</strong></p>
 * <pre><code class="lang-ts hljs typescript">feature: {
 *     magicType: {
 *         <span class="hljs-keyword">type</span>: [<span class="hljs-string">'line'</span>, <span class="hljs-string">'bar'</span>, <span class="hljs-string">'stack'</span>]
 *     }
 * }
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class MagicType extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.show">#toolbox.feature.magicType.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示该工具。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.type">#toolbox.feature.magicType.type</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>启用的动态类型，包括<code class="codespan">'line'</code>（切换为折线图）, <code class="codespan">'bar'</code>（切换为柱状图）, <code class="codespan">'stack'</code>（切换为堆叠模式）。</p>
     */
    private List<?> type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.title">#toolbox.feature.magicType.title</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>各个类型的标题文本，可以分别配置。</p>
     */
    private Title title;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.icon">#toolbox.feature.magicType.icon</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>各个类型的 icon path，可以分别配置。</p>
     */
    private Icon icon;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.iconStyle">#toolbox.feature.magicType.iconStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>动态类型切换 icon 样式设置。由于 icon 的文本信息只在 icon hover 时候才显示，所以文字相关的配置项请在 <code class="codespan">emphasis</code> 下设置。</p>
     */
    private IconStyle iconStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.emphasis">#toolbox.feature.magicType.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.option">#toolbox.feature.magicType.option</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>各个类型的专有配置项。在切换到某类型的时候会合并相应的配置项。</p>
     */
    private Option option;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.seriesIndex">#toolbox.feature.magicType.seriesIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>各个类型对应的系列的列表。</p>
     */
    private SeriesIndex seriesIndex;
}
