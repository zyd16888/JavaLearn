/**
 * @author dong
 * @date 2018-10-10 16:46
 */
public class WorkerTest {
    public static void main(String[] args) {
        TableInfo t = new TableInfo("圆形",4,50,100);
        Worker w = new Worker("张工",25,6000,"初级",t);
        w.display();
    }
}
