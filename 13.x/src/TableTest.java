/**
 * 描述:
 * TableInfo 及其子类的测试程序
 * @author dong
 * @date 2018-09-24 16:09
 */
public class TableTest {
    public static void main(String[] args) {
        RoundTable t1 = new RoundTable(3,100,30.0);
        RectangleTable t2 = new RectangleTable(4,100,40.0,60.0);
        t1.print();
        t2.print();
    }
}
