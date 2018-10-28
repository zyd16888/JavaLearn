import java.lang.reflect.Method;

/**
 * 描述:
 * 装入类程序
 * 20.1
 *
 * @author dong
 * @date 2018-10-28 17:57
 */
public class TestNew {
    public static void main(String[] args) {
        String className = "people.people";
        String methodName = "display";

        try {
            Class para[] = new Class[0];
            Object ob[] = new Object[0];

            Class theObject = Class.forName(className);
            Object theInst = (Object) theObject.newInstance();

            Method theMethod = theObject.getMethod(methodName,para);
            Object returnObject = theMethod.invoke(theInst,ob);
        }catch (Throwable e){
            System.err.print(e);
        }
    }
}
