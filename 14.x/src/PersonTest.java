/**
 * 描述:
 * 测试Person重写的Object类
 *
 * @author dong
 * @date 2018-09-23 16:26
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 20);
        Person p2 = new Person("张三", 20);
        System.out.println(p1.equals(p2));
    }
}
