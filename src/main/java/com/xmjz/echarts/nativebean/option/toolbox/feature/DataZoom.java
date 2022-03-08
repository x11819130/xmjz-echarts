package com.xmjz.echarts.nativebean.option.toolbox.feature;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.toolbox.feature.dataZoom.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom">#toolbox.feature.dataZoom</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>数据区域缩放。目前只支持直角坐标系的缩放。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class DataZoom extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.show">#toolbox.feature.dataZoom.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示该工具。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.title">#toolbox.feature.dataZoom.title</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>缩放和还原的标题文本。</p>
     */
    private Title title;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.icon">#toolbox.feature.dataZoom.icon</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>缩放和还原的 icon path。</p>
     */
    private Icon icon;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.iconStyle">#toolbox.feature.dataZoom.iconStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>数据区域缩放 icon 样式设置。由于 icon 的文本信息只在 icon hover 时候才显示，所以文字相关的配置项请在 <code class="codespan">emphasis</code> 下设置。</p>
     */
    private IconStyle iconStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.emphasis">#toolbox.feature.dataZoom.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Emphasis emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.filterMode">#toolbox.feature.dataZoom.filterMode</a>
     * <br/>默认值: 'filter'
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>与 <a href="https://echarts.apache.org/zh/option.html#dataZoom.filterMode">dataZoom.filterMode</a> 含义和取值相同。</p>
     */
    private String filterMode;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.xAxisIndex">#toolbox.feature.dataZoom.xAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array","boolean"]
     * <br/>描述:
     * <p>指定哪些 <a href="https://echarts.apache.org/zh/option.html#xAxis">xAxis</a> 被控制。如果缺省则控制所有的x轴。如果设置为 <code class="codespan">false</code> 则不控制任何x轴。如果设置成 <code class="codespan">3</code> 则控制 axisIndex 为 <code class="codespan">3</code> 的x轴。如果设置为 <code class="codespan">[0, 3]</code> 则控制 axisIndex 为 <code class="codespan">0</code> 和 <code class="codespan">3</code> 的x轴。</p>
     */
    private Object xAxisIndex;

    public Object getxAxisIndex() {
        return this.xAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.yAxisIndex">#toolbox.feature.dataZoom.yAxisIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array","boolean"]
     * <br/>描述:
     * <p>指定哪些 <a href="https://echarts.apache.org/zh/option.html#yAxis">yAxis</a> 被控制。如果缺省则控制所有的y轴。如果设置为 <code class="codespan">false</code> 则不控制任何y轴。如果设置成 <code class="codespan">3</code> 则控制 axisIndex 为 <code class="codespan">3</code> 的y轴。如果设置为 <code class="codespan">[0, 3]</code> 则控制 axisIndex 为 <code class="codespan">0</code> 和 <code class="codespan">3</code> 的y轴。</p>
     */
    private Object yAxisIndex;

    public Object getyAxisIndex() {
        return this.yAxisIndex;
    }

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom.brushStyle">#toolbox.feature.dataZoom.brushStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>刷选框样式</p>
     */
    private BrushStyle brushStyle;
}
