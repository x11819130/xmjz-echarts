package com.xmjz.echarts.nativebean.option;

import com.xmjz.echarts.nativebean.option.dataset.Transform;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset">https://echarts.apache.org/zh/option.html#dataset</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>ECharts 4 开始支持了 <code class="codespan">数据集</code>（<code class="codespan">dataset</code>）组件用于单独的数据集声明，从而数据可以单独管理，被多个组件复用，并且可以自由指定数据到视觉的映射。这在不少场景下能带来使用上的方便。</p>
 * <p>关于 <code class="codespan">dataset</code> 的详情，请参见<a href="https://echarts.apache.org/handbook/zh/concepts/dataset" target="_blank">教程</a>。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Dataset implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.id">https://echarts.apache.org/zh/option.html#dataset.id</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件。</p>
     */
    private String id;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.source">https://echarts.apache.org/zh/option.html#dataset.source</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array","Object"]
     * <br/>描述:
     * <p>原始数据。一般来说，原始数据表达的是二维表。可以用如下这些格式表达二维表：</p>
     * <p>二维数组，其中第一行/列可以给出 <a href="#dataset.dimensions">维度名</a>，也可以不给出，直接就是数据：</p>
     * <pre><code class="lang-ts hljs typescript">[
     *     [<span class="hljs-string">'product'</span>, <span class="hljs-string">'2015'</span>, <span class="hljs-string">'2016'</span>, <span class="hljs-string">'2017'</span>],
     *     [<span class="hljs-string">'Matcha Latte'</span>, <span class="hljs-number">43.3</span>, <span class="hljs-number">85.8</span>, <span class="hljs-number">93.7</span>],
     *     [<span class="hljs-string">'Milk Tea'</span>, <span class="hljs-number">83.1</span>, <span class="hljs-number">73.4</span>, <span class="hljs-number">55.1</span>],
     *     [<span class="hljs-string">'Cheese Cocoa'</span>, <span class="hljs-number">86.4</span>, <span class="hljs-number">65.2</span>, <span class="hljs-number">82.5</span>],
     *     [<span class="hljs-string">'Walnut Brownie'</span>, <span class="hljs-number">72.4</span>, <span class="hljs-number">53.9</span>, <span class="hljs-number">39.1</span>]
     * ]
     * </code></pre>
     * <p>按行的 key-value 形式（对象数组），其中键（key）表明了 <a href="#dataset.dimensions">维度名</a>：</p>
     * <pre><code class="lang-ts hljs typescript">[
     *     {product: <span class="hljs-string">'Matcha Latte'</span>, count: <span class="hljs-number">823</span>, score: <span class="hljs-number">95.8</span>},
     *     {product: <span class="hljs-string">'Milk Tea'</span>, count: <span class="hljs-number">235</span>, score: <span class="hljs-number">81.4</span>},
     *     {product: <span class="hljs-string">'Cheese Cocoa'</span>, count: <span class="hljs-number">1042</span>, score: <span class="hljs-number">91.2</span>},
     *     {product: <span class="hljs-string">'Walnut Brownie'</span>, count: <span class="hljs-number">988</span>, score: <span class="hljs-number">76.9</span>}
     * ]
     * </code></pre>
     * <p>按列的 key-value 形式，每一项表示二维表的 “一列”：</p>
     * <pre><code class="lang-ts hljs typescript">{
     *     <span class="hljs-string">'product'</span>: [<span class="hljs-string">'Matcha Latte'</span>, <span class="hljs-string">'Milk Tea'</span>, <span class="hljs-string">'Cheese Cocoa'</span>, <span class="hljs-string">'Walnut Brownie'</span>],
     *     <span class="hljs-string">'count'</span>: [<span class="hljs-number">823</span>, <span class="hljs-number">235</span>, <span class="hljs-number">1042</span>, <span class="hljs-number">988</span>],
     *     <span class="hljs-string">'score'</span>: [<span class="hljs-number">95.8</span>, <span class="hljs-number">81.4</span>, <span class="hljs-number">91.2</span>, <span class="hljs-number">76.9</span>]
     * }
     * </code></pre>
     * <p>关于 <code class="codespan">dataset</code> 的详情，请参见<a href="https://echarts.apache.org/handbook/zh/concepts/dataset" target="_blank">教程</a>。</p>
     */
    private Object source;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.dimensions">https://echarts.apache.org/zh/option.html#dataset.dimensions</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>使用 dimensions 定义 <code class="codespan">series.data</code> 或者 <code class="codespan">dataset.source</code> 的每个维度的信息。</p>
     * <p>注意：如果使用了 <a href="#dataset">dataset</a>，那么可以在 <a href="#dataset.dimensions">dataset.dimensions</a> 中定义 dimension ，或者在 <a href="#dataset.source">dataset.source</a> 的第一行/列中给出 dimension 名称。于是就不用在这里指定 dimension。但如果在这里指定了 <code class="codespan">dimensions</code>，那么优先使用这里的。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">option = {
     *     dataset: {
     *         source: [
     *             <span class="hljs-comment">// 有了上面 dimensions 定义后，下面这五个维度的名称分别为：</span>
     *             <span class="hljs-comment">// 'date', 'open', 'close', 'highest', 'lowest'</span>
     *             [<span class="hljs-number">12</span>, <span class="hljs-number">44</span>, <span class="hljs-number">55</span>, <span class="hljs-number">66</span>, <span class="hljs-number">2</span>],
     *             [<span class="hljs-number">23</span>, <span class="hljs-number">6</span>, <span class="hljs-number">16</span>, <span class="hljs-number">23</span>, <span class="hljs-number">1</span>],
     *             ...
     *         ]
     *     },
     *     series: {
     *         <span class="hljs-keyword">type</span>: <span class="hljs-string">'xxx'</span>,
     *         <span class="hljs-comment">// 定义了每个维度的名称。这个名称会被显示到默认的 tooltip 中。</span>
     *         dimensions: [<span class="hljs-string">'date'</span>, <span class="hljs-string">'open'</span>, <span class="hljs-string">'close'</span>, <span class="hljs-string">'highest'</span>, <span class="hljs-string">'lowest'</span>]
     *     }
     * }
     * </code></pre>
     * <pre><code class="lang-ts hljs typescript">series: {
     *     <span class="hljs-keyword">type</span>: <span class="hljs-string">'xxx'</span>,
     *     dimensions: [
     *         <span class="hljs-literal">null</span>,                <span class="hljs-comment">// 如果此维度不想给出定义，则使用 null 即可</span>
     *         {<span class="hljs-keyword">type</span>: <span class="hljs-string">'ordinal'</span>},   <span class="hljs-comment">// 只定义此维度的类型。</span>
     *                              <span class="hljs-comment">// 'ordinal' 表示离散型，一般文本使用这种类型。</span>
     *                              <span class="hljs-comment">// 如果类型没有被定义，会自动猜测类型。</span>
     *         {name: <span class="hljs-string">'good'</span>, <span class="hljs-keyword">type</span>: <span class="hljs-string">'number'</span>},
     *         <span class="hljs-string">'bad'</span>                <span class="hljs-comment">// 等同于 {name: 'bad'}</span>
     *     ]
     * }
     * </code></pre>
     * <p><code class="codespan">dimensions</code> 数组中的每一项可以是：</p>
     * <ul>
     * <li><code class="codespan">string</code>，如 <code class="codespan">'someName'</code>，等同于 <code class="codespan">{name: 'someName'}</code></li>
     * <li><code class="codespan">Object</code>，属性可以有：<ul>
     * <li>name: <code class="codespan">string</code>。</li>
     * <li>type: <code class="codespan">string</code>，支持<ul>
     * <li><code class="codespan">number</code>，默认，表示普通数据。</li>
     * <li><code class="codespan">ordinal</code>，对于类目、文本这些 string 类型的数据，如果需要能在数轴上使用，须是 'ordinal' 类型。ECharts 默认会自动判断这个类型。但是自动判断也是不可能很完备的，所以使用者也可以手动强制指定。</li>
     * <li><code class="codespan">float</code>，即 <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array" target="_blank">Float64Array</a>。</li>
     * <li><code class="codespan">int</code>，即 <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array" target="_blank">Int32Array</a>。</li>
     * <li><code class="codespan">time</code>，表示时间类型。设置成 'time' 则能支持自动解析数据成时间戳（timestamp），比如该维度的数据是 '2017-05-10'，会自动被解析。时间类型的支持参见 <a href="#series.data">data</a>。</li>
     * </ul>
     * </li>
     * <li>displayName: 一般用于 tooltip 中维度名的展示。<code class="codespan">string</code> 如果没有指定，默认使用 name 来展示。</li>
     * </ul>
     * </li>
     * </ul>
     * <p>值得一提的是，当定义了 <code class="codespan">dimensions</code> 后，默认 <code class="codespan">tooltip</code> 中对个维度的显示，会变为『竖排』，从而方便显示每个维度的名称。如果没有定义 <code class="codespan">dimensions</code>，则默认 <code class="codespan">tooltip</code> 会横排显示，且只显示数值没有维度名称可显示。</p>
     */
    private List<?> dimensions;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.sourceHeader">https://echarts.apache.org/zh/option.html#dataset.sourceHeader</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean","number"]
     * <br/>描述:
     * <p><code class="codespan">dataset.source</code> 第一行/列是否是 <a href="#dataset.dimensions">维度名</a> 信息。可选值：</p>
     * <ul>
     * <li><code class="codespan">null/undefined/'auto'</code>：默认，自动探测。</li>
     * <li><code class="codespan">true</code>：第一行/列是维度名信息。</li>
     * <li><code class="codespan">false</code>：第一行/列直接开始是数据。</li>
     * <li><code class="codespan">number</code>: 维度名行/列数，也就是数据行/列的开始索引。例如：<code class="codespan">sourceHeader: 2</code> 意味着前两行/列为维度名，从第三行/列开始为数据。 </li>
     * </ul>
     * <p>注意：“第一行/列” 的意思是，如果 <a href="#series.seriesLayoutBy">series.seriesLayoutBy</a> 设置为 <code class="codespan">'column'</code>（默认值），则取第一行，如果 <code class="codespan">series.seriesLayoutBy</code> 设置为 <code class="codespan">'row'</code>，则取第一列。</p>
     */
    private Object sourceHeader;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.transform">https://echarts.apache.org/zh/option.html#dataset.transform</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Array"]
     * <br/>描述:
     * <p>参见 <a href="https://echarts.apache.org/handbook/zh/concepts/data-transform" target="_blank">数据变换教程</a></p>
     */
    private List<Transform> transform;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.fromDatasetIndex">https://echarts.apache.org/zh/option.html#dataset.fromDatasetIndex</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>指定 <a href="#dataset.transform">dataset.transform</a> 以哪个 dataset 作为输入。如果 <a href="#dataset.transform">dataset.transform</a> 被指定了，但是 <code class="codespan">fromDatasetIndex</code> 和 <code class="codespan">fromDatasetId</code> 都没有被指定，那么默认会使用 <code class="codespan">fromDatasetIndex: 0</code>.</p>
     * <p>参见 <a href="https://echarts.apache.org/handbook/zh/concepts/data-transform" target="_blank">数据变换教程</a></p>
     */
    private Integer fromDatasetIndex;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.fromDatasetId">https://echarts.apache.org/zh/option.html#dataset.fromDatasetId</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>指定 <a href="#dataset.transform">dataset.transform</a> 以哪个 dataset 作为输入。</p>
     * <p>参见 <a href="https://echarts.apache.org/handbook/zh/concepts/data-transform" target="_blank">数据变换教程</a></p>
     */
    private String fromDatasetId;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#dataset.fromTransformResult">https://echarts.apache.org/zh/option.html#dataset.fromTransformResult</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>如果一个 <a href="#dataset.transform">dataset.transform</a> 会产出多个结果 data ，我们可以使用 <code class="codespan">fromTransformResult</code> 获得特定的结果。</p>
     * <p>大多数场景下，transform 只会产出一个结果，所以大多数情况下 <code class="codespan">fromTransformResult</code> 并不需要指定。当不指定 <code class="codespan">fromTransformResult</code> 时，默认使用 <code class="codespan">fromTransformResult: 0</code>。</p>
     * <p>参见 <a href="https://echarts.apache.org/handbook/zh/concepts/data-transform" target="_blank">数据变换教程</a></p>
     */
    private Integer fromTransformResult;
}
