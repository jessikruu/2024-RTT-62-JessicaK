package org.example.pa_303_7_1;

import java.util.Arrays;

public class ArrayPractice9 {
    public static void main(String[] args) {
        int[] array = {4, 2, 9, 13, 1, 0};

        Arrays.sort(array);

        System.out.println("Array in ascending order: " + Arrays.toString(array));
        System.out.println("The smallest number: " + array[0]);
        System.out.println("The largest number: " + array[array.length-1]);
    }
}
