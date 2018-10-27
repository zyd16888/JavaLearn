import people.Student;
import people.Worker;
import phone.MobilePhone;
import table.TableInfo;

/**
 * 描述:
 * 测试类
 * 18.2
 * 18.5
 * 18.5.2
 *
 * @author dong
 * @date 2018-10-27 15:27
 */
public class Test {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Sony","123456789");
        Student s = new Student("张三",23,86,phone);
        s.display();
        TableInfo table = new TableInfo(4,5);
        Worker w = new Worker("李四",55,"总工",table);
        w.display();
    }
}
