/*
 * 3.5.2
 * 比较两个数
 * 由大到小输出
 * */
import java.util.Scanner;

public class ComparativeNum {
    public static void main(String[] args) {
        int a;
        int b;


        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数：");
        a =  scanner.nextInt();
        System.out.println("输入第二个数：");
        b = scanner.nextInt();

        if (a>b){
            System.out.println(a+">"+b);

        }else {
            System.out.println(b+">"+a);
        }
    }
}
