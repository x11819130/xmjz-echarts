package com.xmjz.echarts.nativebean.option.aria;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#aria.data">https://echarts.apache.org/v4/zh/option.html#aria.data</a>
 * <br/>序号: 5
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
public class Data implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#aria.data.maxCount">https://echarts.apache.org/v4/zh/option.html#aria.data.maxCount</a>
     * <br/>序号: 1
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>描述中每个系列最多出现的数据个数。</p>
     */
    private Integer maxCount;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#aria.data.allData">https://echarts.apache.org/v4/zh/option.html#aria.data.allData</a>
     * <br/>序号: 2
     * <br/>默认值: 其数据是——
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>当数据全部显示时采用的描述。这一配置项<strong>不会</strong>使得数据全部显示，可以通过将 <a href="#aria.data.maxCount">aria.data.maxCount</a> 设置为 <code class="codespan">Number.MAX_VALUE</code> 实现全部显示的效果。</p>
     */
    private String allData;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#aria.data.partialData">https://echarts.apache.org/v4/zh/option.html#aria.data.partialData</a>
     * <br/>序号: 3
     * <br/>默认值: 其中，前{displayCnt}项是——
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>当只有部分数据显示时采用的描述。其中包括模板变量：</p>
     * <ul>
     * <li><code class="codespan">{displayCnt}</code>：将被替换为显示的数据个数。</li>
     * </ul>
     */
    private String partialData;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#aria.data.withName">https://echarts.apache.org/v4/zh/option.html#aria.data.withName</a>
     * <br/>序号: 4
     * <br/>默认值: {name}的数据是{value}
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
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#aria.data.withoutName">https://echarts.apache.org/v4/zh/option.html#aria.data.withoutName</a>
     * <br/>序号: 5
     * <br/>默认值: {value}
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>如果数据没有 <code class="codespan">name</code> 属性，则采用该描述。其中包括模板变量：</p>
     * <ul>
     * <li><code class="codespan">{value}</code>：将被替换为数据的值。</li>
     * </ul>
     */
    private String withoutName;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#aria.data.separator">https://echarts.apache.org/v4/zh/option.html#aria.data.separator</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>数据与数据之间描述的分隔符。</p>
     */
    private Object separator;
}
