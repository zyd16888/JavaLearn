import people.Student;
import phone.MobilePhone;

/**
 * 描述:
 * 测试类
 * 18.2
 * 18.5
 *
 * @author dong
 * @date 2018-10-27 15:27
 */
public class Test {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Sony","123456789");
        Student s = new Student("张三",23,86,phone);
        s.display();
    }
}
