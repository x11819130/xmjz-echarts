package com.xmjz.echarts.nativebean.option.toolbox;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.toolbox.emphasis.IconStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.emphasis">#toolbox.emphasis</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Emphasis extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.emphasis.iconStyle">#toolbox.emphasis.iconStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private IconStyle iconStyle;
}
