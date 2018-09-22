import java.util.Scanner;

public class StudentGrade6_5_2 {

    public static void main(String[] args) {
        int SIZE = 5;
        double grade[] = new double[SIZE];
        int pass = 0;
        int fail = 0;


        System.out.println("请输入"+SIZE+"个学生的成绩");
        for (int i = 0; i<SIZE; i++){
            grade[i] = input();
        }

        pass = pass(SIZE,grade);
        fail = fail(SIZE,grade);

        System.out.println("及格的学生有"+pass+"人");
        System.out.println("不及格的学生有"+fail+"人");

    }

    public static int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int pass(int SIZE,double grade[]){
        int pass = 0;
        System.out.println("及格的学生的成绩：");
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
