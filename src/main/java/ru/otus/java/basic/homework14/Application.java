package ru.otus.java.basic.homework14;


import java.sql.SQLOutput;

public class Application {


    public static void main(String[] args) throws OutOfMemoryError {
            int arraySize = 10000000;
            long time = System.currentTimeMillis();
            double[] array = new double[arraySize];
            for (int i = 0; i < array.length; i++) {
                array[i] = calculation(i);
            }
            System.out.println(System.currentTimeMillis() - time);
        }

    public static double calculation(int i) {
        return 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
    }
}

