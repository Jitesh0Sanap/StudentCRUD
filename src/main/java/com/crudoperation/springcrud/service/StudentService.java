package com.crudoperation.springcrud.service;

import com.crudoperation.springcrud.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface StudentService {

    public Student addStudent(Student student);

    public List<Student> getAllStudent();

    Optional<Student>   getStudentById(int id);

    public Student updateStudent(Student student , int id);

    public void deleteStudent(int id);

}
