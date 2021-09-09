package com.xmjz.echarts.nativebean.option.treeSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.leaves">https://echarts.apache.org/v4/zh/option.html#series-tree.leaves</a>
 * <br/>序号: 28
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>叶子节点的特殊配置，如上面的树图实例中，叶子节点和非叶子节点的标签位置不同。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Leaves implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.leaves.label">https://echarts.apache.org/v4/zh/option.html#series-tree.leaves.label</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>描述了叶子节点所对应的文本标签的样式。</p>
     */
    private Object label;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.leaves.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-tree.leaves.itemStyle</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>树图中叶子节点的样式。</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-tree.leaves.emphasis">https://echarts.apache.org/v4/zh/option.html#series-tree.leaves.emphasis</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>叶子节点高亮的样式。</p>
     */
    private Object emphasis;
}
