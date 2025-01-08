package com.crudoperation.springcrud.controller;

import com.crudoperation.springcrud.entity.Student;
import com.crudoperation.springcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentCotroller {

    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student add = studentService.addStudent(student);
        return new ResponseEntity<>(add  , HttpStatus.CREATED);
    }
    @GetMapping("getall")
    public ResponseEntity<List<Student>> getAllStudent(){
        return new ResponseEntity<>(studentService.getAllStudent() , HttpStatus.FOUND);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable int id){
        Optional<Student> getStudent  = studentService.getStudentById(id);
        return new ResponseEntity<>(getStudent, HttpStatus.FOUND);
    }
}
