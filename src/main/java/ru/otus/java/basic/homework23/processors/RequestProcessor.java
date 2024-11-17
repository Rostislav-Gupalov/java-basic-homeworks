package ru.otus.java.basic.homework23.processors;

import ru.otus.java.basic.homework23.HttpRequest;

import java.io.IOException;
import java.io.OutputStream;

public interface RequestProcessor extends AutoCloseable {
    void execute(HttpRequest request, OutputStream output) throws IOException;
}
