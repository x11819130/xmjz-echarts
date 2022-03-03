package com.xmjz.echarts.nativebean.option.radar;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel">https://echarts.apache.org/zh/option.html#radar.axisLabel</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.show">https://echarts.apache.org/zh/option.html#radar.axisLabel.show</a>
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示刻度标签。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.rotate">https://echarts.apache.org/zh/option.html#radar.axisLabel.rotate</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>刻度标签旋转的角度，在类目轴的类目标签显示不下的时候可以通过旋转防止标签之间重叠。</p>
     * <p>旋转的角度从 -90 度到 90 度。</p>
     */
    private Integer rotate;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.margin">https://echarts.apache.org/zh/option.html#radar.axisLabel.margin</a>
     * <br/>默认值: 8
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>刻度标签与轴线之间的距离。</p>
     */
    private Integer margin;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.formatter">https://echarts.apache.org/zh/option.html#radar.axisLabel.formatter</a>
     * <br/>默认值: 无
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>刻度标签的内容格式器，支持字符串模板和回调函数两种形式。</p>
     * <p>示例:</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-comment">// 使用字符串模板，模板变量为刻度默认标签 {value}</span>
     * formatter: <span class="hljs-string">'{value} kg'</span>
     * <span class="hljs-comment">// 使用函数模板，函数参数分别为刻度数值（类目），刻度的索引</span>
     * formatter: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value, index</span>) </span>{
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
     * <pre><code class="lang-ts hljs typescript">formatter: <span class="hljs-string">'{yyyy}-{MM}-{dd}'</span> <span class="hljs-comment">// 得到的 label 形如：'2020-12-02'</span>
     * formatter: <span class="hljs-string">'{d}日'</span> <span class="hljs-comment">// 得到的 label 形如：'2日'</span>
     * </code></pre>
     * <p><strong> 回调函数 </strong></p>
     * <p>回调函数可以根据刻度值返回不同的格式，如果有复杂的时间格式化需求，也可以引用第三方的日期时间相关的库（如 <a href="https://momentjs.com/" target="_blank">Moment.js</a>、<a href="https://date-fns.org/" target="_blank">date-fns</a> 等），返回显示的文本。</p>
     * <p>示例：</p>
     * <pre><code class="lang-ts hljs typescript"><span class="hljs-comment">// 使用函数模板，函数参数分别为刻度数值（类目），刻度的索引</span>
     * formatter: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value, index</span>) </span>{
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
     * <pre><code class="lang-ts hljs typescript">formatter: {
     *     month: <span class="hljs-string">'{MMMM}'</span>, <span class="hljs-comment">// 一月、二月、……</span>
     *     day: <span class="hljs-string">'{d}日'</span> <span class="hljs-comment">// 1日、2日、……</span>
     * }
     * </code></pre>
     * <p>支持的分级以及各自默认的取值为：</p>
     * <pre><code class="lang-ts hljs typescript">{
     *     year: <span class="hljs-string">'{yyyy}'</span>,
     *     month: <span class="hljs-string">'{MMM}'</span>,
     *     day: <span class="hljs-string">'{d}'</span>,
     *     hour: <span class="hljs-string">'{HH}:{mm}'</span>,
     *     minute: <span class="hljs-string">'{HH}:{mm}'</span>,
     *     second: <span class="hljs-string">'{HH}:{mm}:{ss}'</span>,
     *     millisecond: <span class="hljs-string">'{hh}:{mm}:{ss} {SSS}'</span>,
     *     none: <span class="hljs-string">'{yyyy}-{MM}-{dd} {hh}:{mm}:{ss} {SSS}'</span>
     * }
     * </code></pre>
     * <p>以 <code class="codespan">day</code> 为例，当一个刻度点的值的小时、分钟、秒、毫秒都为 <code class="codespan">0</code> 时，将采用 <code class="codespan">day</code> 的分级值作为模板。<code class="codespan">none</code> 表示当其他规则都不适用时采用的模板，也就是带有毫秒值的刻度点的模板。</p>
     * <p><strong> 富文本 </strong></p>
     * <p>以上这三种形式的 formatter 都支持富文本，所以可以做成一些复杂的效果。</p>
     * <p>示例：</p>
     * <pre><code class="lang-ts hljs typescript">xAxis: {
     *     <span class="hljs-keyword">type</span>: <span class="hljs-string">'time'</span>,
     *     axisLabel: {
     *         formatter: {
     *             <span class="hljs-comment">// 一年的第一个月显示年度信息和月份信息</span>
     *             year: <span class="hljs-string">'{yearStyle|{yyyy}}\n{monthStyle|{MMM}}'</span>,
     *             month: <span class="hljs-string">'{monthStyle|{MMM}}'</span>
     *         },
     *         rich: {
     *             yearStyle: {
     *                 <span class="hljs-comment">// 让年度信息更醒目</span>
     *                 color: <span class="hljs-string">'#000'</span>,
     *                 fontWeight: <span class="hljs-string">'bold'</span>
     *             },
     *             monthStyle: {
     *                 color: <span class="hljs-string">'#999'</span>
     *             }
     *         }
     *     }
     * },
     * </code></pre>
     * <p>使用回调函数形式实现上面例子同样的效果：</p>
     * <p>示例：</p>
     * <pre><code class="lang-ts hljs typescript">xAxis: {
     *     <span class="hljs-keyword">type</span>: <span class="hljs-string">'time'</span>,
     *     axisLabel: {
     *         formatter: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value</span>) </span>{
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
     *         rich: {
     *             year: {
     *                 color: <span class="hljs-string">'#000'</span>,
     *                 fontWeight: <span class="hljs-string">'bold'</span>
     *             },
     *             month: {
     *                 color: <span class="hljs-string">'#999'</span>
     *             }
     *         }
     *     }
     * },
     * </code></pre>
     */
    private Object formatter;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.showMinLabel">https://echarts.apache.org/zh/option.html#radar.axisLabel.showMinLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示最小 tick 的 label。可取值 <code class="codespan">true</code>, <code class="codespan">false</code>, <code class="codespan">null</code>。默认自动判定（即如果标签重叠，不会显示最小 tick 的 label）。</p>
     */
    private Boolean showMinLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.showMaxLabel">https://echarts.apache.org/zh/option.html#radar.axisLabel.showMaxLabel</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示最大 tick 的 label。可取值 <code class="codespan">true</code>, <code class="codespan">false</code>, <code class="codespan">null</code>。默认自动判定（即如果标签重叠，不会显示最大 tick 的 label）。</p>
     */
    private Boolean showMaxLabel;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.hideOverlap">https://echarts.apache.org/zh/option.html#radar.axisLabel.hideOverlap</a>
     * <br/>默认值: 无
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <blockquote>
     * <p>从 <code class="codespan">v5.2.0</code> 开始支持</p>
     * </blockquote>
     * <p>是否隐藏重叠的标签。</p>
     */
    private Boolean hideOverlap;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.color">https://echarts.apache.org/zh/option.html#radar.axisLabel.color</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color","Function"]
     * <br/>描述:
     * <p>刻度标签文字的颜色，默认取 <a href="#.axisLine.lineStyle.color">axisLine.lineStyle.color</a>。支持回调函数，格式如下</p>
     * <pre><code class="lang-ts hljs typescript">(val: <span class="hljs-built_in">string</span>) =&gt; Color
     * </code></pre>
     * <p>参数是标签的文本，返回颜色值，如下示例：</p>
     * <pre><code class="lang-ts hljs typescript">textStyle: {
     *     color: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value, index</span>) </span>{
     *         <span class="hljs-keyword">return</span> value &gt;= <span class="hljs-number">0</span> ? <span class="hljs-string">'green'</span> : <span class="hljs-string">'red'</span>;
     *     }
     * }
     * </code></pre>
     */
    private Object color;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.fontStyle">https://echarts.apache.org/zh/option.html#radar.axisLabel.fontStyle</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.fontWeight">https://echarts.apache.org/zh/option.html#radar.axisLabel.fontWeight</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.fontFamily">https://echarts.apache.org/zh/option.html#radar.axisLabel.fontFamily</a>
     * <br/>默认值: sans-serif
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>文字的字体系列。</p>
     * <p>还可以是 'serif' , 'monospace', 'Arial', 'Courier New', 'Microsoft YaHei', ...</p>
     */
    private String fontFamily;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.fontSize">https://echarts.apache.org/zh/option.html#radar.axisLabel.fontSize</a>
     * <br/>默认值: 12
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字的字体大小。</p>
     */
    private Integer fontSize;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.align">https://echarts.apache.org/zh/option.html#radar.axisLabel.align</a>
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
     * <pre><code class="lang-ts hljs typescript">{
     *     align: right,
     *     rich: {
     *         a: {
     *             <span class="hljs-comment">// 没有设置 `align`，则 `align` 为 right</span>
     *         }
     *     }
     * }
     * </code></pre>
     */
    private String align;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.verticalAlign">https://echarts.apache.org/zh/option.html#radar.axisLabel.verticalAlign</a>
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
     * <pre><code class="lang-ts hljs typescript">{
     *     verticalAlign: bottom,
     *     rich: {
     *         a: {
     *             <span class="hljs-comment">// 没有设置 `verticalAlign`，则 `verticalAlign` 为 bottom</span>
     *         }
     *     }
     * }
     * </code></pre>
     */
    private String verticalAlign;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.lineHeight">https://echarts.apache.org/zh/option.html#radar.axisLabel.lineHeight</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>行高。</p>
     * <p><code class="codespan">rich</code> 中如果没有设置 <code class="codespan">lineHeight</code>，则会取父层级的 <code class="codespan">lineHeight</code>。例如：</p>
     * <pre><code class="lang-ts hljs typescript">{
     *     lineHeight: <span class="hljs-number">56</span>,
     *     rich: {
     *         a: {
     *             <span class="hljs-comment">// 没有设置 `lineHeight`，则 `lineHeight` 为 56</span>
     *         }
     *     }
     * }
     * </code></pre>
     */
    private Integer lineHeight;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.backgroundColor">https://echarts.apache.org/zh/option.html#radar.axisLabel.backgroundColor</a>
     * <br/>默认值: transparent
     * <br/>js类型: ["string","Object"]
     * <br/>描述:
     * <p>文字块背景色。</p>
     * <p>可以使用颜色值，例如：<code class="codespan">'#123234'</code>, <code class="codespan">'red'</code>, <code class="codespan">'rgba(0,23,11,0.3)'</code>。</p>
     * <p>也可以直接使用图片，例如：</p>
     * <pre><code class="lang-ts hljs typescript">backgroundColor: {
     *     image: <span class="hljs-string">'xxx/xxx.png'</span>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.borderColor">https://echarts.apache.org/zh/option.html#radar.axisLabel.borderColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块边框颜色。</p>
     */
    private String borderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.borderWidth">https://echarts.apache.org/zh/option.html#radar.axisLabel.borderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块边框宽度。</p>
     */
    private Integer borderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.borderType">https://echarts.apache.org/zh/option.html#radar.axisLabel.borderType</a>
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
     * <pre><code class="lang-ts hljs typescript">{
     *
     * borderType: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>],
     *
     * borderDashOffset: <span class="hljs-number">5</span>
     * }
     * </code></pre>
     */
    private Object borderType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.borderDashOffset">https://echarts.apache.org/zh/option.html#radar.axisLabel.borderDashOffset</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.borderRadius">https://echarts.apache.org/zh/option.html#radar.axisLabel.borderRadius</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number","Array"]
     * <br/>描述:
     * <p>文字块的圆角。</p>
     */
    private Object borderRadius;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.padding">https://echarts.apache.org/zh/option.html#radar.axisLabel.padding</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.shadowColor">https://echarts.apache.org/zh/option.html#radar.axisLabel.shadowColor</a>
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字块的背景阴影颜色。</p>
     */
    private String shadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.shadowBlur">https://echarts.apache.org/zh/option.html#radar.axisLabel.shadowBlur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影长度。</p>
     */
    private Integer shadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.shadowOffsetX">https://echarts.apache.org/zh/option.html#radar.axisLabel.shadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 X 偏移。</p>
     */
    private Integer shadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.shadowOffsetY">https://echarts.apache.org/zh/option.html#radar.axisLabel.shadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字块的背景阴影 Y 偏移。</p>
     */
    private Integer shadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.width">https://echarts.apache.org/zh/option.html#radar.axisLabel.width</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示宽度。</p>
     */
    private Integer width;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.height">https://echarts.apache.org/zh/option.html#radar.axisLabel.height</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文本显示高度。</p>
     */
    private Integer height;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.textBorderColor">https://echarts.apache.org/zh/option.html#radar.axisLabel.textBorderColor</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的描边颜色。</p>
     */
    private String textBorderColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.textBorderWidth">https://echarts.apache.org/zh/option.html#radar.axisLabel.textBorderWidth</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的描边宽度。</p>
     */
    private Integer textBorderWidth;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.textBorderType">https://echarts.apache.org/zh/option.html#radar.axisLabel.textBorderType</a>
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
     * <pre><code class="lang-ts hljs typescript">{
     *
     * textBorderType: [<span class="hljs-number">5</span>, <span class="hljs-number">10</span>],
     *
     * textBorderDashOffset: <span class="hljs-number">5</span>
     * }
     * </code></pre>
     */
    private Object textBorderType;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.textBorderDashOffset">https://echarts.apache.org/zh/option.html#radar.axisLabel.textBorderDashOffset</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.textShadowColor">https://echarts.apache.org/zh/option.html#radar.axisLabel.textShadowColor</a>
     * <br/>默认值: transparent
     * <br/>js类型: ["Color"]
     * <br/>描述:
     * <p>文字本身的阴影颜色。</p>
     */
    private String textShadowColor;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.textShadowBlur">https://echarts.apache.org/zh/option.html#radar.axisLabel.textShadowBlur</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影长度。</p>
     */
    private Integer textShadowBlur;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.textShadowOffsetX">https://echarts.apache.org/zh/option.html#radar.axisLabel.textShadowOffsetX</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 X 偏移。</p>
     */
    private Integer textShadowOffsetX;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.textShadowOffsetY">https://echarts.apache.org/zh/option.html#radar.axisLabel.textShadowOffsetY</a>
     * <br/>默认值: 无
     * <br/>js类型: ["number"]
     * <br/>描述:
     * <p>文字本身的阴影 Y 偏移。</p>
     */
    private Integer textShadowOffsetY;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.overflow">https://echarts.apache.org/zh/option.html#radar.axisLabel.overflow</a>
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
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.ellipsis">https://echarts.apache.org/zh/option.html#radar.axisLabel.ellipsis</a>
     * <br/>默认值: ...
     * <br/>js类型: ["string"]
     * <br/>描述:
     * <p>在<code class="codespan">overflow</code>配置为<code class="codespan">'truncate'</code>的时候，可以通过该属性配置末尾显示的文本。</p>
     */
    private String ellipsis;
    /**
     * 官方文档: <a href="https://echarts.apache.org/zh/option.html#radar.axisLabel.rich">https://echarts.apache.org/zh/option.html#radar.axisLabel.rich</a>
     * <br/>默认值: 无
     * <br/>js类型: ["Object"]
     * <br/>描述:
     * <p>在 <code class="codespan">rich</code> 里面，可以自定义富文本样式。利用富文本样式，可以在标签中做出非常丰富的效果。</p>
     * <p>例如：</p>
     * <pre><code class="lang-ts hljs typescript">label: {
     *     <span class="hljs-comment">// 在文本中，可以对部分文本采用 rich 中定义样式。</span>
     *     <span class="hljs-comment">// 这里需要在文本中使用标记符号：</span>
     *     <span class="hljs-comment">// `{styleName|text content text content}` 标记样式名。</span>
     *     <span class="hljs-comment">// 注意，换行仍是使用 '\n'。</span>
     *     formatter: [
     *         <span class="hljs-string">'{a|这段文本采用样式a}'</span>,
     *         <span class="hljs-string">'{b|这段文本采用样式b}这段用默认样式{x|这段用样式x}'</span>
     *     ].join(<span class="hljs-string">'\n'</span>),
     *
     *     rich: {
     *         a: {
     *             color: <span class="hljs-string">'red'</span>,
     *             lineHeight: <span class="hljs-number">10</span>
     *         },
     *         b: {
     *             backgroundColor: {
     *                 image: <span class="hljs-string">'xxx/xxx.jpg'</span>
     *             },
     *             height: <span class="hljs-number">40</span>
     *         },
     *         x: {
     *             fontSize: <span class="hljs-number">18</span>,
     *             fontFamily: <span class="hljs-string">'Microsoft YaHei'</span>,
     *             borderColor: <span class="hljs-string">'#449933'</span>,
     *             borderRadius: <span class="hljs-number">4</span>
     *         },
     *         ...
     *     }
     * }
     * </code></pre>
     * <p>详情参见教程：<a href="tutorial.html#%E5%AF%8C%E6%96%87%E6%9C%AC%E6%A0%87%E7%AD%BE" target="_blank">富文本标签</a></p>
     */
    private Object rich;
}
