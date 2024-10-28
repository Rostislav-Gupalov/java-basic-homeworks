package ru.otus.java.basic.homework14;


public class ModifiedApplication {

    public static void main(String[] args) throws OutOfMemoryError, InterruptedException {
        int arraySize = 10000000;
        long time = System.currentTimeMillis();
        double[] array = new double[arraySize];
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < (arraySize / 4); i++) {
                array[i] = Application.calculation(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = (arraySize / 4); i < (arraySize / 2); i++) {
                array[i] = Application.calculation(i);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = (arraySize / 2); i < (3 * arraySize / 4); i++) {
                array[i] = Application.calculation(i);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = (3 * arraySize / 4); i < arraySize; i++) {
                array[i] = Application.calculation(i);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println(System.currentTimeMillis() - time);
    }
}