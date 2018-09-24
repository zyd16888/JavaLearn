public class Student extends Person{
    private double grade;

    public Student(String name, int age, double grade) {
        super(name,age);
        this.grade = grade;
    }
}
