package com.xmjz.echarts.nativebean.option.geo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.regions">https://echarts.apache.org/zh/option.html#geo.regions</a>
 * <br/>序号: 25
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
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Regions implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#geo.regions.name
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>地图区域的名称，例如 <code class="codespan">'广东'</code>，<code class="codespan">'浙江'</code>。</p>
     */
    private String name;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#geo.regions.selected
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>该区域是否选中。</p>
     */
    private Boolean selected;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#geo.regions.itemStyle
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该区域的多边形样式设置</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#geo.regions.label
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Object label;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#geo.regions.emphasis
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态的设置。</p>
     */
    private Object emphasis;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#geo.regions.select
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>选中状态的设置。</p>
     */
    private Object select;
}
