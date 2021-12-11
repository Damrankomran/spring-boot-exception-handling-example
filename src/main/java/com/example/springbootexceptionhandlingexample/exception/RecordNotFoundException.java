package com.example.springbootexceptionhandlingexample.exception;

/**
 * @author emre.aydin
 * @since 11.12.2021
 */
public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(String message) {
        super(message);
    }
}
