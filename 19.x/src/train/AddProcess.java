package train;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * 加法处理类
 * 19.11
 *
 * @author dong
 * @date 2018-10-27 17:50
 */
public class AddProcess implements ProcessAble{
    @Override
    public Map doProcess(Map m) {
        Map resultMap = new HashMap();
        Integer a = (Integer) m.get("PARA1");
        Integer b = (Integer) m.get("PARA2");

        Integer c = a + b;
        resultMap.put("RESULT",c);

        return resultMap;

    }
}
