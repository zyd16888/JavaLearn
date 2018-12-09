/*使用Java的IO流：
        在Main类定义两个静态方法，一个是writeToFile()，一个是readFromFile()，第一个方法完成对文件的写操作：方法找出100-200之间的全部素数，并将这些素数写入到sushu.txt文件中；第二个方法实现对文件的读操作：读出sushu.txt文件的全部内容并输出。在main函数调用这两个方法实现程序功能。
        输出结果如下：
        101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199
        要求：
        （1）必须严格按照题目要求完成，否则会扣分。
        （2）注意格式的规范性。
        （3）100-200的素数必须编程找出来。*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * 描述:
 * 文件读写
 *
 * @author dong
 * @date 2018-11-28 19:26
 */
public class FileReadWrite {
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
        int qq=out.read();
        while (qq != -1 ){
            System.out.print((char)qq);
            qq = out.read();
        }
    }
}
