package com.xmjz.echarts.nativebean.option.radar;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#radar.name">https://echarts.apache.org/v4/zh/option.html#radar.name</a>
 * <br/>序号: 7
 * <br/>默认值: 无
 * <br/>js类型: ["Object"]
 * <br/>描述:
 * <p>雷达图每个指示器名称的配置项。</p>
 *
 * @author auto
 */
@Getter
@Setter
@Accessors(chain = true)
public class Name implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#radar.name.show">https://echarts.apache.org/v4/zh/option.html#radar.name.show</a>
     * <br/>序号: 1
     * <br/>默认值: true
     * <br/>js类型: ["boolean"]
     * <br/>描述:
     * <p>是否显示指示器名称。</p>
     */
    private Boolean show;
    /**
     * 官方文档: <a href="https://echarts.apache.org/v4/zh/option.html#radar.name.formatter">https://echarts.apache.org/v4/zh/option.html#radar.name.formatter</a>
     * <br/>序号: 2
     * <br/>默认值: 无
     * <br/>js类型: ["string","Function"]
     * <br/>描述:
     * <p>指示器名称显示的格式器。支持字符串和回调函数，如下示例：</p>
     * <pre><code class="lang-js hljs javascript"><span class="hljs-comment">// 使用字符串模板，模板变量为指示器名称 {value}</span>
     * <span class="hljs-attr">formatter</span>: <span class="hljs-string">'【{value}】'</span>
     * <span class="hljs-comment">// 使用回调函数，第一个参数是指示器名称，第二个参数是指示器配置项</span>
     * <span class="hljs-attr">formatter</span>: <span class="hljs-function"><span class="hljs-keyword">function</span> (<span class="hljs-params">value, indicator</span>) </span>{
     *     <span class="hljs-keyword">return</span> <span class="hljs-string">'【'</span> + value + <span class="hljs-string">'】'</span>;
     * }
     * </code></pre>
     */
    private Object formatter;
}
