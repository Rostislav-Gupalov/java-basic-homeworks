package ru.otus.java.basic.finalproject.commands;

import ru.otus.java.basic.finalproject.Command;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static ru.otus.java.basic.finalproject.Application.*;
import static ru.otus.java.basic.finalproject.AuxiliaryMethods.*;

public class Cp extends Command {


    private String source;
    private String destination;

    @Override
    public void execute() throws IOException {
        additionalParse();
        source = getSource();
        destination = getDestination();
        if (source.startsWith("-f")) {
            source = source.substring(3);
            File destinationFile = new File(destination);
            if (destinationFile.exists()) destinationFile.delete();
            Files.copy(Paths.get(source), Paths.get(destination));
            System.out.println("Файл перезаписан успешно");
        } else {
            Files.copy(Paths.get(source), Paths.get(destination));
            System.out.println("Копирование завершено успешно.");
        }
        System.out.println("Текущий каталог: " + getCurrentDirectory());
    }
}
