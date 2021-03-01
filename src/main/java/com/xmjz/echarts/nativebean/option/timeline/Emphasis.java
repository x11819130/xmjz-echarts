package com.xmjz.echarts.nativebean.option.timeline;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#timeline.emphasis">https://echarts.apache.org/zh/option.html#timeline.emphasis</a>
 * <br/>序号: 32
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#timeline.emphasis.label
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#timeline.emphasis.itemStyle
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#timeline.emphasis.checkpointStyle
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>当前项『高亮状态』的样式（hover时）。</p>
     */
    private Object checkpointStyle;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#timeline.emphasis.controlStyle
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>控制按钮的『高亮状态』的样式（hover时）。</p>
     */
    private Object controlStyle;
}
