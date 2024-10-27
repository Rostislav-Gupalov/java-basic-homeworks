package ru.otus.java.basic.homework14;


import java.sql.SQLOutput;

public class Application {


    public static void main(String[] args) throws OutOfMemoryError {
            int n = 10000000;
            long time = System.currentTimeMillis();
            Double[] array = new Double[n];

            //К сожалению, мне не удалось создать массив длиной 100 миллионов элементов - не хватило памяти,
            // несмотря на все манипуляции с shared build process heap size и maximum heap size. В данном ДЗ
            // используется массив длиной 10 миллионов.

            for (int i = 0; i < array.length; i++) {
                array[i] = calculation(i);
            }
            System.out.println(System.currentTimeMillis() - time);
        }

    public static double calculation(int i) {
        return 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
    }
}

