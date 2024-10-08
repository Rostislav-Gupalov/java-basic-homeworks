package ru.otus.java.basic.homework13.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Socket socket = new Socket("localhost", 8888);
            PingClient client = new PingClient(socket);

        ) {
            System.out.println("Доступные операторы: + - * /");
            System.out.println("Введите два числа и оператор через пробел так, чтобы оператор был между числами.");
            String userInput = scanner.nextLine();
            client.send(userInput);
            System.out.println(client.read());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
