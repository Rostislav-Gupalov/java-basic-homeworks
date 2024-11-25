package ru.otus.java.basic.finalproject.commands;

import ru.otus.java.basic.finalproject.Command;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;


import static ru.otus.java.basic.finalproject.Application.*;
import static ru.otus.java.basic.finalproject.AuxiliaryMethods.*;

public class Finfo extends Command {

    private Path currentDirectory;
    private String inputAfterCommand;

    @Override
    public void execute() throws IOException {
        currentDirectory = getCurrentDirectory();
        inputAfterCommand = getInputAfterCommand();
        File inputAfterCommandFile = new File(currentDirectory.toString() + "\\" + inputAfterCommand);
        System.out.println("Наименование: " + inputAfterCommand + " | Размер: " +
                calculateSize(inputAfterCommandFile) + " байт | Дата последнего изменения: " +
                lastModified(inputAfterCommandFile.toPath()));
        System.out.println("Текущий каталог: " + getCurrentDirectory());
    }


}
