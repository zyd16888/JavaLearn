/**
 * 描述:
 * 圆桌类，实现接口CalculateAble
 * 16.5.3题
 *
 * @author dong
 * @date 2018-09-26 17:39
 */
public class RoundTable extends TableInfo implements CalculateAble{
    private double r;

    public RoundTable(int lgs, int hight, double r) {
        super(lgs, hight);
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }

    @Override
    public double getPerimeter() {
        return 3.14*2*r;
    }
}
