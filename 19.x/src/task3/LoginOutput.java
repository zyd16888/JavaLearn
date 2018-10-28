package task3;

import train.Outputable;

import java.util.Map;

/**
 * 描述:
 * 登录输出类
 *
 * @author dong
 * @date 2018-10-28 17:25
 */
public class LoginOutput implements Outputable {
    @Override
    public void output(Map m) {
        String c = (String) m.get("result");
        System.out.println(c);
    }
}
