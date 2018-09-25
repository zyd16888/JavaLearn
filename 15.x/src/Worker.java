/**
 * 描述:
 * 工人类
 *
 * @author dong
 * @date 2018-09-25 15:07
 */
public class Worker extends Person{

    private String grade;

    public Worker(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void display() {
        System.out.println("级别："+grade);
    }
}
