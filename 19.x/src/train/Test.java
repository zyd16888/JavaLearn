package train;

/**
 * 描述:
 * 测试类
 * 19.13
 *
 * @author dong
 * @date 2018-10-27 17:59
 */
public class Test {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.run(
                new AddInput(),
                new AddProcess(),
                new AddOutput()
        );
    }
}
