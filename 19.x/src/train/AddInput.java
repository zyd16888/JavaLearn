package train;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * 加法输入
 * 19.10
 *
 * @author dong
 * @date 2018-10-27 17:46
 */
public class AddInput implements InputAble {
    @Override
    public Map input() {
        Map inputMap = new HashMap();
        inputMap.put("PARA1", 10);
        inputMap.put("PARA2", 20);
        return inputMap;
    }
}
