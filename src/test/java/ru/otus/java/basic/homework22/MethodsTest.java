package ru.otus.java.basic.homework22;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MethodsTest {

    @Test
    public void throwAfterOne() {
        int[] throwArray = {2, 2, 2};
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> Methods.afterOne(throwArray),
                "В данном массиве отсутствуют единицы");
    }

    @Test
    public void noThrowAfterOne() {
        int[] noThrowArray = {1, 2, 1, 2, 2};
        assertDoesNotThrow(() -> Methods.afterOne(noThrowArray));
    }


    @Test
    public void testCheckOneTwo() {
        int[] array1 = {1, 2};
        int[] array2 = {1, 1};
        int[] array3 = {1, 3};
        int[] array4 = {1, 2, 2, 1};
        assertAll(() -> assertTrue(Methods.checkOneTwo(array1)),
                () -> assertFalse(Methods.checkOneTwo(array2)),
                () -> assertFalse(Methods.checkOneTwo(array3)),
                () -> assertTrue(Methods.checkOneTwo(array4)));
                }
    }
