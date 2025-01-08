package com.crudoperation.springcrud.Exception;

public class ApiResponce {


    private String message;

    public ApiResponce() {
    }

    public ApiResponce( String message) {

        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
