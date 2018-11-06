import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 班级类，List实现
 * 21.4
 *
 * @author dong
 * @date 2018-11-06 15:21
 */
public class StudentClassList {
    private List<Student>stuList;
    private int size;

    public StudentClassList(){
        size = 0;
        stuList = null;
    }

    public void createClass(){
        String[] names = {"张三","王五","李四","赵六","孙七"};
        double[] grades = {67,78.5,98,76.5,90};
        int[] ages = {17,18,18,19,17};

        size = names.length;

        stuList = new ArrayList<Student>();
        Student temp;

        for (int i=0; i<size; i++) {
            temp = new Student(names[i], ages[i], grades[i]);
            stuList.add(temp);
        }
    }

    public void sort(){
        Student temp;
        for (int i=0; i<size; i++){
            for (int j=1; j<size-i; j++){
                if(stuList.get(j-1).getGrade()>stuList.get(j).getGrade()){
                    temp = stuList.get(j-1);
                    stuList.set(j-1,stuList.get(j));
                    stuList.set(j,temp);
                }
            }
        }
    }

    public String output(){
        StringBuilder studentInfo = new StringBuilder();
        for (Student stu : stuList){
            studentInfo.append("姓名："+stu.getName()+"\t成绩："+stu.getGrade()+"\r\n");
        }
        return studentInfo.toString();
    }

}
