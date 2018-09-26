public class MobilePhone {
    String brand ;
    String code;

    public MobilePhone(String brand, String code) {
        this.brand = brand;
        this.code = code;
    }

    void display(){
        System.out.println("品牌："+brand);
        System.out.println("手机号码："+code);
    }
}
