/**
 * 描述:
 * 教师类
 *
 * @author dong
 * @date 2018-09-25 15:02
 */
public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("工资："+salary);
    }
}
