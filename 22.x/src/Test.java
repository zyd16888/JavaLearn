import data.FileOperation;
import service.StudentClass;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 测试类程序
 * 22.3
 *
 * @author dong
 * @date 2018-11-15 14:50
 */
public class Test {
    public static void main(String[] args) {
        List<Map<String, String>>lst;

        //创建班级对象
        StudentClass xg = new StudentClass();

        //给班级添加学生
        xg.createClass();

        //格式化学生信息
        lst = xg.formatStudent();

        try {
            FileOperation xgStudent = new FileOperation("student.txt");
            //保存学生信息到文件
            xgStudent.save(lst);
            //关闭文件
            xgStudent.close();
            //显示保存提示
            System.out.println("文件保存成功！");
        } catch (IOException e) {
            System.out.println("IO错误，文件保存失败！");
        }
    }
}
