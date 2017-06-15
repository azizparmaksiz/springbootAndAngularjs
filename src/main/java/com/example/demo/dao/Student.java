package com.example.demo.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by seva on 6/15/17.
 */
@Entity
public class Student {

    @Id
    private String id;
    private String name;
    private String surname;

    public Student(){}
    public Student(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
