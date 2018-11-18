package dao;

import data.DbOperation;
import service.Student;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public List<Student> outsert(){
        List<Student>result = new ArrayList<Student>();
        String sql;
        sql = "select * from student";
        DbOperation db = new DbOperation();
        Connection con = null;
        try {
            con = db.getConnection();
        } catch (ClassNotFoundException e) {
            System.out.println("���ݿ��������򲻴���123");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("���ݿ��������321");
            e.printStackTrace();
        }
        result = db.getAll(con,sql);
        try {
            db.close(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
