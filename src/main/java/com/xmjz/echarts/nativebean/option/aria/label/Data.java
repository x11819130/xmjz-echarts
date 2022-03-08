package com.xmjz.echarts.nativebean.option.aria.label;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.aria.label.data.Separator;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.data">#aria.label.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>数据相关的配置项。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Data extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.data.maxCount">#aria.label.data.maxCount</a>
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>描述中每个系列最多出现的数据个数。</p>
     */
    private Integer maxCount;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.data.allData">#aria.label.data.allData</a>
     * <br/>默认值: '其数据是——'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>当数据全部显示时采用的描述。这一配置项<strong>不会</strong>使得数据全部显示，可以通过将 <a href="https://echarts.apache.org/zh/option.html#aria.data.maxCount">aria.data.maxCount</a> 设置为 <code class="codespan">Number.MAX_VALUE</code> 实现全部显示的效果。</p>
     */
    private String allData;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.data.partialData">#aria.label.data.partialData</a>
     * <br/>默认值: '其中，前{displayCnt}项是——'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>当只有部分数据显示时采用的描述。其中包括模板变量：</p>
     * <ul>
     * <li><code class="codespan">{displayCnt}</code>：将被替换为显示的数据个数。</li>
     * </ul>
     */
    private String partialData;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.data.withName">#aria.label.data.withName</a>
     * <br/>默认值: '{name}的数据是{value}'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>如果数据有 <code class="codespan">name</code> 属性，则采用该描述。其中包括模板变量：</p>
     * <ul>
     * <li><code class="codespan">{name}</code>：将被替换为数据的 <code class="codespan">name</code>；</li>
     * <li><code class="codespan">{value}</code>：将被替换为数据的值。</li>
     * </ul>
     */
    private String withName;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.data.withoutName">#aria.label.data.withoutName</a>
     * <br/>默认值: '{value}'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>如果数据没有 <code class="codespan">name</code> 属性，则采用该描述。其中包括模板变量：</p>
     * <ul>
     * <li><code class="codespan">{value}</code>：将被替换为数据的值。</li>
     * </ul>
     */
    private String withoutName;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.data.separator">#aria.label.data.separator</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>数据与数据之间描述的分隔符。</p>
     */
    private Separator separator;
}
