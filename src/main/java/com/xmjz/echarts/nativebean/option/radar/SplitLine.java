package com.xmjz.echarts.nativebean.option.radar;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.splitLine">https://echarts.apache.org/zh/option.html#radar.splitLine</a>
 * <br/>序号: 17
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>坐标轴在 <a href="#grid">grid</a> 区域中的分隔线。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class SplitLine implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.splitLine.show">https://echarts.apache.org/zh/option.html#radar.splitLine.show</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示分隔线。默认数值轴显示，类目轴不显示。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.splitLine.lineStyle">https://echarts.apache.org/zh/option.html#radar.splitLine.lineStyle</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
}
