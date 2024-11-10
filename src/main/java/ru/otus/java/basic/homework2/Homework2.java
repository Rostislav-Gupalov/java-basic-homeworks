package ru.otus.java.basic.homework2;

import java.util.Arrays;
import java.util.Scanner;


public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Введите строку:");
        String S = scanner.nextLine();
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        task1(S, n);
        task2(new int[]{3, 6, 7, 6, 10});
        int[] array3 = new int[5];
        System.out.println("3. Задан массив " + Arrays.toString(array3));
        System.out.println("Введите число: ");
        int m = scanner.nextInt();
        task3(array3, m);
        int[] array4 = {1, 2, 3, 4, 5};
        System.out.println("4. Задан массив " + Arrays.toString(array4));
        System.out.println("Введите число: ");
        int k = scanner.nextInt();
        task4(array4, k);
        task5(new int[]{1, 2, 3, 4, 5, 6});
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1(String S, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Результат:\n" + S);
        }
    }

    public static void task2(int[] array) {
        System.out.println("2. Задан массив: " + Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.print("\nВ заданном массиве сумма чисел, больше 5, равна: ");
        System.out.println(sum);
    }

    public static void task3(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
        }
        System.out.println("Новый массив: " + Arrays.toString(array));
    }

    public static void task4(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] += n;
        }
        System.out.println("Новый массив: " + Arrays.toString(array));
    }

    public static void task5(int[] array) {
        System.out.println("5. Задан массив: " + Arrays.toString(array));
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < (array.length / 2); i++) {
            sum1 += array[i];
        }
        for (int i = (array.length / 2); i < array.length; i++) {
            sum2 += array[i];
        }
        if (sum1 > sum2) {
            System.out.println("Сумма элементов первой половины массива больше, чем сумма элементов второй половины.");
        } else if (sum1 < sum2) {
            System.out.println("Сумма элементов второй половины массива больше, чем сумма элементов первой половины.");
        } else System.out.println("Сумма элементов первой половины массива равна сумме элементов второй половины.");
    }

    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("6. Введите количество массивов");
        int number = scanner.nextInt();
        int lengthSum = 0;
        int[] length = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Введите длину массива №" + (i + 1));
            length[i] = scanner.nextInt();
            lengthSum = Arrays.stream(length).max().getAsInt();
        }
        int[] arraySum = new int[lengthSum];
        for (int i = 0; i < number; i++) {
            int[] array = new int[length[i]];
            System.out.println("Введите элементы массива № " + (i + 1) + ":");
            for (int j = 0; j < length[i]; j++) {
                array[j] = scanner.nextInt();
                arraySum[j] += array[j];
            }
            System.out.println("Массив № " + (i + 1) + ": " + Arrays.toString(array));
        }
        System.out.println("Новый массив: " + Arrays.toString(arraySum));
    }

    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("7. Введите длину массива:");
        int length = scanner.nextInt();
        int[] array = new int[length];
        int arraySum = 0;
        int tochka = 0;
        int n = 0;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            arraySum += array[i];
        }
        System.out.println("Массив: " + Arrays.toString(array));
        for (int i = 0; i < length; i++) {
            tochka += array[i];
            if (tochka == (arraySum / 2) && (arraySum % 2 ==0)) {
                System.out.println("Точка находится между элементами " + (i + 1) + " и " + (i + 2));
                n = 1;
                break;
            }
        }
        if (n == 0) {
            System.out.println("Точки в массиве нет.");
        }
    }

    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("8. Введите длину массива:");
        int length = scanner.nextInt();
        if (length == 1) {
            System.out.println("Длина массива должна быть больше 1.");
        } else {
            int[] array = new int[length];
            int n = 0;
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Массив: " + Arrays.toString(array));
            System.out.println("Выберите метод проверки:\n1 - по убыванию\n2 - по возрастанию");
            int method = scanner.nextInt();
            if (method == 1) {
                for (int i = 0; i < (length - 1); i++) {
                    if (array[i] > array[i + 1]) {
                        n += 1;
                    }
                }
                if (n == (length - 1)) {
                    System.out.println("Элементы массива расположены в порядке убывания.");
                } else {
                    System.out.println("Элементы массива не расположены в порядке убывания");
                }
            } else if (method == 2) {
                for (int i = 0; i < (length - 1); i++) {
                    if (array[i] < array[i + 1]) {
                        n += 1;
                    }
                }
                if (n == (length - 1)) {
                    System.out.println("Элементы массива расположены в порядке возрастания.");
                } else {
                    System.out.println("Элементы массива не расположены в порядке возрастания");
                }
            } else {
                System.out.println("Вы не выбрали метод проверки. Попробуйте ещё раз.");
            }
        }
    }

    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("9. Введите длину массива:");
        int length = scanner.nextInt();
        int[] array = new int[length];
        int n = 0;
        int spacer = 0;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString(array));
        for (int i = 0; i < (length/2); i++) {
            spacer = array[i];
            array[i] = array[length-1-i];
            array[length-1-i] = spacer;
        }
        System.out.println("Новый массив: " + Arrays.toString(array));
    }
}
