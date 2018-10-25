package task;

/**
 * 描述:
 * 自定义异常
 * 表示计算面积出现的异常
 *
 * @author dong
 * @date 2018-10-24 17:33
 */
public class AreaException extends Exception {
    public AreaException(){
        super("dividedException");
    }
    AreaException(String message){
        super(message);
    }
}
