package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 描述:
 * 教师类的List集合
 *
 * @author dong
 * @date 2018-11-11 14:49
 */
public class TeacherArrayList {
    private List<Teacher>teacherList;
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
