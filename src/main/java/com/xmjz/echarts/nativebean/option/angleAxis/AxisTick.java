package com.xmjz.echarts.nativebean.option.angleAxis;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisTick">https://echarts.apache.org/zh/option.html#angleAxis.axisTick</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>坐标轴刻度相关设置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class AxisTick implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisTick.show">https://echarts.apache.org/zh/option.html#angleAxis.axisTick.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示坐标轴刻度。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisTick.alignWithLabel">https://echarts.apache.org/zh/option.html#angleAxis.axisTick.alignWithLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>类目轴中在 <code class="codespan">boundaryGap</code> 为 <code class="codespan">true</code> 的时候有效，可以保证刻度线和标签对齐。如下图：</p>
     * <p><img width="600" height="auto" src="documents/asset/img/axis-align-with-label.png"></p>
     */
    private Boolean alignWithLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisTick.interval">https://echarts.apache.org/zh/option.html#angleAxis.axisTick.interval</a>
     * <br/>默认值: auto
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>坐标轴刻度的显示间隔，在类目轴中有效。默认同 <a href="#angleAxis.axisLabel.interval">axisLabel.interval</a> 一样。</p>
     * <p>默认会采用标签不重叠的策略间隔显示标签。</p>
     * <p>可以设置成 0 强制显示所有标签。</p>
     * <p>如果设置为 <code class="codespan">1</code>，表示『隔一个标签显示一个标签』，如果值为 <code class="codespan">2</code>，表示隔两个标签显示一个标签，以此类推。</p>
     * <p>可以用数值表示间隔的数据，也可以通过回调函数控制。回调函数格式如下：</p>
     * <pre><code class="lang-ts hljs typescript">(index:<span class="hljs-built_in">number</span>, value: <span class="hljs-built_in">string</span>) =&gt; <span class="hljs-built_in">boolean</span>
     * </code></pre>
     * <p>第一个参数是类目的 index，第二个值是类目名称，如果跳过则返回 <code class="codespan">false</code>。</p>
     */
    private Object interval;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisTick.inside">https://echarts.apache.org/zh/option.html#angleAxis.axisTick.inside</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>坐标轴刻度是否朝内，默认朝外。</p>
     */
    private Boolean inside;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisTick.length">https://echarts.apache.org/zh/option.html#angleAxis.axisTick.length</a>
     * <br/>默认值: 5
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>坐标轴刻度的长度。</p>
     */
    private Integer length;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#angleAxis.axisTick.lineStyle">https://echarts.apache.org/zh/option.html#angleAxis.axisTick.lineStyle</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>刻度线的样式设置。</p>
     */
    private Object lineStyle;
}
