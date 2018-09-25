/**
 * 描述:
 * 实现接口CalculateAble的圆类
 *
 * @author dong
 * @date 2018-09-25 21:52
 */
public class Circle2 implements CalculateAble {
    private double r;

    public Circle2(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }
}
