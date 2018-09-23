public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age,double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("工资："+salary);
    }
}
