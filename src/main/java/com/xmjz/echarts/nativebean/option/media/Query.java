package com.xmjz.echarts.nativebean.option.media;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#media.query">#media.query</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>同时写两个属性，表示 “且”。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Query extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#media.query.minWidth">#media.query.minWidth</a>
     * <br/>默认值: undefined
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><code class="codespan">minWidth: 200</code> 表示『大于等于 200px 宽度』。</p>
     */
    private Integer minWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#media.query.maxHeight">#media.query.maxHeight</a>
     * <br/>默认值: undefined
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><code class="codespan">minHeight: 200</code> 表示『大于等于 200px 高度』。</p>
     */
    private Integer maxHeight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#media.query.minAspectRatio">#media.query.minAspectRatio</a>
     * <br/>默认值: undefined
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>长宽比。值如 <code class="codespan">1.3</code>。</p>
     */
    private Integer minAspectRatio;
}
