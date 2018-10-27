package people;

/**
 * 描述:
 * 19.3
 *
 * @author dong
 * @date 2018-10-27 16:55
 */
public class Student extends Person {
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void display() {
        System.out.println("学生姓名："+getName());
    }
}
