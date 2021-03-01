package com.xmjz.echarts.nativebean.option.toolbox;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#toolbox.feature">https://echarts.apache.org/zh/option.html#toolbox.feature</a>
 * <br/>序号: 7
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>各工具配置项。</p>
 * <p>除了各个内置的工具按钮外，还可以自定义工具按钮。</p>
 * <p>注意，自定义的工具名字，只能以 <code class="codespan">my</code> 开头，例如下例中的 <code class="codespan">myTool1</code>，<code class="codespan">myTool2</code>：</p>
 * <pre><code class="lang-javascript hljs">{
 *     <span class="hljs-attr">toolbox</span>: {
 *         <span class="hljs-attr">feature</span>: {
 *             <span class="hljs-attr">myTool1</span>: {
 *                 <span class="hljs-attr">show</span>: <span class="hljs-literal">true</span>,
 *                 <span class="hljs-attr">title</span>: <span class="hljs-string">'自定义扩展方法1'</span>,
 *                 <span class="hljs-attr">icon</span>: <span class="hljs-string">'path://M432.45,595.444c0,2.177-4.661,6.82-11.305,6.82c-6.475,0-11.306-4.567-11.306-6.82s4.852-6.812,11.306-6.812C427.841,588.632,432.452,593.191,432.45,595.444L432.45,595.444z M421.155,589.876c-3.009,0-5.448,2.495-5.448,5.572s2.439,5.572,5.448,5.572c3.01,0,5.449-2.495,5.449-5.572C426.604,592.371,424.165,589.876,421.155,589.876L421.155,589.876z M421.146,591.891c-1.916,0-3.47,1.589-3.47,3.549c0,1.959,1.554,3.548,3.47,3.548s3.469-1.589,3.469-3.548C424.614,593.479,423.062,591.891,421.146,591.891L421.146,591.891zM421.146,591.891'</span>,
 *                 <span class="hljs-attr">onclick</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params"></span>)</span>{
 *                     alert(<span class="hljs-string">'myToolHandler1'</span>)
 *                 }
 *             },
 *             <span class="hljs-attr">myTool2</span>: {
 *                 <span class="hljs-attr">show</span>: <span class="hljs-literal">true</span>,
 *                 <span class="hljs-attr">title</span>: <span class="hljs-string">'自定义扩展方法'</span>,
 *                 <span class="hljs-attr">icon</span>: <span class="hljs-string">'image://http://echarts.baidu.com/images/favicon.png'</span>,
 *                 <span class="hljs-attr">onclick</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params"></span>)</span>{
 *                     alert(<span class="hljs-string">'myToolHandler2'</span>)
 *                 }
 *             }
 *         }
 *     }
 * }
 * </code></pre>
 *
 * @author auto
 * @date 2021-03-02
 */
@Getter
@Setter
@Accessors(chain = true)
public class Feature implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#toolbox.feature.saveAsImage
     * <br/>序号: 1
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>保存为图片。</p>
     */
    private Object saveAsImage;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#toolbox.feature.restore
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>配置项还原。</p>
     */
    private Object restore;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#toolbox.feature.dataView
     * <br/>序号: 3
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>数据视图工具，可以展现当前图表所用的数据，编辑后可以动态更新。</p>
     */
    private Object dataView;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#toolbox.feature.dataZoom
     * <br/>序号: 4
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>数据区域缩放。目前只支持直角坐标系的缩放。</p>
     */
    private Object dataZoom;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#toolbox.feature.magicType
     * <br/>序号: 5
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>动态类型切换
     * <strong>示例：</strong></p>
     * <pre><code class="lang-js hljs javascript">feature: {
     *     <span class="hljs-attr">magicType</span>: {
     *         <span class="hljs-attr">type</span>: [<span class="hljs-string">'line'</span>, <span class="hljs-string">'bar'</span>, <span class="hljs-string">'stack'</span>, <span class="hljs-string">'tiled'</span>]
     *     }
     * }
     * </code></pre>
     */
    private Object magicType;
    /**
     * 官方文档: https://echarts.apache.org/zh/option.html#toolbox.feature.brush
     * <br/>序号: 6
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>选框组件的控制按钮。</p>
     * <p>也可以不在这里指定，而是在 <a href="#brush.toolbox">brush.toolbox</a> 中指定。</p>
     */
    private Object brush;
}
