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

    public void display(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }

    /**
     * @param obj p
     * @return name
     */
    @Override
    public boolean equals(Object obj){
        Person p = (Person)obj;
        return name.equals(p.name);
    }

}
