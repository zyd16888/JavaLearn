package people;

import phone.MobilePhone;

/**
 * 描述:
 * 学生类
 * 18.1
 * 18.3
 *
 * @author dong
 * @date 2018-10-27 15:20
 */
public class Student extends Person {
    private double grade;
    private MobilePhone phone;

    public Student(String name, int age, double grade,MobilePhone phone) {
        super(name, age);
        this.grade = grade;
        this.phone = phone;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("学生成绩："+grade);
        phone.print();
    }
}
