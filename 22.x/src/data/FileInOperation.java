package data;

import java.io.FileReader;
import java.io.IOException;

/**
 * 描述:
 * 修改后的文件操作类程序
 * 读取文件
 * 22.8
 *
 * @author dong
 * @date 2018-11-18 9:58
 */
public class FileInOperation {

    private FileReader in;
    public FileInOperation(String fileName)throws IOException{
        in = new FileReader(fileName);
    }

    public void read()throws IOException{
        int ch;
        ch = in.read();
        while (ch != -1){
            System.out.print(""+(char)ch);
            ch = in.read();
        }
    }

    public void close()throws IOException{
        in.close();
    }
}
