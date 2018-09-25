/**
 * 描述:
 * 电话类
 *
 * @author dong
 * @date 2018-09-25 08:13
 */
public class Phone {
    private String code;

    public Phone(String code) {
        this.code = code;
    }

    public void display(){
        System.out.println("号码："+code);
    }
}
