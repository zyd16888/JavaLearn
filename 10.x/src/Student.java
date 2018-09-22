public class Student {
    private String name;
    private int age;
    private double grade;
    private MobilePhone myphone;

    public Student(String name,int age,double grade,MobilePhone myphone){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.myphone = myphone;
        this.myphone.setOwner(this);

    }

    public void display(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("成绩："+grade);
//        myphone.print();
    }
}
