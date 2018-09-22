public class Square {
    private double side;
    private Rectangle rect;

    public Square(int side){
        this.side = side;
        rect = new Rectangle(side,side);
    }

    public Rectangle getRect(){
        return rect;
    }

    public void setSide(double side){
        rect.setWidth(side);
        rect.setHeight(side);
    }

    public double getArea(){
        return rect.getArea();
    }
}
