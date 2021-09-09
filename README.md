# xmjz-echarts
此工程用于从echarts官网的[配置项手册](https://echarts.apache.org/zh/option.html#title)中，爬取最新版本的配置项结构和说明，用来生成对应的java类库。

第一步：用js从官网爬取配置项结构数据

​	1.使用谷歌浏览器打开https://echarts.apache.org/zh/option.html#series-line，F12执行step1.js

​	2.就在这个页面, 再执行step2.js，完成后将生成一个echarts-option.版本号.json的文件

第二步: 执行TemplateFormat的main方法(修改相应配置), 生成类库代码

第三步: 在idea里选中生成的类的包, 右键选择Reformat Code(Ctrl+Alt+L), 弹框里勾选Include subdirections和Optimize imports后Run. 目的为了格式化生成的代码.

第四步: mvn clean package打包

第五步: mvn deploy

