package ru.otus.java.basic.finalproject.commands;

import ru.otus.java.basic.finalproject.Command;

import java.io.IOException;

public class Exit extends Command {

    @Override
    public void execute() throws IOException {
        System.exit(0);
    }
}
