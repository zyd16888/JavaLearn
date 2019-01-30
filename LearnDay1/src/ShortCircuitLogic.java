/**
 * 描述:
 * 短路逻辑运算符
 *
 * @author dong
 * @date 2019-01-30 11:35
 */
public class ShortCircuitLogic {
    public static void main(String[] args) {
        int a = 5;
        boolean b = (a<4)&&(a++<10);
        System.out.println(b);
        System.out.println(a);
    }
}
