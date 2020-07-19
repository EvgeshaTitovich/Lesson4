package com.lessons.lesson4;

/**
 * 2. Написать программу, удаляющую все повторяющиеся целые
 * числа из массива и печатающую результат.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] values = {4, 7, 3, 8, 4, 3};
        duplicates(values);

    }

    public static void duplicates(int[] values) {

        for (int i = 0; i < values.length; i++) {
            boolean a = true;
            for (int j = 0; j < i; j++) {
                if (values[i] == values[j]) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(values[i] + " ");
            }
        }
    }
}
