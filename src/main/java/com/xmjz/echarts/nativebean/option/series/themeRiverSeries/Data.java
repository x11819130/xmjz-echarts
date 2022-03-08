package com.xmjz.echarts.nativebean.option.series.themeRiverSeries;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.data">#series-themeRiver.data</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <pre><code class="lang-ts hljs typescript">data: [
 *     [<span class="hljs-string">"2015/11/09"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"DQ"</span>],
 *     [<span class="hljs-string">"2015/11/10"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"DQ"</span>],
 *     [<span class="hljs-string">"2015/11/11"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"DQ"</span>],
 *     [<span class="hljs-string">"2015/11/08"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"SS"</span>],
 *     [<span class="hljs-string">"2015/11/09"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"SS"</span>],
 *     [<span class="hljs-string">"2015/11/10"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"SS"</span>],
 *     [<span class="hljs-string">"2015/11/11"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"SS"</span>],
 *     [<span class="hljs-string">"2015/11/12"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"SS"</span>],
 *     [<span class="hljs-string">"2015/11/13"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"QG"</span>],
 *     [<span class="hljs-string">"2015/11/08"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"QG"</span>],
 *     [<span class="hljs-string">"2015/11/11"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"QG"</span>],
 *     [<span class="hljs-string">"2015/11/13"</span>,<span class="hljs-number">10</span>,<span class="hljs-string">"QG"</span>],
 * ]
 * </code></pre>
 * <p><strong>数据说明：</strong></p>
 * <p>如上所示，主题河流的数据格式是二维数组的形式，里层数组的每一项由事件或主题的时间属性、事件或主题在某个时间点的值，以及事件或主题的名称组成。值得注意的是，一定要提供一个具有完整时间段的事件或主题作为主干河流，其他事件或主题以该主干河流为依据，将缺省的时间点上的值补为0，也就是说其他事件或主题的时间段是包含在主干河流内的，如果超出，布局会出错，这么做的原因是，在计算整个图的布局的时候要计算一条baseline，以便将每个事情画成流带状。如上图中的"SS"这一事件就是一个主干河流，经过处理，我们会将"DQ"中缺省的三个时间点以["2015/11/08",0,"DQ"]，["2015/11/12",0,"DQ"]，［"2015/11/13",0,"DQ"］的格式补齐，使其与主干河流对其。从中还可以看出，我们可以在完整时间段的任意位置缺省。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Data extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.data.date">#series-themeRiver.data.date</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>时间或主题的时间属性。</p>
     */
    private String date;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.data.value">#series-themeRiver.data.value</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>事件或主题在某个时间点的值。</p>
     */
    private Integer value;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-themeRiver.data.name">#series-themeRiver.data.name</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>事件或主题的名称。</p>
     */
    private String name;
}
