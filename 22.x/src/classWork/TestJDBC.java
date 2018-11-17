package classWork;

import java.sql.*;
public class TestJDBC {
	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		//���������ݿ������
		//(1)������������
		Class.forName("com.mysql.jdbc.Driver");
		//(2) �õ����Ӷ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javadb","root","root");
		Statement stmt = conn.createStatement();
		//(2)ִ��sql���
		 ResultSet rs = stmt.executeQuery("select * from student");
		 while(rs.next()){
		 			System.out.print(rs.getString(2)+",");
		 			System.out.print(rs.getString(3)+",");
		 			System.out.println(rs.getString(4));
		 	}
		 	rs.close();
		 	stmt.close();
		 	conn.close();
		
	}
}