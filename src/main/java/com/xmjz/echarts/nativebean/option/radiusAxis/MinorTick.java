package com.xmjz.echarts.nativebean.option.radiusAxis;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radiusAxis.minorTick">https://echarts.apache.org/zh/option.html#radiusAxis.minorTick</a>
 * <br/>序号: 23
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v4.6.0</code> 开始支持</p>
 * </blockquote>
 * <p>坐标轴次刻度线相关设置。</p>
 * <p>注意：次刻度线无法在类目轴（<a href="#radiusAxis.type">type</a>: <code class="codespan">'category'</code>）中使用。</p>
 * <p>示例：</p>
 * <p>1) 函数绘图中使用次刻度线</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-function&amp;edit=1&amp;reset=1" width="600" height="350"></iframe>
 *
 *
 * <p>2) 在对数轴中使用次刻度线</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-log&amp;edit=1&amp;reset=1" width="600" height="350"></iframe>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class MinorTick implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#radiusAxis.minorTick.show
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示次刻度线。</p>
     */
    private Boolean show;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#radiusAxis.minorTick.splitNumber
     * <br/>序号: 2
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>次刻度线分割数，默认会分割成 5 段</p>
     */
    private Integer splitNumber;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#radiusAxis.minorTick.length
     * <br/>序号: 3
     * <br/>默认值: 3
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>次刻度线的长度。</p>
     */
    private Integer length;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#radiusAxis.minorTick.lineStyle
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object lineStyle;
}
