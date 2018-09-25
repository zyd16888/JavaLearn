/**
 * 描述:
 * 桌子类及其子类测试
 *
 * @author dong
 * @date 2018-09-25 9:11
 */
public class TableTest {
    public static void main(String[] args) {
        RoundTable t1 = new RoundTable(3,100,30.0);
        RectagleTable t2 = new RectagleTable(4,100,40.0,60.0);
        System.out.println("圆桌面积："+t1.tableArea());
        System.out.println("方桌面积："+t2.tableArea());
    }
}
