package homework;

/**
 * 描述:
 * 计数类
 *
 * @author dong
 * @date 2018-11-01 19:47
 */
public class MyMath {

    public double divide(double x, double y) throws DividedException {
        if(y == 0){
            throw new DividedException();
        }

        return x/y;
    }

}
