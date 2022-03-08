package com.xmjz.echarts.nativebean.option.aria.label;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.aria.label.series.Multiple;
import com.xmjz.echarts.nativebean.option.aria.label.series.Single;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series">#aria.label.series</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>系列相关的配置项。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Series extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.maxCount">#aria.label.series.maxCount</a>
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>描述中最多出现的系列个数。</p>
     */
    private Integer maxCount;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.single">#aria.label.series.single</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>当图表只包含一个系列时，采用的描述。</p>
     */
    private Single single;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#aria.label.series.multiple">#aria.label.series.multiple</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>当图表只包含多个系列时，采用的描述。</p>
     */
    private Multiple multiple;
}
