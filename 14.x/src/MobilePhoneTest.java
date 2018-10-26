/**
 * 描述:
 * 手机类测试
 *
 * @author dong
 * @date 2018-09-25 08:20
 */
public class MobilePhoneTest {
    public static void main(String[] args) {
        Phone m1 = new Phone("13700349999");
        m1.display();
        System.out.println("----------");
        MobilePhone m2 = new MobilePhone("15999999999","小米","001");
        m2.display();
        System.out.println("话费为："+m2.pay(20,0.1)+"元");

    }


}
