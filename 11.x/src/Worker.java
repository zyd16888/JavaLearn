public class Worker {
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

    public double annualIncome(double payroll, int workTime){
        return payroll + workTime * 20;
    }
    public double annualIncome(double monthlySalary){
        return monthlySalary*12;
    }

    void display(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("工资："+salary);
        System.out.println("级别："+grade);
        table.print();
    }
}
