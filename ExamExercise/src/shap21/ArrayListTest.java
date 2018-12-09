package shap21;
/*将5个教师信息存放到ArrayList集合中，并使用下面三种方法中的任意一种方法，完成对教师工资由高到低的排序。
        （1）冒泡排序算法
        （2）或定义教师比较器类TeacherComparator
        （3）或让Teacher类实现Comparable接口
        编写测试类，输出排序前的顺序和排序后的顺序。
        为类添加一个增加学生的方法，该方法的方法头如下：
public void addTeacher(Teacher t)
        为类添加一个删除学生的方法，该方法的方法头如下：
public void removeTeacher(Teacher t)
        然后修改测试类，添加一个陈老师，工资为9000。输出添加后的排序结果。之后从列表中删除张老师，再输出删除后的排序结果。
        */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 描述:
 * ArrayList数组，添加删除
 *
 * @author dong
 * @date 2018-11-28 19:21
 */
public class ArrayListTest {
    public static void main(String[] args) {
        TeacherArrayList tList = new TeacherArrayList();

        tList.createTeacher();

        System.out.println("排序前顺序：");
        System.out.println(tList.output());

        tList.sort();

        System.out.println("排序后顺序：");
        System.out.println(tList.output());

        Teacher t = new Teacher("陈老师",9000);
        tList.addTeacher(t);
        tList.sort();
        System.out.println("添加一个教师后的排序顺序：");
        System.out.println(tList.output());

        Teacher teacher = new Teacher("张老师",7800);
        tList.removeTeacher(teacher);
        tList.sort();
        System.out.println("删除一个教师后的排序顺序：");
        System.out.println(tList.output());

    }
}
/**
 * 描述:
 * 教师比较器类
 *
 * @author dong
 * @date 2018-11-11 14:57
 */
class TeacherCompare implements Comparator<Teacher> {
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

/**
 * 描述:
 * 教师类
 *
 * @author dong
 * @date 2018-11-10 22:55
 */
class Teacher {
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



/**
 * 描述:
 * 教师类的List集合
 *
 * @author dong
 * @date 2018-11-11 14:49
 */
class TeacherArrayList {
    private List<Teacher> teacherList;
    private int size;

    public TeacherArrayList() {
        size = 0;
        teacherList = null;
    }

    public void createTeacher(){
        String[] names = {"张老师","王老师","刘老师","李老师","孙老师"};
        int[] salarys = {7800,9800,6800,5800,8800};

        size = names.length;

        teacherList = new ArrayList<>();
        Teacher temp;

        for (int i=0; i<size; i++){
            temp = new Teacher(names[i], salarys[i]);
            teacherList.add(temp);
        }
    }

    public void sort(){
        TeacherCompare sc = new TeacherCompare();
        Collections.sort(teacherList,sc);
    }

    public String output(){
        StringBuilder teacherInfo = new StringBuilder();
        for (Teacher teacher : teacherList){
            teacherInfo.append("姓名："+teacher.getName()+"\t工资："+teacher.getSalary()+"\r\n");
        }
        return teacherInfo.toString();
    }

    public void  addTeacher(Teacher t){
        teacherList.add(t);
        size = teacherList.size();
    }

    public void removeTeacher(Teacher t){
        for (int i = 0; i < teacherList.size(); i++) {
            if(teacherList.get(i).getSalary() == t.getSalary() && teacherList.get(i).getName() == t.getName() ){
                teacherList.remove(teacherList.get(i));
            }
        }
    }

}
