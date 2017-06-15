package com.example.demo.service;

import com.example.demo.dao.Student;
import com.example.demo.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seva on 6/15/17.
 */
@Service
public class StudentService {


    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student std){
    studentRepository.save(std);
    }

    public Student getStudent(String id){

         return studentRepository.findOne(id);
    }

    public List<Student> getAllStudent(){

        List<Student> studentList=new ArrayList<>();
        studentRepository.findAll().forEach(student -> studentList.add(student));
                return studentList;
    }

    public void updateStudent(String id,Student student){
        studentRepository.save(student);
    }
}
