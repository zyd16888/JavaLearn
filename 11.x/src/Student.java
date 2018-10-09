/**
 * 描述:
 * 学生类
 * 11.2
 *
 * @author dong
 * @date 2018-10-09 8:32
 */
public class Student {
    private String name;
    private int age;
    private double grade;

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

    public Student() {
        this.name = "";
        this.age = 0;
        this.grade = 0;
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public boolean beSame(String name){
        return name.equals(this.name);
    }

    public boolean beSame(String name,int age){
        boolean flag = name.equals(this.name);
        flag = flag && (age == this.age);
        return flag;
    }

    public boolean beSame(Student s2){
        return Boolean.parseBoolean(null);
    }

}
