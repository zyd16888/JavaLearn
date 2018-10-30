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
        RectangelTable t2 = new RectangelTable(4,100,60.0,40.0);

        System.out.println("圆桌面积："+t1.getArea());
        System.out.println("圆桌周长："+t1.getPerimeter());
        //t1.move();

        System.out.println("方桌面积："+t2.getArea());
        System.out.println("方桌周长："+t2.getPerimeter());
        //t2.move();
    }
}
