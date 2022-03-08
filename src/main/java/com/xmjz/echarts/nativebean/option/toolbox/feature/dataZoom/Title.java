package com.xmjz.echarts.nativebean.option.toolbox.feature.dataZoom;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.title">#toolbox.feature.dataZoom.title</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>缩放和还原的标题文本。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Title extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.title.zoom">#toolbox.feature.dataZoom.title.zoom</a>
     * <br/>默认值: '区域缩放'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String zoom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.title.back">#toolbox.feature.dataZoom.title.back</a>
     * <br/>默认值: '区域缩放还原'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String back;
}
