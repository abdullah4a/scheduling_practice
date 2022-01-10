package com.example.scheduling_practice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ExceptionHandler extends RuntimeException {
    public ExceptionHandler() {
    }
    public ExceptionHandler(String message){
        super(message);
    }
    public ExceptionHandler(String message, Throwable cause) {
        super(message, cause);
    }
}
