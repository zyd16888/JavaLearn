/**
 * 描述:
 * 向上转型对象测试类
 *
 * @author dong
 * @date 2018-09-23 16:11
 */
public class StudentTeacherTest2 {
    public static void main(String[] args) {
        Person p =new Person("张三",23);
        p.display();
        p = new Student("张三",23,86);
        p.display();
        p = new Teacher("王老师",45,5200);
        p.display();
    }
}
