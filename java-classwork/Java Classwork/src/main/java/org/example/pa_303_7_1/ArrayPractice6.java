package org.example.pa_303_7_1;

public class ArrayPractice6 {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0 ; i < array.length ; i++) {
            array[i] = i*2;
        }

        for (int i = 0 ; i < array.length ; i++) {
            System.out.println("Index " + i + ":" + array[i]);
        }
    }
}
