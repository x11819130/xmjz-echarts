package com.xmjz.echarts.nativebean.option.treeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.emphasis">https://echarts.apache.org/v4/zh/option.html#series-tree.emphasis</a>
 * <br/>序号: 27
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>树图中个图形和标签高亮的样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.emphasis.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-tree.emphasis.itemStyle</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.emphasis.lineStyle">https://echarts.apache.org/v4/zh/option.html#series-tree.emphasis.lineStyle</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.emphasis.label">https://echarts.apache.org/v4/zh/option.html#series-tree.emphasis.label</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
}
