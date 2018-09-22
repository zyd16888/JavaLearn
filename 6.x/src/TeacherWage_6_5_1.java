import java.util.Scanner;

public class TeacherWage_6_5_1 {
    public static void main(String[] args) {
        int SIZE = 6;
        int wage[] = new int[SIZE];

        System.out.println("请输入6个教师的工资：");
        for (int i = 0; i < SIZE; i++) {
            wage[i] = input();
        }

        System.out.println("第" + MAX(wage) + "位教师的工资最高，为" + wage[MAX(wage)-1]);
    }

    public static int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int MAX(int wage[]){
        int max = wage[0];
        int k = 0;

        for (int j = 0; j < 6; j++) {
            if (max < wage[j]) {
                max = wage[j];
                k = j+1;
            }
        }
        return k;
    }
}
