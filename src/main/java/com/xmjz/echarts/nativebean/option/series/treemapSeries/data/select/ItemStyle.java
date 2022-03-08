package com.xmjz.echarts.nativebean.option.series.treemapSeries.data.select;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.select.itemStyle">#series-treemap.data.select.itemStyle</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class ItemStyle extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-treemap.data.select.itemStyle.color">#series-treemap.data.select.itemStyle.color</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>矩形的颜色。默认从全局调色盘 <a href="https://echarts.apache.org/zh/option.html#color">option.color</a> 获取颜色。</p>
     */
    private String color;
}
