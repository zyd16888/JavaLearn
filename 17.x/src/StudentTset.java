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
        Scanner sc = new Scanner(System.in);
        int age = 0;
        try {
            age = sc.nextInt();
        }
        catch (InputMismatchException ime){
            System.out.println("输入数据格式错误！");
        }
        s.setAge(age);
        s.display();
    }
}
