package task1;


/**
 * 描述:
 * 测试类
 *
 * @author dong
 * @date 2018-11-11 15:32
 */
public class TeacherTest {
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
