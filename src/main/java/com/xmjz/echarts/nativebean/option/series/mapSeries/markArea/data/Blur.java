package com.xmjz.echarts.nativebean.option.series.mapSeries.markArea.data;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.series.mapSeries.markArea.data.blur.ItemStyle;
import com.xmjz.echarts.nativebean.option.series.mapSeries.markArea.data.blur.Label;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.blur">#series-map.markArea.data.0.blur</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
 * </blockquote>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Blur extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.blur.itemStyle">#series-map.markArea.data.0.blur.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private ItemStyle itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.markArea.data.0.blur.label">#series-map.markArea.data.0.blur.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Label label;
}
