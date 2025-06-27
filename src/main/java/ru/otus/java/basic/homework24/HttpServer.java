package ru.otus.java.basic.homework24;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import static java.util.logging.LogManager.getLogManager;

public class HttpServer {
    private int port;
    private Dispatcher dispatcher;
    private static final Logger LOGGER = Logger.getLogger(HttpServer.class.getName());


    public HttpServer(int port) {
        this.port = port;
        this.dispatcher = new Dispatcher();
    }

    public void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            LOGGER.info("Сервер запущен на порту: {}, port");
            ExecutorService executorService = Executors.newFixedThreadPool(4);
            while (true) {
                Socket socket = serverSocket.accept();
                executorService.execute(() -> {
                    try {
                        byte[] buffer = new byte[8192];
                        int n = socket.getInputStream().read(buffer);
                        String rawRequest = new String(buffer, 0, n);
                        HttpRequest request = new HttpRequest(rawRequest);
                        request.info(true);
                        dispatcher.execute(request, socket.getOutputStream());
                    } catch (IOException e) {
                        e.printStackTrace();
                        LOGGER.info("IOException");
                    } catch (StringIndexOutOfBoundsException e) {
                        LOGGER.info("Обработка запроса завершена");;
                    }
                });
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            LOGGER.info("RuntimeException");
        }
    }
}
