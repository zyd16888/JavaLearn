package onclass;

/**
 * 描述:
 *
 * @author dong
 * @date 2018-10-23 8:45
 */
public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void cry() {
        System.out.println("汪汪。。。");
    }

    public void display(){
        System.out.println("001");
    }
}
