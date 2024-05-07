package org.example.slides_303_6;

import java.util.Arrays;

public class ArrayInsert {

    public static int[] insert(int[] source, int insertPosition, int valueToInsert) {

        //lets write some code to insert an element into the array at position 2
        //1. create a new array of size +1

        int[] result = new int[source.length + 1];

        //2. copy the first part of the array (before position 2) from the old to the new
        for (int pos = 0; pos < insertPosition; pos++) {
            result[pos] = source[pos];

        }

        //3. actually insert the value we want in position 2
        result[insertPosition] = valueToInsert;

        //4. copy over the rest of the array
        for (int pos = insertPosition; pos < source.length; pos++) {
            result[pos + 1] = source[pos];
        }

        return result;

    }

    public static int[] delete(int[] source, int deletePosition) {

        //1. create a new array with size -1
        int[] deleted = new int[source.length - 1];

        //2. copy the first elements up to but not including the deleted position
        for (int pos = 0 ; pos < deletePosition ; pos++) {
            deleted[pos] = source[pos];
        }

        //3. copy the last elements into pos-1 in the new array
        for (int pos = deletePosition +1; pos < source.length ; pos++) {
            deleted[pos -1] = source[pos];
        }

        return deleted;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        //original array
        //position  01234
        //value     12345

        //array after inserting
        //position  012345
        //value     129345

        //inserting 2 at position 9
        array = insert(array, 2, 9);
        System.out.println(Arrays.toString(array));

        //inserting 0 at position 0
        array = insert(array, 0, 0);
        System.out.println(Arrays.toString(array));

        array = delete(array, 0);
        System.out.println(Arrays.toString(array));

        array = delete(array, 4);
        System.out.println(Arrays.toString(array));

    }
}
