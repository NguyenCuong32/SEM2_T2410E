package org.fai.example;

import org.fai.example.entity.Student;
import org.fai.example.entity.Subject;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepository implements IServiceRepository {

    @Override
    public List<Student> findAll() {
        var con = ConnectJDBC.getInstance().getConnection();
        String sql = "select * from student";
        List<Student> students = new ArrayList<>();
        if (con == null) return null;
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setFirst_name(rs.getString("first_name"));
                student.setLast_name(rs.getString("last_name"));

                students.add(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public List<Student> findAll(String storeProcedureName) {
        var con = ConnectJDBC.getInstance().getConnection();
        List<Student> students = new ArrayList<>();
        if (con == null) return null;
        try {
            CallableStatement stmt = con.prepareCall(String.format("{call %s()}", storeProcedureName));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setFirst_name(rs.getString("first_name"));
                student.setLast_name(rs.getString("last_name"));
                // Add more fields as necessary
                students.add(student);
            }
            return students;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void save(Subject subject) {
        try{
            var con = ConnectJDBC.getInstance().getConnection();
            CallableStatement stmt = con.prepareCall("{call SP_INSERT_SUBJECT(?,?,?)}");
            stmt.setString("code", subject.getCode());
            stmt.setString("name", subject.getName());
            stmt.setInt("credit", subject.getCredit());
            stmt.execute();
            stmt.close();
            System.out.println("Insert subject successfully");
        }catch (Exception e) {
            System.out.println("Have an exception "+e.getMessage());
        }
    }

    @Override
    public void delete(Subject subject) {

    }

    @Override
    public void update(Subject subject) {

    }
}
