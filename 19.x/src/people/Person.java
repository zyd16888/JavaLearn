package people;

import phone.Phone;

/**
 * 描述:
 * 19.1
 *
 * @author dong
 * @date 2018-10-27 16:41
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void display(){
        System.out.println("姓名："+name);
    }
    public void buy(Phone phone){
        display();
        phone.print();
    }
}
