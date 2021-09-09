import com.alibaba.fastjson.JSON;
import com.xmjz.echarts.OptionHelper;
import com.xmjz.echarts.nativebean.option.Brush;

import java.util.Arrays;

public class Echarts {
    public static void main(String[] args) {
        Object parse = JSON.parse("");
        Brush brush = new Brush();
        brush.setToolbox(Arrays.asList("box", "asd"));
    }
}