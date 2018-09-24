/**
 * 描述:
 * 手机类
 *
 * @author dong
 * @date 2018-09-24 18:16
 */
public class MobilePhone extends Phone {
    private String brand;
    private String ownerId;

    public MobilePhone(String code, String brand, String ownerId) {
        super(code);
        this.brand = brand;
        this.ownerId = ownerId;
    }

    public double pay(int time, double price){
        return (time * price);
    }
}
