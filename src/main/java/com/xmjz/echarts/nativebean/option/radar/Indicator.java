package com.xmjz.echarts.nativebean.option.radar;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.indicator">https://echarts.apache.org/zh/option.html#radar.indicator</a>
 * <br/>序号: 19
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>雷达图的指示器，用来指定雷达图中的多个变量（维度），如下示例。</p>
 * <pre><code class="lang-js hljs javascript">indicator: [
 *    { <span class="hljs-attr">name</span>: <span class="hljs-string">'销售（sales）'</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">6500</span>},
 *    { <span class="hljs-attr">name</span>: <span class="hljs-string">'管理（Administration）'</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">16000</span>, <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>}, <span class="hljs-comment">// 标签设置为红色</span>
 *    { <span class="hljs-attr">name</span>: <span class="hljs-string">'信息技术（Information Techology）'</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">30000</span>},
 *    { <span class="hljs-attr">name</span>: <span class="hljs-string">'客服（Customer Support）'</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">38000</span>},
 *    { <span class="hljs-attr">name</span>: <span class="hljs-string">'研发（Development）'</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">52000</span>},
 *    { <span class="hljs-attr">name</span>: <span class="hljs-string">'市场（Marketing）'</span>, <span class="hljs-attr">max</span>: <span class="hljs-number">25000</span>}
 * ]
 * </code></pre>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Indicator implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.indicator.name">https://echarts.apache.org/zh/option.html#radar.indicator.name</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>指示器名称。</p>
     */
    private String name;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.indicator.max">https://echarts.apache.org/zh/option.html#radar.indicator.max</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指示器的最大值，可选，建议设置</p>
     */
    private Integer max;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.indicator.min">https://echarts.apache.org/zh/option.html#radar.indicator.min</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指示器的最小值，可选，默认为 0。</p>
     */
    private Integer min;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.indicator.color">https://echarts.apache.org/zh/option.html#radar.indicator.color</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>标签特定的颜色。</p>
     */
    private String color;
}
