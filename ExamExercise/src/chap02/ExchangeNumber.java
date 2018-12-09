package chap02;

/**
 * 描述:
 * 编程实现两个数的交换
 *
 * @author dong
 * @date 2018-11-28 17:57
 */
public class ExchangeNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
