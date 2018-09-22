public class TableInfo_Test {
    public static void main(String[] args) {
        int r = 50;
        int width = 40;
        int len = 60;

        double roundArea = 0;
        double rectArea = 0;

        TableInfo roundTable = new TableInfo("圆形",4, 100);
        TableInfo rectangleTable = new TableInfo("方形", 4, 100);

        roundArea = roundTable.tableArea(r);
        rectArea = rectangleTable.tableArea(width,len);

        System.out.println("圆桌的面积为："+roundArea);
        System.out.println("方桌的面积为："+rectArea);
    }
}
