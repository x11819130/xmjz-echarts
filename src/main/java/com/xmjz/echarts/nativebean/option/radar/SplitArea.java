package com.xmjz.echarts.nativebean.option.radar;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.splitArea">https://echarts.apache.org/zh/option.html#radar.splitArea</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>坐标轴在 <a href="#grid">grid</a> 区域中的分隔区域，默认不显示。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class SplitArea implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.splitArea.show">https://echarts.apache.org/zh/option.html#radar.splitArea.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示分隔区域。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.splitArea.areaStyle">https://echarts.apache.org/zh/option.html#radar.splitArea.areaStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>分隔区域的样式设置。</p>
     */
    private Object areaStyle;
}
