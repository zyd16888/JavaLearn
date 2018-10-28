import people.Person;
import people.Teacher;
import phone.OrdinalPhone;
import phone.Phone;

/**
 * 描述:
 * 19.5.2测试类
 *
 * @author dong
 * @date 2018-10-28 16:47
 */
public class Test2 {
    public static void main(String[] args) {
        Person t = new Teacher("王老师",45);
        Phone phone = new OrdinalPhone("华为","1548564852","mate20");
        t.buy(phone);
    }
}
