package com.xmjz.echarts.nativebean.option.toolbox.feature.brush;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.brush.title">#toolbox.feature.brush.title</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>标题文本。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Title extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.brush.title.rect">#toolbox.feature.brush.title.rect</a>
     * <br/>默认值: '矩形选择'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String rect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.brush.title.polygon">#toolbox.feature.brush.title.polygon</a>
     * <br/>默认值: '圈选'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String polygon;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.brush.title.lineX">#toolbox.feature.brush.title.lineX</a>
     * <br/>默认值: '横向选择'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String lineX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.brush.title.lineY">#toolbox.feature.brush.title.lineY</a>
     * <br/>默认值: '纵向选择'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String lineY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.brush.title.keep">#toolbox.feature.brush.title.keep</a>
     * <br/>默认值: '保持选择'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String keep;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.brush.title.clear">#toolbox.feature.brush.title.clear</a>
     * <br/>默认值: '清除选择'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String clear;
}
