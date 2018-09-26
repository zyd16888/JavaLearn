public class Worker {
    private String name;
    private int age;
    private int salary;
    private String grade;

    /**
     * get与set方法
     * */
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

    public int getSalary() {
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

    /**
     * 构造方法
     * */

    public Worker(String name, int age, int salary, String grade) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.grade = grade;
    }

    public Worker() {
        this("",0,0, "");
    }

    void display(){
        System.out.println("工人姓名："+name);
        System.out.println("工人年龄："+age);
        System.out.println("工人工资："+salary);
        System.out.println("工人级别："+grade);
    }
}
