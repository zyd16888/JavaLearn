/**
 * 描述:
 * 手机类测试
 *
 * @author dong
 * @date 2018-09-25 08:20
 */
public class MobilePhoneTest {
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("13700000000","三星","142256188705064589");
        m.display();
        System.out.println("话费为："+m.pay(20,0.1)+"元");

    }


}
