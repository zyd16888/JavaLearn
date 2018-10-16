public class Cube_Test {
    public static void main(String[] args) {

        double sphere = 0;
        double cylinder = 0;

        Cube s = new Cube();

        sphere = s.volume(10);
        cylinder = s.volume(10,8);

        System.out.println("半径为10的球体积是："+sphere);
        System.out.println("低半径为10，高为8的圆柱体积是："+cylinder);
    }
}
