package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.media.Query;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#media">#media</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>请参见 <a href="tutorial.html#%E7%A7%BB%E5%8A%A8%E7%AB%AF%E8%87%AA%E9%80%82%E5%BA%94" target="_blank">移动端自适应</a>。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Media extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#media.query">#media.query</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>同时写两个属性，表示 “且”。</p>
     */
    private Query query;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#media.option">#media.option</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>数组的每一项是一个 echarts option (<code class="codespan">ECUnitOption</code>)，当此 query 被匹配时，会使用这个 option 。</p>
     */
    private Object option;
}
