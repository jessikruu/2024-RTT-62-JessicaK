package org.example.slieds_303_7;

public class FindSmallestElement {
    public static void main(String[] args) {
        int[] myarray = {0, 2, 4, 6, 8, 10};

        int minVal = myarray[0];
        for (int i = 0; i < myarray.length; i++) {
            int value = myarray[1];
            if (value < minVal) {
                minVal = myarray[i];
            }
        }
        System.out.println("minVal = " + minVal);
    }
}
