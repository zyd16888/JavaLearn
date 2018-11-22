import service.StudentClass;

/**
 * 描述:
 * 数据库测试类
 * 22.7
 *
 * @author dong
 * @date 2018-11-17 10:03
 */
public class TestJDBC2 {
    public static void main(String args[]){
        System.out.println("测试测试测试123");
        //创建班级对象
        StudentClass xg = new StudentClass();
        //给班级添加学生
        xg.createClass();
        //保存学生信息到数据库
        xg.saveToDB();
        //输出数据库信息
        System.out.println(xg.outFormDB());




    }
}
