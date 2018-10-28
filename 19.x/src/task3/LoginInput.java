package task3;

import train.InputAble;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 描述:
 * 登陆输入类
 *
 * @author dong
 * @date 2018-10-28 16:55
 */
public class LoginInput implements InputAble {
    @Override
    public Map input() {
        Map inputMap = new HashMap();
        inputMap.put("username","zyd");
        inputMap.put("password","123456");

        System.out.println("请输入用户名：");
        inputMap.put("usernameIn",input2());
        System.out.println("请输入密码：");
        inputMap.put("passwordIn",input2());

        return inputMap;
    }

    Scanner sc = new Scanner(System.in);
    public String input2(){
        return sc.nextLine();
    }
}
