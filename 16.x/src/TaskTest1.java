/**
 * 描述:
 * 作业题第一题
 *
 * @author dong
 * @date 2018-10-30 8:32
 */
public class TaskTest1 {
    public static void main(String[] args) {
        Person teacher = new Teacher("王老师",35);
        Teacher t = (Teacher) teacher;
        Person worker = new Worker("张工",45);
        Worker w = (Worker)worker;
        t.move();
        w.move();
        t.sound();
        w.sound();
    }




}
