package com.xmjz.echarts.nativebean.option.calendar;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.calendar.splitLine.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#calendar.splitLine">#calendar.splitLine</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>设置日历坐标分隔线的样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class SplitLine extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#calendar.splitLine.show">#calendar.splitLine.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示分隔线。默认显示。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#calendar.splitLine.lineStyle">#calendar.splitLine.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
}
