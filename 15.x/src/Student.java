/**
 * 描述:
 * 学生类
 *
 * @author dong
 * @date 2018-09-25 8:21
 */
public class Student extends Person {
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void display(){
        System.out.println("学生成绩："+grade);
    }
}
