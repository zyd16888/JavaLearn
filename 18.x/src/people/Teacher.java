package people;

import table.TableInfo;

/**
 * 描述:
 * 教师类
 * 18.8
 *
 * @author dong
 * @date 2018-10-27 15:52
 */
public class Teacher extends Person {
    private double salary;
    private TableInfo officeTable;

    public Teacher(String name, int age, double salary, TableInfo officeTable) {
        super(name, age);
        this.salary = salary;
        this.officeTable = officeTable;
    }

    @Override
    public void display(){
        System.out.println("工资："+salary);
        officeTable.print();
    }
}
