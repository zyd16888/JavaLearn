package task;

/**
 * 描述:
 * 抽象类
 *
 * @author dong
 * @date 2018-10-24 16:28
 */
public abstract class  Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void speak();
}
