package chap05;

import java.util.Scanner;

/**
 * 描述:
 * 数组排序替换
 *
 * @author dong
 * @date 2018-11-28 18:10
 */
public class Array {
    public static void main(String[] args) {
        int SIZE = 6;
        int wage[] = new int[SIZE];
        int k = 0;
        System.out.println("请输入6个教师的工资：");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i<SIZE;i++){
            wage[i] = scanner.nextInt();
        }
        int max = wage[0];
        for (int j = 0; j < 6; j++){
            if (max<wage[j]){
                max = wage[j];
                k = j+1;
            }
        }
        System.out.println("第"+k+"位教师的工资最高，为"+max);

        for (int i=0; i<SIZE; i++){
            for (int j=i; j<5; j++){
                if (wage[j]>wage[j+1]){
                    k = wage[j];
                    wage[j] = wage[j+1];
                    wage[j+1] = k;
                }
            }
        }
        System.out.println("排序后的数组为：");
        for(int a:wage)
            System.out.println(a);
    }
}
