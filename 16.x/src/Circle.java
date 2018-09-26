/**
 * 描述:
 *  圆继承抽象类Shape
 *  16.7
 * @author dong
 * @date 2018-09-25 21:41
 */
public class Circle extends Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }
}
