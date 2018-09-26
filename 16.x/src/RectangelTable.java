/**
 * 描述:
 * 方桌类，实现接口CalculateAble
 * 16.14
 * @author dong
 * @date 2018-09-26 17:44
 */
public class RectangelTable extends TableInfo implements CalculateAble{
    private double len;
    private double width;

    public RectangelTable(int lgs, int hight, double len, double width) {
        super(lgs, hight);
        this.len = len;
        this.width = width;
    }

    @Override
    public double getArea() {
        return len * width;
    }
}
