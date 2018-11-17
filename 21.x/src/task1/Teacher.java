package task1;

/**
 * 描述:
 * 教师类
 *
 * @author dong
 * @date 2018-11-10 22:55
 */
public class Teacher {
    private String name;
    private int salary;

    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
