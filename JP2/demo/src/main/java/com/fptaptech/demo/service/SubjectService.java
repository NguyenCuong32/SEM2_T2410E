package com.fptaptech.demo.service;

import com.fptaptech.demo.entity.Subject;
import com.fptaptech.demo.repository.ISubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectService implements ISubjectService{
    private ISubjectRepository subjectRepository;

    @Autowired
    public SubjectService(ISubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Subject> GetSubjects() {
        return this.subjectRepository.findAll();
    }

    @Override
    public void CreateSubject(Subject subject) {
        this.subjectRepository.save(subject);
    }
}
