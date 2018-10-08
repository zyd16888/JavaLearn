public class Worker {
    private String name;
    private int age;
    private int wages;
    private String evel;

    /**
     * get与set方法
     * */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public String getevel() {
        return evel;
    }

    public void setevel(String evel) {
        this.evel = evel;
    }

    /**
     * 构造方法
     * */

    public Worker(String name, int age, int wages, String evel) {
        this.name = name;
        this.age = age;
        this.wages = wages;
        this.evel = evel;
    }

    public Worker() {
        this("",0,0, "");
    }

    void display(){
        System.out.println("工人姓名："+name);
        System.out.println("工人年龄："+age);
        System.out.println("工人工资："+wages);
        System.out.println("工人级别："+evel);
    }
}
