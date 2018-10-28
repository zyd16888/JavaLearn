package people;

/**
 * 描述:
 * 20.2
 *
 * @author dong
 * @date 2018-10-28 18:13
 */
public class Person {
    private String name;
    private int age;
    public Person(){
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void display(){
        System.out.println("姓名："+name);
    }
}
