/**
 * 描述:
 * 子类圆桌类程序
 *
 * @author dong
 * @date 2018-09-25 9:08
 */
public class RoundTable extends TableInfo{
    private double r;

    public RoundTable(int legs, int hight, double r) {
        super(legs, hight);
        this.r = r;
    }

    @Override
    public double tableArea() {
        return 3.14 * r * r;
    }
}
