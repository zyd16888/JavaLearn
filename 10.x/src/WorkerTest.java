public class WorkerTest {
    public static void main(String[] args) {
        TableInfo t = new TableInfo("正方形",4,50,100);
        Worker w = new Worker("赵四",25,5000,"三级",t);
        w.display();
    }
}
