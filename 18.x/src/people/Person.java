package people;

/**
 * 描述:
 *
 * @author dong
 * @date 2018-10-27 15:16
 */
public class Person {
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
