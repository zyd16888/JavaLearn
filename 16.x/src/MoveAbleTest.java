/**
 * 描述:
 * 接口测试类
 * 16.3
 * @author dong
 * @date 2018-09-25 21:30
 */
public class MoveAbleTest {
    public static void main(String[] args) {
        Student s = new Student("张三",23,86);
        s.move();

        MoveAble m = new Student("张三",23,86);
        m.move();
    }
}
