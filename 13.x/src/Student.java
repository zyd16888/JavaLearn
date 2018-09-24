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
}
