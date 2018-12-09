package shap17;
/*1）自定义异常类AreaException ，表示计算面积出现异常。
        （2）在接口方法getArea()声明抛出异常，写法是：
public double getArea() throws AreaException;
        （3）在子类圆桌类中的getArea()方法中，判断若圆桌半径小于等于0，则抛出异常。
        （4）在子类方桌类中的getArea()方法中，判断若方桌的长或宽小于等于0、或者长小于宽，则抛出异常。
        （5）在测试类Main中的main()方法中，接收键盘的输入，输入圆桌半径和方桌的长和宽。输入提示为：
        输入圆桌的半径：
        输入方桌的长和宽：
        并创建圆桌对象和方桌对象，计算方桌和圆桌的面积，并使用try-catch-finally对异常进行捕获和处理。为了输出提示的准确性，计算圆桌面积用一个try-catch-finally处理，计算方桌面积再用一个try-catch-finally处理。*/
import java.util.Scanner;

/**
 * 描述:
 * 自定义异常及处理
 *
 * @author dong
 * @date 2018-11-28 18:55
 */
public class Abnormal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入圆桌的半径：");
        int r = sc.nextInt();
        System.out.println("输入方桌的长和宽：");
        int len = sc.nextInt();
        int width = sc.nextInt();

        RoundTable t1 = new RoundTable(3,100,r);
        RectangelTable t2 = new RectangelTable(4,100,len,width);

        try {
            System.out.println("圆桌面积："+t1.getArea());
        } catch (AreaException e) {
            System.out.println("圆桌的半径小于等于0！");
        } finally {
            System.out.println("圆桌的计算结束！");
        }

        try {
            System.out.println("方桌面积："+t2.getArea());
        }catch (AreaException e){
            System.out.println("方桌的长或宽小于等于0、或者长小于宽！");
        }finally {
            System.out.println("方桌的计算结束！");
        }

    }
}

/**
 * 描述:
 * 自定义异常
 * 表示计算面积出现的异常
 *
 * @author dong
 * @date 2018-10-24 17:33
 */
class AreaException extends Exception {
    public AreaException(){
        super("areaException");
    }
}
/**
 * 描述:
 * 接口测试类
 * 16.9   16.5.3题
 * @author dong
 * @date 2018-09-25 21:30
 */
interface CalculateAble {
    public double getArea()throws AreaException;

    public double getPerimeter();
}
/**
 * 描述:
 * 桌子类
 * 16.12
 * @author dong
 * @date 2018-09-26 17:36
 */
class TableInfo  {
    int lgs;
    int hight;

    public TableInfo(int lgs, int hight) {
        this.lgs = lgs;
        this.hight = hight;
    }

}
/**
 * 描述:
 * 圆桌类，实现接口CalculateAble
 * 16.5.3题
 *
 * @author dong
 * @date 2018-09-26 17:39
 */
class RoundTable extends TableInfo implements CalculateAble {
    private double r;
    double area;

    public RoundTable(int lgs, int hight, double r) {
        super(lgs, hight);
        this.r = r;
    }




    @Override
    public double getArea() throws AreaException {
        if (r <= 0){
            throw new AreaException();
        }
        return 3.14*r*r;
    }

    @Override
    public double getPerimeter() {
        return 3.14*2*r;
    }
}

/**
 * 描述:
 * 方桌类，实现接口CalculateAble
 * 16.14
 * 16.5.3题
 *
 * @author dong
 * @date 2018-09-26 17:44
 */
class RectangelTable extends TableInfo implements CalculateAble {
    private double len;
    private double width;

    public RectangelTable(int lgs, int hight, double len, double width) {
        super(lgs, hight);
        this.len = len;
        this.width = width;
    }

    @Override
    public double getArea() throws AreaException {
        if (len<width){
            throw new AreaException();
        } else if (len <= 0 || width <= 0){
            throw new AreaException();
        }
        return len * width;
    }

    @Override
    public double getPerimeter() {
        return 2*(len+width);
    }
}
