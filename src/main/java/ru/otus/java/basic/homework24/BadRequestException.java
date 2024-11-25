package ru.otus.java.basic.homework24;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}