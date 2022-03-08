package com.xmjz.echarts.nativebean.option.toolbox.feature.magicType;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.seriesIndex">#toolbox.feature.magicType.seriesIndex</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>各个类型对应的系列的列表。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class SeriesIndex extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.seriesIndex.line">#toolbox.feature.magicType.seriesIndex.line</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     */
    private List<?> line;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.seriesIndex.bar">#toolbox.feature.magicType.seriesIndex.bar</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     */
    private List<?> bar;
}
