/**
 * 描述:
 * 桌子类
 *
 * @author dong
 * @date 2018-09-25 8:58
 */
public abstract class TableInfo {
    int legs;
    int hight;

    public TableInfo(int legs,int hight){
        this.legs = legs;
        this.hight = hight;
    }
    public abstract double tableArea();
}
