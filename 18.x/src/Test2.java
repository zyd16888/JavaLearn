import people.Teacher;
import table.RectangleTable;
import table.TableInfo;

/**
 * 描述:
 * 18.9
 *
 * @author dong
 * @date 2018-10-27 15:58
 */
public class Test2 {
    public static void main(String[] args) {
        TableInfo table = new TableInfo(4,76);
        Teacher t = new Teacher("李老师",33,3423,table);
        t.display();
        table = new RectangleTable(4,87,40);
        t = new Teacher("张老师",43,6423,table);
        t.display();
    }
}
