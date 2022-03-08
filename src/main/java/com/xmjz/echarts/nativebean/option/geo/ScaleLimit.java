package com.xmjz.echarts.nativebean.option.geo;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.scaleLimit">#geo.scaleLimit</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>滚轮缩放的极限控制，通过<code class="codespan">min</code>, <code class="codespan">max</code>最小和最大的缩放值，默认的缩放为<code class="codespan">1</code>。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class ScaleLimit extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.scaleLimit.min">#geo.scaleLimit.min</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>最小的缩放值</p>
     */
    private Integer min;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#geo.scaleLimit.max">#geo.scaleLimit.max</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>最大的缩放值</p>
     */
    private Integer max;
}
