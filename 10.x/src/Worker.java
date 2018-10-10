/**
 * @author dong
 * @date 2018-10-10 16:31
 */
public class Worker {
    private String name;
    private int age;
    private int salary;
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

    public void setSalary(int salary) {
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

    public Worker(String name, int age, int salary, String grade, TableInfo table) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.grade = grade;
        this.table = table;
    }

    void display(){
        System.out.println("工人姓名："+name);
        System.out.println("工人年龄："+age);
        System.out.println("工人工资："+salary);
        System.out.println("工人级别："+grade);
        System.out.println(this.name+"拥有一张"+table.shape+"的桌子");
        //table.print();
    }
}
