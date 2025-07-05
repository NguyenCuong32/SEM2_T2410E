package com.fptaptech.demo.controller;

import com.fptaptech.demo.entity.Subject;
import com.fptaptech.demo.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {
    private ISubjectService subjectService;

    @Autowired
    public SubjectController(ISubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("/subjects")
    public List<Subject> GetAllSubject(){
        return this.subjectService.GetSubjects();
    }
    @PostMapping("/subject")
    public void CreateSubject(@RequestBody Subject subject){
        try {
            subjectService.CreateSubject(subject);
        }catch (Exception exception)
        {

        }
    }
}
