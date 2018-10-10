import java.util.Scanner;

public class WorkerTest {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int payroll, workTime, unitPrice;
        int monthlySalary;
        TableInfo t = new TableInfo("圆形",4,50);
        Worker w = new Worker("张工",25,5000,"初级",t);

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入保底工资、年工时和单价：");
        payroll = scanner.nextInt();
        workTime = scanner.nextInt();
        unitPrice = scanner.nextInt();
        System.out.println("请输入月固定工资：");
        monthlySalary = scanner.nextInt();

        a = w.annualIncome(payroll,workTime,unitPrice);
        b = w.annualIncome(monthlySalary);


        //w.display();
        System.out.println("第一种方式的年收入是："+a);
        System.out.println("第二种方式的年收入是："+b);

    }
}
