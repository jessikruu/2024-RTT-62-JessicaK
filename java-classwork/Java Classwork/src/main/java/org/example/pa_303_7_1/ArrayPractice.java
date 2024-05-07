package org.example.pa_303_7_1;

import java.awt.font.FontRenderContext;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] arrayList = new int[3];

        arrayList[0] = 1;
        arrayList[1] = 2;
        arrayList[2] = 3;

        for (int pos = 0 ; pos < arrayList.length ; pos++) {
            System.out.println(arrayList[pos]);
        }

    }
}
