package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 描述:
 * 数据库操作类
 * 22.5
 *
 * @author dong
 * @date 2018-11-17 9:43
 */
public class DbOperation {

    public DbOperation(){}

    public Connection getConnection()throws ClassNotFoundException, SQLException{

        String sDBDriver = "com.mysql.jdbc.Driver";
        String conStr = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "475182659";

        //加载驱动器类
        Class.forName(sDBDriver);
        //得到连接对象
        Connection conn = DriverManager.getConnection(conStr,username,password);

        return conn;
    }

    public void  update(Connection conn, String sql)throws SQLException{
        Statement st = conn.createStatement();
        st.executeUpdate(sql);

        st.close();
    }

    public void close(Connection conn)throws SQLException{
        conn.close();
    }
}
