package com.xmjz.echarts.nativebean.option.toolbox.feature.magicType;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.option">#toolbox.feature.magicType.option</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>各个类型的专有配置项。在切换到某类型的时候会合并相应的配置项。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Option extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.option.line">#toolbox.feature.magicType.option.line</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object line;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.option.bar">#toolbox.feature.magicType.option.bar</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object bar;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.magicType.option.stack">#toolbox.feature.magicType.option.stack</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object stack;
}
