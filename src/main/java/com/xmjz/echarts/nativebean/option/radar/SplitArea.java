package com.xmjz.echarts.nativebean.option.radar;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.radar.splitArea.AreaStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.splitArea">#radar.splitArea</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>坐标轴在 <a href="https://echarts.apache.org/zh/option.html#grid">grid</a> 区域中的分隔区域，默认不显示。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class SplitArea extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.splitArea.show">#radar.splitArea.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示分隔区域。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.splitArea.areaStyle">#radar.splitArea.areaStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>分隔区域的样式设置。</p>
     */
    private AreaStyle areaStyle;
}
