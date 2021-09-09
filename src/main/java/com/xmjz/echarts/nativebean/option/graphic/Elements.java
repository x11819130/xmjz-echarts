package com.xmjz.echarts.nativebean.option.graphic;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements">https://echarts.apache.org/zh/option.html#graphic.elements</a>
 * <br/>序号: 2
 * <br/>默认值: 无
 * <br/>js类型: ["Array"]
 * <br/>描述:
 * <p>里面是所有图形元素的集合。</p>
 * <p>注意：graphic 的标准写法是：</p>
 * <pre><code class="lang-javascript hljs">{
 *     <span class="hljs-attr">graphic</span>: {
 *         <span class="hljs-attr">elements</span>: [
 *             {<span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>, ...}, {<span class="hljs-attr">type</span>: <span class="hljs-string">'circle'</span>, ...}, ...
 *         ]
 *     }
 * }
 * </code></pre>
 * <p>但是我们常常可以用简写：</p>
 * <pre><code class="lang-javascript hljs">{
 *     <span class="hljs-attr">graphic</span>: {
 *         <span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>,
 *         ...
 *     }
 * }
 * </code></pre>
 * <p>或者：</p>
 * <pre><code class="lang-javascript hljs">{
 *     <span class="hljs-attr">graphic</span>: [
 *         {<span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>, ...}, {<span class="hljs-attr">type</span>: <span class="hljs-string">'circle'</span>, ...}, ...
 *     ]
 * }
 * </code></pre>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Elements implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements-group">https://echarts.apache.org/zh/option.html#graphic.elements-group</a>
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>group 是唯一的可以有子节点的容器。group 可以用来整体定位一组图形元素。</p>
     */
    private Object elements_group;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements-image">https://echarts.apache.org/zh/option.html#graphic.elements-image</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     */
    private Object elements_image;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements-text">https://echarts.apache.org/zh/option.html#graphic.elements-text</a>
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>文本块。</p>
     */
    private Object elements_text;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements-rect">https://echarts.apache.org/zh/option.html#graphic.elements-rect</a>
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>矩形。</p>
     */
    private Object elements_rect;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements-circle">https://echarts.apache.org/zh/option.html#graphic.elements-circle</a>
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>圆。</p>
     */
    private Object elements_circle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements-ring">https://echarts.apache.org/zh/option.html#graphic.elements-ring</a>
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>圆环。</p>
     */
    private Object elements_ring;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements-sector">https://echarts.apache.org/zh/option.html#graphic.elements-sector</a>
     * <br/>序号: 7
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>扇形。</p>
     */
    private Object elements_sector;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements-arc">https://echarts.apache.org/zh/option.html#graphic.elements-arc</a>
     * <br/>序号: 8
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>圆弧。</p>
     */
    private Object elements_arc;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements-polygon">https://echarts.apache.org/zh/option.html#graphic.elements-polygon</a>
     * <br/>序号: 9
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>多边形。</p>
     */
    private Object elements_polygon;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements-polyline">https://echarts.apache.org/zh/option.html#graphic.elements-polyline</a>
     * <br/>序号: 10
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>折线。</p>
     */
    private Object elements_polyline;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements-line">https://echarts.apache.org/zh/option.html#graphic.elements-line</a>
     * <br/>序号: 11
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>直线。</p>
     */
    private Object elements_line;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements-bezierCurve">https://echarts.apache.org/zh/option.html#graphic.elements-bezierCurve</a>
     * <br/>序号: 12
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>二次或三次贝塞尔曲线。</p>
     */
    private Object elements_bezierCurve;
}
