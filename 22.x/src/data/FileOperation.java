package data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 文件操作类
 * 22.2
 *
 * @author dong
 * @date 2018-11-15 14:42
 */
public class FileOperation {
    private FileWriter out;

    public FileOperation(String fileName)throws IOException{
        out = new FileWriter(fileName);
    }

    public void save(List<Map<String, String>>list)throws IOException{
        //输出到文件
        for (Map<String, String> m: list){
            for (Map.Entry entry : m.entrySet()){
                out.write(entry.getKey()+":"+entry.getValue()+"\t");
            }
            out.write("\r\n");
        }
    }

    public void close() throws IOException{
        out.close();
    }
}
