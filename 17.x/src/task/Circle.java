package task;

/**
 * 描述:
 * 实现接口CalculateAble的圆类
 * 16.7
 * @author dong
 * @date 2018-09-25 21:52
 */
public class Circle implements CalculateAble {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
