package com.xmjz.echarts.nativebean.option.timeline;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.timeline.emphasis.ItemStyle;
import com.xmjz.echarts.nativebean.option.timeline.emphasis.Label;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.emphasis">#timeline.emphasis</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.emphasis.label">#timeline.emphasis.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Label label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.emphasis.itemStyle">#timeline.emphasis.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.emphasis.checkpointStyle">#timeline.emphasis.checkpointStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>当前项『高亮状态』的样式（hover时）。</p>
     */
    private Object checkpointStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.emphasis.controlStyle">#timeline.emphasis.controlStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>控制按钮的『高亮状态』的样式（hover时）。</p>
     */
    private Object controlStyle;
}
