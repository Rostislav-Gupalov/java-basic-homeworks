package ru.otus.java.basic.finalproject.commands;

import ru.otus.java.basic.finalproject.Command;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static ru.otus.java.basic.finalproject.Application.getCurrentDirectory;
import static ru.otus.java.basic.finalproject.AuxiliaryMethods.getInputAfterCommand;

public class Find extends Command {

    private Path currentDirectory;
    private String fileToFind;

    @Override
    public void execute() throws IOException {
        currentDirectory = getCurrentDirectory();
        fileToFind = getInputAfterCommand();
        final List<File> foundFiles = new ArrayList<>();
        try (Stream<Path> walkStream = Files.walk(currentDirectory)) {
            walkStream.filter(p -> p.toFile().isFile())
                    .forEach(f -> {
                        if (f.toString().endsWith(fileToFind)) {
                            foundFiles.add(f.toFile());
                        }
                    });
        } catch (AccessDeniedException | UncheckedIOException e) {
            e.printStackTrace();
        }
        for (File f : foundFiles) System.out.println(f.getAbsolutePath());
        System.out.println("Текущий каталог: " + getCurrentDirectory());
    }
}
