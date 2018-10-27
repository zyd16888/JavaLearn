package task3;

/**
 * 描述:
 * 测试类
 *
 * @author dong
 * @date 2018-10-27 11:02
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("张三",25,80000);
        s.display();
        try {
            s.setName("李四");
        } catch (IllegalNameException e) {
            System.out.println("发生异常"+e);
        }
        s.display();
    }
}
