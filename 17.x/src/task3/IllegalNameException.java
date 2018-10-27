package task3;

/**
 * 描述:
 * 自定义异常处理类
 *
 * @author dong
 * @date 2018-10-27 10:53
 */
public class IllegalNameException extends Exception{
    public IllegalNameException(){
        super("illegalNameException");
    }
    IllegalNameException(String message){
        super(message);
    }
}
