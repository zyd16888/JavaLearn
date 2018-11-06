/**
 * 描述:
 * 测试类程序
 * 21.3
 *
 * @author dong
 * @date 2018-11-06 15:11
 */
public class Test1 {
    public static void main(String[] args) {
        //创建班级对象
        StudentClass sClass = new StudentClass();

        //给班级添加学生
        sClass.createClass();

        //排序前输出
        System.out.println("原始顺序：");
        System.out.println(sClass.output());

        //冒泡排序
        sClass.sort();

        //排序后输出
        System.out.println("数组冒泡排序结果：");
        System.out.println(sClass.output());
    }
}
