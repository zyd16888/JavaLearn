/**
 * 描述:
 * Teacher类实现SoundAble接口
 * 16.5.2题
 *
 * @author dong
 * @date 2018-09-27 11:13
 */
public class Teacher2 extends Person implements SoundAble {
    public Teacher2(String name, int age) {
        super(name, age);
    }


    @Override
    public void sound() {
        System.out.println("正在讲课！");
    }
}
