/**
 * 描述:
 * 电话类
 *
 * @author dong
 * @date 2018-09-25 08:13
 */
public abstract class Phone {
    private String code;

    public Phone(String code) {
        this.code = code;
    }

    public abstract void display();

}
