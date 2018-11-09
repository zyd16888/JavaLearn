import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 描述:
 * 21.10
 * 班级类定义排序方法
 *
 * @author dong
 * @date 2018-11-06 21:25
 */
public class StudentClassList2 {

    private List<Student2> stuList;
    private int size;

    public StudentClassList2(){
        size = 0;
        stuList = null;
    }

    public void createClass(){
        String[] names = {"张三","王五","李四","赵六","孙七"};
        double[] grades = {67,78.5,98,76.5,90};
        int[] ages = {17,18,18,19,17};

        size = names.length;

        stuList = new ArrayList<Student2>();
        Student2 temp;

        for (int i=0; i<size; i++) {
            temp = new Student2(names[i], ages[i], grades[i]);
            stuList.add(temp);
        }
    }


    public void sort(){
        Collections.sort(stuList);
    }

    /**
     * 程序21.5,
     * 增加add方法
     */

    public void  add(Student2 s){
        stuList.add(s);
        size = stuList.size();
    }

    public String output(){
        StringBuilder studentInfo = new StringBuilder();
        for (Student2 stu : stuList){
            studentInfo.append("姓名："+stu.getName()+"\t成绩："+stu.getGrade()+"\r\n");
        }
        return studentInfo.toString();
    }

}
