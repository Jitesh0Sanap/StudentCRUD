package com.crudoperation.springcrud.servicesImpl;

import com.crudoperation.springcrud.Exception.StudentNotFound;
import com.crudoperation.springcrud.entity.Student;
import com.crudoperation.springcrud.repo.StudentRepo;
import com.crudoperation.springcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public Student addStudent(Student student) {
        Student s = studentRepo.save(student);
        return s;
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> listOfStudent = studentRepo.findAll();
        return listOfStudent;
    }

    @Override
    public Optional<Student> getStudentById(int id) {
        Optional<Student> studentById = studentRepo.findById(id);
        return studentById ;
    }

    @Override
    public Student updateStudent(Student student, int id) {
        Student existingStudent = studentRepo.findById(id).orElseThrow(()-> new StudentNotFound("student not present in table..! id:" + id));


            existingStudent.setName(student.getName());
            existingStudent.setAge(student.getAge());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setCity(student.getCity());
            Student updated = studentRepo.save(existingStudent);
            return updated;


    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }
}
