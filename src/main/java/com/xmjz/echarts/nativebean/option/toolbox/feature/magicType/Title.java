package com.xmjz.echarts.nativebean.option.toolbox.feature.magicType;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.title">#toolbox.feature.magicType.title</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>各个类型的标题文本，可以分别配置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Title extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.title.line">#toolbox.feature.magicType.title.line</a>
     * <br/>默认值: '切换为折线图'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String line;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.title.bar">#toolbox.feature.magicType.title.bar</a>
     * <br/>默认值: '切换为柱状图'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String bar;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.title.stack">#toolbox.feature.magicType.title.stack</a>
     * <br/>默认值: '切换为堆叠'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String stack;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.title.tiled">#toolbox.feature.magicType.title.tiled</a>
     * <br/>默认值: '切换为平铺'
     * <br/>js类型: ["string"]
     * <br/>描述:
     */
    private String tiled;
}
