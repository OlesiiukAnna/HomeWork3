package org.anna.task_3;

import java.util.Arrays;

public class Task_03_2 {
    public static void main(String[] args) {
        int[] array = {-20, -8, 3, 6, 10, 15};

        System.out.println(Arrays.toString(array));

        int[] result = sortSquareArray(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortSquareArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = square(array[i]);
        }
        return sort(array);
    }

    public static int[] sort(int[] array) {
        int minValue;
        int index;

        for (int i = 0; i < array.length; i++) {
            minValue = array[i];
            index = i;
            for (int j = i; j < array.length; j++) {
                if (minValue > array[j]) {
                    minValue = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = minValue;
            array[index] = temp;
        }
        return array;
    }

    public static int square(int number) {
        return number * number;
    }
}
