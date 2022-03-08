package com.xmjz.echarts.nativebean.option.aria.label.series;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.single">#aria.label.series.single</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>当图表只包含一个系列时，采用的描述。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Single extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.single.prefix">#aria.label.series.single.prefix</a>
     * <br/>默认值: ''
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>对于所有系列的整体性描述，显示在每个系列描述之前。其中包括模板变量：</p>
     * <ul>
     * <li><code class="codespan">{seriesCount}</code>：将被替换为系列个数，这里始终为 1。</li>
     * </ul>
     */
    private String prefix;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.single.withName">#aria.label.series.single.withName</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.single.withoutName">#aria.label.series.single.withoutName</a>
     * <br/>默认值: '图表类型是{seriesType}。'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>如果系列没有 <code class="codespan">name</code> 属性，则采用该描述。其中包括模板变量：</p>
     * <ul>
     * <li><code class="codespan">{seriesType}</code>：将被替换为系列的类型名称，如：<code class="codespan">'柱状图'</code>、 <code class="codespan">'折线图'</code> 等等。</li>
     * </ul>
     */
    private String withoutName;
}
