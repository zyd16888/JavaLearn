package homework2;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("输入圆桌的半径：");
        int r = sc.nextInt();
        System.out.println("输入方桌的长和宽：");
        int len = sc.nextInt();
        int width = sc.nextInt();

        RoundTable t1 = new RoundTable(3,100,r);
        RectangelTable t2 = new RectangelTable(4,100,len,width);

        try {
            System.out.println("圆桌面积："+t1.getArea());
        } catch (AreaException e) {
            System.out.println("圆桌的半径小于等于0！");
        } finally {
            System.out.println("圆桌的计算结束！");
        }

        try {
            System.out.println("方桌面积："+t2.getArea());
        }catch (AreaException e){
            System.out.println("方桌的长或宽小于等于0、或者长小于宽！");
        }finally {
            System.out.println("方桌的计算结束！");
        }

    }
}
