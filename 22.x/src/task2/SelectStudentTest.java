package task2;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * ����:
 * ������
 *
 * @author dong
 * @date 2018-11-17 11:12
 */
public class SelectStudentTest {

public static void main(String args[]) {
    SelectStudent ss = new SelectStudent();
    String sql = "select * from student";
        try {
            Connection conn = ss.getConnection();
            ss.select(conn,sql);
            ss.close(conn);
        } catch (ClassNotFoundException e) {
            System.out.println("���ݿ��������򲻴���1");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("���ݿ��������2");
            e.printStackTrace();
        }
    }
}
