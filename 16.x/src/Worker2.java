/**
 * 描述:
 * Worker类实现SoundAble接口
 * 16.5.2题
 *
 * @author dong
 * @date 2018-09-27 11:17
 */
public class Worker2 extends Person implements SoundAble {
    public Worker2(String name, int age) {
        super(name, age);
    }



    @Override
    public void sound() {
        System.out.println("噪声太大听不清楚！");
    }
}
