package task3;

/**
 * 描述:
 * 学生类
 *
 * @author dong
 * @date 2018-10-27 10:37
 */
public class Student {
    private String name;
    private int age;
    private double grade;


    public Student() {
        this("",0,0);
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    @SuppressWarnings("AlibabaUndefineMagicConstant")
    public void setName(String name)throws IllegalNameException {
        if (checkName(name,'#')){
            this.name = name;
        }else {
        throw new IllegalNameException("姓名不合法");
        }
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

    private boolean checkName(String name,char ch){
        int index = name.indexOf(ch);
        return index < 0;
    }

    public void display(){
        System.out.println("姓名："+name);
    }
}
