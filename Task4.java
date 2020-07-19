package com.lessons.lesson4;

import java.util.Arrays;

/**
 * Написать функцию linearize, которая принимает в качестве
 * параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами
 * двумерного.
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] values = {
                {1, 3, 5},
                {7, 9, 12},
        };
        int[] result = linearize(values);
        System.out.println(Arrays.toString(result));
    }

    public static int[] linearize(int[][] values) {
        int result[] = new int[values.length * values[0].length];
        for (int i = 0; i < values.length; i++) {
            int[] row = values[i];
            for (int j = 0; j < row.length; j++) {
                int number = values[i][j];
                result[i * row.length + j] = number;
            }
        }
        return result;
    }
}
