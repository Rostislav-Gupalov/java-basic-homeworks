package ru.otus.java.basic.homework8;

public class Application {

    public static void main(String[] args) {
        String[][] array = new String[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "а";
            }
        }
        sum(array);
    }

    public static void sum(String[][] array) {
        int sum = 0;
        if (array.length == 4) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].length != 4) {
                    throw new AppArraySizeException("Некорректный размер массива. Требуется двумерный массив 4х4.");
                }
            }
        } else throw new AppArraySizeException("Некорректный размер массива. Требуется двумерный массив 4х4.");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ячейка [" + i + ", " + j + "] содержит строку, которую невозможно преобразовать в Integer");
                }
            }
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }
}

