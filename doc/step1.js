(function() {
        function parseSeriesList(option, seriesList) {
            seriesList.forEach(node=>{
                    let name = node.textContent.match(/: (\w+),/)[1];
                    //name = 'series'+name.slice(0,1).toUpperCase() + name.slice(1);
                    let prop = {
                        order: 0,
                        url: 'https://echarts.apache.org/zh/option.html#series-' + name,
                        name: name + 'Series',
                        description: null,
                        types: ['object'],
                        defaultValue: null,
                        props: []
                    }
                    option.props.push(prop);
                }
            );
        }
        console.info('开始初始化根节点 记得展开一次series与收起所有');
        let option = {
            order: 1,
            url: 'https://echarts.apache.org/zh/option.html',
            name: 'option',
            description: 'Eachrts Option Object',
            types: ['Object'],
            defaultValue: null,
            props: []
        };
        let order = 1;
        document.querySelectorAll('.el-tree>.el-tree-node>.el-tree-node__content>.doc-nav-item').forEach(node=>{
                //title: {...}|visualMap: [{...}]|options ...
                let prop = {
                    order: order++,
                    url: 'https://echarts.apache.org/zh/option.html#',
                    name: null,
                    description: null,
                    types: null,
                    defaultValue: null,
                    props: []
                }
                let s = node.textContent.slice(0, -1);
                if (s.indexOf(': ') !== -1) {
                    let kv = s.split(':');
                    let v = kv[1].trim();
                    prop.name = kv[0];
                    if (v === '{...}') {
                        prop.types = ['Object'];
                    } else if (v === '[{...}]') {
                        prop.types = ['Array'];
                    } else {
                        try {
                            eval("prop.defaultValue = " + v);
                            prop.types = [typeof (prop.defaultValue)];
                        } catch (err) {
                            eval("prop.defaultValue = '" + v + "'");
                            prop.types = ['string'];
                            console.info('处理不规范默认值: ' + prop.defaultValue);
                        }
                    }
                } else {
                    let kv = s.split(' ');
                    prop.name = kv[0];
                    prop.types = ['Object'];
                }
                prop.url += prop.name;
                option.props.push(prop);
                //由于series在文档中按图表类型进行二级目录查看 故做特殊处理
                if (prop.name === 'series') {
                    //for(let i = Date.now()+1000;Date.now()<i;){}
                    //document.querySelector('#ec-doc-main > section > aside > div.doc-nav > div.el-tree > div:nth-child(' + prop.order + ')>.el-tree-node__content>.el-icon-caret-right').click();

                    let seriesList = document.querySelectorAll('#ec-doc-main > section > aside > div.doc-nav > div.el-tree > div:nth-child(' + prop.order + ')>div.el-tree-node__children>.el-tree-node>.el-tree-node__content>.doc-nav-item>span:first-child');
                    console.info('额外添加series-*为一级对象, 数量:' + seriesList.length);
                    parseSeriesList(option, seriesList);
                }
            }
        );
        window.OPTION = option;
        console.info('初始化根节点结束');
    }
)();