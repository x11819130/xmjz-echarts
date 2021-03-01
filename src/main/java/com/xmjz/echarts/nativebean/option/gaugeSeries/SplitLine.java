package com.xmjz.echarts.nativebean.option.gaugeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-gauge.splitLine">https://echarts.apache.org/zh/option.html#series-gauge.splitLine</a>
 * <br/>序号: 18
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>分隔线样式。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class SplitLine implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-gauge.splitLine.show
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示分隔线。</p>
     */
    private Boolean show;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-gauge.splitLine.length
     * <br/>序号: 2
     * <br/>默认值: 10
     * <br/>js类型: ["number","string"]
     * <br/>描述:
     * <p>分隔线线长。支持相对半径的百分比。</p>
     */
    private Object length;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-gauge.splitLine.distance
     * <br/>序号: 3
     * <br/>默认值: 10
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>分隔线与轴线的距离。</p>
     */
    private Integer distance;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#series-gauge.splitLine.lineStyle
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
}
