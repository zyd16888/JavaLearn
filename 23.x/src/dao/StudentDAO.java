package dao;

import data.DbOperation;
import service.Student;
import service.StudentClass;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author dong
 * @date 2018-11-18 13:48
 */
public class StudentDAO {
    public boolean insert (Student s){

        boolean flag = false;
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
            flag = true;
        }catch (ClassNotFoundException e){
            System.out.println("数据库驱动程序不存在!");
            e.printStackTrace();
        }catch (SQLException e){
            System.out.println("数据库操作错误!");
            e.printStackTrace();
        }
        return flag;
    }

    public StudentClass getStudentClass(){
        List<Student>lst = null;
        StudentClass sc = new StudentClass();
        String sql = "select name,age,grade from student";

        DbOperation db = new DbOperation();

        Connection con = null;
        try {
            con = db.getConnection();
            lst = db.getAll(con,sql);
            db.close(con);
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动程序不存在！");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("数据库操作错误！");
            e.printStackTrace();
        }
        sc.createClass(lst);
        return sc;
    }

    //从数据库中查找
    public Student getByName(String name){
        List<Student>lst = null;

        String sql = "select name,age,grade from student ";
        sql = sql+"where name = '"+name+"'";

        DbOperation db = new DbOperation();
        try {
            Connection con = db.getConnection();
            lst = db.getAll(con,sql);
            db.close(con);
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动程序不存在！");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("数据库操作错误！");
            e.printStackTrace();
        }

        Student s;
        if ((lst == null)||(lst.size() == 0)){
            s = null;
        }
        else {
            s = lst.get(0);
        }

        return s;
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
            System.out.println("数据库驱动程序不存在123");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("数据库操作错误321");
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
