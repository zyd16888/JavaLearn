/**
 * 描述:
 * 工人类
 *
 * @author dong
 * @date 2018-09-24 17:57
 */
public class Worker extends Person {
    private int salary;
    private String grade;

    public Worker(String name, int age, int salary, String grade) {
        super(name, age);
        this.salary = salary;
        this.grade = grade;
    }

}
