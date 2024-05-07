package org.example.pa_303_7_1;

import java.util.Arrays;
import java.util.Random;

public class HomeworkArrays {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("The array is: " + Arrays.toString(array));

        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minVal) {
                minVal = array[i];
            }
        }
        System.out.println("Min value is: " + minVal);

        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }
        System.out.println("Max value is: " + maxVal);
    }
}
