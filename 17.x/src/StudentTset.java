import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 描述:
 * 学生测试类
 * 17.9
 * 17.10
 * 17.11
 *
 * @author dong
 * @date 2018-10-18 20:02
 */
public class StudentTset {
    public static void main(String[] args) {
        Student s = new Student("张三",23,74);

        int age = 0;
        while (age == 0){
            age = input();
        }
        s.setAge(age);
        s.display();
    }

    public static int input(){
        int age = 0;
        Scanner sc = new Scanner(System.in);

        try {
            age = sc.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("输入数据格式错误！");
        }

        return age;
    }
}
