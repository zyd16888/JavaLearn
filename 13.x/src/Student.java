public class Student extends Person{
    private double grade;
    private String schoolName;

    public Student(){
        System.out.println("无参数实例化Student类完成");
    }

    public Student(String name, int age, double grade,String schoolName) {
        super(name,age);
        this.grade = grade;
        this.schoolName = schoolName;
        System.out.println("有参数实例化Student类完成");
    }

    @Override
    public void display(){
        super.display();
        System.out.println("成绩："+grade);
        System.out.println("校名："+schoolName);
    }
}
