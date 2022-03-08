package com.xmjz.echarts.nativebean.option.aria.label.series;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.aria.label.series.multiple.Separator;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.multiple">#aria.label.series.multiple</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>当图表只包含多个系列时，采用的描述。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Multiple extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.multiple.prefix">#aria.label.series.multiple.prefix</a>
     * <br/>默认值: '它由{seriesCount}个图表系列组成。'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>对于所有系列的整体性描述，显示在每个系列描述之前。其中包括模板变量：</p>
     * <ul>
     * <li><code class="codespan">{seriesCount}</code>：将被替换为系列个数。</li>
     * </ul>
     */
    private String prefix;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.multiple.withName">#aria.label.series.multiple.withName</a>
     * <br/>默认值: '图表类型是{seriesType}，表示{seriesName}。'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>如果系列有 <code class="codespan">name</code> 属性，则采用该描述。其中包括模板变量：</p>
     * <ul>
     * <li><code class="codespan">{seriesName}</code>：将被替换为系列的 <code class="codespan">name</code>；</li>
     * <li><code class="codespan">{seriesType}</code>：将被替换为系列的类型名称，如：<code class="codespan">'柱状图'</code>、 <code class="codespan">'折线图'</code> 等等。</li>
     * </ul>
     */
    private String withName;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.multiple.withoutName">#aria.label.series.multiple.withoutName</a>
     * <br/>默认值: '图表类型是{seriesType}。'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>如果系列没有 <code class="codespan">name</code> 属性，则采用该描述。其中包括模板变量：</p>
     * <ul>
     * <li><code class="codespan">{seriesType}</code>：将被替换为系列的类型名称，如：<code class="codespan">'柱状图'</code>、 <code class="codespan">'折线图'</code> 等等。</li>
     * </ul>
     */
    private String withoutName;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.multiple.separator">#aria.label.series.multiple.separator</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>系列与系列之间描述的分隔符。</p>
     */
    private Separator separator;
}
