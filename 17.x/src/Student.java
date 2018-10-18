import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 17.2
 * 17.4
 * 17.5
 *
 * @author dong
 */
public class Student {
    private String name;
    private int age;
    private double grade;
    private MobilePhone myphone;

    public Student(String name,int age,double grade,MobilePhone myphone){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.myphone = myphone;
        this.myphone.setOwner(null);

    }

    public void getInfo(){
        int ch;
        try {
            FileInputStream ins = new FileInputStream("student.txt");
            while ((ch = ins.read())!= -1){
                System.out.println((char)ch);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("未找到文件，请重试！");
        }
        catch (IOException e){
            System.out.println("文件IO错误！");
        }

    }

    public void display(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("成绩："+grade);
//        myphone.print();
    }

    /**
     * 为配合程序17.9，增加的代码
     */
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
