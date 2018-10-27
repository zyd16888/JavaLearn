package phone;

import people.Student;

/**
 * 18.4
 *
 * @author dong
 */
public class MobilePhone {
    private String brand;
    private String code;
    private Student owner;

    public MobilePhone(String brand, String code){
        this.brand = brand;
        this.code = code;
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    public void print(){
        System.out.println("号码："+code);
        System.out.println("品牌："+brand);
//        try {
//            owner.display();
//        }
//        catch (NullPointerException e){
//            System.out.println("机主为空，程序出错！！");
//        }
    }


}
