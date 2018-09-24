/**
 * 描述:
 * 教师类
 *
 * @author dong
 * @date 2018-09-24 17:22
 */
public class Teacher extends Person {

    private double salary;
    private String professionfalTitle;

    public Teacher(String name, int age, double salary, String professionfalTitle) {
        super(name, age);
        this.salary = salary;
        this.professionfalTitle = professionfalTitle;
    }

}
