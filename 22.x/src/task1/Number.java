package task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 作业题1
 *
 * @author dong
 * @date 2018-11-15 19:16
 */
public class Number {

    public static void main(String[] args) {

        try {
            writeToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            readFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    private static void writeToFile() throws IOException {
        FileWriter input = new FileWriter("sushu.txt");
        List<Integer> numList = new ArrayList<>();
        int i, j, k;
        for (i = 100; i < 200; i++) {
            k = (int) Math.sqrt(i);
            for (j = 2; j <= k; j++) {

                if (i % j == 0)
                    break;

            }
            if (j > k) {
                numList.add(i);
            }
        }
        for (Integer list : numList) {
            input.write(String.valueOf(list)+" ");
        }
        input.close();
    }

    private static void readFromFile() throws IOException {
        FileReader out = new FileReader("sushu.txt");
        int num=out.read();
        while (num  != -1 ){
            System.out.print((char)num);
            num = out.read();
        }

        out.close();
    }

}
