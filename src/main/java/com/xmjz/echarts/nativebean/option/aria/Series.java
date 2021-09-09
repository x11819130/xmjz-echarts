package com.xmjz.echarts.nativebean.option.aria;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#aria.series">https://echarts.apache.org/v4/zh/option.html#aria.series</a>
 * <br/>序号: 4
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
public class Series implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#aria.series.maxCount">https://echarts.apache.org/v4/zh/option.html#aria.series.maxCount</a>
     * <br/>序号: 1
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>描述中最多出现的系列个数。</p>
     */
    private Integer maxCount;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#aria.series.single">https://echarts.apache.org/v4/zh/option.html#aria.series.single</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>当图表只包含一个系列时，采用的描述。</p>
     */
    private Object single;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#aria.series.multiple">https://echarts.apache.org/v4/zh/option.html#aria.series.multiple</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>当图表只包含多个系列时，采用的描述。</p>
     */
    private Object multiple;
}
