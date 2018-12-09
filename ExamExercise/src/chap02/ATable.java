package chap02;

/**
 * 描述:
 * 显示一张桌子的信息，要求定义变量来保存桌子的信息
 *
 * @author dong
 * @date 2018-11-28 17:54
 */
public class ATable {
    public static void main(String[] args){
        String shape = "圆形";
        int legs = 4;
        double height =  1.5;
        double area = 4.56;

        System.out.println("桌子的形状：" + shape);
        System.out.println("腿数：" + legs + ".");
        System.out.println("高度：" + height);
        System.out.println("桌面面积：" + area);
    }
}
