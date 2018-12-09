package shap16;

/**
 * 描述:
 * 接口
 *
 * @author dong
 * @date 2018-11-28 18:49
 */
public class InterfaceTest {
    public static void main(String[] args) {
        RoundTable t1 = new RoundTable(3,100,30.0);
        RectangelTable t2 = new RectangelTable(4,100,60.0,40.0);

        System.out.println("圆桌面积："+t1.getArea());
        System.out.println("圆桌周长："+t1.getPerimeter());
        //t1.move();

        System.out.println("方桌面积："+t2.getArea());
        System.out.println("方桌周长："+t2.getPerimeter());
        //t2.move();
    }
}

interface CalculateAble {
    public double getArea();
    public double getPerimeter();
}
class TableInfo {
    int lgs;
    int hight;
    public TableInfo(int lgs, int hight) {
        this.lgs = lgs;
        this.hight = hight;
    }
}
class RoundTable extends TableInfo implements CalculateAble{
    private double r;

    public RoundTable(int lgs, int hight, double r) {
        super(lgs, hight);
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }

    @Override
    public double getPerimeter() {
        return 3.14*2*r;
    }
}
class RectangelTable extends TableInfo implements CalculateAble{
    private double len;
    private double width;

    public RectangelTable(int lgs, int hight, double len, double width) {
        super(lgs, hight);
        this.len = len;
        this.width = width;
    }

    @Override
    public double getArea() {
        return len * width;
    }

    @Override
    public double getPerimeter() {
        return 2*(len+width);
    }
}
