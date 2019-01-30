/**
 * 描述:
 * 条件运算符
 *
 * @author dong
 * @date 2019-01-30 11:43
 */
public class Condition {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = (a==1) ? 20 : 30;
        System.out.println("b="+b);

        b = (a==10) ? 20 :30;

        System.out.println("b="+b);
        //int的最大值
        System.out.println(Integer.MAX_VALUE);
        //int的最小值
        System.out.println(Integer.MIN_VALUE);

    }
}
