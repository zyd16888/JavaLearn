package phone;

/**
 * 描述:
 * 智能手机类
 * 19.5.1
 *
 * @author dong
 * @date 2018-10-28 16:25
 */
public class SmartPhone extends MobilePhone {
    private String weChatCode;

    public SmartPhone(String brand, String code, String weChatCode) {
        super(brand, code);
        this.weChatCode = weChatCode;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("微信号："+weChatCode);
    }
}
