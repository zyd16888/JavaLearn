/**
 * 描述:
 * 重写print()方法的圆桌类程序
 *
 * @author dong
 * @date 2018-09-24 16:06
 */
public class RoundTable extends TableInfo {
    private double r;

    public RoundTable(int legs, int hight, double r) {
        super(legs, hight);
        this.r = r;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("圆桌！");
        System.out.println("半径"+r);
    }
}
