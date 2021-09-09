package com.xmjz.echarts.nativebean.option.timeline;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.emphasis">https://echarts.apache.org/zh/option.html#timeline.emphasis</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.emphasis.label">https://echarts.apache.org/zh/option.html#timeline.emphasis.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.emphasis.itemStyle">https://echarts.apache.org/zh/option.html#timeline.emphasis.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.emphasis.checkpointStyle">https://echarts.apache.org/zh/option.html#timeline.emphasis.checkpointStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>当前项『高亮状态』的样式（hover时）。</p>
     */
    private Object checkpointStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.emphasis.controlStyle">https://echarts.apache.org/zh/option.html#timeline.emphasis.controlStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>控制按钮的『高亮状态』的样式（hover时）。</p>
     */
    private Object controlStyle;
}
