package com.xmjz.echarts.nativebean.option.geo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.select">https://echarts.apache.org/zh/option.html#geo.select</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>选中状态下的多边形和标签样式。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Select implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.select.label">https://echarts.apache.org/zh/option.html#geo.select.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.select.itemStyle">https://echarts.apache.org/zh/option.html#geo.select.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object itemStyle;
}
