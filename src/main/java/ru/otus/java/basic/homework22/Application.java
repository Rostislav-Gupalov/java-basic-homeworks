package ru.otus.java.basic.homework22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        int[] array = {2, 2, 1, 2, 3};
        Methods.afterOne(array);
        System.out.println(Methods.checkOneTwo(array));
    }


}

