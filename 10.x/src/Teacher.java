public class Teacher {
    private String name;
    private int age;
    private double salary;
    private String professionaTitle;
    private TableInfo table;

    public Teacher(String name, int age, double salary, String professionaTitle, TableInfo table) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.professionaTitle = professionaTitle;
        this.table = table;
    }

    public void display(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("工资："+salary);
        System.out.println("职称："+professionaTitle);
        table.print();
    }
}
