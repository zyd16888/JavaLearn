/**
 * @author dong
 */
public class StudentTeacherTest {
    public static void main(String[] args) {
        Person p = new Person("张三",23);
        p.display();
        Student s = new Student("张三",23,86);
        s.display();
        Teacher t = new Teacher("王老师",45,5200);
        t.display();
    }
}
