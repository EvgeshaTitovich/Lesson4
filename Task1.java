package com.lessons.lesson4;

import java.util.Arrays;

/**
 * 1. Напишите программу, которая циклически сдвигает элементы
 * массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится
 * самым первым его элементом.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] values = {5, 3, 7, 8, 3, 1};
        shift(values);
        System.out.println(Arrays.toString(values));
    }

    public static void shift(int[] values) {
        int lastElement = values[values.length - 1];
        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = lastElement;
    }
}
