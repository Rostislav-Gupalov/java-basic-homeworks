package ru.otus.java.basic.homework23;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}