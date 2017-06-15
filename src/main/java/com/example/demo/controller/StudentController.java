package com.example.demo.controller;

import com.example.demo.dao.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/students/{id}")
    public Student getStudent(@PathVariable("id") String id){

        return studentService.getStudent(id);
    }
    @RequestMapping("/students")
    public List<Student>getStudents(){
        return studentService.getAllStudent();
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
    public void updateStudents(@RequestBody Student student,@PathVariable("id") String id){

    studentService.updateStudent(id,student);
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
}
