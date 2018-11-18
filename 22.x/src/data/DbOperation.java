package data;

import service.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ����:
 * ���ݿ������
 * 22.5
 *
 * @author dong
 * @date 2018-11-17 9:43
 */
public class DbOperation {

    public DbOperation(){}

    public Connection getConnection()throws ClassNotFoundException, SQLException{

        String sDBDriver = "com.mysql.jdbc.Driver";
        String conStr = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=gbk";
        String username = "root";
        String password = "475182659";

        //������������
        Class.forName(sDBDriver);
        //�õ����Ӷ���
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

    /*
     * ���ݿ��ȡ����
     */
    public List<Student>getAll(Connection conn,String sql){
        List<Student>result = new ArrayList<Student>();

        Student temp;
        String name;
        int age;
        double grade;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                name = rs.getString("name");
                age = rs.getInt("age");
                grade = rs.getDouble("grade");
                temp = new Student(name,age,grade);
                result.add(temp);
            }
        } catch (SQLException e1) {
            System.err.println(e1);
        }
        return result;
    }
}
