package com.xmjz.echarts.nativebean.option.treemapSeries;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb">https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb</a>
 * <br/>序号: 31
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>面包屑，能够显示当前节点的路径。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Breadcrumb implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.show">https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.show</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示面包屑。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.left">https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.left</a>
     * <br/>序号: 2
     * <br/>默认值: center
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>asdf 组件离容器左侧的距离。</p>
     * <p><code class="codespan">left</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>。</p>
     * <p>如果 <code class="codespan">left</code> 的值为<code class="codespan">'left'</code>, <code class="codespan">'center'</code>, <code class="codespan">'right'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object left;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.top">https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.top</a>
     * <br/>序号: 3
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>asdf 组件离容器上侧的距离。</p>
     * <p><code class="codespan">top</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比，也可以是 <code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>。</p>
     * <p>如果 <code class="codespan">top</code> 的值为<code class="codespan">'top'</code>, <code class="codespan">'middle'</code>, <code class="codespan">'bottom'</code>，组件会根据相应的位置自动对齐。</p>
     */
    private Object top;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.right">https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.right</a>
     * <br/>序号: 4
     * <br/>默认值: auto
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>asdf 组件离容器右侧的距离。</p>
     * <p><code class="codespan">right</code> 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object right;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.bottom">https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.bottom</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>asdf 组件离容器下侧的距离。</p>
     * <p>bottom 的值可以是像 <code class="codespan">20</code> 这样的具体像素值，可以是像 <code class="codespan">'20%'</code> 这样相对于容器高宽的百分比。</p>
     * <p>默认自适应。</p>
     */
    private Object bottom;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.height">https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.height</a>
     * <br/>序号: 6
     * <br/>默认值: 22
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>面包屑的高度。</p>
     */
    private Integer height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.emptyItemWidth">https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.emptyItemWidth</a>
     * <br/>序号: 7
     * <br/>默认值: 25
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>当面包屑没有内容时候，设个最小宽度。</p>
     */
    private Integer emptyItemWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.itemStyle">https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.itemStyle</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p> 图形样式。</p>
     */
    private Object itemStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.emphasis">https://echarts.apache.org/v4/zh/option.html#series-treemap.breadcrumb.emphasis</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["any"]
     * <br/>描述:
     */
    private Object emphasis;
}
