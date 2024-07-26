package ru.otus.java.basic.homework1;

import java.util.Scanner;
import java.util.Random;

public class homework_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Выберите номер метода - от 1 до 5:");
        int method = scanner.nextInt();
        if (method == 1) {
            greetings();
        } else if (method == 2) {
            int a = random.nextInt();
            System.out.println("a = " + a);
            int b = random.nextInt();
            System.out.println("b = " + b);
            int c = random.nextInt();
            System.out.println("c = " + c);
            checkString(a, b, c);
        } else if (method == 3) {
            selectColor();
        } else if (method == 4) {
            compareNumbers();
        } else if (method == 5) {
            boolean increment = random.nextBoolean();
            System.out.println("Increment = " + increment);
            int initValue = random.nextInt();
            System.out.println("initValue = " + initValue);
            int delta = random.nextInt();
            System.out.println("delta = " + delta);
            addOrSubtractAndPrint(initValue, delta, increment);
        } else System.out.println("Введён некорректный номер.");
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkString(int a, int b, int c) {
        if ((a + b + c) >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    public static void selectColor() {
        Random random = new Random();
        int data = random.nextInt();
        System.out.println("data = " + data);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Жёлтый");
        } else System.out.println("Зелёный");
    }

    public static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        System.out.println("a = " + a);
        System.out.println("b= " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;
        if (increment == true) {
            result = initValue + delta;
        } else {
            result = initValue - delta;
        }
        System.out.println("Result =" + result);
    }
}
