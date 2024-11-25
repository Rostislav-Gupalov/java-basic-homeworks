package ru.otus.java.basic.homework23.processors;

import ru.otus.java.basic.homework23.HttpRequest;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class DefaultBadRequestProcessor implements RequestProcessor {
    @Override
    public void execute(HttpRequest request, OutputStream output) throws IOException {
        String response = "" +
                "HTTP/1.1 400 Bad Request\r\n" +
                "Content-Type: text/html\r\n" +
                "\r\n" +
                "<html><body><h1>Bad Request: " + request.getException().getMessage() + "</h1></body></html>";
        output.write(response.getBytes(StandardCharsets.UTF_8));
        output.close();
    }

    @Override
    public void close() throws Exception {

    }
}