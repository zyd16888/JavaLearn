package chap03;

import java.util.Scanner;

/**
 * 描述:
 * 从键盘输入两个数字，按照由大到小顺序输出
 *
 * @author dong
 * @date 2018-11-28 17:58
 */
public class NumSorting {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("第一个数：");
        a =  scanner.nextInt();
        System.out.println("第二个数：");
        b = scanner.nextInt();
        if (a>b){
            System.out.println(a+">"+b);

        }else {
            System.out.println(b+">"+a);
        }
    }
}
