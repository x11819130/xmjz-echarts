package com.xmjz.echarts.nativebean.option.timeline;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.timeline.progress.ItemStyle;
import com.xmjz.echarts.nativebean.option.timeline.progress.Label;
import com.xmjz.echarts.nativebean.option.timeline.progress.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.progress">#timeline.progress</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>进度条中的线条，拐点，标签的样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Progress extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.progress.lineStyle">#timeline.progress.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.progress.itemStyle">#timeline.progress.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.progress.label">#timeline.progress.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Label label;
}
