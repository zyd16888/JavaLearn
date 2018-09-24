/**
 * @author dong
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){
        this("",0);
        System.out.println("无参数实例化Person类完成");
    }

    public void display(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("有参数实例化Person类完成");
    }
}
