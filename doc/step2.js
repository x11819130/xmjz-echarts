(function () {
        function download(filename, text, type = 'plain') {
            var pom = document.createElement('a');
            pom.setAttribute('href', 'data:text/' + type + ';charset=utf-8,' + encodeURIComponent(text));
            pom.setAttribute('download', filename);
            if (document.createEvent) {
                var event = document.createEvent('MouseEvents');
                event.initEvent('click', true, true);
                pom.dispatchEvent(event);
            } else {
                pom.click();
            }
        }

        function parseChildren(objs, level1List) {
            let order = 1;
            objs.props = [];
            level1List.forEach(level1 => {
                    let prop = {};
                    prop.order = order++;
                    prop.name = level1.querySelector('h4 .path-base').textContent;
                    //忽略<不确定属性> 例如: <style_name>
                    if (prop.name[0] === '<') {
                        return;
                    } else {
                        objs.props.push(prop);
                    }
                    prop.url = level1.querySelector('h4 .path-base a').href;
                    prop.defaultValue = level1.querySelector('h4 .default-value');
                    if (prop.defaultValue !== null) {
                        //文档不规范默认值处理 例如:https://echarts.apache.org/zh/option.html#title.subtextStyle.fontWeight
                        //'normal','75%','自适应','solid','linear'
                        try {
                            eval("prop.defaultValue " + prop.defaultValue.textContent);
                        } catch (err) {
                            let value = prop.defaultValue.textContent.substr(3).replaceAll("'", "");
                            eval("prop.defaultValue = '" + value + "'");
                            console.info('处理不规范默认值: ' + prop.defaultValue);
                        }
                    }
                    prop.types = [];
                    level1.querySelector('.prop-types').querySelectorAll('span.prop-type').forEach(type => {
                            prop.types.push(type.textContent);
                        }
                    );
                    prop.description = level1.querySelector('.item-description').innerHTML.trim();
                    prop.props = [];
                    let children = level1.querySelectorAll('.children .doc-content-item-card');
                    if (children !== null && children.length > 0) {
                        parseChildren(prop, children);
                    }
                }
            );
        }

        function parseLevel0(objs, document) {
            let descNode = document.querySelector('.page-description');
            if (descNode !== null) {
                objs.description = descNode.innerHTML.trim();
            }
            let level1List = document.querySelectorAll('.doc-content-item-card.level-1');
            parseChildren(objs, level1List);
            console.info(objs.name + '解析完成');
        }

        if (window.OPTION === undefined) {
            window.OPTION = {
                order: 1,
                url: 'https://echarts.apache.org/zh/option.html',
                name: 'option',
                description: 'Eachrts Option Object',
                types: ['Object'],
                defaultValue: null,
                props: []
            }
            window.OPTION.props.push({
                name: document.querySelectorAll('h2')[0].textContent,
                description: document.querySelector('.page-description').innerHTML.trim(),
                url: location.href,
                defaultValue: null,
                types: ['Object'],
                props: []
            });
        }

        async function getVersion() {
            const text = await fetch('https://echarts.apache.org/zh/changelog.html').then(data => data.text());
            const result = (text.match('<h2 id=".*">(.*)</h2>')[1]);
            console.info("当前echarts版本:", result);
            return result;
        }

        async function parseOptionProps(props, i = 0) {
            if (props.length <= i) {
                console.info('全部解析完成');
                 let v = await getVersion();
                download(`echarts-option.${v}.json`, JSON.stringify(OPTION), 'json');
            } else {
                let objs = props[i++];
                let url = objs.url;
                //width=300,height=200,
                let s = window.open(url, '_blank', 'top=100px,left=0px,titlebar=no');
                s.onload = () => {
                    try {
                        parseLevel0(objs, s.document);
                    } finally {
                        s.close();
                        console.info(`进度: ${i}/${props.length}`);
                        parseOptionProps(props, i);
                    }
                }
            }
        }

        parseOptionProps(window.OPTION.props);
    }
)();