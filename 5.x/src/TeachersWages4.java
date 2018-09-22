import java.util.Scanner;

public class TeachersWages4 {
    public static void main(String args[]){
        int SIZE = 6;
        int wage[] = new int[SIZE];
        int k = 0;

        System.out.println("请输入6个教师的工资：");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i<SIZE;i++){
            wage[i] = scanner.nextInt();
        }

        for (int i=0; i<6; i++ ){
            for (int j=i+1; j<6; j++){
                if (wage[i]>wage[j]){
                    k = wage[i];
                    wage[i] = wage[j];
                    wage[j] = k;
                }
            }
        }
        System.out.println("排序后的数组为：");
        for(int a:wage)
            System.out.println(a);
    }
}
