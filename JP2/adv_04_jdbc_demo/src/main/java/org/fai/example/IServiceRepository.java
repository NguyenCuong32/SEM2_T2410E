package org.fai.example;

import org.fai.example.entity.Student;
import org.fai.example.entity.Subject;

import java.util.List;

public interface IServiceRepository {
    List<Student> findAll();

    List<Student> findAll(String storeProcedureName);

    void save(Student student);
    void delete(Student student);
    void update(Student student);
    void save(Subject subject);
    void delete(Subject subject);
    void update(Subject subject);


}
