public class Student extends Person{
    private double grade;
    
    public Student (String name,int age,double grade){
        super(name, age);
        this.grade = grade;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("成绩："+grade);
    }
}
