/**
 * 17.3
 * 异常处理
 *
 * @author dong
 */
public class MobilePhoneStudentTest {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Apple","13800000000");
        Student s = new Student("张三",23,74,phone);
        s.display();
           System.out.println("``````````````");
        phone.print();
    }
}
