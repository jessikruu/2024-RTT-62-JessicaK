package org.example.pa_303_7_1;

import java.util.Arrays;

public class ArrayPractive3 {
    public static void main(String[] args) {

        String[] colors = {"red", "green", "blue", "yellow"};

        int length = colors.length;

        System.out.println("The length of colors array is " + length);

        String[] newArray = colors.clone();

        System.out.println(Arrays.toString(newArray));
    }
}
