import java.util.Scanner;

public class StudentInfo6_3 {
    public static void main(String[] args) {
        int SIZE = 5;
        double grade[] = new double[SIZE];

        System.out.println("请输入"+SIZE+"个学生的成绩");
        for (int i=0;i<SIZE;i++){
            grade[i] = input();

        }

        System.out.println("平均成绩："+average(grade,SIZE));
        for (int i = 0; i<SIZE;i++){
            System.out.println("第"+(i+1)+"学生成绩："+grade[i]);
        }
    }

    public static double input(){
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextInt();
    }

    public static double average(double grade[] , int size){
        double averageGrade = 0;
        for (int i = 0;i<size;i++){
            averageGrade = averageGrade + grade[i];

        }
        averageGrade = averageGrade / size ;

        return averageGrade;

    }

}
