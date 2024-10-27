package ru.otus.java.basic.homework14;


public class ModifiedApplication {

    public static void main(String[] args) throws OutOfMemoryError {
        int n = 10000000;
        long time = System.currentTimeMillis();
        Double[] array = new Double[n];
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < (n / 4); i++) {
                array[i] = Application.calculation(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = (n / 4); i < (n / 2); i++) {
                array[i] = Application.calculation(i);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = (n / 2); i < (3 * n / 4); i++) {
                array[i] = Application.calculation(i);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = (3 * n / 4); i < n; i++) {
                array[i] = Application.calculation(i);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println(System.currentTimeMillis() - time);
    }
}