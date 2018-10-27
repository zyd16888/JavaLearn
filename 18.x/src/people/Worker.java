package people;

import table.TableInfo;

/**
 * 描述:
 * 工人类
 * 18.5.1
 *
 * @author dong
 * @date 2018-10-27 16:06
 */
public class Worker extends Person {
    private String level;
    private TableInfo table;

    public Worker(String name, int age, String level,TableInfo table) {
        super(name, age);
        this.level = level;
        this.table = table;
    }

    @Override
    public void display() {
        super.display();
        table.print();
        System.out.println("级别："+level);
    }
}
