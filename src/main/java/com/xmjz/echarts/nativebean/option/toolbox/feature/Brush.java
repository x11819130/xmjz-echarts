package com.xmjz.echarts.nativebean.option.toolbox.feature;

import com.xmjz.echarts.BaseEcharts;
import com.xmjz.echarts.nativebean.option.toolbox.feature.brush.Icon;
import com.xmjz.echarts.nativebean.option.toolbox.feature.brush.Title;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.brush">#toolbox.feature.brush</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>选框组件的控制按钮。</p>
 * <p>也可以不在这里指定，而是在 <a href="https://echarts.apache.org/zh/option.html#brush.toolbox">brush.toolbox</a> 中指定。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Brush extends BaseEcharts implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.brush.type">#toolbox.feature.brush.type</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>使用的按钮，取值：</p>
     * <ul>
     * <li><code class="codespan">'rect'</code>：开启矩形选框选择功能。</li>
     * <li><code class="codespan">'polygon'</code>：开启任意形状选框选择功能。</li>
     * <li><code class="codespan">'lineX'</code>：开启横向选择功能。</li>
     * <li><code class="codespan">'lineY'</code>：开启纵向选择功能。</li>
     * <li><code class="codespan">'keep'</code>：切换『单选』和『多选』模式。后者可支持同时画多个选框。前者支持单击清除所有选框。</li>
     * <li><code class="codespan">'clear'</code>：清空所有选框。</li>
     * </ul>
     */
    private List<?> type;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.brush.icon">#toolbox.feature.brush.icon</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>每个按钮的 icon path。</p>
     */
    private Icon icon;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature.brush.title">#toolbox.feature.brush.title</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>标题文本。</p>
     */
    private Title title;
}
