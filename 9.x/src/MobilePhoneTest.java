/**
 * 描述:
 * 手机测试类
 *
 * @author dong
 * @date 2018-09-26 15:16
 */
public class MobilePhoneTest {
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("华为","12345678999");
        m.display();
        m.setCode("15900001234");
        System.out.println("修改后的号码为："+m.getCode());
    }
}
