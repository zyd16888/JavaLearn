package chap03;

import java.util.Scanner;

/**
 * 描述:
 * 从键盘输入三个数字，输出最大数
 *
 * @author dong
 * @date 2018-11-28 18:00
 */
public class MaxNum {
    public static void main(String[] args) {
        int a = 0, b = 0 ,c = 0, max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("第一个数：");
        a = scanner.nextInt();
        System.out.println("第二个数：");
        b = scanner.nextInt();
        System.out.println("第三个数：");
        c = scanner.nextInt();
        if (a>b && a>c){
            max = a;
        }else if(b>c){
            max = b;
        }else {
            max = c;
        }
        System.out.println("最大数为："+max);
    }
}
