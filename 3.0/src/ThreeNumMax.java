import java.util.Scanner;

public class ThreeNumMax {
    public static void main(String[] args) {
        int a, b = 0 ,c = 0, max = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("第一个数：");
        a = scanner.nextInt();
        System.out.println("第二个数：");
        b = scanner.nextInt();
        System.out.println("第三个数：");
        c = scanner.nextInt();

        if (a>b && a>c){
            max = a;
        }else if(b>c){
            max = b;
        }else {
            max = c;
        }

        System.out.println("最大数为："+max);

    }
}
