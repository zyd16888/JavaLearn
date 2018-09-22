public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("张三",23,74);
        s.display();
        s.setName("李四");
        s.display();
        Student s2 = new Student();
        s2.display();
    }
}
