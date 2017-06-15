package com.example.demo.dao;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by seva on 6/15/17.
 */
public interface StudentRepository extends CrudRepository<Student,String> {
}
