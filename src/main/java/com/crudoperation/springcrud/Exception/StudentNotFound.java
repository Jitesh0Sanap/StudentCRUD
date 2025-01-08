package com.crudoperation.springcrud.Exception;


public class StudentNotFound extends RuntimeException {

    public StudentNotFound(String message) {
        super(message);
    }
}
