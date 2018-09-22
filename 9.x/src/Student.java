/*
* 演示学生类Student
* 包含属性、构造方法、置取方法、普通方法
* */
public class Student {
    private String name;
    private int age;
    private double grade;
//带参数构造方法
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
//无参数构造方法
    public Student() {
        this("",0,0);
//        this.name = "";
//        this.age = 0;
//        this.grade = 0;
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

    public void display(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("成绩："+grade);
    }
}

