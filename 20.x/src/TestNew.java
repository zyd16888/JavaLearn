import java.lang.reflect.Method;

/**
 * 描述:
 * 装入类程序
 * 20.1
 * 20.3
 *
 * @author dong
 * @date 2018-10-28 17:57
 */
public class TestNew {
    public static void main(String[] args) {
        String className = "people.Person";
        String methodName = "display";

        try {

            Class theObject = Class.forName(className);
            Object theInst = (Object) theObject.newInstance();

            Class zs[] = new Class[1];
            zs[0] = String.class;
            Method setZs = theObject.getMethod(new String("setName"),zs);
            Object zsPara[] = new Object[1];
            zsPara[0] = new String("张三");
            Object returnObject = setZs.invoke(theInst,zsPara);

            Class para[] = new Class[0];
            Object ob[] = new Object[0];
            Method theMethod = theObject.getMethod(methodName,para);
            returnObject = theMethod.invoke(theInst,ob);
        }catch (Throwable e){
            System.err.print(e);
        }
    }
}
