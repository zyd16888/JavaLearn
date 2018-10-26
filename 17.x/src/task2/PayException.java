package task2;

/**
 * 描述:
 * 自定义异常类
 *
 * @author dong
 * @date 2018-10-25 20:07
 */
public class PayException extends Exception{
    public PayException(){
        super("payException");
    }
    PayException(String message){
        super(message);
    }
}
