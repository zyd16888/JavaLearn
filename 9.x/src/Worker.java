public class Worker {
    private String name;
    private int age;
    private double salary;
    private String grade;

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

    void display(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("工资："+salary);
        System.out.println("级别："+grade);
    }
}
