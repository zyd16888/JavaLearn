public class ChangeAandB {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
