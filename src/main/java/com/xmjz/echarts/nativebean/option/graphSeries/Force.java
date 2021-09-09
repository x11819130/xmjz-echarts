package com.xmjz.echarts.nativebean.option.graphSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.force">https://echarts.apache.org/zh/option.html#series-graph.force</a>
 * <br/>序号: 15
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>力引导布局相关的配置项，力引导布局是模拟弹簧电荷模型在每两个节点之间添加一个斥力，每条边的两个节点之间添加一个引力，每次迭代节点会在各个斥力和引力的作用下移动位置，多次迭代后节点会静止在一个受力平衡的位置，达到整个模型的能量最小化。</p>
 * <p>力引导布局的结果有良好的对称性和局部聚合性，也比较美观。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Force implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.force.initLayout">https://echarts.apache.org/zh/option.html#series-graph.force.initLayout</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>进行力引导布局前的初始化布局，初始化布局会影响到力引导的效果。</p>
     * <p>默认不进行任何布局，使用<a href="#series-graph.data">节点</a>中提供的 <a href="#series-graph.data.x">x</a>， <a href="#series-graph.data.y">y</a> 作为节点的位置。如果不存在的话会随机生成一个位置。</p>
     * <p>也可以选择使用环形布局 <code class="codespan">'circular'</code>。</p>
     */
    private String initLayout;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.force.repulsion">https://echarts.apache.org/zh/option.html#series-graph.force.repulsion</a>
     * <br/>序号: 2
     * <br/>默认值: 50
     * <br/>js类型: ["Array","number"]
     * <br/>描述:
     * <p>节点之间的斥力因子。</p>
     * <p>支持设置成数组表达斥力的范围，此时不同大小的值会线性映射到不同的斥力。值越大则斥力越大</p>
     */
    private Object repulsion;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.force.gravity">https://echarts.apache.org/zh/option.html#series-graph.force.gravity</a>
     * <br/>序号: 3
     * <br/>默认值: 0.1
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>节点受到的向中心的引力因子。该值越大节点越往中心点靠拢。</p>
     */
    private Integer gravity;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.force.edgeLength">https://echarts.apache.org/zh/option.html#series-graph.force.edgeLength</a>
     * <br/>序号: 4
     * <br/>默认值: 30
     * <br/>js类型: ["Array","number"]
     * <br/>描述:
     * <p>边的两个节点之间的距离，这个距离也会受 <a href="#series-graph.force.repulsion">repulsion</a>。</p>
     * <p>支持设置成数组表达边长的范围，此时不同大小的值会线性映射到不同的长度。值越小则长度越长。如下示例</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 值最大的边长度会趋向于 10，值最小的边长度会趋向于 50</span>
     * <span class="hljs-attr">edgeLength</span>: [<span class="hljs-number">10</span>, <span class="hljs-number">50</span>]
     * </code></pre>
     */
    private Object edgeLength;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.force.layoutAnimation">https://echarts.apache.org/zh/option.html#series-graph.force.layoutAnimation</a>
     * <br/>序号: 5
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>因为力引导布局会在多次迭代后才会稳定，这个参数决定是否显示布局的迭代动画，在浏览器端节点数据较多（&gt;100）的时候不建议关闭，布局过程会造成浏览器假死。</p>
     */
    private Boolean layoutAnimation;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#series-graph.force.friction">https://echarts.apache.org/zh/option.html#series-graph.force.friction</a>
     * <br/>序号: 6
     * <br/>默认值: 0.6
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v4.5.0</code> 开始支持</p>
     * </blockquote>
     * <p>这个参数能减缓节点的移动速度。取值范围 0 到 1。</p>
     * <p>但是仍然是个试验性的参数，参见 <a href="https://github.com/apache/echarts/issues/11024" target="_blank">#11024</a>。</p>
     */
    private Integer friction;
}
