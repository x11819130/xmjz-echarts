package com.xmjz.echarts.nativebean.option.visualMap.continuousVisualMap;

import com.xmjz.echarts.BaseEcharts;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-continuous.controller">#visualMap-continuous.controller</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>visualMap 组件中，<code class="codespan">控制器</code> 的 <code class="codespan">inRange</code> <code class="codespan">outOfRange</code> 设置。如果没有这个 <code class="codespan">controller</code> 设置，<code class="codespan">控制器</code> 会使用外层的 <code class="codespan">inRange</code> <code class="codespan">outOfRange</code> 设置；如果有这个 <code class="codespan">controller</code> 设置，则会采用这个设置。适用于一些控制器视觉效果需要特殊定制或调整的场景。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Controller extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-continuous.controller.inRange">#visualMap-continuous.controller.inRange</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>定义 <strong>在选中范围中</strong> 的视觉元素。（用户可以和 visualMap 组件交互，用鼠标或触摸选择范围）</p>
     * <p>配置参考 <a href="https://echarts.apache.org/zh/option.html#visualMap-continuous.inRange">visualMap-continuous.inRange</a></p>
     */
    private Object inRange;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#visualMap-continuous.controller.outOfRange">#visualMap-continuous.controller.outOfRange</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>定义 <strong>在选中范围外</strong> 的视觉元素。（用户可以和 visualMap 组件交互，用鼠标或触摸选择范围）</p>
     * <p>配置参考 <a href="https://echarts.apache.org/zh/option.html#visualMap-continuous.inRange">visualMap-continuous.inRange</a></p>
     */
    private Object outOfRange;
}
