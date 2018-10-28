package task3;

import train.ProcessAble;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * 登录类处理
 *
 * @author dong
 * @date 2018-10-28 17:14
 */
public class LoginProcess implements ProcessAble {
    @Override
    public Map doProcess(Map m) {
        Map resultMap = new HashMap();
        String a = (String) m.get("username");
        String b = (String) m.get("password");
        String a1 = (String) m.get("usernameIn");
        String b2 = (String) m.get("passwordIn");

        if (a.equals(a1) && b.equals(b2)){
            resultMap.put("result","登录成功");
        }else {
            resultMap.put("result","登录失败");
        }

        return resultMap;
    }
}
