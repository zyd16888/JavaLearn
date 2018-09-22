public class Rectangle {
    private double width;
    private double height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(){

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return width * height;
    }

}
