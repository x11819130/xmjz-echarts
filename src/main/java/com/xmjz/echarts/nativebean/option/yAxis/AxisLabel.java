package com.xmjz.echarts.nativebean.option.yAxis;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel">https://echarts.apache.org/zh/option.html#yAxis.axisLabel</a>
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>坐标轴刻度标签的相关设置。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class AxisLabel implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.show">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示刻度标签。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.interval">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.interval</a>
     * <br/>默认值: auto
     * <br/>js类型: ["number","Function"]
     * <br/>描述:
     * <p>坐标轴刻度标签的显示间隔，在类目轴中有效。</p>
     * <p>默认会采用标签不重叠的策略间隔显示标签。</p>
     * <p>可以设置成 0 强制显示所有标签。</p>
     * <p>如果设置为 <code class="codespan">1</code>，表示『隔一个标签显示一个标签』，如果值为 <code class="codespan">2</code>，表示隔两个标签显示一个标签，以此类推。</p>
     * <p>可以用数值表示间隔的数据，也可以通过回调函数控制。回调函数格式如下：</p>
     * <pre><code class="lang-js hljs javascript">(index:number, <span class="hljs-attr">value</span>: string) =&gt; boolean
     * </code></pre>
     * <p>第一个参数是类目的 index，第二个值是类目名称，如果跳过则返回 <code class="codespan">false</code>。</p>
     */
    private Object interval;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.inside">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.inside</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>刻度标签是否朝内，默认朝外。</p>
     */
    private Boolean inside;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.rotate">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.rotate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>刻度标签旋转的角度，在类目轴的类目标签显示不下的时候可以通过旋转防止标签之间重叠。</p>
     * <p>旋转的角度从 -90 度到 90 度。</p>
     */
    private Integer rotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.margin">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.margin</a>
     * <br/>默认值: 8
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>刻度标签与轴线之间的距离。</p>
     */
    private Integer margin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.formatter">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.formatter</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>刻度标签的内容格式器，支持字符串模板和回调函数两种形式。</p>
     * <p>示例:</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 使用字符串模板，模板变量为刻度默认标签 {value}</span>
     * <span class="hljs-attr">formatter</span>: <span class="hljs-string">'{value} kg'</span>
     * <span class="hljs-comment">// 使用函数模板，函数参数分别为刻度数值（类目），刻度的索引</span>
     * <span class="hljs-attr">formatter</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value, index</span>) </span>{
     *     <span class="hljs-keyword">return</span> value + <span class="hljs-string">'kg'</span>;
     * }
     * </code></pre>
     * <hr>
     * <p>对于时间轴（<a href="#.type">type</a>: <code class="codespan">'time'</code>），<code class="codespan">formatter</code> 的字符串模板支持多种形式：</p>
     * <ul>
     * <li><strong>字符串模板</strong>：简单快速实现常用日期时间模板，<code class="codespan">string</code> 类型</li>
     * <li><strong>回调函数</strong>：自定义 formatter，可以用来实现复杂高级的格式，<code class="codespan">Function</code> 类型</li>
     * <li><strong>分级模板</strong>：为不同时间粒度的标签使用不同的 formatter，<code class="codespan">object</code> 类型</li>
     * </ul>
     * <p>下面我们分别介绍这三种形式。</p>
     * <p><strong> 字符串模板 </strong></p>
     * <p>使用字符串模板是一种方便实现常用日期时间格式化方式的形式。如果字符串模板可以实现你的效果，那我们优先推荐使用此方式；如果无法实现，再考虑其他两种更复杂的方式。支持的模板如下：</p>
     * <table>
     * <thead>
     * <tr>
     * <th>分类</th>
     * <th>模板</th>
     * <th>取值（英文）</th>
     * <th>取值（中文）</th>
     * </tr>
     * </thead>
     * <tbody>
     * <tr>
     * <td>Year</td>
     * <td>{yyyy}</td>
     * <td>e.g., 2020, 2021, ...</td>
     * <td>例：2020, 2021, ...</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{yy}</td>
     * <td>00-99</td>
     * <td>00-99</td>
     * </tr>
     * <tr>
     * <td>Quarter</td>
     * <td>{Q}</td>
     * <td>1, 2, 3, 4</td>
     * <td>1, 2, 3, 4</td>
     * </tr>
     * <tr>
     * <td>Month</td>
     * <td>{MMMM}</td>
     * <td>e.g., January, February, ...</td>
     * <td>一月、二月、……</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{MMM}</td>
     * <td>e.g., Jan, Feb, ...</td>
     * <td>1月、2月、……</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{MM}</td>
     * <td>01-12</td>
     * <td>01-12</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{M}</td>
     * <td>1-12</td>
     * <td>1-12</td>
     * </tr>
     * <tr>
     * <td>Day of Month</td>
     * <td>{dd}</td>
     * <td>01-31</td>
     * <td>01-31</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{d}</td>
     * <td>1-31</td>
     * <td>1-31</td>
     * </tr>
     * <tr>
     * <td>Day of Week</td>
     * <td>{eeee}</td>
     * <td>Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday</td>
     * <td>星期日、星期一、星期二、星期三、星期四、星期五、星期六</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{ee}</td>
     * <td>Sun, Mon, Tues, Wed, Thu, Fri, Sat</td>
     * <td>日、一、二、三、四、五、六</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{e}</td>
     * <td>1-54</td>
     * <td>1-54</td>
     * </tr>
     * <tr>
     * <td>Hour</td>
     * <td>{HH}</td>
     * <td>00-23</td>
     * <td>00-23</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{H}</td>
     * <td>0-23</td>
     * <td>0-23</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{hh}</td>
     * <td>01-12</td>
     * <td>01-12</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{h}</td>
     * <td>1-12</td>
     * <td>1-12</td>
     * </tr>
     * <tr>
     * <td>Minute</td>
     * <td>{mm}</td>
     * <td>00-59</td>
     * <td>00-59</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{m}</td>
     * <td>0-59</td>
     * <td>0-59</td>
     * </tr>
     * <tr>
     * <td>Second</td>
     * <td>{ss}</td>
     * <td>00-59</td>
     * <td>00-59</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{s}</td>
     * <td>0-59</td>
     * <td>0-59</td>
     * </tr>
     * <tr>
     * <td>Millisecond</td>
     * <td>{SSS}</td>
     * <td>000-999</td>
     * <td>000-999</td>
     * </tr>
     * <tr>
     * <td></td>
     * <td>{S}</td>
     * <td>0-999</td>
     * <td>0-999</td>
     * </tr>
     * </tbody>
     * </table>
     * <blockquote>
     * <p>其他语言请参考相应<a href="https://github.com/apache/echarts/tree/master/src/i18n" target="_blank">语言包</a>中的定义，语言包可以通过 <a href="api.html#echarts.registerLocale" target="_blank">echarts.registerLocale</a> 注册。</p>
     * </blockquote>
     * <p>示例:</p>
     * <pre><code class="lang-js hljs javascript">formatter: <span class="hljs-string">'{yyyy}-{MM}-{dd}'</span> <span class="hljs-comment">// 得到的 label 形如：'2020-12-02'</span>
     * <span class="hljs-attr">formatter</span>: <span class="hljs-string">'{d}日'</span> <span class="hljs-comment">// 得到的 label 形如：'2日'</span>
     * </code></pre>
     * <p><strong> 回调函数 </strong></p>
     * <p>回调函数可以根据刻度值返回不同的格式，如果有复杂的时间格式化需求，也可以引用第三方的日期时间相关的库（如 <a href="https://momentjs.com/" target="_blank">Moment.js</a>、<a href="https://date-fns.org/" target="_blank">date-fns</a> 等），返回显示的文本。</p>
     * <p>示例：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 使用函数模板，函数参数分别为刻度数值（类目），刻度的索引</span>
     * <span class="hljs-attr">formatter</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value, index</span>) </span>{
     *     <span class="hljs-comment">// 格式化成月/日，只在第一个刻度显示年份</span>
     *     <span class="hljs-keyword">var</span> date = <span class="hljs-keyword">new</span> <span class="hljs-built_in">Date</span>(value);
     *     <span class="hljs-keyword">var</span> texts = [(date.getMonth() + <span class="hljs-number">1</span>), date.getDate()];
     *     <span class="hljs-keyword">if</span> (index === <span class="hljs-number">0</span>) {
     *         texts.unshift(date.getYear());
     *     }
     *     <span class="hljs-keyword">return</span> texts.join(<span class="hljs-string">'/'</span>);
     * }
     * </code></pre>
     * <p><strong> 分级模板 </strong></p>
     * <p>有时候，我们希望对不同的时间粒度采用不同的格式化策略。例如，在季度图表中，我们可能希望对每个月的第一天显示月份，而其他日期显示日期。我们可以使用以下方式实现该效果：</p>
     * <p>示例：</p>
     * <pre><code class="lang-js hljs javascript">formatter: {
     *     <span class="hljs-attr">month</span>: <span class="hljs-string">'{MMMM}'</span>, <span class="hljs-comment">// 一月、二月、……</span>
     *     <span class="hljs-attr">day</span>: <span class="hljs-string">'{d}日'</span> <span class="hljs-comment">// 1日、2日、……</span>
     * }
     * </code></pre>
     * <p>支持的分级以及各自默认的取值为：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">year</span>: <span class="hljs-string">'{yyyy}'</span>,
     *     <span class="hljs-attr">month</span>: <span class="hljs-string">'{MMM}'</span>,
     *     <span class="hljs-attr">day</span>: <span class="hljs-string">'{d}'</span>,
     *     <span class="hljs-attr">hour</span>: <span class="hljs-string">'{HH}:{mm}'</span>,
     *     <span class="hljs-attr">minute</span>: <span class="hljs-string">'{HH}:{mm}'</span>,
     *     <span class="hljs-attr">second</span>: <span class="hljs-string">'{HH}:{mm}:{ss}'</span>,
     *     <span class="hljs-attr">millisecond</span>: <span class="hljs-string">'{hh}:{mm}:{ss} {SSS}'</span>,
     *     <span class="hljs-attr">none</span>: <span class="hljs-string">'{yyyy}-{MM}-{dd} {hh}:{mm}:{ss} {SSS}'</span>
     * }
     * </code></pre>
     * <p>以 <code class="codespan">day</code> 为例，当一个刻度点的值的小时、分钟、秒、毫秒都为 <code class="codespan">0</code> 时，将采用 <code class="codespan">day</code> 的分级值作为模板。<code class="codespan">none</code> 表示当其他规则都不适用时采用的模板，也就是带有毫秒值的刻度点的模板。</p>
     * <p><strong> 富文本 </strong></p>
     * <p>以上这三种形式的 formatter 都支持富文本，所以可以做成一些复杂的效果。</p>
     * <p>示例：</p>
     * <pre><code class="lang-js hljs javascript">xAxis: {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'time'</span>,
     *     <span class="hljs-attr">axisLabel</span>: {
     *         <span class="hljs-attr">formatter</span>: {
     *             <span class="hljs-comment">// 一年的第一个月显示年度信息和月份信息</span>
     *             <span class="hljs-attr">year</span>: <span class="hljs-string">'{yearStyle|{yyyy}}\n{monthStyle|{MMM}}'</span>,
     *             <span class="hljs-attr">month</span>: <span class="hljs-string">'{monthStyle|{MMM}}'</span>
     *         },
     *         <span class="hljs-attr">rich</span>: {
     *             <span class="hljs-attr">yearStyle</span>: {
     *                 <span class="hljs-comment">// 让年度信息更醒目</span>
     *                 <span class="hljs-attr">color</span>: <span class="hljs-string">'#000'</span>,
     *                 <span class="hljs-attr">fontWeight</span>: <span class="hljs-string">'bold'</span>
     *             },
     *             <span class="hljs-attr">monthStyle</span>: {
     *                 <span class="hljs-attr">color</span>: <span class="hljs-string">'#999'</span>
     *             }
     *         }
     *     }
     * },
     * </code></pre>
     * <p>使用回调函数形式实现上面例子同样的效果：</p>
     * <p>示例：</p>
     * <pre><code class="lang-js hljs javascript">xAxis: {
     *     <span class="hljs-attr">type</span>: <span class="hljs-string">'time'</span>,
     *     <span class="hljs-attr">axisLabel</span>: {
     *         <span class="hljs-attr">formatter</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value</span>) </span>{
     *             <span class="hljs-keyword">const</span> date = <span class="hljs-keyword">new</span> <span class="hljs-built_in">Date</span>(value);
     *             <span class="hljs-keyword">const</span> yearStart = <span class="hljs-keyword">new</span> <span class="hljs-built_in">Date</span>(value);
     *             yearStart.setMonth(<span class="hljs-number">0</span>);
     *             yearStart.setDate(<span class="hljs-number">1</span>);
     *             yearStart.setHours(<span class="hljs-number">0</span>);
     *             yearStart.setMinutes(<span class="hljs-number">0</span>);
     *             yearStart.setSeconds(<span class="hljs-number">0</span>);
     *             yearStart.setMilliseconds(<span class="hljs-number">0</span>);
     *             <span class="hljs-comment">// 判断一个刻度值知否为一年的开始</span>
     *             <span class="hljs-keyword">if</span> (date.getTime() === yearStart.getTime()) {
     *                 <span class="hljs-keyword">return</span> <span class="hljs-string">'{year|'</span> + date.getFullYear() + <span class="hljs-string">'}\n'</span>
     *                     + <span class="hljs-string">'{month|'</span> + (date.getMonth() + <span class="hljs-number">1</span>) + <span class="hljs-string">'月}'</span>;
     *             }
     *             <span class="hljs-keyword">else</span> {
     *                 <span class="hljs-keyword">return</span> <span class="hljs-string">'{month|'</span> + (date.getMonth() + <span class="hljs-number">1</span>) + <span class="hljs-string">'月}'</span>
     *             }
     *         },
     *         <span class="hljs-attr">rich</span>: {
     *             <span class="hljs-attr">year</span>: {
     *                 <span class="hljs-attr">color</span>: <span class="hljs-string">'#000'</span>,
     *                 <span class="hljs-attr">fontWeight</span>: <span class="hljs-string">'bold'</span>
     *             },
     *             <span class="hljs-attr">month</span>: {
     *                 <span class="hljs-attr">color</span>: <span class="hljs-string">'#999'</span>
     *             }
     *         }
     *     }
     * },
     * </code></pre>
     */
    private Object formatter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.showMinLabel">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.showMinLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示最小 tick 的 label。可取值 <code class="codespan">true</code>, <code class="codespan">false</code>, <code class="codespan">null</code>。默认自动判定（即如果标签重叠，不会显示最小 tick 的 label）。</p>
     */
    private Boolean showMinLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.showMaxLabel">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.showMaxLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示最大 tick 的 label。可取值 <code class="codespan">true</code>, <code class="codespan">false</code>, <code class="codespan">null</code>。默认自动判定（即如果标签重叠，不会显示最大 tick 的 label）。</p>
     */
    private Boolean showMaxLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.color">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.color</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color","Function"]
     * <br/>描述:
     * <p>刻度标签文字的颜色，默认取 <a href="#yAxis.axisLine.lineStyle.color">axisLine.lineStyle.color</a>。支持回调函数，格式如下</p>
     * <pre><code class="lang-js hljs javascript">(val: string) =&gt; Color
     * </code></pre>
     * <p>参数是标签的文本，返回颜色值，如下示例：</p>
     * <pre><code class="lang-js hljs javascript">textStyle: {
     *     <span class="hljs-attr">color</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value, index</span>) </span>{
     *         <span class="hljs-keyword">return</span> value &gt;= <span class="hljs-number">0</span> ? <span class="hljs-string">'green'</span> : <span class="hljs-string">'red'</span>;
     *     }
     * }
     * </code></pre>
     */
    private Object color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.fontStyle">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.fontStyle</a>
     * <br/>默认值: normal
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字字体的风格。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'normal'</code></li>
     * <li><code class="codespan">'italic'</code></li>
     * <li><code class="codespan">'oblique'</code></li>
     * </ul>
     */
    private String fontStyle;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.fontWeight">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.fontWeight</a>
     * <br/>默认值: normal
     * <br/>js类型: ["string","number"]
     * <br/>描述:
     * <p>文字字体的粗细。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'normal'</code></li>
     * <li><code class="codespan">'bold'</code></li>
     * <li><code class="codespan">'bolder'</code></li>
     * <li><code class="codespan">'lighter'</code></li>
     * <li>100 | 200 | 300 | 400...</li>
     * </ul>
     */
    private Object fontWeight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.fontFamily">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.fontFamily</a>
     * <br/>默认值: sans-serif
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字的字体系列。</p>
     * <p>还可以是 'serif' , 'monospace', 'Arial', 'Courier New', 'Microsoft YaHei', ...</p>
     */
    private String fontFamily;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.fontSize">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.fontSize</a>
     * <br/>默认值: 12
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字的字体大小。</p>
     */
    private Integer fontSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.align">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.align</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字水平对齐方式，默认自动。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'left'</code></li>
     * <li><code class="codespan">'center'</code></li>
     * <li><code class="codespan">'right'</code></li>
     * </ul>
     * <p><code class="codespan">rich</code> 中如果没有设置 <code class="codespan">align</code>，则会取父层级的 <code class="codespan">align</code>。例如：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">align</span>: right,
     *     <span class="hljs-attr">rich</span>: {
     *         <span class="hljs-attr">a</span>: {
     *             <span class="hljs-comment">// 没有设置 `align`，则 `align` 为 right</span>
     *         }
     *     }
     * }
     * </code></pre>
     */
    private String align;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.verticalAlign">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.verticalAlign</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字垂直对齐方式，默认自动。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'top'</code></li>
     * <li><code class="codespan">'middle'</code></li>
     * <li><code class="codespan">'bottom'</code></li>
     * </ul>
     * <p><code class="codespan">rich</code> 中如果没有设置 <code class="codespan">verticalAlign</code>，则会取父层级的 <code class="codespan">verticalAlign</code>。例如：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">verticalAlign</span>: bottom,
     *     <span class="hljs-attr">rich</span>: {
     *         <span class="hljs-attr">a</span>: {
     *             <span class="hljs-comment">// 没有设置 `verticalAlign`，则 `verticalAlign` 为 bottom</span>
     *         }
     *     }
     * }
     * </code></pre>
     */
    private String verticalAlign;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.lineHeight">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.lineHeight</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>行高。</p>
     * <p><code class="codespan">rich</code> 中如果没有设置 <code class="codespan">lineHeight</code>，则会取父层级的 <code class="codespan">lineHeight</code>。例如：</p>
     * <pre><code class="lang-js hljs javascript">{
     *     <span class="hljs-attr">lineHeight</span>: <span class="hljs-number">56</span>,
     *     <span class="hljs-attr">rich</span>: {
     *         <span class="hljs-attr">a</span>: {
     *             <span class="hljs-comment">// 没有设置 `lineHeight`，则 `lineHeight` 为 56</span>
     *         }
     *     }
     * }
     * </code></pre>
     */
    private Integer lineHeight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.backgroundColor">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.backgroundColor</a>
     * <br/>默认值: transparent
     * <br/>js类型: ["string","Object"]
     * <br/>描述:
     * <p>文字块背景色。</p>
     * <p>可以使用颜色值，例如：<code class="codespan">'#123234'</code>, <code class="codespan">'red'</code>, <code class="codespan">'rgba(0,23,11,0.3)'</code>。</p>
     * <p>也可以直接使用图片，例如：</p>
     * <pre><code class="lang-js hljs javascript">backgroundColor: {
     *     <span class="hljs-attr">image</span>: <span class="hljs-string">'xxx/xxx.png'</span>
     *     <span class="hljs-comment">// 这里可以是图片的 URL，</span>
     *     <span class="hljs-comment">// 或者图片的 dataURI，</span>
     *     <span class="hljs-comment">// 或者 HTMLImageElement 对象，</span>
     *     <span class="hljs-comment">// 或者 HTMLCanvasElement 对象。</span>
     * }
     * </code></pre>
     * <p>当使用图片的时候，可以使用 <code class="codespan">width</code> 或 <code class="codespan">height</code> 指定高宽，也可以不指定自适应。</p>
     */
    private Object backgroundColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.borderColor">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.borderColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.borderWidth">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.borderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块边框宽度。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.borderType">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.borderType</a>
     * <br/>默认值: solid
     * <br/>js类型: ["string","number","Array"]
     * <br/>描述:
     * <p>文字块边框描边类型。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'solid'</code></li>
     * <li><code class="codespan">'dashed'</code></li>
     * <li><code class="codespan">'dotted'</code></li>
     * </ul>
     * <p>自 <code class="codespan">v5.0.0</code> 开始，也可以是 <code class="codespan">number</code> 或者 <code class="codespan">number</code> 数组，用以指定线条的 <a href="https://developer.mozilla.org/zh-CN/docs/Web/SVG/Attribute/stroke-dasharray" target="_blank">dash array</a>，配合
     * <code class="codespan">borderDashOffset</code>
     *  可实现更灵活的虚线效果。</p>
     * <p>例如：</p>
     * <pre><code class="lang-js hljs javascript">{
     *
     * <span class="hljs-attr">borderType</span>: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>],
     *
     * <span class="hljs-attr">borderDashOffset</span>: <span class="hljs-number">5</span>
     * }
     * </code></pre>
     */
    private Object borderType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.borderDashOffset">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.borderDashOffset</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>用于设置虚线的偏移量，可搭配
     * <code class="codespan">borderType</code>
     * 指定 dash array 实现灵活的虚线效果。</p>
     * <p>更多详情可以参考 MDN <a href="https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/lineDashOffset" target="_blank">lineDashOffset</a>。</p>
     */
    private Integer borderDashOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.borderRadius">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.borderRadius</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>文字块的圆角。</p>
     */
    private Object borderRadius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.padding">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.padding</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>文字块的内边距。例如：</p>
     * <ul>
     * <li><code class="codespan">padding: [3, 4, 5, 6]</code>：表示 <code class="codespan">[上, 右, 下, 左]</code> 的边距。</li>
     * <li><code class="codespan">padding: 4</code>：表示 <code class="codespan">padding: [4, 4, 4, 4]</code>。</li>
     * <li><code class="codespan">padding: [3, 4]</code>：表示 <code class="codespan">padding: [3, 4, 3, 4]</code>。</li>
     * </ul>
     * <p>注意，文字块的 <code class="codespan">width</code> 和 <code class="codespan">height</code> 指定的是内容高宽，不包含 <code class="codespan">padding</code>。</p>
     */
    private Object padding;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.shadowColor">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.shadowColor</a>
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块的背景阴影颜色。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.shadowBlur">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.shadowBlur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影长度。</p>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.shadowOffsetX">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 X 偏移。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.shadowOffsetY">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 Y 偏移。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.width">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.width</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.height">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.height</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示高度。</p>
     */
    private Integer height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textBorderColor">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textBorderColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的描边颜色。</p>
     */
    private String textBorderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textBorderWidth">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textBorderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的描边宽度。</p>
     */
    private Integer textBorderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textBorderType">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textBorderType</a>
     * <br/>默认值: solid
     * <br/>js类型: ["string","number","Array"]
     * <br/>描述:
     * <p>文字本身的描边类型。</p>
     * <p>可选：</p>
     * <ul>
     * <li><code class="codespan">'solid'</code></li>
     * <li><code class="codespan">'dashed'</code></li>
     * <li><code class="codespan">'dotted'</code></li>
     * </ul>
     * <p>自 <code class="codespan">v5.0.0</code> 开始，也可以是 <code class="codespan">number</code> 或者 <code class="codespan">number</code> 数组，用以指定线条的 <a href="https://developer.mozilla.org/zh-CN/docs/Web/SVG/Attribute/stroke-dasharray" target="_blank">dash array</a>，配合
     * <code class="codespan">textBorderDashOffset</code>
     *  可实现更灵活的虚线效果。</p>
     * <p>例如：</p>
     * <pre><code class="lang-js hljs javascript">{
     *
     * <span class="hljs-attr">textBorderType</span>: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>],
     *
     * <span class="hljs-attr">textBorderDashOffset</span>: <span class="hljs-number">5</span>
     * }
     * </code></pre>
     */
    private Object textBorderType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textBorderDashOffset">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textBorderDashOffset</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.0.0</code> 开始支持</p>
     * </blockquote>
     *
     *
     * <p>用于设置虚线的偏移量，可搭配
     * <code class="codespan">textBorderType</code>
     * 指定 dash array 实现灵活的虚线效果。</p>
     * <p>更多详情可以参考 MDN <a href="https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/lineDashOffset" target="_blank">lineDashOffset</a>。</p>
     */
    private Integer textBorderDashOffset;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textShadowColor">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textShadowColor</a>
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的阴影颜色。</p>
     */
    private String textShadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textShadowBlur">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textShadowBlur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影长度。</p>
     */
    private Integer textShadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textShadowOffsetX">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textShadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 X 偏移。</p>
     */
    private Integer textShadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textShadowOffsetY">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.textShadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 Y 偏移。</p>
     */
    private Integer textShadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.overflow">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.overflow</a>
     * <br/>默认值: none
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字超出宽度是否截断或者换行。配置<code class="codespan">width</code>时有效</p>
     * <ul>
     * <li><code class="codespan">'truncate'</code> 截断，并在末尾显示<code class="codespan">ellipsis</code>配置的文本，默认为<code class="codespan">...</code></li>
     * <li><code class="codespan">'break'</code> 换行</li>
     * <li><code class="codespan">'breakAll'</code> 换行，跟<code class="codespan">'break'</code>不同的是，在英语等拉丁文中，<code class="codespan">'breakAll'</code>还会强制单词内换行</li>
     * </ul>
     */
    private String overflow;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.ellipsis">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.ellipsis</a>
     * <br/>默认值: ...
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>在<code class="codespan">overflow</code>配置为<code class="codespan">'truncate'</code>的时候，可以通过该属性配置末尾显示的文本。</p>
     */
    private String ellipsis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.lineOverflow">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.lineOverflow</a>
     * <br/>默认值: none
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文本超出高度部分是否截断，配置<code class="codespan">height</code>时有效。</p>
     * <ul>
     * <li><code class="codespan">'truncate'</code> 在文本行数超出高度部分截断。</li>
     * </ul>
     */
    private String lineOverflow;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#yAxis.axisLabel.rich">https://echarts.apache.org/zh/option.html#yAxis.axisLabel.rich</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>在 <code class="codespan">rich</code> 里面，可以自定义富文本样式。利用富文本样式，可以在标签中做出非常丰富的效果。</p>
     * <p>例如：</p>
     * <pre><code class="lang-js hljs javascript">label: {
     *     <span class="hljs-comment">// 在文本中，可以对部分文本采用 rich 中定义样式。</span>
     *     <span class="hljs-comment">// 这里需要在文本中使用标记符号：</span>
     *     <span class="hljs-comment">// `{styleName|text content text content}` 标记样式名。</span>
     *     <span class="hljs-comment">// 注意，换行仍是使用 '\n'。</span>
     *     <span class="hljs-attr">formatter</span>: [
     *         <span class="hljs-string">'{a|这段文本采用样式a}'</span>,
     *         <span class="hljs-string">'{b|这段文本采用样式b}这段用默认样式{x|这段用样式x}'</span>
     *     ].join(<span class="hljs-string">'\n'</span>),
     *
     *     <span class="hljs-attr">rich</span>: {
     *         <span class="hljs-attr">a</span>: {
     *             <span class="hljs-attr">color</span>: <span class="hljs-string">'red'</span>,
     *             <span class="hljs-attr">lineHeight</span>: <span class="hljs-number">10</span>
     *         },
     *         <span class="hljs-attr">b</span>: {
     *             <span class="hljs-attr">backgroundColor</span>: {
     *                 <span class="hljs-attr">image</span>: <span class="hljs-string">'xxx/xxx.jpg'</span>
     *             },
     *             <span class="hljs-attr">height</span>: <span class="hljs-number">40</span>
     *         },
     *         <span class="hljs-attr">x</span>: {
     *             <span class="hljs-attr">fontSize</span>: <span class="hljs-number">18</span>,
     *             <span class="hljs-attr">fontFamily</span>: <span class="hljs-string">'Microsoft YaHei'</span>,
     *             <span class="hljs-attr">borderColor</span>: <span class="hljs-string">'#449933'</span>,
     *             <span class="hljs-attr">borderRadius</span>: <span class="hljs-number">4</span>
     *         },
     *         ...
     *     }
     * }
     * </code></pre>
     * <p>详情参见教程：<a href="tutorial.html#%E5%AF%8C%E6%96%87%E6%9C%AC%E6%A0%87%E7%AD%BE" target="_blank">富文本标签</a></p>
     */
    private Object rich;
}
