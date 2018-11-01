package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 描述:
 * 测试类
 *
 * @author dong
 * @date 2018-11-01 19:50
 */
public class TestMain {

    static Scanner sc  = new Scanner(System.in);
    static MyMath mt = new MyMath();
    public static void main(String[] args) {
        System.out.println("请输入被除数和除数：");
        dispaly();

    }

    public static void dispaly(){
        try {
            int i = sc.nextInt();
            int j = sc.nextInt();
            double k = mt.divide(i,j);
            System.out.println(i+"/"+j+"="+k);
        }catch (InputMismatchException e){
            System.out.println("请输入数值！");
        }catch (DividedException e){
            System.out.println("被零除！");
        }

    }

}
