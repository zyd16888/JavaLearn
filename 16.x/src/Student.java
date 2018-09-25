import javax.naming.Name;

/**
 * 描述:
 * 学生类
 *
 * @author dong
 * @date 2018-09-25 15:42
 */
public class Student extends Person implements MoveAble {
    private double grade;


    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void move() {
        System.out.println("每天行走方式移动");
    }

    @Override
    public void display() {
        System.out.println("学生成绩"+grade);
    }
}
