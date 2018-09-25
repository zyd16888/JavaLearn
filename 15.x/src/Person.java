/**
 * 描述:
 * 抽象类
 *
 * @author dong
 * @date 2018-09-25 8:17
 */
public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 抽象类
     */
    public abstract void display();
}
