package train;


import java.util.Map;

/**
 * 描述:
 * 加法输出类
 * 19.12
 *
 * @author dong
 * @date 2018-10-27 17:56
 */
public class AddOutput implements Outputable{
    @Override
    public void output(Map m) {
        Integer c = (Integer) m.get("RESULT");
        System.out.println("result = " + c.toString());
    }
}
