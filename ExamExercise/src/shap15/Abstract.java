package shap15;

/**
 * 描述:
 * 抽象类和抽象方法
 *
 * @author dong
 * @date 2018-11-28 18:40
 */
public class Abstract {
    public static void main(String[] args) {
        Person t = new Teacher();
        t.setName("王老师");
        t.speak();

        Person w = new Worker();
        w.setName("张工");
        w.speak();

    }
}

abstract class  Person {
    private String name;
    public String getName() {
        return name; }
    public void setName(String name) {
        this.name = name; }
    abstract void speak();
}
class Teacher extends Person {

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }


    @Override
    void speak() {
        System.out.println(this.getName()+"说上课！");
    }
}

class Worker extends Person {
    @Override
    void speak() {
        System.out.println(super.getName()+"说休息一会儿！");
    }
}