public class Student5_3 {
    private String name;
    private int age;
    private  double grade;

    //构造方法,用于对象实例化
    public Student5_3(String name, int age, double grade){
        this.name = name;
        if (age<0){
            this.age = 0;
        }else {
            this.age = age;
        }
        this.grade = grade;

    }

    public void display(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("年级："+grade);
    }
}
