package task2;

/**
 * 描述:
 * 固定电话类
 * 16.5.4题
 *
 * @author dong
 * @date 2018-10-16 15:02
 */
public class Telephone extends Phone implements PayAble{
    private int time;
    private int price;
    private int monthlyFee;

    @Override
    public int pay() {
        return time * price + monthlyFee;
    }

    public Telephone(String code, int time, int price, int monthlyFee) {
        super(code);
        this.time = time;
        this.price = price;
        this.monthlyFee = monthlyFee;
    }

}
