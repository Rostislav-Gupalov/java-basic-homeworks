package ru.otus.java.basic.finalproject.commands;

import ru.otus.java.basic.finalproject.Command;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static ru.otus.java.basic.finalproject.Application.*;
import static ru.otus.java.basic.finalproject.AuxiliaryMethods.*;

public class Mv extends Command {

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
            Files.move(Paths.get(source), Paths.get(destination));
            System.out.println("Файл перезаписан успешно");
        } else {
            Path temp = Files.move(Paths.get(source), Paths.get(destination));
            if (temp != null) System.out.println("Файл/папка перенесен(-а)/переименован(-а) успешно");
            else System.out.println("Не удалось перенести/переименовать файл/папку");
        }
        System.out.println("Текущий каталог: " + getCurrentDirectory());
    }
}



