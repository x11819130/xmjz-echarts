package com.xmjz.echarts.nativebean.option.xAxis;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.xAxis.minorTick.LineStyle;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.minorTick">#xAxis.minorTick</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <blockquote>
 * <p>从 <code class="codespan">v4.6.0</code> 开始支持</p>
 * </blockquote>
 * <p>坐标轴次刻度线相关设置。</p>
 * <p>注意：次刻度线无法在类目轴（<a href="https://echarts.apache.org/zh/option.html#xAxis.type">type</a>: <code class="codespan">'category'</code>）中使用。</p>
 * <p>示例：</p>
 * <p>1) 函数绘图中使用次刻度线</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-function&amp;edit=1&amp;reset=1" width="600" height="350"></iframe>
 *
 *
 * <p>2) 在对数轴中使用次刻度线</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-log&amp;edit=1&amp;reset=1" width="600" height="350"></iframe>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class MinorTick extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.minorTick.show">#xAxis.minorTick.show</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示次刻度线。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.minorTick.splitNumber">#xAxis.minorTick.splitNumber</a>
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>次刻度线分割数，默认会分割成 5 段</p>
     */
    private Integer splitNumber;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.minorTick.length">#xAxis.minorTick.length</a>
     * <br/>默认值: 3
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>次刻度线的长度。</p>
     */
    private Integer length;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#xAxis.minorTick.lineStyle">#xAxis.minorTick.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private LineStyle lineStyle;
}
