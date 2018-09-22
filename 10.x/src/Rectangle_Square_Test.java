public class Rectangle_Square_Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setHeight(20);
        r.setWidth(10);
        System.out.println("长方形面积="+r.getArea());
        Square s = new Square(10);
        System.out.println("正方形面积="+s.getArea());
        Rectangle rect = s.getRect();
        System.out.println(rect.getHeight());
        System.out.println(rect.getWidth());
        rect.setWidth(30);
        System.out.println("正方形面积="+s.getArea());

    }
}
