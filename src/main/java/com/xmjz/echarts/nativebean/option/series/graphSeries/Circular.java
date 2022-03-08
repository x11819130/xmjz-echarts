package com.xmjz.echarts.nativebean.option.series.graphSeries;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.circular">#series-graph.circular</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>环形布局相关配置</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Circular extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.circular.rotateLabel">#series-graph.circular.rotateLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否旋转标签，默认不旋转</p>
     */
    private Boolean rotateLabel;
}