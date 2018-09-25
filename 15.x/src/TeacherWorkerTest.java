/**
 * 描述:
 * 教师和工人的测试类
 *
 * @author dong
 * @date 2018-09-25 15:11
 */
public class TeacherWorkerTest {
    public static void main(String[] args) {
        Teacher teacher = new  Teacher("王老师",23,5000);
        Worker worker = new Worker("李工",48,"工程师");
        teacher.display();
        worker.display();
    }
}
