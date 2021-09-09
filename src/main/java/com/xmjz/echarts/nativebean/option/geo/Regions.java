package com.xmjz.echarts.nativebean.option.geo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#geo.regions">https://echarts.apache.org/v4/zh/option.html#geo.regions</a>
 * <br/>序号: 24
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>在地图中对特定的区域配置样式。</p>
 * <p>例如：</p>
 * <pre><code class="lang-js hljs javascript">regions: [{
 *     <span class="hljs-attr">name</span>: <span class="hljs-string">'广东'</span>,
 *     <span class="hljs-attr">itemStyle</span>: {
 *         <span class="hljs-attr">areaColor</span>: <span class="hljs-string">'red'</span>,
 *         <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>
 *     }
 * }]
 * </code></pre>
 * <p>geo 区域的颜色也可以被 map series 所控制，参见 <a href="#series-map.geoIndex">series-map.geoIndex</a>。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Regions implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#geo.regions.name">https://echarts.apache.org/v4/zh/option.html#geo.regions.name</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>地图区域的名称，例如 <code class="codespan">'广东'</code>，<code class="codespan">'浙江'</code>。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#geo.regions.selected">https://echarts.apache.org/v4/zh/option.html#geo.regions.selected</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>该区域是否选中。</p>
     */
    private Boolean selected;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#geo.regions.itemStyle">https://echarts.apache.org/v4/zh/option.html#geo.regions.itemStyle</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该区域的多边形样式设置</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#geo.regions.label">https://echarts.apache.org/v4/zh/option.html#geo.regions.label</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等，<code class="codespan">label</code>选项在 ECharts 2.x 中放置于<code class="codespan">itemStyle</code>下，在 ECharts 3 中为了让整个配置项结构更扁平合理，<code class="codespan">label</code> 被拿出来跟 <code class="codespan">itemStyle</code> 平级，并且跟 <code class="codespan">itemStyle</code> 一样拥有 <code class="codespan">emphasis</code> 状态。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#geo.regions.emphasis">https://echarts.apache.org/v4/zh/option.html#geo.regions.emphasis</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮的样式。</p>
     */
    private Object emphasis;
}
