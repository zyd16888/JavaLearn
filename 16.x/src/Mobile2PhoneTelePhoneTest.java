/**
 * 描述:
 * 16.5.4题
 * 测试类
 *
 * @author dong
 * @date 2018-10-16 15:13
 */
public class Mobile2PhoneTelePhoneTest {
    public static void main(String[] args) {
        MobilePhone2 m2 = new MobilePhone2("123456789",300,1,30,20);
        System.out.println(m2.pay());

        Telephone t1 = new Telephone("123456789",400,1,50);
        System.out.println(t1.pay());
    }
}
