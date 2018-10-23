package onclass;

/**
 * 描述:
 *
 * @author dong
 * @date 2018-10-23 8:50
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Cat("tom");
        a.cry();

        a = new Dog("jd");
        a.cry();
        ((Dog) a).display();
    }
}
