package task;

/**
 * 描述:
 * 工人类
 *
 * @author dong
 * @date 2018-10-24 16:40
 */
public class Worker extends Person {

    @Override
    void speak() {
        System.out.println(super.getName()+"说休息一会儿！");
    }
}
