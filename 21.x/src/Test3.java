/**
 * 描述:
 * Student2及其Class测试类
 *
 * @author dong
 * @date 2018-11-06 21:28
 */
public class Test3 {
    public static void main(String[] args) {
        //创建班级对象
        StudentClassList2 sClass = new StudentClassList2();

        //给班级添加学生
        sClass.createClass();

        //增加一个学生
        sClass.add(new Student2("董十",18,80));

        //排序前输出
        System.out.println("原始顺序：");
        System.out.println(sClass.output());

        //自动排序
        sClass.sort();

        //排序后输出
        System.out.println("排序结果：");
        System.out.println(sClass.output());
    }
}
