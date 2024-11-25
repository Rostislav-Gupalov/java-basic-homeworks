package ru.otus.java.basic.finalproject;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;

import static ru.otus.java.basic.finalproject.AuxiliaryMethods.*;


public class Application {

    private static Path currentDirectory = Paths.get("C:\\");
    private static final Scanner scanner = new Scanner(System.in);
    private static String input;


    public static Path getCurrentDirectory() {
        return currentDirectory;
    }

    public static void setCurrentDirectory(Path path) {
        currentDirectory = path;
    }

    public static String getInput() {
        return input;
    }

    public static void main(String[] args) {
        hello();
        while (true) {
                try {
                    input = scanner.nextLine().trim();
                    parse();
                    Map<String, Command> commandMap = commandMap();
                    String request = getCommand();
                    Command reply = commandMap.get(request);
                    reply.execute();
                } catch (NullPointerException | IOException e) {
                    System.out.println("Данной команды/файла/папки не существует.");
                }
        }
    }
}