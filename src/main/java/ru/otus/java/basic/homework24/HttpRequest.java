package ru.otus.java.basic.homework24;


import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class HttpRequest {
    private String rawRequest;
    private HttpMethod method;
    private String uri;
    private Map<String, String> parameters;
    private String body;
    private Exception exception;
    private Map<String, String> headers;
    private String header;
    private static final Logger LOGGER = Logger.getLogger(HttpRequest.class.getName());

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public String getUri() {
        return uri;
    }

    public String getRoutingKey() {
        return method + " " + uri;
    }

    public String getBody() {
        return body;
    }

    public HttpRequest(String rawRequest) {
        this.rawRequest = rawRequest;
        this.parse();
    }

    public String getParameter(String key) {
        return parameters.get(key);
    }

    public boolean containsParameter(String key) {
        return parameters.containsKey(key);
    }

    public String getHeader(String key) {
        return headers.get(key);
    }

    private void parse() {
        int startIndex = rawRequest.indexOf(' ');
        int endIndex = rawRequest.indexOf(' ', startIndex + 1);
        uri = rawRequest.substring(startIndex + 1, endIndex);
        method = HttpMethod.valueOf(rawRequest.substring(0, startIndex));
        parameters = new HashMap<>();
        if (uri.contains("?")) {
            String[] elements = uri.split("[?]");
            uri = elements[0];
            String[] keysValues = elements[1].split("[&]");
            for (String o : keysValues) {
                String[] keyValue = o.split("=");
                parameters.put(keyValue[0], keyValue[1]);
            }
        }
        if (method == HttpMethod.POST) {
            this.body = rawRequest.substring(rawRequest.indexOf("\r\n\r\n") + 4);
        }
        headers = new HashMap<>();
        try {
             while (true) {
                 int headerStartIndex = rawRequest.indexOf('\n', endIndex);
                 int headerEndIndex = rawRequest.indexOf('\n', headerStartIndex + 1);
                 header = rawRequest.substring(headerStartIndex + 1, headerEndIndex);
                 String[] headerKeyValue = header.split(": ", 2);
                 headers.put(headerKeyValue[0], headerKeyValue[1]);
                 endIndex = headerEndIndex;
             }
        } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
            LOGGER.info("Парсинг завершён");
        }
    }

        public void info(boolean debug){
            if (debug) {
                LOGGER.info(rawRequest);
            }
            LOGGER.info("Method: " + method);
            LOGGER.info("URI: " + uri);
            LOGGER.info("Parameters: " + parameters);
            LOGGER.info("Body: " + body);
            // Пример работы Map<String,String> headers:
            LOGGER.info(headers.get("Accept"));
        }
    }
