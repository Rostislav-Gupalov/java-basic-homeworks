package ru.otus.java.basic.homework22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methods {

    public static void afterOne(int... array) {
        List<Integer> newList = new ArrayList<>();
        for (int i = (array.length - 1); (i + 1) > 0; i--) {
            if (array[i] != 1) {
                newList.add(array[i]);
            } else break;
        }
        if (array.length == newList.size()) throw new RuntimeException("В массиве отсутствуют единицы.");
        int[] newArray = new int[newList.size()];
        for (int j = 0; j < newArray.length; j++) newArray[j] = newList.get(newList.size() - j - 1);
        System.out.println(Arrays.toString(newArray));
    }

    public static boolean checkOneTwo(int[] array) {
        boolean check = false;
        int ones = 0;
        int twos = 0;
        for (int i : array) {
            if (i == 1) ones++;
            if (i == 2) twos++;
            check = ((i == 1) || (i == 2)) && (ones != 0) && (twos != 0) ;
        }
        return check;
    }
}
