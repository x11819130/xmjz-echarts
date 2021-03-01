package com.xmjz.echarts.nativebean.option.aria;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.decal">https://echarts.apache.org/zh/option.html#aria.decal</a>
 * <br/>序号: 3
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>为系列数据增加贴花纹理，作为颜色的辅助，帮助区分数据。使用默认贴花图案的方式非常简单，只需要开启即可：</p>
 * <pre><code class="hljs javascript">aria: {
 *     <span class="hljs-attr">enabled</span>: <span class="hljs-literal">true</span>,
 *     <span class="hljs-attr">decal</span>: {
 *         <span class="hljs-attr">show</span>: <span class="hljs-literal">true</span>
 *     }
 * }
 * </code></pre><iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=doc-example/aria-decal-simple&amp;edit=1&amp;reset=1" width="700" height="300"></iframe>
 *
 *
 * <p>绝大部分支持填充色的系列都支持贴花图案，包括：<code class="codespan">'line'</code>, <code class="codespan">'bar'</code>, <code class="codespan">'pie'</code>, <code class="codespan">'radar'</code>, <code class="codespan">'treemap'</code>, <code class="codespan">'sunburst'</code>, <code class="codespan">'boxplot'</code>, <code class="codespan">'sankey'</code>, <code class="codespan">'funnel'</code>, <code class="codespan">'gauge'</code>, <code class="codespan">'pictorialBar'</code>, <code class="codespan">'themeRiver'</code>, <code class="codespan">'custom'</code> 等。其中，部分系列默认没有填充色（如 <code class="codespan">'line'</code>, <code class="codespan">'radar'</code>, <code class="codespan">'boxplot'</code>）需要在设置了填充样式 <code class="codespan">areaStyle</code> 的情况下才生效。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Decal implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#aria.decal.show
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示贴花图案，默认不显示。如果要显示贴花，需要保证 <a href="#aria.enabled">aria.enabled</a> 与 <code class="codespan">aria.decal.show</code> 都是 <code class="codespan">true</code>。</p>
     */
    private Boolean show;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#aria.decal.decals
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object","Array"]
     * <br/>描述:
     * <p>贴花图案的样式。如果是 <code class="codespan">Object</code> 类型，表示为所有数据采用同样的样式，如果是数组，则数组的每一项各为一种样式，数据将会依次循环取数组中的样式。</p>
     */
    private Object decals;
}
