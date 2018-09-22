/*
 * 1~3分别代表长方形，方形，圆形；
 * 输入数字，统计桌子类型数量
 * */
import java.util.Scanner;

public class TableNum {
    public static void main(String[] args) {
        int Rectangle = 0 , Square = 0 , Circular = 0 ;
        int In = 0;
        for (; In != -1;){
            Scanner scanner = new Scanner(System.in);
            In = scanner.nextInt();
            if (In == 1) {
                Rectangle +=1;
            }else if (In == 2){
                Square +=1;
            }else if (In == 3){
                Circular +=1;
            }
        }
        System.out.println("长方形桌："+Rectangle+"个");
        System.out.println("方形桌："+Square+"个");
        System.out.println("圆形桌："+Circular+"个");

    }
}
