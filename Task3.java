package com.lessons.lesson4;

import java.util.Arrays;

/**
 * Заданы 2 массива целых чисел произвольной длины. 
 *     Написать программу, создающую третий массив,
 * представляющий собой слияние 2-х заданных.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] values1 = {5, 3, 2, 1, 5};
        int[] values2 = {7, 14, 9};
        int[] arraysConcat = arraysConcat(values1, values2);
        System.out.println(Arrays.toString(arraysConcat));
    }

    public static int[] arraysConcat(int[] values1, int[] values2) {
        int[] result = new int[values1.length + values2.length];

        for (int i = 0, index1 = 0, index2 = 0; i < result.length; ) {

            if (index1 < values1.length) {
                result[i++] = values1[index1++];
            }
            if (index2 < values2.length) {
                result[i++] = values2[index2++];
            }
        }

        return result;

    }
}
