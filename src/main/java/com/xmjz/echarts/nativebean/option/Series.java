package com.xmjz.echarts.nativebean.option;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series">https://echarts.apache.org/v4/zh/option.html#series</a>
 * <br/>序号: 25
 * <br/>默认值: 无
 * <br/>js类型: ["string"]
 * <br/>描述:
 * <p>系列列表。每个系列通过 <code class="codespan">type</code> 决定自己的图表类型</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Series implements Serializable {
    private static final long serialVersionUID = 1L;

}
