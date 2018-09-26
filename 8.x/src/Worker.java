public class Worker {
    String name;
    int age;
    int salary;
    String level;

    public Worker(String name, int age, int salary, String level) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.level = level;
    }

    void display(){
        System.out.println("工人姓名："+name);
        System.out.println("工人年龄："+age);
        System.out.println("工人工资："+salary);
        System.out.println("工人级别："+level);

    }
}
