package table;

/**
 * 描述:
 * 圆桌类
 * 18.5.2
 *
 * @author dong
 * @date 2018-10-27 16:10
 */
public class RoundTable extends TableInfo{
    private double r;

    public RoundTable(int legs, int heights, double r) {
        super(legs, heights);
        this.r = r;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("圆桌半径："+r);
    }
}
