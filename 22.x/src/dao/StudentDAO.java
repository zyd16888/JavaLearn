package dao;

import data.DbOperation;
import service.Student;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * ����:
 * ���ݿ������
 * 22.6
 *
 * @author dong
 * @date 2018-11-17 9:37
 */

public class StudentDAO {
    public void insert (Student s){
        String sql;
        sql = "insert into student(name,age,grade)values('";
        sql = sql+s.getName();
        sql = sql+"',";
        sql = sql+s.getAge();
        sql = sql+",";
        sql = sql+s.getGrade();
        sql = sql+")";
        DbOperation db = new DbOperation();
        try {
            Connection con = db.getConnection();
            db.update(con,sql);
            db.close(con);
        }catch (ClassNotFoundException e){
            System.out.println("���ݿ��������򲻴���123");
            e.printStackTrace();
        }catch (SQLException e){
            System.out.println("���ݿ��������321");
            e.printStackTrace();
        }

    }
}
