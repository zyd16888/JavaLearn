/*
* 猜数字
* */
import java.util.Scanner;

public class GuessingNum {
    public static void main(String[] args) {
        int x;
        int y;
        x = 1+(int)(Math.random()*100);
        Scanner scanner = new Scanner(System.in);
//        System.out.println(x);
        for (int i=0;i<3;i++){
            y = scanner.nextInt();
            if (x==y){
                System.out.println("猜中了");
                break;
            }else if (x>y){
                System.out.println("猜错了,输入的数字太小了");
            }else if (x<y){
                System.out.println("猜错了,输入的数字太大了");
            }
        }
    }
}
