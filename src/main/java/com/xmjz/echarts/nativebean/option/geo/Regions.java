package com.xmjz.echarts.nativebean.option.geo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.regions">https://echarts.apache.org/zh/option.html#geo.regions</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>在地图中对特定的区域配置样式。</p>
 * <p>例如：</p>
 * <pre><code class="lang-ts hljs typescript">regions: [{
 *     name: <span class="hljs-string">'广东'</span>,
 *     itemStyle: {
 *         areaColor: <span class="hljs-string">'red'</span>,
 *         color: <span class="hljs-string">'red'</span>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.regions.name">https://echarts.apache.org/zh/option.html#geo.regions.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>地图区域的名称，例如 <code class="codespan">'广东'</code>，<code class="codespan">'浙江'</code>。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.regions.selected">https://echarts.apache.org/zh/option.html#geo.regions.selected</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>该区域是否选中。</p>
     */
    private Boolean selected;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.regions.itemStyle">https://echarts.apache.org/zh/option.html#geo.regions.itemStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>该区域的多边形样式设置</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.regions.label">https://echarts.apache.org/zh/option.html#geo.regions.label</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.regions.emphasis">https://echarts.apache.org/zh/option.html#geo.regions.emphasis</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>高亮状态的设置。</p>
     */
    private Object emphasis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.regions.select">https://echarts.apache.org/zh/option.html#geo.regions.select</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>选中状态的设置。</p>
     */
    private Object select;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.regions.blur">https://echarts.apache.org/zh/option.html#geo.regions.blur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.1.0</code> 开始支持</p>
     * </blockquote>
     * <p>淡出状态的设置。</p>
     */
    private Object blur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.regions.tooltip">https://echarts.apache.org/zh/option.html#geo.regions.tooltip</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.1.0</code> 开始支持</p>
     * </blockquote>
     * <p>本 region 中特定的 tooltip 设定。</p>
     */
    private Object tooltip;
}
