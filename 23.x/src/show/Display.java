package show;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 输出，显示结果
 *
 * @author dong
 * @date 2018-11-22 20:06
 */
public class Display {

    public String print(List<Map<String,String>> mapList){
        StringBuilder out = new StringBuilder();
        for (Map<String, String> s : mapList){
            out.append("年龄："+s.get("年龄")+"      成绩："+s.get("成绩")+"      姓名："+s.get("姓名")+"\r\n");
        }
        return out.toString();

    }

}
