package task;

/**
 * 描述:
 * 教师类
 *
 * @author dong
 * @date 2018-10-24 16:34
 */
public class Teacher extends Person {

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
