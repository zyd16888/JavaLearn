import java.util.Comparator;

/**
 * 描述:
 * 学生比较容器
 * 21.7
 *
 * @author dong
 * @date 2018-11-06 20:55
 */
public class StudentComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2){
        double grade1,grade2;
        grade1 = student1.getGrade();
        grade2 = student2.getGrade();

        if(grade1>grade2){
            return 1;
        }else if(grade1<grade2){
            return -1;
        }else {
            return 0;
        }
    }
}
