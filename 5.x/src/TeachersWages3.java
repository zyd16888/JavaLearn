import java.util.Scanner;

public class TeachersWages3 {
    public static void main(String args[]){
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
                k = j;
            }
        }

        wage[k] = wage[0];
        wage[0] = max;

        System.out.println("交换后的数组为：");
        for (int i = 0; i < 6 ; i++){
            System.out.println(wage[i]);
        }


    }
}
