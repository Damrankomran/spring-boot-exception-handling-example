package com.example.springbootexceptionhandlingexample.handler;

import com.example.springbootexceptionhandlingexample.exception.RecordNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author emre.aydin
 * @since 11.12.2021
 */

@RestControllerAdvice
public class ServiceExceptionHandler {

    @ExceptionHandler({RecordNotFoundException.class})
    public String handleRecordNotFoundException() {
        return "Record not found!";
    }
}
