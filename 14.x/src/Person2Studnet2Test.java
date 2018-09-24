/**
 * 描述:
 * 动态绑定测试类
 *
 * @author dong
 * @date 2018-09-24 16:32
 */
public class Person2Studnet2Test {
    public static void main(String[] args) {
        Person2 p = new Student2();

        System.out.println("姓名："+p.name);
        System.out.println("姓名："+p.getName());
    }

}
