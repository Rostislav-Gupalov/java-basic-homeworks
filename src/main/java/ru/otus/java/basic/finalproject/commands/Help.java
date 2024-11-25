package ru.otus.java.basic.finalproject.commands;


import ru.otus.java.basic.finalproject.Command;

import static ru.otus.java.basic.finalproject.Application.getCurrentDirectory;


public class Help extends Command {

    @Override
    public void execute() {
        System.out.println("• ls – распечатать список файлов текущего каталога.\n" +
                "• ls -i - распечатать подробную информацию о файлах текущего каталога.\n" +
                "• cd [path] – переход в указанную поддиректорию.\n" +
                "• cd .. – переход в родительский каталог.\n" +
                "• mkdir [name] – создание новой директории с указанным именем\n" +
                "• rm [filename] – удаление указанного файла или директории (* возможность удаления не пустого каталога)\n" +
                "• mv [source] [destination] – переименовать/перенести файл или директорию\n" +
                "• cp [source] [destination] – скопировать файл\n" +
                "• finfo [filename] – получить подробную информацию о файле\n" +
                "• help – вывод в консоль всех поддерживаемых команд\n" +
                "• find [filename] – найти файл с указанным именем в текущем каталоге или любом его подкаталоге.\n" +
                "• exit – завершить работу\n" +
                "Файлы и папки при использовании команд должны указываться в виде адреса - С:\\...");
        System.out.println("Текущий каталог: " + getCurrentDirectory());
    }
}
