/**
 * 描述:
 * Worker类，继承于Person，实现接口MoveAble
 * 16.5.1题
 *
 * @author dong
 * @date 2018-09-27 10:29
 */
public class Worker extends Person implements MoveAble {

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println("在车间走动");
    }

    @Override
    public void display() {

    }
}
