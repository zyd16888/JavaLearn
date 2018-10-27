package phone;

/**
 * 描述:
 * 19.2
 *
 * @author dong
 * @date 2018-10-27 16:47
 */
public class Phone {
    private String brand;
    private String code;

    public String getCode(){
        return code;
    }

    public Phone(String brand, String code) {
        this.brand = brand;
        this.code = code;
    }

    public void print(){
        System.out.println("电话号码："+code);
    }
}
