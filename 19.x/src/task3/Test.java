package task3;

import train.MyFrame;


/**
 * 描述:
 * 测试类
 *
 * @author dong
 * @date 2018-10-28 17:26
 */
public class Test {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.run(
                new LoginInput(),
                new LoginProcess(),
                new LoginOutput()
        );
    }
}
