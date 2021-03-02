package com.xmjz.echarts.nativebean.option.mapSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.scaleLimit">https://echarts.apache.org/zh/option.html#series-map.scaleLimit</a>
 * <br/>序号: 10
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>滚轮缩放的极限控制，通过<code class="codespan">min</code>, <code class="codespan">max</code>最小和最大的缩放值，默认的缩放为<code class="codespan">1</code>。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class ScaleLimit implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.scaleLimit.min">https://echarts.apache.org/zh/option.html#series-map.scaleLimit.min</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>最小的缩放值</p>
     */
    private Integer min;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-map.scaleLimit.max">https://echarts.apache.org/zh/option.html#series-map.scaleLimit.max</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>最大的缩放值</p>
     */
    private Integer max;
}
