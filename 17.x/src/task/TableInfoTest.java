package task;

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
        RoundTable t1 = new RoundTable(3,100,1);
        RectangelTable t2 = new RectangelTable(4,100,80.0,60.0);

        try {
            System.out.println("圆桌面积"+t1.getArea());
        } catch (AreaException e) {
            System.out.println("程序发生异常："+e);
        }

        try {
            System.out.println("方桌面积"+t2.getArea());
        }catch (AreaException e){
            System.out.println("程序发生异常："+e);
        }

    }
}
