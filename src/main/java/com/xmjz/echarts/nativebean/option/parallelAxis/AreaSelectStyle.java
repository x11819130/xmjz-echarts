package com.xmjz.echarts.nativebean.option.parallelAxis;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#parallelAxis.areaSelectStyle">https://echarts.apache.org/zh/option.html#parallelAxis.areaSelectStyle</a>
 * <br/>序号: 5
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>在坐标轴上可以进行框选，这里是一些框选的设置。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class AreaSelectStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallelAxis.areaSelectStyle.width
     * <br/>序号: 1
     * <br/>默认值: 20
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>框选范围的宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallelAxis.areaSelectStyle.borderWidth
     * <br/>序号: 2
     * <br/>默认值: 1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>选框的边框宽度。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallelAxis.areaSelectStyle.borderColor
     * <br/>序号: 3
     * <br/>默认值: rgba(160,197,232)
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>选框的边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallelAxis.areaSelectStyle.color
     * <br/>序号: 4
     * <br/>默认值: rgba(160,197,232)
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>选框的填充色。</p>
     */
    private String color;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#parallelAxis.areaSelectStyle.opacity
     * <br/>序号: 5
     * <br/>默认值: 0.3
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>选框的透明度。</p>
     */
    private Integer opacity;
}
