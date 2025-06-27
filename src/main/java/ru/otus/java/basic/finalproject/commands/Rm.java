package ru.otus.java.basic.finalproject.commands;

import ru.otus.java.basic.finalproject.AuxiliaryMethods;
import ru.otus.java.basic.finalproject.Command;

import java.io.File;
import java.nio.file.Path;
import java.io.IOException;


import static ru.otus.java.basic.finalproject.Application.*;
import static ru.otus.java.basic.finalproject.AuxiliaryMethods.getInputAfterCommand;


public class Rm extends Command {

    private Path currentDirectory;
    private String inputAfterCommand;

    @Override
    public void execute() throws IOException {
        currentDirectory = getCurrentDirectory();
        inputAfterCommand = getInputAfterCommand();
        File fileToDelete = new File(currentDirectory.toString() + "\\" + inputAfterCommand);
        if (fileToDelete.isFile()) {
            if (fileToDelete.delete()) {
                System.out.println(inputAfterCommand + " удален(-а).");
            } else {
                System.out.println(inputAfterCommand + " отсутствует в папке.");
            }
        } else {
            if (AuxiliaryMethods.isEmpty(fileToDelete.toPath())) {
                if (fileToDelete.delete()) {
                    System.out.println(inputAfterCommand + " удален(-а).");
                } else {
                    System.out.println(inputAfterCommand + " отсутствует в папке.");
                }
            } else {
                for (File file : fileToDelete.listFiles()) file.delete();
                fileToDelete.delete();
                System.out.println("Папка " + inputAfterCommand + " удалена.");
            }
            System.out.println("Текущий каталог: " + getCurrentDirectory());
        }
    }
}
