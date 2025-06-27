package ru.otus.java.basic.finalproject.commands;

import ru.otus.java.basic.finalproject.Command;

import java.io.File;
import java.nio.file.Path;

import static ru.otus.java.basic.finalproject.Application.*;
import static ru.otus.java.basic.finalproject.AuxiliaryMethods.getInputAfterCommand;

public class Mkdir extends Command {

    private Path currentDirectory;
    private String inputAfterCommand;

    @Override
    public void execute() {
        currentDirectory = getCurrentDirectory();
        inputAfterCommand = getInputAfterCommand();
        File newFile = new File(currentDirectory.toString() + "\\" + inputAfterCommand);
        if (!newFile.exists()) {
            newFile.mkdirs();
            System.out.println("Папка " + inputAfterCommand + " создана в папке " + currentDirectory.toString());
        } else {
            System.out.println("Папка " + inputAfterCommand + " уже существует в папке " + currentDirectory.toString());
        }
        System.out.println("Текущий каталог: " + getCurrentDirectory());
    }
}
