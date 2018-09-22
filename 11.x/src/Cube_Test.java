public class Cube_Test {
    public static void main(String[] args) {

        double sphere = 0;
        double cylinder = 0;

        Cube s = new Cube();
        Cube c = new Cube();

        sphere = s.volume(20);
        cylinder = c.volue(10,20);

        System.out.println("球体的体积为："+sphere);
        System.out.println("圆柱体的体积为："+cylinder);
    }
}
