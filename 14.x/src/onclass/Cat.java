package onclass;

/**
 * 描述:
 * 猫类
 * 继承于Animal
 *
 * @author dong
 * @date 2018-10-23 8:42
 */
public class Cat extends Animal{

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void cry() {
        System.out.println("喵喵。。。");
    }

}
