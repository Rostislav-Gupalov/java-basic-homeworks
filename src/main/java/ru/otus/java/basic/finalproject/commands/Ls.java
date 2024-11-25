package ru.otus.java.basic.finalproject.commands;


import ru.otus.java.basic.finalproject.Command;


import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static ru.otus.java.basic.finalproject.Application.*;
import static ru.otus.java.basic.finalproject.AuxiliaryMethods.*;

public class Ls extends Command {

    private Path currentDirectory;
    private String inputAfterCommand;

    @Override
    public void execute() {
        currentDirectory = getCurrentDirectory();
        inputAfterCommand = getInputAfterCommand();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(currentDirectory)) {
            if ((inputAfterCommand != null) && (inputAfterCommand.equals("-i"))) {
                for (Path file : stream) {
                    System.out.println("Наименование: " + file.getFileName() + " | Размер: " +
                            calculateSize(file.toFile()) + " байт | Дата последнего изменения: " + lastModified(file));
                }
            }  else {
                for (Path file : stream) {
                    System.out.println(file.getFileName());
                }
            }
            System.out.println("Текущий каталог: " + getCurrentDirectory());
        } catch(IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


