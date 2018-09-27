/**
 * 描述:
 * Teacher类，实现接口MoveAble
 * 16.5.1题
 *
 * @author dong
 * @date 2018-09-27 10:23
 */
public class Teacher extends Person implements MoveAble{
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void display() {

    }

    @Override
    public void move() {
        System.out.println("在讲台上走动");
    }
}
