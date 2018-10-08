public class WorkerTest {
    public static void main(String[] args) {
        Worker w = new Worker("张工",25,6000, "初级");

        w.display();

        w.setWages(8000);
        System.out.println("修改后的工资为："+w.getWages());
    }
}
