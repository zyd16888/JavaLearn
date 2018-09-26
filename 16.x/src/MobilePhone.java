/**
 * 描述:
 * MoveAble接口的手机类测试程序
 * 16.4
 * @author dong
 * @date 2018-09-26 16:50
 */
public class MobilePhone implements MoveAble{
    private String brand;
    private String code;

    public MobilePhone(String brand, String code) {
        this.brand = brand;
        this.code = code;
    }
    public void  print(){
        System.out.println("手机号码："+code);
    }

    @Override
    public void move(){
        System.out.println("跟着主人走！");
    }

}
