/**
 * 描述:
 * 子类方桌类程序
 *
 * @author dong
 * @date 2018-09-25 9:04
 */
public class RectagleTable extends TableInfo {
    private double len;
    private double width;

    public RectagleTable(int legs, int hight, double len, double width) {
        super(legs, hight);
        this.len = len;
        this.width = width;
    }

    @Override
    public double tableArea(){
        return len * width;
    }
}
