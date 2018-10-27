package table;

/**
 * 描述:
 * 方桌类
 * 18.7
 *
 * @author dong
 * @date 2018-10-27 15:50
 */
public class RectangleTable extends TableInfo {
    double side;

    public RectangleTable(int legs, int heights, double side) {
        super(legs, heights);
        this.side = side;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("方桌边长："+side);
    }
}
