/**
 * 描述:
 * instanceof运算符
 *
 * @author dong
 * @date 2019-01-30 16:05
 */
public class Instanceof extends Vehicle{
    public static void main(String[] args) {
        String name = "dongdong";
        double a = Math.random();
        boolean result = name instanceof String;
        System.out.println(result);
        Vehicle vehicle = (a*10>5)? new Instanceof() : new Vehicle();
        System.out.println(a);
        boolean result2 = vehicle instanceof Instanceof;
        System.out.println(result2);
    }
}


class Vehicle {}