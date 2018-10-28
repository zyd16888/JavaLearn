package phone;

/**
 * 描述:
 * 普通手机类
 * 19.5.1
 *
 * @author dong
 * @date 2018-10-28 16:31
 */
public class OrdinalPhone extends MobilePhone {
    private String model;

    public OrdinalPhone(String brand, String code, String model) {
        super(brand, code);
        this.model = model;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("型号："+model);
    }
}
