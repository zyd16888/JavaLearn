package chap06;

import java.util.Scanner;

/**
 * 描述:
 * 及格的学生成绩和不及格的学生成绩
 *
 * @author dong
 * @date 2018-11-28 18:20
 */
public class PassFile {
    public static void main(String[] args) {
        int SIZE = 5;
        double grade[] = new double[SIZE];
        int pass = 0;
        int fail = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入"+SIZE+"个学生的成绩");
        for (int i = 0; i<SIZE; i++){
            grade[i] = scanner.nextInt();
        }

        pass = pass(SIZE,grade);
        fail = fail(SIZE,grade);

        System.out.println("及格的学生有"+pass+"人");
        System.out.println("不及格的学生有"+fail+"人");

    }


    public static int pass(int SIZE,double grade[]){
        int pass = 0;
        System.out.println("及格的学生成绩：");
        for (int i = 0; i<SIZE;i++){
            if (grade[i]>=60){
                pass++;
                System.out.println(grade[i]);
            }
        }
        return pass;
    }

    public static int fail(int SIZE, double grade[]){
        int fail = 0;
        System.out.println("不及格的学生成绩：");
        for (int i=0 ; i<SIZE;i++){
            if (grade[i] < 60){
                fail++;
                System.out.println(grade[i]);
            }
        }
        return fail;
    }
}
