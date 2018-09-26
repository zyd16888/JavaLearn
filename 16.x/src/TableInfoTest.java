/**
 * 描述:
 * TableInfo测试类
 * 16.15
 *
 * @author dong
 * @date 2018-09-26 17:49
 */
public class TableInfoTest {
    public static void main(String[] args) {
        RoundTable t1 = new RoundTable(3,100,30.0);
        RectangelTable t2 = new RectangelTable(4,100,40.0,60.0);

        System.out.println("圆桌面积"+t1.getArea());
        t1.move();

        System.out.println("方桌面积"+t2.getArea());
        t2.move();
    }
}
