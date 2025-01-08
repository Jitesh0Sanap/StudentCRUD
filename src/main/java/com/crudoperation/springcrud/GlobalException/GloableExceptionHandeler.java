package com.crudoperation.springcrud.GlobalException;

import com.crudoperation.springcrud.Exception.ApiResponce;
import com.crudoperation.springcrud.Exception.StudentNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GloableExceptionHandeler {

    @ExceptionHandler
    public ResponseEntity<ApiResponce> handelStudentNotfound(StudentNotFound ex){
        ApiResponce error = new ApiResponce();
        error.setMessage(ex.getMessage());
        return new ResponseEntity<ApiResponce>(error , HttpStatus.NOT_FOUND);
    }
}
