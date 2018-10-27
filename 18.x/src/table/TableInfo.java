package table;

/**
 * 描述:
 * 18.6
 *
 * @author dong
 * @date 2018-10-27 15:47
 */
public class TableInfo {
    int legs;
    int heights;

    public TableInfo(int legs, int heights) {
        this.legs = legs;
        this.heights = heights;
    }

    public void print(){
        System.out.println("桌子腿数："+legs);
    }
}
