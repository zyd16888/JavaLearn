public class TeacherTest {
    public static void main(String[] args) {
        Teacher zhang = new Teacher("张老师",40,4050,"副教授");
        Teacher wang = new Teacher("王老师");
        zhang.display();
        wang.display();
        wang.setSalary(3800);
        wang.display();
    }
}
