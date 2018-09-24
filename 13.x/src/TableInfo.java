

/**
 * 描述:
 * 桌子类
 *
 * @author dong
 * @date 2018-09-24 15:57
 */
public class TableInfo {
    int legs;
    int hight;

    public TableInfo(int legs,int hight){
        this.legs = legs;
        this.hight = hight;
    }

    public void print(){
        System.out.println("桌子有"+legs+"条腿");
        System.out.println("桌子高度为"+hight);
    }
}
