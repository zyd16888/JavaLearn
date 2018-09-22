import org.omg.CosNaming.IstringHelper;

public class Student {
    private String name;
    private int age;
    private double grade;
    private static int counter = 0;
    private static Student inst = null;
    private Student(){

    }
    public static Student getInstance(){
        if (inst == null){
            inst = new Student();
        }
        return inst;
    }

    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        counter ++;
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }

    public void display(){
        System.out.println("实例顺序："+counter+"姓名："+name);
    }
    public String displayCounter(){
        System.out.println(counter);
        return displayCounter();
    }
}
