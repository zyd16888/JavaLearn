public class TableInfo {
    String shape;
    int legs;
    int hight;
    double area;

    public TableInfo(String shape, int legs, int hight, double area) {
        this.shape = shape;
        this.legs = legs;
        this.hight = hight;
        this.area = area;
    }
    public void print(){
        System.out.println("形状："+shape);
        System.out.println("腿数："+legs);
        System.out.println("高度："+hight);
        System.out.println("面积："+area);
    }
}
