package com.xmjz.echarts.nativebean.option.aria.label.data;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.data.separator">#aria.label.data.separator</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>数据与数据之间描述的分隔符。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Separator extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.data.separator.middle">#aria.label.data.separator.middle</a>
     * <br/>默认值: '，'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>除了最后一个数据后的分隔符。</p>
     */
    private String middle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.data.separator.end">#aria.label.data.separator.end</a>
     * <br/>默认值: ''
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>最后一个数据后的分隔符。</p>
     * <p>需要注意的是，通常最后一个数据后是系列的 <code class="codespan">separator.end</code>，所以 <code class="codespan">data.separator.end</code> 在大多数情况下为空字符串。</p>
     */
    private String end;
}
