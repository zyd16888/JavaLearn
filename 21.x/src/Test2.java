/**
 * 描述:
 * 修改后的测试类程序
 * 21.6
 *
 * @author dong
 * @date 2018-11-06 20:46
 */
public class Test2 {
    public static void main(String[] args) {
        //创建班级对象
        StudentClassList sClass = new StudentClassList();

        //给班级添加学生
        sClass.createClass();

        //增加一个学生
        sClass.add(new Student("董十",18,80));

        //排序前输出
        System.out.println("原始顺序：");
        System.out.println(sClass.output());

        //冒泡排序
       // sClass.sort();
        //自动排序
        sClass.sort();

        //排序后输出
        // System.out.println("数组冒泡排序结果：");
        System.out.println("排序结果：");
        System.out.println(sClass.output());
    }
}
