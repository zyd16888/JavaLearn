package people;

/**
 * 描述:
 * 教师类
 * 19.5.2
 *
 * @author dong
 * @date 2018-10-28 16:44
 */
public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void display() {
        System.out.println("教师姓名:"+getName());
    }
}
