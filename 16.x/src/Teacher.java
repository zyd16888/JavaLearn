/**
 * 描述:
 * Teacher类，实现接口MoveAble
 * 16.5.1题
 *
 * @author dong
 * @date 2018-09-27 10:23
 */
public class Teacher extends Person implements MoveAble,SoundAble{
    public Teacher(String name, int age) {
        super(name, age);
    }


    @Override
    public void move() {
        System.out.println(getName()+"在讲台上走动!");
    }

    @Override
    public void sound() {
        System.out.println(getName()+"正在上课！");
    }
}
