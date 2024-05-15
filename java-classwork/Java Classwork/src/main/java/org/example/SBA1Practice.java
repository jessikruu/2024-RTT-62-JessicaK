package org.example;

import java.util.Arrays;

public class SBA1Practice {
    public static void main(String[] args) {

        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //part 1- create a for loop to print each character of the string s on it's own line
        //you can use the s.charAt(pos) function

        for ( int pos = 0 ; pos < s.length(); pos ++) {
            System.out.println("Character " + pos + ": " + s.charAt(pos));
        }

        //part 2- given the following strings, convert them to integer values >>Integer.valueOf();

        String ten = "10";
        String hundred = "100";

        int intTen = Integer.parseInt(ten);
        int intHundred = Integer.parseInt(hundred);

        System.out.println("String ten as an integer value is " + intTen);
        System.out.println("String hundred as an integer value is " + intHundred);


        //part 3- given an integer array find the sum of all of the integers in the array

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int pos = 0; pos < array.length ; pos++) {
            sum = sum + array[pos];
        }

//        for (int total: array) {
//            sum+= total;
//        }
        System.out.println(sum);

        //part 4 - given the array of string, convert them to numbers and print them
        //you'll have to loop over the elements, convert them to a number, then get the sum
        String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int sum1 = 0;

        for (String string : nums) {
            int value = Integer.parseInt(string);
            sum1 = sum1 + value;
        }
        System.out.println("Final sum is" + sum1);


        ///////

        int x = 4562;

        Integer y = x;
        String number = y.toString();





    }
}
