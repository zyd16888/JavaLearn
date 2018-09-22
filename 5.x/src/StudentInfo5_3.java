import java.util.Scanner;

public class StudentInfo5_3 {
    public static void main(String[] args) {
        int SIZE = 5;
        double grade[] = new double[SIZE];
        int pass = 0;
        int fail = 0;

        System.out.println("请输入"+SIZE+"个学生成绩");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<SIZE; i++){
            grade[i] = scanner.nextDouble();
        }

        System.out.println("及格学生的成绩：");
        for (int i = 0; i<SIZE;i++){
            if (grade[i]>=60){
                pass++;
                System.out.println(grade[i]);
            }
        }

        System.out.println("不及格的学生成绩：");
        for (int i=0 ; i<SIZE;i++){
            if (grade[i]<60){
                fail++;
                System.out.println(grade[i]);
            }
        }

        System.out.println("及格的学生有"+pass+"人");
        System.out.println("不及格的学生有"+fail+"人");

    }
}
