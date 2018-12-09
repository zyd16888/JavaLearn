package shap07;

/**
 * 描述:
 * MobilePhone，属性有品牌、号码，设计一个方法显示手机的基本信息。
 *
 * @author dong
 * @date 2018-11-28 18:25
 */
public class MobilePhone {
    public static void main(String[] args) {
        MobilePhone0 mobilePhone  = new MobilePhone0();
        mobilePhone.brand = "华为";
        mobilePhone.code = "13700340000";

        mobilePhone.display();
    }
}
class MobilePhone0 {
    String brand ;
    String code;

    void display(){
        System.out.println("品牌："+brand);
        System.out.println("号码："+code);
    }
}
