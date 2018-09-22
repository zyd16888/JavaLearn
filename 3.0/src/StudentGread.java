import java.util.Scanner;

public class StudentGread {
    public static void main(String[] args) {
        double gread ;
        String result = null;

        System.out.print("请输入学生成绩：");
        Scanner sc = new Scanner(System.in);
            gread = sc.nextDouble();

        if (gread>=90){
            result = "优秀";
        }else if (gread>=75 && gread<90){
            result = "良好";
        }else if (gread>=60 && gread<75){
            result = "及格";
        }else if (gread<60) {
            result = "不及格";
        }

        System.out.println("考试结果："+ result);

    }
}
