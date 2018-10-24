package task;

/**
 * 描述:
 * 测试类
 *
 * @author dong
 * @date 2018-10-24 16:35
 */
public class Test {
    public static void main(String[] args) {
        Person t = new Teacher();
        t.setName("王老师");
        t.speak();

        Person w = new Worker();
        w.setName("张工");
        w.speak();

    }
}
