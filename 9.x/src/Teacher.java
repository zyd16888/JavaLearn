public class Teacher {
    private String name;
    private int age;
    private double salary;
    private String professionalTitle;

    public Teacher(String name, int age, double salary, String professionalTitle) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.professionalTitle = professionalTitle;
    }

    public Teacher(String name){
        this.name = name;
        this.age = 0;
        this.salary = 0;
        this.professionalTitle = "";
    }

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

    public String getProfessionalTitle() {
        return professionalTitle;
    }

    public void setProfessionalTitle(String professionalTitle) {
        this.professionalTitle = professionalTitle;
    }

    public void display(){
        System.out.println("姓名："+name);
        System.out.println("工资："+salary);
        System.out.println("年龄："+age);
        System.out.println("职称:"+professionalTitle);

    }
}
