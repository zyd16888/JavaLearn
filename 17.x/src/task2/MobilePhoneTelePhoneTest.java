package task2;

/**
 * 描述:
 * 16.5.4题
 * 测试类
 *
 * @author dong
 * @date 2018-10-16 15:13
 */
public class MobilePhoneTelePhoneTest {
    public static void main(String[] args) {
        MobilePhone m2 = new MobilePhone("123456789",-300,1,30,20);
        try {
            System.out.println(m2.pay());
        } catch (PayException e) {
            System.out.println("出现异常"+e);
        }

        Telephone t1 = new Telephone("123456789",400,1,50);
        System.out.println(t1.pay());
    }
}
