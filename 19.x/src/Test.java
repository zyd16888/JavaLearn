import phone.MobilePhone;
import people.Person;
import people.Student;
import phone.Phone;

/**
 * 描述:
 * 19.5
 *
 * @author dong
 * @date 2018-10-27 17:00
 */
public class Test {
    public static void main(String[] args) {
        Phone phone = new MobilePhone("三星","10222222222");
        Person s = new Student("张三",23,86);
        s.buy(phone);
    }
}
