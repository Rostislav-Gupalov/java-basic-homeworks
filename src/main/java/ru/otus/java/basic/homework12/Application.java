package ru.otus.java.basic.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;


public class Application {

    public static void main(String[] args) {
        start();
        System.out.println("Введите номер файла из предложенных выше для дальнейшей работы:");
        Scanner scanner = new Scanner(System.in);
        String chosenFile = scanner.nextLine();
        readFile(chosenFile);
        System.out.println();
        System.out.println("Введите информацию для записи в выбранный файл.");
        String data = scanner.nextLine();
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(chosenFile + ".txt"))) {
            writeInFile(data, out);
        } catch (IOException e) {
        e.printStackTrace();
    }
    }

    public static void start() {
        File file1 = new File("1.txt");
        File file2 = new File("2.txt");
        File file3 = new File("3.txt");
        File root = new File("C:\\Учёба\\Java Basic\\java-basic-homeworks");
        findFiles(root, ".txt");
    }

    private static void findFiles(File root, String ext) {
        File[] listFiles = root.listFiles(new MyFileNameFilter(ext));
        if(listFiles.length == 0) {
            System.out.println(root.getPath() + " не содержит файлов с расширением " + ext);
        }else{
            for(File f : listFiles)
                System.out.println("Файл: " + root.getPath() + File.separator + f.getName());
        }
    }

    private static void readFile(String chosenFile) {
            try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(chosenFile + ".txt"))) {
                int n = in.read();
                while (n != -1) {
                    System.out.print((char)n);
                    n = in.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    private static void writeInFile(String data, BufferedOutputStream out) throws IOException {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
    }
}
