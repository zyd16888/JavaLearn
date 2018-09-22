public class WorkerTest {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        TableInfo t = new TableInfo("正方形",4,50);
        Worker w = new Worker("赵四",25,5000,"三级",t);
        a = w.annualIncome(5000);
        b = w.annualIncome(2000,2400);
        w.display();
        System.out.println("按工时年收入为："+b);
        System.out.println("月付年收入为："+a);

    }
}
