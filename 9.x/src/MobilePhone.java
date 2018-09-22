public class MobilePhone {
    private String brand;
    private long code;

//    构造方法
    public MobilePhone(String brand,long code){
        this.brand = brand;
        this.code = code;
    }
    public MobilePhone(){
        this("",0);
    }

//    置取方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

//    普通方法
    void display(){
        System.out.println("品牌："+brand);
        System.out.println("号码："+code);
    }

    //主函数
    public static void main(String[] args) {

    }
}
