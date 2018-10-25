package task;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 * 描述:
 * 圆桌类，实现接口CalculateAble
 * 16.5.3题
 *
 * @author dong
 * @date 2018-09-26 17:39
 */
public class RoundTable extends TableInfo implements CalculateAble{
    private double r;
    double area;

    public RoundTable(int lgs, int hight, double r) {
        super(lgs, hight);
        this.r = r;
    }




    @Override
    public double getArea() throws AreaException {
        if (r<0){
            throw new AreaException("半径小于零");
        }
        return 3.14*r*r;
    }

    @Override
    public double getPerimeter() {
        return 3.14*2*r;
    }
}
