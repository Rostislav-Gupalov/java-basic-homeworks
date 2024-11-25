package ru.otus.java.basic.finalproject;

import ru.otus.java.basic.finalproject.commands.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static ru.otus.java.basic.finalproject.Application.*;

public class AuxiliaryMethods {

    private static String input;
    private static String command;
    private static String inputAfterCommand;
    private static String source;
    private static String destination;

    public static String getCommand() {
        return command;
    }

    public static String getInputAfterCommand() {
        return inputAfterCommand;
    }

    public static String getSource() {
        return source;
    }

    public static String getDestination() {
        return destination;
    }

    public static void hello() {
        System.out.println("Добро пожаловать в Файловый Менеджер!\nВведите команду. Для отображения доступных команд используйте команду help." +
                "\nТекущий каталог: " + getCurrentDirectory());
    }

    public static Map<String, Command> commandMap() {
        Map<String, Command> commandMap = new HashMap<>();
        Ls ls = new Ls();
        Cd cd = new Cd();
        Mkdir mkdir = new Mkdir();
        Rm rm = new Rm();
        Mv mv = new Mv();
        Cp cp = new Cp();
        Finfo finfo = new Finfo();
        Help help = new Help();
        Find find = new Find();
        Exit exit = new Exit();

        commandMap.put("ls", ls);
        commandMap.put("cd", cd);
        commandMap.put("mkdir", mkdir);
        commandMap.put("rm", rm);
        commandMap.put("mv", mv);
        commandMap.put("cp", cp);
        commandMap.put("finfo", finfo);
        commandMap.put("help", help);
        commandMap.put("find", find);
        commandMap.put("exit", exit);
        return commandMap;
    }

    public static void parse() {
        input = getInput();
        if (input.contains(" ")) {
            int splitIndex = input.indexOf(" ");
            command = input.substring(0, splitIndex);
            inputAfterCommand = input.substring(splitIndex + 1);
        } else command = input;
    }

    public static void additionalParse() {
        int splitIndex = inputAfterCommand.indexOf(":\\", 5);
        source = inputAfterCommand.substring(0, splitIndex - 2);
        destination = inputAfterCommand.substring(splitIndex - 1);
    }

    public static long calculateSize(File source) {
        long length = 0;
        if (source.isFile()) length = source.length();
        else {
            if (source.listFiles() != null) {
                for (File file : source.listFiles()) {
                    if (file.isFile()) length += file.length();
                    else length += calculateSize(file);
                }
            }
        }
        return length;
    }

    public static String lastModified(Path source) throws IOException {
        FileTime lastModified = Files.getLastModifiedTime(source, LinkOption.NOFOLLOW_LINKS);
        DateFormat df = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
        Date date = new Date(lastModified.toMillis());
        return df.format(date);
    }

    public static boolean isEmpty(Path path) throws IOException {
        //if (Files.isDirectory(path)) {
            try (Stream<Path> entries = Files.list(path)) {
                return entries.findFirst().isEmpty();
            }
        }
        //return false;
    }

