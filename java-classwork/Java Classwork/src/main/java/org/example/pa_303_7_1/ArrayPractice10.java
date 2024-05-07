package org.example.pa_303_7_1;

import java.util.Arrays;

public class ArrayPractice10 {
    public static void main(String[] args) {
        Object[] mixedArray = new Object[5];

        mixedArray[0] = 5;
        mixedArray[1] = "Hello";
        mixedArray[2] = "Java";
        mixedArray[3] = "World";
        mixedArray[4] = 1.25;

        System.out.println("The array is: " + Arrays.toString(mixedArray));
    }
}
