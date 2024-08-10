package ru.otus.java.basic.homework3;

import java.util.Arrays;

public class Homework3 {

    public static void main(String[] args) {
        int[][] array = {{5, -7, 3}, {-17, 7, 8}, {1, -12, 35}};
        System.out.println(sumOfPositiveElements(array));
        square(10);
        diagonalsNulling(array);
        System.out.println(findMax(array));
        System.out.println(sumSecondColumn(array));
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void square(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diagonalsNulling(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == j) || ((i + j + 1) == array.length)) array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) max = array[i][j];
            }
        }
        return max;
    }

    public static int sumSecondColumn(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length < 2) {
                sum = -1;
            } else {
                sum += array[i][1];
            }
        }
        return sum;
    }
}


