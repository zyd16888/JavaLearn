import people.Person;
import people.Student;
import phone.OrdinalPhone;
import phone.Phone;
import phone.SmartPhone;

/**
 * 描述:
 * 19.5.1测试类
 *
 * @author dong
 * @date 2018-10-28 16:35
 */
public class Tset1 {
    public static void main(String[] args) {
        Phone phone = new SmartPhone("三星","16645897563","1555364445");
        Phone phone1 = new OrdinalPhone("Google","1547895654","pixe2");

        Person student = new Student("小明",24,59);
        student.buy(phone);

        student = new Student("小二",23,68);
        student.buy(phone1);

    }
}
