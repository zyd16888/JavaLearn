package shap14;

/**
 * 描述:
 * 继承、重写和上转型
 *
 * @author dong
 * @date 2018-11-28 18:37
 */
public class Inherit {
    public static void main(String[] args) {
        Person w = new Worker("张工",25,8000,"中级");
        w.display();
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }

}

/**
 * 描述:
 * 工人类
 *
 * @author dong
 * @date 2018-09-24 17:57
 */
class Worker extends Person {
    private int salary;
    private String grade;

    public Worker(String name, int age, int salary, String grade) {
        super(name, age);
        this.salary = salary;
        this.grade = grade;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("工资："+salary);
        System.out.println("级别："+grade);
    }

}
