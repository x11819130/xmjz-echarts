package com.xmjz.echarts.nativebean.option.aria.label;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.general">#aria.label.general</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>对于图表的整体性描述。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class General extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.general.withTitle">#aria.label.general.withTitle</a>
     * <br/>默认值: '这是一个关于“{title}”的图表。'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>如果图表存在 <a href="https://echarts.apache.org/zh/option.html#title.text">title.text</a>，则采用 <code class="codespan">withTitle</code>。其中包括模板变量：</p>
     * <ul>
     * <li><code class="codespan">{title}</code>：将被替换为图表的 <a href="https://echarts.apache.org/zh/option.html#title.text">title.text</a>。</li>
     * </ul>
     */
    private String withTitle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.general.withoutTitle">#aria.label.general.withoutTitle</a>
     * <br/>默认值: '这是一个图表，'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>如果图表不存在 <a href="https://echarts.apache.org/zh/option.html#title.text">title.text</a>，则采用 <code class="codespan">withoutTitle</code>。</p>
     */
    private String withoutTitle;
}
