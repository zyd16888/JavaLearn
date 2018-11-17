package task2;

import java.sql.*;

/**
 * 描述:
 * 作业题2
 *
 * @author dong
 * @date 2018-11-17 11:07
 */
public class SelectStudent {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String sDBDriver = "com.mysql.jdbc.Driver";
        String conStr = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "475182659";

        Class.forName(sDBDriver);

        Connection conn = DriverManager.getConnection(conStr,username,password);

        return conn;

    }

    public void select(Connection conn,String sql) throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs=st.executeQuery(sql);//查询
        System.out.println("姓名       年龄       成绩");
        while(rs.next()){
            System.out.print(rs.getString(1)+"       ");
            System.out.print(rs.getString(2)+"       ");
            System.out.println(rs.getString(3));
        }
        rs.close();
        st.close();
    }

    public void  close(Connection conn)throws  SQLException{
        conn.close();
    }
}
