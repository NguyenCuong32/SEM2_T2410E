package com.fptaptech.demo.service;

import com.fptaptech.demo.entity.Subject;

import java.util.List;

public interface ISubjectService {
    // Lấy danh sách môn học
    List<Subject> GetSubjects();
    // Nếu có nhiều chức năng: Thêm Môn học,...
    void CreateSubject(Subject subject);
}
