public class TableInfo {
    String shape;
    int legs;
    int hight;

    public TableInfo(String shape,int legs,int hight){
        this.shape = shape;
        this.hight = hight;
        this.legs = legs;

    }

    public void print(){
        System.out.println("桌子形状："+shape);
    }
    public double tableArea(int r){
        return 3.14*r*r;
    }
    public double tableArea(int a,int b){
        return a*b;
    }
}
