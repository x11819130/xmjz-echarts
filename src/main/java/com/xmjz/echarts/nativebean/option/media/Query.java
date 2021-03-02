package com.xmjz.echarts.nativebean.option.media;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#media.query">https://echarts.apache.org/zh/option.html#media.query</a>
 * <br/>序号: 1
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>同时写两个属性，表示 “且”。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Query implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#media.query.minWidth">https://echarts.apache.org/zh/option.html#media.query.minWidth</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><code class="codespan">minWidth: 200</code> 表示『大于等于 200px 宽度』。</p>
     */
    private Integer minWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#media.query.maxHeight">https://echarts.apache.org/zh/option.html#media.query.maxHeight</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p><code class="codespan">minHeight: 200</code> 表示『大于等于 200px 高度』。</p>
     */
    private Integer maxHeight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#media.query.minAspectRatio">https://echarts.apache.org/zh/option.html#media.query.minAspectRatio</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>长宽比。值如 <code class="codespan">1.3</code>。</p>
     */
    private Integer minAspectRatio;
}
