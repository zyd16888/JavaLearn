/**
 * 描述:
 * 学生测试类
 *
 * @author dong
 * @date 2018-10-09 8:45
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23,74);
        Student s2 = new Student("张三1",23,74);
        s1.beSame(s2.getName());
        s2.beSame(s1.getName(),s1.getAge());
        s1.beSame(s2);
        s2.beSame(s1);
    }
}
