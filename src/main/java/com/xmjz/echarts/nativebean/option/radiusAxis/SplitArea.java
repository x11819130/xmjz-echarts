package com.xmjz.echarts.nativebean.option.radiusAxis;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#radiusAxis.splitArea">https://echarts.apache.org/v4/zh/option.html#radiusAxis.splitArea</a>
 * <br/>序号: 27
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>坐标轴在 <a href="#grid">grid</a> 区域中的分隔区域，默认不显示。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class SplitArea implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#radiusAxis.splitArea.interval">https://echarts.apache.org/v4/zh/option.html#radiusAxis.splitArea.interval</a>
     * <br/>序号: 1
     * <br/>默认值: auto
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>坐标轴分隔区域的显示间隔，在类目轴中有效。默认同 <a href="#radiusAxis.axisLabel.interval">axisLabel.interval</a> 一样。</p>
     * <p>默认会采用标签不重叠的策略间隔显示标签。</p>
     * <p>可以设置成 0 强制显示所有标签。</p>
     * <p>如果设置为 <code class="codespan">1</code>，表示『隔一个标签显示一个标签』，如果值为 <code class="codespan">2</code>，表示隔两个标签显示一个标签，以此类推。</p>
     * <p>可以用数值表示间隔的数据，也可以通过回调函数控制。回调函数格式如下：</p>
     * <pre><code class="lang-js hljs javascript">(index:number, <span class="hljs-attr">value</span>: string) =&gt; boolean
     * </code></pre>
     * <p>第一个参数是类目的 index，第二个值是类目名称，如果跳过则返回 <code class="codespan">false</code>。</p>
     */
    private Object interval;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#radiusAxis.splitArea.show">https://echarts.apache.org/v4/zh/option.html#radiusAxis.splitArea.show</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示分隔区域。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#radiusAxis.splitArea.areaStyle">https://echarts.apache.org/v4/zh/option.html#radiusAxis.splitArea.areaStyle</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>分隔区域的样式设置。</p>
     */
    private Object areaStyle;
}
