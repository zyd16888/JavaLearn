/**
 * 描述:
 * 桌子类，实现接口MoveAble
 * 16.12
 * @author dong
 * @date 2018-09-26 17:36
 */
public class TableInfo implements MoveAble {
    int lgs;
    int hight;

    public TableInfo(int lgs, int hight) {
        this.lgs = lgs;
        this.hight = hight;
    }

    @Override
    public void move(){
        System.out.println("被人搬动了");
    }
}
