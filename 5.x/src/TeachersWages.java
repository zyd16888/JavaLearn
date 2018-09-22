import java.util.Scanner;

public class TeachersWages {
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


    }
}
