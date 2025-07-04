package com.fptaptech.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="subject")
public class Subject {
    @Id
    @Column(name = "code")
    private String code;
    @Column(name ="name")
    private String name;
    @Column(name = "credit")
    private Integer credit;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Subject() {
    }

    public Subject(String code, String name, Integer credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }
}
