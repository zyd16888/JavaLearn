/**
 * 描述:
 * MobilePhone测试类
 * 16.5
 * @author dong
 * @date 2018-09-26 16:54
 */
public class MobilePhoneTest {
    public static void main(String[] args) {
        MoveAble m;
        m = new Student("张三",23,86);
        m.move();

        m = new MobilePhone("Hk","13800000000");
        ((MobilePhone) m).print();
        m.move();
    }
}