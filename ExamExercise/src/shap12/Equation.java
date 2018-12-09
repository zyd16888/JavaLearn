package shap12;

import java.util.Scanner;

/**
 * 描述:
 * 一元二次方程的计算
 *
 * @author dong
 * @date 2018-11-28 18:33
 */
public class Equation {
    public static int c;

    public static double calculating1(int a, int b){
        return (-b+Math.sqrt(b*b-4*a*c))/(2.0*a);
    }

    public static double calculating2(int a, int b){
        return (-b-Math.sqrt(b*b-4*a*c))/(2.0*a);
    }

    static Scanner sc = new Scanner(System.in);
    public static int input(){
        return sc.nextInt();
    }

    public static void judge(int a, int b){
        int j = b*b-4*a*c;
        if (j>0){
            display1(calculating1(a,b),calculating2(a,b));
        }else if (j == 0){
            display2(calculating1(a,b));
        }else {
            System.out.println("没有实根！");
        }
    }

    public static void display1(double k1, double k2){
        System.out.println("有两个不等的实根！");
        System.out.println("第一个实根是：" + k1);
        System.out.println("第二个实根是：" + k2);
    }

    public static void display2(double k1){
        System.out.println("有两个相等的实根！");
        System.out.println("实根是："+k1);
    }

    public static void main(String[] args) {
        int a1, b1, a2, b2;
        System.out.println("请输入一元二次方程的系数和常数项：");
        a1 = input();
        b1 = input();
        c = input();
        System.out.println("请再一次输入一元二次方程的系数和常数项：");
        a2 = input();
        b2 = input();
        c = input();
        judge(a1,b1);
        judge(a2,b2);

        System.out.println("第一个方程的常数项的值为：" + c);
        System.out.println("第二个方程的常数项的值为：" + c);

    }
}
