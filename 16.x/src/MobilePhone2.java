/**
 * 描述:
 * 手机类继承于Phone
 * 16.5.4题
 *
 * @author dong
 * @date 2018-10-16 14:58
 */
public class MobilePhone2 extends Phone implements PayAble{
    private int time;
    private int price;
    private int internetFee;
    private int messageFee;


    public MobilePhone2(String code, int time, int price, int internetFee, int messageFee) {
        super(code);
        this.time = time;
        this.price = price;
        this.internetFee = internetFee;
        this.messageFee = messageFee;
    }

    @Override
    public int pay() {
        return price * time + internetFee + messageFee;
    }
}
