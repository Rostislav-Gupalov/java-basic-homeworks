package ru.otus.java.basic.homework13.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket clientSocket = serverSocket.accept();
            readRequest(clientSocket);
        }
    }

    private static void readRequest(Socket socket) throws IOException {
        DataInputStream input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));

        String str = input.readUTF();
        String[] inputs = str.split(" ");
        if (inputs[1].equals ("+")) {
            str = String.valueOf(Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[2]));
        }
        if (inputs[1].equals("-")) {
            str = String.valueOf(Integer.parseInt(inputs[0]) - Integer.parseInt(inputs[2]));
        }
        if (inputs[1].equals("*")) {
            str = String.valueOf(Integer.parseInt(inputs[0]) * Integer.parseInt(inputs[2]));
        }
        if (inputs[1].equals("/")) {
            str = String.valueOf(Integer.parseInt(inputs[0]) / Integer.parseInt(inputs[2]));
        }
        output.writeUTF(str);
        output.flush();
    }
}
