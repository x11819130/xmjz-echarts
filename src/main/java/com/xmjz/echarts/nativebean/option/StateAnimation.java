package com.xmjz.echarts.nativebean.option;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#stateAnimation">https://echarts.apache.org/zh/option.html#stateAnimation</a>
 * <br/>序号: 38
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>状态切换的动画配置，支持在每个系列里设置单独针对该系列的配置。</p>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class StateAnimation implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#stateAnimation.duration
     * <br/>序号: 1
     * <br/>默认值: 300
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>状态切换的动画时长，设为 0 则关闭状态动画。</p>
     */
    private Integer duration;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#stateAnimation.easing
     * <br/>序号: 2
     * <br/>默认值: cubicOut
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>状态切换的动画缓动。</p>
     */
    private String easing;
}
