/**
 * 描述:
 * 自定义异常类
 * 17.6
 *
 * @author dong
 * @date 2018-10-16 21:13
 */
public class DividedException extends Exception {
    public DividedException(){
        super("dividedException");
    }
    DividedException(String message){
        super(message);
    }
}
