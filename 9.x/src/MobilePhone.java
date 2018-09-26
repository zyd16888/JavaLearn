public class MobilePhone {
    private String brand;
    private String code;

//    构造方法
    public MobilePhone(String brand,String code){
        this.brand = brand;
        this.code = code;
    }
    public MobilePhone(){
        this("","");
    }

//    置取方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

//    普通方法
    void display(){
        System.out.println("品牌："+brand);
        System.out.println("手机号码："+code);
    }

}
