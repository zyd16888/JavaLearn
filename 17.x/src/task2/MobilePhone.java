package task2;

/**
 * 描述:
 * 手机类继承于Phone
 * 16.5.4题
 *
 * @author dong
 * @date 2018-10-16 14:58
 */
public class MobilePhone extends Phone implements PayAble{
    private int time;
    private int price;
    private int internetFee;
    private int messageFee;


    public MobilePhone(String code, int time, int price, int internetFee, int messageFee) {
        super(code);
        this.time = time;
        this.price = price;
        this.internetFee = internetFee;
        this.messageFee = messageFee;
    }

    @Override
    public int pay() throws PayException {
        int a = price * time + internetFee + messageFee;
        if (a<0){
            throw new PayException("话费小于0");
        }
        return a;

    }
}
