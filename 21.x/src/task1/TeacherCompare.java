package task1;

import java.util.Comparator;

/**
 * 描述:
 * 教师比较器类
 *
 * @author dong
 * @date 2018-11-11 14:57
 */
public class TeacherCompare implements Comparator<Teacher> {
    public int compare(Teacher teacher1, Teacher teacher2){
        double salary1,salary2;
        salary1 = teacher1.getSalary();
        salary2 = teacher2.getSalary();

        if(salary1>salary2){
            return -1;
        }else if(salary1<salary2){
            return 1;
        }else {
            return 0;
        }
    }

}
