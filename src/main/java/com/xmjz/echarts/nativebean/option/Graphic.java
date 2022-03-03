package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.graphic.Elements;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic">https://echarts.apache.org/zh/option.html#graphic</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p><code class="codespan">graphic</code> 是原生图形元素组件。可以支持的图形元素包括：</p>
 * <p><a href="#graphic.elements-image">image</a>,
 * <a href="#graphic.elements-text">text</a>,
 * <a href="#graphic.elements-circle">circle</a>,
 * <a href="#graphic.elements-sector">sector</a>,
 * <a href="#graphic.elements-ring">ring</a>,
 * <a href="#graphic.elements-polygon">polygon</a>,
 * <a href="#graphic.elements-polyline">polyline</a>,
 * <a href="#graphic.elements-rect">rect</a>,
 * <a href="#graphic.elements-line">line</a>,
 * <a href="#graphic.elements-bezierCurve">bezierCurve</a>,
 * <a href="#graphic.elements-arc">arc</a>,
 * <a href="#graphic.elements-group">group</a>,</p>
 * <p>下面示例中，使用图形元素做了水印，和文本块：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-graphic&amp;edit=1&amp;reset=1" width="600" height="400" data-ll-timeout="27"></iframe>
 *
 *
 * <p>下面示例中，使用隐藏的图形元素实现了拖拽：</p>
 * <iframe data-src="https://echarts.apache.org/examples/zh/view.html?c=line-draggable&amp;edit=1&amp;reset=1" width="600" height="400" data-ll-timeout="28"></iframe>
 *
 *
 *
 * <p><strong>graphic 设置介绍</strong></p>
 * <p>只配一个图形元素时的简写方法：</p>
 * <pre><code class="lang-javascript hljs">myChart.setOption({
 *     ...,
 *     <span class="hljs-attr">graphic</span>: {
 *         <span class="hljs-attr">type</span>: <span class="hljs-string">'image'</span>,
 *         ...
 *     }
 * });
 * </code></pre>
 * <p>配多个图形元素：</p>
 * <pre><code class="lang-javascript hljs">myChart.setOption({
 *     ...,
 *     <span class="hljs-attr">graphic</span>: [
 *         { <span class="hljs-comment">// 一个图形元素，类型是 image。</span>
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'image'</span>,
 *             ...
 *         },
 *         { <span class="hljs-comment">// 一个图形元素，类型是 text，指定了 id。</span>
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'text'</span>,
 *             <span class="hljs-attr">id</span>: <span class="hljs-string">'text1'</span>,
 *             ...
 *         },
 *         { <span class="hljs-comment">// 一个图形元素，类型是 group，可以嵌套子节点。</span>
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'group'</span>,
 *             <span class="hljs-attr">children</span>: [
 *                 {
 *                     <span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>,
 *                     <span class="hljs-attr">id</span>: <span class="hljs-string">'rect1'</span>,
 *                     ...
 *                 },
 *                 {
 *                     <span class="hljs-attr">type</span>: <span class="hljs-string">'image'</span>,
 *                     ...
 *                 },
 *                 ...
 *             ]
 *         }
 *         ...
 *     ]
 * });
 *
 * </code></pre>
 * <p>使用 setOption 来删除或更换（替代）已有的图形元素：</p>
 * <pre><code class="lang-javascript hljs">myChart.setOption({
 *     ...,
 *     <span class="hljs-attr">graphic</span>: [
 *         { <span class="hljs-comment">// 删除上例中定义的 'text1' 元素。</span>
 *             <span class="hljs-attr">id</span>: <span class="hljs-string">'text1'</span>,
 *             <span class="hljs-attr">$action</span>: <span class="hljs-string">'remove'</span>,
 *             ...
 *         },
 *         { <span class="hljs-comment">// 将上例中定义的 'rect1' 元素换成 circle。</span>
 *           <span class="hljs-comment">// 注意尽管 'rect1' 在一个 group 中，但这里并不需要顾忌层级，用id指定就可以了。</span>
 *             <span class="hljs-attr">id</span>: <span class="hljs-string">'rect1'</span>,
 *             <span class="hljs-attr">$action</span>: <span class="hljs-string">'replace'</span>,
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'circle'</span>,
 *             ...
 *         }
 *     ]
 * });
 * </code></pre>
 * <p>注意，如果没有指定 id，第二次 setOption 时会按照元素在 option 中出现的顺序和已有的图形元素进行匹配。这有时会产生不易理解的效果。
 * 所以，一般来说，更新 elements 时推荐使用 id 进行准确的指定，而非省略 id。</p>
 * <p><strong>图形元素设置介绍</strong></p>
 * <p>介绍每个图形元素的配置。不同类型的图形元素的设置有这些共性：</p>
 * <pre><code class="lang-javascript hljs">{
 *     <span class="hljs-comment">// id 用于在更新图形元素时指定更新哪个图形元素，如果不需要用可以忽略。</span>
 *     <span class="hljs-attr">id</span>: <span class="hljs-string">'xxx'</span>,
 *
 *     <span class="hljs-comment">// 这个字段在第一次设置时不能忽略，取值见上方『支持的图形元素』。</span>
 *     <span class="hljs-attr">type</span>: <span class="hljs-string">'image'</span>,
 *
 *     <span class="hljs-comment">// 下面的各个属性如果不需要设置都可以忽略，忽略则取默认值。</span>
 *
 *     <span class="hljs-comment">// 指定本次 setOption 对此图形元素进行的操作。默认是 'merge'，还可以 'replace' 或 'remove'。</span>
 *     <span class="hljs-attr">$action</span>: <span class="hljs-string">'replace'</span>,
 *
 *     <span class="hljs-comment">// 这是四个相对于父元素的定位属性，每个属性可取『像素值』或者『百分比』或者 'center'/'middle'。</span>
 *     <span class="hljs-attr">left</span>: <span class="hljs-number">10</span>,
 *     <span class="hljs-comment">// right: 10,</span>
 *     <span class="hljs-attr">top</span>: <span class="hljs-string">'center'</span>,
 *     <span class="hljs-comment">// bottom: '10%',</span>
 *
 *     <span class="hljs-attr">shape</span>: {
 *         <span class="hljs-comment">// 定位、形状相关的设置，如 x, y, cx, cy, width, height, r, points 等。</span>
 *         <span class="hljs-comment">// 注意，如果设置了 left/right/top/bottom，这里的定位用的 x/y/cx/cy 会失效。</span>
 *     },
 *
 *     <span class="hljs-attr">style</span>: {
 *         <span class="hljs-comment">// 样式相关的设置，如 fill, stroke, lineWidth, shadowBlur 等。</span>
 *     },
 *
 *     <span class="hljs-comment">// 表示 z 高度，从而指定了图形元素的覆盖关系。</span>
 *     <span class="hljs-attr">z</span>: <span class="hljs-number">10</span>,
 *     <span class="hljs-comment">// 表示不响应事件。</span>
 *     <span class="hljs-attr">silent</span>: <span class="hljs-literal">true</span>,
 *     <span class="hljs-comment">// 表示节点不显示</span>
 *     <span class="hljs-attr">invisible</span>: <span class="hljs-literal">false</span>,
 *     <span class="hljs-comment">// 设置是否整体限制在父节点范围内。可选值：'raw', 'all'。</span>
 *     <span class="hljs-attr">bouding</span>: <span class="hljs-string">'raw'</span>,
 *     <span class="hljs-comment">// 是否可以被拖拽。</span>
 *     <span class="hljs-attr">draggable</span>: <span class="hljs-literal">false</span>,
 *     <span class="hljs-comment">// 事件的监听器，还可以是 onmousemove, ondrag 等。支持的事件参见下。</span>
 *     <span class="hljs-attr">onclick</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params"></span>) </span>{...}
 * }
 * </code></pre>
 * <p><strong>图形元素的事件</strong></p>
 * <p>支持这些事件配置：
 * <code class="codespan">onclick</code>, <code class="codespan">onmouseover</code>, <code class="codespan">onmouseout</code>, <code class="codespan">onmousemove</code>, <code class="codespan">onmousewheel</code>, <code class="codespan">onmousedown</code>, <code class="codespan">onmouseup</code>, <code class="codespan">ondrag</code>, <code class="codespan">ondragstart</code>, <code class="codespan">ondragend</code>, <code class="codespan">ondragenter</code>, <code class="codespan">ondragleave</code>, <code class="codespan">ondragover</code>, <code class="codespan">ondrop</code>。</p>
 * <p><strong>图形元素的层级关系</strong></p>
 * <p>只有 <code class="codespan">group</code> 元素可以有子节点，从而以该 <code class="codespan">group</code> 元素为根的元素树可以共同定位（共同移动）。</p>
 * <p><strong>图形元素的基本形状设置</strong></p>
 * <p>每个图形元素本身有自己的图形基本的位置和尺寸设置，例如：</p>
 * <pre><code class="lang-javascript hljs">{
 *     <span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>,
 *     <span class="hljs-attr">shape</span>: {
 *         <span class="hljs-attr">x</span>: <span class="hljs-number">10</span>,
 *         <span class="hljs-attr">y</span>: <span class="hljs-number">10</span>,
 *         <span class="hljs-attr">width</span>: <span class="hljs-number">100</span>,
 *         <span class="hljs-attr">height</span>: <span class="hljs-number">200</span>
 *     }
 * },
 * {
 *     <span class="hljs-attr">type</span>: <span class="hljs-string">'circle'</span>,
 *     <span class="hljs-attr">shape</span>: {
 *         <span class="hljs-attr">cx</span>: <span class="hljs-number">20</span>,
 *         <span class="hljs-attr">cy</span>: <span class="hljs-number">30</span>,
 *         <span class="hljs-attr">r</span>: <span class="hljs-number">100</span>
 *     }
 * },
 * {
 *     <span class="hljs-attr">type</span>: <span class="hljs-string">'image'</span>,
 *     <span class="hljs-attr">style</span>: {
 *         <span class="hljs-attr">image</span>: <span class="hljs-string">'http://xxx.xxx.xxx/a.png'</span>,
 *         <span class="hljs-attr">x</span>: <span class="hljs-number">100</span>,
 *         <span class="hljs-attr">y</span>: <span class="hljs-number">200</span>,
 *         <span class="hljs-attr">width</span>: <span class="hljs-number">230</span>,
 *         <span class="hljs-attr">height</span>: <span class="hljs-number">400</span>
 *     }
 * },
 * {
 *     <span class="hljs-attr">type</span>: <span class="hljs-string">'text'</span>,
 *     <span class="hljs-attr">style</span>: {
 *         <span class="hljs-attr">text</span>: <span class="hljs-string">'This text'</span>,
 *         <span class="hljs-attr">x</span>: <span class="hljs-number">100</span>,
 *         <span class="hljs-attr">y</span>: <span class="hljs-number">200</span>
 *     }
 *
 * }
 * </code></pre>
 * <p><strong>图形元素的定位和 transfrom</strong></p>
 * <p>除此以外，可以以 transform 的方式对图形进行平移、旋转、缩放，
 * 参见：<a href="#graphic.elements.position">position</a>、<a href="#graphic.elements.rotation">rotation</a>、<a href="#graphic.elements.scale">scale</a>、<a href="#graphic.elements.origin">origin</a>。</p>
 * <pre><code class="lang-javascript hljs">{
 *     <span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>,
 *     <span class="hljs-attr">position</span>: [<span class="hljs-number">100</span>, <span class="hljs-number">200</span>], <span class="hljs-comment">// 平移，默认值为 [0, 0]。</span>
 *     <span class="hljs-attr">scale</span>: [<span class="hljs-number">2</span>, <span class="hljs-number">4</span>], <span class="hljs-comment">// 缩放，默认值为 [1, 1]。表示缩放的倍数。</span>
 *     <span class="hljs-attr">rotation</span>: <span class="hljs-built_in">Math</span>.PI / <span class="hljs-number">4</span>, <span class="hljs-comment">// 旋转，默认值为 0。表示旋转的弧度值。正值表示逆时针旋转。</span>
 *     <span class="hljs-attr">origin</span>: [<span class="hljs-number">10</span>, <span class="hljs-number">20</span>], <span class="hljs-comment">// 旋转和缩放的中心点，默认值为 [0, 0]。</span>
 *     <span class="hljs-attr">shape</span>: {
 *         <span class="hljs-comment">// ...</span>
 *     }
 * }
 * </code></pre>
 * <p>每个图形元素在父节点的坐标系中进行 transform，也就是说父子节点的 transform 能『叠加』。</p>
 * <p>每个图形元素进行 transform 顺序是：</p>
 * <ol>
 * <li>平移 [-el.origin[0], -el.origin[1]]。</li>
 * <li>根据 el.scale 缩放。</li>
 * <li>根据 el.rotation 旋转。</li>
 * <li>根据 el.origin 平移。</li>
 * <li>根据 el.position 平移。</li>
 * </ol>
 * <p>也就是说先缩放旋转后平移，这样平移不会影响缩放旋转的 origin。</p>
 * <p><strong>图形元素相对定位</strong></p>
 * <p>以上两者是基本的绝对定位，除此之外，在实际应用中，容器尺寸常常是不确定甚至动态变化的，所以需要提供相对定位的机制。graphic 组件使用 <a href="#graphic.elements.left">left</a> / <a href="#graphic.elements.right">right</a> / <a href="#graphic.elements.top">top</a> / <a href="#graphic.elements.bottom">bottom</a> / <a href="#graphic.elements.width">width</a> / <a href="#graphic.elements.height">height</a> 提供了相对定位的机制。</p>
 * <p>例如：</p>
 * <pre><code class="lang-javascript hljs">{ <span class="hljs-comment">// 将图片定位到最下方的中间：</span>
 *     <span class="hljs-attr">type</span>: <span class="hljs-string">'image'</span>,
 *     <span class="hljs-attr">left</span>: <span class="hljs-string">'center'</span>, <span class="hljs-comment">// 水平定位到中间</span>
 *     <span class="hljs-attr">bottom</span>: <span class="hljs-string">'10%'</span>,  <span class="hljs-comment">// 定位到距离下边界 10% 处</span>
 *     <span class="hljs-attr">style</span>: {
 *         <span class="hljs-attr">image</span>: <span class="hljs-string">'http://xxx.xxx.xxx/a.png'</span>,
 *         <span class="hljs-attr">width</span>: <span class="hljs-number">45</span>,
 *         <span class="hljs-attr">height</span>: <span class="hljs-number">45</span>
 *     }
 * },
 * { <span class="hljs-comment">// 将旋转过的 group 整体定位右下角：</span>
 *     <span class="hljs-attr">type</span>: <span class="hljs-string">'group'</span>,
 *     <span class="hljs-attr">right</span>: <span class="hljs-number">0</span>,  <span class="hljs-comment">// 定位到右下角</span>
 *     <span class="hljs-attr">bottom</span>: <span class="hljs-number">0</span>, <span class="hljs-comment">// 定位到右下角</span>
 *     <span class="hljs-attr">rotation</span>: <span class="hljs-built_in">Math</span>.PI / <span class="hljs-number">4</span>,
 *     <span class="hljs-attr">children</span>: [
 *         {
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'rect'</span>,
 *             <span class="hljs-attr">left</span>: <span class="hljs-string">'center'</span>, <span class="hljs-comment">// 相对父元素居中</span>
 *             <span class="hljs-attr">top</span>: <span class="hljs-string">'middle'</span>,  <span class="hljs-comment">// 相对父元素居中</span>
 *             <span class="hljs-attr">shape</span>: {
 *                 <span class="hljs-attr">width</span>: <span class="hljs-number">190</span>,
 *                 <span class="hljs-attr">height</span>: <span class="hljs-number">90</span>
 *             },
 *             <span class="hljs-attr">style</span>: {
 *                 <span class="hljs-attr">fill</span>: <span class="hljs-string">'#fff'</span>,
 *                 <span class="hljs-attr">stroke</span>: <span class="hljs-string">'#999'</span>,
 *                 <span class="hljs-attr">lineWidth</span>: <span class="hljs-number">2</span>,
 *                 <span class="hljs-attr">shadowBlur</span>: <span class="hljs-number">8</span>,
 *                 <span class="hljs-attr">shadowOffsetX</span>: <span class="hljs-number">3</span>,
 *                 <span class="hljs-attr">shadowOffsetY</span>: <span class="hljs-number">3</span>,
 *                 <span class="hljs-attr">shadowColor</span>: <span class="hljs-string">'rgba(0,0,0,0.3)'</span>
 *             }
 *         },
 *         {
 *             <span class="hljs-attr">type</span>: <span class="hljs-string">'text'</span>,
 *             <span class="hljs-attr">left</span>: <span class="hljs-string">'center'</span>, <span class="hljs-comment">// 相对父元素居中</span>
 *             <span class="hljs-attr">top</span>: <span class="hljs-string">'middle'</span>,  <span class="hljs-comment">// 相对父元素居中</span>
 *             <span class="hljs-attr">style</span>: {
 *                 <span class="hljs-attr">fill</span>: <span class="hljs-string">'#777'</span>,
 *                 <span class="hljs-attr">text</span>: [
 *                     <span class="hljs-string">'This is text'</span>,
 *                     <span class="hljs-string">'这是一段文字'</span>,
 *                     <span class="hljs-string">'Print some text'</span>
 *                 ].join(<span class="hljs-string">'\n'</span>),
 *                 <span class="hljs-attr">font</span>: <span class="hljs-string">'14px Microsoft YaHei'</span>
 *             }
 *         }
 *     ]
 * }
 * </code></pre>
 * <p>注意，可以用 <a href="graphic.elements.bounding" target="_blank">bounding</a> 来设置是否整体限制在父节点范围内。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Graphic implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.id">https://echarts.apache.org/zh/option.html#graphic.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#graphic.elements">https://echarts.apache.org/zh/option.html#graphic.elements</a>
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
     */
    private List<Elements> elements;
}
