/**
 * 描述:
 * 实现比较器的学生类
 * 21.10
 *
 * @author dong
 * @date 2018-11-06 21:16
 */
public class Student2 implements Comparable<Student2> {
    private String name;
    private int age;
    private double grade;

    public Student2(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student2 o) {
        double grade1,grade2;
        grade1 = this.getGrade();
        grade2 = o.getGrade();

        if (grade1>grade2){
            return 1;
        }else if(grade1<grade2){
            return -1;
        }else {
            return 0;
        }
    }
}
