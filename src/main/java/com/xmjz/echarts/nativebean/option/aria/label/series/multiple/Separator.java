package com.xmjz.echarts.nativebean.option.aria.label.series.multiple;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.multiple.separator">#aria.label.series.multiple.separator</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>系列与系列之间描述的分隔符。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Separator extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.multiple.separator.middle">#aria.label.series.multiple.separator.middle</a>
     * <br/>默认值: '；'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>除了最后一个系列后的分隔符。</p>
     */
    private String middle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.multiple.separator.end">#aria.label.series.multiple.separator.end</a>
     * <br/>默认值: '。'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>最后一个系列后的分隔符。</p>
     */
    private String end;
}
