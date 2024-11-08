package ru.otus.java.basic.homework20;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла");
        String fileName = scanner.nextLine();
        System.out.println("Введите последовательность символов");
        String str = scanner.nextLine();
        char[] strToChars = str.toCharArray();

        try {
            FileReader fileReader = new FileReader(fileName, StandardCharsets.UTF_8);
            int byteRead;
            List<Character> fileToChars = new ArrayList<>();
            while ((byteRead = fileReader.read()) != -1) {
                fileToChars.add((char) byteRead);
            }
            char[] fileToCharsArray = new char[fileToChars.size()];
            for (int i = 0; i < fileToChars.size(); i++) fileToCharsArray[i] = fileToChars.get(i);


            boolean check = true;
            int count = 0;
            for (int j = 0; j < (fileToCharsArray.length - strToChars.length + 1); j++) {
                for (int k = 0; k < strToChars.length; k++) {
                    if (fileToCharsArray[j + k] == strToChars[k]) {
                        check = true;
                    } else check = false;
                }
                if (check) count++;
            }
            System.out.println("Последовательность символов встречается в тексте " + count + " раз.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
