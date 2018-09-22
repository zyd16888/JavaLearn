public class Student_Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23,74);
        s1.display();
        Student s2 = new Student("李四",20,65);
        s2.display();
        Student s3 = new Student("王五",21,93);
        s3.display();

        System.out.println("学生人数："+Student.getCounter());

        Student s4 = Student.getInstance();
        Student s5 = Student.getInstance();
        System.out.println(s4 == s5);

    }
}
