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

    public void display(){
        System.out.println("腿数："+legs);
        System.out.println("高度："+hight);
    }
}
