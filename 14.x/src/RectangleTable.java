/**
 * 描述:
 * 重写print()方法的方桌类程序
 *
 * @author dong
 * @date 2018-09-24 16:00
 */
public class RectangleTable extends TableInfo {
    private double width;
    private double len;

    public RectangleTable(int legs, int hight,double width, double len) {
        super(legs, hight);
        this.width = width;
        this.len = len;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("方桌！");
        System.out.println("长为"+width+"，宽为"+len);
    }
}
