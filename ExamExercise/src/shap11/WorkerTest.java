package shap11;

import java.util.Scanner;

/**
 * 描述:
 * 构造方法和重载
 *
 * @author dong
 * @date 2018-11-28 18:30
 */
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
class Worker {
    private String name;
    private int age;
    private double salary;
    private String grade;
    private TableInfo table ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public TableInfo getTable() {
        return table;
    }

    public void setTable(TableInfo table) {
        this.table = table;
    }

    public Worker(String name, int age, double salary, String grade, TableInfo table) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.grade = grade;
        this.table = table;
    }

    public int annualIncome(int payroll, int workTime,int  unitPrice){
        return payroll + workTime * unitPrice;
    }
    public int annualIncome(int monthlySalary){
        return monthlySalary*12;
    }

    void display(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("工资："+salary);
        System.out.println("级别："+grade);
        //table.print();
    }
}

class TableInfo {
    String shape;
    int legs;
    int hight;

    public TableInfo(String shape,int legs,int hight){
        this.shape = shape;
        this.hight = hight;
        this.legs = legs;

    }

    public void print(){
        System.out.println("桌子形状："+shape);
    }
    public double tableArea(int r){
        return 3.14*r*r;
    }
    public double tableArea(int a,int b){
        return a*b;
    }
}
