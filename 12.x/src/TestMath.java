public class TestMath {
    public static void main(String[] args) {
        int r;  //圆半径
        double area; //圆面积

        r = 1+(int)(Math.random()*50);
        System.out.println("圆的半径为"+r);
        area = Math.PI * r * r;
        //Math.rift() 取整
        System.out.println("圆的面积为："+Math.rint(area));
    }
}
