package train;

import java.util.Map;

/**
 * 描述:
 * 框架类程序
 * 19.6
 *
 * @author dong
 * @date 2018-10-27 17:31
 */
public class MyFrame {
    public void run(InputAble ia,ProcessAble pa,Outputable oa){
        Map inputMap = ia.input();
        Map resultMap = pa.doProcess(inputMap);
        oa.output(resultMap);
    }
}
