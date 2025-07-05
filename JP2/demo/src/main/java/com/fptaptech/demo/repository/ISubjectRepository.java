package com.fptaptech.demo.repository;

import com.fptaptech.demo.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjectRepository extends JpaRepository<Subject,String> {
}
