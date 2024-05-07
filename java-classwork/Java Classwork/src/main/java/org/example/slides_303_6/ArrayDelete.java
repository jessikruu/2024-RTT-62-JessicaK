package org.example.slides_303_6;

public class ArrayDelete {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5};

        //now lets delete item as position 2

        int deletedPosition = 2;
        if (deletedPosition < 0 || deletedPosition > array.length) {
            System.out.println("Position to delete is invalid");
        }

        //1. create a new array with size -1
        int[] deleted = new int[array.length - 1];

        //2. copy the first elements up to but not including the deleted position
        for (int pos = 0 ; pos < 4 ; pos++) {
            deleted[pos] = array[pos];
        }

        //3. copy the last elements into pos-1 in the new array
        for (int pos = deletedPosition +1; pos < array.length ; pos++) {
            deleted[pos -1] = array[pos];
        }

    }
}
