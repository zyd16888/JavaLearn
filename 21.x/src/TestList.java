import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 课堂练习
 *
 * @author dong
 * @date 2018-11-13 8:04
 */
public class TestList {
    public static void main(String[] args) {
        Test22 t1 = new Test22();
        List<Integer> myList = t1.getSS();
        for (int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }

}

class Test22{
    public static List<Integer> getSS(){
        List<Integer> ssList = new ArrayList<Integer>();
        for (int i=2; i<100; i++){
            boolean flag = true;
            for (int j=2; j<i; j++){
                if(i%j == 0){
                    flag =false;
                    break;
                }
            }
            if (flag){
                ssList.add(i);
            }

        }
        return ssList;
    }
}
