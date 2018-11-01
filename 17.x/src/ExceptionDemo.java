import java.util.Scanner;

/**
 * 描述:
 * 两个数字相除，捕获处理异常
 * 17.7
 *
 * @author dong
 * @date 2018-10-16 21:15
 */
public class ExceptionDemo {
    public void display(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = 0;
        try {
            k = divide(i, j);
        }
        catch (DividedException e){
            System.out.println("Exception is:" + e);
        }
        finally{
            System.out.println("k=" + k);
        }
    }

    public int divide(int i , int j )throws DividedException{
        if (j == 0){
            throw new DividedException("被零除");
        }
        return i/j;
    }
}
