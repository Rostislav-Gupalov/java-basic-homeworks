package ru.otus.java.basic.finalproject.commands;

import ru.otus.java.basic.finalproject.Command;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static ru.otus.java.basic.finalproject.Application.*;
import static ru.otus.java.basic.finalproject.AuxiliaryMethods.getInputAfterCommand;

public class Cd extends Command {

    private Path currentDirectory;
    private String inputAfterCommand;

    @Override
    public void execute() {
        currentDirectory = getCurrentDirectory();
        inputAfterCommand = getInputAfterCommand();
        if (inputAfterCommand.equals("..")) {
            currentDirectory = currentDirectory.getParent();
            setCurrentDirectory(currentDirectory);
        } else {
            File directoryToGo = new File(inputAfterCommand);
            if (directoryToGo.isDirectory() && directoryToGo.exists()) {
                setCurrentDirectory(Paths.get(inputAfterCommand));
            } else System.out.println("Перейти в данную директорию невозможно - либо данной директории не существует," +
                    " либо введён неверный адрес.");
        }
        System.out.println("Текущий каталог: " + getCurrentDirectory());
    }
}


